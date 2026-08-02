package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: ClassifiedsAutoRecognitionCreateProductResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsAutoRecognitionCreateProductResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsAutoRecognitionCreateProductResponseDto> CREATOR = new a();

    @pmi0("crossposting_url")
    private final String crosspostingUrl;

    @pmi0("crossposting_url_hash")
    private final String crosspostingUrlHash;

    @pmi0("miniapp_id")
    private final int miniappId;

    @pmi0("post_id")
    private final int postId;

    @pmi0("product_id")
    private final String productId;

    @pmi0("product_link")
    private final String productLink;

    /* compiled from: ClassifiedsAutoRecognitionCreateProductResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsAutoRecognitionCreateProductResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsAutoRecognitionCreateProductResponseDto createFromParcel(Parcel parcel) {
            return new ClassifiedsAutoRecognitionCreateProductResponseDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsAutoRecognitionCreateProductResponseDto[] newArray(int i) {
            return new ClassifiedsAutoRecognitionCreateProductResponseDto[i];
        }
    }

    public ClassifiedsAutoRecognitionCreateProductResponseDto(String str, String str2, int i, String str3, int i2, String str4) {
        this.productId = str;
        this.crosspostingUrl = str2;
        this.postId = i;
        this.crosspostingUrlHash = str3;
        this.miniappId = i2;
        this.productLink = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsAutoRecognitionCreateProductResponseDto)) {
            return false;
        }
        ClassifiedsAutoRecognitionCreateProductResponseDto classifiedsAutoRecognitionCreateProductResponseDto = (ClassifiedsAutoRecognitionCreateProductResponseDto) obj;
        return epx.f(this.productId, classifiedsAutoRecognitionCreateProductResponseDto.productId) && epx.f(this.crosspostingUrl, classifiedsAutoRecognitionCreateProductResponseDto.crosspostingUrl) && this.postId == classifiedsAutoRecognitionCreateProductResponseDto.postId && epx.f(this.crosspostingUrlHash, classifiedsAutoRecognitionCreateProductResponseDto.crosspostingUrlHash) && this.miniappId == classifiedsAutoRecognitionCreateProductResponseDto.miniappId && epx.f(this.productLink, classifiedsAutoRecognitionCreateProductResponseDto.productLink);
    }

    public final int hashCode() {
        return this.productLink.hashCode() + shy.a(this.miniappId, urd0.a(shy.a(this.postId, urd0.a(this.productId.hashCode() * 31, 31, this.crosspostingUrl), 31), 31, this.crosspostingUrlHash), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsAutoRecognitionCreateProductResponseDto(productId=");
        sb.append(this.productId);
        sb.append(", crosspostingUrl=");
        sb.append(this.crosspostingUrl);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", crosspostingUrlHash=");
        sb.append(this.crosspostingUrlHash);
        sb.append(", miniappId=");
        sb.append(this.miniappId);
        sb.append(", productLink=");
        return ho8.a(sb, this.productLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.crosspostingUrl);
        parcel.writeInt(this.postId);
        parcel.writeString(this.crosspostingUrlHash);
        parcel.writeInt(this.miniappId);
        parcel.writeString(this.productLink);
    }
}
