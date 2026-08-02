package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l5b {
    public final g10 a;
    public final f4a b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public wcj j;
    public aej k;
    public nnd l;
    public oqf m;
    public oqf n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = xzb.a();
    public final Matrix q = new Matrix();

    public l5b(g10 g10Var, f4a f4aVar) {
        this.a = g10Var;
        this.b = f4aVar;
    }

    public final void a() {
        boolean z;
        f4a f4aVar = this.b;
        InputMethodManager j = f4aVar.j();
        View view = (View) f4aVar.b;
        if (!j.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        xzb.d(fArr);
        dma dmaVar = (dma) ((eoh) this.a.b.r).getValue();
        if (dmaVar != null) {
            if (!dmaVar.f()) {
                dmaVar = null;
            }
            if (dmaVar != null) {
                dmaVar.z(fArr);
            }
        }
        Unit unit = Unit.a;
        oqf oqfVar = this.n;
        oqfVar.getClass();
        float f = -oqfVar.a;
        oqf oqfVar2 = this.n;
        oqfVar2.getClass();
        xzb.g(fArr, f, -oqfVar2.b);
        Matrix matrix = this.q;
        pco.O(matrix, fArr);
        wcj wcjVar = this.j;
        wcjVar.getClass();
        long j2 = wcjVar.b;
        nnd nndVar = this.l;
        nndVar.getClass();
        aej aejVar = this.k;
        aejVar.getClass();
        oqf oqfVar3 = this.m;
        oqfVar3.getClass();
        oqf oqfVar4 = this.n;
        oqfVar4.getClass();
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        pej pejVar = wcjVar.c;
        int g = pej.g(j2);
        builder.setSelectionRange(g, pej.f(j2));
        if (!z2 || g < 0) {
            z = z3;
        } else {
            int v = nndVar.v(g);
            oqf c = aejVar.c(v);
            z = z3;
            float b = llf.b(c.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (aejVar.c >> 32));
            boolean w = aba.w(oqfVar3, b, c.b);
            boolean w2 = aba.w(oqfVar3, b, c.d);
            boolean z6 = aejVar.a(v) == d1g.b;
            int i = (w || w2) ? 1 : 0;
            if (!w || !w2) {
                i |= 2;
            }
            if (z6) {
                i |= 4;
            }
            int i2 = i;
            float f2 = c.b;
            float f3 = c.d;
            builder.setInsertionMarkerLocation(b, f2, f3, f3, i2);
        }
        if (z) {
            int g2 = pejVar != null ? pej.g(pejVar.a) : -1;
            int f4 = pejVar != null ? pej.f(pejVar.a) : -1;
            if (g2 >= 0 && g2 < f4) {
                builder.setComposingText(g2, wcjVar.a.b.subSequence(g2, f4));
                int v2 = nndVar.v(g2);
                int v3 = nndVar.v(f4);
                float[] fArr2 = new float[(v3 - v2) * 4];
                aejVar.b.a(t6a.g(v2, v3), fArr2);
                int i3 = g2;
                while (i3 < f4) {
                    int v4 = nndVar.v(i3);
                    int i4 = (v4 - v2) * 4;
                    float f5 = fArr2[i4];
                    int i5 = f4;
                    float f6 = fArr2[i4 + 1];
                    int i6 = v2;
                    float f7 = fArr2[i4 + 2];
                    float f8 = fArr2[i4 + 3];
                    int i7 = i3;
                    int i8 = (oqfVar3.a < f7 ? 1 : 0) & (f5 < oqfVar3.c ? 1 : 0) & (oqfVar3.b < f8 ? 1 : 0) & (f6 < oqfVar3.d ? 1 : 0);
                    if (!aba.w(oqfVar3, f5, f6) || !aba.w(oqfVar3, f7, f8)) {
                        i8 |= 2;
                    }
                    if (aejVar.a(v4) == d1g.b) {
                        i8 |= 4;
                    }
                    builder.addCharacterBounds(i7, f5, f6, f7, f8, i8);
                    i3 = i7 + 1;
                    f4 = i5;
                    v2 = i6;
                }
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 && z4) {
            z9.A(builder, oqfVar4);
        }
        if (i9 >= 34 && z5) {
            q9.b(builder, aejVar, oqfVar3);
        }
        f4aVar.j().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
