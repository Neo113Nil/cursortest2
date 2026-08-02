package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.aog0;
import xsna.frm0;
import xsna.oio;
import xsna.qbr;
import xsna.qio;
import xsna.va2;
import xsna.yq9;
import xsna.zhf0;

/* compiled from: Outline.kt */
/* loaded from: classes11.dex */
public final class d {
    public static final void a(a aVar, c cVar) {
        if (cVar instanceof c.b) {
            aVar.g(((c.b) cVar).a, Path.Direction.CounterClockwise);
        } else if (cVar instanceof c.C0013c) {
            aVar.q(((c.C0013c) cVar).a, Path.Direction.CounterClockwise);
        } else {
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.w(((c.a) cVar).a, 0L);
        }
    }

    public static final void b(yq9 yq9Var, c cVar, va2 va2Var) {
        if (cVar instanceof c.b) {
            yq9Var.n(((c.b) cVar).a, va2Var);
            return;
        }
        if (!(cVar instanceof c.C0013c)) {
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yq9Var.k(((c.a) cVar).a, va2Var);
            return;
        }
        c.C0013c c0013c = (c.C0013c) cVar;
        a aVar = c0013c.b;
        aog0 aog0Var = c0013c.a;
        if (aVar != null) {
            yq9Var.k(aVar, va2Var);
        } else {
            yq9Var.l(aog0Var.a, aog0Var.b, aog0Var.c, aog0Var.d, Float.intBitsToFloat((int) (aog0Var.h >> 32)), Float.intBitsToFloat((int) (aog0Var.h & 4294967295L)), va2Var);
        }
    }

    public static void c(oio oioVar, c cVar, long j, frm0 frm0Var, int i) {
        qio qioVar = (i & 8) != 0 ? qbr.a : frm0Var;
        if (cVar instanceof c.b) {
            zhf0 zhf0Var = ((c.b) cVar).a;
            float f = zhf0Var.a;
            oioVar.d0(j, (Float.floatToRawIntBits(zhf0Var.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), d(zhf0Var), 1.0f, qioVar, null, 3);
            return;
        }
        if (!(cVar instanceof c.C0013c)) {
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            oioVar.V(((c.a) cVar).a, j, 1.0f, qioVar);
            return;
        }
        c.C0013c c0013c = (c.C0013c) cVar;
        a aVar = c0013c.b;
        if (aVar != null) {
            oioVar.V(aVar, j, 1.0f, qioVar);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (c0013c.a.h >> 32));
        oioVar.w0(j, (Float.floatToRawIntBits(r0.a) << 32) | (Float.floatToRawIntBits(r0.b) & 4294967295L), (Float.floatToRawIntBits(r0.b()) << 32) | (Float.floatToRawIntBits(r0.a()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), qioVar, 3);
    }

    public static final long d(zhf0 zhf0Var) {
        float f = zhf0Var.c - zhf0Var.a;
        float f2 = zhf0Var.d - zhf0Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
