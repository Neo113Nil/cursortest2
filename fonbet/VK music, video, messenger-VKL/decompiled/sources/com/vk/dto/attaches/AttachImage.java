package com.vk.dto.attaches;

import android.net.Uri;
import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.nft.NftMeta;
import java.io.File;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.ftx0;
import xsna.fw3;
import xsna.ixj0;
import xsna.jeq0;
import xsna.qoy;
import xsna.shy;
import xsna.sr;
import xsna.ssx0;
import xsna.t33;
import xsna.urd0;
import xsna.x74;
import xsna.zcl;

/* compiled from: AttachImage.kt */
/* loaded from: classes18.dex */
public final class AttachImage implements AttachWithImage, AttachWithId, AttachForMediaViewer, ssx0, ftx0, AttachWithDownload, x74 {
    public static final Serializer.c<AttachImage> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public int f;
    public long g;
    public int h;
    public long i;
    public Long j;
    public long k;
    public File l;
    public DownloadState m;
    public final long n;
    public int o;
    public UserId p;
    public ImageList q;
    public ImageList r;
    public String s;
    public String t;
    public boolean u;
    public PhotoRestriction v;
    public NftMeta w;
    public boolean x;
    public String y;
    public Long z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachImage a(Serializer serializer) {
            return new AttachImage(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachImage[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachImage() {
        this.c = AttachSyncState.DONE;
        UserId userId = UserId.d;
        this.d = userId;
        this.m = DownloadState.DOWNLOAD_REQUIRED;
        this.n = -1L;
        this.p = userId;
        int i = 1;
        this.q = new ImageList(null, i, 0 == true ? 1 : 0);
        this.r = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.s = "";
        this.t = "";
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void A6(DownloadState downloadState) {
        this.m = downloadState;
    }

    @Override // xsna.x74
    public final void A9(boolean z) {
        this.x = z;
    }

    @Override // xsna.x74
    public final String B1() {
        return this.y;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void B5(Long l) {
        this.j = l;
    }

    @Override // xsna.ssx0
    public final long D() {
        return this.k;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/photo");
        a2.append(this.d);
        a2.append('_');
        a2.append(this.e);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.Y(this.e);
        serializer.S(this.f);
        serializer.Y(this.g);
        serializer.S(this.h);
        serializer.Y(this.i);
        serializer.b0(this.j);
        serializer.S(this.o);
        serializer.e0(this.d);
        serializer.e0(this.p);
        serializer.Y(this.k);
        serializer.i0(this.q);
        serializer.i0(this.r);
        serializer.g0(this.l);
        serializer.S(this.m.h());
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.i0(this.v);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.i0(this.w);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.m0(this.y);
        serializer.b0(this.z);
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void Oa(long j) {
        this.i = j;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void Q1(long j) {
        this.g = j;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final DownloadState T0() {
        return this.m;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final long Y1() {
        return this.i;
    }

    public final ImageList Y8() {
        return this.r;
    }

    public final void a(AttachImage attachImage) {
        this.b = attachImage.b;
        this.c = attachImage.c;
        this.e = attachImage.e;
        this.f = attachImage.f;
        this.g = attachImage.g;
        this.h = attachImage.h;
        this.i = attachImage.i;
        this.j = attachImage.j;
        this.o = attachImage.o;
        this.d = attachImage.d;
        this.p = attachImage.p;
        this.k = attachImage.k;
        ImageList imageList = attachImage.q;
        imageList.getClass();
        this.q = new ImageList(imageList);
        ImageList imageList2 = attachImage.r;
        imageList2.getClass();
        this.r = new ImageList(imageList2);
        this.l = attachImage.l;
        this.m = attachImage.m;
        this.s = attachImage.s;
        this.t = attachImage.t;
        this.u = attachImage.u;
        this.v = attachImage.v;
        this.w = attachImage.w;
        this.x = attachImage.x;
        this.y = attachImage.y;
        this.z = attachImage.z;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void a3(File file) {
        this.l = file;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        this.d = userId;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachImage(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return this.r;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void d2(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachImage.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachImage attachImage = (AttachImage) obj;
        return this.b == attachImage.b && this.c == attachImage.c && epx.f(this.d, attachImage.d) && this.e == attachImage.e && this.f == attachImage.f && this.g == attachImage.g && this.h == attachImage.h && this.i == attachImage.i && epx.f(this.j, attachImage.j) && this.k == attachImage.k && epx.f(this.l, attachImage.l) && this.m == attachImage.m && this.n == attachImage.n && this.o == attachImage.o && epx.f(this.p, attachImage.p) && epx.f(this.q, attachImage.q) && epx.f(this.r, attachImage.r) && epx.f(this.s, attachImage.s) && epx.f(this.t, attachImage.t) && epx.f(this.v, attachImage.v) && this.u == attachImage.u && epx.f(this.w, attachImage.w) && this.x == attachImage.x && epx.f(this.y, attachImage.y) && epx.f(this.z, attachImage.z);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.q;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final long getContentLength() {
        return this.n;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final String getFileName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append('_');
        sb.append(this.e);
        return sb.toString();
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final int getPosition() {
        return this.h;
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.h, bh10.a(shy.a(this.f, bh10.a(bo.a(this.c, this.b * 31, 31), 31, this.e), 31), 31, this.g), 31), 31, this.i);
        Long l = this.j;
        int a3 = bh10.a((a2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.k);
        File file = this.l;
        int a4 = urd0.a(urd0.a(fw3.a(fw3.a(bh10.a(bh10.a(bh10.a((bh10.a((this.m.hashCode() + ((a3 + (file != null ? file.hashCode() : 0)) * 31)) * 31, 31, this.n) + this.o) * 31, 31, this.d.b), 31, this.p.b), 31, this.k), 31, this.q.b), 31, this.r.b), 31, this.s), 31, this.t);
        PhotoRestriction photoRestriction = this.v;
        int b = qoy.b((a4 + (photoRestriction != null ? photoRestriction.hashCode() : 0)) * 31, 31, this.u);
        NftMeta nftMeta = this.w;
        int b2 = qoy.b((b + (nftMeta != null ? nftMeta.hashCode() : 0)) * 31, 31, this.x);
        String str = this.y;
        int hashCode = (b2 + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.z;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean i() {
        return this.u;
    }

    @Override // xsna.ftx0
    public final File i1() {
        return this.l;
    }

    @Override // xsna.x74
    public final void i5(String str) {
        this.y = str;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // xsna.x74
    public final boolean o1() {
        return this.x;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final int sa() {
        return this.f;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final Uri t7() {
        String h = ixj0.h(this.q.b);
        if (h == null) {
            h = "";
        }
        return jeq0.g(h);
    }

    public final String toString() {
        if (!BuildInfo.h()) {
            return "AttachImage(localId=" + this.b + ", syncState=" + this.c + ", id=" + this.e + ", mvCnvMsgId=" + this.f + ", dialogId = " + this.g + ", position = " + this.h + ", msgDate = " + this.i + ", msgExpireTtl = " + this.j + ", albumId=" + this.o + ", ownerId=" + this.d + ", senderId=" + this.p + ", date=" + this.k + ", localImageList=" + this.r + "), nft=" + this.w;
        }
        return "AttachImage(localId=" + this.b + ", syncState=" + this.c + ", id=" + this.e + ", mvCnvMsgId=" + this.f + ", dialogId = " + this.g + ", position = " + this.h + ", msgDate = " + this.i + ", msgExpireTtl = " + this.j + ", albumId=" + this.o + ", ownerId=" + this.d + ", senderId=" + this.p + ", date=" + this.k + ", remoteImageList=" + this.q + ", localImageList=" + this.r + ", description='" + this.s + "', accessKey='" + this.t + ", restriction=" + this.v + ", hasRestriction=" + this.u + ", nft=" + this.w + ", isDonat=" + this.x + ", blurMask=" + this.y + ", blurredId=" + this.z + ")')";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final void x6(int i) {
        this.h = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final long y() {
        return this.g;
    }

    @Override // com.vk.dto.attaches.AttachForMediaViewer
    public final Long y5() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachImage(AttachImage attachImage) {
        this.c = AttachSyncState.DONE;
        UserId userId = UserId.d;
        this.d = userId;
        this.m = DownloadState.DOWNLOAD_REQUIRED;
        this.n = -1L;
        this.p = userId;
        int i = 1;
        this.q = new ImageList(null, i, 0 == true ? 1 : 0);
        this.r = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.s = "";
        this.t = "";
        a(attachImage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachImage(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        UserId userId = UserId.d;
        this.d = userId;
        this.m = DownloadState.DOWNLOAD_REQUIRED;
        this.n = -1L;
        this.p = userId;
        int i = 1;
        this.q = new ImageList(null, i, 0 == true ? 1 : 0);
        this.r = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.s = "";
        this.t = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.f = serializer.u();
        this.g = serializer.w();
        this.h = serializer.u();
        this.i = serializer.w();
        this.j = serializer.x();
        this.o = serializer.u();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.p = (UserId) serializer.A(UserId.class.getClassLoader());
        this.k = serializer.w();
        this.q = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.r = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.l = (File) serializer.C();
        DownloadState.a aVar = DownloadState.Companion;
        int u = serializer.u();
        aVar.getClass();
        this.m = DownloadState.a.a(u);
        this.s = serializer.H();
        this.t = serializer.H();
        this.v = (PhotoRestriction) serializer.G(PhotoRestriction.class.getClassLoader());
        this.u = serializer.m();
        this.w = (NftMeta) serializer.G(NftMeta.class.getClassLoader());
        this.x = serializer.m();
        this.y = serializer.I();
        this.z = serializer.x();
    }
}
