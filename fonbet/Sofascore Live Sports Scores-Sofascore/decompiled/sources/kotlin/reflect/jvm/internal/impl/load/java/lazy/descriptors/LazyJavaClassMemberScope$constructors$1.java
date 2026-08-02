package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassMemberScope$constructors$1 extends xka implements Function0<List<? extends ClassConstructorDescriptor>> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<ClassConstructorDescriptor> invoke() {
        JavaClass javaClass;
        JavaClass javaClass2;
        ClassConstructorDescriptor createDefaultConstructor;
        ClassConstructorDescriptor createDefaultRecordConstructor;
        JavaClass javaClass3;
        JavaClassConstructorDescriptor resolveConstructor;
        javaClass = this.this$0.jClass;
        Collection<JavaConstructor> constructors = javaClass.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator<JavaConstructor> it = constructors.iterator();
        while (it.hasNext()) {
            resolveConstructor = this.this$0.resolveConstructor(it.next());
            arrayList.add(resolveConstructor);
        }
        javaClass2 = this.this$0.jClass;
        if (javaClass2.isRecord()) {
            createDefaultRecordConstructor = this.this$0.createDefaultRecordConstructor();
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(createDefaultRecordConstructor, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.c(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it2.next(), false, false, 2, null), computeJvmDescriptor$default)) {
                        break;
                    }
                }
            }
            arrayList.add(createDefaultRecordConstructor);
            JavaResolverCache javaResolverCache = this.$c.getComponents().getJavaResolverCache();
            javaClass3 = this.this$0.jClass;
            javaResolverCache.recordConstructor(javaClass3, createDefaultRecordConstructor);
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.$c;
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaResolverContext, this.this$0.getOwnerDescriptor(), arrayList);
        SignatureEnhancement signatureEnhancement = this.$c.getComponents().getSignatureEnhancement();
        LazyJavaResolverContext lazyJavaResolverContext2 = this.$c;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            createDefaultConstructor = lazyJavaClassMemberScope.createDefaultConstructor();
            arrayList2 = b.k(createDefaultConstructor);
        }
        return CollectionsKt.S0(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext2, arrayList2));
    }
}
