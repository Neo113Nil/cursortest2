package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.f370;
import xsna.vu5;

/* compiled from: WebClickablePoint.kt */
/* loaded from: classes6.dex */
public final class WebClickablePoint extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebClickablePoint> CREATOR = new b();
    public final int b;
    public final int c;

    /* compiled from: WebClickablePoint.kt */
    public static final class a {
        public static WebClickablePoint a(JSONObject jSONObject) {
            return new WebClickablePoint(f370.w(jSONObject, 0, "x"), jSONObject.has("y") ? jSONObject.getInt("y") : 0);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WebClickablePoint> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebClickablePoint a(Serializer serializer) {
            return new WebClickablePoint(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebClickablePoint[i];
        }
    }

    public WebClickablePoint(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebClickablePoint)) {
            return false;
        }
        WebClickablePoint webClickablePoint = (WebClickablePoint) obj;
        return this.b == webClickablePoint.b && this.c == webClickablePoint.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebClickablePoint(x=");
        sb.append(this.b);
        sb.append(", y=");
        return vu5.b(sb, this.c, ')');
    }

    public WebClickablePoint(Serializer serializer) {
        this(serializer.u(), serializer.u());
    }
}
