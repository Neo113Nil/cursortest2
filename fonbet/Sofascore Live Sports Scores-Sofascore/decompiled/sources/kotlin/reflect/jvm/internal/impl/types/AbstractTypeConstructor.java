package kotlin.reflect.jvm.internal.impl.types;

import defpackage.joa;
import defpackage.km5;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;

    @NotNull
    private final NotNullLazyValue<Supertypes> supertypes;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Supertypes {

        @NotNull
        private final Collection<KotlinType> allSupertypes;

        @NotNull
        private List<? extends KotlinType> supertypesWithoutCycles;

        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(@NotNull Collection<? extends KotlinType> collection) {
            collection.getClass();
            this.allSupertypes = collection;
            this.supertypesWithoutCycles = a.c(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }

        @NotNull
        public final Collection<KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        @NotNull
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(@NotNull List<? extends KotlinType> list) {
            list.getClass();
            this.supertypesWithoutCycles = list;
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        storageManager.getClass();
        this.supertypes = storageManager.createLazyValueWithPostCompute(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.INSTANCE, new AbstractTypeConstructor$supertypes$3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<KotlinType> computeNeighbours(TypeConstructor typeConstructor, boolean z) {
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null) {
            return CollectionsKt.w0(abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z), ((Supertypes) abstractTypeConstructor.supertypes.invoke()).getAllSupertypes());
        }
        Collection<KotlinType> mo894getSupertypes = typeConstructor.mo894getSupertypes();
        mo894getSupertypes.getClass();
        return mo894getSupertypes;
    }

    @NotNull
    public abstract Collection<KotlinType> computeSupertypes();

    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return km5.a;
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: getSupertypes */
    public List<KotlinType> mo894getSupertypes() {
        return ((Supertypes) this.supertypes.invoke()).getSupertypesWithoutCycles();
    }

    @NotNull
    public List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> list) {
        list.getClass();
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    public void reportScopesLoopError(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class ModuleViewTypeConstructor implements TypeConstructor {

        @NotNull
        private final KotlinTypeRefiner kotlinTypeRefiner;

        @NotNull
        private final joa refinedSupertypes$delegate;
        final /* synthetic */ AbstractTypeConstructor this$0;

        public ModuleViewTypeConstructor(@NotNull AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.this$0 = abstractTypeConstructor;
            this.kotlinTypeRefiner = kotlinTypeRefiner;
            this.refinedSupertypes$delegate = ypa.a(ysa.b, new AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2(this, abstractTypeConstructor));
        }

        private final List<KotlinType> getRefinedSupertypes() {
            return (List) this.refinedSupertypes$delegate.getValue();
        }

        public boolean equals(@Nullable Object obj) {
            return this.this$0.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.this$0.getBuiltIns();
            builtIns.getClass();
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo893getDeclarationDescriptor() {
            return this.this$0.mo893getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.this$0.getParameters();
            parameters.getClass();
            return parameters;
        }

        public int hashCode() {
            return this.this$0.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.this$0.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return this.this$0.refine(kotlinTypeRefiner);
        }

        @NotNull
        public String toString() {
            return this.this$0.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* renamed from: getSupertypes */
        public List<KotlinType> mo894getSupertypes() {
            return getRefinedSupertypes();
        }
    }
}
