package kotlin.reflect.jvm.internal;

import defpackage.duf;
import defpackage.nt8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class KPackageImpl$getLocalProperty$1$1$1 extends nt8 implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {
    public static final KPackageImpl$getLocalProperty$1$1$1 INSTANCE = new KPackageImpl$getLocalProperty$1$1$1();

    public KPackageImpl$getLocalProperty$1$1$1() {
        super(2);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "loadProperty";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(MemberDeserializer.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final PropertyDescriptor invoke(@NotNull MemberDeserializer memberDeserializer, @NotNull ProtoBuf.Property property) {
        memberDeserializer.getClass();
        property.getClass();
        return memberDeserializer.loadProperty(property);
    }
}
