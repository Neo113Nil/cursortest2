package com.vk.stories.design.view.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cn70;
import xsna.e43;
import xsna.ehm0;
import xsna.f4m;
import xsna.izs;
import xsna.m33;
import xsna.mim0;
import xsna.zkj0;

/* compiled from: StoryStylePickerView.kt */
/* loaded from: classes6.dex */
public final class StoryStylePickerView extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final VkSegmentedControl b;

    public StoryStylePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.layout_story_editor_repost_style_picker, this);
        this.b = (VkSegmentedControl) findViewById(R.id.style_controls);
    }

    public final void a(int i, List list, izs izsVar) {
        VkSegmentedControl vkSegmentedControl = this.b;
        vkSegmentedControl.r();
        if (list.size() < 2) {
            return;
        }
        vkSegmentedControl.setSegmentSize(VkSegmentedControl.SegmentSize.Large);
        vkSegmentedControl.setCustomTabContent(new ehm0(this, 1));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            mim0 mim0Var = (mim0) obj;
            Integer num = mim0Var.a;
            if (num != null) {
                int intValue = num.intValue();
                TabLayout.g p = vkSegmentedControl.p();
                TabLayout tabLayout = p.g;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                p.m(m33.a(intValue, tabLayout.getContext()));
                Integer num2 = mim0Var.b;
                if (num2 != null) {
                    p.k(getContext().getString(R.string.repost_accessibility_style_tab, getContext().getString(num2.intValue())));
                }
                p.h.setPadding(i2 == 0 ? 0 : cn70.b(8), 0, 0, 0);
                vkSegmentedControl.i(p, i2 == i);
            }
            i2 = i3;
        }
        f4m.x(i != 0 ? cn70.b(8) : 0, vkSegmentedControl.getIndicator());
        vkSegmentedControl.setTabMode(2);
        vkSegmentedControl.setOnSelectTabPosition(new zkj0(2, this, izsVar));
    }
}
