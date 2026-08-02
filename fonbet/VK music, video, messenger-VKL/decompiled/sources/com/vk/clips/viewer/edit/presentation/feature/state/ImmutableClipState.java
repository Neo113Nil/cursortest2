package com.vk.clips.viewer.edit.presentation.feature.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.upload.edit.api.preview.PreviewThumbs;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.air;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.vby;

/* compiled from: ImmutableClipState.kt */
/* loaded from: classes17.dex */
public final class ImmutableClipState implements Parcelable {
    public static final Parcelable.Creator<ImmutableClipState> CREATOR = new a();
    public final String b;
    public final UserId c;
    public final UserId d;
    public final String e;
    public final ClipEditSdkCoverImage f;
    public final VideoUrlPack g;
    public final int h;
    public final int i;
    public final PreviewThumbs j;
    public final SdkClipOrdData k;
    public final AttachedVideo l;
    public final List<ClipCoauthorSdkItem> m;
    public final String n;

    /* compiled from: ImmutableClipState.kt */
    public interface AttachedVideo extends Parcelable {

        /* compiled from: ImmutableClipState.kt */
        public static final class Full implements AttachedVideo {
            public static final Parcelable.Creator<Full> CREATOR = new a();
            public final SdkActionLink b;
            public final String c;

            /* compiled from: ImmutableClipState.kt */
            public static final class a implements Parcelable.Creator<Full> {
                @Override // android.os.Parcelable.Creator
                public final Full createFromParcel(Parcel parcel) {
                    return new Full((SdkActionLink) parcel.readParcelable(Full.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Full[] newArray(int i) {
                    return new Full[i];
                }
            }

            public Full(SdkActionLink sdkActionLink) {
                this.b = sdkActionLink;
                this.c = sdkActionLink.b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Full) && epx.f(this.b, ((Full) obj).b);
            }

            @Override // com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState.AttachedVideo
            public final String getId() {
                return this.c;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Full(actionButton=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }
        }

        /* compiled from: ImmutableClipState.kt */
        @vby
        public static final class RawId implements AttachedVideo {
            public static final Parcelable.Creator<RawId> CREATOR = new a();
            public final String b;

            /* compiled from: ImmutableClipState.kt */
            public static final class a implements Parcelable.Creator<RawId> {
                @Override // android.os.Parcelable.Creator
                public final RawId createFromParcel(Parcel parcel) {
                    return new RawId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final RawId[] newArray(int i) {
                    return new RawId[i];
                }
            }

            public /* synthetic */ RawId(String str) {
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof RawId) {
                    return epx.f(this.b, ((RawId) obj).b);
                }
                return false;
            }

            @Override // com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState.AttachedVideo
            public final String getId() {
                return this.b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return air.b(')', "RawId(id=", this.b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        String getId();
    }

    /* compiled from: ImmutableClipState.kt */
    public static final class a implements Parcelable.Creator<ImmutableClipState> {
        @Override // android.os.Parcelable.Creator
        public final ImmutableClipState createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(ImmutableClipState.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(ImmutableClipState.class.getClassLoader());
            String readString2 = parcel.readString();
            ClipEditSdkCoverImage createFromParcel = ClipEditSdkCoverImage.CREATOR.createFromParcel(parcel);
            VideoUrlPack videoUrlPack = (VideoUrlPack) parcel.readParcelable(ImmutableClipState.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            PreviewThumbs previewThumbs = (PreviewThumbs) parcel.readParcelable(ImmutableClipState.class.getClassLoader());
            SdkClipOrdData sdkClipOrdData = (SdkClipOrdData) parcel.readParcelable(ImmutableClipState.class.getClassLoader());
            AttachedVideo attachedVideo = (AttachedVideo) parcel.readParcelable(ImmutableClipState.class.getClassLoader());
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (true) {
                String str = readString;
                if (i == readInt3) {
                    return new ImmutableClipState(readString, userId, userId2, readString2, createFromParcel, videoUrlPack, readInt, readInt2, previewThumbs, sdkClipOrdData, attachedVideo, arrayList, parcel.readString());
                }
                i = bo.b(ImmutableClipState.class, parcel, arrayList, i, 1);
                readString = str;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final ImmutableClipState[] newArray(int i) {
            return new ImmutableClipState[i];
        }
    }

    public ImmutableClipState(String str, UserId userId, UserId userId2, String str2, ClipEditSdkCoverImage clipEditSdkCoverImage, VideoUrlPack videoUrlPack, int i, int i2, PreviewThumbs previewThumbs, SdkClipOrdData sdkClipOrdData, AttachedVideo attachedVideo, List<ClipCoauthorSdkItem> list, String str3) {
        this.b = str;
        this.c = userId;
        this.d = userId2;
        this.e = str2;
        this.f = clipEditSdkCoverImage;
        this.g = videoUrlPack;
        this.h = i;
        this.i = i2;
        this.j = previewThumbs;
        this.k = sdkClipOrdData;
        this.l = attachedVideo;
        this.m = list;
        this.n = str3;
    }

    public static ImmutableClipState a(ImmutableClipState immutableClipState, String str, ClipEditSdkCoverImage clipEditSdkCoverImage, SdkClipOrdData sdkClipOrdData, AttachedVideo attachedVideo, List list, int i) {
        String str2 = immutableClipState.b;
        UserId userId = immutableClipState.c;
        UserId userId2 = immutableClipState.d;
        ClipEditSdkCoverImage clipEditSdkCoverImage2 = (i & 16) != 0 ? immutableClipState.f : clipEditSdkCoverImage;
        VideoUrlPack videoUrlPack = immutableClipState.g;
        int i2 = immutableClipState.h;
        int i3 = immutableClipState.i;
        PreviewThumbs previewThumbs = immutableClipState.j;
        String str3 = immutableClipState.n;
        immutableClipState.getClass();
        return new ImmutableClipState(str2, userId, userId2, str, clipEditSdkCoverImage2, videoUrlPack, i2, i3, previewThumbs, sdkClipOrdData, attachedVideo, list, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableClipState)) {
            return false;
        }
        ImmutableClipState immutableClipState = (ImmutableClipState) obj;
        return epx.f(this.b, immutableClipState.b) && epx.f(this.c, immutableClipState.c) && epx.f(this.d, immutableClipState.d) && epx.f(this.e, immutableClipState.e) && epx.f(this.f, immutableClipState.f) && epx.f(this.g, immutableClipState.g) && this.h == immutableClipState.h && this.i == immutableClipState.i && epx.f(this.j, immutableClipState.j) && epx.f(this.k, immutableClipState.k) && epx.f(this.l, immutableClipState.l) && epx.f(this.m, immutableClipState.m) && epx.f(this.n, immutableClipState.n);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.b.hashCode() * 31, 31, this.c.b);
        UserId userId = this.d;
        int hashCode = (this.j.hashCode() + shy.a(this.i, shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + urd0.a((a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.e)) * 31)) * 31, 31), 31)) * 31;
        SdkClipOrdData sdkClipOrdData = this.k;
        int hashCode2 = (hashCode + (sdkClipOrdData == null ? 0 : sdkClipOrdData.hashCode())) * 31;
        AttachedVideo attachedVideo = this.l;
        int a3 = fw3.a((hashCode2 + (attachedVideo == null ? 0 : attachedVideo.hashCode())) * 31, 31, this.m);
        String str = this.n;
        return a3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableClipState(videoId=");
        sb.append(this.b);
        sb.append(", vkOwnerId=");
        sb.append(this.c);
        sb.append(", externalOwnerId=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", coverPath=");
        sb.append(this.f);
        sb.append(", videoUrlPack=");
        sb.append(this.g);
        sb.append(", videoWidth=");
        sb.append(this.h);
        sb.append(", videoHeight=");
        sb.append(this.i);
        sb.append(", thumbs=");
        sb.append(this.j);
        sb.append(", ordData=");
        sb.append(this.k);
        sb.append(", attachedVideo=");
        sb.append(this.l);
        sb.append(", selectedCoauthors=");
        sb.append(this.m);
        sb.append(", trackCode=");
        return ho8.a(sb, this.n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        this.f.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
        Iterator a2 = ao.a(parcel, this.m);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.n);
    }
}
