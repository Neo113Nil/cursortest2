package expo.modules.kotlin.types.descriptors;

import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: TypeDescriptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toTypeDescriptor", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "Lkotlin/reflect/KType;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeDescriptorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final KType toTypeDescriptor$lambda$2(KType kType) {
        return kType;
    }

    public static final TypeDescriptor toTypeDescriptor(final KType kType) {
        RawTypeDescriptor.Parameterized parameterized;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        if (kClass == null) {
            throw new IllegalStateException(("Unsupported type: " + kType).toString());
        }
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            KType type = ((KTypeProjection) it.next()).getType();
            if (type == null) {
                throw new IllegalStateException(("Type argument is missing for " + kType).toString());
            }
            arrayList.add(toTypeDescriptor(type));
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            parameterized = new RawTypeDescriptor.Simple(kClass, isMarkedNullable);
        } else {
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((TypeDescriptor) it2.next()).getTypeInfo());
            }
            parameterized = new RawTypeDescriptor.Parameterized(kClass, isMarkedNullable, arrayList4);
        }
        return new TypeDescriptor(parameterized, new Function0() { // from class: expo.modules.kotlin.types.descriptors.TypeDescriptorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KType typeDescriptor$lambda$2;
                typeDescriptor$lambda$2 = TypeDescriptorKt.toTypeDescriptor$lambda$2(KType.this);
                return typeDescriptor$lambda$2;
            }
        });
    }
}
