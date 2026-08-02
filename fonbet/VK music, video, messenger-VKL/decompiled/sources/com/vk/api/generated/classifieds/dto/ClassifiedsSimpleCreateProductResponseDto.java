package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: ClassifiedsSimpleCreateProductResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsSimpleCreateProductResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsSimpleCreateProductResponseDto> CREATOR = new a();

    @pmi0("crossposting_url")
    private final String crosspostingUrl;

    @pmi0("crossposting_url_hash")
    private final String crosspostingUrlHash;

    @pmi0("miniapp_id")
    private final int miniappId;

    @pmi0("product_id")
    private final String productId;

    @pmi0("product_link")
    private final String productLink;

    /* compiled from: ClassifiedsSimpleCreateProductResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsSimpleCreateProductResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsSimpleCreateProductResponseDto createFromParcel(Parcel parcel) {
            return new ClassifiedsSimpleCreateProductResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsSimpleCreateProductResponseDto[] newArray(int i) {
            return new ClassifiedsSimpleCreateProductResponseDto[i];
        }
    }

    public ClassifiedsSimpleCreateProductResponseDto(String str, String str2, String str3, int i, String str4) {
        this.productId = str;
        this.crosspostingUrl = str2;
        this.crosspostingUrlHash = str3;
        this.miniappId = i;
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
        if (!(obj instanceof ClassifiedsSimpleCreateProductResponseDto)) {
            return false;
        }
        ClassifiedsSimpleCreateProductResponseDto classifiedsSimpleCreateProductResponseDto = (ClassifiedsSimpleCreateProductResponseDto) obj;
        return epx.f(this.productId, classifiedsSimpleCreateProductResponseDto.productId) && epx.f(this.crosspostingUrl, classifiedsSimpleCreateProductResponseDto.crosspostingUrl) && epx.f(this.crosspostingUrlHash, classifiedsSimpleCreateProductResponseDto.crosspostingUrlHash) && this.miniappId == classifiedsSimpleCreateProductResponseDto.miniappId && epx.f(this.productLink, classifiedsSimpleCreateProductResponseDto.productLink);
    }

    public final int hashCode() {
        return this.productLink.hashCode() + shy.a(this.miniappId, urd0.a(urd0.a(this.productId.hashCode() * 31, 31, this.crosspostingUrl), 31, this.crosspostingUrlHash), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsSimpleCreateProductResponseDto(productId=");
        sb.append(this.productId);
        sb.append(", crosspostingUrl=");
        sb.append(this.crosspostingUrl);
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
        parcel.writeString(this.crosspostingUrlHash);
        parcel.writeInt(this.miniappId);
        parcel.writeString(this.productLink);
    }
}
