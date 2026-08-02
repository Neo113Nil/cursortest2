package ke;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
final /* synthetic */ class g extends C7734p implements Function1<ne.g, K0> {
    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return N.b(f.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final K0 invoke(ne.g gVar) {
        ne.g p02 = gVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((f) this.receiver).c(p02);
    }
}
