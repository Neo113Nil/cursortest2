package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.i5h;
import defpackage.k13;
import defpackage.nh0;
import defpackage.o13;
import defpackage.oh0;
import defpackage.rm5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    @NotNull
    private final JavaClass jClass;

    @NotNull
    private final JavaClassDescriptor ownerDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaClass javaClass, @NotNull JavaClassDescriptor javaClassDescriptor) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaClass.getClass();
        javaClassDescriptor.getClass();
        this.jClass = javaClass;
        this.ownerDescriptor = javaClassDescriptor;
    }

    private final <R> Set<R> flatMapJavaStaticSupertypesScopes(final ClassDescriptor classDescriptor, final Set<R> set, final Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.dfs(a.c(classDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$0
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                Iterable flatMapJavaStaticSupertypesScopes$lambda$6;
                flatMapJavaStaticSupertypesScopes$lambda$6 = LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes$lambda$6((ClassDescriptor) obj);
                return flatMapJavaStaticSupertypesScopes$lambda$6;
            }
        }, new DFS.AbstractNodeHandler<ClassDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(@NotNull ClassDescriptor classDescriptor2) {
                classDescriptor2.getClass();
                if (classDescriptor2 == ClassDescriptor.this) {
                    return true;
                }
                MemberScope staticScope = classDescriptor2.getStaticScope();
                staticScope.getClass();
                if (!(staticScope instanceof LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((Collection) function1.invoke(staticScope));
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ Object result() {
                m889result();
                return Unit.a;
            }

            /* renamed from: result, reason: collision with other method in class */
            public void m889result() {
            }
        });
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable flatMapJavaStaticSupertypesScopes$lambda$6(ClassDescriptor classDescriptor) {
        Collection<KotlinType> mo894getSupertypes = classDescriptor.getTypeConstructor().mo894getSupertypes();
        mo894getSupertypes.getClass();
        return new nh0(i5h.o(new oh0(mo894getSupertypes, 1), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1.INSTANCE), 3);
    }

    private final PropertyDescriptor getRealOriginal(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(k13.r(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            propertyDescriptor2.getClass();
            arrayList.add(getRealOriginal(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.D0(CollectionsKt.S0(CollectionsKt.V0(arrayList)));
    }

    private final Set<SimpleFunctionDescriptor> getStaticFunctionsFromJavaSuperClasses(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(classDescriptor);
        return parentJavaStaticClassScope == null ? rm5.a : CollectionsKt.W0(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return rm5.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        LinkedHashSet V0 = CollectionsKt.V0(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = rm5.a;
        }
        V0.addAll(functionNames);
        if (this.jClass.isEnum()) {
            V0.addAll(b.j(StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES));
        }
        V0.addAll(getC().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(getC(), getOwnerDescriptor()));
        return V0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        getC().getComponents().getSyntheticPartsProvider().generateStaticFunctions(getC(), getOwnerDescriptor(), name, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaStaticClassScope$computeMemberIndex$1.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        Collection<? extends SimpleFunctionDescriptor> resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, getStaticFunctionsFromJavaSuperClasses(name, getOwnerDescriptor()), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        resolveOverridesForStaticMembers.getClass();
        collection.addAll(resolveOverridesForStaticMembers);
        if (this.jClass.isEnum()) {
            if (Intrinsics.c(name, StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor createEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
                createEnumValueOfMethod.getClass();
                collection.add(createEnumValueOfMethod);
            } else if (Intrinsics.c(name, StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor createEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
                createEnumValuesMethod.getClass();
                collection.add(createEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        Name name2;
        Collection<PropertyDescriptor> collection2;
        name.getClass();
        collection.getClass();
        Set flatMapJavaStaticSupertypesScopes = flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), new LinkedHashSet(), new LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(name));
        if (collection.isEmpty()) {
            name2 = name;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : flatMapJavaStaticSupertypesScopes) {
                PropertyDescriptor realOriginal = getRealOriginal((PropertyDescriptor) obj);
                Object obj2 = linkedHashMap.get(realOriginal);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(realOriginal, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection<PropertyDescriptor> collection3 = collection2;
                Name name3 = name2;
                Collection resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name3, (Collection) ((Map.Entry) it.next()).getValue(), collection3, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
                collection2 = collection3;
                name2 = name3;
                resolveOverridesForStaticMembers.getClass();
                o13.v(resolveOverridesForStaticMembers, arrayList);
            }
            collection2.addAll(arrayList);
        } else {
            name2 = name;
            collection2 = collection;
            Collection<? extends PropertyDescriptor> resolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, flatMapJavaStaticSupertypesScopes, collection2, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            resolveOverridesForStaticMembers2.getClass();
            collection2.addAll(resolveOverridesForStaticMembers2);
        }
        if (this.jClass.isEnum() && name2.equals(StandardNames.ENUM_ENTRIES)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection2, DescriptorFactory.createEnumEntriesProperty(getOwnerDescriptor()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        LinkedHashSet V0 = CollectionsKt.V0(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), V0, LazyJavaStaticClassScope$computePropertyNames$1$1.INSTANCE);
        if (this.jClass.isEnum()) {
            V0.add(StandardNames.ENUM_ENTRIES);
        }
        return V0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo895getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public JavaClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
