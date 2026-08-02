package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.io.File;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.ftx0;
import xsna.fw3;
import xsna.i5s;
import xsna.j5g;
import xsna.sr;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachGraffiti.kt */
/* loaded from: classes18.dex */
public final class AttachGraffiti implements AttachWithId, ztx0, ftx0 {
    public static final Serializer.c<AttachGraffiti> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public ImageList f;
    public ImageList g;
    public String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachGraffiti> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachGraffiti a(Serializer serializer) {
            return new AttachGraffiti(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachGraffiti[i];
        }
    }

    public AttachGraffiti() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = new ImageList(null, 1, null);
        this.g = new ImageList(null, 1, null);
        this.h = "";
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        String str2;
        Image Ab = this.f.Ab();
        return (Ab == null || (str2 = Ab.d) == null) ? "" : str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.Y(this.e);
        serializer.e0(this.d);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    public final void a(AttachGraffiti attachGraffiti) {
        this.b = attachGraffiti.b;
        this.c = attachGraffiti.c;
        this.e = attachGraffiti.e;
        this.d = attachGraffiti.d;
        ImageList imageList = attachGraffiti.f;
        imageList.getClass();
        this.f = new ImageList(imageList);
        ImageList imageList2 = attachGraffiti.g;
        imageList2.getClass();
        this.g = new ImageList(imageList2);
        this.h = attachGraffiti.h;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachGraffiti(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachGraffiti.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachGraffiti attachGraffiti = (AttachGraffiti) obj;
        return this.b == attachGraffiti.b && this.c == attachGraffiti.c && this.e == attachGraffiti.e && epx.f(this.d, attachGraffiti.d) && epx.f(this.f, attachGraffiti.f) && epx.f(this.g, attachGraffiti.g) && epx.f(this.h, attachGraffiti.h);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.f;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.h.hashCode() + fw3.a(fw3.a(bh10.a((bo.a(this.c, this.b * 31, 31) + ((int) this.e)) * 31, 31, this.d.b), 31, this.f.b), 31, this.g.b);
    }

    @Override // xsna.ftx0
    public final File i1() {
        String str;
        Image image = (Image) j5g.a0(this.g.b);
        if (image == null || (str = image.d) == null) {
            return null;
        }
        return new File(str);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        if (!BuildInfo.h()) {
            return "AttachGraffiti(localId=" + this.b + ", syncState=" + this.c + ", id=" + this.e + ", ownerId=" + this.d + ", localImageList=" + this.g + ')';
        }
        StringBuilder sb = new StringBuilder("AttachGraffiti(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", remoteImageList=");
        sb.append(this.f);
        sb.append(", localImageList=");
        sb.append(this.g);
        sb.append(", accessKey='");
        return i5s.a(sb, this.h, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachGraffiti(AttachGraffiti attachGraffiti) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = new ImageList(null, 1, null);
        this.g = new ImageList(null, 1, null);
        this.h = "";
        a(attachGraffiti);
    }

    public AttachGraffiti(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = new ImageList(null, 1, null);
        this.g = new ImageList(null, 1, null);
        this.h = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.f = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.g = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.h = serializer.H();
    }
}
