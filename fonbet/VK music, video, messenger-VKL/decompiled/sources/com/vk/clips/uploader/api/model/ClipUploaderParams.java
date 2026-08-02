package com.vk.clips.uploader.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.shortVideo.dto.ShortVideoCreateShareOnPlatformsDto;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.k73;
import xsna.nr;
import xsna.sn;
import xsna.ur;
import xsna.xq;
import xsna.zcl;

/* compiled from: ClipUploaderParams.kt */
/* loaded from: classes17.dex */
public final class ClipUploaderParams implements Parcelable {
    public static final Parcelable.Creator<ClipUploaderParams> CREATOR = new a();
    public final Integer A;
    public final Boolean B;
    public final Integer C;
    public final List<UserId> D;
    public final String E;
    public final MobileOfficialAppsClipsStat$ChangePreview.PreviewType F;
    public final Set<ShortVideoCreateShareOnPlatformsDto> G;
    public final String b;
    public final Location c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final List<String> j;
    public final List<String> k;
    public final Boolean l;
    public final String m;
    public final Integer n;
    public final String o;
    public final Integer p;
    public final Boolean q;
    public final String r;
    public final List<Long> s;
    public final Integer t;
    public final VideoToClipInfo u;
    public final LinkAttach v;
    public final ClipTemplateInfo w;
    public final TemplatePublishInfo x;
    public final OrdInfo y;
    public final List<String> z;

    /* compiled from: ClipUploaderParams.kt */
    public static final class LinkAttach implements Parcelable {
        public static final Parcelable.Creator<LinkAttach> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: ClipUploaderParams.kt */
        public static final class a implements Parcelable.Creator<LinkAttach> {
            @Override // android.os.Parcelable.Creator
            public final LinkAttach createFromParcel(Parcel parcel) {
                return new LinkAttach(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkAttach[] newArray(int i) {
                return new LinkAttach[i];
            }
        }

        public LinkAttach(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAttach)) {
                return false;
            }
            LinkAttach linkAttach = (LinkAttach) obj;
            return epx.f(this.b, linkAttach.b) && epx.f(this.c, linkAttach.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkAttach(url=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: ClipUploaderParams.kt */
    public static final class Location implements Parcelable {
        public static final Parcelable.Creator<Location> CREATOR = new a();
        public final float b;
        public final float c;

        /* compiled from: ClipUploaderParams.kt */
        public static final class a implements Parcelable.Creator<Location> {
            @Override // android.os.Parcelable.Creator
            public final Location createFromParcel(Parcel parcel) {
                return new Location(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Location[] newArray(int i) {
                return new Location[i];
            }
        }

        public Location(float f, float f2) {
            this.b = f;
            this.c = f2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Float.compare(this.b, location.b) == 0 && Float.compare(this.c, location.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(latitude=");
            sb.append(this.b);
            sb.append(", longitude=");
            return xq.c(')', this.c, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
        }
    }

    /* compiled from: ClipUploaderParams.kt */
    public static final class OrdInfo implements Parcelable {
        public static final Parcelable.Creator<OrdInfo> CREATOR = new a();
        public final String b;
        public final String c;
        public final boolean d;

        /* compiled from: ClipUploaderParams.kt */
        public static final class a implements Parcelable.Creator<OrdInfo> {
            @Override // android.os.Parcelable.Creator
            public final OrdInfo createFromParcel(Parcel parcel) {
                return new OrdInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final OrdInfo[] newArray(int i) {
                return new OrdInfo[i];
            }
        }

        public OrdInfo(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrdInfo)) {
                return false;
            }
            OrdInfo ordInfo = (OrdInfo) obj;
            return epx.f(this.b, ordInfo.b) && epx.f(this.c, ordInfo.c) && this.d == ordInfo.d;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrdInfo(predId=");
            sb.append(this.b);
            sb.append(", erId=");
            sb.append(this.c);
            sb.append(", isAd=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* compiled from: ClipUploaderParams.kt */
    public static final class TemplatePublishInfo implements Parcelable {
        public static final Parcelable.Creator<TemplatePublishInfo> CREATOR = new a();
        public final String b;
        public final Integer c;
        public final Long d;

        /* compiled from: ClipUploaderParams.kt */
        public static final class a implements Parcelable.Creator<TemplatePublishInfo> {
            @Override // android.os.Parcelable.Creator
            public final TemplatePublishInfo createFromParcel(Parcel parcel) {
                return new TemplatePublishInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final TemplatePublishInfo[] newArray(int i) {
                return new TemplatePublishInfo[i];
            }
        }

        public TemplatePublishInfo(String str, Integer num, Long l) {
            this.b = str;
            this.c = num;
            this.d = l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemplatePublishInfo)) {
                return false;
            }
            TemplatePublishInfo templatePublishInfo = (TemplatePublishInfo) obj;
            return epx.f(this.b, templatePublishInfo.b) && epx.f(this.c, templatePublishInfo.c) && epx.f(this.d, templatePublishInfo.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.d;
            return hashCode2 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemplatePublishInfo(templateRawId=");
            sb.append(this.b);
            sb.append(", statisticsTemplateId=");
            sb.append(this.c);
            sb.append(", ownerId=");
            return iq.b(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            Integer num = this.c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Long l = this.d;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
            }
        }
    }

    /* compiled from: ClipUploaderParams.kt */
    public static final class a implements Parcelable.Creator<ClipUploaderParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploaderParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            ArrayList arrayList;
            String str;
            Location location;
            Integer num;
            LinkAttach createFromParcel;
            ClipTemplateInfo clipTemplateInfo;
            TemplatePublishInfo createFromParcel2;
            TemplatePublishInfo templatePublishInfo;
            OrdInfo createFromParcel3;
            Boolean valueOf6;
            OrdInfo ordInfo;
            String str2;
            ArrayList arrayList2;
            String str3;
            ArrayList arrayList3;
            LinkedHashSet linkedHashSet;
            String readString = parcel.readString();
            Location createFromParcel4 = parcel.readInt() == 0 ? null : Location.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            Boolean bool = valueOf;
            Boolean bool2 = valueOf2;
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool3 = valueOf3;
            Boolean bool4 = valueOf4;
            String readString5 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                str = readString;
                int i = 0;
                while (true) {
                    location = createFromParcel4;
                    if (i == readInt) {
                        break;
                    }
                    i = k73.b(parcel, arrayList, i, 1);
                    createFromParcel4 = location;
                }
            } else {
                str = readString;
                arrayList = null;
                location = createFromParcel4;
            }
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VideoToClipInfo videoToClipInfo = (VideoToClipInfo) parcel.readParcelable(ClipUploaderParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                num = valueOf9;
                createFromParcel = null;
            } else {
                num = valueOf9;
                createFromParcel = LinkAttach.CREATOR.createFromParcel(parcel);
            }
            LinkAttach linkAttach = createFromParcel;
            ClipTemplateInfo clipTemplateInfo2 = (ClipTemplateInfo) parcel.readParcelable(ClipUploaderParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                clipTemplateInfo = clipTemplateInfo2;
                createFromParcel2 = null;
            } else {
                clipTemplateInfo = clipTemplateInfo2;
                createFromParcel2 = TemplatePublishInfo.CREATOR.createFromParcel(parcel);
            }
            TemplatePublishInfo templatePublishInfo2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                templatePublishInfo = templatePublishInfo2;
                createFromParcel3 = null;
            } else {
                templatePublishInfo = templatePublishInfo2;
                createFromParcel3 = OrdInfo.CREATOR.createFromParcel(parcel);
            }
            OrdInfo ordInfo2 = createFromParcel3;
            Integer num2 = valueOf7;
            Boolean bool5 = valueOf5;
            Integer num3 = num;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                ordInfo = ordInfo2;
                str2 = readString2;
                str3 = readString3;
                arrayList2 = null;
            } else {
                ordInfo = ordInfo2;
                int readInt2 = parcel.readInt();
                str2 = readString2;
                arrayList2 = new ArrayList(readInt2);
                str3 = readString3;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(ClipUploaderParams.class, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                }
            }
            Integer num4 = valueOf10;
            String readString7 = parcel.readString();
            MobileOfficialAppsClipsStat$ChangePreview.PreviewType valueOf12 = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                linkedHashSet = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt3);
                arrayList3 = arrayList2;
                int i3 = 0;
                while (i3 != readInt3) {
                    linkedHashSet2.add(parcel.readParcelable(ClipUploaderParams.class.getClassLoader()));
                    i3++;
                    readInt3 = readInt3;
                }
                linkedHashSet = linkedHashSet2;
            }
            return new ClipUploaderParams(str, location, str2, str3, createStringArrayList, bool, bool2, bool3, createStringArrayList2, createStringArrayList3, bool4, readString4, num2, readString5, valueOf8, bool5, readString6, arrayList, num3, videoToClipInfo, linkAttach, clipTemplateInfo, templatePublishInfo, ordInfo, createStringArrayList4, num4, valueOf6, valueOf11, arrayList3, readString7, valueOf12, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploaderParams[] newArray(int i) {
            return new ClipUploaderParams[i];
        }
    }

    public ClipUploaderParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploaderParams)) {
            return false;
        }
        ClipUploaderParams clipUploaderParams = (ClipUploaderParams) obj;
        return epx.f(this.b, clipUploaderParams.b) && epx.f(this.c, clipUploaderParams.c) && epx.f(this.d, clipUploaderParams.d) && epx.f(this.e, clipUploaderParams.e) && epx.f(this.f, clipUploaderParams.f) && epx.f(this.g, clipUploaderParams.g) && epx.f(this.h, clipUploaderParams.h) && epx.f(this.i, clipUploaderParams.i) && epx.f(this.j, clipUploaderParams.j) && epx.f(this.k, clipUploaderParams.k) && epx.f(this.l, clipUploaderParams.l) && epx.f(this.m, clipUploaderParams.m) && epx.f(this.n, clipUploaderParams.n) && epx.f(this.o, clipUploaderParams.o) && epx.f(this.p, clipUploaderParams.p) && epx.f(this.q, clipUploaderParams.q) && epx.f(this.r, clipUploaderParams.r) && epx.f(this.s, clipUploaderParams.s) && epx.f(this.t, clipUploaderParams.t) && epx.f(this.u, clipUploaderParams.u) && epx.f(this.v, clipUploaderParams.v) && epx.f(this.w, clipUploaderParams.w) && epx.f(this.x, clipUploaderParams.x) && epx.f(this.y, clipUploaderParams.y) && epx.f(this.z, clipUploaderParams.z) && epx.f(this.A, clipUploaderParams.A) && epx.f(this.B, clipUploaderParams.B) && epx.f(this.C, clipUploaderParams.C) && epx.f(this.D, clipUploaderParams.D) && epx.f(this.E, clipUploaderParams.E) && this.F == clipUploaderParams.F && epx.f(this.G, clipUploaderParams.G);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Location location = this.c;
        int hashCode2 = (hashCode + (location == null ? 0 : location.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list2 = this.j;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.k;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool4 = this.l;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.m;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.n;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.o;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.p;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool5 = this.q;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str6 = this.r;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Long> list4 = this.s;
        int hashCode18 = (hashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num3 = this.t;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        VideoToClipInfo videoToClipInfo = this.u;
        int hashCode20 = (hashCode19 + (videoToClipInfo == null ? 0 : videoToClipInfo.hashCode())) * 31;
        LinkAttach linkAttach = this.v;
        int hashCode21 = (hashCode20 + (linkAttach == null ? 0 : linkAttach.hashCode())) * 31;
        ClipTemplateInfo clipTemplateInfo = this.w;
        int hashCode22 = (hashCode21 + (clipTemplateInfo == null ? 0 : clipTemplateInfo.hashCode())) * 31;
        TemplatePublishInfo templatePublishInfo = this.x;
        int hashCode23 = (hashCode22 + (templatePublishInfo == null ? 0 : templatePublishInfo.hashCode())) * 31;
        OrdInfo ordInfo = this.y;
        int hashCode24 = (hashCode23 + (ordInfo == null ? 0 : ordInfo.hashCode())) * 31;
        List<String> list5 = this.z;
        int hashCode25 = (hashCode24 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num4 = this.A;
        int hashCode26 = (hashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.B;
        int hashCode27 = (hashCode26 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num5 = this.C;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<UserId> list6 = this.D;
        int hashCode29 = (hashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str7 = this.E;
        int hashCode30 = (this.F.hashCode() + ((hashCode29 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        Set<ShortVideoCreateShareOnPlatformsDto> set = this.G;
        return hashCode30 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploaderParams(description=");
        sb.append(this.b);
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", clickableStickers=");
        sb.append(this.e);
        sb.append(", maskIds=");
        sb.append(this.f);
        sb.append(", postToWall=");
        sb.append(this.g);
        sb.append(", repostToStory=");
        sb.append(this.h);
        sb.append(", postToWallMuteNotifications=");
        sb.append(this.i);
        sb.append(", privacyView=");
        sb.append(this.j);
        sb.append(", privacyComment=");
        sb.append(this.k);
        sb.append(", allowDuetMake=");
        sb.append(this.l);
        sb.append(", duetVideoId=");
        sb.append(this.m);
        sb.append(", miniAppId=");
        sb.append(this.n);
        sb.append(", requestId=");
        sb.append(this.o);
        sb.append(", contestId=");
        sb.append(this.p);
        sb.append(", license2022Agree=");
        sb.append(this.q);
        sb.append(", createTag=");
        sb.append(this.r);
        sb.append(", generatedOvIds=");
        sb.append(this.s);
        sb.append(", publishDateSec=");
        sb.append(this.t);
        sb.append(", videoToClipInfo=");
        sb.append(this.u);
        sb.append(", linkAttach=");
        sb.append(this.v);
        sb.append(", templateInfo=");
        sb.append(this.w);
        sb.append(", templatePublishInfo=");
        sb.append(this.x);
        sb.append(", ordInfo=");
        sb.append(this.y);
        sb.append(", creationFeatures=");
        sb.append(this.z);
        sb.append(", targetPlaylistId=");
        sb.append(this.A);
        sb.append(", isMarketOnlineBookingEnabled=");
        sb.append(this.B);
        sb.append(", attachedDonutLevelId=");
        sb.append(this.C);
        sb.append(", coOwnerIds=");
        sb.append(this.D);
        sb.append(", attachToVideoRawId=");
        sb.append(this.E);
        sb.append(", previewType=");
        sb.append(this.F);
        sb.append(", sharingPlatforms=");
        return ur.c(sb, this.G, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Location location = this.c;
        if (location == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            location.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        Boolean bool = this.g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.h;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.i;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        Boolean bool4 = this.l;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.m);
        Integer num = this.n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.o);
        Integer num2 = this.p;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool5 = this.q;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeString(this.r);
        List<Long> list = this.s;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeLong(((Number) f.next()).longValue());
            }
        }
        Integer num3 = this.t;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.u, i);
        LinkAttach linkAttach = this.v;
        if (linkAttach == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkAttach.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.w, i);
        TemplatePublishInfo templatePublishInfo = this.x;
        if (templatePublishInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templatePublishInfo.writeToParcel(parcel, i);
        }
        OrdInfo ordInfo = this.y;
        if (ordInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ordInfo.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.z);
        Integer num4 = this.A;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool6 = this.B;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Integer num5 = this.C;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        List<UserId> list2 = this.D;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.E);
        parcel.writeString(this.F.name());
        Set<ShortVideoCreateShareOnPlatformsDto> set = this.G;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(set.size());
        Iterator<ShortVideoCreateShareOnPlatformsDto> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipUploaderParams(String str, Location location, String str2, String str3, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, List<String> list2, List<String> list3, Boolean bool4, String str4, Integer num, String str5, Integer num2, Boolean bool5, String str6, List<Long> list4, Integer num3, VideoToClipInfo videoToClipInfo, LinkAttach linkAttach, ClipTemplateInfo clipTemplateInfo, TemplatePublishInfo templatePublishInfo, OrdInfo ordInfo, List<String> list5, Integer num4, Boolean bool6, Integer num5, List<UserId> list6, String str7, MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType, Set<? extends ShortVideoCreateShareOnPlatformsDto> set) {
        this.b = str;
        this.c = location;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = bool;
        this.h = bool2;
        this.i = bool3;
        this.j = list2;
        this.k = list3;
        this.l = bool4;
        this.m = str4;
        this.n = num;
        this.o = str5;
        this.p = num2;
        this.q = bool5;
        this.r = str6;
        this.s = list4;
        this.t = num3;
        this.u = videoToClipInfo;
        this.v = linkAttach;
        this.w = clipTemplateInfo;
        this.x = templatePublishInfo;
        this.y = ordInfo;
        this.z = list5;
        this.A = num4;
        this.B = bool6;
        this.C = num5;
        this.D = list6;
        this.E = str7;
        this.F = previewType;
        this.G = set;
    }

    public /* synthetic */ ClipUploaderParams(String str, Location location, String str2, String str3, List list, Boolean bool, Boolean bool2, Boolean bool3, List list2, List list3, Boolean bool4, String str4, Integer num, String str5, Integer num2, Boolean bool5, String str6, List list4, Integer num3, VideoToClipInfo videoToClipInfo, LinkAttach linkAttach, ClipTemplateInfo clipTemplateInfo, TemplatePublishInfo templatePublishInfo, OrdInfo ordInfo, List list5, Integer num4, Boolean bool6, Integer num5, List list6, String str7, MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType, Set set, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : location, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : bool4, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : num2, (i & 32768) != 0 ? null : bool5, (i & 65536) != 0 ? null : str6, (i & 131072) != 0 ? null : list4, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num3, (i & 524288) != 0 ? null : videoToClipInfo, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : linkAttach, (i & 2097152) != 0 ? null : clipTemplateInfo, (i & 4194304) != 0 ? null : templatePublishInfo, (i & 8388608) != 0 ? null : ordInfo, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list5, (i & 33554432) != 0 ? null : num4, (i & 67108864) != 0 ? null : bool6, (i & 134217728) != 0 ? null : num5, (i & 268435456) != 0 ? null : list6, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str7, (i & 1073741824) != 0 ? MobileOfficialAppsClipsStat$ChangePreview.PreviewType.FIRST_FRAME : previewType, (i & Integer.MIN_VALUE) != 0 ? null : set);
    }
}
