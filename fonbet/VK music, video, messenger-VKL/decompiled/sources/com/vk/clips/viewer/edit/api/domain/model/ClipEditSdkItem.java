package com.vk.clips.viewer.edit.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: ClipEditSdkItem.kt */
/* loaded from: classes17.dex */
public final class ClipEditSdkItem implements Parcelable {
    public static final Parcelable.Creator<ClipEditSdkItem> CREATOR = new a();
    public final String b;
    public final UserId c;
    public final UserId d;
    public final VideoUrlPack e;
    public final int f;
    public final int g;
    public final String h;
    public final SdkImages i;
    public final ClipEditSdkThumbsItem j;
    public final SdkClipOrdData k;
    public final ClipEditAttachedVideo l;
    public final List<ClipCoauthorSdkItem> m;
    public final boolean n;
    public final boolean o;
    public final String p;

    /* compiled from: ClipEditSdkItem.kt */
    public static final class a implements Parcelable.Creator<ClipEditSdkItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkItem createFromParcel(Parcel parcel) {
            String str;
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(ClipEditSdkItem.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(ClipEditSdkItem.class.getClassLoader());
            VideoUrlPack videoUrlPack = (VideoUrlPack) parcel.readParcelable(ClipEditSdkItem.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            SdkImages sdkImages = (SdkImages) parcel.readParcelable(ClipEditSdkItem.class.getClassLoader());
            ClipEditSdkThumbsItem createFromParcel = ClipEditSdkThumbsItem.CREATOR.createFromParcel(parcel);
            SdkClipOrdData sdkClipOrdData = (SdkClipOrdData) parcel.readParcelable(ClipEditSdkItem.class.getClassLoader());
            ClipEditAttachedVideo clipEditAttachedVideo = (ClipEditAttachedVideo) parcel.readParcelable(ClipEditSdkItem.class.getClassLoader());
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (true) {
                str = readString;
                if (i == readInt3) {
                    break;
                }
                i = en.a(ClipCoauthorSdkItem.CREATOR, parcel, arrayList, i, 1);
                readString = str;
            }
            return new ClipEditSdkItem(str, userId, userId2, videoUrlPack, readInt, readInt2, readString2, sdkImages, createFromParcel, sdkClipOrdData, clipEditAttachedVideo, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkItem[] newArray(int i) {
            return new ClipEditSdkItem[i];
        }
    }

    public ClipEditSdkItem(String str, UserId userId, UserId userId2, VideoUrlPack videoUrlPack, int i, int i2, String str2, SdkImages sdkImages, ClipEditSdkThumbsItem clipEditSdkThumbsItem, SdkClipOrdData sdkClipOrdData, ClipEditAttachedVideo clipEditAttachedVideo, List<ClipCoauthorSdkItem> list, boolean z, boolean z2, String str3) {
        this.b = str;
        this.c = userId;
        this.d = userId2;
        this.e = videoUrlPack;
        this.f = i;
        this.g = i2;
        this.h = str2;
        this.i = sdkImages;
        this.j = clipEditSdkThumbsItem;
        this.k = sdkClipOrdData;
        this.l = clipEditAttachedVideo;
        this.m = list;
        this.n = z;
        this.o = z2;
        this.p = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipEditSdkItem)) {
            return false;
        }
        ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) obj;
        return epx.f(this.b, clipEditSdkItem.b) && epx.f(this.c, clipEditSdkItem.c) && epx.f(this.d, clipEditSdkItem.d) && epx.f(this.e, clipEditSdkItem.e) && this.f == clipEditSdkItem.f && this.g == clipEditSdkItem.g && epx.f(this.h, clipEditSdkItem.h) && epx.f(this.i, clipEditSdkItem.i) && epx.f(this.j, clipEditSdkItem.j) && epx.f(this.k, clipEditSdkItem.k) && epx.f(this.l, clipEditSdkItem.l) && epx.f(this.m, clipEditSdkItem.m) && this.n == clipEditSdkItem.n && this.o == clipEditSdkItem.o && epx.f(this.p, clipEditSdkItem.p);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.b.hashCode() * 31, 31, this.c.b);
        UserId userId = this.d;
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + urd0.a(shy.a(this.g, shy.a(this.f, (this.e.hashCode() + ((a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31)) * 31, 31), 31), 31, this.h)) * 31)) * 31;
        SdkClipOrdData sdkClipOrdData = this.k;
        int hashCode2 = (hashCode + (sdkClipOrdData == null ? 0 : sdkClipOrdData.hashCode())) * 31;
        ClipEditAttachedVideo clipEditAttachedVideo = this.l;
        int b = qoy.b(qoy.b(fw3.a((hashCode2 + (clipEditAttachedVideo == null ? 0 : clipEditAttachedVideo.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o);
        String str = this.p;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipEditSdkItem(videoId=");
        sb.append(this.b);
        sb.append(", vkOwnerId=");
        sb.append(this.c);
        sb.append(", externalOwnerId=");
        sb.append(this.d);
        sb.append(", videoUrlPack=");
        sb.append(this.e);
        sb.append(", videoWidth=");
        sb.append(this.f);
        sb.append(", videoHeight=");
        sb.append(this.g);
        sb.append(", description=");
        sb.append(this.h);
        sb.append(", coverImage=");
        sb.append(this.i);
        sb.append(", timelineThumbs=");
        sb.append(this.j);
        sb.append(", ordItem=");
        sb.append(this.k);
        sb.append(", attachedVideo=");
        sb.append(this.l);
        sb.append(", coauthorItems=");
        sb.append(this.m);
        sb.append(", isClipOpenToAll=");
        sb.append(this.n);
        sb.append(", isAuthorProfileOpen=");
        sb.append(this.o);
        sb.append(", trackCode=");
        return ho8.a(sb, this.p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        this.j.writeToParcel(parcel, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
        Iterator a2 = ao.a(parcel, this.m);
        while (a2.hasNext()) {
            ((ClipCoauthorSdkItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeString(this.p);
    }
}
