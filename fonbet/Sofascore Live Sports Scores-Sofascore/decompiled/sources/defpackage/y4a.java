package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ironsource.mediationsdk.d;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y4a extends qo2 implements Runnable, kpd, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public x9l e;
    public final x0d f;
    public final znh g;
    public final l0d h;
    public final SnapshotStateList i;

    public y4a() {
        super(1);
        x0d x0dVar = new x0d(9);
        eal.a.getClass();
        x0dVar.m(dal.b, new ral("caption bar"));
        x0dVar.m(dal.c, new ral("display cutout"));
        x0dVar.m(dal.d, new ral("ime"));
        x0dVar.m(dal.e, new ral("mandatory system gestures"));
        x0dVar.m(dal.f, new ral("navigation bars"));
        x0dVar.m(dal.g, new ral("status bars"));
        x0dVar.m(dal.h, new ral("system gestures"));
        x0dVar.m(dal.i, new ral("tappable element"));
        x0dVar.m(dal.j, new ral(d.h));
        this.f = x0dVar;
        this.g = e.c(0);
        this.h = new l0d(4);
        this.i = new SnapshotStateList();
    }

    public final void J(x9l x9lVar) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        uzc uzcVar = gal.a;
        int[] iArr3 = uzcVar.b;
        Object[] objArr3 = uzcVar.c;
        long[] jArr3 = uzcVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            eal ealVar = (eal) objArr3[i6];
                            u4a i8 = x9lVar.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (i8.a << 48) | (i8.b << 32) | (i8.c << 16) | i8.d;
                            Object g = this.f.g(ealVar);
                            g.getClass();
                            ral ralVar = (ral) g;
                            j2 = j3;
                            if (!r4a.u(j4, ralVar.h)) {
                                ralVar.h = j4;
                                z2 = true;
                                if (!r4a.u(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                u4a j5 = x9lVar.a.j(i7);
                                objArr2 = objArr3;
                                long j6 = (j5.b << 32) | (j5.a << 48) | (j5.c << 16) | j5.d;
                                if (!r4a.u(ralVar.i, j6)) {
                                    ralVar.i = j6;
                                    z2 = true;
                                    if (!r4a.u(j6, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            ((eoh) ralVar.a).setValue(Boolean.valueOf(x9lVar.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        e55 h = x9lVar.a.h();
        if (h == null) {
            j = 0;
        } else {
            u4a a = h.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        x0d x0dVar = this.f;
        eal.a.getClass();
        Object g2 = x0dVar.g(dal.j);
        g2.getClass();
        ral ralVar2 = (ral) g2;
        ((eoh) ralVar2.a).setValue(Boolean.valueOf(!r4a.u(j, 0L)));
        if (!r4a.u(ralVar2.h, j)) {
            ralVar2.h = j;
            ralVar2.i = j;
            z2 = z;
            if (!r4a.u(j, 0L)) {
                z3 = z2;
            }
        }
        if (h == null) {
            l0d l0dVar = this.h;
            if (l0dVar.b > 0) {
                l0dVar.d();
                this.i.clear();
                z2 = z;
            }
        } else {
            List n = Build.VERSION.SDK_INT >= 28 ? c90.n(h.a) : Collections.EMPTY_LIST;
            int size = n.size();
            l0d l0dVar2 = this.h;
            if (size < l0dVar2.b) {
                l0dVar2.l(n.size(), this.h.b);
                this.i.a(n.size(), this.i.size());
                z2 = z;
            } else {
                int size2 = n.size() - this.h.b;
                int i9 = 0;
                while (i9 < size2) {
                    l0d l0dVar3 = this.h;
                    l0dVar3.a(e.f(n.get(l0dVar3.b)));
                    this.i.add(new a4a("display cutout rect " + this.h.b));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = n.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = (Rect) n.get(i10);
                e1d e1dVar = (e1d) this.h.f(i10);
                if (!Intrinsics.c(e1dVar.getValue(), rect)) {
                    e1dVar.setValue(rect);
                    z2 = z;
                }
            }
            if (!n.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.g.h() != 0) && z2) {
            znh znhVar = this.g;
            znhVar.i(znhVar.h() + 1);
            synchronized (snh.c) {
                y0d y0dVar = snh.j.h;
                if (y0dVar != null) {
                    boolean z5 = z;
                    z4 = y0dVar.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                snh.c();
            }
        }
    }

    @Override // defpackage.kpd
    public final x9l L(View view, x9l x9lVar) {
        if (this.c) {
            this.e = x9lVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return x9lVar;
            }
        } else if (this.d == 0) {
            J(x9lVar);
        }
        return x9lVar;
    }

    @Override // defpackage.qo2
    public final void d(d9l d9lVar) {
        boolean z = false;
        this.c = false;
        int d = d9lVar.a.d();
        this.d &= ~d;
        this.e = null;
        eal ealVar = (eal) gal.a.b(d);
        if (ealVar != null) {
            Object g = this.f.g(ealVar);
            g.getClass();
            ral ralVar = (ral) g;
            ralVar.c.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ralVar.e.i(1.0f);
            ralVar.d.i(0L);
            ralVar.c.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((eoh) ralVar.b).setValue(Boolean.FALSE);
            ralVar.j = -1L;
            ralVar.k = -1L;
            znh znhVar = this.g;
            znhVar.i(znhVar.h() + 1);
            synchronized (snh.c) {
                y0d y0dVar = snh.j.h;
                if (y0dVar != null) {
                    if (y0dVar.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                snh.c();
            }
        }
    }

    @Override // defpackage.qo2
    public final void e(d9l d9lVar) {
        this.c = true;
    }

    @Override // defpackage.qo2
    public final x9l f(x9l x9lVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d9l d9lVar = (d9l) list.get(i);
            eal ealVar = (eal) gal.a.b(d9lVar.a.d());
            if (ealVar != null) {
                Object g = this.f.g(ealVar);
                g.getClass();
                ral ralVar = (ral) g;
                if (((Boolean) ((eoh) ralVar.b).getValue()).booleanValue()) {
                    c9l c9lVar = d9lVar.a;
                    ralVar.c.i(c9lVar.c());
                    ralVar.e.i(c9lVar.a());
                    ralVar.d.i(c9lVar.b());
                }
            }
        }
        J(x9lVar);
        return x9lVar;
    }

    @Override // defpackage.qo2
    public final c0l g(d9l d9lVar, c0l c0lVar) {
        x9l x9lVar = this.e;
        boolean z = false;
        this.c = false;
        this.e = null;
        if (d9lVar.a.b() > 0 && x9lVar != null) {
            int d = d9lVar.a.d();
            this.d |= d;
            eal ealVar = (eal) gal.a.b(d);
            if (ealVar != null) {
                Object g = this.f.g(ealVar);
                g.getClass();
                ral ralVar = (ral) g;
                u4a i = x9lVar.a.i(d);
                long j = (i.a << 48) | (i.b << 32) | (i.c << 16) | i.d;
                long j2 = ralVar.h;
                if (!r4a.u(j, j2)) {
                    ralVar.j = j2;
                    ralVar.k = j;
                    ((eoh) ralVar.b).setValue(Boolean.TRUE);
                    c9l c9lVar = d9lVar.a;
                    ralVar.c.i(c9lVar.c());
                    ralVar.e.i(c9lVar.a());
                    ralVar.d.i(c9lVar.b());
                    znh znhVar = this.g;
                    znhVar.i(znhVar.h() + 1);
                    synchronized (snh.c) {
                        y0d y0dVar = snh.j.h;
                        if (y0dVar != null) {
                            if (y0dVar.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        snh.c();
                        return c0lVar;
                    }
                }
            }
        }
        return c0lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = bsk.a;
        srk.c(view, this);
        d9l.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = bsk.a;
        srk.c(view, null);
        d9l.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            x9l x9lVar = this.e;
            if (x9lVar != null) {
                J(x9lVar);
                this.e = null;
            }
        }
    }
}
