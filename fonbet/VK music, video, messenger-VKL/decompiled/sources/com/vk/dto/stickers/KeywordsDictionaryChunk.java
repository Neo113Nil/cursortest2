package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.i5s;
import xsna.zcl;

/* compiled from: KeywordsDictionaryChunk.kt */
/* loaded from: classes18.dex */
public final class KeywordsDictionaryChunk extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<KeywordsDictionaryChunk> CREATOR = new a();
    public final List<StickersDictionaryItemLight> b;
    public final int c;
    public final String d;
    public final PredictiveSearchConfig e;
    public final GiftSuggestionConfig f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<KeywordsDictionaryChunk> {
        @Override // com.vk.core.serialize.Serializer.c
        public final KeywordsDictionaryChunk a(Serializer serializer) {
            return new KeywordsDictionaryChunk(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KeywordsDictionaryChunk[i];
        }
    }

    public KeywordsDictionaryChunk(List<StickersDictionaryItemLight> list, int i, String str, PredictiveSearchConfig predictiveSearchConfig, GiftSuggestionConfig giftSuggestionConfig) {
        this.b = list;
        this.c = i;
        this.d = str;
        this.e = predictiveSearchConfig;
        this.f = giftSuggestionConfig;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeywordsDictionaryChunk(dictionaryItems=");
        sb.append(this.b);
        sb.append(", chunksCount=");
        sb.append(this.c);
        sb.append(", chunkHash='");
        return i5s.a(sb, this.d, "')");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeywordsDictionaryChunk(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r14 == null ? new PredictiveSearchConfig(0, 0, 0, 0, null, 31, null) : r14, (GiftSuggestionConfig) serializer.G(GiftSuggestionConfig.class.getClassLoader()));
        ArrayList j = serializer.j(StickersDictionaryItemLight.CREATOR);
        int u = serializer.u();
        String H = serializer.H();
        PredictiveSearchConfig predictiveSearchConfig = (PredictiveSearchConfig) serializer.G(PredictiveSearchConfig.class.getClassLoader());
    }
}
