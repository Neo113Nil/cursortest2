package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkidmailLinkedEmailsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailLinkedEmailsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailLinkedEmailsResponseDto> CREATOR = new a();

    @pmi0("emails")
    private final List<String> emails;

    /* compiled from: VkidmailLinkedEmailsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailLinkedEmailsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailLinkedEmailsResponseDto createFromParcel(Parcel parcel) {
            return new VkidmailLinkedEmailsResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailLinkedEmailsResponseDto[] newArray(int i) {
            return new VkidmailLinkedEmailsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkidmailLinkedEmailsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkidmailLinkedEmailsResponseDto) && epx.f(this.emails, ((VkidmailLinkedEmailsResponseDto) obj).emails);
    }

    public final int hashCode() {
        List<String> list = this.emails;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VkidmailLinkedEmailsResponseDto(emails="), this.emails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.emails);
    }

    public VkidmailLinkedEmailsResponseDto(List<String> list) {
        this.emails = list;
    }

    public /* synthetic */ VkidmailLinkedEmailsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
