package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.model.content.t;
import java.util.List;

/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: d, reason: collision with root package name */
    public final String f28618d;

    /* renamed from: e, reason: collision with root package name */
    public final K f28619e;

    /* renamed from: f, reason: collision with root package name */
    public final k.a f28620f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28621g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28622h;

    /* renamed from: i, reason: collision with root package name */
    public final B3.a f28623i;

    /* renamed from: j, reason: collision with root package name */
    public final B3.a f28624j;

    /* renamed from: k, reason: collision with root package name */
    public final B3.a f28625k;

    /* renamed from: l, reason: collision with root package name */
    public final B3.a f28626l;

    /* renamed from: m, reason: collision with root package name */
    public final B3.a f28627m;

    /* renamed from: n, reason: collision with root package name */
    public final B3.a f28628n;

    /* renamed from: o, reason: collision with root package name */
    public final B3.a f28629o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28631q;

    /* renamed from: a, reason: collision with root package name */
    public final Path f28615a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f28616b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f28617c = new PathMeasure();
    private final float[] lastSegmentPosition = new float[2];

    /* renamed from: p, reason: collision with root package name */
    public final b f28630p = new b();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        static {
            int[] iArr = new int[k.a.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        this.f28619e = k10;
        this.f28618d = kVar.d();
        k.a j10 = kVar.j();
        this.f28620f = j10;
        this.f28621g = kVar.k();
        this.f28622h = kVar.l();
        B3.d a10 = kVar.g().a();
        this.f28623i = a10;
        B3.a a11 = kVar.h().a();
        this.f28624j = a11;
        B3.d a12 = kVar.i().a();
        this.f28625k = a12;
        B3.d a13 = kVar.e().a();
        this.f28627m = a13;
        B3.d a14 = kVar.f().a();
        this.f28629o = a14;
        k.a aVar = k.a.STAR;
        if (j10 == aVar) {
            this.f28626l = kVar.b().a();
            this.f28628n = kVar.c().a();
        } else {
            this.f28626l = null;
            this.f28628n = null;
        }
        bVar.j(a10);
        bVar.j(a11);
        bVar.j(a12);
        bVar.j(a13);
        bVar.j(a14);
        if (j10 == aVar) {
            bVar.j(this.f28626l);
            bVar.j(this.f28628n);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (j10 == aVar) {
            this.f28626l.a(this);
            this.f28628n.a(this);
        }
    }

    private void k() {
        this.f28631q = false;
        this.f28619e.invalidateSelf();
    }

    @Override // B3.a.b
    public void a() {
        k();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f28630p.a(uVar);
                    uVar.e(this);
                }
            }
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        B3.a aVar;
        B3.a aVar2;
        if (obj == S.f28483z) {
            this.f28623i.o(cVar);
            return;
        }
        if (obj == S.f28440A) {
            this.f28625k.o(cVar);
            return;
        }
        if (obj == S.f28471n) {
            this.f28624j.o(cVar);
            return;
        }
        if (obj == S.f28441B && (aVar2 = this.f28626l) != null) {
            aVar2.o(cVar);
            return;
        }
        if (obj == S.f28442C) {
            this.f28627m.o(cVar);
            return;
        }
        if (obj == S.f28443D && (aVar = this.f28628n) != null) {
            aVar.o(cVar);
        } else if (obj == S.f28444E) {
            this.f28629o.o(cVar);
        }
    }

    public final void g() {
        double d10;
        float f10;
        float f11;
        float f12;
        int floor = (int) Math.floor(((Float) this.f28623i.h()).floatValue());
        double radians = Math.toRadians((this.f28625k == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d11 = floor;
        float floatValue = ((Float) this.f28629o.h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.f28627m.h()).floatValue();
        double d12 = floatValue2;
        float cos = (float) (Math.cos(radians) * d12);
        float sin = (float) (Math.sin(radians) * d12);
        this.f28615a.moveTo(cos, sin);
        double d13 = (float) (6.283185307179586d / d11);
        double ceil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= ceil) {
                PointF pointF = (PointF) this.f28624j.h();
                this.f28615a.offset(pointF.x, pointF.y);
                this.f28615a.close();
                return;
            }
            float cos2 = (float) (d12 * Math.cos(d14));
            float sin2 = (float) (Math.sin(d14) * d12);
            if (floatValue != 0.0f) {
                d10 = ceil;
                f10 = floatValue;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f13 = floatValue2 * f10 * 0.25f;
                float f14 = f13 * cos3;
                float f15 = f13 * sin3;
                float cos4 = ((float) Math.cos(atan22)) * f13;
                float sin4 = f13 * ((float) Math.sin(atan22));
                if (d15 == d10 - 1.0d) {
                    this.f28616b.reset();
                    this.f28616b.moveTo(cos, sin);
                    float f16 = cos - f14;
                    float f17 = sin - f15;
                    float f18 = cos2 + cos4;
                    float f19 = sin2 + sin4;
                    f11 = cos2;
                    f12 = sin2;
                    this.f28616b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f28617c.setPath(this.f28616b, false);
                    PathMeasure pathMeasure = this.f28617c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.lastSegmentPosition, null);
                    Path path = this.f28615a;
                    float[] fArr = this.lastSegmentPosition;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = cos2;
                    f12 = sin2;
                    this.f28615a.cubicTo(cos - f14, sin - f15, f11 + cos4, f12 + sin4, f11, f12);
                }
                cos = f11;
                sin = f12;
            } else {
                cos = cos2;
                sin = sin2;
                d10 = ceil;
                f10 = floatValue;
                if (d15 == d10 - 1.0d) {
                    i10++;
                    ceil = d10;
                    floatValue = f10;
                } else {
                    this.f28615a.lineTo(cos, sin);
                }
            }
            d14 += d13;
            i10++;
            ceil = d10;
            floatValue = f10;
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28618d;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }

    public final void j() {
        float f10;
        float f11;
        int i10;
        float cos;
        float sin;
        float f12;
        float f13;
        double d10;
        float f14;
        int i11;
        float f15;
        double d11;
        float f16;
        float f17;
        double d12;
        float f18;
        float f19;
        float floatValue = ((Float) this.f28623i.h()).floatValue();
        double radians = Math.toRadians((this.f28625k == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d13 = floatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.f28622h) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = floatValue - ((int) floatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f22) * f21;
        }
        float floatValue2 = ((Float) this.f28627m.h()).floatValue();
        float floatValue3 = ((Float) this.f28626l.h()).floatValue();
        B3.a aVar = this.f28628n;
        float floatValue4 = aVar != null ? ((Float) aVar.h()).floatValue() / 100.0f : 0.0f;
        B3.a aVar2 = this.f28629o;
        float floatValue5 = aVar2 != null ? ((Float) aVar2.h()).floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((floatValue2 - floatValue3) * f22) + floatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float cos2 = (float) (d14 * Math.cos(radians));
            sin = (float) (d14 * Math.sin(radians));
            this.f28615a.moveTo(cos2, sin);
            d10 = radians + ((f20 * f22) / 2.0f);
            f12 = f22;
            cos = cos2;
            f13 = f21;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = floatValue2;
            cos = (float) (Math.cos(radians) * d15);
            sin = (float) (d15 * Math.sin(radians));
            this.f28615a.moveTo(cos, sin);
            f12 = f22;
            f13 = f21;
            d10 = radians + f13;
            f14 = 0.0f;
        }
        double ceil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f23 = sin;
        float f24 = cos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= ceil) {
                PointF pointF = (PointF) this.f28624j.h();
                this.f28615a.offset(pointF.x, pointF.y);
                this.f28615a.close();
                return;
            }
            float f25 = z10 ? floatValue2 : floatValue3;
            if (f14 == f11 || d18 != ceil - 2.0d) {
                i11 = i13;
                f15 = f13;
            } else {
                i11 = i13;
                f15 = (f20 * f12) / f10;
            }
            if (f14 == f11 || d18 != ceil - 1.0d) {
                d11 = d18;
                f16 = f25;
            } else {
                d11 = d18;
                f16 = f14;
            }
            double d19 = f16;
            float cos3 = (float) (d19 * Math.cos(d17));
            float f26 = f20;
            float sin2 = (float) (d19 * Math.sin(d17));
            if (floatValue4 == f11 && floatValue5 == f11) {
                this.f28615a.lineTo(cos3, sin2);
                f19 = cos3;
                f18 = sin2;
                f17 = f13;
                d12 = d17;
            } else {
                f17 = f13;
                d12 = d17;
                double atan2 = (float) (Math.atan2(f23, f24) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                float f27 = f24;
                float f28 = f23;
                f18 = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f29 = z10 ? floatValue4 : floatValue5;
                float f30 = z10 ? floatValue5 : floatValue4;
                float f31 = (z10 ? floatValue3 : floatValue2) * f29 * 0.47829f;
                float f32 = cos4 * f31;
                float f33 = f31 * sin3;
                float f34 = (z10 ? floatValue2 : floatValue3) * f30 * 0.47829f;
                float f35 = cos5 * f34;
                float f36 = f34 * sin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f32 *= f12;
                        f33 *= f12;
                    } else if (d11 == ceil - 1.0d) {
                        f35 *= f12;
                        f36 *= f12;
                    }
                }
                f19 = cos3;
                this.f28615a.cubicTo(f27 - f32, f28 - f33, cos3 + f35, f18 + f36, f19, f18);
            }
            d17 = d12 + f15;
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f17;
            f24 = f19;
            f23 = f18;
            f20 = f26;
        }
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        if (this.f28631q) {
            return this.f28615a;
        }
        this.f28615a.reset();
        if (this.f28621g) {
            this.f28631q = true;
            return this.f28615a;
        }
        int i10 = a.$SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[this.f28620f.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            g();
        }
        this.f28615a.close();
        this.f28630p.b(this.f28615a);
        this.f28631q = true;
        return this.f28615a;
    }
}
