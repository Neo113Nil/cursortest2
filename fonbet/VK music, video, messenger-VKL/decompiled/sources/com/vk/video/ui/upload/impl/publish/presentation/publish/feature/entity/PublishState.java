package com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.stories.entities.OrdData;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.ag20;
import xsna.alb0;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.bpn0;
import xsna.dn;
import xsna.drm0;
import xsna.en;
import xsna.epx;
import xsna.f550;
import xsna.f9k0;
import xsna.fw3;
import xsna.hj60;
import xsna.i440;
import xsna.iia0;
import xsna.lbc0;
import xsna.lm50;
import xsna.myd0;
import xsna.ofc0;
import xsna.qkd0;
import xsna.qoy;
import xsna.urd0;
import xsna.wzb0;
import xsna.x750;
import xsna.yu60;
import xsna.zcl;
import xsna.zf20;

/* compiled from: PublishState.kt */
/* loaded from: classes7.dex */
public final class PublishState implements lm50, Parcelable {
    public static final Parcelable.Creator<PublishState> CREATOR = new a();
    public final List<VideoAlbumResultData> A;
    public final List<VideoAlbumResultData> B;
    public final OrdData C;
    public final OrdData D;
    public final boolean E;
    public final VkOnboardingCampaign F;
    public final VkOnboardingStat$Delegate G;
    public final boolean H;
    public final boolean I;
    public final ExitConfirmDialogViewState J;
    public final boolean K;
    public final boolean L;
    public final f9k0 M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final bpn0 S;
    public final bpn0 T;
    public final bpn0 U;
    public final bpn0 V;
    public final bpn0 W;
    public final bpn0 X;
    public final bpn0 Y;
    public final bpn0 Z;
    public final bpn0 a0;
    public final Block b;
    public final bpn0 b0;
    public final VideoInfoDo c;
    public final bpn0 c0;
    public final CoverDo d;
    public final bpn0 d0;
    public final String e;
    public final boolean f;
    public final String g;
    public final UserId h;
    public final List<VideoAuthorDo> i;
    public final VideoAuthorDo j;
    public final VideoAuthorDo k;
    public final boolean l;
    public final boolean m;
    public final Date n;
    public final PublicationDateDialogViewState o;
    public final PrivacyDo p;
    public final PrivacyDo q;
    public final PrivacyDo r;
    public final PrivacyDo s;
    public final DonutLevel t;
    public final DonutLevel u;
    public final List<VideoFile> v;
    public final List<VideoFile> w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: PublishState.kt */
    public interface Block extends Parcelable {
    }

    /* compiled from: PublishState.kt */
    public static final class Edit implements Block {
        public static final Parcelable.Creator<Edit> CREATOR = new a();
        public final VideoFile b;
        public final boolean c;
        public final bpn0 d;

        /* compiled from: PublishState.kt */
        public static final class a implements Parcelable.Creator<Edit> {
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                return new Edit((VideoFile) parcel.readParcelable(Edit.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i) {
                return new Edit[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Edit() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public final boolean Z1() {
            return ((Boolean) this.d.getValue()).booleanValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj;
            return epx.f(this.b, edit.b) && this.c == edit.c;
        }

        public final int hashCode() {
            VideoFile videoFile = this.b;
            return Boolean.hashCode(this.c) + ((videoFile == null ? 0 : videoFile.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Edit(videoFile=");
            sb.append(this.b);
            sb.append(", shouldNotifyVideoBus=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public Edit(VideoFile videoFile, boolean z) {
            this.b = videoFile;
            this.c = z;
            this.d = new bpn0(new x750(this, 13));
        }

        public /* synthetic */ Edit(VideoFile videoFile, boolean z, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : videoFile, (i & 2) != 0 ? false : z);
        }
    }

    /* compiled from: PublishState.kt */
    public static final class Upload implements Block {
        public static final Parcelable.Creator<Upload> CREATOR = new a();
        public final Uri b;

        /* compiled from: PublishState.kt */
        public static final class a implements Parcelable.Creator<Upload> {
            @Override // android.os.Parcelable.Creator
            public final Upload createFromParcel(Parcel parcel) {
                return new Upload((Uri) parcel.readParcelable(Upload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Upload[] newArray(int i) {
                return new Upload[i];
            }
        }

        public Upload(Uri uri) {
            this.b = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Upload) && epx.f(this.b, ((Upload) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return alb0.b(new StringBuilder("Upload(videoPath="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: PublishState.kt */
    public static final class a implements Parcelable.Creator<PublishState> {
        @Override // android.os.Parcelable.Creator
        public final PublishState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Block block = (Block) parcel.readParcelable(PublishState.class.getClassLoader());
            VideoInfoDo createFromParcel = parcel.readInt() == 0 ? null : VideoInfoDo.CREATOR.createFromParcel(parcel);
            CoverDo coverDo = (CoverDo) parcel.readParcelable(PublishState.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(PublishState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoAuthorDo.CREATOR, parcel, arrayList, i, 1);
                }
            }
            VideoAuthorDo createFromParcel2 = parcel.readInt() == 0 ? null : VideoAuthorDo.CREATOR.createFromParcel(parcel);
            VideoAuthorDo createFromParcel3 = parcel.readInt() == 0 ? null : VideoAuthorDo.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            Date date = (Date) parcel.readSerializable();
            PublicationDateDialogViewState createFromParcel4 = parcel.readInt() == 0 ? null : PublicationDateDialogViewState.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<PrivacyDo> creator = PrivacyDo.CREATOR;
            PrivacyDo createFromParcel5 = creator.createFromParcel(parcel);
            PrivacyDo createFromParcel6 = creator.createFromParcel(parcel);
            PrivacyDo createFromParcel7 = creator.createFromParcel(parcel);
            PrivacyDo createFromParcel8 = creator.createFromParcel(parcel);
            DonutLevel donutLevel = (DonutLevel) parcel.readParcelable(PublishState.class.getClassLoader());
            DonutLevel donutLevel2 = (DonutLevel) parcel.readParcelable(PublishState.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(PublishState.class, parcel, arrayList3, i2, 1);
                readInt2 = readInt2;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(PublishState.class, parcel, arrayList4, i3, 1);
                readInt3 = readInt3;
            }
            Block block2 = block;
            boolean z3 = parcel.readInt() != 0;
            ArrayList arrayList5 = arrayList;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            int readInt4 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = en.a(VideoAlbumResultData.CREATOR, parcel, arrayList6, i4, 1);
                readInt4 = readInt4;
                block2 = block2;
            }
            Block block3 = block2;
            int readInt5 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt5);
            int i5 = 0;
            while (true) {
                arrayList2 = arrayList6;
                if (i5 == readInt5) {
                    break;
                }
                i5 = en.a(VideoAlbumResultData.CREATOR, parcel, arrayList7, i5, 1);
                arrayList6 = arrayList2;
                readInt5 = readInt5;
            }
            return new PublishState(block3, createFromParcel, coverDo, readString, false, readString2, userId, arrayList5, createFromParcel2, createFromParcel3, z, z2, date, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, donutLevel, donutLevel2, arrayList3, arrayList4, z3, z4, z5, arrayList2, arrayList7, (OrdData) parcel.readParcelable(PublishState.class.getClassLoader()), (OrdData) parcel.readParcelable(PublishState.class.getClassLoader()), parcel.readInt() != 0, (VkOnboardingCampaign) parcel.readParcelable(PublishState.class.getClassLoader()), (VkOnboardingStat$Delegate) parcel.readParcelable(PublishState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : ExitConfirmDialogViewState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, null, false, false, false, parcel.readInt() != 0, parcel.readInt() != 0, 16, 480, null);
        }

        @Override // android.os.Parcelable.Creator
        public final PublishState[] newArray(int i) {
            return new PublishState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublishState(Block block, VideoInfoDo videoInfoDo, CoverDo coverDo, String str, boolean z, String str2, UserId userId, List<VideoAuthorDo> list, VideoAuthorDo videoAuthorDo, VideoAuthorDo videoAuthorDo2, boolean z2, boolean z3, Date date, PublicationDateDialogViewState publicationDateDialogViewState, PrivacyDo privacyDo, PrivacyDo privacyDo2, PrivacyDo privacyDo3, PrivacyDo privacyDo4, DonutLevel donutLevel, DonutLevel donutLevel2, List<? extends VideoFile> list2, List<? extends VideoFile> list3, boolean z4, boolean z5, boolean z6, List<VideoAlbumResultData> list4, List<VideoAlbumResultData> list5, OrdData ordData, OrdData ordData2, boolean z7, VkOnboardingCampaign vkOnboardingCampaign, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, boolean z8, boolean z9, ExitConfirmDialogViewState exitConfirmDialogViewState, boolean z10, boolean z11, f9k0 f9k0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.b = block;
        this.c = videoInfoDo;
        this.d = coverDo;
        this.e = str;
        this.f = z;
        this.g = str2;
        this.h = userId;
        this.i = list;
        this.j = videoAuthorDo;
        this.k = videoAuthorDo2;
        this.l = z2;
        this.m = z3;
        this.n = date;
        this.o = publicationDateDialogViewState;
        this.p = privacyDo;
        this.q = privacyDo2;
        this.r = privacyDo3;
        this.s = privacyDo4;
        this.t = donutLevel;
        this.u = donutLevel2;
        this.v = list2;
        this.w = list3;
        this.x = z4;
        this.y = z5;
        this.z = z6;
        this.A = list4;
        this.B = list5;
        this.C = ordData;
        this.D = ordData2;
        this.E = z7;
        this.F = vkOnboardingCampaign;
        this.G = vkOnboardingStat$Delegate;
        this.H = z8;
        this.I = z9;
        this.J = exitConfirmDialogViewState;
        this.K = z10;
        this.L = z11;
        this.M = f9k0Var;
        this.N = z12;
        this.O = z13;
        this.P = z14;
        this.Q = z15;
        this.R = z16;
        this.S = new bpn0(new iia0(this, 12));
        this.T = new bpn0(new zf20(this, 26));
        this.U = new bpn0(new hj60(this, 18));
        this.V = new bpn0(new f550(this, 19));
        this.W = new bpn0(new wzb0(this, 6));
        this.X = new bpn0(new ag20(this, 26));
        this.Y = new bpn0(new yu60(this, 15));
        this.Z = new bpn0(new ofc0(this, 1));
        this.a0 = new bpn0(new lbc0(this, 7));
        this.b0 = new bpn0(new myd0(this, 3));
        this.c0 = new bpn0(new qkd0(this, 1));
        this.d0 = new bpn0(new i440(this, 26));
    }

    public static PublishState a(PublishState publishState, Block block, VideoInfoDo videoInfoDo, CoverDo coverDo, String str, boolean z, String str2, UserId userId, List list, VideoAuthorDo videoAuthorDo, VideoAuthorDo videoAuthorDo2, boolean z2, boolean z3, Date date, PublicationDateDialogViewState publicationDateDialogViewState, PrivacyDo privacyDo, PrivacyDo privacyDo2, PrivacyDo privacyDo3, PrivacyDo privacyDo4, DonutLevel donutLevel, DonutLevel donutLevel2, List list2, List list3, boolean z4, boolean z5, boolean z6, List list4, List list5, OrdData ordData, OrdData ordData2, boolean z7, VkOnboardingCampaign vkOnboardingCampaign, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, boolean z8, boolean z9, ExitConfirmDialogViewState exitConfirmDialogViewState, boolean z10, boolean z11, f9k0 f9k0Var, boolean z12, boolean z13, boolean z14, boolean z15, int i, int i2) {
        Block block2 = (i & 1) != 0 ? publishState.b : block;
        VideoInfoDo videoInfoDo2 = (i & 2) != 0 ? publishState.c : videoInfoDo;
        CoverDo coverDo2 = (i & 4) != 0 ? publishState.d : coverDo;
        String str3 = (i & 8) != 0 ? publishState.e : str;
        boolean z16 = (i & 16) != 0 ? publishState.f : z;
        String str4 = (i & 32) != 0 ? publishState.g : str2;
        UserId userId2 = (i & 64) != 0 ? publishState.h : userId;
        List list6 = (i & 128) != 0 ? publishState.i : list;
        VideoAuthorDo videoAuthorDo3 = (i & 256) != 0 ? publishState.j : videoAuthorDo;
        VideoAuthorDo videoAuthorDo4 = (i & 512) != 0 ? publishState.k : videoAuthorDo2;
        boolean z17 = (i & 1024) != 0 ? publishState.l : z2;
        boolean z18 = (i & 2048) != 0 ? publishState.m : z3;
        Date date2 = (i & 4096) != 0 ? publishState.n : date;
        Block block3 = block2;
        PublicationDateDialogViewState publicationDateDialogViewState2 = (i & 8192) != 0 ? publishState.o : publicationDateDialogViewState;
        PrivacyDo privacyDo5 = (i & 16384) != 0 ? publishState.p : privacyDo;
        PrivacyDo privacyDo6 = (i & 32768) != 0 ? publishState.q : privacyDo2;
        PrivacyDo privacyDo7 = (i & 65536) != 0 ? publishState.r : privacyDo3;
        PrivacyDo privacyDo8 = (i & 131072) != 0 ? publishState.s : privacyDo4;
        DonutLevel donutLevel3 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? publishState.t : donutLevel;
        DonutLevel donutLevel4 = (i & 524288) != 0 ? publishState.u : donutLevel2;
        List list7 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? publishState.v : list2;
        List list8 = (i & 2097152) != 0 ? publishState.w : list3;
        boolean z19 = (i & 4194304) != 0 ? publishState.x : z4;
        boolean z20 = (i & 8388608) != 0 ? publishState.y : z5;
        boolean z21 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? publishState.z : z6;
        List list9 = (i & 33554432) != 0 ? publishState.A : list4;
        List list10 = (i & 67108864) != 0 ? publishState.B : list5;
        OrdData ordData3 = (i & 134217728) != 0 ? publishState.C : ordData;
        OrdData ordData4 = (i & 268435456) != 0 ? publishState.D : ordData2;
        boolean z22 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? publishState.E : z7;
        VkOnboardingCampaign vkOnboardingCampaign2 = (i & 1073741824) != 0 ? publishState.F : vkOnboardingCampaign;
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate2 = (i & Integer.MIN_VALUE) != 0 ? publishState.G : vkOnboardingStat$Delegate;
        boolean z23 = (i2 & 1) != 0 ? publishState.H : z8;
        boolean z24 = (i2 & 2) != 0 ? publishState.I : z9;
        ExitConfirmDialogViewState exitConfirmDialogViewState2 = (i2 & 4) != 0 ? publishState.J : exitConfirmDialogViewState;
        boolean z25 = (i2 & 8) != 0 ? publishState.K : z10;
        boolean z26 = (i2 & 16) != 0 ? publishState.L : z11;
        f9k0 f9k0Var2 = (i2 & 32) != 0 ? publishState.M : f9k0Var;
        boolean z27 = (i2 & 64) != 0 ? publishState.N : z12;
        boolean z28 = (i2 & 128) != 0 ? publishState.O : z13;
        boolean z29 = (i2 & 256) != 0 ? publishState.P : z14;
        boolean z30 = (i2 & 512) != 0 ? publishState.Q : true;
        boolean z31 = (i2 & 1024) != 0 ? publishState.R : z15;
        publishState.getClass();
        return new PublishState(block3, videoInfoDo2, coverDo2, str3, z16, str4, userId2, list6, videoAuthorDo3, videoAuthorDo4, z17, z18, date2, publicationDateDialogViewState2, privacyDo5, privacyDo6, privacyDo7, privacyDo8, donutLevel3, donutLevel4, list7, list8, z19, z20, z21, list9, list10, ordData3, ordData4, z22, vkOnboardingCampaign2, vkOnboardingStat$Delegate2, z23, z24, exitConfirmDialogViewState2, z25, z26, f9k0Var2, z27, z28, z29, z30, z31);
    }

    public final boolean B() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishState)) {
            return false;
        }
        PublishState publishState = (PublishState) obj;
        return epx.f(this.b, publishState.b) && epx.f(this.c, publishState.c) && epx.f(this.d, publishState.d) && epx.f(this.e, publishState.e) && this.f == publishState.f && epx.f(this.g, publishState.g) && epx.f(this.h, publishState.h) && epx.f(this.i, publishState.i) && epx.f(this.j, publishState.j) && epx.f(this.k, publishState.k) && this.l == publishState.l && this.m == publishState.m && epx.f(this.n, publishState.n) && epx.f(this.o, publishState.o) && epx.f(this.p, publishState.p) && epx.f(this.q, publishState.q) && epx.f(this.r, publishState.r) && epx.f(this.s, publishState.s) && epx.f(this.t, publishState.t) && epx.f(this.u, publishState.u) && epx.f(this.v, publishState.v) && epx.f(this.w, publishState.w) && this.x == publishState.x && this.y == publishState.y && this.z == publishState.z && epx.f(this.A, publishState.A) && epx.f(this.B, publishState.B) && epx.f(this.C, publishState.C) && epx.f(this.D, publishState.D) && this.E == publishState.E && epx.f(this.F, publishState.F) && epx.f(this.G, publishState.G) && this.H == publishState.H && this.I == publishState.I && epx.f(this.J, publishState.J) && this.K == publishState.K && this.L == publishState.L && epx.f(this.M, publishState.M) && this.N == publishState.N && this.O == publishState.O && this.P == publishState.P && this.Q == publishState.Q && this.R == publishState.R;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        VideoInfoDo videoInfoDo = this.c;
        int hashCode2 = (hashCode + (videoInfoDo == null ? 0 : videoInfoDo.hashCode())) * 31;
        CoverDo coverDo = this.d;
        int a2 = bh10.a(urd0.a(qoy.b(urd0.a((hashCode2 + (coverDo == null ? 0 : coverDo.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h.b);
        List<VideoAuthorDo> list = this.i;
        int hashCode3 = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        VideoAuthorDo videoAuthorDo = this.j;
        int hashCode4 = (hashCode3 + (videoAuthorDo == null ? 0 : videoAuthorDo.hashCode())) * 31;
        VideoAuthorDo videoAuthorDo2 = this.k;
        int b = qoy.b(qoy.b((hashCode4 + (videoAuthorDo2 == null ? 0 : videoAuthorDo2.hashCode())) * 31, 31, this.l), 31, this.m);
        Date date = this.n;
        int hashCode5 = (b + (date == null ? 0 : date.hashCode())) * 31;
        PublicationDateDialogViewState publicationDateDialogViewState = this.o;
        int hashCode6 = (this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((hashCode5 + (publicationDateDialogViewState == null ? 0 : publicationDateDialogViewState.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        DonutLevel donutLevel = this.t;
        int hashCode7 = (hashCode6 + (donutLevel == null ? 0 : donutLevel.hashCode())) * 31;
        DonutLevel donutLevel2 = this.u;
        int a3 = fw3.a(fw3.a(qoy.b(qoy.b(qoy.b(fw3.a(fw3.a((hashCode7 + (donutLevel2 == null ? 0 : donutLevel2.hashCode())) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B);
        OrdData ordData = this.C;
        int hashCode8 = (a3 + (ordData == null ? 0 : ordData.hashCode())) * 31;
        OrdData ordData2 = this.D;
        int b2 = qoy.b((hashCode8 + (ordData2 == null ? 0 : ordData2.hashCode())) * 31, 31, this.E);
        VkOnboardingCampaign vkOnboardingCampaign = this.F;
        int hashCode9 = (b2 + (vkOnboardingCampaign == null ? 0 : vkOnboardingCampaign.hashCode())) * 31;
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate = this.G;
        int b3 = qoy.b(qoy.b((hashCode9 + (vkOnboardingStat$Delegate == null ? 0 : vkOnboardingStat$Delegate.hashCode())) * 31, 31, this.H), 31, this.I);
        ExitConfirmDialogViewState exitConfirmDialogViewState = this.J;
        int b4 = qoy.b(qoy.b((b3 + (exitConfirmDialogViewState == null ? 0 : exitConfirmDialogViewState.b.hashCode())) * 31, 31, this.K), 31, this.L);
        f9k0 f9k0Var = this.M;
        return Boolean.hashCode(this.R) + qoy.b(qoy.b(qoy.b(qoy.b((b4 + (f9k0Var != null ? f9k0Var.hashCode() : 0)) * 31, 31, this.N), 31, this.O), 31, this.P), 31, this.Q);
    }

    public final Edit j() {
        return (Edit) this.T.getValue();
    }

    public final Upload o() {
        return (Upload) this.S.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublishState(videoBlock=");
        sb.append(this.b);
        sb.append(", videoInfo=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", isTitleFocused=");
        sb.append(this.f);
        sb.append(", description=");
        sb.append(this.g);
        sb.append(", ownerId=");
        sb.append(this.h);
        sb.append(", authors=");
        sb.append(this.i);
        sb.append(", accountAuthor=");
        sb.append(this.j);
        sb.append(", selectedAuthor=");
        sb.append(this.k);
        sb.append(", isAuthorChangeEnabled=");
        sb.append(this.l);
        sb.append(", isPublicationDateEnabled=");
        sb.append(this.m);
        sb.append(", publicationDate=");
        sb.append(this.n);
        sb.append(", publicationDateDialog=");
        sb.append(this.o);
        sb.append(", privacyWatch=");
        sb.append(this.p);
        sb.append(", privacyWatchInitial=");
        sb.append(this.q);
        sb.append(", privacyComments=");
        sb.append(this.r);
        sb.append(", privacyCommentsInitial=");
        sb.append(this.s);
        sb.append(", donutLevel=");
        sb.append(this.t);
        sb.append(", donutLevelInitial=");
        sb.append(this.u);
        sb.append(", attachedClips=");
        sb.append(this.v);
        sb.append(", attachedClipsInitial=");
        sb.append(this.w);
        sb.append(", isVideoCompressionEnabled=");
        sb.append(this.x);
        sb.append(", isCommunityPostEnabled=");
        sb.append(this.y);
        sb.append(", isUserPostEnabled=");
        sb.append(this.z);
        sb.append(", selectedAlbums=");
        sb.append(this.A);
        sb.append(", selectedAlbumsInitial=");
        sb.append(this.B);
        sb.append(", ordData=");
        sb.append(this.C);
        sb.append(", ordDataInitial=");
        sb.append(this.D);
        sb.append(", isAdvancedItemCompletelyVisible=");
        sb.append(this.E);
        sb.append(", advancedOnboardingCampaign=");
        sb.append(this.F);
        sb.append(", advancedOnboardingStatDelegate=");
        sb.append(this.G);
        sb.append(", isAdvancedOnboardingAvailable=");
        sb.append(this.H);
        sb.append(", isAdvancedOnboardingVisible=");
        sb.append(this.I);
        sb.append(", exitConfirmDialog=");
        sb.append(this.J);
        sb.append(", isExitConfirmDialogAfterBackPress=");
        sb.append(this.K);
        sb.append(", isVideo2ClipsModalVisible=");
        sb.append(this.L);
        sb.append(", snackbar=");
        sb.append(this.M);
        sb.append(", isAuthorListLoading=");
        sb.append(this.N);
        sb.append(", isPrivacyLoading=");
        sb.append(this.O);
        sb.append(", isPublishing=");
        sb.append(this.P);
        sb.append(", isInitialized=");
        sb.append(this.Q);
        sb.append(", refreshAuthorsOnOpen=");
        return q0.a(sb, this.R, ')');
    }

    public final boolean u(Edit edit) {
        String title;
        VideoFile videoFile = edit.b;
        if (!(this.d instanceof CoverDo.Remote)) {
            return true;
        }
        if (!epx.f(drm0.p0(this.e).toString(), (videoFile == null || (title = videoFile.getTitle()) == null) ? null : drm0.p0(title).toString())) {
            return true;
        }
        String j1 = videoFile.j1();
        if (j1 == null) {
            j1 = "";
        }
        if (!epx.f(this.g, j1)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Date date = this.n;
        return (timeUnit.toSeconds(date != null ? date.getTime() : 0L) == ((long) videoFile.k1()) && epx.f(this.p.b, this.q.b) && epx.f(this.r.b, this.s.b) && epx.f(this.t, this.u) && epx.f((List) this.Y.getValue(), (List) this.Z.getValue()) && epx.f((List) this.a0.getValue(), (List) this.b0.getValue()) && epx.f(this.C, this.D)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        VideoInfoDo videoInfoDo = this.c;
        if (videoInfoDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoInfoDo.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        List<VideoAuthorDo> list = this.i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoAuthorDo) f.next()).writeToParcel(parcel, i);
            }
        }
        VideoAuthorDo videoAuthorDo = this.j;
        if (videoAuthorDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAuthorDo.writeToParcel(parcel, i);
        }
        VideoAuthorDo videoAuthorDo2 = this.k;
        if (videoAuthorDo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAuthorDo2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeSerializable(this.n);
        PublicationDateDialogViewState publicationDateDialogViewState = this.o;
        if (publicationDateDialogViewState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicationDateDialogViewState.writeToParcel(parcel, i);
        }
        this.p.writeToParcel(parcel, i);
        this.q.writeToParcel(parcel, i);
        this.r.writeToParcel(parcel, i);
        this.s.writeToParcel(parcel, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.u, i);
        Iterator a2 = ao.a(parcel, this.v);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.w);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        Iterator a4 = ao.a(parcel, this.A);
        while (a4.hasNext()) {
            ((VideoAlbumResultData) a4.next()).writeToParcel(parcel, i);
        }
        Iterator a5 = ao.a(parcel, this.B);
        while (a5.hasNext()) {
            ((VideoAlbumResultData) a5.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.C, i);
        parcel.writeParcelable(this.D, i);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeParcelable(this.F, i);
        parcel.writeParcelable(this.G, i);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        ExitConfirmDialogViewState exitConfirmDialogViewState = this.J;
        if (exitConfirmDialogViewState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exitConfirmDialogViewState.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public PublishState(com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState.Block r40, com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo r41, com.vk.video.ui.upload.impl.publish.domain.model.CoverDo r42, java.lang.String r43, boolean r44, java.lang.String r45, com.vk.dto.common.id.UserId r46, java.util.List r47, com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo r48, com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo r49, boolean r50, boolean r51, java.util.Date r52, com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState r53, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo r54, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo r55, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo r56, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo r57, com.vk.dto.donut.DonutLevel r58, com.vk.dto.donut.DonutLevel r59, java.util.List r60, java.util.List r61, boolean r62, boolean r63, boolean r64, java.util.List r65, java.util.List r66, com.vk.dto.stories.entities.OrdData r67, com.vk.dto.stories.entities.OrdData r68, boolean r69, com.vk.onboarding.api.dto.VkOnboardingCampaign r70, com.vk.onboarding.api.stat.VkOnboardingStat$Delegate r71, boolean r72, boolean r73, com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState r74, boolean r75, boolean r76, xsna.f9k0 r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, int r83, int r84, xsna.zcl r85) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState.<init>(com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState$Block, com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo, com.vk.video.ui.upload.impl.publish.domain.model.CoverDo, java.lang.String, boolean, java.lang.String, com.vk.dto.common.id.UserId, java.util.List, com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo, com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo, boolean, boolean, java.util.Date, com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo, com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo, com.vk.dto.donut.DonutLevel, com.vk.dto.donut.DonutLevel, java.util.List, java.util.List, boolean, boolean, boolean, java.util.List, java.util.List, com.vk.dto.stories.entities.OrdData, com.vk.dto.stories.entities.OrdData, boolean, com.vk.onboarding.api.dto.VkOnboardingCampaign, com.vk.onboarding.api.stat.VkOnboardingStat$Delegate, boolean, boolean, com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState, boolean, boolean, xsna.f9k0, boolean, boolean, boolean, boolean, boolean, int, int, xsna.zcl):void");
    }
}
