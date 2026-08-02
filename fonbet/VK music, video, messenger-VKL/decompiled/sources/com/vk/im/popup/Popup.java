package com.vk.im.popup;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.vkontakte.android.R;
import java.util.List;
import xsna.asp;
import xsna.lwb0;
import xsna.zrp;

/* compiled from: Popup.kt */
/* loaded from: classes2.dex */
public abstract class Popup {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Popup.kt */
    public static final class ButtonStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle PRIMARY;
        public static final ButtonStyle SECONDARY;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
            PRIMARY = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
            SECONDARY = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            $VALUES = buttonStyleArr;
            $ENTRIES = new asp(buttonStyleArr);
        }

        public ButtonStyle() {
            throw null;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: Popup.kt */
    public static final class b extends c {
        public static final b e = new b(R.string.vkim_loading, 13, null, null, false);
    }

    /* compiled from: Popup.kt */
    public static class c extends Popup {
        public final CharSequence a;
        public final int b;
        public final CharSequence c;
        public final boolean d;

        public c(int i, int i2, CharSequence charSequence, String str, boolean z) {
            charSequence = (i2 & 1) != 0 ? "" : charSequence;
            i = (i2 & 2) != 0 ? 0 : i;
            str = (i2 & 4) != 0 ? "" : str;
            z = (i2 & 8) != 0 ? false : z;
            this.a = charSequence;
            this.b = i;
            this.c = str;
            this.d = z;
        }
    }

    /* compiled from: Popup.kt */
    public static class d extends Popup {
        public final int a;
        public final int b;
        public final int c;
        public final String d;
        public final int e;
        public final String f;
        public final ButtonStyle g;
        public final int h;
        public final String i;

        public d(ButtonStyle buttonStyle, int i) {
            int i2 = (i & 1) != 0 ? 0 : R.drawable.vk_icon_bomb_outline_28;
            int i3 = (i & 8) != 0 ? 0 : R.string.vkim_promo_casper_msgs_title;
            int i4 = (i & 32) != 0 ? 0 : R.string.vkim_promo_casper_msgs_description;
            buttonStyle = (i & 128) != 0 ? ButtonStyle.PRIMARY : buttonStyle;
            int i5 = (i & 256) == 0 ? R.string.vkim_promo_casper_msgs_button : 0;
            this.a = i2;
            this.b = R.attr.vk_ui_icon_accent;
            this.c = i3;
            this.d = "";
            this.e = i4;
            this.f = "";
            this.g = buttonStyle;
            this.h = i5;
            this.i = "";
        }
    }

    /* compiled from: Popup.kt */
    public static class e extends Popup {
        public final int a;
        public final CharSequence b;
        public final int c;
        public final CharSequence d;
        public final int e;
        public final CharSequence f;
        public final int g;
        public final String h;
        public final g i;

        public e(int i, String str, int i2, String str2, int i3, SpannableStringBuilder spannableStringBuilder, int i4, int i5) {
            i = (i5 & 1) != 0 ? 0 : i;
            str = (i5 & 2) != 0 ? "" : str;
            i2 = (i5 & 4) != 0 ? 0 : i2;
            str2 = (i5 & 8) != 0 ? "" : str2;
            i3 = (i5 & 16) != 0 ? 0 : i3;
            String str3 = (i5 & 32) != 0 ? "" : spannableStringBuilder;
            i4 = (i5 & 64) != 0 ? 0 : i4;
            g.c cVar = g.c.a;
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
            this.e = i3;
            this.f = str3;
            this.g = i4;
            this.h = "";
            this.i = cVar;
        }
    }

    /* compiled from: Popup.kt */
    public static class f<T> {
        public final int a;
        public final CharSequence b;
        public final int c;
        public final CharSequence d;
        public final int e;
        public final CharSequence f;
        public final int g;
        public final String h;
        public final g i;
        public final List<lwb0<T>> j;
        public final List<T> k;

        public f(int i, String str, int i2, String str2, SpannableStringBuilder spannableStringBuilder, int i3, List list, List list2, int i4) {
            i = (i4 & 1) != 0 ? 0 : i;
            str = (i4 & 2) != 0 ? "" : str;
            i2 = (i4 & 4) != 0 ? 0 : i2;
            str2 = (i4 & 8) != 0 ? "" : str2;
            int i5 = (i4 & 16) == 0 ? R.string.vkim_popup_msg_delete_submit_yes : 0;
            String str3 = (i4 & 32) != 0 ? "" : spannableStringBuilder;
            g.c cVar = g.c.a;
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
            this.e = i5;
            this.f = str3;
            this.g = i3;
            this.h = "";
            this.i = cVar;
            this.j = list;
            this.k = list2;
        }
    }

    /* compiled from: Popup.kt */
    public static abstract class g {

        /* compiled from: Popup.kt */
        public static final class a extends g {
            public final View a;

            public a(View view) {
                this.a = view;
            }
        }

        /* compiled from: Popup.kt */
        public static final class b extends g {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 176962242;
            }

            public final String toString() {
                return "BottomSheet";
            }
        }

        /* compiled from: Popup.kt */
        public static final class c extends g {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 5531642;
            }

            public final String toString() {
                return "Popup";
            }
        }
    }

    /* compiled from: Popup.kt */
    public static class a<T> extends Popup {
        public final String a;
        public final int b;
        public final Integer c;
        public final Integer d;
        public final Integer e;
        public final int f;
        public final int g;
        public final List<lwb0<T>> h;
        public final List<T> i;
        public final g j;
        public final boolean k;

        public a(int i, Integer num, Integer num2, Integer num3, int i2, int i3, List list, List list2, g gVar, boolean z) {
            this.a = "";
            this.b = i;
            this.c = num;
            this.d = num2;
            this.e = num3;
            this.f = i2;
            this.g = i3;
            this.h = list;
            this.i = list2;
            this.j = gVar;
            this.k = z;
        }

        public a(List list, List list2, g gVar, int i) {
            this(0, null, null, null, -1, -1, list, list2, (i & 1024) != 0 ? g.c.a : gVar, true);
        }
    }
}
