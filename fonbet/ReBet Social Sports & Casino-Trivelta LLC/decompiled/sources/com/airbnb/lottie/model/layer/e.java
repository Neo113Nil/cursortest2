package com.airbnb.lottie.model.layer;

import F3.j;
import F3.k;
import F3.n;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.C2956j;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f28904a;

    /* renamed from: b, reason: collision with root package name */
    public final C2940j f28905b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28906c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28907d;

    /* renamed from: e, reason: collision with root package name */
    public final a f28908e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28909f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28910g;

    /* renamed from: h, reason: collision with root package name */
    public final List f28911h;

    /* renamed from: i, reason: collision with root package name */
    public final n f28912i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28913j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28914k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28915l;

    /* renamed from: m, reason: collision with root package name */
    public final float f28916m;

    /* renamed from: n, reason: collision with root package name */
    public final float f28917n;

    /* renamed from: o, reason: collision with root package name */
    public final float f28918o;

    /* renamed from: p, reason: collision with root package name */
    public final float f28919p;

    /* renamed from: q, reason: collision with root package name */
    public final j f28920q;

    /* renamed from: r, reason: collision with root package name */
    public final k f28921r;

    /* renamed from: s, reason: collision with root package name */
    public final F3.b f28922s;

    /* renamed from: t, reason: collision with root package name */
    public final List f28923t;

    /* renamed from: u, reason: collision with root package name */
    public final b f28924u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f28925v;

    /* renamed from: w, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.a f28926w;

    /* renamed from: x, reason: collision with root package name */
    public final C2956j f28927x;

    /* renamed from: y, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.h f28928y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List list, C2940j c2940j, String str, long j10, a aVar, long j11, String str2, List list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List list3, b bVar, F3.b bVar2, boolean z10, com.airbnb.lottie.model.content.a aVar2, C2956j c2956j, com.airbnb.lottie.model.content.h hVar) {
        this.f28904a = list;
        this.f28905b = c2940j;
        this.f28906c = str;
        this.f28907d = j10;
        this.f28908e = aVar;
        this.f28909f = j11;
        this.f28910g = str2;
        this.f28911h = list2;
        this.f28912i = nVar;
        this.f28913j = i10;
        this.f28914k = i11;
        this.f28915l = i12;
        this.f28916m = f10;
        this.f28917n = f11;
        this.f28918o = f12;
        this.f28919p = f13;
        this.f28920q = jVar;
        this.f28921r = kVar;
        this.f28923t = list3;
        this.f28924u = bVar;
        this.f28922s = bVar2;
        this.f28925v = z10;
        this.f28926w = aVar2;
        this.f28927x = c2956j;
        this.f28928y = hVar;
    }

    public com.airbnb.lottie.model.content.h a() {
        return this.f28928y;
    }

    public com.airbnb.lottie.model.content.a b() {
        return this.f28926w;
    }

    public C2940j c() {
        return this.f28905b;
    }

    public C2956j d() {
        return this.f28927x;
    }

    public long e() {
        return this.f28907d;
    }

    public List f() {
        return this.f28923t;
    }

    public a g() {
        return this.f28908e;
    }

    public List h() {
        return this.f28911h;
    }

    public b i() {
        return this.f28924u;
    }

    public String j() {
        return this.f28906c;
    }

    public long k() {
        return this.f28909f;
    }

    public float l() {
        return this.f28919p;
    }

    public float m() {
        return this.f28918o;
    }

    public String n() {
        return this.f28910g;
    }

    public List o() {
        return this.f28904a;
    }

    public int p() {
        return this.f28915l;
    }

    public int q() {
        return this.f28914k;
    }

    public int r() {
        return this.f28913j;
    }

    public float s() {
        return this.f28917n / this.f28905b.e();
    }

    public j t() {
        return this.f28920q;
    }

    public String toString() {
        return z("");
    }

    public k u() {
        return this.f28921r;
    }

    public F3.b v() {
        return this.f28922s;
    }

    public float w() {
        return this.f28916m;
    }

    public n x() {
        return this.f28912i;
    }

    public boolean y() {
        return this.f28925v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        e t10 = this.f28905b.t(k());
        if (t10 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t10.j());
            e t11 = this.f28905b.t(t10.k());
            while (t11 != null) {
                sb2.append("->");
                sb2.append(t11.j());
                t11 = this.f28905b.t(t11.k());
            }
            sb2.append(str);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f28904a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (Object obj : this.f28904a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(obj);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        return sb2.toString();
    }
}
