package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 extends xka implements Function0<Collection<? extends KotlinType>> {
    final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.this$0 = deserializedClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Collection<KotlinType> invoke() {
        KotlinTypeRefiner kotlinTypeRefiner;
        DeserializedClassDescriptor classDescriptor;
        kotlinTypeRefiner = this.this$0.kotlinTypeRefiner;
        classDescriptor = this.this$0.getClassDescriptor();
        return kotlinTypeRefiner.refineSupertypes(classDescriptor);
    }
}
