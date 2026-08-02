package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690z implements Parcelable {

    @NotNull
    public static final C0689y CREATOR = new C0689y();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15402a;

    public C0690z(boolean z5) {
        this.f15402a = z5;
    }

    public final boolean a() {
        return this.f15402a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f15402a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.f15402a ? (byte) 1 : (byte) 0);
    }

    public C0690z(h0 h0Var) {
        this(h0Var.a());
    }
}
