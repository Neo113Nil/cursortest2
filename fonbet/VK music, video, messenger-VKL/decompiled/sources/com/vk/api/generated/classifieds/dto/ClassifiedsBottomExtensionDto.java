package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsBottomExtensionDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsBottomExtensionDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsBottomExtensionDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("close_button")
    private final BaseLinkButtonDto closeButton;

    @pmi0("text")
    private final String text;

    /* compiled from: ClassifiedsBottomExtensionDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsBottomExtensionDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsBottomExtensionDto createFromParcel(Parcel parcel) {
            return new ClassifiedsBottomExtensionDto(parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(ClassifiedsBottomExtensionDto.class.getClassLoader()), (BaseLinkButtonDto) parcel.readParcelable(ClassifiedsBottomExtensionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsBottomExtensionDto[] newArray(int i) {
            return new ClassifiedsBottomExtensionDto[i];
        }
    }

    public ClassifiedsBottomExtensionDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsBottomExtensionDto)) {
            return false;
        }
        ClassifiedsBottomExtensionDto classifiedsBottomExtensionDto = (ClassifiedsBottomExtensionDto) obj;
        return epx.f(this.text, classifiedsBottomExtensionDto.text) && epx.f(this.button, classifiedsBottomExtensionDto.button) && epx.f(this.closeButton, classifiedsBottomExtensionDto.closeButton);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode2 = (hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto2 = this.closeButton;
        return hashCode2 + (baseLinkButtonDto2 != null ? baseLinkButtonDto2.hashCode() : 0);
    }

    public final String toString() {
        return "ClassifiedsBottomExtensionDto(text=" + this.text + ", button=" + this.button + ", closeButton=" + this.closeButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
        parcel.writeParcelable(this.closeButton, i);
    }

    public ClassifiedsBottomExtensionDto(String str, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2) {
        this.text = str;
        this.button = baseLinkButtonDto;
        this.closeButton = baseLinkButtonDto2;
    }

    public /* synthetic */ ClassifiedsBottomExtensionDto(String str, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseLinkButtonDto, (i & 4) != 0 ? null : baseLinkButtonDto2);
    }
}
