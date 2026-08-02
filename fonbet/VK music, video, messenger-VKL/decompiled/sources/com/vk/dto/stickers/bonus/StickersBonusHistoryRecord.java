package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import xsna.bh10;
import xsna.epx;
import xsna.shy;

/* compiled from: StickersBonusHistoryRecord.kt */
/* loaded from: classes18.dex */
public final class StickersBonusHistoryRecord extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusHistoryRecord> CREATOR = new a();
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final String f;
    public final String g;
    public final ImageList h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersBonusHistoryRecord> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusHistoryRecord a(Serializer serializer) {
            return new StickersBonusHistoryRecord(serializer.u(), serializer.u(), serializer.w(), serializer.u(), serializer.H(), serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusHistoryRecord[i];
        }
    }

    public StickersBonusHistoryRecord(int i, int i2, long j, int i3, String str, String str2, ImageList imageList) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = imageList;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.Y(this.d);
        serializer.S(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusHistoryRecord)) {
            return false;
        }
        StickersBonusHistoryRecord stickersBonusHistoryRecord = (StickersBonusHistoryRecord) obj;
        return this.b == stickersBonusHistoryRecord.b && this.c == stickersBonusHistoryRecord.c && this.d == stickersBonusHistoryRecord.d && this.e == stickersBonusHistoryRecord.e && epx.f(this.f, stickersBonusHistoryRecord.f) && epx.f(this.g, stickersBonusHistoryRecord.g) && epx.f(this.h, stickersBonusHistoryRecord.h);
    }

    public final int hashCode() {
        int a2 = shy.a(this.e, bh10.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d), 31);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageList imageList = this.h;
        return hashCode2 + (imageList != null ? imageList.b.hashCode() : 0);
    }

    public final String toString() {
        return "StickersBonusHistoryRecord(id=" + this.b + ", type=" + this.c + ", timestamp=" + this.d + ", value=" + this.e + ", title=" + this.f + ", description=" + this.g + ", icon=" + this.h + ')';
    }
}
