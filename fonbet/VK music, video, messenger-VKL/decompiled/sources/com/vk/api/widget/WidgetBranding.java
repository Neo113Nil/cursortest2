package com.vk.api.widget;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.epx;
import xsna.er;

/* compiled from: WidgetBranding.kt */
/* loaded from: classes15.dex */
public final class WidgetBranding extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WidgetBranding> CREATOR = new b();
    public final String b;
    public final Image c;

    /* compiled from: WidgetBranding.kt */
    public static final class a {
        public static WidgetBranding a(JSONObject jSONObject) {
            if (jSONObject == null || jSONObject.optInt("type", 0) != 1) {
                return null;
            }
            return new WidgetBranding(jSONObject.optString("title"), new Image(jSONObject.optJSONArray("images"), null, 2, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WidgetBranding> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetBranding a(Serializer serializer) {
            return new WidgetBranding(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetBranding[i];
        }
    }

    public WidgetBranding(String str, Image image) {
        this.b = str;
        this.c = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetBranding)) {
            return false;
        }
        WidgetBranding widgetBranding = (WidgetBranding) obj;
        return epx.f(this.b, widgetBranding.b) && epx.f(this.c, widgetBranding.c);
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetBranding(title=");
        sb.append(this.b);
        sb.append(", images=");
        return er.d(sb, this.c, ')');
    }
}
