package com.vk.dto.community.entries.widget;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Widget.kt */
/* loaded from: classes18.dex */
public abstract class Widget extends Serializer.StreamParcelableAdapter {
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    /* compiled from: Widget.kt */
    public static final class a {
        public static Widget a(JSONObject jSONObject) {
            try {
                int i = jSONObject.getInt("type");
                switch (i) {
                    case 1:
                        return new WidgetText(jSONObject);
                    case 2:
                    case 5:
                        return new WidgetList(jSONObject);
                    case 3:
                        return new WidgetTable(jSONObject);
                    case 4:
                        return new WidgetTiles(jSONObject);
                    case 6:
                        return new WidgetCoverList(jSONObject);
                    case 7:
                        return new WidgetMatch(jSONObject);
                    case 8:
                        return new WidgetMatches(jSONObject);
                    case 9:
                        return new WidgetDonation(jSONObject);
                    default:
                        L.l("Widget", "Widget type is not supported: type = " + i);
                        return null;
                }
            } catch (JSONException e) {
                L.g("Widget", e);
                return null;
            }
        }
    }

    public Widget(int i, String str, String str2, String str3, String str4, Integer num) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        Integer num = this.g;
        serializer.j0(num != null ? num.toString() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Widget) {
            Widget widget = (Widget) obj;
            if (this.b == widget.b && TextUtils.equals(this.c, widget.c) && TextUtils.equals(this.d, widget.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.b) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Widget(JSONObject jSONObject) throws JSONException {
        this(jSONObject.getInt("type"), jSONObject.getJSONObject("data").getString("title"), r3, jSONObject.getJSONObject("data").optString("more"), r9, r10);
        Integer valueOf = jSONObject.getJSONObject("data").has("title_counter") ? Integer.valueOf(jSONObject.getJSONObject("data").getInt("title_counter")) : null;
        JSONObject optJSONObject = jSONObject.getJSONObject("data").optJSONObject("more_action");
        String optString = optJSONObject != null ? optJSONObject.optString("url") : null;
        JSONObject optJSONObject2 = jSONObject.getJSONObject("data").optJSONObject("title_action");
        String optString2 = optJSONObject2 != null ? optJSONObject2.optString("url") : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Widget(Serializer serializer) {
        this(r1, r2, r3, r4, r5, r8 != null ? Integer.valueOf(r8) : null);
        int u = serializer.u();
        String H = serializer.H();
        String H2 = serializer.H();
        String H3 = serializer.H();
        String H4 = serializer.H();
        String H5 = serializer.H();
    }
}
