package ke;

import je.N;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final /* synthetic */ class B extends C7734p implements Function2<N, N, Boolean> {
    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return kotlin.jvm.internal.N.b(r.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(N n11, N n12) {
        N p02 = n11;
        N p12 = n12;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return Boolean.valueOf(((r) this.receiver).c(p02, p12));
    }
}
