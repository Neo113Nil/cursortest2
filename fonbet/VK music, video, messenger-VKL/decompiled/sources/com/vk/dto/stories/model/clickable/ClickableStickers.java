package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.movika.sdk.base.logic.processor.actions.h;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vk.movika.sdk.base.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.bu1;
import xsna.bxx;
import xsna.epx;
import xsna.hg;
import xsna.j5g;
import xsna.ms9;
import xsna.shy;

/* compiled from: ClickableSticker.kt */
/* loaded from: classes18.dex */
public final class ClickableStickers extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ClickableStickers> CREATOR = new b();
    public final int b;
    public final int c;
    public final List<ClickableSticker> d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;

    /* compiled from: ClickableSticker.kt */
    public static final class a {
        public static ClickableStickers a(JSONObject jSONObject, Map map, Map map2) {
            ArrayList arrayList;
            try {
                int optInt = jSONObject.optInt("original_width", 0);
                int optInt2 = jSONObject.optInt("original_height", 0);
                JSONArray optJSONArray = jSONObject.optJSONArray("clickable_stickers");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(com.vk.dto.stories.model.clickable.a.a(optJSONArray.getJSONObject(i), map, map2));
                    }
                    arrayList = new ArrayList(j5g.V(arrayList2));
                } else {
                    arrayList = new ArrayList();
                }
                return new ClickableStickers(optInt, optInt2, arrayList);
            } catch (Throwable th) {
                L.g("Can't parse clickable stickers", th);
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClickableStickers> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableStickers a(Serializer serializer) {
            return new ClickableStickers(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableStickers[i];
        }
    }

    public ClickableStickers(int i, int i2, List<ClickableSticker> list) {
        this.b = i;
        this.c = i2;
        this.d = list;
        new bpn0(new hg(this, 16));
        this.e = new bpn0(new f(this, 16));
        new bpn0(new g(this, 20));
        new bpn0(new h(this, 18));
        this.f = new bpn0(new i(this, 12));
        this.g = new bpn0(new bu1(this, 11));
        this.h = new bpn0(new com.vk.movika.sdk.base.logic.processor.h(this, 13));
        this.i = new bpn0(new com.vk.movika.sdk.base.model.b(this, 17));
        this.j = new bpn0(new e(this, 12));
    }

    public final ClickableApp Ab() {
        Object obj;
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ClickableSticker clickableSticker = (ClickableSticker) obj;
            if ((clickableSticker instanceof ClickableApp) && ((ClickableApp) clickableSticker).g) {
                break;
            }
        }
        if (obj instanceof ClickableApp) {
            return (ClickableApp) obj;
        }
        return null;
    }

    public final ClickableMarketItem Bb() {
        Object obj;
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ClickableSticker) obj) instanceof ClickableMarketItem) {
                break;
            }
        }
        if (obj instanceof ClickableMarketItem) {
            return (ClickableMarketItem) obj;
        }
        return null;
    }

    public final List<ClickableSticker> Cb() {
        return this.d;
    }

    public final boolean Db() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final ArrayList K3() {
        List<ClickableSticker> list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ClickableMarketItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Good good = ((ClickableMarketItem) it.next()).j;
            if (good != null) {
                arrayList2.add(good);
            }
        }
        return arrayList2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.W(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            jSONArray.put(((ClickableSticker) it.next()).e5());
        }
        jSONObject.put("original_width", this.b);
        jSONObject.put("original_height", this.c);
        jSONObject.put("clickable_stickers", jSONArray);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableStickers)) {
            return false;
        }
        ClickableStickers clickableStickers = (ClickableStickers) obj;
        return this.b == clickableStickers.b && this.c == clickableStickers.c && epx.f(this.d, clickableStickers.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableStickers(originalWidth=");
        sb.append(this.b);
        sb.append(", originalHeight=");
        sb.append(this.c);
        sb.append(", clickableStickers=");
        return ms9.a(')', sb, this.d);
    }

    public final ClickableApp zb() {
        Object obj;
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ClickableSticker) obj) instanceof ClickableApp) {
                break;
            }
        }
        if (obj instanceof ClickableApp) {
            return (ClickableApp) obj;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableStickers(Serializer serializer) {
        this(r0, r1, r4 == null ? new ArrayList() : r4);
        int u = serializer.u();
        int u2 = serializer.u();
        ArrayList k = serializer.k(ClickableSticker.class);
    }
}
