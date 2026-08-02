package com.vk.dto.music;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.MetaBox;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.music.Meta;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.i5s;

@Deprecated
/* loaded from: classes18.dex */
public class CustomImage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CustomImage> CREATOR = new a();
    public static final b g = new b();
    public final String b;
    public final String c;
    public final String d;

    @Nullable
    public final Meta e;
    public final Image f;

    public class a extends Serializer.c<CustomImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CustomImage a(@NonNull Serializer serializer) {
            return new CustomImage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomImage[i];
        }
    }

    public class b extends aay<CustomImage> {
        @Override // xsna.aay
        public final CustomImage a(JSONObject jSONObject) throws JSONException {
            return new CustomImage(jSONObject);
        }
    }

    public CustomImage(Serializer serializer) {
        this.b = serializer.H();
        this.c = serializer.H();
        this.d = serializer.H();
        this.f = (Image) serializer.G(Image.class.getClassLoader());
        this.e = (Meta) serializer.G(Meta.class.getClassLoader());
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.f);
        serializer.i0(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomImage<");
        sb.append(this.b);
        sb.append(", ");
        return i5s.a(sb, this.d, ">");
    }

    public CustomImage(JSONObject jSONObject) throws JSONException {
        Meta meta;
        this.b = jSONObject.optString("title");
        this.c = jSONObject.optString("subtitle");
        this.d = jSONObject.optString("url");
        this.f = new Image(jSONObject.optJSONArray("image"));
        Meta.b bVar = Meta.e;
        if (jSONObject.has(MetaBox.TYPE)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(MetaBox.TYPE);
                bVar.getClass();
                meta = new Meta(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
            this.e = meta;
        }
        meta = null;
        this.e = meta;
    }
}
