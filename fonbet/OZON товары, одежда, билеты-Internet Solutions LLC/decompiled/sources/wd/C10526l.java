package wd;

import ie.C7056e;
import java.util.Collections;
import java.util.List;
import je.o0;
import je.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10526l implements Function0<je.Y> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Sd.f f104304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC10527m f104305b;

    C10526l(AbstractC10527m abstractC10527m, Sd.f fVar) {
        this.f104305b = abstractC10527m;
        this.f104304a = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final je.Y invoke() {
        o0.f69907b.getClass();
        o0 o0Var = o0.f69908c;
        s0 k11 = this.f104305b.k();
        List list = Collections.EMPTY_LIST;
        C10525k getScope = new C10525k(this);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        return je.Q.g(new ce.j(C7056e.f66260e, getScope), list, o0Var, k11, false);
    }
}
