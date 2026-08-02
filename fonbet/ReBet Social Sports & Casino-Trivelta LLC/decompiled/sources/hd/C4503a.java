package hd;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: hd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4503a {

    /* renamed from: a, reason: collision with root package name */
    public int f47876a;

    /* renamed from: b, reason: collision with root package name */
    public int f47877b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.CompressFormat f47878c;

    /* renamed from: d, reason: collision with root package name */
    public int f47879d;

    /* renamed from: e, reason: collision with root package name */
    public String f47880e;

    /* renamed from: f, reason: collision with root package name */
    public String f47881f;

    /* renamed from: g, reason: collision with root package name */
    public C4504b f47882g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f47883h;

    /* renamed from: i, reason: collision with root package name */
    public Uri f47884i;

    public C4503a(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12, String str, String str2, C4504b c4504b) {
        this.f47876a = i10;
        this.f47877b = i11;
        this.f47878c = compressFormat;
        this.f47879d = i12;
        this.f47880e = str;
        this.f47881f = str2;
        this.f47882g = c4504b;
    }

    public Bitmap.CompressFormat a() {
        return this.f47878c;
    }

    public int b() {
        return this.f47879d;
    }

    public Uri c() {
        return this.f47883h;
    }

    public Uri d() {
        return this.f47884i;
    }

    public C4504b e() {
        return this.f47882g;
    }

    public String f() {
        return this.f47880e;
    }

    public String g() {
        return this.f47881f;
    }

    public int h() {
        return this.f47876a;
    }

    public int i() {
        return this.f47877b;
    }

    public void j(Uri uri) {
        this.f47883h = uri;
    }

    public void k(Uri uri) {
        this.f47884i = uri;
    }
}
