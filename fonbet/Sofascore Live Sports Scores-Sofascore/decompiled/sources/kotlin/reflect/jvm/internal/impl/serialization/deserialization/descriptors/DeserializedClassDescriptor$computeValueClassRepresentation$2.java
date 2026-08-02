package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.duf;
import defpackage.nt8;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends nt8 implements Function1<Name, SimpleType> {
    public DeserializedClassDescriptor$computeValueClassRepresentation$2(Object obj) {
        super(1, obj);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getValueClassPropertyType";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(DeserializedClassDescriptor.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SimpleType invoke(@NotNull Name name) {
        SimpleType valueClassPropertyType;
        name.getClass();
        valueClassPropertyType = ((DeserializedClassDescriptor) this.receiver).getValueClassPropertyType(name);
        return valueClassPropertyType;
    }
}
