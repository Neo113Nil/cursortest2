package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u84 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public u84(k0g k0gVar) {
        this.e = k0gVar.b;
        this.f = k0gVar.c;
        this.g = (jl9) k0gVar.a.d;
        this.h = k0gVar.o;
        this.i = k0gVar.s;
        this.j = k0gVar.t;
        this.k = k0gVar.u;
        this.a = k0gVar.p;
        this.b = k0gVar.q;
        this.c = k0gVar.r;
        this.l = k0gVar.w;
        this.d = k0gVar.x;
    }

    public CursorAnchorInfo a() {
        dma dmaVar;
        dma b;
        aej c;
        Matrix matrix = (Matrix) this.l;
        float[] fArr = (float[]) this.k;
        cej cejVar = (cej) this.f;
        dma e = cejVar.e();
        if (e != null) {
            if (!e.f()) {
                e = null;
            }
            if (e != null && (dmaVar = (dma) ((eoh) cejVar.d).getValue()) != null) {
                if (!dmaVar.f()) {
                    dmaVar = null;
                }
                if (dmaVar != null && (b = cejVar.b()) != null) {
                    if (!b.f()) {
                        b = null;
                    }
                    if (b != null && (c = cejVar.c()) != null) {
                        m9j d = ((jwj) this.e).d();
                        xzb.d(fArr);
                        e.z(fArr);
                        pco.O(matrix, fArr);
                        oqf k = pea.H(dmaVar).k(e.l(dmaVar, 0L));
                        oqf k2 = pea.H(b).k(e.l(b, 0L));
                        CursorAnchorInfo.Builder builder = (CursorAnchorInfo.Builder) this.j;
                        long j = d.d;
                        pej pejVar = d.e;
                        boolean z = this.a;
                        boolean z2 = this.b;
                        boolean z3 = this.c;
                        boolean z4 = this.d;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int g = pej.g(j);
                        builder.setSelectionRange(g, pej.f(j));
                        if (z && g >= 0) {
                            oqf c2 = c.c(g);
                            float b2 = llf.b(c2.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (c.c >> 32));
                            boolean w = aba.w(k, b2, c2.b);
                            boolean w2 = aba.w(k, b2, c2.d);
                            boolean z5 = c.a(g) == d1g.b;
                            int i = (w || w2) ? 1 : 0;
                            if (!w || !w2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            float f = c2.b;
                            float f2 = c2.d;
                            builder.setInsertionMarkerLocation(b2, f, f2, f2, i);
                        }
                        if (z2) {
                            int g2 = pejVar != null ? pej.g(pejVar.a) : -1;
                            int f3 = pejVar != null ? pej.f(pejVar.a) : -1;
                            if (g2 >= 0 && g2 < f3) {
                                builder.setComposingText(g2, d.c.subSequence(g2, f3));
                                float[] fArr2 = new float[(f3 - g2) * 4];
                                c.b.a(t6a.g(g2, f3), fArr2);
                                int i2 = g2;
                                while (g2 < f3) {
                                    int i3 = (g2 - i2) * 4;
                                    float f4 = fArr2[i3];
                                    float f5 = fArr2[i3 + 1];
                                    float f6 = fArr2[i3 + 2];
                                    float f7 = fArr2[i3 + 3];
                                    int i4 = (k.a < f6 ? 1 : 0) & (f4 < k.c ? 1 : 0) & (k.b < f7 ? 1 : 0) & (f5 < k.d ? 1 : 0);
                                    if (!aba.w(k, f4, f5) || !aba.w(k, f6, f7)) {
                                        i4 |= 2;
                                    }
                                    boolean z6 = z4;
                                    if (c.a(g2) == d1g.b) {
                                        i4 |= 4;
                                    }
                                    builder.addCharacterBounds(g2, f4, f5, f6, f7, i4);
                                    g2++;
                                    z4 = z6;
                                }
                            }
                        }
                        boolean z7 = z4;
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 33 && z3) {
                            z9.A(builder, k2);
                        }
                        if (i5 >= 34 && z7) {
                            q9.b(builder, c, k);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }

    public u84(jwj jwjVar, cej cejVar, z41 z41Var, ku3 ku3Var) {
        this.e = jwjVar;
        this.f = cejVar;
        this.g = z41Var;
        this.h = ku3Var;
        this.j = new CursorAnchorInfo.Builder();
        this.k = xzb.a();
        this.l = new Matrix();
    }
}
