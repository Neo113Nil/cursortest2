package com.vk.superapp.api.dto.story;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bxx;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.rl3;
import xsna.zcl;

/* compiled from: WebTransform.kt */
/* loaded from: classes6.dex */
public final class WebTransform extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<WebTransform> CREATOR = new b();
    public final int b;
    public final float c;
    public final float d;
    public final Float e;
    public final String f;

    /* compiled from: WebTransform.kt */
    public static final class a {
        public static WebTransform a(JSONObject jSONObject) {
            Set y0 = rl3.y0(new String[]{"left_top", "left_center", "left_bottom", "center_top", TtmlNode.CENTER, "center_bottom", "right_top", "right_center", "right_bottom"});
            String optString = jSONObject.optString("gravity", TtmlNode.CENTER);
            if (!y0.contains(optString)) {
                throw new IllegalStateException(go9.b("You pass incorrect gravity ", optString));
            }
            int optInt = jSONObject.optInt("rotation");
            float optDouble = (float) jSONObject.optDouble("translation_x", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            float optDouble2 = (float) jSONObject.optDouble("translation_y", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            float optDouble3 = (float) jSONObject.optDouble("relation_width", -1.0d);
            return new WebTransform(optInt, optDouble, optDouble2, optDouble3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf(optDouble3) : null, optString);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WebTransform> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebTransform a(Serializer serializer) {
            return new WebTransform(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebTransform[i];
        }
    }

    public WebTransform() {
        this(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 31, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.P(this.c);
        serializer.P(this.d);
        serializer.R(this.e);
        serializer.j0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rotation", this.b);
        jSONObject.put("translation_x", this.c);
        jSONObject.put("translation_y", this.d);
        jSONObject.put("relation_width", this.e != null ? Double.valueOf(r1.floatValue()) : null);
        jSONObject.put("gravity", this.f);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTransform)) {
            return false;
        }
        WebTransform webTransform = (WebTransform) obj;
        return this.b == webTransform.b && Float.compare(this.c, webTransform.c) == 0 && Float.compare(this.d, webTransform.d) == 0 && epx.f(this.e, webTransform.e) && epx.f(this.f, webTransform.f);
    }

    public final int hashCode() {
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        Float f = this.e;
        return this.f.hashCode() + ((a2 + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebTransform(rotation=");
        sb.append(this.b);
        sb.append(", translationX=");
        sb.append(this.c);
        sb.append(", translationY=");
        sb.append(this.d);
        sb.append(", relationWidth=");
        sb.append(this.e);
        sb.append(", gravity=");
        return ho8.a(sb, this.f, ')');
    }

    public /* synthetic */ WebTransform(int i, float f, float f2, Float f3, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? null : f3, (i2 & 16) != 0 ? TtmlNode.CENTER : str);
    }

    public WebTransform(int i, float f, float f2, Float f3, String str) {
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = str;
    }

    public WebTransform(Serializer serializer) {
        this(serializer.u(), serializer.s(), serializer.s(), serializer.t(), serializer.H());
    }
}
