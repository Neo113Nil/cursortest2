package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import defpackage.q0;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* compiled from: StickersBonusReward.kt */
/* loaded from: classes18.dex */
public final class StickersBonusReward extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusReward> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ImageList f;
    public final int g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersBonusReward> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusReward a(Serializer serializer) {
            return new StickersBonusReward(serializer.H(), serializer.H(), serializer.H(), serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.u(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusReward[i];
        }
    }

    public StickersBonusReward(String str, String str2, String str3, String str4, ImageList imageList, int i, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = imageList;
        this.g = i;
        this.h = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.S(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusReward)) {
            return false;
        }
        StickersBonusReward stickersBonusReward = (StickersBonusReward) obj;
        return epx.f(this.b, stickersBonusReward.b) && epx.f(this.c, stickersBonusReward.c) && epx.f(this.d, stickersBonusReward.d) && epx.f(this.e, stickersBonusReward.e) && epx.f(this.f, stickersBonusReward.f) && this.g == stickersBonusReward.g && this.h == stickersBonusReward.h;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageList imageList = this.f;
        return Boolean.hashCode(this.h) + shy.a(this.g, (hashCode2 + (imageList != null ? imageList.b.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusReward(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", note=");
        sb.append(this.e);
        sb.append(", icon=");
        sb.append(this.f);
        sb.append(", price=");
        sb.append(this.g);
        sb.append(", hasTerms=");
        return q0.a(sb, this.h, ')');
    }
}
