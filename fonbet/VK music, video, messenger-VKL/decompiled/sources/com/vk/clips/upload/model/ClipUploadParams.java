package com.vk.clips.upload.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.morphing.AudioMorphingTypeStat;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ShortVideoCreationFeature;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;

/* compiled from: ClipUploadParams.kt */
/* loaded from: classes17.dex */
public final class ClipUploadParams implements Parcelable {
    public static final Parcelable.Creator<ClipUploadParams> CREATOR = new a();
    public final List<? extends ShortVideoCreationFeature> A;
    public final VideoTemplatePublishInfo B;
    public final OrdData C;
    public final LicensedAudioInfo D;
    public final StoryStatContainer E;
    public final Integer F;
    public final String G;
    public final String H;
    public final int I;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType J;
    public final MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final List<ClipsVideoItemLocation> S;
    public final boolean T;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final UserId f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final Boolean l;
    public final int m;
    public final MobileOfficialAppsClipsStat$ChangePreview.PreviewType n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Integer r;
    public final List<UserId> s;
    public final AudioMorphingTypeStat t;
    public final List<MaskLight> u;
    public ClipTemplateInfo v;
    public final ClickableStickers w;
    public final String x;
    public final VideoToClipInfo y;
    public final ClipsLinkAttachment z;

    /* compiled from: ClipUploadParams.kt */
    public static final class LicensedAudioInfo implements Parcelable {
        public static final Parcelable.Creator<LicensedAudioInfo> CREATOR = new a();
        public final int b;
        public final UserId c;
        public final Integer d;
        public final Integer e;
        public final Long f;
        public final String g;
        public final String h;

        /* compiled from: ClipUploadParams.kt */
        public static final class a implements Parcelable.Creator<LicensedAudioInfo> {
            @Override // android.os.Parcelable.Creator
            public final LicensedAudioInfo createFromParcel(Parcel parcel) {
                return new LicensedAudioInfo(parcel.readInt(), (UserId) parcel.readParcelable(LicensedAudioInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LicensedAudioInfo[] newArray(int i) {
                return new LicensedAudioInfo[i];
            }
        }

        public LicensedAudioInfo(int i, UserId userId, Integer num, Integer num2, Long l, String str) {
            this.b = i;
            this.c = userId;
            this.d = num;
            this.e = num2;
            this.f = l;
            this.g = str;
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(i);
            this.h = sb.toString();
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
            return this.b == licensedAudioInfo.b && epx.f(this.c, licensedAudioInfo.c) && epx.f(this.d, licensedAudioInfo.d) && epx.f(this.e, licensedAudioInfo.e) && epx.f(this.f, licensedAudioInfo.f) && epx.f(this.g, licensedAudioInfo.g);
        }

        public final String getId() {
            return this.h;
        }

        public final int hashCode() {
            int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
            Integer num = this.d;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l = this.f;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.g;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LicensedAudioInfo(audioId=");
            sb.append(this.b);
            sb.append(", audioOwnerId=");
            sb.append(this.c);
            sb.append(", bannerId=");
            sb.append(this.d);
            sb.append(", playlistId=");
            sb.append(this.e);
            sb.append(", playlistOwnerId=");
            sb.append(this.f);
            sb.append(", hashtag=");
            return ho8.a(sb, this.g, ')');
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
            Integer num2 = this.e;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Long l = this.f;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
            parcel.writeString(this.g);
        }
    }

    /* compiled from: ClipUploadParams.kt */
    public static final class a implements Parcelable.Creator<ClipUploadParams> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final ClipUploadParams createFromParcel(Parcel parcel) {
            UserId userId;
            boolean z;
            UserId userId2;
            String str;
            boolean z2;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            AudioMorphingTypeStat audioMorphingTypeStat;
            String str2;
            ClipsLinkAttachment clipsLinkAttachment;
            ClickableStickers clickableStickers;
            ArrayList arrayList3;
            int i2;
            VideoTemplatePublishInfo videoTemplatePublishInfo;
            LicensedAudioInfo createFromParcel;
            boolean z3;
            UserId userId3;
            boolean z4;
            ArrayList arrayList4;
            MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType;
            boolean z5;
            boolean z6;
            UserId userId4;
            boolean z7;
            int i3;
            int i4;
            String str3;
            ArrayList arrayList5;
            int i5;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            UserId userId5 = (UserId) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            if (parcel.readInt() != 0) {
                userId = userId5;
                z = true;
            } else {
                userId = userId5;
                z = false;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                userId2 = userId;
                str = readString3;
                z2 = true;
            } else {
                userId2 = userId;
                str = readString3;
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z9 = z8;
            int readInt3 = parcel.readInt();
            MobileOfficialAppsClipsStat$ChangePreview.PreviewType valueOf4 = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.valueOf(parcel.readString());
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
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                i = readInt;
                int i6 = 0;
                while (i6 != readInt4) {
                    i6 = bo.b(ClipUploadParams.class, parcel, arrayList, i6, 1);
                }
            }
            AudioMorphingTypeStat audioMorphingTypeStat2 = (AudioMorphingTypeStat) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                audioMorphingTypeStat = audioMorphingTypeStat2;
                int i7 = 0;
                while (true) {
                    str2 = readString;
                    if (i7 == readInt5) {
                        break;
                    }
                    i7 = bo.b(ClipUploadParams.class, parcel, arrayList2, i7, 1);
                    readString = str2;
                }
            } else {
                audioMorphingTypeStat = audioMorphingTypeStat2;
                arrayList2 = null;
                str2 = readString;
            }
            ClipTemplateInfo clipTemplateInfo = (ClipTemplateInfo) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            ClickableStickers clickableStickers2 = (ClickableStickers) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            String readString5 = parcel.readString();
            VideoToClipInfo videoToClipInfo = (VideoToClipInfo) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            ClipsLinkAttachment clipsLinkAttachment2 = (ClipsLinkAttachment) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                clipsLinkAttachment = clipsLinkAttachment2;
                clickableStickers = clickableStickers2;
                i2 = readInt2;
                arrayList3 = null;
            } else {
                clipsLinkAttachment = clipsLinkAttachment2;
                int readInt6 = parcel.readInt();
                clickableStickers = clickableStickers2;
                arrayList3 = new ArrayList(readInt6);
                i2 = readInt2;
                int i8 = 0;
                while (i8 != readInt6) {
                    arrayList3.add(ShortVideoCreationFeature.valueOf(parcel.readString()));
                    i8++;
                    readInt6 = readInt6;
                }
            }
            VideoTemplatePublishInfo videoTemplatePublishInfo2 = (VideoTemplatePublishInfo) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            OrdData ordData = (OrdData) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                videoTemplatePublishInfo = videoTemplatePublishInfo2;
                createFromParcel = null;
            } else {
                videoTemplatePublishInfo = videoTemplatePublishInfo2;
                createFromParcel = LicensedAudioInfo.CREATOR.createFromParcel(parcel);
            }
            LicensedAudioInfo licensedAudioInfo = createFromParcel;
            StoryStatContainer storyStatContainer = (StoryStatContainer) parcel.readParcelable(ClipUploadParams.class.getClassLoader());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i9 = i2;
            String readString6 = parcel.readString();
            ClipsLinkAttachment clipsLinkAttachment3 = clipsLinkAttachment;
            boolean z10 = true;
            int i10 = i;
            Boolean bool = valueOf;
            Boolean bool2 = valueOf2;
            ArrayList arrayList6 = arrayList;
            Boolean bool3 = valueOf3;
            AudioMorphingTypeStat audioMorphingTypeStat3 = audioMorphingTypeStat;
            ArrayList arrayList7 = arrayList3;
            String str4 = str2;
            VideoTemplatePublishInfo videoTemplatePublishInfo3 = videoTemplatePublishInfo;
            String readString7 = parcel.readString();
            UserId userId6 = userId2;
            Integer num = valueOf6;
            int readInt7 = parcel.readInt();
            MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType valueOf8 = MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.valueOf(parcel.readString());
            MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType valueOf9 = parcel.readInt() == 0 ? null : MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                userId3 = userId6;
                z4 = z3;
            } else {
                userId3 = userId6;
                z4 = false;
            }
            ClickableStickers clickableStickers3 = clickableStickers;
            Integer num2 = valueOf7;
            boolean z11 = parcel.readInt() != 0 ? z3 : false;
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                arrayList4 = null;
                duetType = valueOf9;
                z5 = z3;
            } else {
                arrayList4 = null;
                duetType = valueOf9;
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
            } else {
                z6 = z3;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                userId4 = userId3;
                z7 = z6;
            } else {
                userId4 = userId3;
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                i3 = 0;
                z12 = z6;
            } else {
                i3 = 0;
            }
            if (parcel.readInt() == 0) {
                str3 = str4;
                i5 = i9;
                arrayList5 = arrayList4;
                i4 = i10;
            } else {
                i4 = i10;
                int readInt8 = parcel.readInt();
                str3 = str4;
                arrayList5 = new ArrayList(readInt8);
                i5 = i9;
                int i11 = i3;
                while (i11 != readInt8) {
                    i11 = bo.b(ClipUploadParams.class, parcel, arrayList5, i11, z6 ? 1 : 0);
                    readInt8 = readInt8;
                }
            }
            return new ClipUploadParams(i4, str3, i5, readString2, userId4, z, str, readString4, z9, z2, bool, readInt3, valueOf4, bool2, bool3, valueOf5, num, arrayList6, audioMorphingTypeStat3, arrayList2, clipTemplateInfo, clickableStickers3, readString5, videoToClipInfo, clipsLinkAttachment3, arrayList7, videoTemplatePublishInfo3, ordData, licensedAudioInfo, storyStatContainer, num2, readString6, readString7, readInt7, valueOf8, duetType, z10, z4, z11, z5, z3, z7, z12, arrayList5, parcel.readInt() != 0 ? z6 : i3);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadParams[] newArray(int i) {
            return new ClipUploadParams[i];
        }
    }

    public ClipUploadParams(int i, String str, int i2, String str2, UserId userId, boolean z, String str3, String str4, boolean z2, boolean z3, Boolean bool, int i3, MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType, Boolean bool2, Boolean bool3, Integer num, Integer num2, List<UserId> list, AudioMorphingTypeStat audioMorphingTypeStat, List<MaskLight> list2, ClipTemplateInfo clipTemplateInfo, ClickableStickers clickableStickers, String str5, VideoToClipInfo videoToClipInfo, ClipsLinkAttachment clipsLinkAttachment, List<? extends ShortVideoCreationFeature> list3, VideoTemplatePublishInfo videoTemplatePublishInfo, OrdData ordData, LicensedAudioInfo licensedAudioInfo, StoryStatContainer storyStatContainer, Integer num3, String str6, String str7, int i4, MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType cameraType, MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List<ClipsVideoItemLocation> list4, boolean z11) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = userId;
        this.g = z;
        this.h = str3;
        this.i = str4;
        this.j = z2;
        this.k = z3;
        this.l = bool;
        this.m = i3;
        this.n = previewType;
        this.o = bool2;
        this.p = bool3;
        this.q = num;
        this.r = num2;
        this.s = list;
        this.t = audioMorphingTypeStat;
        this.u = list2;
        this.v = clipTemplateInfo;
        this.w = clickableStickers;
        this.x = str5;
        this.y = videoToClipInfo;
        this.z = clipsLinkAttachment;
        this.A = list3;
        this.B = videoTemplatePublishInfo;
        this.C = ordData;
        this.D = licensedAudioInfo;
        this.E = storyStatContainer;
        this.F = num3;
        this.G = str6;
        this.H = str7;
        this.I = i4;
        this.J = cameraType;
        this.K = duetType;
        this.L = z4;
        this.M = z5;
        this.N = z6;
        this.O = z7;
        this.P = z8;
        this.Q = z9;
        this.R = z10;
        this.S = list4;
        this.T = z11;
    }

    public final LicensedAudioInfo B() {
        return this.D;
    }

    public final Integer C() {
        return this.F;
    }

    public final Boolean D() {
        return this.o;
    }

    public final void D0(ClipTemplateInfo clipTemplateInfo) {
        this.v = clipTemplateInfo;
    }

    public final OrdData F() {
        return this.C;
    }

    public final void F0(boolean z) {
        this.L = z;
    }

    public final Integer G() {
        return this.r;
    }

    public final List<MaskLight> H2() {
        return this.u;
    }

    public final boolean K() {
        return this.g;
    }

    public final String M() {
        return this.h;
    }

    public final List<UserId> P1() {
        return this.s;
    }

    public final String R() {
        return this.i;
    }

    public final int T() {
        return this.m;
    }

    public final boolean W() {
        return this.T;
    }

    public final String Z() {
        return this.G;
    }

    public final Boolean a0() {
        return this.l;
    }

    public final Integer d() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.H;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploadParams)) {
            return false;
        }
        ClipUploadParams clipUploadParams = (ClipUploadParams) obj;
        return this.b == clipUploadParams.b && epx.f(this.c, clipUploadParams.c) && this.d == clipUploadParams.d && epx.f(this.e, clipUploadParams.e) && epx.f(this.f, clipUploadParams.f) && this.g == clipUploadParams.g && epx.f(this.h, clipUploadParams.h) && epx.f(this.i, clipUploadParams.i) && this.j == clipUploadParams.j && this.k == clipUploadParams.k && epx.f(this.l, clipUploadParams.l) && this.m == clipUploadParams.m && this.n == clipUploadParams.n && epx.f(this.o, clipUploadParams.o) && epx.f(this.p, clipUploadParams.p) && epx.f(this.q, clipUploadParams.q) && epx.f(this.r, clipUploadParams.r) && epx.f(this.s, clipUploadParams.s) && epx.f(this.t, clipUploadParams.t) && epx.f(this.u, clipUploadParams.u) && epx.f(this.v, clipUploadParams.v) && epx.f(this.w, clipUploadParams.w) && epx.f(this.x, clipUploadParams.x) && epx.f(this.y, clipUploadParams.y) && epx.f(this.z, clipUploadParams.z) && epx.f(this.A, clipUploadParams.A) && epx.f(this.B, clipUploadParams.B) && epx.f(this.C, clipUploadParams.C) && epx.f(this.D, clipUploadParams.D) && epx.f(this.E, clipUploadParams.E) && epx.f(this.F, clipUploadParams.F) && epx.f(this.G, clipUploadParams.G) && epx.f(this.H, clipUploadParams.H) && this.I == clipUploadParams.I && this.J == clipUploadParams.J && this.K == clipUploadParams.K && this.L == clipUploadParams.L && this.M == clipUploadParams.M && this.N == clipUploadParams.N && this.O == clipUploadParams.O && this.P == clipUploadParams.P && this.Q == clipUploadParams.Q && this.R == clipUploadParams.R && epx.f(this.S, clipUploadParams.S) && this.T == clipUploadParams.T;
    }

    public final boolean f() {
        return this.j;
    }

    public final ClickableStickers g() {
        return this.w;
    }

    public final String getDescription() {
        return this.e;
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31);
        String str = this.e;
        int b = qoy.b(bh10.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f.b), 31, this.g);
        String str2 = this.h;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int b2 = qoy.b(qoy.b((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j), 31, this.k);
        Boolean bool = this.l;
        int hashCode2 = (this.n.hashCode() + shy.a(this.m, (b2 + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31;
        Boolean bool2 = this.o;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.p;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.q;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.r;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UserId> list = this.s;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        AudioMorphingTypeStat audioMorphingTypeStat = this.t;
        int hashCode8 = (hashCode7 + (audioMorphingTypeStat == null ? 0 : audioMorphingTypeStat.b.hashCode())) * 31;
        List<MaskLight> list2 = this.u;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ClipTemplateInfo clipTemplateInfo = this.v;
        int hashCode10 = (hashCode9 + (clipTemplateInfo == null ? 0 : clipTemplateInfo.hashCode())) * 31;
        ClickableStickers clickableStickers = this.w;
        int hashCode11 = (hashCode10 + (clickableStickers == null ? 0 : clickableStickers.hashCode())) * 31;
        String str4 = this.x;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        VideoToClipInfo videoToClipInfo = this.y;
        int hashCode13 = (hashCode12 + (videoToClipInfo == null ? 0 : videoToClipInfo.hashCode())) * 31;
        ClipsLinkAttachment clipsLinkAttachment = this.z;
        int hashCode14 = (hashCode13 + (clipsLinkAttachment == null ? 0 : clipsLinkAttachment.hashCode())) * 31;
        List<? extends ShortVideoCreationFeature> list3 = this.A;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        VideoTemplatePublishInfo videoTemplatePublishInfo = this.B;
        int hashCode16 = (hashCode15 + (videoTemplatePublishInfo == null ? 0 : videoTemplatePublishInfo.hashCode())) * 31;
        OrdData ordData = this.C;
        int hashCode17 = (hashCode16 + (ordData == null ? 0 : ordData.hashCode())) * 31;
        LicensedAudioInfo licensedAudioInfo = this.D;
        int hashCode18 = (hashCode17 + (licensedAudioInfo == null ? 0 : licensedAudioInfo.hashCode())) * 31;
        StoryStatContainer storyStatContainer = this.E;
        int hashCode19 = (hashCode18 + (storyStatContainer == null ? 0 : storyStatContainer.hashCode())) * 31;
        Integer num3 = this.F;
        int hashCode20 = (hashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.G;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.H;
        int hashCode22 = (this.J.hashCode() + shy.a(this.I, (hashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31, 31)) * 31;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = this.K;
        int b3 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode22 + (duetType == null ? 0 : duetType.hashCode())) * 31, 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P), 31, this.Q), 31, this.R);
        List<ClipsVideoItemLocation> list4 = this.S;
        return Boolean.hashCode(this.T) + ((b3 + (list4 != null ? list4.hashCode() : 0)) * 31);
    }

    public final ClipTemplateInfo i() {
        return this.v;
    }

    public final List<ShortVideoCreationFeature> j() {
        return this.A;
    }

    public final boolean k() {
        return this.k;
    }

    public final ClipsLinkAttachment l() {
        return this.z;
    }

    public final int l0() {
        return this.d;
    }

    public final int n() {
        return this.b;
    }

    public final String o() {
        return this.x;
    }

    public final String p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadParams(creationSessionId=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        sb.append(this.c);
        sb.append(", videoLengthMs=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", groupId=");
        sb.append(this.f);
        sb.append(", postToWall=");
        sb.append(this.g);
        sb.append(", privacyComment=");
        sb.append(this.h);
        sb.append(", privacyView=");
        sb.append(this.i);
        sb.append(", canMakeDuet=");
        sb.append(this.j);
        sb.append(", clipsLicenseAgreed=");
        sb.append(this.k);
        sb.append(", userTemplatesAllowed=");
        sb.append(this.l);
        sb.append(", publicationDateSeconds=");
        sb.append(this.m);
        sb.append(", previewType=");
        sb.append(this.n);
        sb.append(", onlineBooking=");
        sb.append(this.o);
        sb.append(", messageToBc=");
        sb.append(this.p);
        sb.append(", attachedDonutLevelId=");
        sb.append(this.q);
        sb.append(", playlistId=");
        sb.append(this.r);
        sb.append(", coauthors=");
        sb.append(this.s);
        sb.append(", morphingStat=");
        sb.append(this.t);
        sb.append(", masks=");
        sb.append(this.u);
        sb.append(", clipTemplateInfo=");
        sb.append(this.v);
        sb.append(", clickableContainer=");
        sb.append(this.w);
        sb.append(", duetOriginId=");
        sb.append(this.x);
        sb.append(", videoToClipInfo=");
        sb.append(this.y);
        sb.append(", clipsLinkAttachment=");
        sb.append(this.z);
        sb.append(", clipsInvolvementAttachment=");
        sb.append(this.A);
        sb.append(", videoTemplatePublishInfo=");
        sb.append(this.B);
        sb.append(", ordData=");
        sb.append(this.C);
        sb.append(", licensedAudioInfo=");
        sb.append(this.D);
        sb.append(", storyStatContainer=");
        sb.append(this.E);
        sb.append(", miniAppId=");
        sb.append(this.F);
        sb.append(", requestId=");
        sb.append(this.G);
        sb.append(", attachedVideo=");
        sb.append(this.H);
        sb.append(", videoFragmentsCount=");
        sb.append(this.I);
        sb.append(", fragmentsSourceType=");
        sb.append(this.J);
        sb.append(", duetType=");
        sb.append(this.K);
        sb.append(", isOriginalQuality=");
        sb.append(this.L);
        sb.append(", hasAudioImported=");
        sb.append(this.M);
        sb.append(", hasVoiceOver=");
        sb.append(this.N);
        sb.append(", isVideoSpeedChanged=");
        sb.append(this.O);
        sb.append(", isAudioSpeedChanged=");
        sb.append(this.P);
        sb.append(", shouldUploadImmediately=");
        sb.append(this.Q);
        sb.append(", wallPostMuteNotifications=");
        sb.append(this.R);
        sb.append(", videoItemLocationList=");
        sb.append(this.S);
        sb.append(", repostToStory=");
        return q0.a(sb, this.T, ')');
    }

    public final UserId u() {
        return this.f;
    }

    public final VideoTemplatePublishInfo v0() {
        return this.B;
    }

    public final VideoToClipInfo w0() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        Boolean bool = this.l;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeInt(this.m);
        parcel.writeString(this.n.name());
        Boolean bool2 = this.o;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.p;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num = this.q;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.r;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UserId> list = this.s;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.t, i);
        List<MaskLight> list2 = this.u;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeParcelable(this.v, i);
        parcel.writeParcelable(this.w, i);
        parcel.writeString(this.x);
        parcel.writeParcelable(this.y, i);
        parcel.writeParcelable(this.z, i);
        List<? extends ShortVideoCreationFeature> list3 = this.A;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeString(((ShortVideoCreationFeature) f3.next()).name());
            }
        }
        parcel.writeParcelable(this.B, i);
        parcel.writeParcelable(this.C, i);
        LicensedAudioInfo licensedAudioInfo = this.D;
        if (licensedAudioInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            licensedAudioInfo.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.E, i);
        Integer num3 = this.F;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeInt(this.I);
        parcel.writeString(this.J.name());
        MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = this.K;
        if (duetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(duetType.name());
        }
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeInt(this.N ? 1 : 0);
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
        List<ClipsVideoItemLocation> list4 = this.S;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeInt(this.T ? 1 : 0);
    }

    public final boolean y0() {
        return this.R;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClipUploadParams(int r51, java.lang.String r52, int r53, java.lang.String r54, com.vk.dto.common.id.UserId r55, boolean r56, java.lang.String r57, java.lang.String r58, boolean r59, boolean r60, java.lang.Boolean r61, int r62, com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview.PreviewType r63, java.lang.Boolean r64, java.lang.Boolean r65, java.lang.Integer r66, java.lang.Integer r67, java.util.List r68, com.vk.dto.clips.morphing.AudioMorphingTypeStat r69, java.util.List r70, com.vk.dto.clips.upload.ClipTemplateInfo r71, com.vk.dto.stories.model.clickable.ClickableStickers r72, java.lang.String r73, com.vk.dto.clips.external.VideoToClipInfo r74, com.vk.dto.common.clips.ClipsLinkAttachment r75, java.util.List r76, com.vk.dto.common.clips.VideoTemplatePublishInfo r77, com.vk.dto.stories.entities.OrdData r78, com.vk.clips.upload.model.ClipUploadParams.LicensedAudioInfo r79, com.vk.dto.stories.entities.stat.StoryStatContainer r80, java.lang.Integer r81, java.lang.String r82, java.lang.String r83, int r84, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType r85, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType r86, boolean r87, boolean r88, boolean r89, boolean r90, boolean r91, boolean r92, boolean r93, java.util.List r94, boolean r95, int r96, int r97, xsna.zcl r98) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.clips.upload.model.ClipUploadParams.<init>(int, java.lang.String, int, java.lang.String, com.vk.dto.common.id.UserId, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.Boolean, int, com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview$PreviewType, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.util.List, com.vk.dto.clips.morphing.AudioMorphingTypeStat, java.util.List, com.vk.dto.clips.upload.ClipTemplateInfo, com.vk.dto.stories.model.clickable.ClickableStickers, java.lang.String, com.vk.dto.clips.external.VideoToClipInfo, com.vk.dto.common.clips.ClipsLinkAttachment, java.util.List, com.vk.dto.common.clips.VideoTemplatePublishInfo, com.vk.dto.stories.entities.OrdData, com.vk.clips.upload.model.ClipUploadParams$LicensedAudioInfo, com.vk.dto.stories.entities.stat.StoryStatContainer, java.lang.Integer, java.lang.String, java.lang.String, int, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem$CameraType, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem$DuetType, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.util.List, boolean, int, int, xsna.zcl):void");
    }
}
