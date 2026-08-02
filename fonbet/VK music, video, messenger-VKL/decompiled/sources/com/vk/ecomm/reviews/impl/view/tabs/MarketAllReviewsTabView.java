package com.vk.ecomm.reviews.impl.view.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.i5s;

/* compiled from: MarketAllReviewsTabView.kt */
/* loaded from: classes18.dex */
public class MarketAllReviewsTabView extends FrameLayout {
    public final CardView b;
    public final TextView c;
    public final TextView d;

    public MarketAllReviewsTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.market_all_reviews_tab_view, (ViewGroup) this, true);
        setClipToPadding(false);
        this.b = (CardView) findViewById(R.id.cv_tab);
        this.c = (TextView) findViewById(R.id.tv_tab);
        this.d = (TextView) findViewById(R.id.tv_count);
    }

    public final void a(int i, String str, boolean z) {
        String str2;
        int i2 = z ? R.drawable.market_all_reviews_selected_tab : R.drawable.market_all_reviews_notselected_tab;
        CardView cardView = this.b;
        cardView.setBackground(cardView.getContext().getDrawable(i2));
        this.c.setTextColor(dhr0.t.c(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary));
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(cardView.getResources().getString(R.string.market_item_reviews_list));
            sb.append(" ");
            sb.append(cardView.getResources().getString(i));
            str2 = i5s.a(sb, " ", str);
        } else {
            str2 = cardView.getResources().getString(R.string.market_item_reviews_show) + " " + cardView.getResources().getString(R.string.market_item_reviews_list) + " " + cardView.getResources().getString(i) + " " + str;
        }
        cardView.setContentDescription(str2);
    }
}
