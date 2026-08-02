package com.vk.im.engine.models;

import android.os.Parcel;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.lhg;
import xsna.ms9;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: InfoBar.kt */
/* loaded from: classes2.dex */
public final class InfoBar implements Serializer.StreamParcelable {
    public static final Serializer.c<InfoBar> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final boolean i;
    public final List<Button> j;
    public final boolean k;
    public final Background l;
    public final Payload m;
    public final Integer n;

    /* compiled from: InfoBar.kt */
    public static final class Background extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Background> CREATOR = new a();
        public final String b;
        public final String c;
        public final Image d;
        public final List<FillColors> e;

        /* compiled from: InfoBar.kt */
        public static final class FillColors extends Serializer.StreamParcelableAdapter {
            public static final Serializer.c<FillColors> CREATOR = new a();
            public final String b;
            public final Theme c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<FillColors> {
                @Override // com.vk.core.serialize.Serializer.c
                public final FillColors a(Serializer serializer) {
                    return new FillColors(serializer, (zcl) null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FillColors[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FillColors() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                Theme theme = this.c;
                serializer.j0(theme != null ? theme.h() : null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FillColors)) {
                    return false;
                }
                FillColors fillColors = (FillColors) obj;
                return epx.f(this.b, fillColors.b) && this.c == fillColors.c;
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Theme theme = this.c;
                return hashCode + (theme != null ? theme.hashCode() : 0);
            }

            public final String toString() {
                return "FillColors(color=" + this.b + ", theme=" + this.c + ')';
            }

            public /* synthetic */ FillColors(String str, Theme theme, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : theme);
            }

            public FillColors(String str, Theme theme) {
                this.b = str;
                this.c = theme;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public FillColors(Serializer serializer, zcl zclVar) {
                this(r3, Theme.a.a(r2));
                String H = serializer.H();
                Theme.a aVar = Theme.Companion;
                String H2 = serializer.H();
                aVar.getClass();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Background> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Background a(Serializer serializer) {
                return new Background(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Background[i];
            }
        }

        public Background() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.e0(this.d);
            serializer.f0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background)) {
                return false;
            }
            Background background = (Background) obj;
            return epx.f(this.b, background.b) && epx.f(this.c, background.c) && epx.f(this.d, background.d) && epx.f(this.e, background.e);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.d;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            List<FillColors> list = this.e;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Background(backgroundImageLight=");
            sb.append(this.b);
            sb.append(", backgroundImageDark=");
            sb.append(this.c);
            sb.append(", backgroundImage=");
            sb.append(this.d);
            sb.append(", fillColors=");
            return ms9.a(')', sb, this.e);
        }

        public /* synthetic */ Background(String str, String str2, Image image, List list, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : list);
        }

        public Background(String str, String str2, Image image, List<FillColors> list) {
            this.b = str;
            this.c = str2;
            this.d = image;
            this.e = list;
        }

        public Background(Serializer serializer, zcl zclVar) {
            this(serializer.H(), serializer.H(), (Image) serializer.A(Image.class.getClassLoader()), serializer.B(FillColors.class.getClassLoader()));
        }
    }

    /* compiled from: InfoBar.kt */
    public static final class Button extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Button> CREATOR = new a();
        public final String b;
        public final ButtonLayout c;
        public final ButtonType d;
        public final ButtonStyle e;
        public final String f;
        public final String g;
        public final boolean h;
        public final PopUp i;
        public final ButtonIcon j;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Button> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Button a(Serializer serializer) {
                return new Button(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button() {
            this(null, null, null, null, null, null, false, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c.h());
            serializer.S(this.d.h());
            serializer.j0(this.f);
            serializer.j0(this.g);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
            serializer.S(this.e.h());
            serializer.e0(this.i);
            serializer.S(this.j.h());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return epx.f(this.b, button.b) && this.c == button.c && this.d == button.d && this.e == button.e && epx.f(this.f, button.f) && epx.f(this.g, button.g) && this.h == button.h && epx.f(this.i, button.i) && this.j == button.j;
        }

        public final int hashCode() {
            int b = qoy.b(urd0.a(urd0.a((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
            PopUp popUp = this.i;
            return this.j.hashCode() + ((b + (popUp == null ? 0 : popUp.hashCode())) * 31);
        }

        public final String toString() {
            return "Button(text=" + this.b + ", layout=" + this.c + ", type=" + this.d + ", style=" + this.e + ", link=" + this.f + ", callbackData=" + this.g + ", hideBarOnClick=" + this.h + ", popUp=" + this.i + ", icon=" + this.j + ')';
        }

        public /* synthetic */ Button(String str, ButtonLayout buttonLayout, ButtonType buttonType, ButtonStyle buttonStyle, String str2, String str3, boolean z, PopUp popUp, ButtonIcon buttonIcon, int i, zcl zclVar) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ButtonLayout.PRIMARY : buttonLayout, (i & 4) != 0 ? ButtonType.LINK : buttonType, (i & 8) != 0 ? ButtonStyle.DEFAULT : buttonStyle, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : popUp, (i & 256) != 0 ? ButtonIcon.UNKNOWN : buttonIcon);
        }

        public Button(String str, ButtonLayout buttonLayout, ButtonType buttonType, ButtonStyle buttonStyle, String str2, String str3, boolean z, PopUp popUp, ButtonIcon buttonIcon) {
            this.b = str;
            this.c = buttonLayout;
            this.d = buttonType;
            this.e = buttonStyle;
            this.f = str2;
            this.g = str3;
            this.h = z;
            this.i = popUp;
            this.j = buttonIcon;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Button(Serializer serializer, zcl zclVar) {
            this(r1, r2, r9, r13, r5, r6, r7, r0, r3 == null ? ButtonIcon.UNKNOWN : r3);
            ButtonLayout buttonLayout;
            ButtonType buttonType;
            ButtonStyle buttonStyle;
            String H = serializer.H();
            ButtonLayout.a aVar = ButtonLayout.Companion;
            int u = serializer.u();
            aVar.getClass();
            ButtonLayout[] values = ButtonLayout.values();
            int length = values.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    buttonLayout = null;
                    break;
                }
                buttonLayout = values[i2];
                if (buttonLayout.h() == u) {
                    break;
                } else {
                    i2++;
                }
            }
            if (buttonLayout != null) {
                ButtonType.a aVar2 = ButtonType.Companion;
                int u2 = serializer.u();
                aVar2.getClass();
                ButtonType[] values2 = ButtonType.values();
                int length2 = values2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        buttonType = null;
                        break;
                    }
                    buttonType = values2[i3];
                    if (buttonType.h() == u2) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (buttonType != null) {
                    String H2 = serializer.H();
                    String H3 = serializer.H();
                    ButtonIcon buttonIcon = null;
                    ButtonLayout buttonLayout2 = buttonLayout;
                    boolean m = serializer.m();
                    ButtonStyle.a aVar3 = ButtonStyle.Companion;
                    int u3 = serializer.u();
                    aVar3.getClass();
                    ButtonStyle[] values3 = ButtonStyle.values();
                    int length3 = values3.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length3) {
                            buttonStyle = null;
                            break;
                        }
                        buttonStyle = values3[i4];
                        if (buttonStyle.h() == u3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (buttonStyle != null) {
                        PopUp popUp = (PopUp) serializer.A(PopUp.class.getClassLoader());
                        ButtonIcon.a aVar4 = ButtonIcon.Companion;
                        int u4 = serializer.u();
                        aVar4.getClass();
                        ButtonIcon[] values4 = ButtonIcon.values();
                        int length4 = values4.length;
                        while (true) {
                            if (i >= length4) {
                                break;
                            }
                            ButtonIcon buttonIcon2 = values4[i];
                            if (buttonIcon2.h() == u4) {
                                buttonIcon = buttonIcon2;
                                break;
                            }
                            i++;
                        }
                        return;
                    }
                    throw new IllegalArgumentException(lhg.a(u3, "Unknown id="));
                }
                throw new IllegalArgumentException(lhg.a(u2, "Unknown id="));
            }
            throw new IllegalArgumentException(lhg.a(u, "Unknown id="));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoBar.kt */
    public static final class ButtonIcon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonIcon[] $VALUES;
        public static final a Companion;
        public static final ButtonIcon GIFT;
        public static final ButtonIcon GIFT_OUTLINE;
        public static final ButtonIcon UNKNOWN;
        private final int id;

        /* compiled from: InfoBar.kt */
        public static final class a {
        }

        static {
            ButtonIcon buttonIcon = new ButtonIcon(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = buttonIcon;
            ButtonIcon buttonIcon2 = new ButtonIcon("GIFT", 1, 1);
            GIFT = buttonIcon2;
            ButtonIcon buttonIcon3 = new ButtonIcon("GIFT_OUTLINE", 2, 2);
            GIFT_OUTLINE = buttonIcon3;
            ButtonIcon[] buttonIconArr = {buttonIcon, buttonIcon2, buttonIcon3};
            $VALUES = buttonIconArr;
            $ENTRIES = new asp(buttonIconArr);
            Companion = new a();
        }

        public ButtonIcon(String str, int i, int i2) {
            this.id = i2;
        }

        public static ButtonIcon valueOf(String str) {
            return (ButtonIcon) Enum.valueOf(ButtonIcon.class, str);
        }

        public static ButtonIcon[] values() {
            return (ButtonIcon[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoBar.kt */
    public static final class ButtonLayout {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonLayout[] $VALUES;
        public static final a Companion;
        public static final ButtonLayout PRIMARY;
        public static final ButtonLayout SECONDARY;
        public static final ButtonLayout TERTIARY;
        private final int id;

        /* compiled from: InfoBar.kt */
        public static final class a {
        }

        static {
            ButtonLayout buttonLayout = new ButtonLayout("PRIMARY", 0, 0);
            PRIMARY = buttonLayout;
            ButtonLayout buttonLayout2 = new ButtonLayout("SECONDARY", 1, 1);
            SECONDARY = buttonLayout2;
            ButtonLayout buttonLayout3 = new ButtonLayout("TERTIARY", 2, 2);
            TERTIARY = buttonLayout3;
            ButtonLayout[] buttonLayoutArr = {buttonLayout, buttonLayout2, buttonLayout3};
            $VALUES = buttonLayoutArr;
            $ENTRIES = new asp(buttonLayoutArr);
            Companion = new a();
        }

        public ButtonLayout(String str, int i, int i2) {
            this.id = i2;
        }

        public static ButtonLayout valueOf(String str) {
            return (ButtonLayout) Enum.valueOf(ButtonLayout.class, str);
        }

        public static ButtonLayout[] values() {
            return (ButtonLayout[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoBar.kt */
    public static final class ButtonStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final a Companion;
        public static final ButtonStyle DEFAULT;
        public static final ButtonStyle DESTRUCTIVE;
        private final int id;

        /* compiled from: InfoBar.kt */
        public static final class a {
        }

        static {
            ButtonStyle buttonStyle = new ButtonStyle("DEFAULT", 0, 0);
            DEFAULT = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("DESTRUCTIVE", 1, 1);
            DESTRUCTIVE = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            $VALUES = buttonStyleArr;
            $ENTRIES = new asp(buttonStyleArr);
            Companion = new a();
        }

        public ButtonStyle(String str, int i, int i2) {
            this.id = i2;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoBar.kt */
    public static final class ButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType ANTISPAM;
        public static final ButtonType CALLBACK;
        public static final ButtonType CALLS_PRIVACY;
        public static final a Companion;
        public static final ButtonType FRIEND_ADD;
        public static final ButtonType GIFTS_LINK;
        public static final ButtonType HIDE_BANNER;
        public static final ButtonType LINK;
        public static final ButtonType MESSAGE_REQUEST_DECLINE;
        public static final ButtonType OPEN_BUSINESS_NOTIFICATION_INFO;
        public static final ButtonType OPEN_CONNECT_EDU_CHATS;
        public static final ButtonType OPEN_EDU_AUTH;
        public static final ButtonType OPEN_MSG_PUSH_SETTINGS;
        public static final ButtonType POPUP;
        public static final ButtonType SPAM;
        public static final ButtonType SYNC_CONTACTS;
        public static final ButtonType UNKNOWN;
        private final int id;

        /* compiled from: InfoBar.kt */
        public static final class a {
        }

        static {
            ButtonType buttonType = new ButtonType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = buttonType;
            ButtonType buttonType2 = new ButtonType("LINK", 1, 1);
            LINK = buttonType2;
            ButtonType buttonType3 = new ButtonType("CALLBACK", 2, 2);
            CALLBACK = buttonType3;
            ButtonType buttonType4 = new ButtonType("GIFTS_LINK", 3, 3);
            GIFTS_LINK = buttonType4;
            ButtonType buttonType5 = new ButtonType("OPEN_MSG_PUSH_SETTINGS", 4, 4);
            OPEN_MSG_PUSH_SETTINGS = buttonType5;
            ButtonType buttonType6 = new ButtonType("SPAM", 5, 5);
            SPAM = buttonType6;
            ButtonType buttonType7 = new ButtonType("MESSAGE_REQUEST_DECLINE", 6, 6);
            MESSAGE_REQUEST_DECLINE = buttonType7;
            ButtonType buttonType8 = new ButtonType("SYNC_CONTACTS", 7, 7);
            SYNC_CONTACTS = buttonType8;
            ButtonType buttonType9 = new ButtonType("FRIEND_ADD", 8, 8);
            FRIEND_ADD = buttonType9;
            ButtonType buttonType10 = new ButtonType("OPEN_EDU_AUTH", 9, 9);
            OPEN_EDU_AUTH = buttonType10;
            ButtonType buttonType11 = new ButtonType("OPEN_BUSINESS_NOTIFICATION_INFO", 10, 10);
            OPEN_BUSINESS_NOTIFICATION_INFO = buttonType11;
            ButtonType buttonType12 = new ButtonType("ANTISPAM", 11, 11);
            ANTISPAM = buttonType12;
            ButtonType buttonType13 = new ButtonType("HIDE_BANNER", 12, 12);
            HIDE_BANNER = buttonType13;
            ButtonType buttonType14 = new ButtonType("OPEN_CONNECT_EDU_CHATS", 13, 13);
            OPEN_CONNECT_EDU_CHATS = buttonType14;
            ButtonType buttonType15 = new ButtonType("POPUP", 14, 14);
            POPUP = buttonType15;
            ButtonType buttonType16 = new ButtonType("CALLS_PRIVACY", 15, 15);
            CALLS_PRIVACY = buttonType16;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4, buttonType5, buttonType6, buttonType7, buttonType8, buttonType9, buttonType10, buttonType11, buttonType12, buttonType13, buttonType14, buttonType15, buttonType16};
            $VALUES = buttonTypeArr;
            $ENTRIES = new asp(buttonTypeArr);
            Companion = new a();
        }

        public ButtonType(String str, int i, int i2) {
            this.id = i2;
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* compiled from: InfoBar.kt */
    public static final class Image extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Image> CREATOR = new a();
        public final ImageList b;
        public final ImageList c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Image> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Image a(Serializer serializer) {
                return new Image(serializer, (zcl) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Image[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Image() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.e0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return epx.f(this.b, image.b) && epx.f(this.c, image.c);
        }

        public final int hashCode() {
            ImageList imageList = this.b;
            int hashCode = (imageList == null ? 0 : imageList.b.hashCode()) * 31;
            ImageList imageList2 = this.c;
            return hashCode + (imageList2 != null ? imageList2.b.hashCode() : 0);
        }

        public final String toString() {
            return "Image(light=" + this.b + ", dark=" + this.c + ')';
        }

        public /* synthetic */ Image(ImageList imageList, ImageList imageList2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : imageList, (i & 2) != 0 ? null : imageList2);
        }

        public Image(ImageList imageList, ImageList imageList2) {
            this.b = imageList;
            this.c = imageList2;
        }

        public Image(Serializer serializer, zcl zclVar) {
            this((ImageList) serializer.A(ImageList.class.getClassLoader()), (ImageList) serializer.A(ImageList.class.getClassLoader()));
        }
    }

    /* compiled from: InfoBar.kt */
    public static abstract class Payload extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Payload> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Payload> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Payload a(Serializer serializer) {
                String H = serializer.H();
                if (epx.f(H, "GiftsBirthdays")) {
                    return new GiftsBirthdays(serializer);
                }
                if (epx.f(H, "GiftsHolidays")) {
                    return new GiftsHolidays(serializer);
                }
                throw new IllegalArgumentException("Unknown InfoBar.Payload type");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Payload[i];
            }
        }

        public /* synthetic */ Payload(zcl zclVar) {
            this();
        }

        /* compiled from: InfoBar.kt */
        public static final class GiftsBirthdays extends Payload {
            public static final Serializer.c<GiftsBirthdays> CREATOR = new a();
            public final String b;
            public final List<User> c;
            public final boolean d;
            public final String e;
            public final List<UserId> f;
            public final InfoBarBirthdaysData g;
            public final Image h;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<GiftsBirthdays> {
                @Override // com.vk.core.serialize.Serializer.c
                public final GiftsBirthdays a(Serializer serializer) {
                    return new GiftsBirthdays(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GiftsBirthdays[i];
                }
            }

            public GiftsBirthdays(String str, List<User> list, boolean z, String str2, List<UserId> list2, InfoBarBirthdaysData infoBarBirthdaysData, Image image) {
                super(null);
                this.b = str;
                this.c = list;
                this.d = z;
                this.e = str2;
                this.f = list2;
                this.g = infoBarBirthdaysData;
                this.h = image;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.f0(this.c);
                serializer.L(this.d ? (byte) 1 : (byte) 0);
                serializer.j0(this.e);
                serializer.f0(this.f);
                serializer.e0(this.g);
                serializer.e0(this.h);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GiftsBirthdays)) {
                    return false;
                }
                GiftsBirthdays giftsBirthdays = (GiftsBirthdays) obj;
                return epx.f(this.b, giftsBirthdays.b) && epx.f(this.c, giftsBirthdays.c) && this.d == giftsBirthdays.d && epx.f(this.e, giftsBirthdays.e) && epx.f(this.f, giftsBirthdays.f) && epx.f(this.g, giftsBirthdays.g) && epx.f(this.h, giftsBirthdays.h);
            }

            public final int hashCode() {
                int a2 = fw3.a(urd0.a(qoy.b(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
                InfoBarBirthdaysData infoBarBirthdaysData = this.g;
                int hashCode = (a2 + (infoBarBirthdaysData == null ? 0 : infoBarBirthdaysData.hashCode())) * 31;
                Image image = this.h;
                return hashCode + (image != null ? image.hashCode() : 0);
            }

            public final String toString() {
                return "GiftsBirthdays(type=" + this.b + ", birthdayUsers=" + this.c + ", isTodayBirthday=" + this.d + ", ref=" + this.e + ", otherBirthdayUserIds=" + this.f + ", infoBarBirthdaysData=" + this.g + ", trailingImage=" + this.h + ')';
            }

            /* compiled from: InfoBar.kt */
            public static final class BirthdaysGroup extends Serializer.StreamParcelableAdapter {
                public static final Serializer.c<BirthdaysGroup> CREATOR = new a();
                public final String b;
                public final List<UserId> c;

                /* compiled from: Serializer.kt */
                public static final class a extends Serializer.c<BirthdaysGroup> {
                    @Override // com.vk.core.serialize.Serializer.c
                    public final BirthdaysGroup a(Serializer serializer) {
                        return new BirthdaysGroup(serializer, (zcl) null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new BirthdaysGroup[i];
                    }
                }

                public BirthdaysGroup(String str, List<UserId> list) {
                    this.b = str;
                    this.c = list;
                }

                @Override // com.vk.core.serialize.Serializer.StreamParcelable
                public final void O7(Serializer serializer) {
                    serializer.j0(this.b);
                    serializer.f0(this.c);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BirthdaysGroup)) {
                        return false;
                    }
                    BirthdaysGroup birthdaysGroup = (BirthdaysGroup) obj;
                    return epx.f(this.b, birthdaysGroup.b) && epx.f(this.c, birthdaysGroup.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("BirthdaysGroup(groupTitle=");
                    sb.append(this.b);
                    sb.append(", userIds=");
                    return ms9.a(')', sb, this.c);
                }

                public BirthdaysGroup(Serializer serializer, zcl zclVar) {
                    this(serializer.H(), serializer.B(UserId.class.getClassLoader()));
                }
            }

            /* compiled from: InfoBar.kt */
            public static final class InfoBarBirthdaysData extends Serializer.StreamParcelableAdapter {
                public static final Serializer.c<InfoBarBirthdaysData> CREATOR = new a();
                public final String b;
                public final String c;
                public final List<BirthdaysGroup> d;

                /* compiled from: Serializer.kt */
                public static final class a extends Serializer.c<InfoBarBirthdaysData> {
                    @Override // com.vk.core.serialize.Serializer.c
                    public final InfoBarBirthdaysData a(Serializer serializer) {
                        return new InfoBarBirthdaysData(serializer, null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new InfoBarBirthdaysData[i];
                    }
                }

                public InfoBarBirthdaysData(String str, String str2, List<BirthdaysGroup> list) {
                    this.b = str;
                    this.c = str2;
                    this.d = list;
                }

                @Override // com.vk.core.serialize.Serializer.StreamParcelable
                public final void O7(Serializer serializer) {
                    serializer.j0(this.b);
                    serializer.j0(this.c);
                    serializer.f0(this.d);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InfoBarBirthdaysData)) {
                        return false;
                    }
                    InfoBarBirthdaysData infoBarBirthdaysData = (InfoBarBirthdaysData) obj;
                    return epx.f(this.b, infoBarBirthdaysData.b) && epx.f(this.c, infoBarBirthdaysData.c) && epx.f(this.d, infoBarBirthdaysData.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("InfoBarBirthdaysData(modalTitle=");
                    sb.append(this.b);
                    sb.append(", modalSubtitle=");
                    sb.append(this.c);
                    sb.append(", birthdaysGroups=");
                    return ms9.a(')', sb, this.d);
                }

                public InfoBarBirthdaysData(Serializer serializer, zcl zclVar) {
                    this(serializer.H(), serializer.H(), serializer.B(UserId.class.getClassLoader()));
                }
            }

            /* compiled from: InfoBar.kt */
            public static final class User extends Serializer.StreamParcelableAdapter {
                public static final Serializer.c<User> CREATOR = new a();
                public final UserId b;
                public final String c;
                public final String d;
                public final String e;

                /* compiled from: Serializer.kt */
                public static final class a extends Serializer.c<User> {
                    @Override // com.vk.core.serialize.Serializer.c
                    public final User a(Serializer serializer) {
                        return new User(serializer, null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new User[i];
                    }
                }

                public User(UserId userId, String str, String str2, String str3) {
                    this.b = userId;
                    this.c = str;
                    this.d = str2;
                    this.e = str3;
                }

                @Override // com.vk.core.serialize.Serializer.StreamParcelable
                public final void O7(Serializer serializer) {
                    serializer.e0(this.b);
                    serializer.j0(this.c);
                    serializer.j0(this.d);
                    serializer.j0(this.e);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof User)) {
                        return false;
                    }
                    User user = (User) obj;
                    return epx.f(this.b, user.b) && epx.f(this.c, user.c) && epx.f(this.d, user.d) && epx.f(this.e, user.e);
                }

                public final int hashCode() {
                    int hashCode = Long.hashCode(this.b.b) * 31;
                    String str = this.c;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.d;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.e;
                    return hashCode3 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("User(id=");
                    sb.append(this.b);
                    sb.append(", firstName=");
                    sb.append(this.c);
                    sb.append(", lastName=");
                    sb.append(this.d);
                    sb.append(", avatar=");
                    return ho8.a(sb, this.e, ')');
                }

                public User(Serializer serializer, zcl zclVar) {
                    this((UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H());
                }
            }

            public GiftsBirthdays(Serializer serializer) {
                this(serializer.H(), serializer.B(User.class.getClassLoader()), serializer.m(), serializer.H(), serializer.B(UserId.class.getClassLoader()), (InfoBarBirthdaysData) serializer.A(InfoBarBirthdaysData.class.getClassLoader()), (Image) serializer.A(Image.class.getClassLoader()));
            }
        }

        public Payload() {
        }

        /* compiled from: InfoBar.kt */
        public static final class GiftsHolidays extends Payload {
            public static final Serializer.c<GiftsHolidays> CREATOR = new a();
            public final String b;
            public final Image c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<GiftsHolidays> {
                @Override // com.vk.core.serialize.Serializer.c
                public final GiftsHolidays a(Serializer serializer) {
                    return new GiftsHolidays(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GiftsHolidays[i];
                }
            }

            public GiftsHolidays(String str, Image image) {
                super(null);
                this.b = str;
                this.c = image;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.e0(this.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GiftsHolidays)) {
                    return false;
                }
                GiftsHolidays giftsHolidays = (GiftsHolidays) obj;
                return epx.f(this.b, giftsHolidays.b) && epx.f(this.c, giftsHolidays.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Image image = this.c;
                return hashCode + (image == null ? 0 : image.hashCode());
            }

            public final String toString() {
                return "GiftsHolidays(type=" + this.b + ", trailingImage=" + this.c + ')';
            }

            public GiftsHolidays(Serializer serializer) {
                this(serializer.H(), (Image) serializer.A(Image.class.getClassLoader()));
            }
        }

        /* compiled from: InfoBar.kt */
        public static final class MaxAd extends Payload {
            public static final Serializer.c<MaxAd> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;
            public final Integer e;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<MaxAd> {
                @Override // com.vk.core.serialize.Serializer.c
                public final MaxAd a(Serializer serializer) {
                    return new MaxAd(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MaxAd[i];
                }
            }

            public MaxAd(String str, String str2, String str3, Integer num) {
                super(null);
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = num;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
                serializer.V(this.e);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MaxAd)) {
                    return false;
                }
                MaxAd maxAd = (MaxAd) obj;
                return epx.f(this.b, maxAd.b) && epx.f(this.c, maxAd.c) && epx.f(this.d, maxAd.d) && epx.f(this.e, maxAd.e);
            }

            public final int hashCode() {
                int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
                Integer num = this.e;
                return a2 + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MaxAd(type=");
                sb.append(this.b);
                sb.append(", erid=");
                sb.append(this.c);
                sb.append(", advertiser=");
                sb.append(this.d);
                sb.append(", hideAfterViewsCount=");
                return uqi.b(sb, this.e, ')');
            }

            public MaxAd(Serializer serializer) {
                this(serializer.H(), serializer.H(), serializer.H(), serializer.v());
            }
        }
    }

    /* compiled from: InfoBar.kt */
    public static final class PopUp extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<PopUp> CREATOR = new a();
        public final Style b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PopUp> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PopUp a(Serializer serializer) {
                return new PopUp(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopUp[i];
            }
        }

        public PopUp(Style style, String str, String str2, String str3) {
            this.b = style;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b.h());
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopUp)) {
                return false;
            }
            PopUp popUp = (PopUp) obj;
            return this.b == popUp.b && epx.f(this.c, popUp.c) && epx.f(this.d, popUp.d) && epx.f(this.e, popUp.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PopUp(style=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", body=");
            sb.append(this.d);
            sb.append(", okButton=");
            return ho8.a(sb, this.e, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PopUp(Serializer serializer, zcl zclVar) {
            this(r3 == null ? Style.UNKNOWN : r3, serializer.H(), serializer.H(), serializer.H());
            Style style;
            Style.a aVar = Style.Companion;
            int u = serializer.u();
            aVar.getClass();
            Style[] values = Style.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    style = null;
                    break;
                }
                style = values[i];
                if (style.h() == u) {
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoBar.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style OUTAGE;
        public static final Style UNKNOWN;
        private final int id;

        /* compiled from: InfoBar.kt */
        public static final class a {
        }

        static {
            Style style = new Style(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = style;
            Style style2 = new Style("OUTAGE", 1, 1);
            OUTAGE = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, int i2) {
            this.id = i2;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoBar.kt */
    public static final class Theme {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;
        public static final a Companion;
        public static final Theme DARK;
        public static final Theme LIGHT;
        public static final Theme UNKNOWN;
        private final String themeName;

        /* compiled from: InfoBar.kt */
        public static final class a {
            public static Theme a(String str) {
                Theme theme;
                Theme[] values = Theme.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        theme = null;
                        break;
                    }
                    theme = values[i];
                    if (epx.f(theme.h(), str)) {
                        break;
                    }
                    i++;
                }
                return theme == null ? Theme.UNKNOWN : theme;
            }
        }

        static {
            Theme theme = new Theme(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
            UNKNOWN = theme;
            Theme theme2 = new Theme("LIGHT", 1, "light");
            LIGHT = theme2;
            Theme theme3 = new Theme("DARK", 2, "dark");
            DARK = theme3;
            Theme[] themeArr = {theme, theme2, theme3};
            $VALUES = themeArr;
            $ENTRIES = new asp(themeArr);
            Companion = new a();
        }

        public Theme(String str, int i, String str2) {
            this.themeName = str2;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }

        public final String h() {
            return this.themeName;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InfoBar> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InfoBar a(Serializer serializer) {
            return new InfoBar(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoBar[i];
        }
    }

    public InfoBar() {
        this(null, null, null, null, null, null, null, false, null, false, null, null, null, 8191, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.V(this.g);
        serializer.V(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.o0(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.e0(this.l);
        serializer.e0(this.m);
        serializer.V(this.n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoBar)) {
            return false;
        }
        InfoBar infoBar = (InfoBar) obj;
        return epx.f(this.b, infoBar.b) && epx.f(this.c, infoBar.c) && epx.f(this.d, infoBar.d) && epx.f(this.e, infoBar.e) && epx.f(this.f, infoBar.f) && epx.f(this.g, infoBar.g) && epx.f(this.h, infoBar.h) && this.i == infoBar.i && epx.f(this.j, infoBar.j) && this.k == infoBar.k && epx.f(this.l, infoBar.l) && epx.f(this.m, infoBar.m) && epx.f(this.n, infoBar.n);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int b = qoy.b(fw3.a(qoy.b((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        Background background = this.l;
        int hashCode2 = (b + (background == null ? 0 : background.hashCode())) * 31;
        Payload payload = this.m;
        int hashCode3 = (hashCode2 + (payload == null ? 0 : payload.hashCode())) * 31;
        Integer num3 = this.n;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoBar(name=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", iconLego=");
        sb.append(this.f);
        sb.append(", iconSize=");
        sb.append(this.g);
        sb.append(", iconTintColor=");
        sb.append(this.h);
        sb.append(", iconCentered=");
        sb.append(this.i);
        sb.append(", buttons=");
        sb.append(this.j);
        sb.append(", canHide=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(this.l);
        sb.append(", payload=");
        sb.append(this.m);
        sb.append(", expiredTimestamp=");
        return uqi.b(sb, this.n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public InfoBar(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z, List<Button> list, boolean z2, Background background, Payload payload, Integer num3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
        this.h = num2;
        this.i = z;
        this.j = list;
        this.k = z2;
        this.l = background;
        this.m = payload;
        this.n = num3;
    }

    public InfoBar(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z, List list, boolean z2, Background background, Payload payload, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? EmptyList.b : list, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? null : background, (i & 2048) != 0 ? null : payload, (i & 4096) != 0 ? null : num3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InfoBar(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r0 == null ? "" : r0, serializer.v(), serializer.v(), serializer.m(), serializer.j(Button.CREATOR), serializer.m(), (Background) serializer.A(Background.class.getClassLoader()), (Payload) serializer.A(Payload.class.getClassLoader()), serializer.v());
        String H = serializer.H();
        String H2 = serializer.H();
        String H3 = serializer.H();
        String H4 = serializer.H();
        String H5 = serializer.H();
    }
}
