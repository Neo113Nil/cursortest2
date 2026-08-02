package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tz implements rq4, View.OnAttachStateChangeListener {
    public final xy a;
    public final ny b;
    public ko3 c;
    public final ArrayList d = new ArrayList();
    public oz e = oz.a;
    public boolean f = true;
    public final g62 g = ml4.g(1, 6, null);
    public uzc h;
    public long i;
    public final uzc j;
    public t3h k;
    public boolean l;
    public final y2 m;

    public tz(xy xyVar, ny nyVar) {
        this.a = xyVar;
        this.b = nyVar;
        new Handler(Looper.getMainLooper());
        uzc uzcVar = q6a.a;
        uzcVar.getClass();
        this.h = uzcVar;
        this.j = new uzc();
        this.k = new t3h(xyVar.getSemanticsOwner().a(), uzcVar);
        this.m = new y2(this, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (defpackage.n4o.y(100, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        rz rzVar;
        int i;
        b62 b62Var;
        b62 b62Var2;
        Object a;
        if (sq3Var instanceof rz) {
            rzVar = (rz) sq3Var;
            int i2 = rzVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rzVar.u = i2 - Integer.MIN_VALUE;
                Object obj = rzVar.s;
                lu3 lu3Var = lu3.a;
                i = rzVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    b62Var = new b62(this.g);
                    rzVar.r = b62Var;
                    rzVar.u = 1;
                    a = b62Var.a(rzVar);
                    if (a != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b62Var2 = rzVar.r;
                    y6a.M(obj);
                    b62Var = b62Var2;
                    rzVar.r = b62Var;
                    rzVar.u = 1;
                    a = b62Var.a(rzVar);
                    if (a != lu3Var) {
                        b62Var2 = b62Var;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.a;
                        }
                        b62Var2.c();
                        if (f()) {
                            j();
                        }
                        Handler handler = this.a.getHandler();
                        if (!this.l && handler != null) {
                            this.l = true;
                            handler.post(this.m);
                        }
                        rzVar.r = b62Var2;
                        rzVar.u = 2;
                    }
                    return lu3Var;
                }
                b62Var2 = rzVar.r;
                y6a.M(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        rzVar = new rz(this, sq3Var);
        Object obj2 = rzVar.s;
        lu3 lu3Var2 = lu3.a;
        i = rzVar.u;
        if (i != 0) {
        }
    }

    public final void b(p6a p6aVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        p6a p6aVar2 = p6aVar;
        int[] iArr3 = p6aVar2.b;
        long[] jArr = p6aVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        t3h t3hVar = (t3h) this.j.b(i7);
                        u3h u3hVar = (u3h) p6aVar2.b(i7);
                        s3h s3hVar = u3hVar != null ? u3hVar.a : null;
                        if (s3hVar == null) {
                            throw wt3.j("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = s3hVar.f;
                        x0d x0dVar = s3hVar.d.a;
                        if (t3hVar == null) {
                            Object[] objArr = x0dVar.b;
                            long[] jArr2 = x0dVar.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                a4h a4hVar = (a4h) objArr[(i10 << 3) + i12];
                                                a4h a4hVar2 = w3h.C;
                                                if (Intrinsics.c(a4hVar, a4hVar2)) {
                                                    Object g = x0dVar.g(a4hVar2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    n(i8, String.valueOf(list != null ? (q80) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = x0dVar.b;
                            long[] jArr3 = x0dVar.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                a4h a4hVar3 = (a4h) objArr2[(i13 << 3) + i15];
                                                a4h a4hVar4 = w3h.C;
                                                if (Intrinsics.c(a4hVar3, a4hVar4)) {
                                                    Object g2 = t3hVar.a.a.g(a4hVar4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    q80 q80Var = list2 != null ? (q80) CollectionsKt.firstOrNull(list2) : null;
                                                    Object g3 = x0dVar.g(a4hVar4);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    q80 q80Var2 = list3 != null ? (q80) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.c(q80Var, q80Var2)) {
                                                        n(i8, String.valueOf(q80Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    p6aVar2 = p6aVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            p6aVar2 = p6aVar;
            iArr3 = iArr;
        }
    }

    public final void c(s3h s3hVar, Function2 function2) {
        s3hVar.getClass();
        List j = s3h.j(4, s3hVar);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (d().a(((s3h) obj).f)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final p6a d() {
        if (this.f) {
            this.f = false;
            this.h = rd0.C(this.a.getSemanticsOwner(), ry.m);
            this.i = System.currentTimeMillis();
        }
        return this.h;
    }

    public final boolean f() {
        return this.c != null;
    }

    public final void j() {
        ko3 ko3Var = this.c;
        if (ko3Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ho3 ho3Var = (ho3) arrayList.get(i);
                int ordinal = ho3Var.c.ordinal();
                if (ordinal == 0) {
                    yia yiaVar = ho3Var.d;
                    if (yiaVar != null) {
                        ((jo3) ko3Var).d((ViewStructure) yiaVar.b);
                    }
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return;
                    }
                    jo3 jo3Var = (jo3) ko3Var;
                    AutofillId b = jo3Var.b(ho3Var.a);
                    if (b != null) {
                        jo3Var.e(b);
                    }
                }
            }
            ((jo3) ko3Var).a();
            arrayList.clear();
        }
    }

    public final void l(s3h s3hVar, t3h t3hVar) {
        int i = 0;
        c(s3hVar, new sz(i, t3hVar, this));
        List j = s3h.j(4, s3hVar);
        int size = j.size();
        while (i < size) {
            s3h s3hVar2 = (s3h) j.get(i);
            p6a d = d();
            int i2 = s3hVar2.f;
            if (d.a(i2)) {
                uzc uzcVar = this.j;
                if (uzcVar.a(i2)) {
                    Object b = uzcVar.b(i2);
                    if (b == null) {
                        throw wt3.j("node not present in pruned tree before this change");
                    }
                    l(s3hVar2, (t3h) b);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void n(int i, String str) {
        ko3 ko3Var;
        if (Build.VERSION.SDK_INT >= 29 && (ko3Var = this.c) != null) {
            jo3 jo3Var = (jo3) ko3Var;
            AutofillId b = jo3Var.b(i);
            if (b == null) {
                throw wt3.j("Invalid content capture ID");
            }
            jo3Var.f(b, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i, s3h s3hVar) {
        Function1 function1;
        oqf oqfVar;
        yia yiaVar;
        String P;
        Function1 function12;
        if (f()) {
            x0d x0dVar = s3hVar.d.a;
            Object g = x0dVar.g(w3h.E);
            if (g == null) {
                g = null;
            }
            Boolean bool = (Boolean) g;
            if (this.e == oz.a && Intrinsics.c(bool, Boolean.TRUE)) {
                Object g2 = x0dVar.g(k3h.m);
                if (g2 == null) {
                    g2 = null;
                }
                m9 m9Var = (m9) g2;
                if (m9Var != null && (function12 = (Function1) m9Var.b) != null) {
                }
            } else if (this.e == oz.b && Intrinsics.c(bool, Boolean.FALSE)) {
                Object g3 = x0dVar.g(k3h.m);
                if (g3 == null) {
                    g3 = null;
                }
                m9 m9Var2 = (m9) g3;
                if (m9Var2 != null && (function1 = (Function1) m9Var2.b) != null) {
                }
            }
            int i2 = s3hVar.f;
            ko3 ko3Var = this.c;
            if (ko3Var != null && Build.VERSION.SDK_INT >= 29) {
                AutofillId autofillId = this.a.getAutofillId();
                s3h l = s3hVar.l();
                int i3 = s3hVar.f;
                if (l != null) {
                    autofillId = ((jo3) ko3Var).b(l.f);
                }
                yia c = ((jo3) ko3Var).c(autofillId, i3);
                if (c != null) {
                    ViewStructure viewStructure = (ViewStructure) c.b;
                    l3h l3hVar = s3hVar.d;
                    a4h a4hVar = w3h.N;
                    x0d x0dVar2 = l3hVar.a;
                    if (!x0dVar2.c(a4hVar)) {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.i);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object g4 = x0dVar2.g(w3h.A);
                        if (g4 == null) {
                            g4 = null;
                        }
                        String str = (String) g4;
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        Object g5 = x0dVar2.g(w3h.n);
                        if (g5 == null) {
                            g5 = null;
                        }
                        if (((Boolean) g5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object g6 = x0dVar2.g(w3h.C);
                        if (g6 == null) {
                            g6 = null;
                        }
                        List list = (List) g6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(ycb.a(list, "\n", null, 62));
                        }
                        Object g7 = x0dVar2.g(w3h.G);
                        if (g7 == null) {
                            g7 = null;
                        }
                        q80 q80Var = (q80) g7;
                        if (q80Var != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(q80Var);
                        }
                        Object g8 = x0dVar2.g(w3h.a);
                        if (g8 == null) {
                            g8 = null;
                        }
                        List list2 = (List) g8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(ycb.a(list2, "\n", null, 62));
                        }
                        Object g9 = x0dVar2.g(w3h.z);
                        if (g9 == null) {
                            g9 = null;
                        }
                        u5g u5gVar = (u5g) g9;
                        if (u5gVar != null && (P = yfa.P(u5gVar.a)) != null) {
                            viewStructure.setClassName(P);
                        }
                        aej q = yfa.q(l3hVar);
                        if (q != null) {
                            zdj zdjVar = q.a;
                            dfj dfjVar = zdjVar.b;
                            kx4 kx4Var = zdjVar.g;
                            viewStructure.setTextStyle(kx4Var.getFontScale() * kx4Var.j() * lfj.c(dfjVar.a.b), 0, 0, 0);
                        }
                        wdd d = s3hVar.d();
                        if (d != null) {
                            wdd wddVar = d.e1().n ? d : null;
                            if (wddVar != null) {
                                oqfVar = s3hVar.a(wddVar);
                                float f = oqfVar.a;
                                float f2 = oqfVar.b;
                                viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (oqfVar.c - f), (int) (oqfVar.d - f2));
                                yiaVar = c;
                                if (yiaVar != null) {
                                    this.d.add(new ho3(i2, this.i, io3.a, yiaVar));
                                }
                                c(s3hVar, new z2(this, 1));
                            }
                        }
                        oqfVar = oqf.e;
                        float f3 = oqfVar.a;
                        float f22 = oqfVar.b;
                        viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (oqfVar.c - f3), (int) (oqfVar.d - f22));
                        yiaVar = c;
                        if (yiaVar != null) {
                        }
                        c(s3hVar, new z2(this, 1));
                    }
                }
            }
            yiaVar = null;
            if (yiaVar != null) {
            }
            c(s3hVar, new z2(this, 1));
        }
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        this.c = (ko3) this.b.invoke();
        o(-1, this.a.getSemanticsOwner().a());
        j();
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        p(this.a.getSemanticsOwner().a());
        j();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.m);
        this.c = null;
    }

    public final void p(s3h s3hVar) {
        if (f()) {
            this.d.add(new ho3(s3hVar.f, this.i, io3.b, null));
            List j = s3h.j(4, s3hVar);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                p((s3h) j.get(i));
            }
        }
    }

    public final void q() {
        uzc uzcVar = this.j;
        uzcVar.c();
        p6a d = d();
        int[] iArr = d.b;
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            uzcVar.i(iArr[i4], new t3h(((u3h) objArr[i4]).a, d()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.k = new t3h(this.a.getSemanticsOwner().a(), d());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
