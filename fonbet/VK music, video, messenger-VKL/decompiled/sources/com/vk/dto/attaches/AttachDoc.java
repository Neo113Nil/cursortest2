package com.vk.dto.attaches;

import android.net.Uri;
import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.io.File;
import java.util.ArrayList;
import xsna.bh10;
import xsna.bo;
import xsna.brm0;
import xsna.epx;
import xsna.fo8;
import xsna.ftx0;
import xsna.fw3;
import xsna.i5s;
import xsna.ixj0;
import xsna.j5g;
import xsna.n23;
import xsna.nbr;
import xsna.qr;
import xsna.sr;
import xsna.t33;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AttachDoc.kt */
/* loaded from: classes18.dex */
public final class AttachDoc implements AttachWithImage, AttachWithId, AttachWithDownload, ftx0 {
    public static final Serializer.c<AttachDoc> CREATOR = new b();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public DownloadState f;
    public String g;
    public long h;
    public int i;
    public String j;
    public String k;
    public String l;
    public long m;
    public ImageList n;
    public ArrayList o;
    public ImageList p;
    public ArrayList q;
    public String r;
    public String s;
    public boolean t;

    /* compiled from: AttachDoc.kt */
    public static final class a {
        public static AttachDoc a(File file) {
            AttachDoc attachDoc = new AttachDoc();
            attachDoc.c = AttachSyncState.UPLOAD_REQUIRED;
            attachDoc.f = DownloadState.DOWNLOADED;
            attachDoc.g = file.getName();
            attachDoc.h = file.length();
            attachDoc.j = nbr.m(file);
            attachDoc.r = file.getAbsolutePath();
            return attachDoc;
        }

        public static AttachDoc b(Uri uri) {
            AttachDoc attachDoc = new AttachDoc();
            attachDoc.c = AttachSyncState.UPLOAD_REQUIRED;
            attachDoc.r = uri.toString();
            return attachDoc;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AttachDoc> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachDoc a(Serializer serializer) {
            return new AttachDoc(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachDoc[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachDoc() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = DownloadState.DOWNLOAD_REQUIRED;
        this.g = "";
        this.j = "";
        this.k = "";
        this.l = "";
        int i = 1;
        this.n = new ImageList(null, i, 0 == true ? 1 : 0);
        this.o = new ArrayList();
        this.p = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.q = new ArrayList();
        this.r = "";
        this.s = "";
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void A6(DownloadState downloadState) {
        this.f = downloadState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/doc");
        a2.append(this.d);
        a2.append('_');
        a2.append(this.e);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.S(this.f.h());
        serializer.Y(this.e);
        serializer.e0(this.d);
        serializer.j0(this.g);
        serializer.Y(this.h);
        serializer.S(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.Y(this.m);
        serializer.i0(this.n);
        serializer.o0(this.o);
        serializer.i0(this.p);
        serializer.o0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final DownloadState T0() {
        return this.f;
    }

    public final void a(AttachDoc attachDoc) {
        this.b = attachDoc.b;
        this.c = attachDoc.c;
        this.f = attachDoc.f;
        this.e = attachDoc.e;
        this.d = attachDoc.d;
        this.g = attachDoc.g;
        this.h = attachDoc.h;
        this.i = attachDoc.i;
        this.j = attachDoc.j;
        this.k = attachDoc.k;
        this.l = attachDoc.l;
        this.m = attachDoc.m;
        ImageList imageList = attachDoc.n;
        imageList.getClass();
        this.n = new ImageList(imageList);
        this.o = new ArrayList(attachDoc.o);
        ImageList imageList2 = attachDoc.p;
        imageList2.getClass();
        this.p = new ImageList(imageList2);
        this.q = new ArrayList(attachDoc.q);
        this.r = attachDoc.r;
        this.s = attachDoc.s;
        this.t = attachDoc.t;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final void a3(File file) {
        String str;
        if (file == null || (str = file.getAbsolutePath()) == null) {
            str = "";
        }
        this.r = str;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachDoc(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(this.p);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachDoc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachDoc attachDoc = (AttachDoc) obj;
        return this.b == attachDoc.b && this.c == attachDoc.c && this.f == attachDoc.f && this.e == attachDoc.e && epx.f(this.d, attachDoc.d) && epx.f(this.g, attachDoc.g) && this.h == attachDoc.h && this.i == attachDoc.i && epx.f(this.j, attachDoc.j) && epx.f(this.k, attachDoc.k) && epx.f(this.l, attachDoc.l) && this.m == attachDoc.m && epx.f(this.n, attachDoc.n) && epx.f(this.o, attachDoc.o) && epx.f(this.p, attachDoc.p) && epx.f(this.q, attachDoc.q) && epx.f(this.r, attachDoc.r) && epx.f(this.s, attachDoc.s) && this.t == attachDoc.t;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.n);
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final long getContentLength() {
        return this.h;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final String getFileName() {
        String replace;
        if (this.g.length() == 0) {
            replace = Uri.parse(this.k).getLastPathSegment();
            if (replace == null) {
                replace = "unknown";
            }
        } else {
            replace = this.g.replace('/', '_');
        }
        String str = "." + this.j;
        return !brm0.v(replace, str, false) ? fo8.a(replace, str) : replace;
    }

    public final int getHeight() {
        VideoPreview videoPreview = (VideoPreview) j5g.a0(this.o);
        if (videoPreview != null) {
            return videoPreview.c;
        }
        Integer g = ixj0.g(this.p.b);
        if (g != null) {
            return g.intValue();
        }
        Integer g2 = ixj0.g(this.n.b);
        if (g2 != null) {
            return g2.intValue();
        }
        return -1;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final String getUrl() {
        return this.k;
    }

    public final int getWidth() {
        VideoPreview videoPreview = (VideoPreview) j5g.a0(this.o);
        if (videoPreview != null) {
            return videoPreview.b;
        }
        Integer i = ixj0.i(this.p.b);
        if (i != null) {
            return i.intValue();
        }
        Integer i2 = ixj0.i(this.n.b);
        if (i2 != null) {
            return i2.intValue();
        }
        return -1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + urd0.a(urd0.a(qr.a(this.q, fw3.a(qr.a(this.o, fw3.a(bh10.a(urd0.a(urd0.a(urd0.a((((urd0.a(bh10.a((((this.f.hashCode() + bo.a(this.c, this.b * 31, 31)) * 31) + ((int) this.e)) * 31, 31, this.d.b), 31, this.g) + ((int) this.h)) * 31) + this.i) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n.b), 31), 31, this.p.b), 31), 31, this.r), 31, this.s);
    }

    public final boolean i() {
        return this.p.Jb() || this.n.Jb();
    }

    @Override // com.vk.dto.attaches.AttachWithDownload, xsna.ftx0
    public final File i1() {
        String path = Uri.parse(this.r).getPath();
        if (path == null) {
            path = "";
        }
        return new File(path);
    }

    public final boolean j() {
        return this.t;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.AttachWithDownload
    public final Uri t7() {
        return Uri.parse(this.k);
    }

    public final String toString() {
        if (!BuildInfo.h()) {
            StringBuilder sb = new StringBuilder("AttachDoc(localId=");
            sb.append(this.b);
            sb.append(", syncState=");
            sb.append(this.c);
            sb.append(", id=");
            sb.append(this.e);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", size=");
            sb.append(this.h);
            sb.append(", type=");
            sb.append(this.i);
            sb.append(", extension='");
            sb.append(this.j);
            sb.append("', localImageList=");
            sb.append(this.p);
            sb.append(", localVideoPreviewList=");
            sb.append(this.q);
            sb.append(", localFileUri='");
            sb.append(this.r);
            sb.append("', isUnsafe='");
            return n23.b(sb, this.t, "')");
        }
        StringBuilder sb2 = new StringBuilder("AttachDoc(localId=");
        sb2.append(this.b);
        sb2.append(", syncState=");
        sb2.append(this.c);
        sb2.append(", id=");
        sb2.append(this.e);
        sb2.append(", ownerId=");
        sb2.append(this.d);
        sb2.append(", title='");
        sb2.append(this.g);
        sb2.append("', size=");
        sb2.append(this.h);
        sb2.append(", type=");
        sb2.append(this.i);
        sb2.append(", extension='");
        sb2.append(this.j);
        sb2.append("', url='");
        sb2.append(this.k);
        sb2.append("', date='");
        sb2.append(this.m);
        sb2.append("' remoteImageList=");
        sb2.append(this.n);
        sb2.append(", remoteVideoPreviewList=");
        sb2.append(this.o);
        sb2.append(", localImageList=");
        sb2.append(this.p);
        sb2.append(", localVideoPreviewList=");
        sb2.append(this.q);
        sb2.append(", localFileUri='");
        sb2.append(this.r);
        sb2.append("', accessKey='");
        return i5s.a(sb2, this.s, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public final boolean x5() {
        return "gif".equalsIgnoreCase(this.j);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachDoc(AttachDoc attachDoc) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = DownloadState.DOWNLOAD_REQUIRED;
        this.g = "";
        this.j = "";
        this.k = "";
        this.l = "";
        int i = 1;
        this.n = new ImageList(null, i, 0 == true ? 1 : 0);
        this.o = new ArrayList();
        this.p = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.q = new ArrayList();
        this.r = "";
        this.s = "";
        a(attachDoc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachDoc(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = DownloadState.DOWNLOAD_REQUIRED;
        this.g = "";
        this.j = "";
        this.k = "";
        this.l = "";
        int i = 1;
        this.n = new ImageList(null, i, 0 == true ? 1 : 0);
        this.o = new ArrayList();
        this.p = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.q = new ArrayList();
        this.r = "";
        this.s = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        DownloadState.a aVar = DownloadState.Companion;
        int u = serializer.u();
        aVar.getClass();
        this.f = DownloadState.a.a(u);
        this.e = serializer.w();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.g = serializer.H();
        this.h = serializer.w();
        this.i = serializer.u();
        this.j = serializer.H();
        this.k = serializer.H();
        this.l = serializer.H();
        this.m = serializer.w();
        this.n = (ImageList) serializer.G(ImageList.class.getClassLoader());
        Serializer.c<VideoPreview> cVar = VideoPreview.CREATOR;
        this.o = serializer.j(cVar);
        this.p = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.q = serializer.j(cVar);
        this.r = serializer.H();
        this.s = serializer.H();
        this.t = serializer.m();
    }
}
