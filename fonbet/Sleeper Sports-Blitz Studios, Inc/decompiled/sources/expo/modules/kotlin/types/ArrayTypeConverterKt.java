package expo.modules.kotlin.types;

import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor$params$1$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: ArrayTypeConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"isPrimitiveArray", "", "typeDescriptor", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ArrayTypeConverterKt {
    public static final boolean isPrimitiveArray(TypeDescriptor typeDescriptor) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(typeDescriptor, "typeDescriptor");
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) typeDescriptor.getTypeInfo().getKClass());
        int i = 0;
        if (!Intrinsics.areEqual(javaClass, boolean[].class) && !Intrinsics.areEqual(javaClass, byte[].class) && !Intrinsics.areEqual(javaClass, char[].class) && !Intrinsics.areEqual(javaClass, short[].class) && !Intrinsics.areEqual(javaClass, int[].class) && !Intrinsics.areEqual(javaClass, long[].class) && !Intrinsics.areEqual(javaClass, float[].class) && !Intrinsics.areEqual(javaClass, double[].class)) {
            return false;
        }
        RawTypeDescriptor typeInfo = typeDescriptor.getTypeInfo();
        if (typeInfo instanceof RawTypeDescriptor.Simple) {
            arrayList = CollectionsKt.emptyList();
        } else {
            if (!(typeInfo instanceof RawTypeDescriptor.Parameterized)) {
                throw new NoWhenBranchMatchedException();
            }
            List<RawTypeDescriptor> params = ((RawTypeDescriptor.Parameterized) typeDescriptor.getTypeInfo()).getParams();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
            for (Object obj : params) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new TypeDescriptor((RawTypeDescriptor) obj, new TypeDescriptor$params$1$1(typeDescriptor, i)));
                i = i2;
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty();
    }
}
