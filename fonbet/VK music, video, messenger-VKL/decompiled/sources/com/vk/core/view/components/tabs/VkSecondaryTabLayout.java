package com.vk.core.view.components.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.tabs.b;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.m33;
import xsna.ozl;

/* compiled from: VkSecondaryTabLayout.kt */
@ozl
/* loaded from: classes17.dex */
public class VkSecondaryTabLayout extends b {
    public final a x0;

    /* compiled from: VkSecondaryTabLayout.kt */
    public static final class a extends b.AbstractC0865b {
        public final FrameLayout b;

        public a(Context context) {
            super(context, null, 0);
            LayoutInflater.from(context).inflate(R.layout.ds_internal_secondary_tab_indicator, (ViewGroup) this, true);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ds_secondary_tab_indicator);
            this.b = frameLayout;
            setClipToPadding(false);
            frameLayout.setClipToOutline(true);
        }

        @Override // xsna.too0
        public final void Ng() {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            this.b.setBackground(m33.a(R.drawable.ds_tab_indicator_background_secondary, context));
        }
    }

    public VkSecondaryTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.x0 = new a(getContext());
        A();
    }

    @Override // com.vk.core.view.components.tabs.b
    public a getIndicator() {
        return this.x0;
    }
}
