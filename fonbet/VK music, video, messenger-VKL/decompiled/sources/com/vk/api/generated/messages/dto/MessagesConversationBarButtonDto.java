package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesConversationBarButtonDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarButtonDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarButtonDto> CREATOR = new a();

    @pmi0("callback_data")
    private final String callbackData;

    @pmi0("hide_on_action")
    private final Boolean hideOnAction;

    @pmi0("icon_type")
    private final IconTypeDto iconType;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final LayoutDto layout;

    @pmi0("link")
    private final String link;

    @pmi0("popup")
    private final MessagesConversationBarButtonPopupDto popup;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConversationBarButtonDto.kt */
    public static final class IconTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconTypeDto[] $VALUES;
        public static final Parcelable.Creator<IconTypeDto> CREATOR;

        @pmi0("gift")
        public static final IconTypeDto GIFT;

        @pmi0("gift_outline")
        public static final IconTypeDto GIFT_OUTLINE;
        private final String value;

        /* compiled from: MessagesConversationBarButtonDto.kt */
        public static final class a implements Parcelable.Creator<IconTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final IconTypeDto createFromParcel(Parcel parcel) {
                return IconTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconTypeDto[] newArray(int i) {
                return new IconTypeDto[i];
            }
        }

        static {
            IconTypeDto iconTypeDto = new IconTypeDto("GIFT", 0, "gift");
            GIFT = iconTypeDto;
            IconTypeDto iconTypeDto2 = new IconTypeDto("GIFT_OUTLINE", 1, "gift_outline");
            GIFT_OUTLINE = iconTypeDto2;
            IconTypeDto[] iconTypeDtoArr = {iconTypeDto, iconTypeDto2};
            $VALUES = iconTypeDtoArr;
            $ENTRIES = new asp(iconTypeDtoArr);
            CREATOR = new a();
        }

        private IconTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconTypeDto valueOf(String str) {
            return (IconTypeDto) Enum.valueOf(IconTypeDto.class, str);
        }

        public static IconTypeDto[] values() {
            return (IconTypeDto[]) $VALUES.clone();
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
    /* compiled from: MessagesConversationBarButtonDto.kt */
    public static final class LayoutDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LayoutDto[] $VALUES;
        public static final Parcelable.Creator<LayoutDto> CREATOR;

        @pmi0("primary")
        public static final LayoutDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final LayoutDto SECONDARY;

        @pmi0("tertiary")
        public static final LayoutDto TERTIARY;
        private final String value;

        /* compiled from: MessagesConversationBarButtonDto.kt */
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
            LayoutDto layoutDto3 = new LayoutDto("TERTIARY", 2, "tertiary");
            TERTIARY = layoutDto3;
            LayoutDto[] layoutDtoArr = {layoutDto, layoutDto2, layoutDto3};
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
    /* compiled from: MessagesConversationBarButtonDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("destructive")
        public static final StyleDto DESTRUCTIVE;

        @pmi0("regular")
        public static final StyleDto REGULAR;
        private final String value;

        /* compiled from: MessagesConversationBarButtonDto.kt */
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
            StyleDto styleDto = new StyleDto("REGULAR", 0, "regular");
            REGULAR = styleDto;
            StyleDto styleDto2 = new StyleDto("DESTRUCTIVE", 1, "destructive");
            DESTRUCTIVE = styleDto2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConversationBarButtonDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("antispam")
        public static final TypeDto ANTISPAM;

        @pmi0("business_notify")
        public static final TypeDto BUSINESS_NOTIFY;

        @pmi0("callback")
        public static final TypeDto CALLBACK;

        @pmi0("callback_data")
        public static final TypeDto CALLBACK_DATA;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("edu_account_login")
        public static final TypeDto EDU_ACCOUNT_LOGIN;

        @pmi0("gifts_link")
        public static final TypeDto GIFTS_LINK;

        @pmi0("hide_banner")
        public static final TypeDto HIDE_BANNER;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("reject_mr")
        public static final TypeDto REJECT_MR;

        @pmi0("spam")
        public static final TypeDto SPAM;
        private final String value;

        /* compiled from: MessagesConversationBarButtonDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("LINK", 0, "link");
            LINK = typeDto;
            TypeDto typeDto2 = new TypeDto("GIFTS_LINK", 1, "gifts_link");
            GIFTS_LINK = typeDto2;
            TypeDto typeDto3 = new TypeDto("CALLBACK", 2, "callback");
            CALLBACK = typeDto3;
            TypeDto typeDto4 = new TypeDto("CALLBACK_DATA", 3, "callback_data");
            CALLBACK_DATA = typeDto4;
            TypeDto typeDto5 = new TypeDto("EDU_ACCOUNT_LOGIN", 4, "edu_account_login");
            EDU_ACCOUNT_LOGIN = typeDto5;
            TypeDto typeDto6 = new TypeDto("BUSINESS_NOTIFY", 5, "business_notify");
            BUSINESS_NOTIFY = typeDto6;
            TypeDto typeDto7 = new TypeDto("SPAM", 6, "spam");
            SPAM = typeDto7;
            TypeDto typeDto8 = new TypeDto("ANTISPAM", 7, "antispam");
            ANTISPAM = typeDto8;
            TypeDto typeDto9 = new TypeDto("HIDE_BANNER", 8, "hide_banner");
            HIDE_BANNER = typeDto9;
            TypeDto typeDto10 = new TypeDto("REJECT_MR", 9, "reject_mr");
            REJECT_MR = typeDto10;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: MessagesConversationBarButtonDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarButtonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            LayoutDto createFromParcel = LayoutDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            TypeDto createFromParcel2 = TypeDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            IconTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : IconTypeDto.CREATOR.createFromParcel(parcel);
            StyleDto createFromParcel4 = parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationBarButtonDto(createFromParcel, readString, createFromParcel2, readString2, createFromParcel3, createFromParcel4, readString3, valueOf, parcel.readInt() == 0 ? null : MessagesConversationBarButtonPopupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarButtonDto[] newArray(int i) {
            return new MessagesConversationBarButtonDto[i];
        }
    }

    public MessagesConversationBarButtonDto(LayoutDto layoutDto, String str, TypeDto typeDto, String str2, IconTypeDto iconTypeDto, StyleDto styleDto, String str3, Boolean bool, MessagesConversationBarButtonPopupDto messagesConversationBarButtonPopupDto) {
        this.layout = layoutDto;
        this.text = str;
        this.type = typeDto;
        this.callbackData = str2;
        this.iconType = iconTypeDto;
        this.style = styleDto;
        this.link = str3;
        this.hideOnAction = bool;
        this.popup = messagesConversationBarButtonPopupDto;
    }

    public final String d() {
        return this.callbackData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hideOnAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBarButtonDto)) {
            return false;
        }
        MessagesConversationBarButtonDto messagesConversationBarButtonDto = (MessagesConversationBarButtonDto) obj;
        return this.layout == messagesConversationBarButtonDto.layout && epx.f(this.text, messagesConversationBarButtonDto.text) && this.type == messagesConversationBarButtonDto.type && epx.f(this.callbackData, messagesConversationBarButtonDto.callbackData) && this.iconType == messagesConversationBarButtonDto.iconType && this.style == messagesConversationBarButtonDto.style && epx.f(this.link, messagesConversationBarButtonDto.link) && epx.f(this.hideOnAction, messagesConversationBarButtonDto.hideOnAction) && epx.f(this.popup, messagesConversationBarButtonDto.popup);
    }

    public final IconTypeDto f() {
        return this.iconType;
    }

    public final LayoutDto g() {
        return this.layout;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.layout.hashCode() * 31, 31, this.text)) * 31;
        String str = this.callbackData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconTypeDto iconTypeDto = this.iconType;
        int hashCode3 = (hashCode2 + (iconTypeDto == null ? 0 : iconTypeDto.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode4 = (hashCode3 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        String str2 = this.link;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hideOnAction;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesConversationBarButtonPopupDto messagesConversationBarButtonPopupDto = this.popup;
        return hashCode6 + (messagesConversationBarButtonPopupDto != null ? messagesConversationBarButtonPopupDto.hashCode() : 0);
    }

    public final String i() {
        return this.link;
    }

    public final MessagesConversationBarButtonPopupDto j() {
        return this.popup;
    }

    public final StyleDto k() {
        return this.style;
    }

    public final String l() {
        return this.text;
    }

    public final TypeDto n() {
        return this.type;
    }

    public final String toString() {
        return "MessagesConversationBarButtonDto(layout=" + this.layout + ", text=" + this.text + ", type=" + this.type + ", callbackData=" + this.callbackData + ", iconType=" + this.iconType + ", style=" + this.style + ", link=" + this.link + ", hideOnAction=" + this.hideOnAction + ", popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.layout.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.callbackData);
        IconTypeDto iconTypeDto = this.iconType;
        if (iconTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconTypeDto.writeToParcel(parcel, i);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.link);
        Boolean bool = this.hideOnAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MessagesConversationBarButtonPopupDto messagesConversationBarButtonPopupDto = this.popup;
        if (messagesConversationBarButtonPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationBarButtonPopupDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesConversationBarButtonDto(LayoutDto layoutDto, String str, TypeDto typeDto, String str2, IconTypeDto iconTypeDto, StyleDto styleDto, String str3, Boolean bool, MessagesConversationBarButtonPopupDto messagesConversationBarButtonPopupDto, int i, zcl zclVar) {
        this(layoutDto, str, typeDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : iconTypeDto, (i & 32) != 0 ? null : styleDto, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : messagesConversationBarButtonPopupDto);
    }
}
