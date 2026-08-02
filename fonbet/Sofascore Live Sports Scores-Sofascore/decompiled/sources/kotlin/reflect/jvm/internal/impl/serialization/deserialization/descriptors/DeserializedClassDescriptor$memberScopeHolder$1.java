package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.duf;
import defpackage.nt8;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends nt8 implements Function1<KotlinTypeRefiner, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, kotlinTypeRefiner);
    }
}
