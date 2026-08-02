package he;

import fe.X;
import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
final /* synthetic */ class s extends C7734p implements Function1<Nd.p, Y> {
    s(X x11) {
        super(1, x11);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "simpleType";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return N.b(Intrinsics.a.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Y invoke(Nd.p pVar) {
        Nd.p p02 = pVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((X) this.receiver).h(p02, true);
    }
}
