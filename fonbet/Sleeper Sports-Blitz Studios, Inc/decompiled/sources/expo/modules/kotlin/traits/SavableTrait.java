package expo.modules.kotlin.traits;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: SavableTrait.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\rB\u001d\b\u0001\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait;", "InputType", "Lexpo/modules/kotlin/traits/Trait;", "exportImpl", "Lkotlin/Function1;", "Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getExportImpl", "()Lkotlin/jvm/functions/Function1;", "export", "appContext", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SavableTrait<InputType> implements Trait<InputType> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function1<AppContext, ObjectDefinitionData> exportImpl;

    /* JADX WARN: Multi-variable type inference failed */
    public SavableTrait(Function1<? super AppContext, ObjectDefinitionData> exportImpl) {
        Intrinsics.checkNotNullParameter(exportImpl, "exportImpl");
        this.exportImpl = exportImpl;
    }

    public final Function1<AppContext, ObjectDefinitionData> getExportImpl() {
        return this.exportImpl;
    }

    @Override // expo.modules.kotlin.traits.Trait
    public ObjectDefinitionData export(AppContext appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return this.exportImpl.invoke(appContext);
    }

    /* compiled from: SavableTrait.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0004\u001a\u00020\u0005\"\u0006\b\u0001\u0010\u0006\u0018\u0001\"\u0006\b\u0002\u0010\u0007\u0018\u00012\u0006\u0010\b\u001a\u00020\t2M\b\u0004\u0010\n\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0081\bø\u0001\u0000J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\u0010\b\u0001\u0010\u0015\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0019H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait$Companion;", "", "<init>", "()V", "createImplementation", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "InputType", "OptionType", "appContext", "Lexpo/modules/kotlin/AppContext;", "saveToFile", "Lkotlin/Function3;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "file", MetricTracker.Object.INPUT, "options", "", "create", "Lexpo/modules/kotlin/traits/SavableTrait;", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "klass", "Lkotlin/reflect/KClass;", "SavableBitmapOptions", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SavableTrait.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions;", "Lexpo/modules/kotlin/records/Record;", "compression", "", "<init>", "(I)V", "getCompression", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SavableBitmapOptions implements Record {
            private final int compression;

            public SavableBitmapOptions() {
                this(0, 1, null);
            }

            public static /* synthetic */ SavableBitmapOptions copy$default(SavableBitmapOptions savableBitmapOptions, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = savableBitmapOptions.compression;
                }
                return savableBitmapOptions.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getCompression() {
                return this.compression;
            }

            public final SavableBitmapOptions copy(int compression) {
                return new SavableBitmapOptions(compression);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SavableBitmapOptions) && this.compression == ((SavableBitmapOptions) other).compression;
            }

            public int hashCode() {
                return Integer.hashCode(this.compression);
            }

            public String toString() {
                return "SavableBitmapOptions(compression=" + this.compression + ")";
            }

            public SavableBitmapOptions(int i) {
                this.compression = i;
            }

            public /* synthetic */ SavableBitmapOptions(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 100 : i);
            }

            public final int getCompression() {
                return this.compression;
            }
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0196  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final /* synthetic */ <InputType, OptionType> ObjectDefinitionData createImplementation(AppContext appContext, final Function3<? super File, ? super InputType, ? super OptionType, Unit> saveToFile) {
            char c;
            boolean z;
            Object m13470constructorimpl;
            Throwable m13473exceptionOrNullimpl;
            TypeDescriptor typeDescriptor;
            AnyType anyType;
            Object m13470constructorimpl2;
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(saveToFile, "saveToFile");
            final WeakReference weak = UtilsKt.weak(appContext);
            ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
            TypeConverterProvider converters = objectDefinitionBuilder.getConverters();
            Intrinsics.reifiedOperationMarker(4, "InputType");
            Intrinsics.reifiedOperationMarker(4, "OptionType");
            AnyType[] anyTypeArr = new AnyType[2];
            AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
            Intrinsics.reifiedOperationMarker(4, "InputType");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            Intrinsics.reifiedOperationMarker(3, "InputType");
            AnyType anyType2 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
            if (anyType2 != null) {
                c = 1;
                z = false;
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intrinsics.reifiedOperationMarker(6, "InputType");
                    TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                    MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                    c = 1;
                    try {
                        RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                        Intrinsics.needClassReification();
                        Intrinsics.needClassReification();
                        z = false;
                        try {
                            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1
                                @Override // kotlin.jvm.functions.Function0
                                public final KType invoke() {
                                    Intrinsics.reifiedOperationMarker(6, "InputType");
                                    return null;
                                }
                            }));
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion2 = Result.INSTANCE;
                            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                            if (m13473exceptionOrNullimpl != null) {
                            }
                            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                            }
                            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                            if (typeDescriptor == null) {
                            }
                            anyType2 = new AnyType(typeDescriptor, converters);
                            anyTypeArr[0] = anyType2;
                            AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                            Intrinsics.reifiedOperationMarker(4, "OptionType");
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                            Intrinsics.reifiedOperationMarker(3, "OptionType");
                            anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                            if (anyType == null) {
                            }
                            anyTypeArr[c] = anyType;
                            Intrinsics.needClassReification();
                            Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3
                                @Override // kotlin.jvm.functions.Function1
                                public final Unit invoke(Object[] objArr) {
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Object obj = objArr[0];
                                    Object obj2 = objArr[1];
                                    AppContext appContext2 = (AppContext) weak.get();
                                    if (appContext2 == null) {
                                        throw new Exceptions.AppContextLost();
                                    }
                                    File file = new File(appContext2.getCacheDirectory(), UUID.randomUUID().toString());
                                    file.createNewFile();
                                    saveToFile.invoke(file, obj, obj2);
                                    return Unit.INSTANCE;
                                }
                            };
                            objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, function1));
                            return objectDefinitionBuilder.buildObject();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        Result.Companion companion22 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                        if (typeDescriptor == null) {
                        }
                        anyType2 = new AnyType(typeDescriptor, converters);
                        anyTypeArr[0] = anyType2;
                        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
                        Intrinsics.reifiedOperationMarker(4, "OptionType");
                        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
                        Intrinsics.reifiedOperationMarker(3, "OptionType");
                        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
                        if (anyType == null) {
                        }
                        anyTypeArr[c] = anyType;
                        Intrinsics.needClassReification();
                        Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Object obj = objArr[0];
                                Object obj2 = objArr[1];
                                AppContext appContext2 = (AppContext) weak.get();
                                if (appContext2 == null) {
                                    throw new Exceptions.AppContextLost();
                                }
                                File file = new File(appContext2.getCacheDirectory(), UUID.randomUUID().toString());
                                file.createNewFile();
                                saveToFile.invoke(file, obj, obj2);
                                return Unit.INSTANCE;
                            }
                        };
                        objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("saveAsync", anyTypeArr, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, function12) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, function12));
                        return objectDefinitionBuilder.buildObject();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c = 1;
                }
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Intrinsics.reifiedOperationMarker(4, "InputType");
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    Intrinsics.reifiedOperationMarker(6, "InputType");
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
                }
                anyType2 = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType2;
            AnyTypeCache anyTypeCache222 = AnyTypeCache.INSTANCE;
            Intrinsics.reifiedOperationMarker(4, "OptionType");
            KClass orCreateKotlinClass222 = Reflection.getOrCreateKotlinClass(Object.class);
            Intrinsics.reifiedOperationMarker(3, "OptionType");
            anyType = anyTypeCache222.getTypesMap().get(new Pair(orCreateKotlinClass222, Boolean.valueOf(z)));
            if (anyType == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    Intrinsics.reifiedOperationMarker(6, "OptionType");
                    TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                    MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                    RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                    Intrinsics.needClassReification();
                    Intrinsics.needClassReification();
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "OptionType");
                            return null;
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Intrinsics.reifiedOperationMarker(4, "OptionType");
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor2 == null) {
                    Intrinsics.reifiedOperationMarker(6, "OptionType");
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
                }
                anyType = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr[c] = anyType;
            Intrinsics.needClassReification();
            Function1<Object[], Unit> function122 = new Function1<Object[], Unit>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    AppContext appContext2 = (AppContext) weak.get();
                    if (appContext2 == null) {
                        throw new Exceptions.AppContextLost();
                    }
                    File file = new File(appContext2.getCacheDirectory(), UUID.randomUUID().toString());
                    file.createNewFile();
                    saveToFile.invoke(file, obj, obj2);
                    return Unit.INSTANCE;
                }
            };
            objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("saveAsync", anyTypeArr, function122) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, function122) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, function122) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, function122) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, function122) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, function122));
            return objectDefinitionBuilder.buildObject();
        }

        public static /* synthetic */ SavableTrait create$default(Companion companion, KClass klass, int i, Object obj) {
            if ((i & 1) != 0) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                klass = Reflection.getOrCreateKotlinClass(SharedRef.class);
            }
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.needClassReification();
            return new SavableTrait(SavableTrait$Companion$create$1.INSTANCE);
        }

        public final /* synthetic */ <T extends SharedRef<Bitmap>> SavableTrait<T> create(KClass<T> klass) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.needClassReification();
            return new SavableTrait<>(SavableTrait$Companion$create$1.INSTANCE);
        }
    }
}
