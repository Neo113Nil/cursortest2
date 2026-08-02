package com.vk.profile.design.compose.buttons;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.itj0;
import xsna.zhf0;
import xsna.zrp;

/* compiled from: ProfileButtons.kt */
/* loaded from: classes5.dex */
public final class ProfileButtons {
    public final a a;
    public final a b;
    public final ButtonType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileButtons.kt */
    public static final class ButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType Advertise;
        public static final ButtonType BecomeFriends;
        public static final ButtonType BellChecked;
        public static final ButtonType BellUnChecked;
        public static final ButtonType Call;
        public static final ButtonType Email;
        public static final ButtonType Gift;
        public static final ButtonType JoinRequestSent;
        public static final ButtonType Message;
        public static final ButtonType Messages;
        public static final ButtonType OpenApp;
        public static final ButtonType OpenBooking;
        public static final ButtonType OpenInternalApp;
        public static final ButtonType OpenInternalUrl;
        public static final ButtonType OpenUrl;
        public static final ButtonType Subscribe;
        public static final ButtonType VKCall;
        public static final ButtonType Write;

        static {
            ButtonType buttonType = new ButtonType("Message", 0);
            Message = buttonType;
            ButtonType buttonType2 = new ButtonType("Messages", 1);
            Messages = buttonType2;
            ButtonType buttonType3 = new ButtonType("Write", 2);
            Write = buttonType3;
            ButtonType buttonType4 = new ButtonType("VKCall", 3);
            VKCall = buttonType4;
            ButtonType buttonType5 = new ButtonType("Call", 4);
            Call = buttonType5;
            ButtonType buttonType6 = new ButtonType("Advertise", 5);
            Advertise = buttonType6;
            ButtonType buttonType7 = new ButtonType("Subscribe", 6);
            Subscribe = buttonType7;
            ButtonType buttonType8 = new ButtonType("JoinRequestSent", 7);
            JoinRequestSent = buttonType8;
            ButtonType buttonType9 = new ButtonType("BecomeFriends", 8);
            BecomeFriends = buttonType9;
            ButtonType buttonType10 = new ButtonType("BellChecked", 9);
            BellChecked = buttonType10;
            ButtonType buttonType11 = new ButtonType("BellUnChecked", 10);
            BellUnChecked = buttonType11;
            ButtonType buttonType12 = new ButtonType("Gift", 11);
            Gift = buttonType12;
            ButtonType buttonType13 = new ButtonType("Email", 12);
            Email = buttonType13;
            ButtonType buttonType14 = new ButtonType("OpenUrl", 13);
            OpenUrl = buttonType14;
            ButtonType buttonType15 = new ButtonType("OpenInternalUrl", 14);
            OpenInternalUrl = buttonType15;
            ButtonType buttonType16 = new ButtonType("OpenApp", 15);
            OpenApp = buttonType16;
            ButtonType buttonType17 = new ButtonType("OpenInternalApp", 16);
            OpenInternalApp = buttonType17;
            ButtonType buttonType18 = new ButtonType("OpenBooking", 17);
            OpenBooking = buttonType18;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4, buttonType5, buttonType6, buttonType7, buttonType8, buttonType9, buttonType10, buttonType11, buttonType12, buttonType13, buttonType14, buttonType15, buttonType16, buttonType17, buttonType18};
            $VALUES = buttonTypeArr;
            $ENTRIES = new asp(buttonTypeArr);
        }

        public ButtonType() {
            throw null;
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    /* compiled from: ProfileButtons.kt */
    public static final class a {
        public final ButtonType a;
        public final Integer b;
        public final c c;

        public a(ButtonType buttonType, Integer num, c cVar, int i) {
            num = (i & 2) != 0 ? null : num;
            cVar = (i & 4) != 0 ? c.b.a : cVar;
            this.a = buttonType;
            this.b = num;
            this.c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Button(type=" + this.a + ", counter=" + this.b + ", label=" + this.c + ')';
        }
    }

    /* compiled from: ProfileButtons.kt */
    public static final class b {
        public final ButtonType a;
        public final zhf0 b;

        public b(ButtonType buttonType, zhf0 zhf0Var) {
            this.a = buttonType;
            this.b = zhf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonClick(type=");
            sb.append(this.a);
            sb.append(", anchorInWindow=");
            return itj0.c(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileButtons.kt */
    public interface c {

        /* compiled from: ProfileButtons.kt */
        public static final class a implements c {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Custom(text="), this.a, ')');
            }
        }

        /* compiled from: ProfileButtons.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1099982209;
            }

            public final String toString() {
                return "FromResources";
            }
        }
    }

    public ProfileButtons(a aVar, a aVar2, ButtonType buttonType, int i) {
        aVar2 = (i & 2) != 0 ? null : aVar2;
        buttonType = (i & 4) != 0 ? null : buttonType;
        this.a = aVar;
        this.b = aVar2;
        this.c = buttonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileButtons)) {
            return false;
        }
        ProfileButtons profileButtons = (ProfileButtons) obj;
        return epx.f(this.a, profileButtons.a) && epx.f(this.b, profileButtons.b) && this.c == profileButtons.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ButtonType buttonType = this.c;
        return Boolean.hashCode(false) + ((hashCode2 + (buttonType == null ? 0 : buttonType.hashCode())) * 31);
    }

    public final String toString() {
        return "ProfileButtons(primary=" + this.a + ", secondary=" + this.b + ", compact=" + this.c + ", compactBellPostsSubscribed=false)";
    }
}
