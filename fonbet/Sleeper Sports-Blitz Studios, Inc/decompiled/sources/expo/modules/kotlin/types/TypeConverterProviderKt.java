package expo.modules.kotlin.types;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;

/* compiled from: TypeConverterProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u001e\u0010\u0004\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0007\u001a \u0010\u0004\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086\b¢\u0006\u0002\u0010\b\u001a\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a\f\u0010\u000e\u001a\u00020\f*\u0004\u0018\u00010\f¨\u0006\u000f"}, d2 = {"obtainTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", ExifInterface.GPS_DIRECTION_TRUE, "", "convert", "value", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "type", "Lkotlin/reflect/KType;", "mergeWith", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "otherProvider", "mergeWithDefault", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeConverterProviderKt {
    public static final /* synthetic */ <T> TypeConverter<T> obtainTypeConverter() {
        Object m13470constructorimpl;
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.types.TypeConverterProviderKt$obtainTypeConverter$$inlined$typeDescriptorOf$1
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                    return null;
                }
            }));
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
        TypeConverter obtainTypeConverter = typeConverterProviderImpl.obtainTypeConverter(typeDescriptor);
        Intrinsics.checkNotNull(obtainTypeConverter, "null cannot be cast to non-null type expo.modules.kotlin.types.TypeConverter<T of expo.modules.kotlin.types.TypeConverterProviderKt.obtainTypeConverter>");
        return obtainTypeConverter;
    }

    public static final /* synthetic */ <T> T convert(Dynamic value) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(value, "value");
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.types.TypeConverterProviderKt$convert$$inlined$typeDescriptorOf$1
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                    return null;
                }
            }));
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
        T t = (T) TypeConverter.DefaultImpls.convert$default(typeConverterProviderImpl.obtainTypeConverter(typeDescriptor), value, null, false, 6, null);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    public static final /* synthetic */ <T> T convert(Object obj) {
        Object m13470constructorimpl;
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.types.TypeConverterProviderKt$convert$$inlined$typeDescriptorOf$2
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                    return null;
                }
            }));
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
        T t = (T) TypeConverter.DefaultImpls.convert$default(typeConverterProviderImpl.obtainTypeConverter(typeDescriptor), obj, null, false, 6, null);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    public static final Object convert(Dynamic value, KType type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return TypeConverter.DefaultImpls.convert$default(TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(TypeDescriptorKt.toTypeDescriptor(type)), value, null, false, 6, null);
    }

    public static final TypeConverterProvider mergeWith(TypeConverterProvider typeConverterProvider, TypeConverterProvider otherProvider) {
        Intrinsics.checkNotNullParameter(typeConverterProvider, "<this>");
        Intrinsics.checkNotNullParameter(otherProvider, "otherProvider");
        return new MergedTypeConverterProvider(CollectionsKt.listOf((Object[]) new TypeConverterProvider[]{typeConverterProvider, otherProvider}));
    }

    public static final TypeConverterProvider mergeWithDefault(TypeConverterProvider typeConverterProvider) {
        TypeConverterProvider mergeWith;
        return (typeConverterProvider == null || (mergeWith = mergeWith(typeConverterProvider, TypeConverterProviderImpl.INSTANCE)) == null) ? TypeConverterProviderImpl.INSTANCE : mergeWith;
    }
}
