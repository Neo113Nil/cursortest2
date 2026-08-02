package kotlin.reflect.jvm;

import defpackage.duf;
import defpackage.nt8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends nt8 implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "loadFunction";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(MemberDeserializer.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final SimpleFunctionDescriptor invoke(@NotNull MemberDeserializer memberDeserializer, @NotNull ProtoBuf.Function function) {
        memberDeserializer.getClass();
        function.getClass();
        return memberDeserializer.loadFunction(function);
    }
}
