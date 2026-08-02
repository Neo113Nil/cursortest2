package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class D implements Parcelable {

    @NotNull
    public static final C CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15301a;

    /* renamed from: b, reason: collision with root package name */
    public final F f15302b;

    public D(boolean z5, F f6) {
        this.f15301a = z5;
        this.f15302b = f6;
    }

    public final F a() {
        return this.f15302b;
    }

    public final boolean b() {
        return this.f15301a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f15301a + ", config=" + this.f15302b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.f15301a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f15302b, i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(j0 j0Var) {
        this(r0, r3 != null ? new F(r3) : null);
        boolean b10 = j0Var.b();
        k0 a7 = j0Var.a();
    }
}
