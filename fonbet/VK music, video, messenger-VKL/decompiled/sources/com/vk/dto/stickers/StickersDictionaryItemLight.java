package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: StickersDictionaryItemLight.kt */
/* loaded from: classes18.dex */
public final class StickersDictionaryItemLight extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersDictionaryItemLight> CREATOR = new a();

    @pmi0("isSpecialItems")
    private final boolean isSpecialItems;

    @pmi0("stickers")
    private final List<DictionaryStickerModel> stickers;

    @pmi0("words")
    private final List<String> words;

    /* compiled from: StickersDictionaryItemLight.kt */
    public static final class DictionaryStickerModel extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<DictionaryStickerModel> CREATOR = new a();

        @pmi0("packId")
        private final int packId;

        @pmi0("stickerId")
        private final int stickerId;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<DictionaryStickerModel> {
            @Override // com.vk.core.serialize.Serializer.c
            public final DictionaryStickerModel a(Serializer serializer) {
                return new DictionaryStickerModel(serializer, (zcl) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DictionaryStickerModel[i];
            }
        }

        public /* synthetic */ DictionaryStickerModel(Serializer serializer, zcl zclVar) {
            this(serializer);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.packId);
            serializer.S(this.stickerId);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictionaryStickerModel)) {
                return false;
            }
            DictionaryStickerModel dictionaryStickerModel = (DictionaryStickerModel) obj;
            return this.packId == dictionaryStickerModel.packId && this.stickerId == dictionaryStickerModel.stickerId;
        }

        public final int hashCode() {
            return Integer.hashCode(this.stickerId) + (Integer.hashCode(this.packId) * 31);
        }

        public final int o2() {
            return this.stickerId;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DictionaryStickerModel(packId=");
            sb.append(this.packId);
            sb.append(", stickerId=");
            return vu5.b(sb, this.stickerId, ')');
        }

        public final int zb() {
            return this.packId;
        }

        public DictionaryStickerModel(int i, int i2) {
            this.packId = i;
            this.stickerId = i2;
        }

        private DictionaryStickerModel(Serializer serializer) {
            this(serializer.u(), serializer.u());
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersDictionaryItemLight> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersDictionaryItemLight a(Serializer serializer) {
            return new StickersDictionaryItemLight(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersDictionaryItemLight[i];
        }
    }

    public StickersDictionaryItemLight() {
        this(null, null, false, 7, null);
    }

    public final List<String> Ab() {
        return this.words;
    }

    public final boolean Bb() {
        return this.isSpecialItems;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.words);
        serializer.f0(this.stickers);
        serializer.L(this.isSpecialItems ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersDictionaryItemLight)) {
            return false;
        }
        StickersDictionaryItemLight stickersDictionaryItemLight = (StickersDictionaryItemLight) obj;
        return epx.f(this.words, stickersDictionaryItemLight.words) && epx.f(this.stickers, stickersDictionaryItemLight.stickers) && this.isSpecialItems == stickersDictionaryItemLight.isSpecialItems;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSpecialItems) + fw3.a(this.words.hashCode() * 31, 31, this.stickers);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersDictionaryItemLight(words=");
        sb.append(this.words);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", isSpecialItems=");
        return q0.a(sb, this.isSpecialItems, ')');
    }

    public final List<DictionaryStickerModel> zb() {
        return this.stickers;
    }

    public /* synthetic */ StickersDictionaryItemLight(Serializer serializer, zcl zclVar) {
        this(serializer);
    }

    public StickersDictionaryItemLight(List<String> list, List<DictionaryStickerModel> list2, boolean z) {
        this.words = list;
        this.stickers = list2;
        this.isSpecialItems = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private StickersDictionaryItemLight(Serializer serializer) {
        this(r2, r3, false, 4, null);
        ArrayList<String> h = serializer.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        ArrayList j = serializer.j(DictionaryStickerModel.CREATOR);
        ArrayList arrayList2 = new ArrayList(c5g.u(j, 10));
        Iterator it2 = j.iterator();
        while (it2.hasNext()) {
            arrayList2.add((DictionaryStickerModel) it2.next());
        }
    }

    public StickersDictionaryItemLight(List list, List list2, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? false : z);
    }
}
