package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import java.util.Objects;
import xsna.bpn0;
import xsna.epx;
import xsna.sr;
import xsna.zcl;

/* compiled from: AttachWidget.kt */
/* loaded from: classes18.dex */
public final class AttachWidget implements AttachWithId {
    public static final Serializer.c<AttachWidget> CREATOR = new a();
    public final String b;
    public int c;
    public AttachSyncState d;
    public final UserId e;
    public final bpn0 f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachWidget> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachWidget a(Serializer serializer) {
            return new AttachWidget(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachWidget[i];
        }
    }

    public AttachWidget(String str, int i, AttachSyncState attachSyncState, UserId userId) {
        this.b = str;
        this.c = i;
        this.d = attachSyncState;
        this.e = userId;
        this.f = new bpn0(new d(this, 2));
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d.h());
        serializer.e0(this.e);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.d = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachWidget(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachWidget)) {
            return false;
        }
        AttachWidget attachWidget = (AttachWidget) obj;
        return epx.f(this.b, attachWidget.b) && this.c == attachWidget.c && this.d == attachWidget.d && epx.f(this.e, attachWidget.e);
    }

    @Override // xsna.htx0
    public final long getId() {
        return 0L;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c), this.d, this.e);
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
        return "AttachWidget(widget=" + this.b + ", localId=" + this.c + ", syncState=" + this.d + ", ownerId=" + this.e + ", id=0)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    public /* synthetic */ AttachWidget(String str, int i, AttachSyncState attachSyncState, UserId userId, int i2, zcl zclVar) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 8) != 0 ? UserId.d : userId);
    }

    public AttachWidget(AttachWidget attachWidget) {
        this(attachWidget.b, attachWidget.c, null, null, 12, null);
    }

    public AttachWidget(Serializer serializer) {
        this(serializer.H(), serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()));
    }
}
