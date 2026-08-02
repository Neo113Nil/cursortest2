package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3545kb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.getClass();
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        String str = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String str2 = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        String str3 = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        String str4 = readString4 == null ? "" : readString4;
        String readString5 = parcel.readString();
        String str5 = readString5 == null ? "" : readString5;
        String readString6 = parcel.readString();
        String str6 = readString6 == null ? "" : readString6;
        boolean z = parcel.readByte() != 0;
        String readString7 = parcel.readString();
        C3597mb c3597mb = new C3597mb(readLong, str, str2, str3, str4, str5, str6, z, readString7 == null ? "" : readString7);
        String readString8 = parcel.readString();
        C3571lb c3571lb = new C3571lb(c3597mb, readString8 == null ? "" : readString8, parcel.readInt(), parcel.readLong());
        c3571lb.e = parcel.readInt();
        c3571lb.f = parcel.readString();
        return c3571lb;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C3571lb[i];
    }
}
