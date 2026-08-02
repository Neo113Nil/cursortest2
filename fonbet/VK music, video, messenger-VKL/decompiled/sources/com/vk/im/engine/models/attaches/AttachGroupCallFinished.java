package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.CallState;
import java.util.Map;
import kotlin.Lazy;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.pn00;
import xsna.sr;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AttachGroupCallFinished.kt */
/* loaded from: classes2.dex */
public final class AttachGroupCallFinished implements AttachWithId, AttachGroupCall {
    public static final Serializer.c<AttachGroupCallFinished> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public final CallParticipants e;
    public final Peer f;
    public final CallState g;
    public final int h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachGroupCallFinished> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachGroupCallFinished a(Serializer serializer) {
            return new AttachGroupCallFinished(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachGroupCallFinished[i];
        }
    }

    public AttachGroupCallFinished(int i, AttachSyncState attachSyncState, UserId userId, CallParticipants callParticipants, Peer peer, CallState callState, int i2) {
        this.b = i;
        this.c = attachSyncState;
        this.d = userId;
        this.e = callParticipants;
        this.f = peer;
        this.g = callState;
        this.h = i2;
    }

    @Override // com.vk.im.engine.models.attaches.AttachGroupCall
    public final CallParticipants B6() {
        return this.e;
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
        serializer.e0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.S(this.g.j());
        serializer.S(this.h);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachGroupCallFinished(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachGroupCallFinished)) {
            return false;
        }
        AttachGroupCallFinished attachGroupCallFinished = (AttachGroupCallFinished) obj;
        return this.b == attachGroupCallFinished.b && this.c == attachGroupCallFinished.c && epx.f(this.d, attachGroupCallFinished.d) && epx.f(this.e, attachGroupCallFinished.e) && epx.f(this.f, attachGroupCallFinished.f) && this.g == attachGroupCallFinished.g && this.h == attachGroupCallFinished.h;
    }

    @Override // xsna.htx0
    public final long getId() {
        return (this.f != null ? r0.hashCode() : 0) + Long.hashCode(this.d.b);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + bh10.a(bo.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b)) * 31;
        Peer peer = this.f;
        return Integer.hashCode(this.h) + ((this.g.hashCode() + ((hashCode + (peer == null ? 0 : Long.hashCode(peer.b))) * 31)) * 31);
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
        StringBuilder sb = new StringBuilder("AttachGroupCallFinished(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", callParticipants=");
        sb.append(this.e);
        sb.append(", initiator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", duration=");
        return vu5.b(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public /* synthetic */ AttachGroupCallFinished(int i, AttachSyncState attachSyncState, UserId userId, CallParticipants callParticipants, Peer peer, CallState callState, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? AttachSyncState.DONE : attachSyncState, (i3 & 4) != 0 ? UserId.d : userId, callParticipants, peer, callState, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachGroupCallFinished(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r5, (CallState) pn00.h(Integer.valueOf(r0), (Map) r10.getValue()), serializer.u());
        Lazy lazy;
        int u = serializer.u();
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        CallParticipants callParticipants = (CallParticipants) serializer.G(CallParticipants.class.getClassLoader());
        CallParticipants callParticipants2 = callParticipants == null ? CallParticipants.d : callParticipants;
        Peer peer = (Peer) serializer.G(Peer.class.getClassLoader());
        CallState.a aVar = CallState.Companion;
        int u2 = serializer.u();
        aVar.getClass();
        lazy = CallState.values$delegate;
    }
}
