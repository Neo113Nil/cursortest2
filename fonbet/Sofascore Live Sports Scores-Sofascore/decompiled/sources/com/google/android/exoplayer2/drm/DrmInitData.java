package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.lik;
import defpackage.nc2;
import defpackage.wd;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new wd(11);
    public final SchemeData[] a;
    public int b;
    public final String c;
    public final int d;

    public DrmInitData(Parcel parcel) {
        this.c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = lik.a;
        this.a = schemeDataArr;
        this.d = schemeDataArr.length;
    }

    public final DrmInitData a(String str) {
        return lik.a(this.c, str) ? this : new DrmInitData(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = nc2.a;
        return uuid.equals(schemeData3.b) ? uuid.equals(schemeData4.b) ? 0 : 1 : schemeData3.b.compareTo(schemeData4.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (lik.a(this.c, drmInitData.c) && Arrays.equals(this.a, drmInitData.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.a = schemeDataArr;
        this.d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new b();
        public int a;
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] e;

        public SchemeData(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            String readString = parcel.readString();
            int i = lik.a;
            this.d = readString;
            this.e = parcel.createByteArray();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return lik.a(this.c, schemeData.c) && lik.a(this.d, schemeData.d) && lik.a(this.b, schemeData.b) && Arrays.equals(this.e, schemeData.e);
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

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.b = uuid;
            this.c = str;
            str2.getClass();
            this.d = str2;
            this.e = bArr;
        }
    }
}
