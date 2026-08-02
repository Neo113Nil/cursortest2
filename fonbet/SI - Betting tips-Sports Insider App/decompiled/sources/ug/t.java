package ug;

import gf.a0;
import gf.d0;
import gf.h0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import sg.h1;
import sg.k1;
import sg.n1;
import sg.q1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f24315a;

    static {
        Intrinsics.checkNotNullParameter(a0.f10010b, "<this>");
        Intrinsics.checkNotNullParameter(d0.f10017b, "<this>");
        Intrinsics.checkNotNullParameter(gf.w.f10042b, "<this>");
        Intrinsics.checkNotNullParameter(h0.f10022b, "<this>");
        qg.g[] elements = {k1.f23651b, n1.f23663b, h1.f23639b, q1.f23677b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f24315a = kotlin.collections.p.B(elements);
    }

    public static final boolean a(qg.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.isInline() && f24315a.contains(gVar);
    }
}
