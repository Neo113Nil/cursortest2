package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.me4;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();

    @NonNull
    @SafeParcelable.Field
    public String afmaVersion;

    @SafeParcelable.Field
    public int buddyApkVersion;

    @SafeParcelable.Field
    public int clientJarVersion;

    @SafeParcelable.Field
    public boolean isClientJar;

    @SafeParcelable.Field
    public boolean isLiteSdk;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VersionInfoParcel(int i, int i2, boolean z, boolean z2, boolean z3) {
        this(mz1.o(r0, ".", r13), i, i2, z, z3);
        String str = z ? "0" : z2 ? "2" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + String.valueOf(i).length() + 13 + 2);
        me4.r(sb, "afma-sdk-a-v", i, ".", i2);
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.afmaVersion, false);
        int i2 = this.buddyApkVersion;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.clientJarVersion;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i3);
        boolean z = this.isClientJar;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.isLiteSdk;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public VersionInfoParcel(int i, int i2, boolean z, boolean z2) {
        this(i, i2, z, false, z2);
    }

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public VersionInfoParcel(String str, int i, int i2, boolean z, boolean z2) {
        this.afmaVersion = str;
        this.buddyApkVersion = i;
        this.clientJarVersion = i2;
        this.isClientJar = z;
        this.isLiteSdk = z2;
    }
}
