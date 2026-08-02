package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.duf;
import defpackage.fuf;
import defpackage.kef;
import defpackage.km5;
import defpackage.o13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    private final NotNullLazyValue allDescriptors$delegate;

    @NotNull
    private final ClassDescriptor containingClass;

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public GivenFunctionsMemberScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        storageManager.getClass();
        classDescriptor.getClass();
        this.containingClass = classDescriptor;
        this.allDescriptors$delegate = storageManager.createLazyValue(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    public final List<DeclarationDescriptor> createFakeOverrides(List<? extends FunctionDescriptor> list) {
        Collection<? extends CallableMemberDescriptor> collection;
        final ArrayList arrayList = new ArrayList(3);
        Collection<KotlinType> mo894getSupertypes = this.containingClass.getTypeConstructor().mo894getSupertypes();
        mo894getSupertypes.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = mo894getSupertypes.iterator();
        while (it.hasNext()) {
            o13.v(ResolutionScope.DefaultImpls.getContributedDescriptors$default(((KotlinType) it.next()).getMemberScope(), null, null, 3, null), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            Name name = ((CallableMemberDescriptor) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Name name2 = (Name) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) obj2) instanceof FunctionDescriptor);
                Object obj3 = linkedHashMap2.get(valueOf);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj3);
                }
                ((List) obj3).add(obj2);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.DEFAULT;
                if (booleanValue) {
                    collection = new ArrayList();
                    for (Object obj4 : list) {
                        if (Intrinsics.c(((FunctionDescriptor) obj4).getName(), name2)) {
                            collection.add(obj4);
                        }
                    }
                } else {
                    collection = km5.a;
                }
                overridingUtil.generateOverridesInFunctionGroup(name2, list3, collection, this.containingClass, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                    public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                        callableMemberDescriptor.getClass();
                        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                        arrayList.add(callableMemberDescriptor);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                    public void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                        callableMemberDescriptor.getClass();
                        callableMemberDescriptor2.getClass();
                        throw new IllegalStateException(("Conflict in scope of " + this.getContainingClass() + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
                    }
                });
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    private final List<DeclarationDescriptor> getAllDescriptors() {
        return (List) StorageKt.getValue(this.allDescriptors$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @NotNull
    public abstract List<FunctionDescriptor> computeDeclaredFunctions();

    @NotNull
    public final ClassDescriptor getContainingClass() {
        return this.containingClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return !descriptorKindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask()) ? km5.a : getAllDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List<DeclarationDescriptor> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            return km5.a;
        }
        SmartList smartList = new SmartList();
        for (Object obj : allDescriptors) {
            if ((obj instanceof SimpleFunctionDescriptor) && Intrinsics.c(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List<DeclarationDescriptor> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            return km5.a;
        }
        SmartList smartList = new SmartList();
        for (Object obj : allDescriptors) {
            if ((obj instanceof PropertyDescriptor) && Intrinsics.c(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }
}
