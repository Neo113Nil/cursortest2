package com.vk.dto.common;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.gl.tf.Tensorflow;
import xsna.aay;

/* loaded from: classes18.dex */
public class GoodAlbum extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GoodAlbum> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final Photo e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;

    public class a extends Serializer.c<GoodAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GoodAlbum a(@NonNull Serializer serializer) {
            return new GoodAlbum(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GoodAlbum[i];
        }
    }

    public class b extends aay<GoodAlbum> {
        @Override // xsna.aay
        public final GoodAlbum a(JSONObject jSONObject) throws JSONException {
            return new GoodAlbum(jSONObject);
        }
    }

    static {
        new b();
    }

    public GoodAlbum(int i, UserId userId, String str, Photo photo, int i2, int i3, int i4, boolean z, boolean z2) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = photo;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = z;
        this.j = z2;
    }

    public static Photo zb() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ImageSize("", Tensorflow.FRAME_WIDTH, 249, Boolean.FALSE, 'r'));
        return new Photo(new Image(arrayList));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
    }

    public GoodAlbum(JSONObject jSONObject) {
        Photo photo;
        this.b = jSONObject.optInt("id");
        this.c = new UserId(jSONObject.optLong("owner_id"));
        this.d = jSONObject.optString("title");
        this.h = jSONObject.optInt("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("photo");
        if (optJSONObject != null) {
            try {
                photo = new Photo(optJSONObject);
            } catch (JSONException unused) {
                photo = null;
            }
            if (photo != null) {
                this.e = photo;
            } else {
                this.e = zb();
            }
        } else {
            this.e = zb();
        }
        this.f = jSONObject.optInt("count");
        this.g = jSONObject.optInt("updated_time");
        this.i = jSONObject.optBoolean("is_main");
        this.j = jSONObject.optBoolean("is_hidden");
    }

    public GoodAlbum(Serializer serializer) {
        this.b = serializer.u();
        this.c = (UserId) serializer.A(UserId.class.getClassLoader());
        this.d = serializer.H();
        this.e = (Photo) serializer.G(Photo.class.getClassLoader());
        this.f = serializer.u();
        this.g = serializer.u();
        this.h = serializer.u();
        this.i = serializer.m();
        this.j = serializer.m();
    }
}
