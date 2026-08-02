package he;

import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
final /* synthetic */ class t extends C7734p implements Function1<Sd.f, Y> {
    t(n nVar) {
        super(1, nVar);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return N.b(n.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Y invoke(Sd.f fVar) {
        Y U02;
        Sd.f p02 = fVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        U02 = ((n) this.receiver).U0(p02);
        return U02;
    }
}
