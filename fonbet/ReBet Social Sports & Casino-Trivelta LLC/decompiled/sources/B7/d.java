package B7;

import D6.i;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: m, reason: collision with root package name */
    public static final d f818m = b().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f820b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f821c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f822d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f823e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f824f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f825g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f826h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f827i;

    /* renamed from: j, reason: collision with root package name */
    public final F7.c f828j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorSpace f829k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f830l;

    public d(e eVar) {
        this.f819a = eVar.l();
        this.f820b = eVar.k();
        this.f821c = eVar.h();
        this.f822d = eVar.n();
        this.f823e = eVar.m();
        this.f824f = eVar.g();
        this.f825g = eVar.j();
        this.f826h = eVar.c();
        this.f827i = eVar.b();
        this.f828j = eVar.f();
        eVar.d();
        this.f829k = eVar.e();
        this.f830l = eVar.i();
    }

    public static d a() {
        return f818m;
    }

    public static e b() {
        return new e();
    }

    public i.a c() {
        return D6.i.b(this).a("minDecodeIntervalMs", this.f819a).a("maxDimensionPx", this.f820b).c("decodePreviewFrame", this.f821c).c("useLastFrameForPreview", this.f822d).c("useEncodedImageForPreview", this.f823e).c("decodeAllFrames", this.f824f).c("forceStaticImage", this.f825g).b("bitmapConfigName", this.f826h.name()).b("animatedBitmapConfigName", this.f827i.name()).b("customImageDecoder", this.f828j).b("bitmapTransformation", null).b("colorSpace", this.f829k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f819a != dVar.f819a || this.f820b != dVar.f820b || this.f821c != dVar.f821c || this.f822d != dVar.f822d || this.f823e != dVar.f823e || this.f824f != dVar.f824f || this.f825g != dVar.f825g) {
            return false;
        }
        boolean z10 = this.f830l;
        if (z10 || this.f826h == dVar.f826h) {
            return (z10 || this.f827i == dVar.f827i) && this.f828j == dVar.f828j && this.f829k == dVar.f829k;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((((((this.f819a * 31) + this.f820b) * 31) + (this.f821c ? 1 : 0)) * 31) + (this.f822d ? 1 : 0)) * 31) + (this.f823e ? 1 : 0)) * 31) + (this.f824f ? 1 : 0)) * 31) + (this.f825g ? 1 : 0);
        if (!this.f830l) {
            i10 = (i10 * 31) + this.f826h.ordinal();
        }
        if (!this.f830l) {
            int i11 = i10 * 31;
            Bitmap.Config config = this.f827i;
            i10 = i11 + (config != null ? config.ordinal() : 0);
        }
        int i12 = i10 * 31;
        F7.c cVar = this.f828j;
        int hashCode = (i12 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f829k;
        return hashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
