package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.km5;
import defpackage.nh0;
import defpackage.o13;
import defpackage.rm5;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ChainedMemberScope implements MemberScope {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String debugName;

    @NotNull
    private final MemberScope[] scopes;

    private ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.debugName = str;
        this.scopes = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        MemberScope[] memberScopeArr = this.scopes;
        memberScopeArr.getClass();
        return MemberScopeKt.flatMapClassifierNamesOrNull(memberScopeArr.length == 0 ? km5.a : new nh0(memberScopeArr, 0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo895getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.scopes) {
            ClassifierDescriptor mo895getContributedClassifier = memberScope.mo895getContributedClassifier(name, lookupLocation);
            if (mo895getContributedClassifier != null) {
                if (!(mo895getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) mo895getContributedClassifier).isExpect()) {
                    return mo895getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = mo895getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(descriptorKindFilter, function1);
        }
        Collection<DeclarationDescriptor> collection = null;
        for (MemberScope memberScope : memberScopeArr) {
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return collection == null ? rm5.a : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name, lookupLocation);
        }
        Collection<SimpleFunctionDescriptor> collection = null;
        for (MemberScope memberScope : memberScopeArr) {
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedFunctions(name, lookupLocation));
        }
        return collection == null ? rm5.a : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return km5.a;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name, lookupLocation);
        }
        Collection<PropertyDescriptor> collection = null;
        for (MemberScope memberScope : memberScopeArr) {
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedVariables(name, lookupLocation));
        }
        return collection == null ? rm5.a : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArr = this.scopes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            o13.v(memberScope.getFunctionNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArr = this.scopes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            o13.v(memberScope.getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo899recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        for (MemberScope memberScope : this.scopes) {
            memberScope.mo899recordLookup(name, lookupLocation);
        }
    }

    @NotNull
    public String toString() {
        return this.debugName;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberScope create(@NotNull String str, @NotNull Iterable<? extends MemberScope> iterable) {
            str.getClass();
            iterable.getClass();
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : iterable) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        o13.w(smartList, ((ChainedMemberScope) memberScope).scopes);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(str, smartList);
        }

        @NotNull
        public final MemberScope createOrSingle$descriptors(@NotNull String str, @NotNull List<? extends MemberScope> list) {
            str.getClass();
            list.getClass();
            int size = list.size();
            return size != 0 ? size != 1 ? new ChainedMemberScope(str, (MemberScope[]) list.toArray(new MemberScope[0]), null) : list.get(0) : MemberScope.Empty.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }
}
