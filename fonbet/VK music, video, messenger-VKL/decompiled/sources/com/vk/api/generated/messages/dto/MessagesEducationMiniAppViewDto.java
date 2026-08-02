package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesEducationMiniAppViewDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEducationMiniAppViewDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEducationMiniAppViewDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("description")
    private final String description;

    @pmi0("image_link")
    private final String imageLink;

    @pmi0("is_official")
    private final boolean isOfficial;

    @pmi0("link")
    private final String link;

    @pmi0("mau_views")
    private final int mauViews;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesEducationMiniAppViewDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEducationMiniAppViewDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEducationMiniAppViewDto createFromParcel(Parcel parcel) {
            return new MessagesEducationMiniAppViewDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEducationMiniAppViewDto[] newArray(int i) {
            return new MessagesEducationMiniAppViewDto[i];
        }
    }

    public MessagesEducationMiniAppViewDto(int i, String str, String str2, String str3, String str4, int i2, boolean z, String str5) {
        this.appId = i;
        this.title = str;
        this.description = str2;
        this.link = str3;
        this.imageLink = str4;
        this.mauViews = i2;
        this.isOfficial = z;
        this.backgroundColor = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEducationMiniAppViewDto)) {
            return false;
        }
        MessagesEducationMiniAppViewDto messagesEducationMiniAppViewDto = (MessagesEducationMiniAppViewDto) obj;
        return this.appId == messagesEducationMiniAppViewDto.appId && epx.f(this.title, messagesEducationMiniAppViewDto.title) && epx.f(this.description, messagesEducationMiniAppViewDto.description) && epx.f(this.link, messagesEducationMiniAppViewDto.link) && epx.f(this.imageLink, messagesEducationMiniAppViewDto.imageLink) && this.mauViews == messagesEducationMiniAppViewDto.mauViews && this.isOfficial == messagesEducationMiniAppViewDto.isOfficial && epx.f(this.backgroundColor, messagesEducationMiniAppViewDto.backgroundColor);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.mauViews, urd0.a(urd0.a(urd0.a(urd0.a(Integer.hashCode(this.appId) * 31, 31, this.title), 31, this.description), 31, this.link), 31, this.imageLink), 31), 31, this.isOfficial);
        String str = this.backgroundColor;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEducationMiniAppViewDto(appId=");
        sb.append(this.appId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", imageLink=");
        sb.append(this.imageLink);
        sb.append(", mauViews=");
        sb.append(this.mauViews);
        sb.append(", isOfficial=");
        sb.append(this.isOfficial);
        sb.append(", backgroundColor=");
        return ho8.a(sb, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.link);
        parcel.writeString(this.imageLink);
        parcel.writeInt(this.mauViews);
        parcel.writeInt(this.isOfficial ? 1 : 0);
        parcel.writeString(this.backgroundColor);
    }

    public /* synthetic */ MessagesEducationMiniAppViewDto(int i, String str, String str2, String str3, String str4, int i2, boolean z, String str5, int i3, zcl zclVar) {
        this(i, str, str2, str3, str4, i2, z, (i3 & 128) != 0 ? null : str5);
    }
}
