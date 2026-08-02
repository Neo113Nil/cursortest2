package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class F implements Parcelable {

    @NotNull
    public static final E CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final C0690z f15303a;

    /* renamed from: b, reason: collision with root package name */
    public final H f15304b;

    /* renamed from: c, reason: collision with root package name */
    public final B f15305c;

    public F(C0690z c0690z, H h10, B b10) {
        this.f15303a = c0690z;
        this.f15304b = h10;
        this.f15305c = b10;
    }

    public final C0690z a() {
        return this.f15303a;
    }

    public final B b() {
        return this.f15305c;
    }

    public final H c() {
        return this.f15304b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f15303a + ", serviceCaptorConfig=" + this.f15304b + ", contentObserverCaptorConfig=" + this.f15305c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f15303a, i5);
        parcel.writeParcelable(this.f15304b, i5);
        parcel.writeParcelable(this.f15305c, i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(k0 k0Var) {
        this(r2, r3, r5 != null ? new B(r5) : null);
        h0 a7 = k0Var.a();
        C0690z c0690z = a7 != null ? new C0690z(a7) : null;
        l0 c2 = k0Var.c();
        H h10 = c2 != null ? new H(c2) : null;
        i0 b10 = k0Var.b();
    }
}
