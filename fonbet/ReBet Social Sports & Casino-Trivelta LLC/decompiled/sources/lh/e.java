package lh;

import kh.n;
import kh.r;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class e {

    @JvmField
    @NotNull
    public static final byte[] EmptyByteArray = new byte[0];

    public static final void a(n nVar, C5466a current) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == nVar) {
            return;
        }
        if (current.j() <= current.h()) {
            nVar.D0(current);
        } else if (current.e() - current.f() < 8) {
            nVar.T1(current);
        } else {
            nVar.t2(current.h());
        }
    }

    public static final C5466a b(n nVar, int i10) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.l2(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C5466a c(n nVar, C5466a current) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current != nVar) {
            return nVar.n1(current);
        }
        if (nVar.B()) {
            return (C5466a) nVar;
        }
        return null;
    }

    public static final C5466a d(r rVar, int i10, C5466a c5466a) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (c5466a != null) {
            rVar.d();
        }
        return rVar.a2(i10);
    }
}
