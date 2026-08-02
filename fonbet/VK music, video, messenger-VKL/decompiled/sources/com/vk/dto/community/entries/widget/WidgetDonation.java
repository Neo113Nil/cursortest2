package com.vk.dto.community.entries.widget;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WidgetDonation.kt */
/* loaded from: classes18.dex */
public final class WidgetDonation extends Widget {
    public static final Serializer.c<WidgetDonation> CREATOR = new a();
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    public final int n;
    public final String o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetDonation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetDonation a(Serializer serializer) {
            return new WidgetDonation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetDonation[i];
        }
    }

    public WidgetDonation(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.h = jSONObject2.optString("text");
        JSONObject optJSONObject = jSONObject2.optJSONObject("button_action");
        this.i = jSONObject2.optString("button");
        this.j = optJSONObject != null ? optJSONObject.optString("url") : null;
        this.k = optJSONObject != null ? optJSONObject.optString("target") : null;
        this.l = jSONObject2.optInt("goal");
        this.m = jSONObject2.optInt("funded");
        this.n = jSONObject2.optInt("backers");
        this.o = jSONObject2.optString(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.S(this.l);
        serializer.S(this.m);
        serializer.S(this.n);
        serializer.j0(this.o);
    }

    public WidgetDonation(Serializer serializer) {
        super(serializer);
        this.h = serializer.H();
        this.i = serializer.H();
        this.j = serializer.H();
        this.k = serializer.H();
        this.l = serializer.u();
        this.m = serializer.u();
        this.n = serializer.u();
        this.o = serializer.H();
    }
}
