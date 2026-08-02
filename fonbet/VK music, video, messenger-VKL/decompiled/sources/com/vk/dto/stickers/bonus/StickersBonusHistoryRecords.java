package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: StickersBonusHistoryRecords.kt */
/* loaded from: classes18.dex */
public final class StickersBonusHistoryRecords extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersBonusHistoryRecords> CREATOR = new a();
    public final List<StickersBonusHistoryRecord> b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersBonusHistoryRecords> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersBonusHistoryRecords a(Serializer serializer) {
            ArrayList k = serializer.k(StickersBonusHistoryRecord.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new StickersBonusHistoryRecords(k, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersBonusHistoryRecords[i];
        }
    }

    public StickersBonusHistoryRecords(List<StickersBonusHistoryRecord> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusHistoryRecords)) {
            return false;
        }
        StickersBonusHistoryRecords stickersBonusHistoryRecords = (StickersBonusHistoryRecords) obj;
        return epx.f(this.b, stickersBonusHistoryRecords.b) && epx.f(this.c, stickersBonusHistoryRecords.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusHistoryRecords(items=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
