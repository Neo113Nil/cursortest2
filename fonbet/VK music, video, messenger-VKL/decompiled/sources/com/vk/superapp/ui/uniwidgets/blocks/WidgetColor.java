package com.vk.superapp.ui.uniwidgets.blocks;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.m3q0;
import xsna.yfb;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class WidgetColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WidgetColor[] $VALUES;
    public static final WidgetColor ACCENT;
    public static final WidgetColor DYNAMIC_BLUE;
    public static final WidgetColor DYNAMIC_GRAY;
    public static final WidgetColor DYNAMIC_GREEN;
    public static final WidgetColor DYNAMIC_ORANGE;
    public static final WidgetColor DYNAMIC_RED;
    public static final WidgetColor DYNAMIC_VIOLET;
    public static final WidgetColor ICON_TERTIARY;
    public static final WidgetColor NONE;
    public static final WidgetColor PRIMARY;
    public static final WidgetColor SECONDARY;
    public static final WidgetColor TEXT_PRIMARY;
    public static final WidgetColor TEXT_SECONDARY;

    /* compiled from: UiBlocks.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetColor.values().length];
            try {
                iArr[WidgetColor.ACCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetColor.TEXT_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetColor.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetColor.TEXT_SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetColor.SECONDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetColor.ICON_TERTIARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WidgetColor.DYNAMIC_BLUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WidgetColor.DYNAMIC_GRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WidgetColor.DYNAMIC_RED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WidgetColor.DYNAMIC_GREEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WidgetColor.DYNAMIC_ORANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WidgetColor.DYNAMIC_VIOLET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WidgetColor.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        WidgetColor widgetColor = new WidgetColor("ACCENT", 0);
        ACCENT = widgetColor;
        WidgetColor widgetColor2 = new WidgetColor("TEXT_PRIMARY", 1);
        TEXT_PRIMARY = widgetColor2;
        WidgetColor widgetColor3 = new WidgetColor("TEXT_SECONDARY", 2);
        TEXT_SECONDARY = widgetColor3;
        WidgetColor widgetColor4 = new WidgetColor("ICON_TERTIARY", 3);
        ICON_TERTIARY = widgetColor4;
        WidgetColor widgetColor5 = new WidgetColor("DYNAMIC_BLUE", 4);
        DYNAMIC_BLUE = widgetColor5;
        WidgetColor widgetColor6 = new WidgetColor("DYNAMIC_GRAY", 5);
        DYNAMIC_GRAY = widgetColor6;
        WidgetColor widgetColor7 = new WidgetColor("DYNAMIC_RED", 6);
        DYNAMIC_RED = widgetColor7;
        WidgetColor widgetColor8 = new WidgetColor("DYNAMIC_GREEN", 7);
        DYNAMIC_GREEN = widgetColor8;
        WidgetColor widgetColor9 = new WidgetColor("DYNAMIC_ORANGE", 8);
        DYNAMIC_ORANGE = widgetColor9;
        WidgetColor widgetColor10 = new WidgetColor("DYNAMIC_VIOLET", 9);
        DYNAMIC_VIOLET = widgetColor10;
        WidgetColor widgetColor11 = new WidgetColor("NONE", 10);
        NONE = widgetColor11;
        WidgetColor widgetColor12 = new WidgetColor("PRIMARY", 11);
        PRIMARY = widgetColor12;
        WidgetColor widgetColor13 = new WidgetColor("SECONDARY", 12);
        SECONDARY = widgetColor13;
        WidgetColor[] widgetColorArr = {widgetColor, widgetColor2, widgetColor3, widgetColor4, widgetColor5, widgetColor6, widgetColor7, widgetColor8, widgetColor9, widgetColor10, widgetColor11, widgetColor12, widgetColor13};
        $VALUES = widgetColorArr;
        $ENTRIES = new asp(widgetColorArr);
    }

    public WidgetColor() {
        throw null;
    }

    public static WidgetColor valueOf(String str) {
        return (WidgetColor) Enum.valueOf(WidgetColor.class, str);
    }

    public static WidgetColor[] values() {
        return (WidgetColor[]) $VALUES.clone();
    }

    public final Integer a(Context context, yfb yfbVar) {
        int h;
        int s;
        int t;
        int q;
        int k;
        int l;
        int o;
        int m;
        int n;
        int p;
        switch (a.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                if (yfbVar != null) {
                    h = yfbVar.h(context);
                } else {
                    yfb yfbVar2 = m3q0.a;
                    h = (yfbVar2 != null ? yfbVar2 : null).h(context);
                }
                return Integer.valueOf(h);
            case 2:
            case 3:
                if (yfbVar != null) {
                    s = yfbVar.s(context);
                } else {
                    yfb yfbVar3 = m3q0.a;
                    s = (yfbVar3 != null ? yfbVar3 : null).s(context);
                }
                return Integer.valueOf(s);
            case 4:
            case 5:
                if (yfbVar != null) {
                    t = yfbVar.t(context);
                } else {
                    yfb yfbVar4 = m3q0.a;
                    t = (yfbVar4 != null ? yfbVar4 : null).t(context);
                }
                return Integer.valueOf(t);
            case 6:
                if (yfbVar != null) {
                    q = yfbVar.q(context);
                } else {
                    yfb yfbVar5 = m3q0.a;
                    q = (yfbVar5 != null ? yfbVar5 : null).q(context);
                }
                return Integer.valueOf(q);
            case 7:
                if (yfbVar != null) {
                    k = yfbVar.k(context);
                } else {
                    yfb yfbVar6 = m3q0.a;
                    k = (yfbVar6 != null ? yfbVar6 : null).k(context);
                }
                return Integer.valueOf(k);
            case 8:
                if (yfbVar != null) {
                    l = yfbVar.l(context);
                } else {
                    yfb yfbVar7 = m3q0.a;
                    l = (yfbVar7 != null ? yfbVar7 : null).l(context);
                }
                return Integer.valueOf(l);
            case 9:
                if (yfbVar != null) {
                    o = yfbVar.o(context);
                } else {
                    yfb yfbVar8 = m3q0.a;
                    o = (yfbVar8 != null ? yfbVar8 : null).o(context);
                }
                return Integer.valueOf(o);
            case 10:
                if (yfbVar != null) {
                    m = yfbVar.m(context);
                } else {
                    yfb yfbVar9 = m3q0.a;
                    m = (yfbVar9 != null ? yfbVar9 : null).m(context);
                }
                return Integer.valueOf(m);
            case 11:
                if (yfbVar != null) {
                    n = yfbVar.n(context);
                } else {
                    yfb yfbVar10 = m3q0.a;
                    n = (yfbVar10 != null ? yfbVar10 : null).n(context);
                }
                return Integer.valueOf(n);
            case 12:
                if (yfbVar != null) {
                    p = yfbVar.p(context);
                } else {
                    yfb yfbVar11 = m3q0.a;
                    p = (yfbVar11 != null ? yfbVar11 : null).p(context);
                }
                return Integer.valueOf(p);
            case 13:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
