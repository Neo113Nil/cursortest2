package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import xsna.bo;
import xsna.epx;
import xsna.sr;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AttachPoll.kt */
/* loaded from: classes2.dex */
public final class AttachPoll implements AttachWithId {
    public static final Serializer.c<AttachPoll> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public Poll d;
    public final long e;
    public final UserId f;
    public final long g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachPoll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachPoll a(Serializer serializer) {
            return new AttachPoll(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachPoll[i];
        }
    }

    public AttachPoll(int i, AttachSyncState attachSyncState, Poll poll, long j) {
        this.b = i;
        this.c = attachSyncState;
        this.d = poll;
        this.e = j;
        this.f = poll.c;
        this.g = poll.b;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.Y(this.e);
        serializer.i0(this.d);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachPoll(this);
    }

    public final Poll d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachPoll)) {
            return false;
        }
        AttachPoll attachPoll = (AttachPoll) obj;
        return this.b == attachPoll.b && this.c == attachPoll.c && epx.f(this.d, attachPoll.d) && this.e == attachPoll.e;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + bo.a(this.c, Integer.hashCode(this.b) * 31, 31)) * 31);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachPoll(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", poll=");
        sb.append(this.d);
        sb.append(", lastSyncTime=");
        return vu5.a(')', this.e, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachPoll(AttachPoll attachPoll) {
        this(attachPoll.b, attachPoll.c, attachPoll.d, attachPoll.e);
    }

    public AttachPoll(int i, AttachSyncState attachSyncState, Poll poll, long j, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AttachSyncState.UPLOAD_REQUIRED : attachSyncState, poll, (i2 & 8) != 0 ? poll.t : j);
    }

    public AttachPoll(Serializer serializer, zcl zclVar) {
        this(serializer.u(), sr.b(serializer, AttachSyncState.Companion), (Poll) serializer.G(Poll.class.getClassLoader()), serializer.w());
    }
}
