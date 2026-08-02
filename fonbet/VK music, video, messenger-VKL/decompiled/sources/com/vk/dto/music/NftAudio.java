package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.d370;
import xsna.eiz;
import xsna.epx;
import xsna.er;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: NftAudio.kt */
/* loaded from: classes18.dex */
public final class NftAudio extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<NftAudio> CREATOR = new b();
    public final String b;
    public final Image c;

    /* compiled from: NftAudio.kt */
    public static final class a {
        public static NftAudio a(JSONObject jSONObject) {
            JSONArray optJSONArray;
            Image image = null;
            if (jSONObject == null) {
                return null;
            }
            String string = jSONObject.getString("nft_public_id");
            JSONObject optJSONObject = jSONObject.optJSONObject("cover");
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("sizes")) != null) {
                image = new Image(optJSONArray, null, 2, null);
            }
            return new NftAudio(string, image);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NftAudio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NftAudio a(Serializer serializer) {
            return new NftAudio(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NftAudio[i];
        }
    }

    public NftAudio(String str, Image image) {
        this.b = str;
        this.c = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "nft_public_id");
        w9yVar.e(d370.C(new eiz(this, 17)), "cover");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftAudio)) {
            return false;
        }
        NftAudio nftAudio = (NftAudio) obj;
        return epx.f(this.b, nftAudio.b) && epx.f(this.c, nftAudio.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.c;
        return hashCode + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftAudio(id=");
        sb.append(this.b);
        sb.append(", cover=");
        return er.d(sb, this.c, ')');
    }
}
