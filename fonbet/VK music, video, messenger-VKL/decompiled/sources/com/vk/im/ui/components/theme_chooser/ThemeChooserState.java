package com.vk.im.ui.components.theme_chooser;

import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.p9m;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ThemeChooserState.kt */
/* loaded from: classes2.dex */
public final class ThemeChooserState {
    public final ListKind a;
    public final String b;
    public final String c;
    public final DialogBackground d;
    public final boolean e;
    public final List<DialogTheme> f;
    public final List<DialogBackground> g;
    public final List<p9m> h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThemeChooserState.kt */
    public static final class ListKind {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ListKind[] $VALUES;
        public static final ListKind BACKGROUND;
        public static final ListKind COLOR;
        public static final ListKind THEME;

        static {
            ListKind listKind = new ListKind("THEME", 0);
            THEME = listKind;
            ListKind listKind2 = new ListKind("COLOR", 1);
            COLOR = listKind2;
            ListKind listKind3 = new ListKind("BACKGROUND", 2);
            BACKGROUND = listKind3;
            ListKind[] listKindArr = {listKind, listKind2, listKind3};
            $VALUES = listKindArr;
            $ENTRIES = new asp(listKindArr);
        }

        public ListKind() {
            throw null;
        }

        public static ListKind valueOf(String str) {
            return (ListKind) Enum.valueOf(ListKind.class, str);
        }

        public static ListKind[] values() {
            return (ListKind[]) $VALUES.clone();
        }
    }

    public ThemeChooserState(ListKind listKind, String str, String str2, DialogBackground dialogBackground, boolean z, List<DialogTheme> list, List<DialogBackground> list2, List<p9m> list3) {
        this.a = listKind;
        this.b = str;
        this.c = str2;
        this.d = dialogBackground;
        this.e = z;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ThemeChooserState a(ThemeChooserState themeChooserState, ListKind listKind, String str, String str2, DialogBackground dialogBackground, boolean z, List list, ArrayList arrayList, List list2, int i) {
        if ((i & 1) != 0) {
            listKind = themeChooserState.a;
        }
        ListKind listKind2 = listKind;
        if ((i & 2) != 0) {
            str = themeChooserState.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = themeChooserState.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            dialogBackground = themeChooserState.d;
        }
        DialogBackground dialogBackground2 = dialogBackground;
        if ((i & 16) != 0) {
            z = themeChooserState.e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            list = themeChooserState.f;
        }
        List list3 = list;
        List list4 = (i & 64) != 0 ? themeChooserState.g : arrayList;
        List list5 = (i & 128) != 0 ? themeChooserState.h : list2;
        themeChooserState.getClass();
        return new ThemeChooserState(listKind2, str3, str4, dialogBackground2, z2, list3, list4, list5);
    }

    public final boolean b() {
        return this.a == ListKind.THEME;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeChooserState)) {
            return false;
        }
        ThemeChooserState themeChooserState = (ThemeChooserState) obj;
        return this.a == themeChooserState.a && epx.f(this.b, themeChooserState.b) && epx.f(this.c, themeChooserState.c) && epx.f(this.d, themeChooserState.d) && this.e == themeChooserState.e && epx.f(this.f, themeChooserState.f) && epx.f(this.g, themeChooserState.g) && epx.f(this.h, themeChooserState.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + fw3.a(fw3.a(qoy.b((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "ThemeChooserState(activeListKind=" + this.a + ", selectedThemeId='" + this.b + "', selectedColorId='" + this.c + "', selectedBackgroundId='" + this.d + "', isChangesSaved=" + this.e + ", availableThemes=" + this.f.size() + ", availableBackgrounds=" + this.g.size() + ')';
    }
}
