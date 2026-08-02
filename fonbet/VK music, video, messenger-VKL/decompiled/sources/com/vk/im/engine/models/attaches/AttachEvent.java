package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.sr;
import xsna.t33;
import xsna.zcl;

/* compiled from: AttachEvent.kt */
/* loaded from: classes2.dex */
public final class AttachEvent implements AttachWithId {
    public static final Serializer.c<AttachEvent> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public String e;
    public final long f;
    public final String g;
    public ImageList h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachEvent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachEvent a(Serializer serializer) {
            return new AttachEvent(serializer.u(), sr.b(serializer, AttachSyncState.Companion), (Peer) serializer.G(Peer.class.getClassLoader()), serializer.H(), serializer.w(), serializer.H(), (ImageList) serializer.G(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachEvent[i];
        }
    }

    public AttachEvent(int i, AttachSyncState attachSyncState, UserId userId, String str, long j, String str2, ImageList imageList) {
        this.b = i;
        this.c = attachSyncState;
        this.d = userId;
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = imageList;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/event");
        a2.append(getId());
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.i0(com.vk.dto.common.a.a(this.d));
        serializer.j0(this.e);
        serializer.Y(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachEvent(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachEvent)) {
            return false;
        }
        AttachEvent attachEvent = (AttachEvent) obj;
        return this.b == attachEvent.b && this.c == attachEvent.c && epx.f(this.d, attachEvent.d) && epx.f(this.e, attachEvent.e) && this.f == attachEvent.f && epx.f(this.g, attachEvent.g) && epx.f(this.h, attachEvent.h);
    }

    @Override // xsna.htx0
    public final long getId() {
        return com.vk.dto.common.a.a(this.d).d;
    }

    public final int hashCode() {
        int a2 = bh10.a(bo.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b);
        String str = this.e;
        int a3 = bh10.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageList imageList = this.h;
        return hashCode + (imageList != null ? imageList.b.hashCode() : 0);
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
        return "AttachEvent(localId=" + this.b + ", syncState=" + this.c + ", ownerId=" + this.d + ", name=" + this.e + ", timeMs=" + this.f + ", address=" + this.g + ", remoteAvatar=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachEvent(int i, AttachSyncState attachSyncState, Peer peer, String str, long j, String str2, ImageList imageList, int i2, zcl zclVar) {
        this(i, attachSyncState, peer, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : imageList);
        i = (i2 & 1) != 0 ? 0 : i;
        attachSyncState = (i2 & 2) != 0 ? AttachSyncState.DONE : attachSyncState;
        if ((i2 & 4) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
    }

    public AttachEvent(int i, AttachSyncState attachSyncState, Peer peer, String str, long j, String str2, ImageList imageList) {
        this(i, attachSyncState, com.vk.dto.common.a.b(peer), str, j, str2, imageList);
    }
}
