package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.gp;
import xsna.sr;
import xsna.t33;
import xsna.zcl;

/* compiled from: AttachAudio.kt */
/* loaded from: classes18.dex */
public final class AttachAudio implements AttachWithId {
    public static final Serializer.c<AttachAudio> CREATOR = new a();
    public final MusicTrack b;
    public int c;
    public AttachSyncState d;
    public final UserId e;
    public final long f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachAudio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachAudio a(Serializer serializer) {
            return new AttachAudio(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachAudio[i];
        }
    }

    public AttachAudio(MusicTrack musicTrack, int i, AttachSyncState attachSyncState, UserId userId, long j) {
        this.b = musicTrack;
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
        StringBuilder a2 = t33.a("https://", str, "/audio");
        a2.append(this.e);
        a2.append('_');
        a2.append(this.f);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.S(this.d.h());
        serializer.e0(this.e);
        serializer.Y(this.f);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.d = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachAudio(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachAudio.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachAudio attachAudio = (AttachAudio) obj;
        return this.c == attachAudio.c && this.d == attachAudio.d && this.f == attachAudio.f && epx.f(this.e, attachAudio.e) && epx.f(this.b, attachAudio.b);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.f;
    }

    public final int hashCode() {
        return this.b.hashCode() + bh10.a((bo.a(this.d, this.c * 31, 31) + ((int) this.f)) * 31, 31, this.e.b);
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
        StringBuilder sb = new StringBuilder("AttachAudio(localId=");
        sb.append(this.c);
        sb.append(", syncState=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(", ownerId=");
        return gp.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    public /* synthetic */ AttachAudio(MusicTrack musicTrack, int i, AttachSyncState attachSyncState, UserId userId, long j, int i2, zcl zclVar) {
        this(musicTrack, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 8) != 0 ? musicTrack.c : userId, (i2 & 16) != 0 ? musicTrack.b : j);
    }

    public AttachAudio(MusicTrack musicTrack) {
        this(musicTrack, 0, null, null, 0L, 28, null);
    }

    public AttachAudio(AttachAudio attachAudio) {
        this(attachAudio.b, attachAudio.c, attachAudio.d, attachAudio.e, attachAudio.f);
    }

    public AttachAudio(Serializer serializer, zcl zclVar) {
        this((MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.w());
    }
}
