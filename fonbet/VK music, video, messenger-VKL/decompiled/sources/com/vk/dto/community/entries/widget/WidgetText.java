package com.vk.dto.community.entries.widget;

import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WidgetText.kt */
/* loaded from: classes18.dex */
public final class WidgetText extends Widget {
    public static final Serializer.c<WidgetText> CREATOR = new a();
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetText> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetText a(Serializer serializer) {
            return new WidgetText(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetText[i];
        }
    }

    public WidgetText(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.h = jSONObject2.optString("text");
        this.i = jSONObject2.optString("descr");
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public WidgetText(Serializer serializer) {
        super(serializer);
        this.h = serializer.H();
        this.i = serializer.H();
    }
}
