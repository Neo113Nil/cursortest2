package defpackage;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.unity3d.services.UnityAdsConstants;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xdj extends p41 {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final ska J;
    public final ska K;
    public final HashMap L;
    public final nkb M;
    public final ArrayList N;
    public final ArrayList O;
    public final x13 P;
    public final gmb Q;
    public final plb R;
    public final int S;
    public final x13 T;
    public gkk U;
    public final x13 V;
    public gkk W;
    public final z78 X;
    public gkk Y;
    public final z78 Z;
    public gkk a0;
    public final x13 b0;
    public gkk c0;
    public gkk d0;
    public final x13 e0;
    public final x13 f0;
    public final x13 g0;

    public xdj(gmb gmbVar, mla mlaVar) {
        super(gmbVar, mlaVar);
        mbd mbdVar;
        mbd mbdVar2;
        r50 r50Var;
        mbd mbdVar3;
        r50 r50Var2;
        mbd mbdVar4;
        r50 r50Var3;
        p03 p03Var;
        r50 r50Var4;
        p03 p03Var2;
        s50 s50Var;
        p03 p03Var3;
        s50 s50Var2;
        p03 p03Var4;
        r50 r50Var5;
        p03 p03Var5;
        r50 r50Var6;
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        ska skaVar = new ska(1, 1);
        skaVar.setStyle(Paint.Style.FILL);
        this.J = skaVar;
        ska skaVar2 = new ska(1, 2);
        skaVar2.setStyle(Paint.Style.STROKE);
        this.K = skaVar2;
        this.L = new HashMap();
        this.M = new nkb((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = gmbVar;
        this.R = mlaVar.b;
        x13 x13Var = new x13((List) mlaVar.q.b, 2);
        this.P = x13Var;
        x13Var.a(this);
        f(x13Var);
        f4a f4aVar = mlaVar.r;
        if (f4aVar != null && (p03Var5 = (p03) f4aVar.b) != null && (r50Var6 = (r50) p03Var5.b) != null) {
            o41 g = r50Var6.g();
            this.T = (x13) g;
            g.a(this);
            f(g);
        }
        if (f4aVar != null && (p03Var4 = (p03) f4aVar.b) != null && (r50Var5 = (r50) p03Var4.c) != null) {
            o41 g2 = r50Var5.g();
            this.V = (x13) g2;
            g2.a(this);
            f(g2);
        }
        if (f4aVar != null && (p03Var3 = (p03) f4aVar.b) != null && (s50Var2 = (s50) p03Var3.d) != null) {
            z78 g3 = s50Var2.g();
            this.X = g3;
            g3.a(this);
            f(g3);
        }
        if (f4aVar != null && (p03Var2 = (p03) f4aVar.b) != null && (s50Var = (s50) p03Var2.e) != null) {
            z78 g4 = s50Var.g();
            this.Z = g4;
            g4.a(this);
            f(g4);
        }
        if (f4aVar != null && (p03Var = (p03) f4aVar.b) != null && (r50Var4 = (r50) p03Var.f) != null) {
            o41 g5 = r50Var4.g();
            this.b0 = (x13) g5;
            g5.a(this);
            f(g5);
        }
        if (f4aVar != null && (mbdVar4 = (mbd) f4aVar.c) != null && (r50Var3 = (r50) mbdVar4.c) != null) {
            o41 g6 = r50Var3.g();
            this.e0 = (x13) g6;
            g6.a(this);
            f(g6);
        }
        if (f4aVar != null && (mbdVar3 = (mbd) f4aVar.c) != null && (r50Var2 = (r50) mbdVar3.d) != null) {
            o41 g7 = r50Var2.g();
            this.f0 = (x13) g7;
            g7.a(this);
            f(g7);
        }
        if (f4aVar != null && (mbdVar2 = (mbd) f4aVar.c) != null && (r50Var = (r50) mbdVar2.e) != null) {
            o41 g8 = r50Var.g();
            this.g0 = (x13) g8;
            g8.a(this);
            f(g8);
        }
        if (f4aVar == null || (mbdVar = (mbd) f4aVar.c) == null) {
            return;
        }
        this.S = mbdVar.b;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawText(str, 0, str.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.p41, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        PointF pointF = nmb.a;
        if (obj == 1) {
            gkk gkkVar = this.U;
            if (gkkVar != null) {
                o(gkkVar);
            }
            if (wj9Var == null) {
                this.U = null;
                return;
            }
            gkk gkkVar2 = new gkk(wj9Var, null);
            this.U = gkkVar2;
            gkkVar2.a(this);
            f(this.U);
            return;
        }
        if (obj == 2) {
            gkk gkkVar3 = this.W;
            if (gkkVar3 != null) {
                o(gkkVar3);
            }
            if (wj9Var == null) {
                this.W = null;
                return;
            }
            gkk gkkVar4 = new gkk(wj9Var, null);
            this.W = gkkVar4;
            gkkVar4.a(this);
            f(this.W);
            return;
        }
        if (obj == nmb.q) {
            gkk gkkVar5 = this.Y;
            if (gkkVar5 != null) {
                o(gkkVar5);
            }
            if (wj9Var == null) {
                this.Y = null;
                return;
            }
            gkk gkkVar6 = new gkk(wj9Var, null);
            this.Y = gkkVar6;
            gkkVar6.a(this);
            f(this.Y);
            return;
        }
        if (obj == nmb.r) {
            gkk gkkVar7 = this.a0;
            if (gkkVar7 != null) {
                o(gkkVar7);
            }
            if (wj9Var == null) {
                this.a0 = null;
                return;
            }
            gkk gkkVar8 = new gkk(wj9Var, null);
            this.a0 = gkkVar8;
            gkkVar8.a(this);
            f(this.a0);
            return;
        }
        if (obj == nmb.D) {
            gkk gkkVar9 = this.c0;
            if (gkkVar9 != null) {
                o(gkkVar9);
            }
            if (wj9Var == null) {
                this.c0 = null;
                return;
            }
            gkk gkkVar10 = new gkk(wj9Var, null);
            this.c0 = gkkVar10;
            gkkVar10.a(this);
            f(this.c0);
            return;
        }
        if (obj != nmb.K) {
            if (obj == nmb.M) {
                x13 x13Var = this.P;
                x13Var.getClass();
                x13Var.j(new kdj(new kmb(), wj9Var, new q65()));
                return;
            }
            return;
        }
        gkk gkkVar11 = this.d0;
        if (gkkVar11 != null) {
            o(gkkVar11);
        }
        if (wj9Var == null) {
            this.d0 = null;
            return;
        }
        gkk gkkVar12 = new gkk(wj9Var, null);
        this.d0 = gkkVar12;
        gkkVar12.a(this);
        f(this.d0);
    }

    @Override // defpackage.p41, defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        plb plbVar = this.R;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, plbVar.k.width(), plbVar.k.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x052f, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03fd  */
    @Override // defpackage.p41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        int i2;
        p03 p03Var;
        String str;
        Typeface typeface;
        float floatValue;
        int size;
        int i3;
        List list;
        int i4;
        of8 of8Var;
        float f;
        List list2;
        int i5;
        Bidi bidi;
        Canvas canvas2;
        float floatValue2;
        int i6;
        List list3;
        String str2;
        int i7;
        int i8;
        int i9;
        gmb gmbVar;
        List list4;
        ska skaVar;
        ska skaVar2;
        ska skaVar3;
        ska skaVar4;
        q65 q65Var = (q65) this.P.e();
        plb plbVar = this.R;
        of8 of8Var2 = (of8) plbVar.f.get(q65Var.b);
        if (of8Var2 == null) {
            return;
        }
        String str3 = of8Var2.c;
        String str4 = of8Var2.a;
        canvas.save();
        canvas.concat(matrix);
        t(q65Var, i, 0);
        gmb gmbVar2 = this.Q;
        Map map = gmbVar2.j;
        z78 z78Var = this.Z;
        int i10 = 0;
        ska skaVar5 = this.J;
        ska skaVar6 = this.K;
        if (map == null) {
            i2 = 2;
            if (gmbVar2.a.h.e() > 0) {
                gkk gkkVar = this.c0;
                float floatValue3 = gkkVar != null ? ((Float) gkkVar.e()).floatValue() : q65Var.c;
                Object obj = vik.e.get();
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float[] fArr = (float[]) obj;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f3 = vik.f;
                fArr[2] = f3;
                fArr[3] = f3;
                float f4 = floatValue3 / 100.0f;
                matrix.mapPoints(fArr);
                ska skaVar7 = skaVar5;
                gmb gmbVar3 = gmbVar2;
                plb plbVar2 = plbVar;
                String str5 = str3;
                Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
                List asList = Arrays.asList(q65Var.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size2 = asList.size();
                float f5 = q65Var.e / 10.0f;
                gkk gkkVar2 = this.a0;
                if (gkkVar2 == null) {
                    if (z78Var != null) {
                        floatValue2 = ((Float) z78Var.e()).floatValue();
                    }
                    float f6 = f5;
                    i6 = 0;
                    int i11 = -1;
                    while (i6 < size2) {
                        String str6 = (String) asList.get(i6);
                        PointF pointF = q65Var.m;
                        float f7 = f4;
                        List z = z(str6, pointF == null ? f2 : pointF.x, of8Var2, f7, f6, true);
                        int i12 = i10;
                        while (i12 < z.size()) {
                            wdj wdjVar = (wdj) z.get(i12);
                            i11++;
                            canvas.save();
                            if (y(canvas, q65Var, i11, wdjVar.b)) {
                                String str7 = wdjVar.a;
                                list3 = z;
                                int i13 = i10;
                                while (i13 < str7.length()) {
                                    List list5 = asList;
                                    String str8 = str5;
                                    int a = qf8.a(str7.charAt(i13), str4, str8);
                                    int i14 = i12;
                                    float f8 = f6;
                                    plb plbVar3 = plbVar2;
                                    zwh zwhVar = plbVar3.h;
                                    zwhVar.getClass();
                                    qf8 qf8Var = (qf8) gz8.C(zwhVar, a);
                                    if (qf8Var == null) {
                                        plbVar2 = plbVar3;
                                        str2 = str7;
                                        i7 = size2;
                                        i8 = i6;
                                        i9 = i13;
                                        skaVar = skaVar6;
                                        gmbVar = gmbVar3;
                                        skaVar2 = skaVar7;
                                    } else {
                                        t(q65Var, i, i13);
                                        HashMap hashMap = this.L;
                                        if (hashMap.containsKey(qf8Var)) {
                                            list4 = (List) hashMap.get(qf8Var);
                                            str2 = str7;
                                            i7 = size2;
                                            i8 = i6;
                                            i9 = i13;
                                            gmbVar = gmbVar3;
                                        } else {
                                            str2 = str7;
                                            ArrayList arrayList = qf8Var.a;
                                            i7 = size2;
                                            int size3 = arrayList.size();
                                            i8 = i6;
                                            ArrayList arrayList2 = new ArrayList(size3);
                                            i9 = i13;
                                            int i15 = i10;
                                            while (i15 < size3) {
                                                arrayList2.add(new so3(gmbVar3, this, (fbh) arrayList.get(i15), plbVar3));
                                                size3 = size3;
                                                i15++;
                                                arrayList = arrayList;
                                            }
                                            gmbVar = gmbVar3;
                                            hashMap.put(qf8Var, arrayList2);
                                            list4 = arrayList2;
                                        }
                                        int i16 = i10;
                                        while (i16 < list4.size()) {
                                            Path n = ((so3) list4.get(i16)).n();
                                            plb plbVar4 = plbVar3;
                                            n.computeBounds(this.H, i10);
                                            Matrix matrix2 = this.I;
                                            matrix2.reset();
                                            List list6 = list4;
                                            matrix2.preTranslate(f2, (-q65Var.g) * vik.c());
                                            matrix2.preScale(f7, f7);
                                            n.transform(matrix2);
                                            if (q65Var.k) {
                                                skaVar4 = skaVar7;
                                                v(n, skaVar4, canvas);
                                                skaVar3 = skaVar6;
                                                v(n, skaVar3, canvas);
                                            } else {
                                                skaVar3 = skaVar6;
                                                skaVar4 = skaVar7;
                                                v(n, skaVar3, canvas);
                                                v(n, skaVar4, canvas);
                                            }
                                            i16++;
                                            skaVar6 = skaVar3;
                                            skaVar7 = skaVar4;
                                            list4 = list6;
                                            plbVar3 = plbVar4;
                                            i10 = 0;
                                            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        }
                                        plbVar2 = plbVar3;
                                        skaVar = skaVar6;
                                        skaVar2 = skaVar7;
                                        canvas.translate((vik.c() * ((float) qf8Var.c) * f7) + f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                    f6 = f8;
                                    skaVar6 = skaVar;
                                    str5 = str8;
                                    skaVar7 = skaVar2;
                                    gmbVar3 = gmbVar;
                                    i12 = i14;
                                    asList = list5;
                                    str7 = str2;
                                    i6 = i8;
                                    size2 = i7;
                                    i10 = 0;
                                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    i13 = i9 + 1;
                                }
                            } else {
                                list3 = z;
                            }
                            int i17 = i12;
                            float f9 = f6;
                            List list7 = asList;
                            int i18 = size2;
                            int i19 = i6;
                            ska skaVar8 = skaVar6;
                            gmb gmbVar4 = gmbVar3;
                            ska skaVar9 = skaVar7;
                            String str9 = str5;
                            canvas.restore();
                            f6 = f9;
                            skaVar6 = skaVar8;
                            str5 = str9;
                            skaVar7 = skaVar9;
                            gmbVar3 = gmbVar4;
                            asList = list7;
                            i6 = i19;
                            size2 = i18;
                            i10 = 0;
                            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            i12 = i17 + 1;
                            z = list3;
                        }
                        f4 = f7;
                        asList = asList;
                        i10 = 0;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i6++;
                    }
                    canvas2 = canvas;
                    canvas2.restore();
                }
                floatValue2 = ((Float) gkkVar2.e()).floatValue();
                f5 += floatValue2;
                float f62 = f5;
                i6 = 0;
                int i112 = -1;
                while (i6 < size2) {
                }
                canvas2 = canvas;
                canvas2.restore();
            }
        } else {
            i2 = 2;
        }
        gkk gkkVar3 = this.d0;
        if (gkkVar3 == null || (typeface = (Typeface) gkkVar3.e()) == null) {
            Map map2 = gmbVar2.j;
            if (map2 != null) {
                if (map2.containsKey(str4)) {
                    typeface = (Typeface) map2.get(str4);
                } else {
                    String str10 = of8Var2.b;
                    if (map2.containsKey(str10)) {
                        typeface = (Typeface) map2.get(str10);
                    } else {
                        String i20 = wv8.i(str4, "-", str3);
                        if (map2.containsKey(i20)) {
                            typeface = (Typeface) map2.get(i20);
                        }
                    }
                }
                str = "\n";
                if (typeface == null) {
                    typeface = of8Var2.d;
                }
            }
            if (gmbVar2.getCallback() == null) {
                p03Var = null;
            } else {
                p03Var = gmbVar2.i;
                if (p03Var == null) {
                    p03Var = new p03(gmbVar2.getCallback());
                    gmbVar2.i = p03Var;
                    String str11 = gmbVar2.k;
                    if (str11 != null) {
                        p03Var.e = str11;
                    }
                }
            }
            if (p03Var != null) {
                tm0 tm0Var = (tm0) p03Var.b;
                tm0Var.b = str4;
                tm0Var.c = str3;
                HashMap hashMap2 = (HashMap) p03Var.f;
                Typeface typeface2 = (Typeface) hashMap2.get(tm0Var);
                if (typeface2 != null) {
                    typeface = typeface2;
                    str = "\n";
                } else {
                    HashMap hashMap3 = (HashMap) p03Var.c;
                    Typeface typeface3 = (Typeface) hashMap3.get(str4);
                    if (typeface3 != null) {
                        typeface = typeface3;
                        str = "\n";
                    } else {
                        Typeface typeface4 = of8Var2.d;
                        if (typeface4 != null) {
                            str = "\n";
                            typeface = typeface4;
                        } else {
                            StringBuilder r = mz1.r("fonts/", str4);
                            str = "\n";
                            r.append((String) p03Var.e);
                            typeface = Typeface.createFromAsset((AssetManager) p03Var.d, r.toString());
                            hashMap3.put(str4, typeface);
                        }
                    }
                    boolean contains = str3.contains("Italic");
                    boolean contains2 = str3.contains("Bold");
                    int i21 = (contains && contains2) ? 3 : contains ? i2 : contains2 ? 1 : 0;
                    if (typeface.getStyle() != i21) {
                        typeface = Typeface.create(typeface, i21);
                    }
                    hashMap2.put(tm0Var, typeface);
                }
            } else {
                str = "\n";
                typeface = null;
            }
            if (typeface == null) {
            }
        } else {
            str = "\n";
        }
        if (typeface != null) {
            String str12 = q65Var.a;
            skaVar5.setTypeface(typeface);
            gkk gkkVar4 = this.c0;
            float floatValue4 = gkkVar4 != null ? ((Float) gkkVar4.e()).floatValue() : q65Var.c;
            skaVar5.setTextSize(vik.c() * floatValue4);
            skaVar6.setTypeface(skaVar5.getTypeface());
            skaVar6.setTextSize(skaVar5.getTextSize());
            float f10 = q65Var.e / 10.0f;
            gkk gkkVar5 = this.a0;
            if (gkkVar5 != null) {
                floatValue = ((Float) gkkVar5.e()).floatValue();
            } else {
                if (z78Var != null) {
                    floatValue = ((Float) z78Var.e()).floatValue();
                }
                float c = ((vik.c() * f10) * floatValue4) / 100.0f;
                List asList2 = Arrays.asList(str12.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                size = asList2.size();
                i3 = 0;
                int i22 = 0;
                int i23 = -1;
                while (i3 < size) {
                    String str13 = (String) asList2.get(i3);
                    PointF pointF2 = q65Var.m;
                    float f11 = c;
                    int i24 = i2;
                    int i25 = 0;
                    for (List z2 = z(str13, pointF2 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : pointF2.x, of8Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, false); i25 < z2.size(); z2 = list) {
                        wdj wdjVar2 = (wdj) z2.get(i25);
                        i23++;
                        canvas.save();
                        if (y(canvas, q65Var, i23, skaVar5.measureText(wdjVar2.a))) {
                            String str14 = wdjVar2.a;
                            list = z2;
                            i4 = i25;
                            of8Var = of8Var2;
                            if (Bidi.requiresBidi(str14.toCharArray(), 0, str14.length())) {
                                Bidi bidi2 = new Bidi(str14, -2);
                                int runCount = bidi2.getRunCount();
                                byte[] bArr = new byte[runCount];
                                f = f11;
                                Integer[] numArr = new Integer[runCount];
                                list2 = asList2;
                                int i26 = 0;
                                while (i26 < runCount) {
                                    bArr[i26] = (byte) bidi2.getRunLevel(i26);
                                    numArr[i26] = Integer.valueOf(i26);
                                    i26++;
                                    size = size;
                                }
                                i5 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                StringBuilder sb = this.F;
                                sb.setLength(0);
                                int i27 = 0;
                                while (i27 < runCount) {
                                    int intValue = numArr[i27].intValue();
                                    int i28 = runCount;
                                    int runStart = bidi2.getRunStart(intValue);
                                    Integer[] numArr2 = numArr;
                                    int runLimit = bidi2.getRunLimit(intValue);
                                    int runLevel = bidi2.getRunLevel(intValue);
                                    String substring = str14.substring(runStart, runLimit);
                                    if ((runLevel & 1) == 0) {
                                        sb.append(substring);
                                        bidi = bidi2;
                                    } else {
                                        StringBuilder sb2 = this.G;
                                        int i29 = 0;
                                        sb2.setLength(0);
                                        bidi = bidi2;
                                        while (i29 < substring.length()) {
                                            String s = s(i29, substring);
                                            sb2.insert(0, s);
                                            i29 += s.length();
                                            substring = substring;
                                        }
                                        sb.append((CharSequence) sb2);
                                    }
                                    i27++;
                                    runCount = i28;
                                    numArr = numArr2;
                                    bidi2 = bidi;
                                }
                                str14 = sb.toString();
                            } else {
                                f = f11;
                                list2 = asList2;
                                i5 = size;
                            }
                            ArrayList arrayList3 = this.N;
                            arrayList3.clear();
                            int i30 = 0;
                            while (i30 < str14.length()) {
                                String s2 = s(i30, str14);
                                arrayList3.add(s2);
                                i30 += s2.length();
                            }
                            int i31 = 0;
                            while (i31 < arrayList3.size()) {
                                StringBuilder sb3 = this.E;
                                sb3.setLength(0);
                                sb3.append((String) arrayList3.get(i31));
                                int i32 = i31 + 1;
                                while (i32 < arrayList3.size()) {
                                    String str15 = (String) arrayList3.get(i32);
                                    int i33 = 0;
                                    while (i33 < str15.length()) {
                                        ArrayList arrayList4 = arrayList3;
                                        if (Character.getDirectionality(str15.codePointAt(i33)) == 2) {
                                            break;
                                        }
                                        i33++;
                                        arrayList3 = arrayList4;
                                    }
                                }
                                ArrayList arrayList5 = arrayList3;
                                String sb4 = sb3.toString();
                                t(q65Var, i, i31 + i22);
                                if (q65Var.k) {
                                    u(sb4, skaVar5, canvas);
                                    u(sb4, skaVar6, canvas);
                                } else {
                                    u(sb4, skaVar6, canvas);
                                    u(sb4, skaVar5, canvas);
                                }
                                canvas.translate(skaVar5.measureText(sb4) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                i31 = i32;
                                arrayList3 = arrayList5;
                            }
                        } else {
                            list = z2;
                            i4 = i25;
                            of8Var = of8Var2;
                            f = f11;
                            list2 = asList2;
                            i5 = size;
                        }
                        i22 += wdjVar2.a.length();
                        canvas.restore();
                        i25 = i4 + 1;
                        of8Var2 = of8Var;
                        i24 = 2;
                        f11 = f;
                        asList2 = list2;
                        size = i5;
                    }
                    i3++;
                    of8Var2 = of8Var2;
                    i2 = i24;
                    c = f11;
                    size = size;
                }
            }
            f10 += floatValue;
            float c2 = ((vik.c() * f10) * floatValue4) / 100.0f;
            List asList22 = Arrays.asList(str12.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
            size = asList22.size();
            i3 = 0;
            int i222 = 0;
            int i232 = -1;
            while (i3 < size) {
            }
        }
        canvas2 = canvas;
        canvas2.restore();
    }

    public final String s(int i, String str) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        nkb nkbVar = this.M;
        if (nkbVar.b(j)) {
            return (String) nkbVar.c(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = sb.toString();
        nkbVar.g(sb2, j);
        return sb2;
    }

    public final void t(q65 q65Var, int i, int i2) {
        gkk gkkVar = this.U;
        ska skaVar = this.J;
        if (gkkVar != null) {
            skaVar.setColor(((Integer) gkkVar.e()).intValue());
        } else {
            x13 x13Var = this.T;
            if (x13Var == null || !x(i2)) {
                skaVar.setColor(q65Var.h);
            } else {
                skaVar.setColor(((Integer) x13Var.e()).intValue());
            }
        }
        gkk gkkVar2 = this.W;
        ska skaVar2 = this.K;
        if (gkkVar2 != null) {
            skaVar2.setColor(((Integer) gkkVar2.e()).intValue());
        } else {
            x13 x13Var2 = this.V;
            if (x13Var2 == null || !x(i2)) {
                skaVar2.setColor(q65Var.i);
            } else {
                skaVar2.setColor(((Integer) x13Var2.e()).intValue());
            }
        }
        o41 o41Var = this.w.p;
        int i3 = 100;
        int intValue = o41Var == null ? 100 : ((Integer) o41Var.e()).intValue();
        x13 x13Var3 = this.b0;
        if (x13Var3 != null && x(i2)) {
            i3 = ((Integer) x13Var3.e()).intValue();
        }
        int round = Math.round((((i3 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        skaVar.setAlpha(round);
        skaVar2.setAlpha(round);
        gkk gkkVar3 = this.Y;
        if (gkkVar3 != null) {
            skaVar2.setStrokeWidth(((Float) gkkVar3.e()).floatValue());
            return;
        }
        z78 z78Var = this.X;
        if (z78Var == null || !x(i2)) {
            skaVar2.setStrokeWidth(vik.c() * q65Var.j);
        } else {
            skaVar2.setStrokeWidth(((Float) z78Var.e()).floatValue());
        }
    }

    public final wdj w(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            wdj wdjVar = new wdj();
            wdjVar.a = "";
            wdjVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            arrayList.add(wdjVar);
        }
        return (wdj) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        x13 x13Var;
        int length = ((q65) this.P.e()).a.length();
        x13 x13Var2 = this.e0;
        if (x13Var2 == null || (x13Var = this.f0) == null) {
            return true;
        }
        int min = Math.min(((Integer) x13Var2.e()).intValue(), ((Integer) x13Var.e()).intValue());
        int max = Math.max(((Integer) x13Var2.e()).intValue(), ((Integer) x13Var.e()).intValue());
        x13 x13Var3 = this.g0;
        if (x13Var3 != null) {
            int intValue = ((Integer) x13Var3.e()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.S == 2) {
            return i >= min && i < max;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) min) && f < ((float) max);
    }

    public final boolean y(Canvas canvas, q65 q65Var, int i, float f) {
        PointF pointF = q65Var.l;
        PointF pointF2 = q65Var.m;
        float c = vik.c();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = (i * q65Var.f * c) + (pointF == null ? 0.0f : (q65Var.f * c) + pointF.y);
        if (this.Q.u && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + q65Var.c) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int C = wt3.C(q65Var.d);
        if (C == 0) {
            canvas.translate(f4, f3);
            return true;
        }
        if (C == 1) {
            canvas.translate((f4 + f2) - f, f3);
            return true;
        }
        if (C != 2) {
            return true;
        }
        canvas.translate(((f2 / 2.0f) + f4) - (f / 2.0f), f3);
        return true;
    }

    public final List z(String str, float f, of8 of8Var, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                int a = qf8.a(charAt, of8Var.a, of8Var.c);
                zwh zwhVar = this.R.h;
                zwhVar.getClass();
                qf8 qf8Var = (qf8) gz8.C(zwhVar, a);
                if (qf8Var != null) {
                    measureText = (vik.c() * ((float) qf8Var.c) * f2) + f3;
                }
            } else {
                measureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = measureText;
            } else {
                f5 += measureText;
            }
            f4 += measureText;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= f && charAt != ' ') {
                i++;
                wdj w = w(i);
                if (i3 == i2) {
                    w.a = str.substring(i2, i4).trim();
                    w.b = (f4 - measureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = measureText;
                    f5 = f4;
                } else {
                    w.a = str.substring(i2, i3 - 1).trim();
                    w.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i++;
            wdj w2 = w(i);
            w2.a = str.substring(i2);
            w2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
