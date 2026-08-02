package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesConversationCardButtonDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationCardButtonDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationCardButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final LayoutDto layout;

    @pmi0("miniapp_id")
    private final Integer miniappId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final MessagesConversationCardButtonTypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConversationCardButtonDto.kt */
    public static final class LayoutDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LayoutDto[] $VALUES;
        public static final Parcelable.Creator<LayoutDto> CREATOR;

        @pmi0("primary")
        public static final LayoutDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final LayoutDto SECONDARY;
        private final String value;

        /* compiled from: MessagesConversationCardButtonDto.kt */
        public static final class a implements Parcelable.Creator<LayoutDto> {
            @Override // android.os.Parcelable.Creator
            public final LayoutDto createFromParcel(Parcel parcel) {
                return LayoutDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutDto[] newArray(int i) {
                return new LayoutDto[i];
            }
        }

        static {
            LayoutDto layoutDto = new LayoutDto("PRIMARY", 0, "primary");
            PRIMARY = layoutDto;
            LayoutDto layoutDto2 = new LayoutDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = layoutDto2;
            LayoutDto[] layoutDtoArr = {layoutDto, layoutDto2};
            $VALUES = layoutDtoArr;
            $ENTRIES = new asp(layoutDtoArr);
            CREATOR = new a();
        }

        private LayoutDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LayoutDto valueOf(String str) {
            return (LayoutDto) Enum.valueOf(LayoutDto.class, str);
        }

        public static LayoutDto[] values() {
            return (LayoutDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConversationCardButtonDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("destructive")
        public static final StyleDto DESTRUCTIVE;

        @pmi0("regular")
        public static final StyleDto REGULAR;
        private final String value;

        /* compiled from: MessagesConversationCardButtonDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("DESTRUCTIVE", 0, "destructive");
            DESTRUCTIVE = styleDto;
            StyleDto styleDto2 = new StyleDto("REGULAR", 1, "regular");
            REGULAR = styleDto2;
            StyleDto[] styleDtoArr = {styleDto, styleDto2};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MessagesConversationCardButtonDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationCardButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardButtonDto createFromParcel(Parcel parcel) {
            return new MessagesConversationCardButtonDto(LayoutDto.CREATOR.createFromParcel(parcel), parcel.readString(), MessagesConversationCardButtonTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (BaseLinkButtonActionDto) parcel.readParcelable(MessagesConversationCardButtonDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardButtonDto[] newArray(int i) {
            return new MessagesConversationCardButtonDto[i];
        }
    }

    public MessagesConversationCardButtonDto(LayoutDto layoutDto, String str, MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto, StyleDto styleDto, Integer num, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.layout = layoutDto;
        this.text = str;
        this.type = messagesConversationCardButtonTypeDto;
        this.style = styleDto;
        this.miniappId = num;
        this.action = baseLinkButtonActionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationCardButtonDto)) {
            return false;
        }
        MessagesConversationCardButtonDto messagesConversationCardButtonDto = (MessagesConversationCardButtonDto) obj;
        return this.layout == messagesConversationCardButtonDto.layout && epx.f(this.text, messagesConversationCardButtonDto.text) && this.type == messagesConversationCardButtonDto.type && this.style == messagesConversationCardButtonDto.style && epx.f(this.miniappId, messagesConversationCardButtonDto.miniappId) && epx.f(this.action, messagesConversationCardButtonDto.action);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.layout.hashCode() * 31, 31, this.text)) * 31;
        StyleDto styleDto = this.style;
        int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        Integer num = this.miniappId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        return hashCode3 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesConversationCardButtonDto(layout=" + this.layout + ", text=" + this.text + ", type=" + this.type + ", style=" + this.style + ", miniappId=" + this.miniappId + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.layout.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        this.type.writeToParcel(parcel, i);
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        Integer num = this.miniappId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ MessagesConversationCardButtonDto(LayoutDto layoutDto, String str, MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto, StyleDto styleDto, Integer num, BaseLinkButtonActionDto baseLinkButtonActionDto, int i, zcl zclVar) {
        this(layoutDto, str, messagesConversationCardButtonTypeDto, (i & 8) != 0 ? null : styleDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : baseLinkButtonActionDto);
    }
}
