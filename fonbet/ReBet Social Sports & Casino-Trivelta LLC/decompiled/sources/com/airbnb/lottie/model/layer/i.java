package com.airbnb.lottie.model.layer;

import B3.o;
import B3.t;
import E3.b;
import F3.k;
import F3.l;
import F3.m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.b0;
import com.airbnb.lottie.model.content.q;
import com.airbnb.lottie.model.content.u;
import com.airbnb.lottie.utils.z;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z.C6907h;

/* loaded from: classes.dex */
public class i extends com.airbnb.lottie.model.layer.b {

    /* renamed from: E, reason: collision with root package name */
    public final StringBuilder f28951E;

    /* renamed from: F, reason: collision with root package name */
    public final StringBuilder f28952F;

    /* renamed from: G, reason: collision with root package name */
    public final StringBuilder f28953G;

    /* renamed from: H, reason: collision with root package name */
    public final StringBuilder f28954H;

    /* renamed from: I, reason: collision with root package name */
    public final RectF f28955I;

    /* renamed from: J, reason: collision with root package name */
    public final Matrix f28956J;

    /* renamed from: K, reason: collision with root package name */
    public final Paint f28957K;

    /* renamed from: L, reason: collision with root package name */
    public final Paint f28958L;

    /* renamed from: M, reason: collision with root package name */
    public final Map f28959M;

    /* renamed from: N, reason: collision with root package name */
    public final C6907h f28960N;

    /* renamed from: O, reason: collision with root package name */
    public final List f28961O;

    /* renamed from: P, reason: collision with root package name */
    public final List f28962P;

    /* renamed from: Q, reason: collision with root package name */
    public final o f28963Q;

    /* renamed from: R, reason: collision with root package name */
    public final K f28964R;

    /* renamed from: S, reason: collision with root package name */
    public final C2940j f28965S;

    /* renamed from: T, reason: collision with root package name */
    public u f28966T;

    /* renamed from: U, reason: collision with root package name */
    public B3.a f28967U;

    /* renamed from: V, reason: collision with root package name */
    public B3.a f28968V;

    /* renamed from: W, reason: collision with root package name */
    public B3.a f28969W;

    /* renamed from: X, reason: collision with root package name */
    public B3.a f28970X;

    /* renamed from: Y, reason: collision with root package name */
    public B3.a f28971Y;

    /* renamed from: Z, reason: collision with root package name */
    public B3.a f28972Z;

    /* renamed from: a0, reason: collision with root package name */
    public B3.a f28973a0;

    /* renamed from: b0, reason: collision with root package name */
    public B3.a f28974b0;

    /* renamed from: c0, reason: collision with root package name */
    public B3.a f28975c0;

    /* renamed from: d0, reason: collision with root package name */
    public B3.a f28976d0;

    /* renamed from: e0, reason: collision with root package name */
    public B3.a f28977e0;

    /* renamed from: f0, reason: collision with root package name */
    public B3.a f28978f0;

    /* renamed from: g0, reason: collision with root package name */
    public B3.a f28979g0;

    /* renamed from: h0, reason: collision with root package name */
    public B3.a f28980h0;

    public class a extends Paint {
        public a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        static {
            int[] iArr = new int[b.a.values().length];
            $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(K k10, e eVar) {
        super(k10, eVar);
        l lVar;
        l lVar2;
        F3.d dVar;
        l lVar3;
        F3.d dVar2;
        l lVar4;
        F3.d dVar3;
        m mVar;
        F3.d dVar4;
        m mVar2;
        F3.b bVar;
        m mVar3;
        F3.b bVar2;
        m mVar4;
        F3.a aVar;
        m mVar5;
        F3.a aVar2;
        this.f28951E = new StringBuilder(2);
        this.f28952F = new StringBuilder(0);
        this.f28953G = new StringBuilder(0);
        this.f28954H = new StringBuilder(0);
        this.f28955I = new RectF();
        this.f28956J = new Matrix();
        this.f28957K = new a(1);
        this.f28958L = new b(1);
        this.f28959M = new HashMap();
        this.f28960N = new C6907h();
        this.f28961O = new ArrayList();
        this.f28962P = new ArrayList();
        this.f28966T = u.INDEX;
        this.f28964R = k10;
        this.f28965S = eVar.c();
        o a10 = eVar.t().a();
        this.f28963Q = a10;
        a10.a(this);
        j(a10);
        k u10 = eVar.u();
        if (u10 != null && (mVar5 = u10.f3531a) != null && (aVar2 = mVar5.f3537a) != null) {
            B3.a a11 = aVar2.a();
            this.f28967U = a11;
            a11.a(this);
            j(this.f28967U);
        }
        if (u10 != null && (mVar4 = u10.f3531a) != null && (aVar = mVar4.f3538b) != null) {
            B3.a a12 = aVar.a();
            this.f28969W = a12;
            a12.a(this);
            j(this.f28969W);
        }
        if (u10 != null && (mVar3 = u10.f3531a) != null && (bVar2 = mVar3.f3539c) != null) {
            B3.d a13 = bVar2.a();
            this.f28971Y = a13;
            a13.a(this);
            j(this.f28971Y);
        }
        if (u10 != null && (mVar2 = u10.f3531a) != null && (bVar = mVar2.f3540d) != null) {
            B3.d a14 = bVar.a();
            this.f28973a0 = a14;
            a14.a(this);
            j(this.f28973a0);
        }
        if (u10 != null && (mVar = u10.f3531a) != null && (dVar4 = mVar.f3541e) != null) {
            B3.a a15 = dVar4.a();
            this.f28975c0 = a15;
            a15.a(this);
            j(this.f28975c0);
        }
        if (u10 != null && (lVar4 = u10.f3532b) != null && (dVar3 = lVar4.f3533a) != null) {
            B3.a a16 = dVar3.a();
            this.f28978f0 = a16;
            a16.a(this);
            j(this.f28978f0);
        }
        if (u10 != null && (lVar3 = u10.f3532b) != null && (dVar2 = lVar3.f3534b) != null) {
            B3.a a17 = dVar2.a();
            this.f28979g0 = a17;
            a17.a(this);
            j(this.f28979g0);
        }
        if (u10 != null && (lVar2 = u10.f3532b) != null && (dVar = lVar2.f3535c) != null) {
            B3.a a18 = dVar.a();
            this.f28980h0 = a18;
            a18.a(this);
            j(this.f28980h0);
        }
        if (u10 == null || (lVar = u10.f3532b) == null) {
            return;
        }
        this.f28966T = lVar.f3536d;
    }

    public final String Q(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!g0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.f28960N.c(j10)) {
            return (String) this.f28960N.d(j10);
        }
        this.f28951E.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.f28951E.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.f28951E.toString();
        this.f28960N.g(j10, sb2);
        return sb2;
    }

    public final void R(E3.b bVar, int i10, int i11) {
        B3.a aVar = this.f28968V;
        if (aVar != null) {
            this.f28957K.setColor(((Integer) aVar.h()).intValue());
        } else if (this.f28967U == null || !e0(i11)) {
            this.f28957K.setColor(bVar.f2970h);
        } else {
            this.f28957K.setColor(((Integer) this.f28967U.h()).intValue());
        }
        B3.a aVar2 = this.f28970X;
        if (aVar2 != null) {
            this.f28958L.setColor(((Integer) aVar2.h()).intValue());
        } else if (this.f28969W == null || !e0(i11)) {
            this.f28958L.setColor(bVar.f2971i);
        } else {
            this.f28958L.setColor(((Integer) this.f28969W.h()).intValue());
        }
        int i12 = 100;
        int intValue = this.f28881x.k() == null ? 100 : ((Integer) this.f28881x.k().h()).intValue();
        if (this.f28975c0 != null && e0(i11)) {
            i12 = ((Integer) this.f28975c0.h()).intValue();
        }
        int round = Math.round(((((intValue * 255.0f) / 100.0f) * (i12 / 100.0f)) * i10) / 255.0f);
        this.f28957K.setAlpha(round);
        this.f28958L.setAlpha(round);
        B3.a aVar3 = this.f28972Z;
        if (aVar3 != null) {
            this.f28958L.setStrokeWidth(((Float) aVar3.h()).floatValue());
        } else if (this.f28971Y == null || !e0(i11)) {
            this.f28958L.setStrokeWidth(bVar.f2972j * z.e());
        } else {
            this.f28958L.setStrokeWidth(((Float) this.f28971Y.h()).floatValue());
        }
    }

    public final void S(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void T(E3.d dVar, float f10, E3.b bVar, Canvas canvas, int i10, int i11) {
        R(bVar, i11, i10);
        List b02 = b0(dVar);
        for (int i12 = 0; i12 < b02.size(); i12++) {
            Path l10 = ((com.airbnb.lottie.animation.content.d) b02.get(i12)).l();
            l10.computeBounds(this.f28955I, false);
            this.f28956J.reset();
            this.f28956J.preTranslate(0.0f, (-bVar.f2969g) * z.e());
            this.f28956J.preScale(f10, f10);
            l10.transform(this.f28956J);
            if (bVar.f2973k) {
                W(l10, this.f28957K, canvas);
                W(l10, this.f28958L, canvas);
            } else {
                W(l10, this.f28958L, canvas);
                W(l10, this.f28957K, canvas);
            }
        }
    }

    public final void U(String str, E3.b bVar, Canvas canvas, int i10, int i11) {
        R(bVar, i11, i10);
        if (bVar.f2973k) {
            S(str, this.f28957K, canvas);
            S(str, this.f28958L, canvas);
        } else {
            S(str, this.f28958L, canvas);
            S(str, this.f28957K, canvas);
        }
    }

    public final void V(String str, E3.b bVar, Canvas canvas, float f10, int i10, int i11) {
        this.f28961O.clear();
        int i12 = 0;
        while (i12 < str.length()) {
            String Q10 = Q(str, i12);
            this.f28961O.add(Q10);
            i12 += Q10.length();
        }
        int i13 = 0;
        while (i13 < this.f28961O.size()) {
            this.f28952F.setLength(0);
            this.f28952F.append((String) this.f28961O.get(i13));
            int i14 = i13 + 1;
            while (i14 < this.f28961O.size()) {
                String str2 = (String) this.f28961O.get(i14);
                if (f0(str2)) {
                    this.f28952F.insert(0, str2);
                    i14++;
                }
            }
            String sb2 = this.f28952F.toString();
            E3.b bVar2 = bVar;
            U(sb2, bVar2, canvas, i10 + i13, i11);
            canvas.translate(this.f28957K.measureText(sb2) + f10, 0.0f);
            i13 = i14;
            bVar = bVar2;
        }
    }

    public final void W(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void X(String str, E3.b bVar, E3.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        E3.b bVar2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            E3.d dVar = (E3.d) this.f28965S.c().e(E3.d.c(str.charAt(i12), cVar.a(), cVar.c()));
            if (dVar == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
                T(dVar, f13, bVar2, canvas2, i12, i11);
                canvas2.translate((((float) dVar.b()) * f13 * z.e()) + f12, 0.0f);
            }
            i12++;
            f11 = f13;
            bVar = bVar2;
            canvas = canvas2;
            i10 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(E3.b bVar, E3.c cVar, Canvas canvas, int i10) {
        float floatValue;
        int size;
        int i11;
        float f10;
        int i12;
        i iVar = this;
        E3.b bVar2 = bVar;
        E3.c cVar2 = cVar;
        Typeface d02 = iVar.d0(cVar2);
        if (d02 == null) {
            return;
        }
        String str = bVar2.f2963a;
        b0 a02 = iVar.f28964R.a0();
        if (a02 != null) {
            str = a02.c(iVar.getName(), str);
        }
        iVar.f28957K.setTypeface(d02);
        B3.a aVar = iVar.f28976d0;
        float floatValue2 = aVar != null ? ((Float) aVar.h()).floatValue() : bVar2.f2965c;
        iVar.f28957K.setTextSize(z.e() * floatValue2);
        iVar.f28958L.setTypeface(iVar.f28957K.getTypeface());
        iVar.f28958L.setTextSize(iVar.f28957K.getTextSize());
        float f11 = bVar2.f2967e / 10.0f;
        B3.a aVar2 = iVar.f28974b0;
        if (aVar2 == null) {
            B3.a aVar3 = iVar.f28973a0;
            if (aVar3 != null) {
                floatValue = ((Float) aVar3.h()).floatValue();
            }
            float e10 = ((f11 * z.e()) * floatValue2) / 100.0f;
            List c02 = iVar.c0(str);
            size = c02.size();
            int i13 = -1;
            i11 = 0;
            int i14 = 0;
            while (i11 < size) {
                String str2 = (String) c02.get(i11);
                PointF pointF = bVar2.f2975m;
                float f12 = e10;
                List j02 = iVar.j0(str2, pointF == null ? 0.0f : pointF.x, cVar2, 0.0f, f12, false);
                int i15 = 0;
                while (i15 < j02.size()) {
                    d dVar = (d) j02.get(i15);
                    i13++;
                    canvas.save();
                    if (iVar.h0(canvas, bVar2, i13, (iVar.f28963Q == null && iVar.f28976d0 == null && iVar.f28974b0 == null) ? dVar.f28984b : iVar.f28957K.measureText(dVar.f28983a))) {
                        String str3 = dVar.f28983a;
                        if (Bidi.requiresBidi(str3.toCharArray(), 0, str3.length())) {
                            str3 = iVar.i0(str3);
                        }
                        f10 = f12;
                        i12 = i14;
                        iVar.V(str3, bVar2, canvas, f10, i12, i10);
                    } else {
                        f10 = f12;
                        i12 = i14;
                    }
                    i14 = i12 + dVar.f28983a.length();
                    canvas.restore();
                    i15++;
                    iVar = this;
                    bVar2 = bVar;
                    f12 = f10;
                }
                e10 = f12;
                i11++;
                iVar = this;
                bVar2 = bVar;
                cVar2 = cVar;
            }
        }
        floatValue = ((Float) aVar2.h()).floatValue();
        f11 += floatValue;
        float e102 = ((f11 * z.e()) * floatValue2) / 100.0f;
        List c022 = iVar.c0(str);
        size = c022.size();
        int i132 = -1;
        i11 = 0;
        int i142 = 0;
        while (i11 < size) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(E3.b bVar, Matrix matrix, E3.c cVar, Canvas canvas, int i10) {
        float floatValue;
        int i11;
        float f10;
        float f11;
        i iVar = this;
        E3.b bVar2 = bVar;
        B3.a aVar = iVar.f28976d0;
        float floatValue2 = (aVar != null ? ((Float) aVar.h()).floatValue() : bVar2.f2965c) / 100.0f;
        float g10 = z.g(matrix);
        List c02 = iVar.c0(bVar2.f2963a);
        int size = c02.size();
        float f12 = bVar2.f2967e / 10.0f;
        B3.a aVar2 = iVar.f28974b0;
        if (aVar2 == null) {
            B3.a aVar3 = iVar.f28973a0;
            if (aVar3 != null) {
                floatValue = ((Float) aVar3.h()).floatValue();
            }
            float f13 = f12;
            int i12 = -1;
            i11 = 0;
            while (i11 < size) {
                String str = (String) c02.get(i11);
                PointF pointF = bVar2.f2975m;
                List j02 = iVar.j0(str, pointF == null ? 0.0f : pointF.x, cVar, floatValue2, f13, true);
                int i13 = 0;
                while (i13 < j02.size()) {
                    d dVar = (d) j02.get(i13);
                    i12++;
                    canvas.save();
                    if (iVar.h0(canvas, bVar2, i12, dVar.f28984b)) {
                        float f14 = floatValue2;
                        E3.b bVar3 = bVar2;
                        f10 = f13;
                        f11 = g10;
                        iVar.X(dVar.f28983a, bVar3, cVar, canvas, f11, f14, f10, i10);
                        floatValue2 = f14;
                    } else {
                        f10 = f13;
                        f11 = g10;
                    }
                    canvas.restore();
                    i13++;
                    iVar = this;
                    g10 = f11;
                    f13 = f10;
                    bVar2 = bVar;
                }
                i11++;
                iVar = this;
                f13 = f13;
                bVar2 = bVar;
            }
        }
        floatValue = ((Float) aVar2.h()).floatValue();
        f12 += floatValue;
        float f132 = f12;
        int i122 = -1;
        i11 = 0;
        while (i11 < size) {
        }
    }

    public final d a0(int i10) {
        for (int size = this.f28962P.size(); size < i10; size++) {
            this.f28962P.add(new d(null));
        }
        return (d) this.f28962P.get(i10 - 1);
    }

    public final List b0(E3.d dVar) {
        if (this.f28959M.containsKey(dVar)) {
            return (List) this.f28959M.get(dVar);
        }
        List a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.f28964R, this, (q) a10.get(i10), this.f28965S));
        }
        this.f28959M.put(dVar, arrayList);
        return arrayList;
    }

    public final List c0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r").split("\r"));
    }

    public final Typeface d0(E3.c cVar) {
        Typeface typeface;
        B3.a aVar = this.f28977e0;
        if (aVar != null && (typeface = (Typeface) aVar.h()) != null) {
            return typeface;
        }
        Typeface b02 = this.f28964R.b0(cVar);
        return b02 != null ? b02 : cVar.d();
    }

    @Override // com.airbnb.lottie.model.layer.b, E3.f
    public void e(Object obj, G3.c cVar) {
        super.e(obj, cVar);
        if (obj == S.f28458a) {
            B3.a aVar = this.f28968V;
            if (aVar != null) {
                I(aVar);
            }
            if (cVar == null) {
                this.f28968V = null;
                return;
            }
            t tVar = new t(cVar);
            this.f28968V = tVar;
            tVar.a(this);
            j(this.f28968V);
            return;
        }
        if (obj == S.f28459b) {
            B3.a aVar2 = this.f28970X;
            if (aVar2 != null) {
                I(aVar2);
            }
            if (cVar == null) {
                this.f28970X = null;
                return;
            }
            t tVar2 = new t(cVar);
            this.f28970X = tVar2;
            tVar2.a(this);
            j(this.f28970X);
            return;
        }
        if (obj == S.f28479v) {
            B3.a aVar3 = this.f28972Z;
            if (aVar3 != null) {
                I(aVar3);
            }
            if (cVar == null) {
                this.f28972Z = null;
                return;
            }
            t tVar3 = new t(cVar);
            this.f28972Z = tVar3;
            tVar3.a(this);
            j(this.f28972Z);
            return;
        }
        if (obj == S.f28480w) {
            B3.a aVar4 = this.f28974b0;
            if (aVar4 != null) {
                I(aVar4);
            }
            if (cVar == null) {
                this.f28974b0 = null;
                return;
            }
            t tVar4 = new t(cVar);
            this.f28974b0 = tVar4;
            tVar4.a(this);
            j(this.f28974b0);
            return;
        }
        if (obj == S.f28448I) {
            B3.a aVar5 = this.f28976d0;
            if (aVar5 != null) {
                I(aVar5);
            }
            if (cVar == null) {
                this.f28976d0 = null;
                return;
            }
            t tVar5 = new t(cVar);
            this.f28976d0 = tVar5;
            tVar5.a(this);
            j(this.f28976d0);
            return;
        }
        if (obj != S.f28454O) {
            if (obj == S.f28456Q) {
                this.f28963Q.s(cVar);
                return;
            }
            return;
        }
        B3.a aVar6 = this.f28977e0;
        if (aVar6 != null) {
            I(aVar6);
        }
        if (cVar == null) {
            this.f28977e0 = null;
            return;
        }
        t tVar6 = new t(cVar);
        this.f28977e0 = tVar6;
        tVar6.a(this);
        j(this.f28977e0);
    }

    public final boolean e0(int i10) {
        int length = ((E3.b) this.f28963Q.h()).f2963a.length();
        B3.a aVar = this.f28978f0;
        if (aVar == null || this.f28979g0 == null) {
            return true;
        }
        int min = Math.min(((Integer) aVar.h()).intValue(), ((Integer) this.f28979g0.h()).intValue());
        int max = Math.max(((Integer) this.f28978f0.h()).intValue(), ((Integer) this.f28979g0.h()).intValue());
        B3.a aVar2 = this.f28980h0;
        if (aVar2 != null) {
            int intValue = ((Integer) aVar2.h()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.f28966T == u.INDEX) {
            return i10 >= min && i10 < max;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) min) && f10 < ((float) max);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f28965S.b().width(), this.f28965S.b().height());
    }

    public final boolean f0(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (Character.getDirectionality(str.codePointAt(i10)) == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean g0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    public final boolean h0(Canvas canvas, E3.b bVar, int i10, float f10) {
        PointF pointF = bVar.f2974l;
        PointF pointF2 = bVar.f2975m;
        float e10 = z.e();
        float f11 = (i10 * bVar.f2968f * e10) + (pointF == null ? 0.0f : (bVar.f2968f * e10) + pointF.y);
        if (this.f28964R.H() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f2965c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.$SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[bVar.f2966d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    public final String i0(String str) {
        Bidi bidi = new Bidi(str, -2);
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        this.f28953G.setLength(0);
        for (int i11 = 0; i11 < runCount; i11++) {
            int intValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            int runLevel = bidi.getRunLevel(intValue);
            String substring = str.substring(runStart, runLimit);
            if ((runLevel & 1) == 0) {
                this.f28953G.append(substring);
            } else {
                this.f28954H.setLength(0);
                int i12 = 0;
                while (i12 < substring.length()) {
                    String Q10 = Q(substring, i12);
                    this.f28954H.insert(0, Q10);
                    i12 += Q10.length();
                }
                this.f28953G.append((CharSequence) this.f28954H);
            }
        }
        return this.f28953G.toString();
    }

    public final List j0(String str, float f10, E3.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                E3.d dVar = (E3.d) this.f28965S.c().e(E3.d.c(charAt, cVar.a(), cVar.c()));
                if (dVar != null) {
                    measureText = ((float) dVar.b()) * f11 * z.e();
                }
            } else {
                measureText = this.f28957K.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = measureText + f12;
            if (charAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                d a02 = a0(i10);
                if (i12 == i11) {
                    a02.c(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    a02.c(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            a0(i10).c(str.substring(i11), f13);
        }
        return this.f28962P.subList(0, i10);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        Canvas canvas2;
        E3.b bVar = (E3.b) this.f28963Q.h();
        E3.c cVar = (E3.c) this.f28965S.g().get(bVar.f2964b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        R(bVar, i10, 0);
        if (this.f28964R.Y0()) {
            canvas2 = canvas;
            Z(bVar, matrix, cVar, canvas2, i10);
        } else {
            canvas2 = canvas;
            Y(bVar, cVar, canvas2, i10);
        }
        canvas2.restore();
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f28983a;

        /* renamed from: b, reason: collision with root package name */
        public float f28984b;

        public d() {
            this.f28983a = "";
            this.f28984b = 0.0f;
        }

        public void c(String str, float f10) {
            this.f28983a = str;
            this.f28984b = f10;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
