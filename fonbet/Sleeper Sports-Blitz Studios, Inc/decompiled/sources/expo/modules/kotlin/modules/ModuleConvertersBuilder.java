package expo.modules.kotlin.modules;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.types.NullableTypeConverter;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterComponent;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor$params$1$1;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: ModuleConvertersBuilder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0006\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0086\bJ_\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0006\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\u0010\u0018\u0001*\u00020\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u0011H\u0010¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\r0\u0012H\u0086\bø\u0001\u0000J\u0006\u0010\u0016\u001a\u00020\u0017R.\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;", "", "<init>", "()V", "convertersComponent", "", "Lexpo/modules/kotlin/types/TypeConverterComponent;", "getConvertersComponent$annotations", "getConvertersComponent", "()Ljava/util/List;", "setConvertersComponent", "(Ljava/util/List;)V", "TypeConverter", ExifInterface.GPS_DIRECTION_TRUE, "classifier", "Lkotlin/reflect/KClass;", "P0", "body", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "p0", "buildTypeConverterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ModuleConvertersBuilder {
    private List<TypeConverterComponent<?>> convertersComponent = new ArrayList();

    public static /* synthetic */ void getConvertersComponent$annotations() {
    }

    public final List<TypeConverterComponent<?>> getConvertersComponent() {
        return this.convertersComponent;
    }

    public final void setConvertersComponent(List<TypeConverterComponent<?>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.convertersComponent = list;
    }

    public static /* synthetic */ TypeConverterComponent TypeConverter$default(ModuleConvertersBuilder moduleConvertersBuilder, KClass classifier, int i, Object obj) {
        Object m13470constructorimpl;
        if ((i & 1) != 0) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            classifier = Reflection.getOrCreateKotlinClass(Object.class);
        }
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, ModuleConvertersBuilder$TypeConverter$$inlined$typeDescriptorOf$1.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
        if (m13473exceptionOrNullimpl != null) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = null;
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
        if (typeDescriptor == null) {
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
        }
        TypeConverterComponent<?> typeConverterComponent = new TypeConverterComponent<>(typeDescriptor);
        moduleConvertersBuilder.getConvertersComponent().add(typeConverterComponent);
        return typeConverterComponent;
    }

    public static /* synthetic */ TypeConverterComponent TypeConverter$default(ModuleConvertersBuilder moduleConvertersBuilder, KClass classifier, Function1 body, int i, Object obj) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        if ((i & 1) != 0) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            classifier = Reflection.getOrCreateKotlinClass(Object.class);
        }
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
        if (m13473exceptionOrNullimpl != null) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = null;
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
        if (typeDescriptor == null) {
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
        }
        TypeConverterComponent<?> typeConverterComponent = new TypeConverterComponent<>(typeDescriptor);
        moduleConvertersBuilder.getConvertersComponent().add(typeConverterComponent);
        Map<TypeDescriptor, Function1<Object, ?>> converters = typeConverterComponent.getDesireTypeConverter().getValue().getConverters();
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, "P0");
            TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
            Intrinsics.needClassReification();
            Intrinsics.needClassReification();
            m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, ModuleConvertersBuilder$TypeConverter$$inlined$apply$lambda$1.INSTANCE));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
        if (m13473exceptionOrNullimpl2 != null) {
            Intrinsics.reifiedOperationMarker(4, "P0");
            Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
            m13470constructorimpl2 = null;
        }
        TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
        if (typeDescriptor2 == null) {
            Intrinsics.reifiedOperationMarker(6, "P0");
            typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
        }
        Intrinsics.needClassReification();
        converters.put(typeDescriptor2, new ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$2(body));
        return typeConverterComponent;
    }

    public final TypeConverterProvider buildTypeConverterProvider() {
        List<TypeConverterComponent<?>> list = this.convertersComponent;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair<TypeDescriptor, TypeConverter<?>> build = ((TypeConverterComponent) it.next()).build();
            if (build != null) {
                arrayList.add(build);
            }
        }
        final ArrayList arrayList2 = arrayList;
        return new TypeConverterProvider() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$buildTypeConverterProvider$1
            @Override // expo.modules.kotlin.types.TypeConverterProvider
            public TypeConverter<?> obtainTypeConverter(TypeDescriptor typeDescriptor) {
                Intrinsics.checkNotNullParameter(typeDescriptor, "typeDescriptor");
                TypeConverter<?> findNonNullableTypeConverter = findNonNullableTypeConverter(typeDescriptor);
                if (findNonNullableTypeConverter != null) {
                    return typeDescriptor.getTypeInfo().isNullable() ? new NullableTypeConverter(findNonNullableTypeConverter) : findNonNullableTypeConverter;
                }
                throw new MissingTypeConverter(typeDescriptor);
            }

            private final TypeConverter<?> findNonNullableTypeConverter(TypeDescriptor typeDescriptor) {
                Object obj;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Iterator<T> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    TypeDescriptor typeDescriptor2 = (TypeDescriptor) ((Pair) obj).component1();
                    if (Intrinsics.areEqual(typeDescriptor2.getTypeInfo().getKClass(), typeDescriptor.getTypeInfo().getKClass())) {
                        RawTypeDescriptor typeInfo = typeDescriptor2.getTypeInfo();
                        int i = 0;
                        if (typeInfo instanceof RawTypeDescriptor.Simple) {
                            arrayList3 = CollectionsKt.emptyList();
                        } else {
                            if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) typeDescriptor2.getTypeInfo()).getParams();
                            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
                            int i2 = 0;
                            for (Object obj2 : params) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                arrayList5.add(new TypeDescriptor((RawTypeDescriptor) obj2, new TypeDescriptor$params$1$1(typeDescriptor2, i2)));
                                i2 = i3;
                            }
                            arrayList3 = arrayList5;
                        }
                        RawTypeDescriptor typeInfo2 = typeDescriptor.getTypeInfo();
                        if (typeInfo2 instanceof RawTypeDescriptor.Simple) {
                            arrayList4 = CollectionsKt.emptyList();
                        } else {
                            if (!(typeInfo2 instanceof RawTypeDescriptor.Parameterized)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<RawTypeDescriptor> params2 = ((RawTypeDescriptor.Parameterized) typeDescriptor.getTypeInfo()).getParams();
                            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params2, 10));
                            for (Object obj3 : params2) {
                                int i4 = i + 1;
                                if (i < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                arrayList6.add(new TypeDescriptor((RawTypeDescriptor) obj3, new TypeDescriptor$params$1$1(typeDescriptor, i)));
                                i = i4;
                            }
                            arrayList4 = arrayList6;
                        }
                        if (Intrinsics.areEqual(arrayList3, arrayList4)) {
                            break;
                        }
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    return (TypeConverter) pair.getSecond();
                }
                return null;
            }
        };
    }

    public final /* synthetic */ <T> TypeConverterComponent<T> TypeConverter(KClass<T> classifier) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, ModuleConvertersBuilder$TypeConverter$$inlined$typeDescriptorOf$1.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
        if (m13473exceptionOrNullimpl != null) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = null;
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
        if (typeDescriptor == null) {
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
        }
        TypeConverterComponent<T> typeConverterComponent = new TypeConverterComponent<>(typeDescriptor);
        getConvertersComponent().add(typeConverterComponent);
        return typeConverterComponent;
    }

    public final /* synthetic */ <T, P0> TypeConverterComponent<T> TypeConverter(KClass<T> classifier, Function1<? super P0, ? extends T> body) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
        if (m13473exceptionOrNullimpl != null) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = null;
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
        if (typeDescriptor == null) {
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
        }
        TypeConverterComponent<T> typeConverterComponent = new TypeConverterComponent<>(typeDescriptor);
        getConvertersComponent().add(typeConverterComponent);
        Map<TypeDescriptor, Function1<Object, T>> converters = typeConverterComponent.getDesireTypeConverter().getValue().getConverters();
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, "P0");
            TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
            Intrinsics.needClassReification();
            Intrinsics.needClassReification();
            m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, ModuleConvertersBuilder$TypeConverter$$inlined$apply$lambda$1.INSTANCE));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
        if (m13473exceptionOrNullimpl2 != null) {
            Intrinsics.reifiedOperationMarker(4, "P0");
            Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
            m13470constructorimpl2 = null;
        }
        TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
        if (typeDescriptor2 == null) {
            Intrinsics.reifiedOperationMarker(6, "P0");
            typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
        }
        Intrinsics.needClassReification();
        converters.put(typeDescriptor2, new ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$2(body));
        return typeConverterComponent;
    }
}
