package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.duf;
import defpackage.nt8;
import defpackage.s9a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends nt8 implements Function1<ProtoBuf.Type, SimpleType> {
    public DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "simpleType";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(s9a.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final SimpleType invoke(@NotNull ProtoBuf.Type type) {
        type.getClass();
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, type, false, 2, null);
    }
}
