package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftBaseUrlConfig;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftSticker;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.sr;
import xsna.zcl;
import xsna.zr;

/* compiled from: AttachGift.kt */
/* loaded from: classes18.dex */
public final class AttachGift implements AttachWithId {
    public static final Serializer.c<AttachGift> CREATOR = new a();
    public final long b;
    public int c;
    public final UserId d;
    public AttachSyncState e;
    public ImageList f;
    public final GiftRarity g;
    public final GiftSticker h;
    public final Integer i;
    public final GiftAnimation j;
    public final List<GiftBackground> k;
    public final GiftType l;
    public final ImageStatus m;
    public final ImageStatusPack n;
    public final String o;
    public final GiftBaseUrlConfig p;
    public final GiftCard q;
    public final GiftVotesAttachment r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachGift> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachGift a(Serializer serializer) {
            return new AttachGift(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachGift[i];
        }
    }

    public AttachGift(long j, int i, UserId userId, AttachSyncState attachSyncState, ImageList imageList, GiftRarity giftRarity, GiftSticker giftSticker, Integer num, GiftAnimation giftAnimation, List<GiftBackground> list, GiftType giftType, ImageStatus imageStatus, ImageStatusPack imageStatusPack, String str, GiftBaseUrlConfig giftBaseUrlConfig, GiftCard giftCard, GiftVotesAttachment giftVotesAttachment) {
        this.b = j;
        this.c = i;
        this.d = userId;
        this.e = attachSyncState;
        this.f = imageList;
        this.g = giftRarity;
        this.h = giftSticker;
        this.i = num;
        this.j = giftAnimation;
        this.k = list;
        this.l = giftType;
        this.m = imageStatus;
        this.n = imageStatusPack;
        this.o = str;
        this.p = giftBaseUrlConfig;
        this.q = giftCard;
        this.r = giftVotesAttachment;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.e;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return zr.a("https://", str, "/gifts");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.S(this.c);
        serializer.Y(this.d.b);
        serializer.S(this.e.h());
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.V(this.i);
        serializer.i0(this.j);
        serializer.f0(this.k);
        serializer.j0(this.l.i());
        serializer.i0(this.m);
        serializer.i0(this.n);
        serializer.m0(this.o);
        serializer.i0(this.p);
        serializer.i0(this.q);
        serializer.i0(this.r);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.e = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachGift(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final boolean d() {
        return this.b == 10002;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachGift)) {
            return false;
        }
        AttachGift attachGift = (AttachGift) obj;
        return this.b == attachGift.b && this.c == attachGift.c && epx.f(this.d, attachGift.d) && this.e == attachGift.e && epx.f(this.f, attachGift.f) && epx.f(this.g, attachGift.g) && epx.f(this.h, attachGift.h) && epx.f(this.i, attachGift.i) && epx.f(this.j, attachGift.j) && epx.f(this.k, attachGift.k) && this.l == attachGift.l && epx.f(this.m, attachGift.m) && epx.f(this.n, attachGift.n) && epx.f(this.o, attachGift.o) && epx.f(this.p, attachGift.p) && epx.f(this.q, attachGift.q) && epx.f(this.r, attachGift.r);
    }

    public final boolean f() {
        return this.b == 10001;
    }

    public final boolean g() {
        return this.g != null;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = fw3.a(bo.a(this.e, bh10.a(shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31, this.d.b), 31), 31, this.f.b);
        GiftRarity giftRarity = this.g;
        int hashCode = (a2 + (giftRarity == null ? 0 : giftRarity.hashCode())) * 31;
        GiftSticker giftSticker = this.h;
        int hashCode2 = (hashCode + (giftSticker == null ? 0 : giftSticker.hashCode())) * 31;
        Integer num = this.i;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        GiftAnimation giftAnimation = this.j;
        int hashCode4 = (this.l.hashCode() + fw3.a((hashCode3 + (giftAnimation == null ? 0 : giftAnimation.hashCode())) * 31, 31, this.k)) * 31;
        ImageStatus imageStatus = this.m;
        int hashCode5 = (hashCode4 + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31;
        ImageStatusPack imageStatusPack = this.n;
        int hashCode6 = (hashCode5 + (imageStatusPack == null ? 0 : imageStatusPack.hashCode())) * 31;
        String str = this.o;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        GiftBaseUrlConfig giftBaseUrlConfig = this.p;
        int hashCode8 = (hashCode7 + (giftBaseUrlConfig == null ? 0 : giftBaseUrlConfig.hashCode())) * 31;
        GiftCard giftCard = this.q;
        int hashCode9 = (hashCode8 + (giftCard == null ? 0 : giftCard.hashCode())) * 31;
        GiftVotesAttachment giftVotesAttachment = this.r;
        return hashCode9 + (giftVotesAttachment != null ? giftVotesAttachment.hashCode() : 0);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.c = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        return "AttachGift(id=" + this.b + ", localId=" + this.c + ", ownerId=" + this.d + ", syncState=" + this.e + ", imageList=" + this.f + ", rarity=" + this.g + ", stickerGift=" + this.h + ", randomStickerPackAttemptId=" + this.i + ", animations=" + this.j + ", backgrounds=" + this.k + ", type=" + this.l + ", imageStatus=" + this.m + ", imageStatusPack=" + this.n + ", entryId=" + this.o + ", baseUrlConfig=" + this.p + ", giftCard=" + this.q + ", votesAttachment=" + this.r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    public AttachGift(long j, int i, UserId userId, AttachSyncState attachSyncState, ImageList imageList, GiftRarity giftRarity, GiftSticker giftSticker, Integer num, GiftAnimation giftAnimation, List list, GiftType giftType, ImageStatus imageStatus, ImageStatusPack imageStatusPack, String str, GiftBaseUrlConfig giftBaseUrlConfig, GiftCard giftCard, GiftVotesAttachment giftVotesAttachment, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? UserId.d : userId, (i2 & 8) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 16) != 0 ? new ImageList(null, 1, null) : imageList, (i2 & 32) != 0 ? null : giftRarity, (i2 & 64) != 0 ? null : giftSticker, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : giftAnimation, (i2 & 512) != 0 ? EmptyList.b : list, giftType, imageStatus, imageStatusPack, (i2 & 8192) != 0 ? null : str, (i2 & 16384) != 0 ? null : giftBaseUrlConfig, (32768 & i2) != 0 ? null : giftCard, (i2 & 65536) != 0 ? null : giftVotesAttachment);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachGift(Serializer serializer) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, GiftType.a.a(r13), (ImageStatus) serializer.G(ImageStatus.class.getClassLoader()), (ImageStatusPack) serializer.G(ImageStatusPack.class.getClassLoader()), serializer.I(), (GiftBaseUrlConfig) serializer.G(GiftBaseUrlConfig.class.getClassLoader()), (GiftCard) serializer.G(GiftCard.class.getClassLoader()), (GiftVotesAttachment) serializer.G(GiftVotesAttachment.class.getClassLoader()));
        long w = serializer.w();
        int u = serializer.u();
        UserId userId = new UserId(serializer.w());
        AttachSyncState b = sr.b(serializer, AttachSyncState.Companion);
        ImageList imageList = (ImageList) serializer.G(ImageList.class.getClassLoader());
        imageList = imageList == null ? new ImageList(null, 1, null) : imageList;
        GiftRarity giftRarity = (GiftRarity) serializer.G(GiftRarity.class.getClassLoader());
        GiftSticker giftSticker = (GiftSticker) serializer.G(GiftSticker.class.getClassLoader());
        Integer v = serializer.v();
        GiftAnimation giftAnimation = (GiftAnimation) serializer.G(GiftAnimation.class.getClassLoader());
        ArrayList B = serializer.B(GiftBackground.class.getClassLoader());
        GiftType.a aVar = GiftType.Companion;
        String H = serializer.H();
        aVar.getClass();
    }
}
