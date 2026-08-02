package defpackage;

import android.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uoi implements nr9 {
    public final ejg a;
    public final k1d b;
    public final int c;
    public final int d;

    public uoi(ejg ejgVar, k1d k1dVar, int i, int i2) {
        this.a = ejgVar;
        this.b = k1dVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.nr9
    public final long a() {
        return 2048L;
    }

    @Override // defpackage.nr9
    public final boolean b() {
        return true;
    }

    @Override // defpackage.nr9
    public final void c(Canvas canvas) {
        ArrayList arrayList;
        ejg ejgVar = this.a;
        ejgVar.getClass();
        zl1 zl1Var = (zl1) ejgVar.b;
        k1d k1dVar = this.b;
        if (k1dVar == null) {
            k1dVar = new k1d(24);
        }
        if (((w0d) k1dVar.c) == null) {
            k1dVar.c = new w0d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
        }
        vng vngVar = new vng();
        vngVar.a = canvas;
        vngVar.b = ejgVar;
        pmg pmgVar = (pmg) ejgVar.c;
        if (pmgVar == null) {
            return;
        }
        w0d w0dVar = pmgVar.o;
        f6f f6fVar = pmgVar.n;
        zl1 zl1Var2 = (zl1) k1dVar.b;
        if (zl1Var2 != null) {
            ArrayList arrayList2 = zl1Var2.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                zl1Var.h((zl1) k1dVar.b);
            }
        }
        vngVar.c = new tng();
        vngVar.d = new Stack();
        vngVar.r0((tng) vngVar.c, omg.a());
        tng tngVar = (tng) vngVar.c;
        tngVar.f = null;
        tngVar.h = false;
        ((Stack) vngVar.d).push(new tng(tngVar));
        vngVar.f = new Stack();
        vngVar.e = new Stack();
        Boolean bool = pmgVar.d;
        if (bool != null) {
            ((tng) vngVar.c).h = bool.booleanValue();
        }
        vngVar.m0();
        w0d w0dVar2 = new w0d((w0d) k1dVar.c);
        amg amgVar = pmgVar.r;
        if (amgVar != null) {
            w0dVar2.d = amgVar.c(vngVar, w0dVar2.d);
        }
        amg amgVar2 = pmgVar.s;
        if (amgVar2 != null) {
            w0dVar2.e = amgVar2.c(vngVar, w0dVar2.e);
        }
        vngVar.d0(pmgVar, w0dVar2, w0dVar, f6fVar);
        vngVar.l0();
        zl1 zl1Var3 = (zl1) k1dVar.b;
        if (zl1Var3 != null) {
            ArrayList arrayList3 = zl1Var3.b;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = zl1Var.b) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((zd2) it.next()).c == 2) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.nr9
    public final int getHeight() {
        return this.d;
    }

    @Override // defpackage.nr9
    public final int getWidth() {
        return this.c;
    }
}
