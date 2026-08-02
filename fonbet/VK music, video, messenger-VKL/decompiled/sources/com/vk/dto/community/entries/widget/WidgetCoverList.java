package com.vk.dto.community.entries.widget;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WidgetCoverList.kt */
/* loaded from: classes18.dex */
public final class WidgetCoverList extends Widget {
    public static final Serializer.c<WidgetCoverList> CREATOR = new a();
    public final ArrayList h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetCoverList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetCoverList a(Serializer serializer) {
            return new WidgetCoverList(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetCoverList[i];
        }
    }

    public WidgetCoverList(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("rows");
        this.h = new ArrayList();
        for (int i = 0; i < jSONArray.length() && i < 3; i++) {
            this.h.add(new Item(jSONArray.getJSONObject(i)));
        }
        if (jSONArray.length() > 3) {
            L.G("WidgetCoverList", "Widget has more rows than expected");
        }
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.o0(this.h);
    }

    public WidgetCoverList(Serializer serializer) {
        super(serializer);
        this.h = serializer.j(Item.CREATOR);
    }

    /* compiled from: WidgetCoverList.kt */
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
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("button_action");
            JSONArray optJSONArray = jSONObject.optJSONArray("cover");
            this.b = optJSONArray == null ? null : new Image(optJSONArray, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
            this.c = jSONObject.getString("title");
            this.d = optJSONObject != null ? optJSONObject.optString("url") : null;
            this.e = optJSONObject != null ? optJSONObject.optString("target") : null;
            this.f = jSONObject.optString("button");
            this.g = optJSONObject2 != null ? optJSONObject2.optString("url") : null;
            this.h = optJSONObject2 != null ? optJSONObject2.optString("target") : null;
            this.i = jSONObject.optString("descr");
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
        }
    }
}
