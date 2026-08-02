package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.cp4;
import defpackage.xbb;
import defpackage.xka;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends xka implements Function1<Name, ClassDescriptor> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(@NotNull Name name) {
        NotNullLazyValue notNullLazyValue;
        NotNullLazyValue notNullLazyValue2;
        NotNullLazyValue notNullLazyValue3;
        JavaClass javaClass;
        name.getClass();
        notNullLazyValue = this.this$0.nestedClassIndex;
        if (((Set) notNullLazyValue.invoke()).contains(name)) {
            JavaClassFinder finder = this.$c.getComponents().getFinder();
            ClassId classId = DescriptorUtilsKt.getClassId(this.this$0.getOwnerDescriptor());
            classId.getClass();
            ClassId createNestedClassId = classId.createNestedClassId(name);
            createNestedClassId.getClass();
            javaClass = this.this$0.jClass;
            JavaClass findClass = finder.findClass(new JavaClassFinder.Request(createNestedClassId, null, javaClass, 2, null));
            if (findClass != null) {
                LazyJavaResolverContext lazyJavaResolverContext = this.$c;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, this.this$0.getOwnerDescriptor(), findClass, null, 8, null);
                lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
        } else {
            notNullLazyValue2 = this.this$0.generatedNestedClassNames;
            if (((Set) notNullLazyValue2.invoke()).contains(name)) {
                LazyJavaResolverContext lazyJavaResolverContext2 = this.$c;
                LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
                xbb b = a.b();
                lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaResolverContext2, lazyJavaClassMemberScope.getOwnerDescriptor(), name, b);
                xbb a = a.a(b);
                int size = a.size();
                if (size != 0) {
                    if (size == 1) {
                        return (ClassDescriptor) CollectionsKt.D0(a);
                    }
                    cp4.g(a, "Multiple classes with same name are generated: ");
                    return null;
                }
            } else {
                notNullLazyValue3 = this.this$0.enumEntryIndex;
                JavaField javaField = (JavaField) ((Map) notNullLazyValue3.invoke()).get(name);
                if (javaField != null) {
                    return EnumEntrySyntheticClassDescriptor.create(this.$c.getStorageManager(), this.this$0.getOwnerDescriptor(), name, this.$c.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this.this$0)), LazyJavaAnnotationsKt.resolveAnnotations(this.$c, javaField), this.$c.getComponents().getSourceElementFactory().source(javaField));
                }
            }
        }
        return null;
    }
}
