package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Trace;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qn2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public qn2(int i) {
        switch (i) {
            case 2:
                i1d i1dVar = new i1d(new ev8[16], 0);
                this.c = i1dVar;
                y0d y0dVar = rrg.a;
                this.d = new y0d();
                this.e = i1dVar;
                this.f = new i1d(new Object[16], 0);
                this.g = new i1d(new Function0[16], 0);
                break;
            case 3:
                this.a = new sbh[4];
                this.b = new Matrix[4];
                this.c = new Matrix[4];
                this.d = new PointF();
                this.e = new Path();
                this.f = new Path();
                this.g = new sbh();
                this.h = new float[2];
                this.i = new float[2];
                this.j = new Path();
                this.k = new Path();
                for (int i2 = 0; i2 < 4; i2++) {
                    ((sbh[]) this.a)[i2] = new sbh();
                    ((Matrix[]) this.b)[i2] = new Matrix();
                    ((Matrix[]) this.c)[i2] = new Matrix();
                }
                break;
            default:
                this.a = new x8g();
                z8g z8gVar = new z8g();
                z8gVar.a = null;
                z8gVar.b = null;
                z8gVar.c = null;
                z8gVar.d = null;
                this.b = z8gVar;
                this.c = new b9g();
                ArrayList arrayList = new ArrayList();
                km5 km5Var = km5.a;
                km5Var.getClass();
                pca pcaVar = new pca();
                pcaVar.a = null;
                pcaVar.b = arrayList;
                pcaVar.c = null;
                pcaVar.d = null;
                pcaVar.e = null;
                pcaVar.f = km5Var;
                pcaVar.g = null;
                pcaVar.h = null;
                pcaVar.i = null;
                pcaVar.j = null;
                pcaVar.k = null;
                this.d = pcaVar;
                this.e = new rca();
                this.f = new tca();
                dol dolVar = new dol();
                dolVar.a = null;
                this.g = dolVar;
                this.h = new fol();
                this.i = new fnf();
                this.j = new hnf();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List h(String str) {
        List split$default;
        if (str == null || split$default == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            String obj = StringsKt.l0((String) it.next()).toString();
            if (obj.length() == 0) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean j(ev8 ev8Var, i1d i1dVar) {
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            swf swfVar = ((ev8) objArr[i2]).a;
            if (swfVar instanceof gce) {
                i1d i1dVar2 = ((gce) swfVar).b;
                if (i1dVar2.q(ev8Var) || j(ev8Var, i1dVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static qn2 k() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? yah.a : new qn2(3);
    }

    public y8g a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        x8g x8gVar = (x8g) this.a;
        pca pcaVar = (pca) this.d;
        List list = pcaVar.b;
        String str13 = pcaVar.d;
        eol eolVar = null;
        qca qcaVar = ((str13 == null || StringsKt.R(str13)) && ((str = pcaVar.k) == null || StringsKt.R(str)) && (((str2 = pcaVar.i) == null || StringsKt.R(str2)) && (((str3 = pcaVar.a) == null || StringsKt.R(str3)) && (((str4 = pcaVar.j) == null || StringsKt.R(str4)) && (((str5 = pcaVar.e) == null || StringsKt.R(str5)) && list.isEmpty() && (((str6 = pcaVar.g) == null || StringsKt.R(str6)) && pcaVar.h == null && (((str7 = pcaVar.c) == null || StringsKt.R(str7)) && pcaVar.f.isEmpty()))))))) ? null : new qca(pcaVar.a, list, pcaVar.c, pcaVar.d, pcaVar.e, pcaVar.f, pcaVar.g, pcaVar.h, pcaVar.i, pcaVar.j, pcaVar.k);
        z8g z8gVar = (z8g) this.b;
        String str14 = z8gVar.a;
        a9g a9gVar = ((str14 == null || StringsKt.R(str14)) && ((str8 = z8gVar.b) == null || StringsKt.R(str8)) && (((str9 = z8gVar.c) == null || StringsKt.R(str9)) && ((str10 = z8gVar.d) == null || StringsKt.R(str10)))) ? null : new a9g(z8gVar.a, z8gVar.b, z8gVar.c, z8gVar.d);
        if (a9gVar == null || (((str11 = a9gVar.b) == null || StringsKt.R(str11)) && ((str12 = a9gVar.c) == null || StringsKt.R(str12)))) {
            if ((qcaVar != null ? qcaVar.e : null) != null) {
                x8gVar.d = new a9g(null, qcaVar.e, null, null);
            }
        } else {
            x8gVar.d = a9gVar;
        }
        x8gVar.h = qcaVar;
        dol dolVar = (dol) this.g;
        String str15 = dolVar.a;
        if (str15 != null && !StringsKt.R(str15)) {
            eolVar = new eol(dolVar.a);
        }
        eol eolVar2 = eolVar;
        x8gVar.i = eolVar2;
        return new y8g(x8gVar.a, x8gVar.b, x8gVar.c, x8gVar.d, x8gVar.e, x8gVar.f, x8gVar.g, x8gVar.h, eolVar2);
    }

    public void b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        rca rcaVar = (rca) this.e;
        String str28 = rcaVar.f;
        sca scaVar = ((str28 == null || StringsKt.R(str28)) && ((str = rcaVar.b) == null || StringsKt.R(str)) && (((str2 = rcaVar.e) == null || StringsKt.R(str2)) && rcaVar.g.isEmpty() && (((str3 = rcaVar.h) == null || StringsKt.R(str3)) && (((str4 = rcaVar.c) == null || StringsKt.R(str4)) && (((str5 = rcaVar.d) == null || StringsKt.R(str5)) && (((str6 = rcaVar.a) == null || StringsKt.R(str6)) && (((str7 = rcaVar.i) == null || StringsKt.R(str7)) && ((str8 = rcaVar.j) == null || StringsKt.R(str8))))))))) ? null : new sca(rcaVar.a, rcaVar.b, rcaVar.c, rcaVar.d, rcaVar.e, rcaVar.f, rcaVar.g, rcaVar.h, rcaVar.i, rcaVar.j);
        ((b9g) this.c).a((String) this.k);
        ((b9g) this.c).a(scaVar != null ? scaVar.f : null);
        b9g b9gVar = (b9g) this.c;
        b9gVar.n = scaVar;
        fol folVar = (fol) this.h;
        String str29 = folVar.a;
        b9gVar.p = ((str29 == null || StringsKt.R(str29)) && ((str9 = folVar.b) == null || StringsKt.R(str9)) && (((str10 = folVar.c) == null || StringsKt.R(str10)) && (((str11 = folVar.d) == null || StringsKt.R(str11)) && (((str12 = folVar.e) == null || StringsKt.R(str12)) && folVar.f == null && folVar.g == null)))) ? null : new gol(folVar.a, folVar.b, folVar.c, folVar.d, folVar.e, folVar.f, folVar.g);
        b9g b9gVar2 = (b9g) this.c;
        fnf fnfVar = (fnf) this.i;
        String str30 = fnfVar.a;
        b9gVar2.q = ((str30 == null || StringsKt.R(str30)) && fnfVar.b == null && ((str13 = fnfVar.c) == null || StringsKt.R(str13))) ? null : new gnf(fnfVar.a, fnfVar.c, fnfVar.b);
        b9g b9gVar3 = (b9g) this.c;
        hnf hnfVar = (hnf) this.j;
        String str31 = hnfVar.a;
        b9gVar3.r = ((str31 == null || StringsKt.R(str31)) && ((str14 = hnfVar.b) == null || StringsKt.R(str14)) && ((str15 = hnfVar.c) == null || StringsKt.R(str15))) ? null : new inf(hnfVar.a, hnfVar.b, hnfVar.c);
        b9g b9gVar4 = (b9g) this.c;
        String str32 = b9gVar4.a;
        c9g c9gVar = ((str32 == null || StringsKt.R(str32)) && ((str16 = b9gVar4.b) == null || StringsKt.R(str16)) && (((str17 = b9gVar4.c) == null || StringsKt.R(str17)) && (((str18 = b9gVar4.d) == null || StringsKt.R(str18)) && (((str19 = b9gVar4.e) == null || StringsKt.R(str19)) && (((str20 = b9gVar4.f) == null || StringsKt.R(str20)) && (((str21 = b9gVar4.g) == null || StringsKt.R(str21)) && (((str22 = b9gVar4.h) == null || StringsKt.R(str22)) && (((str23 = b9gVar4.i) == null || StringsKt.R(str23)) && (((str24 = b9gVar4.j) == null || StringsKt.R(str24)) && (((str25 = b9gVar4.k) == null || StringsKt.R(str25)) && (((str26 = b9gVar4.l) == null || StringsKt.R(str26)) && b9gVar4.m.isEmpty() && b9gVar4.n == null && (((str27 = b9gVar4.o) == null || StringsKt.R(str27)) && b9gVar4.p == null && b9gVar4.q == null && b9gVar4.r == null)))))))))))) ? null : new c9g(b9gVar4.a, b9gVar4.b, b9gVar4.c, b9gVar4.d, b9gVar4.e, b9gVar4.f, b9gVar4.g, b9gVar4.h, b9gVar4.i, b9gVar4.j, b9gVar4.k, b9gVar4.l, b9gVar4.m, b9gVar4.n, b9gVar4.o, b9gVar4.p, b9gVar4.q, b9gVar4.r);
        if (c9gVar != null) {
            ((x8g) this.a).g.add(c9gVar);
        }
        this.k = null;
        this.c = new b9g();
        this.e = new rca();
        this.h = new fol();
        this.i = new fnf();
        this.j = new hnf();
    }

    public void c(xah xahVar, float[] fArr, float f, RectF rectF, d4a d4aVar, Path path) {
        int i;
        ut3 qv2Var;
        int i2;
        Matrix[] matrixArr = (Matrix[]) this.c;
        float[] fArr2 = (float[]) this.h;
        sbh[] sbhVarArr = (sbh[]) this.a;
        Matrix[] matrixArr2 = (Matrix[]) this.b;
        path.rewind();
        Path path2 = (Path) this.e;
        path2.rewind();
        Path path3 = (Path) this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.d;
            if (fArr == null) {
                qv2Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? xahVar.f : xahVar.e : xahVar.h : xahVar.g;
            } else {
                qv2Var = new qv2(fArr[i3]);
                i4 = 1;
            }
            hz8 hz8Var = i3 != i4 ? i3 != 2 ? i3 != 3 ? xahVar.b : xahVar.a : xahVar.d : xahVar.c;
            Matrix[] matrixArr3 = matrixArr;
            sbh sbhVar = sbhVarArr[i3];
            hz8Var.getClass();
            hz8Var.J(sbhVar, f, qv2Var.a(rectF));
            int i5 = i3 + 1;
            float f2 = (i5 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            sbh sbhVar2 = sbhVarArr[i3];
            fArr2[0] = sbhVar2.c;
            fArr2[1] = sbhVar2.d;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i3].preRotate(f2);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c = 1;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            sbh sbhVar3 = sbhVarArr[i6];
            fArr2[0] = sbhVar3.a;
            fArr2[c] = sbhVar3.b;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path.moveTo(fArr2[0], fArr2[c]);
            } else {
                path.lineTo(fArr2[0], fArr2[c]);
            }
            sbhVarArr[i6].b(matrixArr2[i6], path);
            if (d4aVar != null) {
                sbh sbhVar4 = sbhVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                qzb qzbVar = (qzb) d4aVar.b;
                qzbVar.e.set(i6, sbhVar4.i);
                rbh[] rbhVarArr = qzbVar.c;
                sbhVar4.a(sbhVar4.f);
                rbhVarArr[i6] = new kbh(new ArrayList(sbhVar4.h), new Matrix(matrix));
            }
            Path path4 = (Path) this.j;
            sbh sbhVar5 = (sbh) this.g;
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            sbh sbhVar6 = sbhVarArr[i6];
            sbh[] sbhVarArr2 = sbhVarArr;
            fArr2[0] = sbhVar6.c;
            fArr2[1] = sbhVar6.d;
            matrixArr2[i6].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.i;
            sbh sbhVar7 = sbhVarArr2[i8];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = sbhVar7.a;
            fArr3[1] = sbhVar7.b;
            matrixArr5[i8].mapPoints(fArr3);
            Path path5 = path2;
            Path path6 = path3;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            sbh sbhVar8 = sbhVarArr2[i6];
            fArr2[0] = sbhVar8.c;
            fArr2[1] = sbhVar8.d;
            matrixArr5[i6].mapPoints(fArr2);
            float abs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            sbhVar5.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ug5 ug5Var = i6 != 1 ? i6 != 2 ? i6 != 3 ? xahVar.j : xahVar.i : xahVar.l : xahVar.k;
            ug5Var.o(max, abs, f, sbhVar5);
            path4.reset();
            sbhVar5.b(matrixArr4[i6], path4);
            if (ug5Var.j() || l(path4, i6) || l(path4, i8)) {
                path3 = path6;
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = sbhVar5.a;
                c = 1;
                fArr2[1] = sbhVar5.b;
                matrixArr4[i6].mapPoints(fArr2);
                path2 = path5;
                path2.moveTo(fArr2[0], fArr2[1]);
                sbhVar5.b(matrixArr4[i6], path2);
            } else {
                sbhVar5.b(matrixArr4[i6], path);
                path2 = path5;
                path3 = path6;
                c = 1;
            }
            if (d4aVar != null) {
                Matrix matrix2 = matrixArr4[i6];
                qzb qzbVar2 = (qzb) d4aVar.b;
                qzbVar2.e.set(i6 + 4, sbhVar5.i);
                rbh[] rbhVarArr2 = qzbVar2.d;
                sbhVar5.a(sbhVar5.f);
                rbhVarArr2[i6] = new kbh(new ArrayList(sbhVar5.h), new Matrix(matrix2));
            }
            i6 = i7;
            sbhVarArr = sbhVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public void d() {
        this.a = null;
        this.b = null;
        i1d i1dVar = (i1d) this.c;
        i1dVar.n();
        ((y0d) this.d).b();
        this.e = i1dVar;
        ((i1d) this.f).n();
        ((i1d) this.g).n();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public void e() {
        Set set = (Set) this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                swf swfVar = (swf) it.next();
                it.remove();
                swfVar.b();
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public void f() {
        i1d i1dVar = (i1d) this.c;
        i1d i1dVar2 = (i1d) this.f;
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        int i = 25;
        if (i1dVar2.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                y0d y0dVar = (y0d) this.h;
                int i2 = i1dVar2.c;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = i1dVar2.a[i2];
                    try {
                        if (obj instanceof ev8) {
                            swf swfVar = ((ev8) obj).a;
                            set.remove(swfVar);
                            swfVar.d();
                        }
                        if (obj instanceof qe3) {
                            if (y0dVar == null || !y0dVar.c(obj)) {
                                ((qe3) obj).a();
                            } else {
                                ((qe3) obj).f();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        pg3 pg3Var = (pg3) this.b;
                        if (pg3Var != null) {
                            u6h.W(th, new ix1(i, (qg3) pg3Var, obj));
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.a;
            } finally {
            }
        }
        if (i1dVar.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.a;
                if (set2 != null) {
                    Object[] objArr = i1dVar.a;
                    int i3 = i1dVar.c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ev8 ev8Var = (ev8) objArr[i4];
                        swf swfVar2 = ev8Var.a;
                        set2.remove(swfVar2);
                        try {
                            swfVar2.a();
                            Unit unit3 = Unit.a;
                        } catch (Throwable th2) {
                            pg3 pg3Var2 = (pg3) this.b;
                            if (pg3Var2 != null) {
                                u6h.W(th2, new ix1(i, (qg3) pg3Var2, ev8Var));
                            }
                            throw th2;
                        }
                    }
                }
                Unit unit4 = Unit.a;
            } finally {
            }
        }
    }

    public void g() {
        i1d i1dVar = (i1d) this.g;
        if (i1dVar.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = i1dVar.a;
                int i = i1dVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                i1dVar.n();
                Unit unit = Unit.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public void i(ev8 ev8Var) {
        i1d i1dVar = (i1d) this.c;
        if (!((y0d) this.d).c(ev8Var)) {
            y0d y0dVar = (y0d) this.k;
            if (y0dVar == null || !y0dVar.c(ev8Var)) {
                ((i1d) this.f).b(ev8Var);
                return;
            }
            return;
        }
        ((y0d) this.d).l(ev8Var);
        if (!((i1d) this.e).q(ev8Var) && !i1dVar.q(ev8Var)) {
            j(ev8Var, i1dVar);
        }
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        set.add(ev8Var.a);
    }

    public boolean l(Path path, int i) {
        Path path2 = (Path) this.k;
        path2.reset();
        ((sbh[]) this.a)[i].b(((Matrix[]) this.b)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void m(Set set, qg3 qg3Var) {
        d();
        this.a = set;
        this.b = qg3Var;
    }

    public void n(String str) {
        String r;
        txb b;
        if (str != null) {
            try {
                r = c.r(c.r(c.r(c.r(c.r(str, "&amp;amp;", "&amp;", false), "&amp;", U3.j.c, false), "&quot;", "\"", false), "&lt;", "<", false), "&gt;", ">", false);
            } catch (Throwable unused) {
                return;
            }
        } else {
            r = null;
        }
        Set b2 = w9h.b(uuf.IGNORE_CASE);
        b2.getClass();
        quf qufVar = Regex.b;
        Iterator it = b2.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((uuf) it.next()).a;
        }
        qufVar.getClass();
        if ((i & 2) != 0) {
            i |= 64;
        }
        Pattern compile = Pattern.compile("https?://[^\\s<>\"']+\\.(?:jpg|jpeg|png|gif|bmp|webp)(?:\\?[^\\s<>\"']*)?", i);
        compile.getClass();
        Regex regex = new Regex(compile);
        if (r == null || (b = regex.b(r)) == null) {
            return;
        }
        String obj = StringsKt.l0(b.getValue()).toString();
        if (StringsKt.J(obj, "https://s.w.org/images/core/emoji", false) || StringsKt.J(obj, "/smilies/", false)) {
            return;
        }
        this.k = obj;
    }
}
