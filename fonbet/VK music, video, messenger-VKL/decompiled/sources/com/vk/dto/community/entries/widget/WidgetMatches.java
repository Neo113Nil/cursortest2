package com.vk.dto.community.entries.widget;

import com.vk.api.widget.WidgetBranding;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WidgetMatches.kt */
/* loaded from: classes18.dex */
public final class WidgetMatches extends Widget {
    public static final Serializer.c<WidgetMatches> CREATOR = new a();
    public final ArrayList h;
    public final WidgetBranding i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetMatches> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetMatches a(Serializer serializer) {
            return new WidgetMatches(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetMatches[i];
        }
    }

    public WidgetMatches(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        Serializer.c<WidgetBranding> cVar = WidgetBranding.CREATOR;
        this.i = WidgetBranding.a.a(jSONObject2.optJSONObject("brand"));
        JSONArray jSONArray = jSONObject2.getJSONArray("matches");
        this.h = new ArrayList();
        for (int i = 0; i < jSONArray.length() && i < 5; i++) {
            this.h.add(new Match(jSONArray.getJSONObject(i)));
        }
        if (jSONArray.length() > 5) {
            L.G("WidgetMatches", "Widget has more matches than expected");
        }
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.o0(this.h);
        serializer.i0(this.i);
    }

    public WidgetMatches(Serializer serializer) {
        super(serializer);
        this.h = serializer.j(Match.CREATOR);
        this.i = (WidgetBranding) serializer.G(WidgetBranding.class.getClassLoader());
    }
}
