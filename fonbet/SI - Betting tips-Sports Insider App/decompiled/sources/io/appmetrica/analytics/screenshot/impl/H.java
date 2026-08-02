package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class H implements Parcelable {

    @NotNull
    public static final G CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15306a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15307b;

    public H(boolean z5, long j) {
        this.f15306a = z5;
        this.f15307b = j;
    }

    public final long a() {
        return this.f15307b;
    }

    public final boolean b() {
        return this.f15306a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParcelableServiceCaptorConfig(enabled=");
        sb2.append(this.f15306a);
        sb2.append(", delaySeconds=");
        return d9.e.j(sb2, this.f15307b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.f15306a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15307b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
