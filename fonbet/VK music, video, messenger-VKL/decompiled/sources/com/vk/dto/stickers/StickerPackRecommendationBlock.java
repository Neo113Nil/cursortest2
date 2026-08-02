package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.dz5;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: StickerPackRecommendationBlock.kt */
/* loaded from: classes18.dex */
public final class StickerPackRecommendationBlock extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerPackRecommendationBlock> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final List<StickerStockItem> e;
    public final String f;

    /* compiled from: StickerPackRecommendationBlock.kt */
    public static final class a {
        public static StickerPackRecommendationBlock a(ArrayList arrayList, JSONObject jSONObject) {
            Object obj;
            Iterable E = dz5.E(jSONObject.getJSONArray("pack_ids"));
            if (E == null) {
                E = EmptyList.b;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = E.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((StickerStockItem) obj).b == intValue) {
                        break;
                    }
                }
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                if (stickerStockItem != null) {
                    arrayList2.add(stickerStockItem);
                }
            }
            return new StickerPackRecommendationBlock(jSONObject.optString("id"), jSONObject.optString("type"), jSONObject.optString("title"), arrayList2, jSONObject.optString("next_block_id"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerPackRecommendationBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerPackRecommendationBlock a(Serializer serializer) {
            return new StickerPackRecommendationBlock(serializer.H(), serializer.H(), serializer.H(), serializer.k(StickerStockItem.class), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerPackRecommendationBlock[i];
        }
    }

    public StickerPackRecommendationBlock(String str, String str2, String str3, List<StickerStockItem> list, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.o0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackRecommendationBlock)) {
            return false;
        }
        StickerPackRecommendationBlock stickerPackRecommendationBlock = (StickerPackRecommendationBlock) obj;
        return epx.f(this.b, stickerPackRecommendationBlock.b) && epx.f(this.c, stickerPackRecommendationBlock.c) && epx.f(this.d, stickerPackRecommendationBlock.d) && epx.f(this.e, stickerPackRecommendationBlock.e) && epx.f(this.f, stickerPackRecommendationBlock.f);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackRecommendationBlock(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", packs=");
        sb.append(this.e);
        sb.append(", nextBlockId=");
        return ho8.a(sb, this.f, ')');
    }
}
