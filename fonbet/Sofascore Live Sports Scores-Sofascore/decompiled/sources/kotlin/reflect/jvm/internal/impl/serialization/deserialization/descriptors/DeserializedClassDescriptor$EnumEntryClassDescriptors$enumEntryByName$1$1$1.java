package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.xka;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1 extends xka implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ ProtoBuf.EnumEntry $proto;
    final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
        this.$proto = enumEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        return CollectionsKt.S0(this.this$0.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(this.this$0.getThisAsProtoContainer$deserialization(), this.$proto));
    }
}
