package expo.modules.kotlin.types;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: AnyType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0086\b\u001a\u0015\u0010\u0005\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0086\b¨\u0006\u0007"}, d2 = {"toAnyType", "Lexpo/modules/kotlin/types/AnyType;", ExifInterface.GPS_DIRECTION_TRUE, "converterProvider", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "inheritFrom", "", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnyTypeKt {
    public static final /* synthetic */ <T> AnyType toAnyType(TypeConverterProvider typeConverterProvider) {
        Object m13470constructorimpl;
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType != null) {
            return anyType;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, AnyTypeKt$toAnyType$$inlined$typeDescriptorOf$1.INSTANCE));
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
        return new AnyType(typeDescriptor, typeConverterProvider);
    }

    public static /* synthetic */ AnyType toAnyType$default(TypeConverterProvider typeConverterProvider, int i, Object obj) {
        Object m13470constructorimpl;
        if ((i & 1) != 0) {
            typeConverterProvider = null;
        }
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType != null) {
            return anyType;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, AnyTypeKt$toAnyType$$inlined$typeDescriptorOf$1.INSTANCE));
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
        return new AnyType(typeDescriptor, typeConverterProvider);
    }

    public static final /* synthetic */ <T> boolean inheritFrom(AnyType anyType) {
        Intrinsics.checkNotNullParameter(anyType, "<this>");
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) anyType.getTypeDescriptor().getTypeInfo().getKClass());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return Object.class.isAssignableFrom(javaClass);
    }
}
