package com.vk.feed.core.models;

import android.os.Parcel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.cqm0;
import xsna.epx;
import xsna.fkq0;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: ImagePhoto.kt */
/* loaded from: classes18.dex */
public final class ImagePhoto implements Serializer.StreamParcelable {
    public static final Serializer.c<ImagePhoto> CREATOR = new b();
    public final Image b;
    public final String c;
    public final String d;
    public final Owner e;
    public final ThemedColor f;

    /* compiled from: ImagePhoto.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static ImagePhoto a(JSONObject jSONObject, Map map) {
            Owner owner;
            ThemedColor themedColor;
            JSONArray optJSONArray = jSONObject.optJSONArray("sizes");
            Image image = optJSONArray != null ? new Image(optJSONArray, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0) : null;
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_IMAGE_URL);
            String optString2 = jSONObject.optString("name");
            if (map != null) {
                long optLong = jSONObject.optLong("source_id");
                gzs<s3q0> gzsVar = fkq0.a;
                owner = (Owner) map.get(new UserId(optLong));
            } else {
                owner = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("color");
            if (optJSONObject != null) {
                String a = cqm0.a(optJSONObject.optString("light"));
                Integer a2 = a != null ? n.a("#", a) : null;
                String a3 = cqm0.a(optJSONObject.optString("dark"));
                themedColor = new ThemedColor(a2, a3 != null ? n.a("#", a3) : null);
            } else {
                themedColor = null;
            }
            return new ImagePhoto(image, optString, optString2, owner, themedColor);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ImagePhoto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImagePhoto a(Serializer serializer) {
            return new ImagePhoto((Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H(), (Owner) serializer.G(Owner.class.getClassLoader()), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImagePhoto[i];
        }
    }

    public ImagePhoto(Image image, String str, String str2, Owner owner, ThemedColor themedColor) {
        this.b = image;
        this.c = str;
        this.d = str2;
        this.e = owner;
        this.f = themedColor;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final String a(int i) {
        ImageSize Cb;
        String str;
        String a2;
        Image image = this.b;
        return (image == null || (Cb = image.Cb(i, true, false)) == null || (str = Cb.d.d) == null || (a2 = cqm0.a(str)) == null) ? this.c : a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePhoto)) {
            return false;
        }
        ImagePhoto imagePhoto = (ImagePhoto) obj;
        return epx.f(this.b, imagePhoto.b) && epx.f(this.c, imagePhoto.c) && epx.f(this.d, imagePhoto.d) && epx.f(this.e, imagePhoto.e) && epx.f(this.f, imagePhoto.f);
    }

    public final int hashCode() {
        Image image = this.b;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Owner owner = this.e;
        int hashCode4 = (hashCode3 + (owner == null ? 0 : owner.hashCode())) * 31;
        ThemedColor themedColor = this.f;
        return hashCode4 + (themedColor != null ? themedColor.hashCode() : 0);
    }

    public final String toString() {
        return "ImagePhoto(sizes=" + this.b + ", imageUrl=" + this.c + ", name=" + this.d + ", owner=" + this.e + ", color=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
