package com.vk.dto.photo;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;

/* loaded from: classes18.dex */
public class TaggedPhoto extends Photo {
    public static final Serializer.c<TaggedPhoto> CREATOR = new a();
    public final int S;
    public final UserId T;

    public class a extends Serializer.c<TaggedPhoto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TaggedPhoto a(@NonNull Serializer serializer) {
            return new TaggedPhoto(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaggedPhoto[i];
        }
    }

    public class b extends aay<TaggedPhoto> {
        @Override // xsna.aay
        public final TaggedPhoto a(JSONObject jSONObject) throws JSONException {
            return new TaggedPhoto(jSONObject);
        }
    }

    static {
        new b();
    }

    public TaggedPhoto(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.T = UserId.d;
        try {
            this.S = jSONObject.getInt("tag_id");
            this.T = new UserId(jSONObject.getLong("placer_id"));
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // com.vk.dto.photo.Photo, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.S(this.S);
        serializer.e0(this.T);
    }

    public TaggedPhoto(Serializer serializer) {
        super(serializer);
        this.T = UserId.d;
        this.S = serializer.u();
        this.T = (UserId) serializer.A(UserId.class.getClassLoader());
    }
}
