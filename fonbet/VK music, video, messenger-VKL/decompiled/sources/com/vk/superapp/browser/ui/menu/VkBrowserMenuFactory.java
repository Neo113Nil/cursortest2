package com.vk.superapp.browser.ui.menu;

import android.content.Context;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.fvv0;
import xsna.ko60;
import xsna.kud0;
import xsna.msy;
import xsna.wc80;
import xsna.yfu0;
import xsna.zrp;

/* compiled from: VkBrowserMenuFactory.kt */
/* loaded from: classes6.dex */
public class VkBrowserMenuFactory {
    public static final Object i;
    public static final Object j;
    public final Context a;
    public final fvv0 b;
    public final wc80 c;
    public final yfu0.a d;
    public final Set<Integer> e;
    public final boolean f;
    public final WebApiApplication g;
    public Integer h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBrowserMenuFactory.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style CONTROLS_HORIZONTAL;
        public static final Style CONTROLS_VERTICAL;
        public static final Style NONE;
        public static final Style TOOLBAR_HORIZONTAL;
        public static final Style TOOLBAR_VERTICAL;

        static {
            Style style = new Style("CONTROLS_VERTICAL", 0);
            CONTROLS_VERTICAL = style;
            Style style2 = new Style("CONTROLS_HORIZONTAL", 1);
            CONTROLS_HORIZONTAL = style2;
            Style style3 = new Style("TOOLBAR_VERTICAL", 2);
            TOOLBAR_VERTICAL = style3;
            Style style4 = new Style("TOOLBAR_HORIZONTAL", 3);
            TOOLBAR_HORIZONTAL = style4;
            Style style5 = new Style("NONE", 4);
            NONE = style5;
            Style[] styleArr = {style, style2, style3, style4, style5};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* compiled from: VkBrowserMenuFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.CONTROLS_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.CONTROLS_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Style.TOOLBAR_VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Style.TOOLBAR_HORIZONTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Style.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        kud0 kud0Var = new kud0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        i = msy.a(lazyThreadSafetyMode, kud0Var);
        j = msy.a(lazyThreadSafetyMode, new ko60(14));
    }

    public VkBrowserMenuFactory(Context context, fvv0 fvv0Var, wc80 wc80Var, yfu0.a aVar, Set<Integer> set, boolean z) {
        this.a = context;
        this.b = fvv0Var;
        this.c = wc80Var;
        this.d = aVar;
        this.e = set;
        this.f = z;
        this.g = fvv0Var.t();
    }

    public final yfu0 a(Integer num) {
        int i2;
        this.h = num;
        WebApiApplication webApiApplication = this.g;
        if (webApiApplication.T != null || c() == Style.NONE) {
            return null;
        }
        int i3 = a.$EnumSwitchMapping$0[c().ordinal()];
        if (i3 == 1) {
            i2 = R.layout.vk_browser_menu;
        } else if (i3 == 2) {
            i2 = R.layout.vk_browser_horizontal_menu;
        } else {
            if (i3 != 3 && i3 != 4) {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("None style doesn't need layout id");
            }
            i2 = R.layout.vk_browser_toolbar_menu;
        }
        yfu0 yfu0Var = new yfu0(this.a, i2);
        yfu0Var.setDelegate(this.d);
        if (c() != Style.TOOLBAR_HORIZONTAL && c() != Style.TOOLBAR_VERTICAL) {
            return yfu0Var;
        }
        yfu0Var.setTitle(webApiApplication.c);
        return yfu0Var;
    }

    public final int b(WebApiApplication webApiApplication) {
        int i2 = a.$EnumSwitchMapping$0[c().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    return 8388611;
                }
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("None style doesn't need gravity");
            }
            if (webApiApplication.r) {
                return 8388659;
            }
        }
        return 8388661;
    }

    public final Style c() {
        Integer num;
        Integer num2;
        WebApiApplication webApiApplication = this.g;
        if (webApiApplication.T != null) {
            return Style.TOOLBAR_HORIZONTAL;
        }
        if (!webApiApplication.f() && !webApiApplication.g()) {
            return Style.CONTROLS_VERTICAL;
        }
        if (webApiApplication.y == 2) {
            return Style.NONE;
        }
        int i2 = webApiApplication.y;
        if (i2 == 0 && webApiApplication.v == 1) {
            return Style.TOOLBAR_HORIZONTAL;
        }
        if (i2 == 0) {
            return Style.TOOLBAR_VERTICAL;
        }
        int i3 = webApiApplication.v;
        return i3 == 1 ? Style.CONTROLS_HORIZONTAL : (i3 == 0 && (num2 = this.h) != null && num2.intValue() == 2) ? Style.CONTROLS_HORIZONTAL : (webApiApplication.v == 0 && (num = this.h) != null && num.intValue() == 1) ? Style.CONTROLS_VERTICAL : Style.CONTROLS_VERTICAL;
    }

    public final boolean d() {
        return c() == Style.CONTROLS_VERTICAL || c() == Style.CONTROLS_HORIZONTAL;
    }
}
