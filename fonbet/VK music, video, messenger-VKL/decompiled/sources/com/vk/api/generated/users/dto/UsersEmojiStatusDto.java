package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.photos.dto.PhotosImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UsersEmojiStatusDto.kt */
/* loaded from: classes15.dex */
public final class UsersEmojiStatusDto implements Parcelable {
    public static final Parcelable.Creator<UsersEmojiStatusDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("emoji_id")
    private final int emojiId;

    @pmi0("event_name")
    private final String eventName;

    @pmi0("image")
    private final List<PhotosImageDto> image;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: UsersEmojiStatusDto.kt */
    public static final class a implements Parcelable.Creator<UsersEmojiStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersEmojiStatusDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PhotosImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new UsersEmojiStatusDto(readInt, readString, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UsersEmojiStatusDto[] newArray(int i) {
            return new UsersEmojiStatusDto[i];
        }
    }

    public UsersEmojiStatusDto(int i, String str, List<PhotosImageDto> list, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto) {
        this.emojiId = i;
        this.eventName = str;
        this.image = list;
        this.title = str2;
        this.text = str3;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.emojiId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersEmojiStatusDto)) {
            return false;
        }
        UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) obj;
        return this.emojiId == usersEmojiStatusDto.emojiId && epx.f(this.eventName, usersEmojiStatusDto.eventName) && epx.f(this.image, usersEmojiStatusDto.image) && epx.f(this.title, usersEmojiStatusDto.title) && epx.f(this.text, usersEmojiStatusDto.text) && epx.f(this.button, usersEmojiStatusDto.button);
    }

    public final String f() {
        return this.eventName;
    }

    public final List<PhotosImageDto> g() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(urd0.a(Integer.hashCode(this.emojiId) * 31, 31, this.eventName), 31, this.image), 31, this.title);
        String str = this.text;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String i() {
        return this.text;
    }

    public final String toString() {
        return "UsersEmojiStatusDto(emojiId=" + this.emojiId + ", eventName=" + this.eventName + ", image=" + this.image + ", title=" + this.title + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.emojiId);
        parcel.writeString(this.eventName);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            ((PhotosImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ UsersEmojiStatusDto(int i, String str, List list, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, int i2, zcl zclVar) {
        this(i, str, list, str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : baseLinkButtonDto);
    }
}
