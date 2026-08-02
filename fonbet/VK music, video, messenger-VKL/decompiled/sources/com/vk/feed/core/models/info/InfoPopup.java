package com.vk.feed.core.models.info;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.ImagePhoto;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: InfoPopup.kt */
/* loaded from: classes18.dex */
public final class InfoPopup implements Serializer.StreamParcelable {
    public static final Serializer.c<InfoPopup> CREATOR = new b();
    public final String b;
    public final ImagePhoto c;
    public final InfoButton d;

    /* compiled from: InfoPopup.kt */
    public static final class a {
        public static InfoPopup a(JSONObject jSONObject) {
            ImagePhoto imagePhoto;
            String optString = jSONObject.optString("text");
            JSONObject optJSONObject = jSONObject.optJSONObject("image");
            if (optJSONObject != null) {
                Serializer.c<ImagePhoto> cVar = ImagePhoto.CREATOR;
                imagePhoto = ImagePhoto.a.a(optJSONObject, null);
            } else {
                imagePhoto = null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("button");
            return new InfoPopup(optString, imagePhoto, optJSONObject2 != null ? new InfoButton(optJSONObject2.optString("text")) : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<InfoPopup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InfoPopup a(Serializer serializer) {
            return new InfoPopup(serializer.H(), (ImagePhoto) serializer.G(ImagePhoto.class.getClassLoader()), (InfoButton) serializer.G(InfoButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoPopup[i];
        }
    }

    public InfoPopup(String str, ImagePhoto imagePhoto, InfoButton infoButton) {
        this.b = str;
        this.c = imagePhoto;
        this.d = infoButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoPopup)) {
            return false;
        }
        InfoPopup infoPopup = (InfoPopup) obj;
        return epx.f(this.b, infoPopup.b) && epx.f(this.c, infoPopup.c) && epx.f(this.d, infoPopup.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ImagePhoto imagePhoto = this.c;
        int hashCode2 = (hashCode + (imagePhoto == null ? 0 : imagePhoto.hashCode())) * 31;
        InfoButton infoButton = this.d;
        return hashCode2 + (infoButton != null ? infoButton.b.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPopup(text=" + this.b + ", image=" + this.c + ", button=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
