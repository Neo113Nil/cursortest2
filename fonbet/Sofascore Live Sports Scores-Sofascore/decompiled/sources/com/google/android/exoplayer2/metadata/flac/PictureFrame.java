package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.d1c;
import defpackage.dmi;
import defpackage.lik;
import defpackage.n6c;
import defpackage.nkk;
import defpackage.xp2;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new d1c(16);
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public PictureFrame(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = lik.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
    }

    public static PictureFrame a(nkk nkkVar) {
        int f = nkkVar.f();
        String q = nkkVar.q(nkkVar.f(), xp2.a);
        String q2 = nkkVar.q(nkkVar.f(), xp2.c);
        int f2 = nkkVar.f();
        int f3 = nkkVar.f();
        int f4 = nkkVar.f();
        int f5 = nkkVar.f();
        int f6 = nkkVar.f();
        byte[] bArr = new byte[f6];
        nkkVar.e(bArr, 0, f6);
        return new PictureFrame(f, q, q2, f2, f3, f4, f5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void e(n6c n6cVar) {
        n6cVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.a == pictureFrame.a && this.b.equals(pictureFrame.b) && this.c.equals(pictureFrame.c) && this.d == pictureFrame.d && this.e == pictureFrame.e && this.f == pictureFrame.f && this.g == pictureFrame.g && Arrays.equals(this.h, pictureFrame.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((dmi.c(dmi.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }
}
