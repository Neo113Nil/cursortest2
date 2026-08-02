package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import defpackage.o13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    @NotNull
    private final List<SyntheticJavaPartsProvider> inner;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(@NotNull List<? extends SyntheticJavaPartsProvider> list) {
        list.getClass();
        this.inner = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        list.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateConstructors(lazyJavaResolverContext, classDescriptor, list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        name.getClass();
        collection.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateMethods(lazyJavaResolverContext, classDescriptor, name, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        name.getClass();
        list.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateNestedClass(lazyJavaResolverContext, classDescriptor, name, list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        name.getClass();
        collection.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateStaticFunctions(lazyJavaResolverContext, classDescriptor, name, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getMethodNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        List<SyntheticJavaPartsProvider> list = this.inner;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            o13.v(((SyntheticJavaPartsProvider) it.next()).getMethodNames(lazyJavaResolverContext, classDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getNestedClassNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        List<SyntheticJavaPartsProvider> list = this.inner;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            o13.v(((SyntheticJavaPartsProvider) it.next()).getNestedClassNames(lazyJavaResolverContext, classDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getStaticFunctionNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        List<SyntheticJavaPartsProvider> list = this.inner;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            o13.v(((SyntheticJavaPartsProvider) it.next()).getStaticFunctionNames(lazyJavaResolverContext, classDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public PropertyDescriptorImpl modifyField(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl) {
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        propertyDescriptorImpl.getClass();
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            propertyDescriptorImpl = ((SyntheticJavaPartsProvider) it.next()).modifyField(lazyJavaResolverContext, classDescriptor, propertyDescriptorImpl);
        }
        return propertyDescriptorImpl;
    }
}
