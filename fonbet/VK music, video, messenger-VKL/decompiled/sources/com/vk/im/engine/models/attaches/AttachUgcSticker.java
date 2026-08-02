package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.sr;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachUgcSticker.kt */
/* loaded from: classes2.dex */
public final class AttachUgcSticker implements AttachWithId, ztx0 {
    public static final Serializer.c<AttachUgcSticker> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public UGCStickerModel f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachUgcSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachUgcSticker a(Serializer serializer) {
            return new AttachUgcSticker(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachUgcSticker[i];
        }
    }

    public AttachUgcSticker() {
        this(0, null, null, 0L, null, 31, null);
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
        serializer.e0(this.d);
        serializer.i0(this.f);
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
        return new AttachUgcSticker(this);
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
        if (!(obj instanceof AttachUgcSticker)) {
            return false;
        }
        AttachUgcSticker attachUgcSticker = (AttachUgcSticker) obj;
        return this.b == attachUgcSticker.b && this.c == attachUgcSticker.c && this.e == attachUgcSticker.e && epx.f(this.d, attachUgcSticker.d) && epx.f(this.f, attachUgcSticker.f);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.f.e;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.f.hashCode() + bh10.a((bo.a(this.c, this.b * 31, 31) + ((int) this.e)) * 31, 31, this.d.b);
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
        return "AttachUgcSticker(localId=" + this.b + ", syncState=" + this.c + ", id=" + this.e + ", ownerId=" + this.d + ", sticker=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachUgcSticker(int i, AttachSyncState attachSyncState, UserId userId, long j, UGCStickerModel uGCStickerModel) {
        this.b = i;
        this.c = attachSyncState;
        this.d = userId;
        this.e = j;
        this.f = uGCStickerModel;
    }

    public /* synthetic */ AttachUgcSticker(int i, AttachSyncState attachSyncState, UserId userId, long j, UGCStickerModel uGCStickerModel, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 4) != 0 ? UserId.d : userId, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? new UGCStickerModel(null, 0L, 0L, null, null, 0L, 63, null) : uGCStickerModel);
    }

    public AttachUgcSticker(long j, UGCStickerModel uGCStickerModel) {
        this(0, null, null, 0L, null, 31, null);
        this.e = j;
        this.d = uGCStickerModel.b;
        this.f = uGCStickerModel;
    }

    public AttachUgcSticker(AttachUgcSticker attachUgcSticker) {
        this(0, null, null, 0L, null, 31, null);
        this.b = attachUgcSticker.b;
        this.c = attachUgcSticker.c;
        this.e = attachUgcSticker.e;
        this.d = attachUgcSticker.d;
        UGCStickerModel uGCStickerModel = attachUgcSticker.f;
        this.f = new UGCStickerModel(uGCStickerModel.b, uGCStickerModel.c, uGCStickerModel.d, uGCStickerModel.e, uGCStickerModel.f, uGCStickerModel.g);
    }

    public AttachUgcSticker(Serializer serializer, zcl zclVar) {
        this(0, null, null, 0L, null, 31, null);
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.f = (UGCStickerModel) serializer.G(StickerItem.class.getClassLoader());
    }
}
