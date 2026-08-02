package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.morphing.AudioMorphingTypeStat;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: ClipsUploadUnmodifiableData.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadUnmodifiableData implements Parcelable {
    public static final Parcelable.Creator<ClipsUploadUnmodifiableData> CREATOR = new a();
    public final int b;
    public final String c;
    public final int d;
    public final AudioMorphingTypeStat e;
    public final List<MaskLight> f;
    public final ClipTemplateInfo g;
    public final ClickableStickers h;
    public final String i;
    public final VideoToClipInfo j;
    public final VideoTemplatePublishInfo k;
    public final ClipUploadParams.LicensedAudioInfo l;
    public final StoryStatContainer m;
    public final Integer n;
    public final String o;
    public final int p;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType q;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final List<ClipsVideoItemLocation> x;

    /* compiled from: ClipsUploadUnmodifiableData.kt */
    public static final class a implements Parcelable.Creator<ClipsUploadUnmodifiableData> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final ClipsUploadUnmodifiableData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AudioMorphingTypeStat audioMorphingTypeStat;
            boolean z;
            String str;
            boolean z2;
            int i;
            VideoToClipInfo videoToClipInfo;
            Integer num;
            MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType;
            boolean z3;
            AudioMorphingTypeStat audioMorphingTypeStat2;
            boolean z4;
            int i2;
            ArrayList arrayList2;
            String str2;
            int i3;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            AudioMorphingTypeStat audioMorphingTypeStat3 = (AudioMorphingTypeStat) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(ClipsUploadUnmodifiableData.class, parcel, arrayList, i4, 1);
                }
            }
            ClipTemplateInfo clipTemplateInfo = (ClipTemplateInfo) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            ClickableStickers clickableStickers = (ClickableStickers) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            String readString2 = parcel.readString();
            VideoToClipInfo videoToClipInfo2 = (VideoToClipInfo) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            VideoTemplatePublishInfo videoTemplatePublishInfo = (VideoTemplatePublishInfo) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            ClipUploadParams.LicensedAudioInfo licensedAudioInfo = (ClipUploadParams.LicensedAudioInfo) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            StoryStatContainer storyStatContainer = (StoryStatContainer) parcel.readParcelable(ClipsUploadUnmodifiableData.class.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList3 = arrayList;
            String readString3 = parcel.readString();
            int readInt4 = parcel.readInt();
            MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType valueOf2 = MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.valueOf(parcel.readString());
            MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType valueOf3 = parcel.readInt() == 0 ? null : MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                audioMorphingTypeStat = audioMorphingTypeStat3;
                z = true;
            } else {
                audioMorphingTypeStat = audioMorphingTypeStat3;
                z = false;
            }
            if (parcel.readInt() != 0) {
                str = readString2;
                z2 = true;
            } else {
                str = readString2;
                z2 = false;
            }
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                i = 0;
                videoToClipInfo = videoToClipInfo2;
                num = valueOf;
                duetType = valueOf3;
                z3 = true;
            } else {
                i = 0;
                videoToClipInfo = videoToClipInfo2;
                num = valueOf;
                duetType = valueOf3;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                audioMorphingTypeStat2 = audioMorphingTypeStat;
                z4 = 1;
            } else {
                audioMorphingTypeStat2 = audioMorphingTypeStat;
                z4 = i;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                i2 = readInt;
                arrayList2 = new ArrayList(readInt5);
                str2 = readString;
                int i5 = i;
                while (true) {
                    i3 = readInt2;
                    if (i5 == readInt5) {
                        break;
                    }
                    i5 = bo.b(ClipsUploadUnmodifiableData.class, parcel, arrayList2, i5, 1);
                    readInt2 = i3;
                }
            } else {
                i2 = readInt;
                str2 = readString;
                arrayList2 = null;
                i3 = readInt2;
            }
            return new ClipsUploadUnmodifiableData(i2, str2, i3, audioMorphingTypeStat2, arrayList3, clipTemplateInfo, clickableStickers, str, videoToClipInfo, videoTemplatePublishInfo, licensedAudioInfo, storyStatContainer, num, readString3, readInt4, valueOf2, duetType, z, z2, z5, z3, z4, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadUnmodifiableData[] newArray(int i) {
            return new ClipsUploadUnmodifiableData[i];
        }
    }

    public ClipsUploadUnmodifiableData(int i, String str, int i2, AudioMorphingTypeStat audioMorphingTypeStat, List<MaskLight> list, ClipTemplateInfo clipTemplateInfo, ClickableStickers clickableStickers, String str2, VideoToClipInfo videoToClipInfo, VideoTemplatePublishInfo videoTemplatePublishInfo, ClipUploadParams.LicensedAudioInfo licensedAudioInfo, StoryStatContainer storyStatContainer, Integer num, String str3, int i3, MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType cameraType, MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<ClipsVideoItemLocation> list2) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = audioMorphingTypeStat;
        this.f = list;
        this.g = clipTemplateInfo;
        this.h = clickableStickers;
        this.i = str2;
        this.j = videoToClipInfo;
        this.k = videoTemplatePublishInfo;
        this.l = licensedAudioInfo;
        this.m = storyStatContainer;
        this.n = num;
        this.o = str3;
        this.p = i3;
        this.q = cameraType;
        this.r = duetType;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = z4;
        this.w = z5;
        this.x = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsUploadUnmodifiableData)) {
            return false;
        }
        ClipsUploadUnmodifiableData clipsUploadUnmodifiableData = (ClipsUploadUnmodifiableData) obj;
        return this.b == clipsUploadUnmodifiableData.b && epx.f(this.c, clipsUploadUnmodifiableData.c) && this.d == clipsUploadUnmodifiableData.d && epx.f(this.e, clipsUploadUnmodifiableData.e) && epx.f(this.f, clipsUploadUnmodifiableData.f) && epx.f(this.g, clipsUploadUnmodifiableData.g) && epx.f(this.h, clipsUploadUnmodifiableData.h) && epx.f(this.i, clipsUploadUnmodifiableData.i) && epx.f(this.j, clipsUploadUnmodifiableData.j) && epx.f(this.k, clipsUploadUnmodifiableData.k) && epx.f(this.l, clipsUploadUnmodifiableData.l) && epx.f(this.m, clipsUploadUnmodifiableData.m) && epx.f(this.n, clipsUploadUnmodifiableData.n) && epx.f(this.o, clipsUploadUnmodifiableData.o) && this.p == clipsUploadUnmodifiableData.p && this.q == clipsUploadUnmodifiableData.q && this.r == clipsUploadUnmodifiableData.r && this.s == clipsUploadUnmodifiableData.s && this.t == clipsUploadUnmodifiableData.t && this.u == clipsUploadUnmodifiableData.u && this.v == clipsUploadUnmodifiableData.v && this.w == clipsUploadUnmodifiableData.w && epx.f(this.x, clipsUploadUnmodifiableData.x);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31);
        AudioMorphingTypeStat audioMorphingTypeStat = this.e;
        int hashCode = (a2 + (audioMorphingTypeStat == null ? 0 : audioMorphingTypeStat.b.hashCode())) * 31;
        List<MaskLight> list = this.f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ClipTemplateInfo clipTemplateInfo = this.g;
        int hashCode3 = (hashCode2 + (clipTemplateInfo == null ? 0 : clipTemplateInfo.hashCode())) * 31;
        ClickableStickers clickableStickers = this.h;
        int hashCode4 = (hashCode3 + (clickableStickers == null ? 0 : clickableStickers.hashCode())) * 31;
        String str = this.i;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        VideoToClipInfo videoToClipInfo = this.j;
        int hashCode6 = (hashCode5 + (videoToClipInfo == null ? 0 : videoToClipInfo.hashCode())) * 31;
        VideoTemplatePublishInfo videoTemplatePublishInfo = this.k;
        int hashCode7 = (hashCode6 + (videoTemplatePublishInfo == null ? 0 : videoTemplatePublishInfo.hashCode())) * 31;
        ClipUploadParams.LicensedAudioInfo licensedAudioInfo = this.l;
        int hashCode8 = (hashCode7 + (licensedAudioInfo == null ? 0 : licensedAudioInfo.hashCode())) * 31;
        StoryStatContainer storyStatContainer = this.m;
        int hashCode9 = (hashCode8 + (storyStatContainer == null ? 0 : storyStatContainer.hashCode())) * 31;
        Integer num = this.n;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.o;
        int hashCode11 = (this.q.hashCode() + shy.a(this.p, (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = this.r;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode11 + (duetType == null ? 0 : duetType.hashCode())) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        List<ClipsVideoItemLocation> list2 = this.x;
        return b + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadUnmodifiableData(creationSessionId=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        sb.append(this.c);
        sb.append(", videoLengthMs=");
        sb.append(this.d);
        sb.append(", morphingStat=");
        sb.append(this.e);
        sb.append(", masks=");
        sb.append(this.f);
        sb.append(", clipTemplateInfo=");
        sb.append(this.g);
        sb.append(", clickableContainer=");
        sb.append(this.h);
        sb.append(", duetOriginId=");
        sb.append(this.i);
        sb.append(", videoToClipInfo=");
        sb.append(this.j);
        sb.append(", videoTemplatePublishInfo=");
        sb.append(this.k);
        sb.append(", licensedAudioInfo=");
        sb.append(this.l);
        sb.append(", storyStatContainer=");
        sb.append(this.m);
        sb.append(", miniAppId=");
        sb.append(this.n);
        sb.append(", requestId=");
        sb.append(this.o);
        sb.append(", videoFragmentsCount=");
        sb.append(this.p);
        sb.append(", fragmentsSourceType=");
        sb.append(this.q);
        sb.append(", duetType=");
        sb.append(this.r);
        sb.append(", hasAudioImported=");
        sb.append(this.s);
        sb.append(", hasVoiceOver=");
        sb.append(this.t);
        sb.append(", isVideoSpeedChanged=");
        sb.append(this.u);
        sb.append(", isAudioSpeedChanged=");
        sb.append(this.v);
        sb.append(", shouldUploadImmediately=");
        sb.append(this.w);
        sb.append(", videoItemLocationList=");
        return ms9.a(')', sb, this.x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        List<MaskLight> list = this.f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
        parcel.writeParcelable(this.m, i);
        Integer num = this.n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeString(this.q.name());
        MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = this.r;
        if (duetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(duetType.name());
        }
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        List<ClipsVideoItemLocation> list2 = this.x;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }
}
