package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeDeserializer$simpleType$annotations$1 extends xka implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ ProtoBuf.Type $proto;
    final /* synthetic */ TypeDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$simpleType$annotations$1(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        super(0);
        this.this$0 = typeDeserializer;
        this.$proto = type;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        DeserializationContext deserializationContext;
        DeserializationContext deserializationContext2;
        deserializationContext = this.this$0.c;
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext.getComponents().getAnnotationAndConstantLoader();
        ProtoBuf.Type type = this.$proto;
        deserializationContext2 = this.this$0.c;
        return annotationAndConstantLoader.loadTypeAnnotations(type, deserializationContext2.getNameResolver());
    }
}
