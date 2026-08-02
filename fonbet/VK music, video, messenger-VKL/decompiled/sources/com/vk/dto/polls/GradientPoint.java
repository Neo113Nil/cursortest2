package com.vk.dto.polls;

import android.graphics.Color;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.ro;

/* compiled from: PollBackgrounds.kt */
/* loaded from: classes18.dex */
public final class GradientPoint extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<GradientPoint> CREATOR = new a();
    public final int b;
    public final double c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GradientPoint> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GradientPoint a(Serializer serializer) {
            return new GradientPoint(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GradientPoint[i];
        }
    }

    public GradientPoint(int i, double d) {
        this.b = i;
        this.c = d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.O(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            ro.d(16);
            jSONObject.put(X3.i.L, this.c).put("color", Long.toString(this.b & 4294967295L, 16));
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public GradientPoint(Serializer serializer) {
        this(serializer.u(), serializer.r());
    }

    public GradientPoint(JSONObject jSONObject) {
        this(Color.parseColor("#" + jSONObject.getString("color")), jSONObject.getDouble(X3.i.L));
    }
}
