package com.vk.dto.clips.upload;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.bh10;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: ClipsEditorUploadParams.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorUploadParams implements Parcelable {
    public static final Parcelable.Creator<ClipsEditorUploadParams> CREATOR = new a();
    public final String A;
    public final int b;
    public final Location c;
    public final Integer d;
    public final int e;
    public final String f;
    public final String g;
    public final ClipsEditorEntry h;
    public final String i;
    public final LicensedAudioInfo j;
    public final boolean k;
    public final List<MaskLight> l;
    public final List<AudioEffectType> m;
    public final ClipTemplateInfo n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final List<ClipsVideoItemLocation> t;
    public final String u;
    public final String v;
    public final VideoToClipInfo w;
    public final Integer x;
    public final String y;
    public final String z;

    /* compiled from: ClipsEditorUploadParams.kt */
    public static final class LicensedAudioInfo implements Parcelable {
        public static final Parcelable.Creator<LicensedAudioInfo> CREATOR = new a();
        public final int b;
        public final UserId c;
        public final MusicCatalogInfoEditor d;

        /* compiled from: ClipsEditorUploadParams.kt */
        public static final class a implements Parcelable.Creator<LicensedAudioInfo> {
            @Override // android.os.Parcelable.Creator
            public final LicensedAudioInfo createFromParcel(Parcel parcel) {
                return new LicensedAudioInfo(parcel.readInt(), (UserId) parcel.readParcelable(LicensedAudioInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : MusicCatalogInfoEditor.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LicensedAudioInfo[] newArray(int i) {
                return new LicensedAudioInfo[i];
            }
        }

        public LicensedAudioInfo(int i, UserId userId, MusicCatalogInfoEditor musicCatalogInfoEditor) {
            this.b = i;
            this.c = userId;
            this.d = musicCatalogInfoEditor;
            Objects.toString(userId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LicensedAudioInfo)) {
                return false;
            }
            LicensedAudioInfo licensedAudioInfo = (LicensedAudioInfo) obj;
            return this.b == licensedAudioInfo.b && epx.f(this.c, licensedAudioInfo.c) && epx.f(this.d, licensedAudioInfo.d);
        }

        public final int hashCode() {
            int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
            MusicCatalogInfoEditor musicCatalogInfoEditor = this.d;
            return a2 + (musicCatalogInfoEditor == null ? 0 : musicCatalogInfoEditor.hashCode());
        }

        public final String toString() {
            return "LicensedAudioInfo(audioId=" + this.b + ", audioOwnerId=" + this.c + ", catalogInfo=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
            MusicCatalogInfoEditor musicCatalogInfoEditor = this.d;
            if (musicCatalogInfoEditor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                Serializer.StreamParcelable.a.a(musicCatalogInfoEditor, parcel);
            }
        }
    }

    /* compiled from: ClipsEditorUploadParams.kt */
    public static final class a implements Parcelable.Creator<ClipsEditorUploadParams> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // android.os.Parcelable.Creator
        public final ClipsEditorUploadParams createFromParcel(Parcel parcel) {
            Integer valueOf;
            ClipsEditorEntry clipsEditorEntry;
            Object obj;
            ClipsEditorEntry clipsEditorEntry2;
            String str;
            LicensedAudioInfo licensedAudioInfo;
            boolean z;
            ArrayList arrayList;
            int i;
            Location location;
            ArrayList arrayList2;
            Integer num;
            int readInt = parcel.readInt();
            Location location2 = (Location) parcel.readParcelable(ClipsEditorUploadParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
                clipsEditorEntry = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                clipsEditorEntry = null;
            }
            int readInt2 = parcel.readInt();
            ClipsEditorEntry clipsEditorEntry3 = clipsEditorEntry;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ClipsEditorEntry valueOf2 = parcel.readInt() == 0 ? clipsEditorEntry3 : ClipsEditorEntry.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            LicensedAudioInfo licensedAudioInfo2 = (LicensedAudioInfo) (parcel.readInt() == 0 ? clipsEditorEntry3 : LicensedAudioInfo.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                obj = clipsEditorEntry3;
                clipsEditorEntry2 = valueOf2;
                str = readString3;
                licensedAudioInfo = licensedAudioInfo2;
                z = true;
            } else {
                obj = clipsEditorEntry3;
                clipsEditorEntry2 = valueOf2;
                str = readString3;
                licensedAudioInfo = licensedAudioInfo2;
                z = false;
            }
            ?? r11 = obj;
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i2 = 0; i2 != readInt3; i2++) {
                    arrayList3.add(MaskLight.CREATOR.createFromParcel(parcel));
                }
                r11 = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                for (int i3 = 0; i3 != readInt4; i3++) {
                    arrayList4.add(AudioEffectType.valueOf(parcel.readString()));
                }
                arrayList = arrayList4;
            }
            ClipTemplateInfo createFromParcel = parcel.readInt() == 0 ? null : ClipTemplateInfo.CREATOR.createFromParcel(parcel);
            int readInt5 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                i = readInt;
                location = location2;
                num = valueOf;
                arrayList2 = null;
            } else {
                i = readInt;
                int readInt6 = parcel.readInt();
                location = location2;
                arrayList2 = new ArrayList(readInt6);
                num = valueOf;
                int i4 = 0;
                while (i4 != readInt6) {
                    arrayList2.add(ClipsVideoItemLocation.CREATOR.createFromParcel(parcel));
                    i4++;
                    readInt6 = readInt6;
                }
            }
            return new ClipsEditorUploadParams(i, location, num, readInt2, readString, readString2, clipsEditorEntry2, str, licensedAudioInfo, z, r11, arrayList, createFromParcel, readInt5, z2, z3, z4, z5, arrayList2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VideoToClipInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEditorUploadParams[] newArray(int i) {
            return new ClipsEditorUploadParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsEditorUploadParams(int i, Location location, Integer num, int i2, String str, String str2, ClipsEditorEntry clipsEditorEntry, String str3, LicensedAudioInfo licensedAudioInfo, boolean z, List<MaskLight> list, List<? extends AudioEffectType> list2, ClipTemplateInfo clipTemplateInfo, int i3, boolean z2, boolean z3, boolean z4, boolean z5, List<ClipsVideoItemLocation> list3, String str4, String str5, VideoToClipInfo videoToClipInfo, Integer num2, String str6, String str7, String str8) {
        this.b = i;
        this.c = location;
        this.d = num;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = clipsEditorEntry;
        this.i = str3;
        this.j = licensedAudioInfo;
        this.k = z;
        this.l = list;
        this.m = list2;
        this.n = clipTemplateInfo;
        this.o = i3;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = list3;
        this.u = str4;
        this.v = str5;
        this.w = videoToClipInfo;
        this.x = num2;
        this.y = str6;
        this.z = str7;
        this.A = str8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ClipsEditorUploadParams a(ClipsEditorUploadParams clipsEditorUploadParams, int i, ClipsEditorEntry clipsEditorEntry, LicensedAudioInfo licensedAudioInfo, boolean z, ArrayList arrayList, ArrayList arrayList2, ClipTemplateInfo clipTemplateInfo, int i2, boolean z2, boolean z3, boolean z4, ArrayList arrayList3, String str, String str2, int i3) {
        boolean z5;
        boolean z6;
        int i4 = clipsEditorUploadParams.b;
        Location location = clipsEditorUploadParams.c;
        Integer num = clipsEditorUploadParams.d;
        int i5 = (i3 & 8) != 0 ? clipsEditorUploadParams.e : i;
        String str3 = clipsEditorUploadParams.f;
        int i6 = i5;
        String str4 = clipsEditorUploadParams.g;
        ClipsEditorEntry clipsEditorEntry2 = (i3 & 64) != 0 ? clipsEditorUploadParams.h : clipsEditorEntry;
        String str5 = clipsEditorUploadParams.i;
        LicensedAudioInfo licensedAudioInfo2 = (i3 & 256) != 0 ? clipsEditorUploadParams.j : licensedAudioInfo;
        boolean z7 = (i3 & 512) != 0 ? clipsEditorUploadParams.k : z;
        List<MaskLight> list = (i3 & 1024) != 0 ? clipsEditorUploadParams.l : arrayList;
        List<AudioEffectType> list2 = (i3 & 2048) != 0 ? clipsEditorUploadParams.m : arrayList2;
        ClipTemplateInfo clipTemplateInfo2 = (i3 & 4096) != 0 ? clipsEditorUploadParams.n : clipTemplateInfo;
        int i7 = (i3 & 8192) != 0 ? clipsEditorUploadParams.o : i2;
        boolean z8 = (i3 & 16384) != 0 ? clipsEditorUploadParams.p : z2;
        boolean z9 = (i3 & 32768) != 0 ? clipsEditorUploadParams.q : z3;
        boolean z10 = clipsEditorUploadParams.r;
        if ((i3 & 131072) != 0) {
            z5 = z10;
            z6 = clipsEditorUploadParams.s;
        } else {
            z5 = z10;
            z6 = z4;
        }
        List list3 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? clipsEditorUploadParams.t : arrayList3;
        String str6 = (i3 & 524288) != 0 ? clipsEditorUploadParams.u : str;
        String str7 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? clipsEditorUploadParams.v : str2;
        VideoToClipInfo videoToClipInfo = clipsEditorUploadParams.w;
        Integer num2 = clipsEditorUploadParams.x;
        String str8 = clipsEditorUploadParams.y;
        String str9 = clipsEditorUploadParams.z;
        String str10 = clipsEditorUploadParams.A;
        clipsEditorUploadParams.getClass();
        return new ClipsEditorUploadParams(i4, location, num, i6, str3, str4, clipsEditorEntry2, str5, licensedAudioInfo2, z7, list, list2, clipTemplateInfo2, i7, z8, z9, z5, z6, list3, str6, str7, videoToClipInfo, num2, str8, str9, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorUploadParams)) {
            return false;
        }
        ClipsEditorUploadParams clipsEditorUploadParams = (ClipsEditorUploadParams) obj;
        return this.b == clipsEditorUploadParams.b && epx.f(this.c, clipsEditorUploadParams.c) && epx.f(this.d, clipsEditorUploadParams.d) && this.e == clipsEditorUploadParams.e && epx.f(this.f, clipsEditorUploadParams.f) && epx.f(this.g, clipsEditorUploadParams.g) && this.h == clipsEditorUploadParams.h && epx.f(this.i, clipsEditorUploadParams.i) && epx.f(this.j, clipsEditorUploadParams.j) && this.k == clipsEditorUploadParams.k && epx.f(this.l, clipsEditorUploadParams.l) && epx.f(this.m, clipsEditorUploadParams.m) && epx.f(this.n, clipsEditorUploadParams.n) && this.o == clipsEditorUploadParams.o && this.p == clipsEditorUploadParams.p && this.q == clipsEditorUploadParams.q && this.r == clipsEditorUploadParams.r && this.s == clipsEditorUploadParams.s && epx.f(this.t, clipsEditorUploadParams.t) && epx.f(this.u, clipsEditorUploadParams.u) && epx.f(this.v, clipsEditorUploadParams.v) && epx.f(this.w, clipsEditorUploadParams.w) && epx.f(this.x, clipsEditorUploadParams.x) && epx.f(this.y, clipsEditorUploadParams.y) && epx.f(this.z, clipsEditorUploadParams.z) && epx.f(this.A, clipsEditorUploadParams.A);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Location location = this.c;
        int hashCode2 = (hashCode + (location == null ? 0 : location.hashCode())) * 31;
        Integer num = this.d;
        int a2 = shy.a(this.e, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f;
        int hashCode3 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ClipsEditorEntry clipsEditorEntry = this.h;
        int hashCode5 = (hashCode4 + (clipsEditorEntry == null ? 0 : clipsEditorEntry.hashCode())) * 31;
        String str3 = this.i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LicensedAudioInfo licensedAudioInfo = this.j;
        int b = qoy.b((hashCode6 + (licensedAudioInfo == null ? 0 : licensedAudioInfo.hashCode())) * 31, 31, this.k);
        List<MaskLight> list = this.l;
        int hashCode7 = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioEffectType> list2 = this.m;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ClipTemplateInfo clipTemplateInfo = this.n;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.o, (hashCode8 + (clipTemplateInfo == null ? 0 : clipTemplateInfo.hashCode())) * 31, 31), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
        List<ClipsVideoItemLocation> list3 = this.t;
        int a3 = urd0.a((b2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.u);
        String str4 = this.v;
        int hashCode9 = (a3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        VideoToClipInfo videoToClipInfo = this.w;
        int hashCode10 = (hashCode9 + (videoToClipInfo == null ? 0 : videoToClipInfo.hashCode())) * 31;
        Integer num2 = this.x;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.y;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.z;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A;
        return hashCode13 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorUploadParams(creationSessionId=");
        sb.append(this.b);
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", sectionId=");
        sb.append(this.d);
        sb.append(", framesCount=");
        sb.append(this.e);
        sb.append(", videoDurationSetting=");
        sb.append(this.f);
        sb.append(", duetType=");
        sb.append(this.g);
        sb.append(", clipsEditorEntry=");
        sb.append(this.h);
        sb.append(", cameraMode=");
        sb.append(this.i);
        sb.append(", musicInfo=");
        sb.append(this.j);
        sb.append(", withAudioFromLocalVideo=");
        sb.append(this.k);
        sb.append(", masks=");
        sb.append(this.l);
        sb.append(", morphingInfos=");
        sb.append(this.m);
        sb.append(", clipTemplateInfo=");
        sb.append(this.n);
        sb.append(", videoLengthMs=");
        sb.append(this.o);
        sb.append(", hasChangedVideoSpeed=");
        sb.append(this.p);
        sb.append(", hasChangedAudioSpeed=");
        sb.append(this.q);
        sb.append(", originalQuality=");
        sb.append(this.r);
        sb.append(", hasVoiceover=");
        sb.append(this.s);
        sb.append(", videoItemLocationList=");
        sb.append(this.t);
        sb.append(", entryPoint=");
        sb.append(this.u);
        sb.append(", duetOriginId=");
        sb.append(this.v);
        sb.append(", videoToClipInfo=");
        sb.append(this.w);
        sb.append(", miniAppId=");
        sb.append(this.x);
        sb.append(", requestId=");
        sb.append(this.y);
        sb.append(", ref=");
        sb.append(this.z);
        sb.append(", attachedVideoId=");
        return ho8.a(sb, this.A, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        ClipsEditorEntry clipsEditorEntry = this.h;
        if (clipsEditorEntry == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(clipsEditorEntry.name());
        }
        parcel.writeString(this.i);
        LicensedAudioInfo licensedAudioInfo = this.j;
        if (licensedAudioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            licensedAudioInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.k ? 1 : 0);
        List<MaskLight> list = this.l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MaskLight) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioEffectType> list2 = this.m;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeString(((AudioEffectType) f2.next()).name());
            }
        }
        ClipTemplateInfo clipTemplateInfo = this.n;
        if (clipTemplateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipTemplateInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        List<ClipsVideoItemLocation> list3 = this.t;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ClipsVideoItemLocation) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        VideoToClipInfo videoToClipInfo = this.w;
        if (videoToClipInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoToClipInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.x;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClipsEditorUploadParams(int r30, android.location.Location r31, java.lang.Integer r32, int r33, java.lang.String r34, java.lang.String r35, com.vk.dto.clips.upload.ClipsEditorEntry r36, java.lang.String r37, com.vk.dto.clips.upload.ClipsEditorUploadParams.LicensedAudioInfo r38, boolean r39, java.util.List r40, java.util.List r41, com.vk.dto.clips.upload.ClipTemplateInfo r42, int r43, boolean r44, boolean r45, boolean r46, boolean r47, java.util.List r48, java.lang.String r49, java.lang.String r50, com.vk.dto.clips.external.VideoToClipInfo r51, java.lang.Integer r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, xsna.zcl r57) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.clips.upload.ClipsEditorUploadParams.<init>(int, android.location.Location, java.lang.Integer, int, java.lang.String, java.lang.String, com.vk.dto.clips.upload.ClipsEditorEntry, java.lang.String, com.vk.dto.clips.upload.ClipsEditorUploadParams$LicensedAudioInfo, boolean, java.util.List, java.util.List, com.vk.dto.clips.upload.ClipTemplateInfo, int, boolean, boolean, boolean, boolean, java.util.List, java.lang.String, java.lang.String, com.vk.dto.clips.external.VideoToClipInfo, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, xsna.zcl):void");
    }
}
