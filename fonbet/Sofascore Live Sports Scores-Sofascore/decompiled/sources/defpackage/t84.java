package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t84 {
    public final xy a;
    public final ejg b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public wcj j;
    public aej k;
    public nnd l;
    public oqf n;
    public oqf o;
    public final Object c = new Object();
    public Function1 m = s84.k;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = xzb.a();
    public final Matrix r = new Matrix();

    public t84(xy xyVar, ejg ejgVar) {
        this.a = xyVar;
        this.b = ejgVar;
    }

    public final void a() {
        boolean z;
        ejg ejgVar = this.b;
        joa joaVar = (joa) ejgVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) joaVar.getValue();
        View view = (View) ejgVar.c;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.m;
            float[] fArr = this.q;
            function1.invoke(new xzb(fArr));
            this.a.x(fArr);
            Matrix matrix = this.r;
            pco.O(matrix, fArr);
            wcj wcjVar = this.j;
            wcjVar.getClass();
            long j = wcjVar.b;
            nnd nndVar = this.l;
            nndVar.getClass();
            aej aejVar = this.k;
            aejVar.getClass();
            oqf oqfVar = this.n;
            oqfVar.getClass();
            oqf oqfVar2 = this.o;
            oqfVar2.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            pej pejVar = wcjVar.c;
            int g = pej.g(j);
            builder.setSelectionRange(g, pej.f(j));
            if (!z2 || g < 0) {
                z = z3;
            } else {
                int v = nndVar.v(g);
                oqf c = aejVar.c(v);
                z = z3;
                float b = llf.b(c.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (aejVar.c >> 32));
                boolean p = ao2.p(oqfVar, b, c.b);
                boolean p2 = ao2.p(oqfVar, b, c.d);
                boolean z6 = aejVar.a(v) == d1g.b;
                int i = (p || p2) ? 1 : 0;
                if (!p || !p2) {
                    i |= 2;
                }
                if (z6) {
                    i |= 4;
                }
                int i2 = i;
                float f = c.b;
                float f2 = c.d;
                builder.setInsertionMarkerLocation(b, f, f2, f2, i2);
            }
            if (z) {
                int g2 = pejVar != null ? pej.g(pejVar.a) : -1;
                int f3 = pejVar != null ? pej.f(pejVar.a) : -1;
                if (g2 >= 0 && g2 < f3) {
                    builder.setComposingText(g2, wcjVar.a.b.subSequence(g2, f3));
                    int v2 = nndVar.v(g2);
                    int v3 = nndVar.v(f3);
                    float[] fArr2 = new float[(v3 - v2) * 4];
                    aejVar.b.a(t6a.g(v2, v3), fArr2);
                    int i3 = g2;
                    while (i3 < f3) {
                        int v4 = nndVar.v(i3);
                        int i4 = (v4 - v2) * 4;
                        float f4 = fArr2[i4];
                        int i5 = f3;
                        float f5 = fArr2[i4 + 1];
                        int i6 = v2;
                        float f6 = fArr2[i4 + 2];
                        float f7 = fArr2[i4 + 3];
                        int i7 = i3;
                        int i8 = (oqfVar.a < f6 ? 1 : 0) & (f4 < oqfVar.c ? 1 : 0) & (oqfVar.b < f7 ? 1 : 0) & (f5 < oqfVar.d ? 1 : 0);
                        if (!ao2.p(oqfVar, f4, f5) || !ao2.p(oqfVar, f6, f7)) {
                            i8 |= 2;
                        }
                        if (aejVar.a(v4) == d1g.b) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(i7, f4, f5, f6, f7, i8);
                        i3 = i7 + 1;
                        f3 = i5;
                        v2 = i6;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z4) {
                z9.z(builder, oqfVar2);
            }
            if (i9 >= 34 && z5) {
                q9.a(builder, aejVar, oqfVar);
            }
            ((InputMethodManager) joaVar.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
