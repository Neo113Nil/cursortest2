package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesConversationBarDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarDto> CREATOR = new a();

    @pmi0(L2.g)
    private final MessagesConversationBarBackgroundDto background;

    @pmi0("buttons")
    private final List<MessagesConversationBarButtonDto> buttons;

    @pmi0("can_hide")
    private final Boolean canHide;

    @pmi0("card_info")
    private final MessagesConversationBarCardInfoDto cardInfo;

    @pmi0("expired_timestamp")
    private final Integer expiredTimestamp;

    @pmi0("icon")
    private final String icon;

    @pmi0("icon_lego")
    private final String iconLego;

    @pmi0("name")
    private final String name;

    @pmi0("payload")
    private final MessagesConversationBarPayloadDto payload;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesConversationBarDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            MessagesConversationBarCardInfoDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConversationBarCardInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesConversationBarButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            return new MessagesConversationBarDto(readString, readString2, createFromParcel, arrayList, readString3, readString4, readString5, readString6, valueOf, (MessagesConversationBarPayloadDto) parcel.readParcelable(MessagesConversationBarDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesConversationBarBackgroundDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarDto[] newArray(int i) {
            return new MessagesConversationBarDto[i];
        }
    }

    public MessagesConversationBarDto(String str, String str2, MessagesConversationBarCardInfoDto messagesConversationBarCardInfoDto, List<MessagesConversationBarButtonDto> list, String str3, String str4, String str5, String str6, Boolean bool, MessagesConversationBarPayloadDto messagesConversationBarPayloadDto, MessagesConversationBarBackgroundDto messagesConversationBarBackgroundDto, Integer num) {
        this.name = str;
        this.text = str2;
        this.cardInfo = messagesConversationBarCardInfoDto;
        this.buttons = list;
        this.icon = str3;
        this.iconLego = str4;
        this.title = str5;
        this.style = str6;
        this.canHide = bool;
        this.payload = messagesConversationBarPayloadDto;
        this.background = messagesConversationBarBackgroundDto;
        this.expiredTimestamp = num;
    }

    public final MessagesConversationBarBackgroundDto d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesConversationBarButtonDto> e() {
        return this.buttons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBarDto)) {
            return false;
        }
        MessagesConversationBarDto messagesConversationBarDto = (MessagesConversationBarDto) obj;
        return epx.f(this.name, messagesConversationBarDto.name) && epx.f(this.text, messagesConversationBarDto.text) && epx.f(this.cardInfo, messagesConversationBarDto.cardInfo) && epx.f(this.buttons, messagesConversationBarDto.buttons) && epx.f(this.icon, messagesConversationBarDto.icon) && epx.f(this.iconLego, messagesConversationBarDto.iconLego) && epx.f(this.title, messagesConversationBarDto.title) && epx.f(this.style, messagesConversationBarDto.style) && epx.f(this.canHide, messagesConversationBarDto.canHide) && epx.f(this.payload, messagesConversationBarDto.payload) && epx.f(this.background, messagesConversationBarDto.background) && epx.f(this.expiredTimestamp, messagesConversationBarDto.expiredTimestamp);
    }

    public final Boolean f() {
        return this.canHide;
    }

    public final Integer g() {
        return this.expiredTimestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.name.hashCode() * 31, 31, this.text);
        MessagesConversationBarCardInfoDto messagesConversationBarCardInfoDto = this.cardInfo;
        int hashCode = (a2 + (messagesConversationBarCardInfoDto == null ? 0 : messagesConversationBarCardInfoDto.hashCode())) * 31;
        List<MessagesConversationBarButtonDto> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.icon;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconLego;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.style;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.canHide;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesConversationBarPayloadDto messagesConversationBarPayloadDto = this.payload;
        int hashCode8 = (hashCode7 + (messagesConversationBarPayloadDto == null ? 0 : messagesConversationBarPayloadDto.hashCode())) * 31;
        MessagesConversationBarBackgroundDto messagesConversationBarBackgroundDto = this.background;
        int hashCode9 = (hashCode8 + (messagesConversationBarBackgroundDto == null ? 0 : messagesConversationBarBackgroundDto.hashCode())) * 31;
        Integer num = this.expiredTimestamp;
        return hashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final String i() {
        return this.icon;
    }

    public final String j() {
        return this.iconLego;
    }

    public final String k() {
        return this.name;
    }

    public final MessagesConversationBarPayloadDto l() {
        return this.payload;
    }

    public final String n() {
        return this.style;
    }

    public final String o() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationBarDto(name=");
        sb.append(this.name);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", cardInfo=");
        sb.append(this.cardInfo);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconLego=");
        sb.append(this.iconLego);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", canHide=");
        sb.append(this.canHide);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", expiredTimestamp=");
        return uqi.b(sb, this.expiredTimestamp, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        MessagesConversationBarCardInfoDto messagesConversationBarCardInfoDto = this.cardInfo;
        if (messagesConversationBarCardInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationBarCardInfoDto.writeToParcel(parcel, i);
        }
        List<MessagesConversationBarButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesConversationBarButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.icon);
        parcel.writeString(this.iconLego);
        parcel.writeString(this.title);
        parcel.writeString(this.style);
        Boolean bool = this.canHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.payload, i);
        MessagesConversationBarBackgroundDto messagesConversationBarBackgroundDto = this.background;
        if (messagesConversationBarBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationBarBackgroundDto.writeToParcel(parcel, i);
        }
        Integer num = this.expiredTimestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesConversationBarDto(String str, String str2, MessagesConversationBarCardInfoDto messagesConversationBarCardInfoDto, List list, String str3, String str4, String str5, String str6, Boolean bool, MessagesConversationBarPayloadDto messagesConversationBarPayloadDto, MessagesConversationBarBackgroundDto messagesConversationBarBackgroundDto, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : messagesConversationBarCardInfoDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : messagesConversationBarPayloadDto, (i & 1024) != 0 ? null : messagesConversationBarBackgroundDto, (i & 2048) != 0 ? null : num);
    }
}
