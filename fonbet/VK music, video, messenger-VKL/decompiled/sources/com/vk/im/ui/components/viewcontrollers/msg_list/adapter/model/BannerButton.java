package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import com.vk.dto.common.actions.Action;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class BannerButton {
    public final String a;
    public final a b;
    public final int c;
    public final TextColorStyle d;
    public final BubbleColors e;
    public final BubbleColors f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatListModels.kt */
    public static final class TextColorStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextColorStyle[] $VALUES;
        public static final TextColorStyle PRIMARY_DESTRUCTIVE;
        public static final TextColorStyle PRIMARY_REGULAR;
        public static final TextColorStyle SECONDARY_DESTRUCTIVE;
        public static final TextColorStyle SECONDARY_REGULAR;

        static {
            TextColorStyle textColorStyle = new TextColorStyle("PRIMARY_REGULAR", 0);
            PRIMARY_REGULAR = textColorStyle;
            TextColorStyle textColorStyle2 = new TextColorStyle("PRIMARY_DESTRUCTIVE", 1);
            PRIMARY_DESTRUCTIVE = textColorStyle2;
            TextColorStyle textColorStyle3 = new TextColorStyle("SECONDARY_REGULAR", 2);
            SECONDARY_REGULAR = textColorStyle3;
            TextColorStyle textColorStyle4 = new TextColorStyle("SECONDARY_DESTRUCTIVE", 3);
            SECONDARY_DESTRUCTIVE = textColorStyle4;
            TextColorStyle[] textColorStyleArr = {textColorStyle, textColorStyle2, textColorStyle3, textColorStyle4};
            $VALUES = textColorStyleArr;
            $ENTRIES = new asp(textColorStyleArr);
        }

        public TextColorStyle() {
            throw null;
        }

        public static TextColorStyle valueOf(String str) {
            return (TextColorStyle) Enum.valueOf(TextColorStyle.class, str);
        }

        public static TextColorStyle[] values() {
            return (TextColorStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: ChatListModels.kt */
    public static abstract class a {

        /* compiled from: ChatListModels.kt */
        /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton$a$a, reason: collision with other inner class name */
        public static final class C1164a extends a {
            public static final C1164a a = new C1164a();
        }

        /* compiled from: ChatListModels.kt */
        public static final class b extends a {
            public final Action a;

            public b(Action action) {
                this.a = action;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CustomAction(action=" + this.a + ')';
            }
        }

        /* compiled from: ChatListModels.kt */
        public static final class c extends a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OpenMiniApp(miniAppId="), this.a, ')');
            }
        }

        /* compiled from: ChatListModels.kt */
        public static final class d extends a {
            public static final d a = new d();
        }

        /* compiled from: ChatListModels.kt */
        public static final class e extends a {
            public static final e a = new e();
        }

        /* compiled from: ChatListModels.kt */
        public static final class f extends a {
            public static final f a = new f();
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class b {

        /* compiled from: ChatListModels.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConversationCard.ConversationButton.TypeDto.values().length];
                try {
                    iArr[ConversationCard.ConversationButton.TypeDto.SEND_MESSAGE_REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConversationCard.ConversationButton.TypeDto.ACCEPT_MESSAGE_REQUEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ConversationCard.ConversationButton.TypeDto.REJECT_MESSAGE_REQUEST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ConversationCard.ConversationButton.TypeDto.OPEN_MINIAPP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ConversationCard.ConversationButton.TypeDto.CUSTOM_ACTION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static int a(ConversationCard.ConversationButton.LayoutType layoutType, ConversationCard.ConversationButton.StyleType styleType) {
            String i = layoutType.i();
            ConversationCard.ConversationButton.LayoutType layoutType2 = ConversationCard.ConversationButton.LayoutType.PRIMARY;
            if (epx.f(i, layoutType2.i()) && epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.REGULAR.i())) {
                return R.drawable.vkui_bg_button_primary;
            }
            if (epx.f(layoutType.i(), layoutType2.i()) && epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.DESTRUCTIVE.i())) {
                return R.drawable.vkui_bg_button_red;
            }
            String i2 = layoutType.i();
            ConversationCard.ConversationButton.LayoutType layoutType3 = ConversationCard.ConversationButton.LayoutType.SECONDARY;
            if ((!epx.f(i2, layoutType3.i()) || !epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.REGULAR.i())) && epx.f(layoutType.i(), layoutType3.i())) {
                epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.DESTRUCTIVE.i());
            }
            return R.drawable.vkui_bg_button_secondary;
        }

        public static a b(ConversationCard.ConversationButton conversationButton) {
            int i = a.$EnumSwitchMapping$0[conversationButton.d.ordinal()];
            if (i == 1) {
                return a.e.a;
            }
            if (i == 2) {
                return a.C1164a.a;
            }
            if (i == 3) {
                return a.d.a;
            }
            if (i == 4) {
                Integer num = conversationButton.f;
                return new a.c(num != null ? num.intValue() : Integer.MAX_VALUE);
            }
            if (i != 5) {
                return a.f.a;
            }
            Action action = conversationButton.g;
            return action != null ? new a.b(action) : a.f.a;
        }

        public static TextColorStyle c(ConversationCard.ConversationButton.LayoutType layoutType, ConversationCard.ConversationButton.StyleType styleType) {
            String i = layoutType.i();
            ConversationCard.ConversationButton.LayoutType layoutType2 = ConversationCard.ConversationButton.LayoutType.PRIMARY;
            if (epx.f(i, layoutType2.i()) && epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.REGULAR.i())) {
                return TextColorStyle.PRIMARY_REGULAR;
            }
            if (epx.f(layoutType.i(), layoutType2.i()) && epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.DESTRUCTIVE.i())) {
                return TextColorStyle.PRIMARY_DESTRUCTIVE;
            }
            String i2 = layoutType.i();
            ConversationCard.ConversationButton.LayoutType layoutType3 = ConversationCard.ConversationButton.LayoutType.SECONDARY;
            return (epx.f(i2, layoutType3.i()) && epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.REGULAR.i())) ? TextColorStyle.SECONDARY_REGULAR : (epx.f(layoutType.i(), layoutType3.i()) && epx.f(styleType.i(), ConversationCard.ConversationButton.StyleType.DESTRUCTIVE.i())) ? TextColorStyle.SECONDARY_DESTRUCTIVE : TextColorStyle.SECONDARY_REGULAR;
        }
    }

    public BannerButton(String str, a aVar, int i, TextColorStyle textColorStyle, BubbleColors bubbleColors, BubbleColors bubbleColors2) {
        this.a = str;
        this.b = aVar;
        this.c = i;
        this.d = textColorStyle;
        this.e = bubbleColors;
        this.f = bubbleColors2;
    }

    public static BannerButton a(BannerButton bannerButton, BubbleColors bubbleColors, BubbleColors bubbleColors2) {
        String str = bannerButton.a;
        a aVar = bannerButton.b;
        int i = bannerButton.c;
        TextColorStyle textColorStyle = bannerButton.d;
        bannerButton.getClass();
        return new BannerButton(str, aVar, i, textColorStyle, bubbleColors, bubbleColors2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerButton)) {
            return false;
        }
        BannerButton bannerButton = (BannerButton) obj;
        return epx.f(this.a, bannerButton.a) && epx.f(this.b, bannerButton.b) && this.c == bannerButton.c && this.d == bannerButton.d && epx.f(this.e, bannerButton.e) && epx.f(this.f, bannerButton.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BannerButton(text=" + this.a + ", action=" + this.b + ", background=" + this.c + ", textButtonStyle=" + this.d + ", bubbleColorDark=" + this.e + ", bubbleColorLight=" + this.f + ')';
    }
}
