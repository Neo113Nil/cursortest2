package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stereo.StereoRoom;
import xsna.epx;
import xsna.sr;

/* compiled from: AttachRoom.kt */
/* loaded from: classes2.dex */
public final class AttachRoom implements Attach {
    public static final Serializer.c<AttachRoom> CREATOR = new a();
    public final StereoRoom b;
    public final UserId c;
    public int d;
    public AttachSyncState e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachRoom> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachRoom a(Serializer serializer) {
            return new AttachRoom(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachRoom[i];
        }
    }

    public AttachRoom(StereoRoom stereoRoom) {
        this.b = stereoRoom;
        this.c = stereoRoom.e;
        this.e = AttachSyncState.DONE;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.e;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return this.b.m;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.d);
        serializer.S(this.e.h());
        serializer.Y(this.c.b);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.e = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachRoom(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AttachRoom) && epx.f(this.b, ((AttachRoom) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.d = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.c;
    }

    public final String toString() {
        return "AttachRoom(room=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.d;
    }

    public AttachRoom(Serializer serializer) {
        this((StereoRoom) serializer.A(StereoRoom.class.getClassLoader()));
        this.d = serializer.u();
        this.e = sr.b(serializer, AttachSyncState.Companion);
        this.c = new UserId(serializer.w());
    }

    public AttachRoom(AttachRoom attachRoom) {
        this(attachRoom.b);
        this.d = attachRoom.d;
        this.e = attachRoom.e;
        this.c = attachRoom.c;
    }
}
