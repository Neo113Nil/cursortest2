package com.vk.superapp.widget_settings.p004new;

import androidx.fragment.app.Fragment;
import com.vk.superapp.widget_settings.p004new.WidgetSettingsTab;
import xsna.hox0;
import xsna.pr20;
import xsna.scs;

/* compiled from: WidgetSettingsPageAdapter.kt */
/* loaded from: classes6.dex */
public final class c extends scs {

    /* compiled from: WidgetSettingsPageAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetSettingsTab.values().length];
            try {
                iArr[WidgetSettingsTab.MINI_WIDGETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetSettingsTab.WIDGETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        WidgetSettingsTab.Companion.getClass();
        return WidgetSettingsTab.a.b();
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        WidgetSettingsTab.Companion.getClass();
        WidgetSettingsTab a2 = WidgetSettingsTab.a.a(i);
        int i2 = a2 == null ? -1 : a.$EnumSwitchMapping$0[a2.ordinal()];
        if (i2 == 1) {
            return new pr20();
        }
        if (i2 == 2) {
            return new hox0();
        }
        throw new IllegalArgumentException();
    }
}
