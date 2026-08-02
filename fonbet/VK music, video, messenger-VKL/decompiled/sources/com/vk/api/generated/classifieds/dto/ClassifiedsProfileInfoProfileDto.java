package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClassifiedsProfileInfoProfileDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProfileInfoProfileDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProfileInfoProfileDto> CREATOR = new a();

    @pmi0("miniapp_url")
    private final String miniappUrl;

    @pmi0("new_products_counter")
    private final int newProductsCounter;

    @pmi0(LoginApiConstants.PARAM_NAME_USERNAME)
    private final String userName;

    /* compiled from: ClassifiedsProfileInfoProfileDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProfileInfoProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoProfileDto createFromParcel(Parcel parcel) {
            return new ClassifiedsProfileInfoProfileDto(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoProfileDto[] newArray(int i) {
            return new ClassifiedsProfileInfoProfileDto[i];
        }
    }

    public ClassifiedsProfileInfoProfileDto(String str, int i, String str2) {
        this.miniappUrl = str;
        this.newProductsCounter = i;
        this.userName = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProfileInfoProfileDto)) {
            return false;
        }
        ClassifiedsProfileInfoProfileDto classifiedsProfileInfoProfileDto = (ClassifiedsProfileInfoProfileDto) obj;
        return epx.f(this.miniappUrl, classifiedsProfileInfoProfileDto.miniappUrl) && this.newProductsCounter == classifiedsProfileInfoProfileDto.newProductsCounter && epx.f(this.userName, classifiedsProfileInfoProfileDto.userName);
    }

    public final int hashCode() {
        int a2 = shy.a(this.newProductsCounter, this.miniappUrl.hashCode() * 31, 31);
        String str = this.userName;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsProfileInfoProfileDto(miniappUrl=");
        sb.append(this.miniappUrl);
        sb.append(", newProductsCounter=");
        sb.append(this.newProductsCounter);
        sb.append(", userName=");
        return ho8.a(sb, this.userName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.miniappUrl);
        parcel.writeInt(this.newProductsCounter);
        parcel.writeString(this.userName);
    }

    public /* synthetic */ ClassifiedsProfileInfoProfileDto(String str, int i, String str2, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2);
    }
}
