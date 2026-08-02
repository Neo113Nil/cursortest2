package com.vk.core.view.components.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.vk.core.view.components.tabs.b;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.m33;
import xsna.ozl;

/* compiled from: VkAccentTabLayout.kt */
@ozl
/* loaded from: classes17.dex */
public class VkAccentTabLayout extends b {
    public final a x0;

    /* compiled from: VkAccentTabLayout.kt */
    public static final class a extends b.AbstractC0865b {
        public final CardView b;

        public a(Context context) {
            super(context, null, 0);
            LayoutInflater.from(context).inflate(R.layout.ds_internal_accent_tab_indicator, (ViewGroup) this, true);
            setClipToPadding(false);
            CardView cardView = (CardView) findViewById(R.id.ds_accent_tab_indicator_card);
            this.b = cardView;
            cardView.setOutlineSpotShadowColor(context.getColor(R.color.vk_black_alpha75));
        }

        @Override // xsna.too0
        public final void Ng() {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            this.b.setForeground(m33.a(R.drawable.ds_tab_indicator_background_accent, context));
        }
    }

    public VkAccentTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.x0 = new a(getContext());
        A();
    }

    @Override // com.vk.core.view.components.tabs.b
    public a getIndicator() {
        return this.x0;
    }
}
