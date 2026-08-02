package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import defpackage.dmi;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();
    public int a;
    public final UUID b;
    public final String c;
    public final byte[] d;
    public final boolean e;

    public c(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        this.d = parcel.createByteArray();
        this.e = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.c.equals(cVar.c) && z.a(this.b, cVar.b) && Arrays.equals(this.d, cVar.d);
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.d) + dmi.c(this.b.hashCode() * 31, 31, this.c);
        this.a = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b.getMostSignificantBits());
        parcel.writeLong(this.b.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        bArr.getClass();
        this.d = bArr;
        this.e = false;
    }
}
