package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesMessageCarouselItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageCarouselItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageCarouselItemDto> CREATOR = new a();

    @pmi0("action")
    private final MessagesKeyboardButtonPropertyCarouselActionDto action;

    @pmi0("buttons")
    private final List<MessagesKeyboardButtonDto> buttons;

    @pmi0("description")
    private final String description;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesMessageCarouselItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageCarouselItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageCarouselItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            MessagesKeyboardButtonPropertyCarouselActionDto createFromParcel = parcel.readInt() == 0 ? null : MessagesKeyboardButtonPropertyCarouselActionDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(MessagesMessageCarouselItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesKeyboardButtonDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MessagesMessageCarouselItemDto(readString, createFromParcel, readString2, photosPhotoDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageCarouselItemDto[] newArray(int i) {
            return new MessagesMessageCarouselItemDto[i];
        }
    }

    public MessagesMessageCarouselItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageCarouselItemDto)) {
            return false;
        }
        MessagesMessageCarouselItemDto messagesMessageCarouselItemDto = (MessagesMessageCarouselItemDto) obj;
        return epx.f(this.title, messagesMessageCarouselItemDto.title) && epx.f(this.action, messagesMessageCarouselItemDto.action) && epx.f(this.description, messagesMessageCarouselItemDto.description) && epx.f(this.photo, messagesMessageCarouselItemDto.photo) && epx.f(this.buttons, messagesMessageCarouselItemDto.buttons);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        MessagesKeyboardButtonPropertyCarouselActionDto messagesKeyboardButtonPropertyCarouselActionDto = this.action;
        int hashCode2 = (hashCode + (messagesKeyboardButtonPropertyCarouselActionDto == null ? 0 : messagesKeyboardButtonPropertyCarouselActionDto.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode4 = (hashCode3 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<MessagesKeyboardButtonDto> list = this.buttons;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageCarouselItemDto(title=");
        sb.append(this.title);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        MessagesKeyboardButtonPropertyCarouselActionDto messagesKeyboardButtonPropertyCarouselActionDto = this.action;
        if (messagesKeyboardButtonPropertyCarouselActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesKeyboardButtonPropertyCarouselActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeParcelable(this.photo, i);
        List<MessagesKeyboardButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesKeyboardButtonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MessagesMessageCarouselItemDto(String str, MessagesKeyboardButtonPropertyCarouselActionDto messagesKeyboardButtonPropertyCarouselActionDto, String str2, PhotosPhotoDto photosPhotoDto, List<MessagesKeyboardButtonDto> list) {
        this.title = str;
        this.action = messagesKeyboardButtonPropertyCarouselActionDto;
        this.description = str2;
        this.photo = photosPhotoDto;
        this.buttons = list;
    }

    public /* synthetic */ MessagesMessageCarouselItemDto(String str, MessagesKeyboardButtonPropertyCarouselActionDto messagesKeyboardButtonPropertyCarouselActionDto, String str2, PhotosPhotoDto photosPhotoDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : messagesKeyboardButtonPropertyCarouselActionDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : photosPhotoDto, (i & 16) != 0 ? null : list);
    }
}
