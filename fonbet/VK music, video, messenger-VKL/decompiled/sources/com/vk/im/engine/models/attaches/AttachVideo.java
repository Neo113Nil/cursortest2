package com.vk.im.engine.models.attaches;

import android.net.Uri;
import android.os.Parcel;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.MusicVideoParams;
import com.vk.im.engine.models.camera.VideoParams;
import java.io.File;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.jeq0;
import xsna.jq;
import xsna.shy;
import xsna.sr;
import xsna.ssx0;
import xsna.urd0;
import xsna.y8w;
import xsna.zcl;

/* compiled from: AttachVideo.kt */
/* loaded from: classes2.dex */
public final class AttachVideo implements AttachWithVideo, AttachForMediaViewer, ssx0 {
    public static final Serializer.c<AttachVideo> CREATOR = new a();
    public VideoFile b;
    public ImageList c;
    public ImageList d;
    public long e;
    public ImageList f;
    public int g;
    public int h;
    public long i;
    public int j;
    public long k;
    public Long l;
    public String m;
    public AttachSyncState n;
    public DownloadState o;
    public File p;
    public final long q;
    public VideoParams r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachVideo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachVideo a(Serializer serializer) {
            return new AttachVideo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachVideo[i];
        }
    }

    public AttachVideo(VideoFile videoFile, ImageList imageList, ImageList imageList2, long j, ImageList imageList3, int i, int i2, long j2, int i3, long j3, Long l, String str, AttachSyncState attachSyncState, DownloadState downloadState, File file) {
        this.b = videoFile;
        this.c = imageList;
        this.d = imageList2;
        this.e = j;
        this.f = imageList3;
        this.g = i;
        this.h = i2;
        this.i = j2;
        this.j = i3;
        this.k = j3;
        this.l = l;
        this.m = str;
        this.n = attachSyncState;
        this.o = downloadState;
        this.p = file;
        this.q = -1L;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final VideoFile A() {
        return this.b;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void A6(DownloadState downloadState) {
        this.o = downloadState;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void B5(Long l) {
        this.l = l;
    }

    @Override // xsna.ssx0
    public final long D() {
        return this.b.b0() * 1000;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void E(String str) {
        this.b.E(str);
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.n;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        y8w y8wVar = y8w.b;
        return ((LinksGeneratorComponent) y8w.c.getValue()).Za().a(this.b);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.f);
        serializer.j0(this.m);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.Y(this.i);
        serializer.S(this.j);
        serializer.Y(this.k);
        serializer.b0(this.l);
        serializer.S(this.n.h());
        serializer.Y(this.e);
        serializer.S(this.o.h());
        serializer.g0(this.p);
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void Oa(long j) {
        this.k = j;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void Q1(long j) {
        this.i = j;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.n = attachSyncState;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final DownloadState T0() {
        return this.o;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final VideoParams V6() {
        return this.r;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final long Y1() {
        return this.k;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final ImageList Y8() {
        return this.f;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final ImageList Z2() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void a3(File file) {
        this.p = file;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final String b5() {
        return this.m;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        this.b.V9(userId);
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachVideo(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(this.f);
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void d2(int i) {
        this.h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachVideo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachVideo attachVideo = (AttachVideo) obj;
        return this.g == attachVideo.g && this.h == attachVideo.h && this.i == attachVideo.i && this.j == attachVideo.j && this.k == attachVideo.k && epx.f(this.l, attachVideo.l) && this.n == attachVideo.n && getId() == attachVideo.getId() && epx.f(this.b.I0(), attachVideo.b.I0()) && epx.f(this.c, attachVideo.c) && epx.f(this.d, attachVideo.d) && epx.f(this.f, attachVideo.f) && epx.f(this.m, attachVideo.m) && epx.f(this.b, attachVideo.b) && this.e == attachVideo.e && epx.f(i(), attachVideo.i()) && epx.f(this.p, attachVideo.p) && this.o == attachVideo.o;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.c);
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final long getContentLength() {
        return this.q;
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

    public final String getPlatform() {
        String platform = this.b.getPlatform();
        return platform == null ? "" : platform;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final int getPosition() {
        return this.j;
    }

    public final String getTitle() {
        String title = this.b.getTitle();
        return title == null ? "" : title;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final int getWidth() {
        return this.b.getWidth();
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.j, bh10.a(shy.a(this.h, this.g * 31, 31), 31, this.i), 31), 31, this.k);
        Long l = this.l;
        int a3 = bh10.a(jq.b(this.b, urd0.a(fw3.a(fw3.a(fw3.a(bh10.a((bo.a(this.n, (a2 + (l != null ? l.hashCode() : 0)) * 31, 31) + ((int) getId())) * 31, 31, this.b.I0().b), 31, this.c.b), 31, this.d.b), 31, this.f.b), 31, this.m), 31), 31, this.e);
        MusicVideoParams i = i();
        int hashCode = (a3 + (i != null ? i.hashCode() : 0)) * 31;
        File file = this.p;
        return this.o.hashCode() + ((hashCode + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final MusicVideoParams i() {
        VideoFile videoFile = this.b;
        MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
        if (musicVideoFile != null) {
            return new MusicVideoParams(musicVideoFile);
        }
        return null;
    }

    @Override // xsna.ftx0
    public final File i1() {
        return this.p;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void i8(String str) {
        this.m = str;
    }

    public final boolean isExternal() {
        String platform;
        return (!this.b.isExternal() || (platform = this.b.getPlatform()) == null || platform.length() == 0) ? false : true;
    }

    public final boolean j() {
        return this.b.F4() == VideoCanDownload.FILE || this.b.F4() == VideoCanDownload.CACHE_AND_FILE;
    }

    public final boolean k() {
        return (!super.Q5() || this.b.Ia() || this.b.C2()) ? false : true;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.g = i;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo
    public final void n3(ImageList imageList) {
        this.f = imageList;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.b.I0();
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final int sa() {
        return this.h;
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
        StringBuilder e = fw3.e("AttachVideo(");
        e.append("vide=" + this.b + ", ");
        e.append("localId=" + this.g + ", ");
        e.append("mvCnvMsgId=" + this.h + ", ");
        StringBuilder sb = new StringBuilder("dialogId=");
        sb.append(this.i);
        e.append(sb.toString());
        e.append("position=" + this.j);
        e.append("msgDate=" + this.k);
        e.append("msgExpireTtl=" + this.l);
        e.append("syncState=" + this.n + ", ");
        e.append("lastSyncTime=" + this.e + ", ");
        e.append("id=" + getId() + ", ");
        e.append("ownerId=" + this.b.I0() + ", ");
        if (BuildInfo.h()) {
            e.append("title='" + getTitle() + "', ");
            StringBuilder sb2 = new StringBuilder("description='");
            String j1 = this.b.j1();
            if (j1 == null) {
                j1 = "";
            }
            sb2.append(j1);
            sb2.append("', ");
            e.append(sb2.toString());
        }
        e.append("durationInSeconds=" + this.b.getDuration() + ", ");
        e.append("width=" + this.b.getWidth() + ", ");
        e.append("height=" + this.b.getHeight() + ", ");
        e.append("platform='" + getPlatform() + "', ");
        e.append("localFileUri='" + this.m + "', ");
        e.append("localImageList=" + this.f + ", ");
        if (BuildInfo.h()) {
            e.append("remoteImageList=" + this.c + ", ");
            StringBuilder sb3 = new StringBuilder("accessKey='");
            String C1 = this.b.C1();
            if (C1 == null) {
                C1 = "";
            }
            sb3.append(C1);
            sb3.append("', ");
            e.append(sb3.toString());
            e.append("views=" + this.b.L8() + ", ");
            e.append("canEdit=" + this.b.t0() + ", ");
            e.append("canAdd=" + this.b.i9() + ", ");
            e.append("live=" + this.b.q0() + ", ");
            e.append("upcoming=" + this.b.z0() + ", ");
        }
        e.append("isProcessing=" + this.b.Q0() + ", ");
        e.append("isConverting=" + this.b.s5() + ", ");
        e.append("contentRestricted=" + this.b.Z9() + ", ");
        StringBuilder sb4 = new StringBuilder("restrictionMessage=");
        String J1 = this.b.J1();
        sb4.append(J1 != null ? J1 : "");
        sb4.append(", ");
        e.append(sb4.toString());
        e.append("isMusicVideo=" + epx.f(this.b.getType(), "music_video") + ", ");
        e.append("musicVideoParams=" + i() + ", ");
        e.replace(e.length() + (-2), e.length(), ")");
        return e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void x6(int i) {
        this.j = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.g;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final long y() {
        return this.i;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final Long y5() {
        return this.l;
    }

    @Override // com.vk.im.engine.models.attaches.AttachWithVideo, com.vk.dto.attaches.Attach
    public final AttachWithVideo copy() {
        return new AttachVideo(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachVideo(AttachVideo attachVideo) {
        this(r1, r3, r3, attachVideo.e, r6, attachVideo.g, attachVideo.h, attachVideo.i, attachVideo.j, attachVideo.k, attachVideo.l, r15, attachVideo.n, attachVideo.o, attachVideo.p);
        VideoFile videoFile = attachVideo.b;
        ImageList imageList = attachVideo.c;
        imageList.getClass();
        ImageList imageList2 = new ImageList(imageList);
        ImageList imageList3 = attachVideo.d;
        imageList3.getClass();
        ImageList imageList4 = new ImageList(imageList3);
        ImageList imageList5 = attachVideo.f;
        imageList5.getClass();
        ImageList imageList6 = new ImageList(imageList5);
        String str = attachVideo.m;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AttachVideo(com.vk.dto.common.VideoFile r17, com.vk.dto.common.im.ImageList r18, com.vk.dto.common.im.ImageList r19, long r20, com.vk.dto.common.im.ImageList r22, int r23, int r24, long r25, int r27, long r28, java.lang.Long r30, java.lang.String r31, com.vk.dto.attaches.AttachSyncState r32, com.vk.dto.common.DownloadState r33, java.io.File r34, int r35, xsna.zcl r36) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.im.engine.models.attaches.AttachVideo.<init>(com.vk.dto.common.VideoFile, com.vk.dto.common.im.ImageList, com.vk.dto.common.im.ImageList, long, com.vk.dto.common.im.ImageList, int, int, long, int, long, java.lang.Long, java.lang.String, com.vk.dto.attaches.AttachSyncState, com.vk.dto.common.DownloadState, java.io.File, int, xsna.zcl):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachVideo(Serializer serializer, zcl zclVar) {
        this(r3, r4, r5, r6, r8, r9, r10, r11, r13, r14, r16, r17, r18, DownloadState.a.a(r2), (File) serializer.C());
        VideoFile videoFile = (VideoFile) serializer.G(VideoFile.class.getClassLoader());
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        ImageList imageList2 = (ImageList) serializer.G(ImageList.class.getClassLoader());
        ImageList imageList3 = (ImageList) serializer.G(ImageList.class.getClassLoader());
        String H = serializer.H();
        int u = serializer.u();
        int u2 = serializer.u();
        long w = serializer.w();
        int u3 = serializer.u();
        long w2 = serializer.w();
        Long x = serializer.x();
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
        long w3 = serializer.w();
        DownloadState.a aVar = DownloadState.Companion;
        int u4 = serializer.u();
        aVar.getClass();
    }
}
