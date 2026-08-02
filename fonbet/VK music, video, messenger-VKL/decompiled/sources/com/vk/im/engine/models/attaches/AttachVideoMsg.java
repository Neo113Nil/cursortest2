package com.vk.im.engine.models.attaches;

import android.net.Uri;
import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.attaches.Reaction;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.camera.VideoParams;
import java.io.File;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.gsi0;
import xsna.jeq0;
import xsna.jq;
import xsna.qoy;
import xsna.shy;
import xsna.sr;
import xsna.t33;
import xsna.up2;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AttachVideoMsg.kt */
/* loaded from: classes2.dex */
public final class AttachVideoMsg implements AttachWithVideo, AttachWithTranscription {
    public static final Serializer.c<AttachVideoMsg> CREATOR = new a();
    public VideoFile b;
    public int c;
    public ImageList d;
    public ImageList e;
    public long f;
    public ImageList g;
    public String h;
    public int i;
    public AttachSyncState j;
    public DownloadState k;
    public File l;
    public int m;
    public boolean n;
    public boolean o;
    public final boolean p;
    public final Reaction q;
    public String r;
    public final long s;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachVideoMsg> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachVideoMsg a(Serializer serializer) {
            return new AttachVideoMsg(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachVideoMsg[i];
        }
    }

    public AttachVideoMsg(VideoFile videoFile, int i, ImageList imageList, ImageList imageList2, long j, ImageList imageList3, String str, int i2, AttachSyncState attachSyncState, DownloadState downloadState, File file, int i3, boolean z, boolean z2, boolean z3, Reaction reaction) {
        this.b = videoFile;
        this.c = i;
        this.d = imageList;
        this.e = imageList2;
        this.f = j;
        this.g = imageList3;
        this.h = str;
        this.i = i2;
        this.j = attachSyncState;
        this.k = downloadState;
        this.l = file;
        this.m = i3;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = reaction;
        this.r = "";
        this.s = -1L;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final VideoFile A() {
        return this.b;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void A6(DownloadState downloadState) {
        this.k = downloadState;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void E(String str) {
        this.b.E(str);
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.j;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final int Ka() {
        return this.m;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final Reaction L6() {
        return this.q;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/video");
        a2.append(this.b.I0());
        a2.append('_');
        a2.append(getId());
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.S(this.i);
        serializer.S(this.j.h());
        serializer.Y(this.f);
        serializer.S(this.k.h());
        serializer.g0(this.l);
        serializer.S(this.m);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        Reaction reaction = this.q;
        serializer.V(reaction != null ? Integer.valueOf(reaction.i()) : null);
        if (this.r.length() > 16000) {
            serializer.S(2);
            serializer.M(super.r7(this.r));
        } else {
            serializer.S(1);
            serializer.j0(this.r);
        }
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.j = attachSyncState;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final DownloadState T0() {
        return this.k;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final VideoParams V6() {
        return null;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final String Y4() {
        return this.r;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final ImageList Y8() {
        return this.g;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final ImageList Z2() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void a3(File file) {
        this.l = file;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final String b5() {
        return this.h;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        this.b.V9(userId);
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachVideoMsg(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(this.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachVideoMsg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachVideoMsg attachVideoMsg = (AttachVideoMsg) obj;
        return getId() == attachVideoMsg.getId() && this.i == attachVideoMsg.i && epx.f(this.b.I0(), attachVideoMsg.b.I0()) && this.j == attachVideoMsg.j && epx.f(this.e, attachVideoMsg.e) && epx.f(this.d, attachVideoMsg.d) && epx.f(this.g, attachVideoMsg.g) && epx.f(this.h, attachVideoMsg.h) && epx.f(this.b, attachVideoMsg.b) && this.c == attachVideoMsg.c && this.f == attachVideoMsg.f && epx.f(this.l, attachVideoMsg.l) && this.k == attachVideoMsg.k && epx.f(this.r, attachVideoMsg.r) && this.m == attachVideoMsg.m && this.o == attachVideoMsg.o && this.n == attachVideoMsg.n && this.p == attachVideoMsg.p && this.q == attachVideoMsg.q;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.d);
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final boolean gb() {
        return this.p;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final long getContentLength() {
        return this.s;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final String getFileName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.I0());
        sb.append('_');
        sb.append(getId());
        return sb.toString();
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final int getHeight() {
        return this.b.getHeight();
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b.o0();
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final int getWidth() {
        return this.b.getWidth();
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.m, urd0.a(bh10.a(shy.a(this.c, jq.b(this.b, urd0.a(fw3.a(fw3.a(fw3.a(bh10.a((bo.a(this.j, this.i * 31, 31) + ((int) getId())) * 31, 31, this.b.I0().b), 31, this.d.b), 31, this.e.b), 31, this.g.b), 31, this.h), 31), 31), 31, this.f), 31, this.r), 31), 31, this.o), 31, this.n), 31, this.p);
        Reaction reaction = this.q;
        return b + (reaction != null ? reaction.hashCode() : 0);
    }

    public final int i() {
        return this.b.getDuration();
    }

    @Override // xsna.ftx0
    public final File i1() {
        return this.l;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void i8(String str) {
        this.h = str;
    }

    public final boolean j() {
        return this.b.F4() == VideoCanDownload.FILE || this.b.F4() == VideoCanDownload.CACHE_AND_FILE;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final void k9(boolean z) {
        this.o = z;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.i = i;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final boolean m4() {
        return this.o;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void n3(ImageList imageList) {
        this.g = imageList;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final void na(int i) {
        this.m = 1;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.b.I0();
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void setId(long j) {
        this.b.y7((int) j);
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final Uri t7() {
        Uri g;
        String T7 = this.b.T7();
        return (T7 == null || (g = jeq0.g(T7)) == null) ? jeq0.g("") : g;
    }

    public final String toString() {
        boolean h = BuildInfo.h();
        Reaction reaction = this.q;
        boolean z = this.p;
        if (!h) {
            StringBuilder sb = new StringBuilder("AttachVideoMsg(localId=");
            sb.append(this.i);
            sb.append(", syncState=");
            sb.append(this.j);
            sb.append(", id=");
            sb.append(getId());
            sb.append(", ownerId=");
            sb.append(this.b.I0());
            sb.append(", durationInSeconds=");
            sb.append(this.b.getDuration());
            sb.append(", width=");
            sb.append(this.b.getWidth());
            sb.append(", height=");
            sb.append(this.b.getHeight());
            sb.append(", platform='");
            String platform = this.b.getPlatform();
            if (platform == null) {
                platform = "";
            }
            sb.append(platform);
            sb.append("', shapeId='");
            sb.append(this.c);
            sb.append("', localImageList=");
            sb.append(this.g);
            sb.append(", localFileUri='");
            sb.append(this.h);
            sb.append("', isProcessing=");
            sb.append(this.b.Q0());
            sb.append(", isConverting=");
            sb.append(this.b.s5());
            sb.append(", contentRestricted=");
            sb.append(this.b.Z9());
            sb.append(", restrictionMessage=");
            String J1 = this.b.J1();
            sb.append(J1 == null ? "" : J1);
            sb.append(", isTranscriptEdited=");
            sb.append(this.n);
            sb.append(", transcriptState=");
            sb.append(this.m);
            sb.append(", isTranscriptRateEnabled = ");
            sb.append(z);
            sb.append(", transcriptRateMark = ");
            sb.append(reaction);
            sb.append(", availableUrls = ");
            sb.append(this.b.k2());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("AttachVideoMsg(localId=");
        sb2.append(this.i);
        sb2.append(", syncState=");
        sb2.append(this.j);
        sb2.append(", id=");
        sb2.append(getId());
        sb2.append(", ownerId=");
        sb2.append(this.b.I0());
        sb2.append(", title='");
        String title = this.b.getTitle();
        if (title == null) {
            title = "";
        }
        sb2.append(title);
        sb2.append("', description='");
        String j1 = this.b.j1();
        if (j1 == null) {
            j1 = "";
        }
        sb2.append(j1);
        sb2.append("', durationInSeconds=");
        sb2.append(this.b.getDuration());
        sb2.append(", width=");
        sb2.append(this.b.getWidth());
        sb2.append(", height=");
        sb2.append(this.b.getHeight());
        sb2.append(", platform='");
        String platform2 = this.b.getPlatform();
        if (platform2 == null) {
            platform2 = "";
        }
        sb2.append(platform2);
        sb2.append("', shapeId='");
        sb2.append(this.c);
        sb2.append("', remoteImageList=");
        sb2.append(this.d);
        sb2.append(", localImageList=");
        sb2.append(this.g);
        sb2.append(", localFileUri='");
        sb2.append(this.h);
        sb2.append("', isProcessing=");
        sb2.append(this.b.Q0());
        sb2.append(", accessKey='");
        String C1 = this.b.C1();
        if (C1 == null) {
            C1 = "";
        }
        sb2.append(C1);
        sb2.append("', views=");
        sb2.append(this.b.L8());
        sb2.append(", canEdit=");
        sb2.append(this.b.t0());
        sb2.append(", canAdd=");
        sb2.append(this.b.i9());
        sb2.append(", contentRestricted=");
        sb2.append(this.b.Z9());
        sb2.append(", restrictionMessage=");
        String J12 = this.b.J1();
        sb2.append(J12 == null ? "" : J12);
        sb2.append(", transcriptState=");
        sb2.append(this.m);
        sb2.append(", isTranscriptEdited=");
        gsi0.c(sb2, this.n, ", isTranscriptRateEnabled = ", z, ", transcriptRateMark = ");
        sb2.append(reaction);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final boolean u1() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.i;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final void ya(String str) {
        this.r = str;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo, com.vk.dto.attaches.Attach
    public final AttachWithVideo copy() {
        return new AttachVideoMsg(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachVideoMsg(AttachVideoMsg attachVideoMsg) {
        this(r2, r3, r4, r5, r6, new ImageList(r1), attachVideoMsg.h, attachVideoMsg.i, attachVideoMsg.j, attachVideoMsg.k, attachVideoMsg.l, attachVideoMsg.m, attachVideoMsg.n, attachVideoMsg.o, attachVideoMsg.p, attachVideoMsg.q, 16, null);
        VideoFile videoFile = attachVideoMsg.b;
        int i = attachVideoMsg.c;
        ImageList imageList = attachVideoMsg.d;
        imageList.getClass();
        ImageList imageList2 = new ImageList(imageList);
        ImageList imageList3 = attachVideoMsg.e;
        imageList3.getClass();
        ImageList imageList4 = new ImageList(imageList3);
        ImageList imageList5 = attachVideoMsg.g;
        imageList5.getClass();
        long j = 0;
        this.r = attachVideoMsg.r;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AttachVideoMsg(VideoFile videoFile, int i, ImageList imageList, ImageList imageList2, long j, ImageList imageList3, String str, int i2, AttachSyncState attachSyncState, DownloadState downloadState, File file, int i3, boolean z, boolean z2, boolean z3, Reaction reaction, int i4, zcl zclVar) {
        this(videoFile, i, r7, r8, r9, r11, r12, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? AttachSyncState.DONE : attachSyncState, (i4 & 512) != 0 ? DownloadState.DOWNLOAD_REQUIRED : downloadState, (i4 & 1024) != 0 ? up2.u(Uri.parse(r12)) : file, (i4 & 2048) != 0 ? 0 : i3, (i4 & 4096) != 0 ? false : z, (i4 & 8192) != 0 ? false : z2, (i4 & 16384) != 0 ? false : z3, (i4 & 32768) != 0 ? null : reaction);
        ImageList imageList4 = (i4 & 4) != 0 ? new ImageList(null, 1, null) : imageList;
        ImageList imageList5 = (i4 & 8) != 0 ? new ImageList(null, 1, null) : imageList2;
        long b0 = (i4 & 16) != 0 ? videoFile.b0() * 1000 : j;
        ImageList imageList6 = (i4 & 32) != 0 ? new ImageList(null, 1, null) : imageList3;
        String str2 = (i4 & 64) != 0 ? "" : str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachVideoMsg(Serializer serializer, zcl zclVar) {
        this(r1, r2, r4, r5, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        Reaction reaction;
        String H;
        VideoFile videoFile = (VideoFile) serializer.G(VideoFile.class.getClassLoader());
        int u = serializer.u();
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        ImageList imageList2 = (ImageList) serializer.G(ImageList.class.getClassLoader());
        ImageList imageList3 = (ImageList) serializer.G(ImageList.class.getClassLoader());
        String H2 = serializer.H();
        int u2 = serializer.u();
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
        long w = serializer.w();
        DownloadState.a aVar = DownloadState.Companion;
        int u3 = serializer.u();
        aVar.getClass();
        DownloadState a2 = DownloadState.a.a(u3);
        File file = (File) serializer.C();
        int u4 = serializer.u();
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        Integer v = serializer.v();
        if (v != null) {
            int intValue = v.intValue();
            Reaction.Companion.getClass();
            reaction = Reaction.a.a(intValue);
        } else {
            reaction = null;
        }
        int u5 = serializer.u();
        if (u5 == 1) {
            H = serializer.H();
        } else if (u5 != 2) {
            H = "";
        } else {
            H = super.W4(serializer.a());
        }
        this.r = H;
    }
}
