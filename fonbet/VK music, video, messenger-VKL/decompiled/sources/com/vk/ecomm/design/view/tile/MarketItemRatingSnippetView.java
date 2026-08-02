package com.vk.ecomm.design.view.tile;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import xsna.brm0;
import xsna.f4m;
import xsna.iah0;
import xsna.krv0;
import xsna.ozl;
import xsna.ywo;

/* compiled from: MarketItemRatingSnippetView.kt */
@ozl
/* loaded from: classes18.dex */
public final class MarketItemRatingSnippetView extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final VkImageSimple e;

    public MarketItemRatingSnippetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.market_item_rating_snippet, this);
        setOrientation(0);
        setGravity(16);
        int a = iah0.a(1);
        f4m.B(a, a, this);
        this.b = (TextView) findViewById(R.id.market_item_rating_tv_mark);
        this.c = (TextView) findViewById(R.id.market_item_rating_title_tv);
        this.d = (TextView) findViewById(R.id.market_item_rating_dot_tv);
        this.e = (VkImageSimple) findViewById(R.id.market_item_rating_star_iv);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, Float f2, String str, ywo ywoVar) {
        int i;
        Integer num = (Integer) ywoVar.c;
        if (z) {
            if ((f2 != null ? f2.floatValue() : 0.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i = 0;
                setVisibility(i);
                String y = f2 == null ? brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2.floatValue())}, 1)), ".", StringUtils.COMMA) : null;
                TextView textView = this.b;
                textView.setText(y);
                TextView textView2 = this.c;
                textView2.setText(str);
                Context context = getContext();
                Integer num2 = (Integer) ywoVar.b;
                this.e.setImageTintList(ColorStateList.valueOf(krv0.m(num2 == null ? num2.intValue() : R.attr.vk_ui_accent_orange_peach, context)));
                Context context2 = getContext();
                Integer num3 = (Integer) ywoVar.a;
                textView.setTextColor(krv0.m(num3 == null ? num3.intValue() : R.attr.vk_ui_text_subhead, context2));
                Context context3 = getContext();
                int i2 = R.attr.vk_ui_text_tertiary;
                this.d.setTextColor(krv0.m(num == null ? num.intValue() : R.attr.vk_ui_text_tertiary, context3));
                Context context4 = getContext();
                if (num != null) {
                    i2 = num.intValue();
                }
                textView2.setTextColor(krv0.m(i2, context4));
                setContentDescription(getResources().getString(R.string.ecomm_good_rating_accessibility) + String.valueOf(f2) + " " + str);
            }
        }
        i = 8;
        setVisibility(i);
        if (f2 == null) {
        }
        TextView textView3 = this.b;
        textView3.setText(y);
        TextView textView22 = this.c;
        textView22.setText(str);
        Context context5 = getContext();
        Integer num22 = (Integer) ywoVar.b;
        this.e.setImageTintList(ColorStateList.valueOf(krv0.m(num22 == null ? num22.intValue() : R.attr.vk_ui_accent_orange_peach, context5)));
        Context context22 = getContext();
        Integer num32 = (Integer) ywoVar.a;
        textView3.setTextColor(krv0.m(num32 == null ? num32.intValue() : R.attr.vk_ui_text_subhead, context22));
        Context context32 = getContext();
        int i22 = R.attr.vk_ui_text_tertiary;
        this.d.setTextColor(krv0.m(num == null ? num.intValue() : R.attr.vk_ui_text_tertiary, context32));
        Context context42 = getContext();
        if (num != null) {
        }
        textView22.setTextColor(krv0.m(i22, context42));
        setContentDescription(getResources().getString(R.string.ecomm_good_rating_accessibility) + String.valueOf(f2) + " " + str);
    }
}
