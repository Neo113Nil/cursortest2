package com.vk.dto.music;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;

@Deprecated
/* loaded from: classes18.dex */
public class Meta extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Meta> CREATOR = new a();
    public static final b e = new b();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    public class a extends Serializer.c<Meta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Meta a(@NonNull Serializer serializer) {
            return new Meta(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Meta[i];
        }
    }

    public class b extends aay<Meta> {
        @Override // xsna.aay
        public final Meta a(JSONObject jSONObject) throws JSONException {
            return new Meta(jSONObject);
        }
    }

    public Meta(JSONObject jSONObject) {
        this.b = jSONObject.optString("icon");
        this.c = jSONObject.optString("content_type");
        this.d = jSONObject.optString("track_code");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public Meta(Serializer serializer) {
        this.b = serializer.H();
        this.c = serializer.H();
        this.d = serializer.H();
    }
}
