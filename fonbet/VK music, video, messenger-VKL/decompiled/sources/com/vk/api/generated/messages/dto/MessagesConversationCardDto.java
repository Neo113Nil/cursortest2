package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationCardDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationCardDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationCardDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<MessagesConversationCardButtonDto> buttons;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final String image;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final MessagesConversationCardTypeDto type;

    /* compiled from: MessagesConversationCardDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationCardDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            MessagesConversationCardTypeDto createFromParcel = MessagesConversationCardTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesConversationCardButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesConversationCardDto(createFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardDto[] newArray(int i) {
            return new MessagesConversationCardDto[i];
        }
    }

    public MessagesConversationCardDto(MessagesConversationCardTypeDto messagesConversationCardTypeDto, List<MessagesConversationCardButtonDto> list, String str, String str2, String str3, String str4, String str5) {
        this.type = messagesConversationCardTypeDto;
        this.buttons = list;
        this.image = str;
        this.title = str2;
        this.subtitle = str3;
        this.content = str4;
        this.id = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationCardDto)) {
            return false;
        }
        MessagesConversationCardDto messagesConversationCardDto = (MessagesConversationCardDto) obj;
        return this.type == messagesConversationCardDto.type && epx.f(this.buttons, messagesConversationCardDto.buttons) && epx.f(this.image, messagesConversationCardDto.image) && epx.f(this.title, messagesConversationCardDto.title) && epx.f(this.subtitle, messagesConversationCardDto.subtitle) && epx.f(this.content, messagesConversationCardDto.content) && epx.f(this.id, messagesConversationCardDto.id);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<MessagesConversationCardButtonDto> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.image;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationCardDto(type=");
        sb.append(this.type);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        List<MessagesConversationCardButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesConversationCardButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.image);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.content);
        parcel.writeString(this.id);
    }

    public /* synthetic */ MessagesConversationCardDto(MessagesConversationCardTypeDto messagesConversationCardTypeDto, List list, String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(messagesConversationCardTypeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
