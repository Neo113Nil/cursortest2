package com.vk.dto.community.entries.widget;

import com.vk.api.widget.WidgetBranding;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WidgetMatch.kt */
/* loaded from: classes18.dex */
public final class WidgetMatch extends Widget {
    public static final Serializer.c<WidgetMatch> CREATOR = new a();
    public final Match h;
    public final WidgetBranding i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetMatch> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetMatch a(Serializer serializer) {
            return new WidgetMatch(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetMatch[i];
        }
    }

    public WidgetMatch(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.h = new Match(jSONObject2.getJSONObject("match"));
        Serializer.c<WidgetBranding> cVar = WidgetBranding.CREATOR;
        this.i = WidgetBranding.a.a(jSONObject2.optJSONObject("brand"));
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.h);
        serializer.i0(this.i);
    }

    public WidgetMatch(Serializer serializer) {
        super(serializer);
        this.h = (Match) serializer.G(Match.class.getClassLoader());
        this.i = (WidgetBranding) serializer.G(WidgetBranding.class.getClassLoader());
    }
}
