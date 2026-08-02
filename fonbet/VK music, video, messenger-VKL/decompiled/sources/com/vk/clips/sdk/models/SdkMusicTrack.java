package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: SdkMusicTrack.kt */
/* loaded from: classes17.dex */
public final class SdkMusicTrack implements Parcelable {
    public static final Parcelable.Creator<SdkMusicTrack> CREATOR = new a();
    public final String b;
    public final UserId c;
    public final SdkImages d;
    public final List<SdkArtist> e;
    public final List<SdkArtist> f;
    public final String g;
    public final String h;
    public final String i;
    public final Parcelable j;
    public final boolean k;
    public final Parcelable l;

    /* compiled from: SdkMusicTrack.kt */
    public static final class a implements Parcelable.Creator<SdkMusicTrack> {
        @Override // android.os.Parcelable.Creator
        public final SdkMusicTrack createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(SdkMusicTrack.class.getClassLoader());
            SdkImages createFromParcel = parcel.readInt() == 0 ? null : SdkImages.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SdkArtist.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(SdkArtist.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            ArrayList arrayList3 = arrayList;
            String readString4 = parcel.readString();
            Parcelable readParcelable = parcel.readParcelable(SdkMusicTrack.class.getClassLoader());
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new SdkMusicTrack(readString, userId, createFromParcel, arrayList3, arrayList2, readString2, readString3, readString4, readParcelable, z, parcel.readParcelable(SdkMusicTrack.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SdkMusicTrack[] newArray(int i) {
            return new SdkMusicTrack[i];
        }
    }

    public SdkMusicTrack(String str, UserId userId, SdkImages sdkImages, List<SdkArtist> list, List<SdkArtist> list2, String str2, String str3, String str4, Parcelable parcelable, boolean z, Parcelable parcelable2) {
        this.b = str;
        this.c = userId;
        this.d = sdkImages;
        this.e = list;
        this.f = list2;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = parcelable;
        this.k = z;
        this.l = parcelable2;
    }

    public final boolean d() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkMusicTrack)) {
            return false;
        }
        SdkMusicTrack sdkMusicTrack = (SdkMusicTrack) obj;
        return epx.f(this.b, sdkMusicTrack.b) && epx.f(this.c, sdkMusicTrack.c) && epx.f(this.d, sdkMusicTrack.d) && epx.f(this.e, sdkMusicTrack.e) && epx.f(this.f, sdkMusicTrack.f) && epx.f(this.g, sdkMusicTrack.g) && epx.f(this.h, sdkMusicTrack.h) && epx.f(this.i, sdkMusicTrack.i) && epx.f(this.j, sdkMusicTrack.j) && this.k == sdkMusicTrack.k && epx.f(this.l, sdkMusicTrack.l);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.b.hashCode() * 31, 31, this.c.b);
        SdkImages sdkImages = this.d;
        int hashCode = (a2 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        List<SdkArtist> list = this.e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SdkArtist> list2 = this.f;
        int a3 = urd0.a((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int hashCode3 = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Parcelable parcelable = this.j;
        int b = qoy.b((hashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.k);
        Parcelable parcelable2 = this.l;
        return b + (parcelable2 != null ? parcelable2.hashCode() : 0);
    }

    public final String toString() {
        return "SdkMusicTrack(title=" + this.b + ", ownerId=" + this.c + ", images=" + this.d + ", mainArtists=" + this.e + ", featuredArtists=" + this.f + ", artistNameFallback=" + this.g + ", subtitle=" + this.h + ", originalSoundVideoId=" + this.i + ", album=" + this.j + ", isTrend=" + this.k + ", extendedModel=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        SdkImages sdkImages = this.d;
        if (sdkImages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkImages.writeToParcel(parcel, i);
        }
        List<SdkArtist> list = this.e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((SdkArtist) f.next()).writeToParcel(parcel, i);
            }
        }
        List<SdkArtist> list2 = this.f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((SdkArtist) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeParcelable(this.l, i);
    }
}
