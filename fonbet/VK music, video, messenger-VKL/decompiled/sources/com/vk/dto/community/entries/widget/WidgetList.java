package com.vk.dto.community.entries.widget;

import android.text.TextUtils;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: WidgetList.kt */
/* loaded from: classes18.dex */
public final class WidgetList extends Widget {
    public static final Serializer.c<WidgetList> CREATOR = new a();
    public final ArrayList h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetList a(Serializer serializer) {
            return new WidgetList(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetList[i];
        }
    }

    public WidgetList(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.h = new ArrayList();
        Object opt = jSONObject.opt("data");
        if (opt instanceof JSONObject) {
            JSONArray jSONArray = ((JSONObject) opt).getJSONArray("rows");
            int i = 6;
            for (int i2 = 0; i2 < jSONArray.length() && i2 < i; i2++) {
                Item item = new Item(jSONArray.getJSONObject(i2));
                if (!TextUtils.isEmpty(item.l)) {
                    i = 3;
                }
                this.h.add(item);
            }
            if (jSONArray.length() > i) {
                L.G("WidgetList", "Widget has more rows than expected");
            }
        }
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.o0(this.h);
    }

    public WidgetList(Serializer serializer) {
        super(serializer);
        this.h = serializer.j(Item.CREATOR);
    }

    /* compiled from: WidgetList.kt */
    public static final class Item extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Item> CREATOR = new a();
        public final Image b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Item> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Item a(Serializer serializer) {
                return new Item(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Item(JSONObject jSONObject) throws JSONException {
            JSONObject optJSONObject = jSONObject.optJSONObject("title_action");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("button_action");
            JSONArray optJSONArray = jSONObject.optJSONArray("icon");
            this.b = optJSONArray == null ? null : new Image(optJSONArray, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
            this.c = jSONObject.getString("title");
            this.d = optJSONObject != null ? optJSONObject.optString("url") : null;
            this.e = optJSONObject != null ? optJSONObject.optString("target") : null;
            this.f = jSONObject.optString("button");
            this.g = optJSONObject2 != null ? optJSONObject2.optString("url") : null;
            this.h = optJSONObject2 != null ? optJSONObject2.optString("target") : null;
            this.i = jSONObject.optString("descr");
            this.j = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS);
            this.k = jSONObject.optString("time");
            this.l = jSONObject.optString("text");
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f);
            serializer.j0(this.g);
            serializer.j0(this.h);
            serializer.j0(this.i);
            serializer.j0(this.j);
            serializer.j0(this.k);
            serializer.j0(this.l);
        }

        public Item(Serializer serializer) {
            this.b = (Image) serializer.G(Image.class.getClassLoader());
            this.c = serializer.H();
            this.d = serializer.H();
            this.e = serializer.H();
            this.f = serializer.H();
            this.g = serializer.H();
            this.h = serializer.H();
            this.i = serializer.H();
            this.j = serializer.H();
            this.k = serializer.H();
            this.l = serializer.H();
        }
    }
}
