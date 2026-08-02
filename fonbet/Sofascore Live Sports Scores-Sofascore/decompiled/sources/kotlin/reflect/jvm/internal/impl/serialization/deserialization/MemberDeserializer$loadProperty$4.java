package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MemberDeserializer$loadProperty$4 extends xka implements Function0<NullableLazyValue<? extends ConstantValue<?>>> {
    final /* synthetic */ DeserializedPropertyDescriptor $property;
    final /* synthetic */ ProtoBuf.Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function0<ConstantValue<?>> {
        final /* synthetic */ DeserializedPropertyDescriptor $property;
        final /* synthetic */ ProtoBuf.Property $proto;
        final /* synthetic */ MemberDeserializer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.this$0 = memberDeserializer;
            this.$proto = property;
            this.$property = deserializedPropertyDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ConstantValue<?> invoke() {
            DeserializationContext deserializationContext;
            ProtoContainer asProtoContainer;
            DeserializationContext deserializationContext2;
            MemberDeserializer memberDeserializer = this.this$0;
            deserializationContext = memberDeserializer.c;
            asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
            asProtoContainer.getClass();
            deserializationContext2 = this.this$0.c;
            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext2.getComponents().getAnnotationAndConstantLoader();
            ProtoBuf.Property property = this.$proto;
            KotlinType returnType = this.$property.getReturnType();
            returnType.getClass();
            return annotationAndConstantLoader.loadPropertyConstant(asProtoContainer, property, returnType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$loadProperty$4(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = property;
        this.$property = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NullableLazyValue<ConstantValue<?>> invoke() {
        DeserializationContext deserializationContext;
        deserializationContext = this.this$0.c;
        return deserializationContext.getStorageManager().createNullableLazyValue(new AnonymousClass1(this.this$0, this.$proto, this.$property));
    }
}
