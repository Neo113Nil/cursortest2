package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.km5;
import defpackage.xka;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MemberDeserializer$getAnnotations$1 extends xka implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ AnnotatedCallableKind $kind;
    final /* synthetic */ MessageLite $proto;
    final /* synthetic */ MemberDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getAnnotations$1(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = messageLite;
        this.$kind = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        DeserializationContext deserializationContext;
        ProtoContainer asProtoContainer;
        List<AnnotationDescriptor> list;
        DeserializationContext deserializationContext2;
        MemberDeserializer memberDeserializer = this.this$0;
        deserializationContext = memberDeserializer.c;
        asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
        if (asProtoContainer != null) {
            MemberDeserializer memberDeserializer2 = this.this$0;
            MessageLite messageLite = this.$proto;
            AnnotatedCallableKind annotatedCallableKind = this.$kind;
            deserializationContext2 = memberDeserializer2.c;
            list = CollectionsKt.S0(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(asProtoContainer, messageLite, annotatedCallableKind));
        } else {
            list = null;
        }
        return list == null ? km5.a : list;
    }
}
