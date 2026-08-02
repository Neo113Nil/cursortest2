package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class B implements Parcelable {

    @NotNull
    public static final A CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15298a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15299b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15300c;

    public B(boolean z5, List list, long j) {
        this.f15298a = z5;
        this.f15299b = list;
        this.f15300c = j;
    }

    public final long a() {
        return this.f15300c;
    }

    public final boolean b() {
        return this.f15298a;
    }

    public final List c() {
        return this.f15299b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParcelableContentObserverCaptorConfig(enabled=");
        sb2.append(this.f15298a);
        sb2.append(", mediaStoreColumnNames=");
        sb2.append(this.f15299b);
        sb2.append(", detectWindowSeconds=");
        return d9.e.j(sb2, this.f15300c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.f15298a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f15299b);
        parcel.writeLong(this.f15300c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
