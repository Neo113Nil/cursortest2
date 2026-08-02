package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationBarBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarBackgroundDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("fill_colors")
    private final List<MessagesConversationBarBackgroundFillColorDto> fillColors;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("light")
    private final String light;

    /* compiled from: MessagesConversationBarBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarBackgroundDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MessagesConversationBarBackgroundDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MessagesConversationBarBackgroundFillColorDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MessagesConversationBarBackgroundDto(readString, readString2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarBackgroundDto[] newArray(int i) {
            return new MessagesConversationBarBackgroundDto[i];
        }
    }

    public MessagesConversationBarBackgroundDto(String str, String str2, List<BaseImageDto> list, List<MessagesConversationBarBackgroundFillColorDto> list2) {
        this.light = str;
        this.dark = str2;
        this.images = list;
        this.fillColors = list2;
    }

    public final String d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesConversationBarBackgroundFillColorDto> e() {
        return this.fillColors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBarBackgroundDto)) {
            return false;
        }
        MessagesConversationBarBackgroundDto messagesConversationBarBackgroundDto = (MessagesConversationBarBackgroundDto) obj;
        return epx.f(this.light, messagesConversationBarBackgroundDto.light) && epx.f(this.dark, messagesConversationBarBackgroundDto.dark) && epx.f(this.images, messagesConversationBarBackgroundDto.images) && epx.f(this.fillColors, messagesConversationBarBackgroundDto.fillColors);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final String g() {
        return this.light;
    }

    public final int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        String str = this.dark;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesConversationBarBackgroundFillColorDto> list2 = this.fillColors;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationBarBackgroundDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        sb.append(this.dark);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", fillColors=");
        return ms9.a(')', sb, this.fillColors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<MessagesConversationBarBackgroundFillColorDto> list2 = this.fillColors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((MessagesConversationBarBackgroundFillColorDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesConversationBarBackgroundDto(String str, String str2, List list, List list2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
