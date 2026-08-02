package com.facebook.imagepipeline.request;

import B7.f;
import B7.g;
import B7.h;
import C7.C1056u;
import C7.EnumC1050n;
import D6.k;
import J7.e;
import android.net.Uri;
import com.facebook.imagepipeline.request.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: t, reason: collision with root package name */
    public static final Set f30922t = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public e f30936n;

    /* renamed from: r, reason: collision with root package name */
    public int f30940r;

    /* renamed from: a, reason: collision with root package name */
    public Uri f30923a = null;

    /* renamed from: b, reason: collision with root package name */
    public b.c f30924b = b.c.FULL_FETCH;

    /* renamed from: c, reason: collision with root package name */
    public int f30925c = 0;

    /* renamed from: d, reason: collision with root package name */
    public g f30926d = null;

    /* renamed from: e, reason: collision with root package name */
    public h f30927e = null;

    /* renamed from: f, reason: collision with root package name */
    public B7.d f30928f = B7.d.a();

    /* renamed from: g, reason: collision with root package name */
    public b.EnumC0484b f30929g = b.EnumC0484b.DEFAULT;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30930h = C1056u.J().a();

    /* renamed from: i, reason: collision with root package name */
    public boolean f30931i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30932j = false;

    /* renamed from: k, reason: collision with root package name */
    public f f30933k = f.f846d;

    /* renamed from: l, reason: collision with root package name */
    public d f30934l = null;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f30935m = null;

    /* renamed from: o, reason: collision with root package name */
    public B7.b f30937o = null;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f30938p = null;

    /* renamed from: q, reason: collision with root package name */
    public EnumC1050n f30939q = null;

    /* renamed from: s, reason: collision with root package name */
    public String f30941s = null;

    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    public static c b(b bVar) {
        return x(bVar.getSourceUri()).F(bVar.getImageDecodeOptions()).z(bVar.getBytesRange()).A(bVar.getCacheChoice()).H(bVar.getLocalThumbnailPreviewsEnabled()).G(bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()).I(bVar.getLowestPermittedRequestLevel()).B(bVar.getCachesDisabled()).J(bVar.getPostprocessor()).K(bVar.getProgressiveRenderingEnabled()).M(bVar.getPriority()).N(bVar.getResizeOptions()).L(bVar.getRequestListener()).P(bVar.getRotationOptions()).Q(bVar.shouldDecodePrefetches()).C(bVar.getDelayMs()).D(bVar.getDiskCacheId()).E(bVar.getDownsampleOverride()).O(bVar.getResizingAllowedOverride());
    }

    public static boolean s(Uri uri) {
        Set set = f30922t;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c x(Uri uri) {
        return new c().R(uri);
    }

    public c A(b.EnumC0484b enumC0484b) {
        this.f30929g = enumC0484b;
        return this;
    }

    public final c B(int i10) {
        this.f30925c = i10;
        if (this.f30929g != b.EnumC0484b.DYNAMIC) {
            this.f30941s = null;
        }
        return this;
    }

    public c C(int i10) {
        this.f30940r = i10;
        return this;
    }

    public c D(String str) {
        this.f30941s = str;
        return this;
    }

    public c E(EnumC1050n enumC1050n) {
        this.f30939q = enumC1050n;
        return this;
    }

    public c F(B7.d dVar) {
        this.f30928f = dVar;
        return this;
    }

    public c G(boolean z10) {
        this.f30932j = z10;
        return this;
    }

    public c H(boolean z10) {
        this.f30931i = z10;
        return this;
    }

    public c I(b.c cVar) {
        this.f30924b = cVar;
        return this;
    }

    public c J(d dVar) {
        this.f30934l = dVar;
        return this;
    }

    public c K(boolean z10) {
        this.f30930h = z10;
        return this;
    }

    public c L(e eVar) {
        this.f30936n = eVar;
        return this;
    }

    public c M(f fVar) {
        this.f30933k = fVar;
        return this;
    }

    public c N(g gVar) {
        this.f30926d = gVar;
        return this;
    }

    public c O(Boolean bool) {
        this.f30938p = bool;
        return this;
    }

    public c P(h hVar) {
        this.f30927e = hVar;
        return this;
    }

    public c Q(Boolean bool) {
        this.f30935m = bool;
        return this;
    }

    public c R(Uri uri) {
        k.g(uri);
        this.f30923a = uri;
        return this;
    }

    public Boolean S() {
        return this.f30935m;
    }

    public void T() {
        Uri uri = this.f30923a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (com.facebook.common.util.f.o(uri)) {
            if (!this.f30923a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f30923a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f30923a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (com.facebook.common.util.f.j(this.f30923a) && !this.f30923a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public b a() {
        T();
        return new b(this);
    }

    public B7.b c() {
        return this.f30937o;
    }

    public b.EnumC0484b d() {
        return this.f30929g;
    }

    public int e() {
        return this.f30925c;
    }

    public int f() {
        return this.f30940r;
    }

    public String g() {
        return this.f30941s;
    }

    public EnumC1050n h() {
        return this.f30939q;
    }

    public B7.d i() {
        return this.f30928f;
    }

    public boolean j() {
        return this.f30932j;
    }

    public b.c k() {
        return this.f30924b;
    }

    public d l() {
        return this.f30934l;
    }

    public e m() {
        return this.f30936n;
    }

    public f n() {
        return this.f30933k;
    }

    public g o() {
        return this.f30926d;
    }

    public Boolean p() {
        return this.f30938p;
    }

    public h q() {
        return this.f30927e;
    }

    public Uri r() {
        return this.f30923a;
    }

    public boolean t() {
        if ((this.f30925c & 48) == 0) {
            return com.facebook.common.util.f.p(this.f30923a) || s(this.f30923a);
        }
        return false;
    }

    public boolean u() {
        return this.f30931i;
    }

    public boolean v() {
        return (this.f30925c & 15) == 0;
    }

    public boolean w() {
        return this.f30930h;
    }

    public c y(boolean z10) {
        return z10 ? P(h.d()) : P(h.g());
    }

    public c z(B7.b bVar) {
        this.f30937o = bVar;
        return this;
    }
}
