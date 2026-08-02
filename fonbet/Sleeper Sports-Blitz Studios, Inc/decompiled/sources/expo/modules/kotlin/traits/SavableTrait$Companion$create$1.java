package expo.modules.kotlin.traits;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
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
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.traits.SavableTrait;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.objectweb.asm.Opcodes;

/* compiled from: SavableTrait.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes9.dex */
public final class SavableTrait$Companion$create$1 implements Function1<AppContext, ObjectDefinitionData> {
    public static final SavableTrait$Companion$create$1 INSTANCE = new SavableTrait$Companion$create$1();

    @Override // kotlin.jvm.functions.Function1
    public final ObjectDefinitionData invoke(AppContext appContext) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        SavableTrait.Companion companion = SavableTrait.INSTANCE;
        final WeakReference weak = UtilsKt.weak(appContext);
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        TypeConverterProvider converters = objectDefinitionBuilder.getConverters();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        AnyType[] anyTypeArr = new AnyType[2];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, converters);
        }
        anyTypeArr[0] = anyType;
        AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(SavableTrait.Companion.SavableBitmapOptions.class), false));
        if (anyType2 == null) {
            try {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.traits.SavableTrait.Companion.SavableBitmapOptions", Reflection.getOrCreateKotlinClass(SavableTrait.Companion.SavableBitmapOptions.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(SavableTrait.Companion.SavableBitmapOptions.class);
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion5 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl2 != null) {
                Log.e("ExpoModulesCore", "Failed to get type info for " + SavableTrait.Companion.SavableBitmapOptions.class.getName(), m13473exceptionOrNullimpl2);
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
            if (typeDescriptor2 == null) {
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(SavableTrait.Companion.SavableBitmapOptions.class));
            }
            anyType2 = new AnyType(typeDescriptor2, converters);
        }
        anyTypeArr[1] = anyType2;
        Intrinsics.needClassReification();
        Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$3
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
                SharedRef sharedRef = (SharedRef) obj;
                sharedRef.getAppContext();
                ((Bitmap) sharedRef.getRef()).compress(Bitmap.CompressFormat.PNG, ((SavableTrait.Companion.SavableBitmapOptions) obj2).getCompression(), new FileOutputStream(file));
                return Unit.INSTANCE;
            }
        };
        objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, function1));
        return objectDefinitionBuilder.buildObject();
    }
}
