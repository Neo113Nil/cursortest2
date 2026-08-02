package com.vk.dto.profile;

import android.graphics.Color;
import android.text.TextUtils;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;

/* loaded from: classes18.dex */
public class MetroStation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MetroStation> CREATOR = new a();
    public final int b;
    public final String c;
    public final int d;

    public class a extends Serializer.c<MetroStation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MetroStation a(Serializer serializer) {
            return new MetroStation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MetroStation[i];
        }
    }

    public class b extends aay<MetroStation> {
        @Override // xsna.aay
        public final MetroStation a(JSONObject jSONObject) throws JSONException {
            return new MetroStation(jSONObject);
        }
    }

    static {
        new b();
    }

    public MetroStation(int i, String str, int i2) {
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
    }

    public MetroStation(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getInt("id");
        String optString = jSONObject.optString("color");
        if (!TextUtils.isEmpty(optString)) {
            this.d = Color.parseColor("#" + optString);
        } else {
            this.d = -16777216;
        }
        this.c = jSONObject.optString("name");
    }

    public MetroStation(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.H();
        this.d = serializer.u();
    }
}
