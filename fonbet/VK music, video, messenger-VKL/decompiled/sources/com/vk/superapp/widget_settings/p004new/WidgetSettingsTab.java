package com.vk.superapp.widget_settings.p004new;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.asp;
import xsna.e43;
import xsna.j5g;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetSettingsTab.kt */
/* loaded from: classes6.dex */
public final class WidgetSettingsTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WidgetSettingsTab[] $VALUES;
    public static final a Companion;
    public static final WidgetSettingsTab MINI_WIDGETS;
    public static final WidgetSettingsTab WIDGETS;
    private final boolean isEnabled;
    private final int titleRes;

    /* compiled from: WidgetSettingsTab.kt */
    public static final class a {
        public static WidgetSettingsTab a(int i) {
            WidgetSettingsTab[] values = WidgetSettingsTab.values();
            ArrayList arrayList = new ArrayList();
            for (WidgetSettingsTab widgetSettingsTab : values) {
                if (widgetSettingsTab.i()) {
                    arrayList.add(widgetSettingsTab);
                }
            }
            return (WidgetSettingsTab) j5g.b0(i, arrayList);
        }

        public static int b() {
            WidgetSettingsTab[] values = WidgetSettingsTab.values();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (WidgetSettingsTab widgetSettingsTab : values) {
                if (widgetSettingsTab.i()) {
                    arrayList.add(widgetSettingsTab);
                }
            }
            if (arrayList.isEmpty()) {
                return 0;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((WidgetSettingsTab) it.next()).i() && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
            return i;
        }
    }

    static {
        WidgetSettingsTab widgetSettingsTab = new WidgetSettingsTab("MINI_WIDGETS", 0, R.string.vk_mini_widget_title_tab, false);
        MINI_WIDGETS = widgetSettingsTab;
        WidgetSettingsTab widgetSettingsTab2 = new WidgetSettingsTab("WIDGETS", 1, R.string.vk_widget_title_tab, true);
        WIDGETS = widgetSettingsTab2;
        WidgetSettingsTab[] widgetSettingsTabArr = {widgetSettingsTab, widgetSettingsTab2};
        $VALUES = widgetSettingsTabArr;
        $ENTRIES = new asp(widgetSettingsTabArr);
        Companion = new a();
    }

    public WidgetSettingsTab(String str, int i, int i2, boolean z) {
        this.titleRes = i2;
        this.isEnabled = z;
    }

    public static WidgetSettingsTab valueOf(String str) {
        return (WidgetSettingsTab) Enum.valueOf(WidgetSettingsTab.class, str);
    }

    public static WidgetSettingsTab[] values() {
        return (WidgetSettingsTab[]) $VALUES.clone();
    }

    public final int h() {
        return this.titleRes;
    }

    public final boolean i() {
        return this.isEnabled;
    }
}
