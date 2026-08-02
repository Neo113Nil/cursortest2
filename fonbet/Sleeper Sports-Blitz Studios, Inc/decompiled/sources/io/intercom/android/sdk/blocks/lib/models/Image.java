package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: io.intercom.android.sdk.blocks.lib.models.Image.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image[] newArray(int i) {
            return new Image[i];
        }
    };
    private final String alt;
    private final String attribution;
    private final int height;
    private final String previewUrl;
    private final String url;
    private final int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Image() {
        this(new Builder());
    }

    private Image(Builder builder) {
        this.alt = builder.alt == null ? "" : builder.alt;
        this.url = builder.url == null ? "" : builder.url;
        this.previewUrl = builder.previewUrl == null ? "" : builder.previewUrl;
        this.attribution = builder.attribution != null ? builder.attribution : "";
        this.width = builder.width;
        this.height = builder.height;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public static final class Builder {
        String alt;
        String attribution;
        int height;
        String previewUrl;
        String url;
        int width;

        public Builder withAlt(String str) {
            this.alt = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i) {
            this.width = i;
            return this;
        }

        public Builder withHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Image build() {
            return new Image(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Image image = (Image) obj;
            String str = this.alt;
            if (str == null ? image.alt != null : !str.equals(image.alt)) {
                return false;
            }
            String str2 = this.previewUrl;
            if (str2 == null ? image.previewUrl != null : !str2.equals(image.previewUrl)) {
                return false;
            }
            String str3 = this.attribution;
            if (str3 == null ? image.attribution != null : !str3.equals(image.attribution)) {
                return false;
            }
            if (this.width != image.width || this.height != image.height) {
                return false;
            }
            String str4 = this.url;
            String str5 = image.url;
            if (str4 == null ? str5 == null : str4.equals(str5)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.alt;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.previewUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.attribution;
        return ((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.width) * 31) + this.height;
    }

    protected Image(Parcel parcel) {
        this.attribution = parcel.readString();
        this.previewUrl = parcel.readString();
        this.alt = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.attribution);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.alt);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
