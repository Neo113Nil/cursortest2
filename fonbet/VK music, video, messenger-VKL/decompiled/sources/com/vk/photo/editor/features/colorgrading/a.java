package com.vk.photo.editor.features.colorgrading;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.bxj0;
import xsna.epx;
import xsna.f5p;
import xsna.g5p;
import xsna.gq;
import xsna.k6g;
import xsna.odj;
import xsna.shy;

/* compiled from: ColorGradingParams.kt */
/* loaded from: classes4.dex */
public final class a implements g5p {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final C1454a j;
    public final b k;
    public final k6g l;

    /* compiled from: ColorGradingParams.kt */
    /* renamed from: com.vk.photo.editor.features.colorgrading.a$a, reason: collision with other inner class name */
    public static final class C1454a {
        public final float A;
        public final boolean B;
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        public final float i;
        public final float j;
        public final float k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final float p;
        public final float q;
        public final float r;
        public final float s;
        public final float t;
        public final float u;
        public final float v;
        public final float w;
        public final float x;
        public final float y;
        public final float z;

        public C1454a() {
            this(0);
        }

        public static C1454a a(C1454a c1454a, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, int i) {
            float f28 = (i & 1) != 0 ? c1454a.a : f;
            float f29 = (i & 2) != 0 ? c1454a.b : f2;
            float f30 = (i & 4) != 0 ? c1454a.c : f3;
            float f31 = (i & 8) != 0 ? c1454a.d : f4;
            float f32 = (i & 16) != 0 ? c1454a.e : f5;
            float f33 = (i & 32) != 0 ? c1454a.f : f6;
            float f34 = (i & 64) != 0 ? c1454a.g : f7;
            float f35 = (i & 128) != 0 ? c1454a.h : f8;
            float f36 = (i & 256) != 0 ? c1454a.i : f9;
            float f37 = (i & 512) != 0 ? c1454a.j : f10;
            float f38 = (i & 1024) != 0 ? c1454a.k : f11;
            float f39 = (i & 2048) != 0 ? c1454a.l : f12;
            float f40 = (i & 4096) != 0 ? c1454a.m : f13;
            float f41 = (i & 8192) != 0 ? c1454a.n : f14;
            float f42 = f28;
            float f43 = (i & 16384) != 0 ? c1454a.o : f15;
            float f44 = (i & 32768) != 0 ? c1454a.p : f16;
            float f45 = (i & 65536) != 0 ? c1454a.q : f17;
            float f46 = (i & 131072) != 0 ? c1454a.r : f18;
            float f47 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? c1454a.s : f19;
            float f48 = (i & 524288) != 0 ? c1454a.t : f20;
            float f49 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? c1454a.u : f21;
            float f50 = (i & 2097152) != 0 ? c1454a.v : f22;
            float f51 = (i & 4194304) != 0 ? c1454a.w : f23;
            float f52 = (i & 8388608) != 0 ? c1454a.x : f24;
            float f53 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? c1454a.y : f25;
            float f54 = (i & 33554432) != 0 ? c1454a.z : f26;
            float f55 = (i & 67108864) != 0 ? c1454a.A : f27;
            c1454a.getClass();
            return new C1454a(f42, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f43, f44, f45, f46, f47, f48, f49, f50, f51, f52, f53, f54, f55);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1454a)) {
                return false;
            }
            C1454a c1454a = (C1454a) obj;
            return Float.compare(this.a, c1454a.a) == 0 && Float.compare(this.b, c1454a.b) == 0 && Float.compare(this.c, c1454a.c) == 0 && Float.compare(this.d, c1454a.d) == 0 && Float.compare(this.e, c1454a.e) == 0 && Float.compare(this.f, c1454a.f) == 0 && Float.compare(this.g, c1454a.g) == 0 && Float.compare(this.h, c1454a.h) == 0 && Float.compare(this.i, c1454a.i) == 0 && Float.compare(this.j, c1454a.j) == 0 && Float.compare(this.k, c1454a.k) == 0 && Float.compare(this.l, c1454a.l) == 0 && Float.compare(this.m, c1454a.m) == 0 && Float.compare(this.n, c1454a.n) == 0 && Float.compare(this.o, c1454a.o) == 0 && Float.compare(this.p, c1454a.p) == 0 && Float.compare(this.q, c1454a.q) == 0 && Float.compare(this.r, c1454a.r) == 0 && Float.compare(this.s, c1454a.s) == 0 && Float.compare(this.t, c1454a.t) == 0 && Float.compare(this.u, c1454a.u) == 0 && Float.compare(this.v, c1454a.v) == 0 && Float.compare(this.w, c1454a.w) == 0 && Float.compare(this.x, c1454a.x) == 0 && Float.compare(this.y, c1454a.y) == 0 && Float.compare(this.z, c1454a.z) == 0 && Float.compare(this.A, c1454a.A) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.A) + io.reactivex.rxjava3.subjects.b.a(this.z, io.reactivex.rxjava3.subjects.b.a(this.y, io.reactivex.rxjava3.subjects.b.a(this.x, io.reactivex.rxjava3.subjects.b.a(this.w, io.reactivex.rxjava3.subjects.b.a(this.v, io.reactivex.rxjava3.subjects.b.a(this.u, io.reactivex.rxjava3.subjects.b.a(this.t, io.reactivex.rxjava3.subjects.b.a(this.s, io.reactivex.rxjava3.subjects.b.a(this.r, io.reactivex.rxjava3.subjects.b.a(this.q, io.reactivex.rxjava3.subjects.b.a(this.p, io.reactivex.rxjava3.subjects.b.a(this.o, io.reactivex.rxjava3.subjects.b.a(this.n, io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, io.reactivex.rxjava3.subjects.b.a(this.k, io.reactivex.rxjava3.subjects.b.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder a = bxj0.a("HSL(colorHueRed=", this.a, ", colorSaturationRed=", this.b, ", colorLightnessRed=");
            gq.h(a, this.c, ", colorHueOrange=", this.d, ", colorSaturationOrange=");
            gq.h(a, this.e, ", colorLightnessOrange=", this.f, ", colorHueYellow=");
            gq.h(a, this.g, ", colorSaturationYellow=", this.h, ", colorLightnessYellow=");
            gq.h(a, this.i, ", colorHueGreen=", this.j, ", colorSaturationGreen=");
            gq.h(a, this.k, ", colorLightnessGreen=", this.l, ", colorHueCyan=");
            gq.h(a, this.m, ", colorSaturationCyan=", this.n, ", colorLightnessCyan=");
            gq.h(a, this.o, ", colorHueMagenta=", this.p, ", colorSaturationMagenta=");
            gq.h(a, this.q, ", colorLightnessMagenta=", this.r, ", toneHueShadow=");
            gq.h(a, this.s, ", toneSaturationShadow=", this.t, ", toneLightnessShadow=");
            gq.h(a, this.u, ", toneHueMidtones=", this.v, ", toneSaturationMidtones=");
            gq.h(a, this.w, ", toneLightnessMidtones=", this.x, ", toneHueHighlights=");
            gq.h(a, this.y, ", toneSaturationHighlights=", this.z, ", toneLightnessHighlights=");
            return shy.c(this.A, ")", a);
        }

        public C1454a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = f8;
            this.i = f9;
            this.j = f10;
            this.k = f11;
            this.l = f12;
            this.m = f13;
            this.n = f14;
            this.o = f15;
            this.p = f16;
            this.q = f17;
            this.r = f18;
            this.s = f19;
            this.t = f20;
            this.u = f21;
            this.v = f22;
            this.w = f23;
            this.x = f24;
            this.y = f25;
            this.z = f26;
            this.A = f27;
            this.B = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f8 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f9 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f14 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f15 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f16 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f17 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f18 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f19 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f20 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f21 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f22 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f23 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f24 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f25 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f26 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f27 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public /* synthetic */ C1454a(int i) {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: ColorGradingParams.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final float c;
        public final float d;

        public b() {
            this(0);
        }

        public static b a(b bVar, int i, int i2, float f, float f2, int i3) {
            if ((i3 & 1) != 0) {
                i = bVar.a;
            }
            if ((i3 & 2) != 0) {
                i2 = bVar.b;
            }
            if ((i3 & 4) != 0) {
                f = bVar.c;
            }
            if ((i3 & 8) != 0) {
                f2 = bVar.d;
            }
            bVar.getClass();
            return new b(f, f2, i, i2);
        }

        public final boolean b() {
            return this.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder a = odj.a(this.a, this.b, "Tone(darkColorId=", ", lightColorId=", ", darkColorLevel=");
            a.append(this.c);
            a.append(", lightColorLevel=");
            a.append(this.d);
            a.append(")");
            return a.toString();
        }

        public b(float f, float f2, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = f;
            this.d = f2;
        }

        public /* synthetic */ b(int i) {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
        }
    }

    public a() {
        this(0);
    }

    public static a a(a aVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, C1454a c1454a, b bVar, int i) {
        aVar.getClass();
        if ((i & 2) != 0) {
            f = aVar.a;
        }
        float f10 = f;
        if ((i & 4) != 0) {
            f2 = aVar.b;
        }
        float f11 = f2;
        if ((i & 8) != 0) {
            f3 = aVar.c;
        }
        float f12 = f3;
        float f13 = (i & 16) != 0 ? aVar.d : f4;
        aVar.getClass();
        float f14 = (i & 64) != 0 ? aVar.e : f5;
        float f15 = (i & 128) != 0 ? aVar.f : f6;
        float f16 = (i & 256) != 0 ? aVar.g : f7;
        float f17 = (i & 512) != 0 ? aVar.h : f8;
        float f18 = (i & 1024) != 0 ? aVar.i : f9;
        C1454a c1454a2 = (i & 2048) != 0 ? aVar.j : c1454a;
        b bVar2 = (i & 4096) != 0 ? aVar.k : bVar;
        aVar.getClass();
        return new a(f10, f11, f12, f13, f14, f15, f16, f17, f18, c1454a2, bVar2);
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.e == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.i == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.j.B && this.k.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.e, aVar.e) == 0 && Float.compare(this.f, aVar.f) == 0 && Float.compare(this.g, aVar.g) == 0 && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0 && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k);
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return this.l;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, io.reactivex.rxjava3.subjects.b.a(this.a, Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder a = bxj0.a("ColorGradingParams(exposure=0.0, brightness=", this.a, ", contrast=", this.b, ", saturation=");
        gq.h(a, this.c, ", temperature=", this.d, ", colorBalance=0.0, sharpness=");
        gq.h(a, this.e, ", grain=", this.f, ", vignette=");
        gq.h(a, this.g, ", lights=", this.h, ", darks=");
        a.append(this.i);
        a.append(", hsl=");
        a.append(this.j);
        a.append(", tone=");
        a.append(this.k);
        a.append(")");
        return a.toString();
    }

    public a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, C1454a c1454a, b bVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = c1454a;
        this.k = bVar;
        this.l = k6g.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(int i) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new C1454a(r13), new b(r13));
        int i2 = 0;
    }
}
