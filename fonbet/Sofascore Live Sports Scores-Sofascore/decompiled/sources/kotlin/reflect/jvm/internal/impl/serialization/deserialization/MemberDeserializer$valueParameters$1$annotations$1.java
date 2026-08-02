package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MemberDeserializer$valueParameters$1$annotations$1 extends xka implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ MessageLite $callable;
    final /* synthetic */ ProtoContainer $containerOfCallable;
    final /* synthetic */ int $i;
    final /* synthetic */ AnnotatedCallableKind $kind;
    final /* synthetic */ ProtoBuf.ValueParameter $proto;
    final /* synthetic */ MemberDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$valueParameters$1$annotations$1(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$containerOfCallable = protoContainer;
        this.$callable = messageLite;
        this.$kind = annotatedCallableKind;
        this.$i = i;
        this.$proto = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        DeserializationContext deserializationContext;
        deserializationContext = this.this$0.c;
        return CollectionsKt.S0(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.$containerOfCallable, this.$callable, this.$kind, this.$i, this.$proto));
    }
}
