package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.j5g;
import xsna.qxm0;
import xsna.sr;
import xsna.t33;
import xsna.vu5;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachPlaylist.kt */
/* loaded from: classes2.dex */
public final class AttachPlaylist implements AttachWithId, ztx0 {
    public static final Serializer.c<AttachPlaylist> CREATOR = new a();
    public Playlist b;
    public int c;
    public AttachSyncState d;
    public final UserId e;
    public final long f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachPlaylist a(Serializer serializer) {
            return new AttachPlaylist(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachPlaylist[i];
        }
    }

    public AttachPlaylist(Playlist playlist, int i, AttachSyncState attachSyncState, UserId userId, long j) {
        this.b = playlist;
        this.c = i;
        this.d = attachSyncState;
        this.e = userId;
        this.f = j;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/audios");
        UserId userId = this.e;
        a2.append(userId);
        a2.append("?z=audio_playlist");
        a2.append(userId);
        a2.append('_');
        a2.append(this.f);
        a2.append('/');
        String str2 = this.b.x;
        if (str2 == null) {
            str2 = "";
        }
        a2.append(str2);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.S(this.d.h());
        serializer.Y(this.f);
        serializer.e0(this.e);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.d = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachPlaylist(this);
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
        if (!(obj instanceof AttachPlaylist)) {
            return false;
        }
        AttachPlaylist attachPlaylist = (AttachPlaylist) obj;
        return this.c == attachPlaylist.c && this.d == attachPlaylist.d && this.f == attachPlaylist.f && epx.f(this.e, attachPlaylist.e) && epx.f(this.b, attachPlaylist.b) && epx.f(this.b.m, attachPlaylist.b.m) && epx.f(this.b.p, attachPlaylist.b.p) && epx.f(this.b.h, attachPlaylist.b.h) && epx.f(this.b.B, attachPlaylist.b.B) && this.b.C == attachPlaylist.b.C;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        List<Thumb> list = this.b.p;
        return new ImageList(qxm0.h(list != null ? (Thumb) j5g.a0(list) : null));
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.f;
    }

    public final String getTitle() {
        String str = this.b.h;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        return this.b.hashCode() + bh10.a((bo.a(this.d, this.c * 31, 31) + ((int) this.f)) * 31, 31, this.e.b);
    }

    public final boolean i() {
        return this.b.d == 1;
    }

    public final boolean j() {
        return this.b.d == 5;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.c = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.e;
    }

    public final String toString() {
        boolean h = BuildInfo.h();
        UserId userId = this.e;
        long j = this.f;
        if (h) {
            return "AttachPlaylist(localId=" + this.c + ", syncState=" + this.d + ", id=" + j + ", ownerId=" + userId + ", playlist='" + this.b + "')";
        }
        StringBuilder sb = new StringBuilder("AttachPlaylist(localId=");
        sb.append(this.c);
        sb.append(", syncState=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(j);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", type=");
        sb.append(this.b.d);
        sb.append(", count=");
        return vu5.b(sb, this.b.v, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    public /* synthetic */ AttachPlaylist(Playlist playlist, int i, AttachSyncState attachSyncState, UserId userId, long j, int i2, zcl zclVar) {
        this(playlist, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 8) != 0 ? playlist.c : userId, (i2 & 16) != 0 ? playlist.b : j);
    }

    public AttachPlaylist(AttachPlaylist attachPlaylist) {
        this(attachPlaylist.b, attachPlaylist.c, null, null, 0L, 28, null);
    }

    public AttachPlaylist(Serializer serializer, zcl zclVar) {
        this((Playlist) serializer.G(Playlist.class.getClassLoader()), serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.w());
    }
}
