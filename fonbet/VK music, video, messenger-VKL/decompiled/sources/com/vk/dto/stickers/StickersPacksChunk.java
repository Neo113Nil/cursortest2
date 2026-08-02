package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.zcl;

/* compiled from: StickersPacksChunk.kt */
/* loaded from: classes18.dex */
public final class StickersPacksChunk extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersPacksChunk> CREATOR = new b();
    public final List<StickerStockItem> b;
    public final String c;

    /* compiled from: StickersPacksChunk.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
        public static StickersPacksChunk a(JSONObject jSONObject) {
            ?? r1;
            JSONArray optJSONArray = jSONObject.optJSONArray("packs");
            if (optJSONArray != null) {
                r1 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
                        r1.add(StickerStockItem.a.a(optJSONObject));
                    }
                }
            } else {
                r1 = EmptyList.b;
            }
            return new StickersPacksChunk((List<StickerStockItem>) r1, jSONObject.optString("next_from"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickersPacksChunk> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersPacksChunk a(Serializer serializer) {
            return new StickersPacksChunk(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersPacksChunk[i];
        }
    }

    public StickersPacksChunk(List<StickerStockItem> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.j0(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StickersPacksChunk(Serializer serializer, zcl zclVar) {
        this(r0, serializer.H());
        ArrayList j = serializer.j(StickerStockItem.CREATOR);
        ArrayList arrayList = new ArrayList(c5g.u(j, 10));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add((StickerStockItem) it.next());
        }
    }
}
