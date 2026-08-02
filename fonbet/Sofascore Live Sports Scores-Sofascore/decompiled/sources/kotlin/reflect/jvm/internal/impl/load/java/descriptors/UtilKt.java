package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import defpackage.k13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class UtilKt {
    @NotNull
    public static final List<ValueParameterDescriptor> copyValueParameters(@NotNull Collection<? extends KotlinType> collection, @NotNull Collection<? extends ValueParameterDescriptor> collection2, @NotNull CallableDescriptor callableDescriptor) {
        collection.getClass();
        collection2.getClass();
        callableDescriptor.getClass();
        collection.size();
        collection2.size();
        ArrayList Y0 = CollectionsKt.Y0(collection, collection2);
        ArrayList arrayList = new ArrayList(k13.r(Y0, 10));
        Iterator it = Y0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            KotlinType kotlinType = (KotlinType) pair.a;
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.b;
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            name.getClass();
            boolean declaresDefaultValue = valueParameterDescriptor.declaresDefaultValue();
            boolean isCrossinline = valueParameterDescriptor.isCrossinline();
            boolean isNoinline = valueParameterDescriptor.isNoinline();
            KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? DescriptorUtilsKt.getModule(callableDescriptor).getBuiltIns().getArrayElementType(kotlinType) : null;
            SourceElement source = valueParameterDescriptor.getSource();
            source.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor, null, index, annotations, name, kotlinType, declaresDefaultValue, isCrossinline, isNoinline, arrayElementType, source));
        }
        return arrayList;
    }

    @Nullable
    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        ClassDescriptor superClassNotAny = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
        if (superClassNotAny == null) {
            return null;
        }
        MemberScope staticScope = superClassNotAny.getStaticScope();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = staticScope instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) staticScope : null;
        return lazyJavaStaticClassScope == null ? getParentJavaStaticClassScope(superClassNotAny) : lazyJavaStaticClassScope;
    }
}
