package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.bki0;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.sr;
import xsna.zcl;

/* compiled from: AttachGroupCallInProgress.kt */
/* loaded from: classes2.dex */
public final class AttachGroupCallInProgress implements AttachWithId, AttachGroupCall, bki0 {
    public static final Serializer.c<AttachGroupCallInProgress> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public final CallParticipants e;
    public final Peer f;
    public final String g;
    public final String h;
    public transient boolean i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachGroupCallInProgress> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachGroupCallInProgress a(Serializer serializer) {
            return new AttachGroupCallInProgress(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachGroupCallInProgress[i];
        }
    }

    public AttachGroupCallInProgress(int i, AttachSyncState attachSyncState, UserId userId, CallParticipants callParticipants, Peer peer, String str, String str2) {
        this.b = i;
        this.c = attachSyncState;
        this.d = userId;
        this.e = callParticipants;
        this.f = peer;
        this.g = str;
        this.h = str2;
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
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachGroupCallInProgress(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachGroupCallInProgress)) {
            return false;
        }
        AttachGroupCallInProgress attachGroupCallInProgress = (AttachGroupCallInProgress) obj;
        return this.b == attachGroupCallInProgress.b && this.c == attachGroupCallInProgress.c && epx.f(this.d, attachGroupCallInProgress.d) && epx.f(this.e, attachGroupCallInProgress.e) && epx.f(this.f, attachGroupCallInProgress.f) && epx.f(this.g, attachGroupCallInProgress.g) && epx.f(this.h, attachGroupCallInProgress.h);
    }

    @Override // xsna.htx0
    public final long getId() {
        return Long.hashCode(this.d.b) + (this.f != null ? r3.hashCode() : 0) + (this.g != null ? r3.hashCode() : 0) + (this.h != null ? r3.hashCode() : 0);
    }

    @Override // xsna.bki0
    public final void h7(boolean z) {
        this.i = z;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + bh10.a(bo.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b)) * 31;
        Peer peer = this.f;
        int hashCode2 = (hashCode + (peer == null ? 0 : Long.hashCode(peer.b))) * 31;
        String str = this.g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
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
        String str;
        String str2;
        if (this.i) {
            str = "<HIDDEN>";
            str2 = "<HIDDEN>";
        } else {
            str = this.g;
            str2 = this.h;
        }
        StringBuilder sb = new StringBuilder("AttachGroupCallInProgress(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", callParticipants=");
        sb.append(this.e);
        sb.append(", initiator=");
        sb.append(this.f);
        sb.append(", joinLink=");
        sb.append(str);
        sb.append(", vkJoinLink=");
        return ho8.a(sb, str2, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public /* synthetic */ AttachGroupCallInProgress(int i, AttachSyncState attachSyncState, UserId userId, CallParticipants callParticipants, Peer peer, String str, String str2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 4) != 0 ? UserId.d : userId, callParticipants, peer, str, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachGroupCallInProgress(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r10 == null ? CallParticipants.d : r10, (Peer) serializer.G(Peer.class.getClassLoader()), serializer.H(), serializer.H());
        int u = serializer.u();
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        CallParticipants callParticipants = (CallParticipants) serializer.G(CallParticipants.class.getClassLoader());
    }
}
