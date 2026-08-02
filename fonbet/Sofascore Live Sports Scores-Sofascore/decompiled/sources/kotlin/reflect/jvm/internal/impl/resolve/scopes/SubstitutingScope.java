package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.cp4;
import defpackage.joa;
import defpackage.sw9;
import defpackage.ypa;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SubstitutingScope implements MemberScope {

    @NotNull
    private final joa _allDescriptors$delegate;

    @NotNull
    private final TypeSubstitutor capturingSubstitutor;

    @Nullable
    private Map<DeclarationDescriptor, DeclarationDescriptor> substitutedDescriptors;

    @NotNull
    private final joa substitutor$delegate;

    @NotNull
    private final MemberScope workerScope;

    public SubstitutingScope(@NotNull MemberScope memberScope, @NotNull TypeSubstitutor typeSubstitutor) {
        memberScope.getClass();
        typeSubstitutor.getClass();
        this.workerScope = memberScope;
        this.substitutor$delegate = ypa.b(new SubstitutingScope$substitutor$2(typeSubstitutor));
        TypeSubstitution substitution = typeSubstitutor.getSubstitution();
        substitution.getClass();
        this.capturingSubstitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this._allDescriptors$delegate = ypa.b(new SubstitutingScope$_allDescriptors$2(this));
    }

    private final Collection<DeclarationDescriptor> get_allDescriptors() {
        return (Collection) this._allDescriptors$delegate.getValue();
    }

    private final <D extends DeclarationDescriptor> D substitute(D d) {
        if (this.capturingSubstitutor.isEmpty()) {
            return d;
        }
        Map map = this.substitutedDescriptors;
        if (map == null) {
            map = new HashMap();
            this.substitutedDescriptors = map;
        }
        map.getClass();
        Object obj = map.get(d);
        if (obj == null) {
            if (!(d instanceof Substitutable)) {
                cp4.g(d, "Unknown descriptor in scope: ");
                return null;
            }
            obj = ((Substitutable) d).substitute(this.capturingSubstitutor);
            if (obj == null) {
                sw9.r(d, " substitution fails", "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                return null;
            }
            map.put(d, obj);
        }
        return (D) obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo895getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor mo895getContributedClassifier = this.workerScope.mo895getContributedClassifier(name, lookupLocation);
        if (mo895getContributedClassifier != null) {
            return (ClassifierDescriptor) substitute((SubstitutingScope) mo895getContributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return get_allDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return substitute(this.workerScope.getContributedFunctions(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return substitute(this.workerScope.getContributedVariables(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo899recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends DeclarationDescriptor> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.capturingSubstitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet newLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(substitute((SubstitutingScope) it.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }
}
