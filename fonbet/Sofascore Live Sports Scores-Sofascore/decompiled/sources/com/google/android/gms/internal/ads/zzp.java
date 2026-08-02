package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.dyh;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new dyh(26);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public zzp(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        String str = zzfm.a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzp zzpVar = (zzp) obj;
        return Objects.equals(this.c, zzpVar.c) && Objects.equals(this.d, zzpVar.d) && Objects.equals(this.b, zzpVar.b) && Arrays.equals(this.e, zzpVar.e);
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = Arrays.hashCode(this.e) + dmi.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        this.a = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public zzp(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = null;
        this.d = zzas.h(str);
        this.e = bArr;
    }
}
