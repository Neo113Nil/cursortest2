package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: WebIdentityLabel.kt */
/* loaded from: classes6.dex */
public final class WebIdentityLabel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebIdentityLabel> CREATOR = new a();
    public final int b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebIdentityLabel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebIdentityLabel a(Serializer serializer) {
            return new WebIdentityLabel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebIdentityLabel[i];
        }
    }

    public WebIdentityLabel(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!WebIdentityLabel.class.equals(obj.getClass())) {
            return false;
        }
        WebIdentityLabel webIdentityLabel = (WebIdentityLabel) obj;
        if (zb() && webIdentityLabel.zb()) {
            Locale locale = Locale.ROOT;
            if (this.c.toLowerCase(locale).equals(webIdentityLabel.c.toLowerCase(locale))) {
                return true;
            }
        }
        return (zb() || webIdentityLabel.zb() || this.b != webIdentityLabel.b) ? false : true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b * 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        int i = this.b;
        if (i > 0) {
            jSONObject.put("id", i);
        }
        jSONObject.put("name", this.c);
        return jSONObject.toString();
    }

    public final boolean zb() {
        return this.b <= 0;
    }

    public WebIdentityLabel(Serializer serializer) {
        this(serializer.u(), serializer.H());
    }
}
