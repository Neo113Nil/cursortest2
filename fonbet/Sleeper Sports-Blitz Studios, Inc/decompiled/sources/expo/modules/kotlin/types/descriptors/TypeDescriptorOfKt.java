package expo.modules.kotlin.types.descriptors;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: typeDescriptorOf.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0011\u0010\u0003\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u0001H\u0081\b\u001a\u0011\u0010\u0006\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u0001H\u0086\b¨\u0006\u0007"}, d2 = {"toRawTypeDescriptor", "Lexpo/modules/kotlin/types/descriptors/RawTypeDescriptor;", "Lio/github/lukmccall/pika/TypeInfo;", "cpTypeDescriptorOf", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", ExifInterface.GPS_DIRECTION_TRUE, "typeDescriptorOf", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeDescriptorOfKt {
    public static final RawTypeDescriptor toRawTypeDescriptor(TypeInfo typeInfo) {
        Intrinsics.checkNotNullParameter(typeInfo, "<this>");
        if (typeInfo instanceof TypeInfo.Simple) {
            TypeInfo.Simple simple = (TypeInfo.Simple) typeInfo;
            return new RawTypeDescriptor.Simple(simple.getKClass(), simple.isNullable());
        }
        if (typeInfo instanceof TypeInfo.Parameterized) {
            TypeInfo.Parameterized parameterized = (TypeInfo.Parameterized) typeInfo;
            KClass<?> kClass = parameterized.getKClass();
            boolean isNullable = parameterized.isNullable();
            List<TypeInfo> typeArguments = parameterized.getTypeArguments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10));
            Iterator<T> it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(toRawTypeDescriptor((TypeInfo) it.next()));
            }
            return new RawTypeDescriptor.Parameterized(kClass, isNullable, arrayList);
        }
        if (Intrinsics.areEqual(typeInfo, TypeInfo.Star.INSTANCE)) {
            throw new IllegalStateException("Star projections are not supported".toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ <T> TypeDescriptor cpTypeDescriptorOf() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
        MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
        RawTypeDescriptor rawTypeDescriptor = toRawTypeDescriptor(throwNonReifiedTypeError);
        Intrinsics.needClassReification();
        return new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt$cpTypeDescriptorOf$1
            @Override // kotlin.jvm.functions.Function0
            public final KType invoke() {
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                return null;
            }
        });
    }

    public static final /* synthetic */ <T> TypeDescriptor typeDescriptorOf() {
        Object m13470constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
            TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
            MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
            RawTypeDescriptor rawTypeDescriptor = toRawTypeDescriptor(throwNonReifiedTypeError);
            Intrinsics.needClassReification();
            Intrinsics.needClassReification();
            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt$typeDescriptorOf$$inlined$runCatching$lambda$1
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
        if (typeDescriptor != null) {
            return typeDescriptor;
        }
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return TypeDescriptorKt.toTypeDescriptor(null);
    }
}
