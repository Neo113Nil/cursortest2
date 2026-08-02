package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;
import xsna.urd0;

/* compiled from: StickersRecommendationBlock.kt */
/* loaded from: classes18.dex */
public final class StickersRecommendationBlock extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersRecommendationBlock> CREATOR = new b();
    public final String b;
    public final String c;
    public final List<StickerStockItemWithStickerId> d;
    public final String e;

    /* compiled from: StickersRecommendationBlock.kt */
    public static final class a {
        public static StickersRecommendationBlock a(ArrayList arrayList, JSONObject jSONObject) {
            Object obj;
            JSONArray jSONArray = jSONObject.getJSONArray("stickers");
            ArrayList arrayList2 = null;
            if (jSONArray != null) {
                ArrayList arrayList3 = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        int i2 = optJSONObject.getInt("pack_id");
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((StickerStockItem) obj).b == i2) {
                                break;
                            }
                        }
                        StickerStockItem stickerStockItem = (StickerStockItem) obj;
                        arrayList3.add(stickerStockItem != null ? new StickerStockItemWithStickerId(stickerStockItem, optJSONObject.getInt("id")) : null);
                    }
                }
                arrayList2 = arrayList3;
            }
            return new StickersRecommendationBlock(jSONObject.optString("id"), jSONObject.optString("title"), j5g.V(arrayList2), jSONObject.optString("next_block_id"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickersRecommendationBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersRecommendationBlock a(Serializer serializer) {
            return new StickersRecommendationBlock(serializer.H(), serializer.H(), serializer.k(StickerStockItemWithStickerId.class), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersRecommendationBlock[i];
        }
    }

    public StickersRecommendationBlock(String str, String str2, List<StickerStockItemWithStickerId> list, String str3) {
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.o0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersRecommendationBlock)) {
            return false;
        }
        StickersRecommendationBlock stickersRecommendationBlock = (StickersRecommendationBlock) obj;
        return epx.f(this.b, stickersRecommendationBlock.b) && epx.f(this.c, stickersRecommendationBlock.c) && epx.f(this.d, stickersRecommendationBlock.d) && epx.f(this.e, stickersRecommendationBlock.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        List<StickerStockItemWithStickerId> list = this.d;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersRecommendationBlock(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", stickers=");
        sb.append(this.d);
        sb.append(", nextBlockId=");
        return ho8.a(sb, this.e, ')');
    }
}
