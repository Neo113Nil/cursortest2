package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerItem;
import xsna.bo;
import xsna.epx;
import xsna.i5s;
import xsna.sr;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachSticker.kt */
/* loaded from: classes2.dex */
public final class AttachSticker implements AttachWithId, ztx0 {
    public static final Serializer.c<AttachSticker> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public long e;
    public int f;
    public StickerItem g;
    public String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachSticker a(Serializer serializer) {
            return new AttachSticker(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachSticker[i];
        }
    }

    public AttachSticker() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = new StickerItem(0, 0, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.h = "";
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
        serializer.S(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    public final void a(AttachSticker attachSticker) {
        this.b = attachSticker.b;
        this.c = attachSticker.c;
        this.e = attachSticker.e;
        this.f = attachSticker.f;
        this.g = StickerItem.zb(attachSticker.g, 0, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        this.h = attachSticker.h;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachSticker(this);
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
        if (!(obj instanceof AttachSticker)) {
            return false;
        }
        AttachSticker attachSticker = (AttachSticker) obj;
        return this.b == attachSticker.b && this.c == attachSticker.c && this.e == attachSticker.e && this.f == attachSticker.f && epx.f(this.g, attachSticker.g) && epx.f(this.h, attachSticker.h);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.g.e;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((((bo.a(this.c, this.b * 31, 31) + ((int) this.e)) * 31) + this.f) * 31)) * 31);
    }

    public final StickerItem i() {
        return this.g;
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
        StringBuilder sb = new StringBuilder("AttachSticker(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", productId=");
        sb.append(this.f);
        sb.append(", sticker=");
        sb.append(this.g);
        sb.append(", referrer='");
        return i5s.a(sb, this.h, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachSticker(int i, int i2, StickerItem stickerItem, String str) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        new StickerItem(0, 0, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.e = i;
        this.f = i2;
        this.g = stickerItem;
        this.h = str;
    }

    public AttachSticker(AttachSticker attachSticker) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = new StickerItem(0, 0, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.h = "";
        a(attachSticker);
    }

    public AttachSticker(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = new StickerItem(0, 0, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.h = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.f = serializer.u();
        this.g = (StickerItem) serializer.G(StickerItem.class.getClassLoader());
        this.h = serializer.H();
    }
}
