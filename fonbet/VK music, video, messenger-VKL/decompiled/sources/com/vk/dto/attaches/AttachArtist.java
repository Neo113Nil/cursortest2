package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicTrack;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.ms9;
import xsna.qoy;
import xsna.sr;
import xsna.t33;
import xsna.urd0;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachArtist.kt */
/* loaded from: classes18.dex */
public final class AttachArtist implements Attach, ztx0 {
    public static final Serializer.c<AttachArtist> CREATOR = new a();
    public final String b;
    public final String c;
    public final ImageList d;
    public final boolean e;
    public final UserId f;
    public int g;
    public AttachSyncState h;
    public final String i;
    public final boolean j;
    public final List<MusicTrack> k;
    public final List<Genre> l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachArtist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachArtist a(Serializer serializer) {
            return new AttachArtist(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachArtist[i];
        }
    }

    public AttachArtist() {
        this(null, null, null, false, null, 0, null, null, false, null, null, 2047, null);
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.h;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/artist/");
        a2.append(this.b);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.e0(this.f);
        serializer.S(this.g);
        serializer.S(this.h.h());
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.o0(this.k);
        serializer.o0(this.l);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.h = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachArtist(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachArtist)) {
            return false;
        }
        AttachArtist attachArtist = (AttachArtist) obj;
        return this.g == attachArtist.g && this.h == attachArtist.h && epx.f(this.b, attachArtist.b) && epx.f(this.f, attachArtist.f) && epx.f(this.c, attachArtist.c) && epx.f(this.d, attachArtist.d) && this.e == attachArtist.e && this.j == attachArtist.j && epx.f(this.k, attachArtist.k) && epx.f(this.l, attachArtist.l);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.d);
    }

    public final int hashCode() {
        return this.l.hashCode() + fw3.a(qoy.b(qoy.b(fw3.a(urd0.a(bh10.a(urd0.a(bo.a(this.h, this.g * 31, 31), 31, this.b), 31, this.f.b), 31, this.c), 31, this.d.b), 31, this.e), 31, this.j), 31, this.k);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.g = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.f;
    }

    public final String toString() {
        boolean h = BuildInfo.h();
        UserId userId = this.f;
        String str = this.b;
        if (!h) {
            StringBuilder sb = new StringBuilder("AttachArtist(localId=");
            sb.append(this.g);
            sb.append(", syncState=");
            sb.append(this.h);
            sb.append(", id=");
            sb.append(str);
            sb.append(", ownerId=");
            return gp.b(sb, userId, ')');
        }
        StringBuilder sb2 = new StringBuilder("AttachArtist(localId=");
        sb2.append(this.g);
        sb2.append(", syncState=");
        sb2.append(this.h);
        sb2.append(", id=");
        sb2.append(str);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", name='");
        sb2.append(this.c);
        sb2.append("', thumbList=");
        sb2.append(this.d);
        sb2.append(", blur=");
        sb2.append(this.e);
        sb2.append(", trackCode = ");
        sb2.append(this.i);
        sb2.append(", canPlay=");
        sb2.append(this.j);
        sb2.append(", genres=");
        sb2.append(this.l);
        sb2.append(", tracks=");
        return ms9.a(')', sb2, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.g;
    }

    public AttachArtist(String str, String str2, ImageList imageList, boolean z, UserId userId, int i, AttachSyncState attachSyncState, String str3, boolean z2, List<MusicTrack> list, List<Genre> list2) {
        this.b = str;
        this.c = str2;
        this.d = imageList;
        this.e = z;
        this.f = userId;
        this.g = i;
        this.h = attachSyncState;
        this.i = str3;
        this.j = z2;
        this.k = list;
        this.l = list2;
    }

    public AttachArtist(String str, String str2, ImageList imageList, boolean z, UserId userId, int i, AttachSyncState attachSyncState, String str3, boolean z2, List list, List list2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new ImageList(null, 1, null) : imageList, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? UserId.d : userId, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? EmptyList.b : list, (i2 & 1024) != 0 ? EmptyList.b : list2);
    }

    public AttachArtist(AttachArtist attachArtist) {
        this(attachArtist.b, attachArtist.c, attachArtist.d, attachArtist.e, attachArtist.f, attachArtist.g, attachArtist.h, attachArtist.i, attachArtist.j, attachArtist.k, attachArtist.l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachArtist(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r13 == null ? EmptyList.b : r13);
        String H = serializer.H();
        String H2 = serializer.H();
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        boolean m = serializer.m();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        int u = serializer.u();
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
        String H3 = serializer.H();
        String str = H3 == null ? "" : H3;
        boolean m2 = serializer.m();
        List j = serializer.j(MusicTrack.CREATOR);
        List list = j == null ? EmptyList.b : j;
        List j2 = serializer.j(Genre.CREATOR);
    }
}
