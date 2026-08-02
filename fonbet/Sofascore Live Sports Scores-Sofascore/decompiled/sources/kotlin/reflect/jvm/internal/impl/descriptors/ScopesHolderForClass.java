package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.duf;
import defpackage.fuf;
import defpackage.kef;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ScopesHolderForClass<T extends MemberScope> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private final ClassDescriptor classDescriptor;

    @NotNull
    private final KotlinTypeRefiner kotlinTypeRefinerForOwnerModule;

    @NotNull
    private final Function1<KotlinTypeRefiner, T> scopeFactory;

    @NotNull
    private final NotNullLazyValue scopeForOwnerModule$delegate;

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1<? super KotlinTypeRefiner, ? extends T> function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.classDescriptor = classDescriptor;
        this.scopeFactory = function1;
        this.kotlinTypeRefinerForOwnerModule = kotlinTypeRefiner;
        this.scopeForOwnerModule$delegate = storageManager.createLazyValue(new ScopesHolderForClass$scopeForOwnerModule$2(this));
    }

    private final T getScopeForOwnerModule() {
        return (T) StorageKt.getValue(this.scopeForOwnerModule$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @NotNull
    public final T getScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        if (!kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(this.classDescriptor))) {
            return getScopeForOwnerModule();
        }
        TypeConstructor typeConstructor = this.classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? getScopeForOwnerModule() : (T) kotlinTypeRefiner.getOrPutScopeForClass(this.classDescriptor, new ScopesHolderForClass$getScope$1(this, kotlinTypeRefiner));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T extends MemberScope> ScopesHolderForClass<T> create(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> function1) {
            classDescriptor.getClass();
            storageManager.getClass();
            kotlinTypeRefiner.getClass();
            function1.getClass();
            return new ScopesHolderForClass<>(classDescriptor, storageManager, function1, kotlinTypeRefiner, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }
}
