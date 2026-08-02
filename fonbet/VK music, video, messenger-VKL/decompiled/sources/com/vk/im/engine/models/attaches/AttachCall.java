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
import xsna.shy;
import xsna.sr;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AttachCall.kt */
/* loaded from: classes2.dex */
public final class AttachCall implements AttachWithId {
    public static final Serializer.c<AttachCall> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public CallState e;
    public Peer f;
    public int g;
    public boolean h;
    public boolean i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachCall> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachCall a(Serializer serializer) {
            return new AttachCall(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachCall[i];
        }
    }

    public AttachCall() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = CallState.DONE;
        this.f = Peer.Unknown.e;
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
        serializer.S(this.e.j());
        serializer.i0(this.f);
        serializer.S(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachCall(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachCall)) {
            return false;
        }
        AttachCall attachCall = (AttachCall) obj;
        return this.b == attachCall.b && this.c == attachCall.c && epx.f(this.d, attachCall.d) && this.e == attachCall.e && epx.f(this.f, attachCall.f) && this.g == attachCall.g && this.h == attachCall.h && this.i == attachCall.i;
    }

    @Override // xsna.htx0
    public final long getId() {
        return Long.hashCode(this.d.b) + Long.hashCode(this.f.b);
    }

    public final int hashCode() {
        return ((shy.a(this.g, bh10.a((this.e.hashCode() + bh10.a(bo.a(this.c, this.b * 31, 31), 31, this.d.b)) * 31, 31, this.f.b), 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
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
        StringBuilder sb = new StringBuilder("AttachCall(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", state=");
        sb.append(this.e);
        sb.append(", initiator=");
        sb.append(this.f);
        sb.append(", duration=");
        return vu5.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachCall(AttachCall attachCall) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = CallState.DONE;
        this.f = Peer.Unknown.e;
        this.b = attachCall.b;
        this.c = attachCall.c;
        this.d = attachCall.d;
        this.e = attachCall.e;
        this.f = attachCall.f;
        this.g = attachCall.g;
        this.h = attachCall.h;
        this.i = attachCall.i;
    }

    public AttachCall(Serializer serializer, zcl zclVar) {
        Lazy lazy;
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = CallState.DONE;
        this.f = Peer.Unknown.e;
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        CallState.a aVar = CallState.Companion;
        int u = serializer.u();
        aVar.getClass();
        lazy = CallState.values$delegate;
        this.e = (CallState) pn00.h(Integer.valueOf(u), (Map) lazy.getValue());
        this.f = (Peer) serializer.G(Peer.class.getClassLoader());
        this.g = serializer.u();
        this.h = serializer.m();
        this.i = serializer.m();
    }
}
