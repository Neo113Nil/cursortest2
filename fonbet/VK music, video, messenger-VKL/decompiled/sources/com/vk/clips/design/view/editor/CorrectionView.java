package com.vk.clips.design.view.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.filter.CorrectionsView;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.design.view.filter.HslView;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.clips.filters.FilterInfo;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.awt0;
import xsna.qis0;
import xsna.zrp;

/* compiled from: CorrectionView.kt */
/* loaded from: classes16.dex */
public final class CorrectionView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final FiltersView t;
    public final CorrectionsView u;
    public final HslView v;
    public qis0.a w;
    public FilterInfo x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorrectionView.kt */
    public static final class Tab {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;
        public static final Tab Corrections;
        public static final Tab Filters;
        public static final Tab Hsl;

        static {
            Tab tab = new Tab("Filters", 0);
            Filters = tab;
            Tab tab2 = new Tab("Corrections", 1);
            Corrections = tab2;
            Tab tab3 = new Tab("Hsl", 2);
            Hsl = tab3;
            Tab[] tabArr = {tab, tab2, tab3};
            $VALUES = tabArr;
            $ENTRIES = new asp(tabArr);
        }

        public Tab() {
            throw null;
        }

        public static zrp<Tab> h() {
            return $ENTRIES;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }
    }

    public CorrectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_correction, this);
        VkTabs vkTabs = (VkTabs) findViewById(R.id.correction_tabs);
        this.t = (FiltersView) findViewById(R.id.filters);
        this.u = (CorrectionsView) findViewById(R.id.corrections);
        this.v = (HslView) findViewById(R.id.hsl);
        VkTabs.c g = vkTabs.g();
        g.a.Y4(getContext().getString(R.string.correction_tab_filters), null);
        setSelected(true);
        vkTabs.b(g, true);
        VkTabs.c g2 = vkTabs.g();
        g2.a.Y4(getContext().getString(R.string.correction_tab_correction), null);
        vkTabs.b(g2, true);
        VkTabs.c g3 = vkTabs.g();
        g3.a.Y4(getContext().getString(R.string.correction_tab_hsl), null);
        vkTabs.b(g3, true);
        vkTabs.a(new a(this));
    }

    public final void P4(Tab tab) {
        boolean z = tab == Tab.Filters;
        boolean z2 = tab == Tab.Corrections;
        boolean z3 = tab == Tab.Hsl;
        awt0.v(this.t, z);
        awt0.v(this.u, z2);
        awt0.v(this.v, z3);
    }
}
