package com.sofascore.results.event.aiInsights;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.dla;
import defpackage.ds5;
import defpackage.dsi;
import defpackage.duf;
import defpackage.h63;
import defpackage.me4;
import defpackage.nq8;
import defpackage.otk;
import defpackage.rfe;
import defpackage.yhk;
import defpackage.z8e;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/aiInsights/EventAiInsightsPromotionalModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventAiInsightsPromotionalModal extends BaseModalBottomSheetDialog {
    public rfe w;
    public final boolean x = true;
    public final otk y = new otk(duf.a.getOrCreateKotlinClass(dsi.class), new ds5(this, 0), new ds5(this, 2), new ds5(this, 1));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.view_analyst_promotional_modal, (ViewGroup) v().l, false);
        int i = R.id.animation;
        if (((ImageView) nq8.B(R.id.animation, inflate)) != null) {
            i = R.id.animation_container;
            if (((ConstraintLayout) nq8.B(R.id.animation_container, inflate)) != null) {
                i = R.id.bullet_point_one;
                TextView textView = (TextView) nq8.B(R.id.bullet_point_one, inflate);
                if (textView != null) {
                    i = R.id.bullet_point_two;
                    TextView textView2 = (TextView) nq8.B(R.id.bullet_point_two, inflate);
                    if (textView2 != null) {
                        i = R.id.icon;
                        if (((ImageView) nq8.B(R.id.icon, inflate)) != null) {
                            i = R.id.next_button;
                            MaterialButton materialButton = (MaterialButton) nq8.B(R.id.next_button, inflate);
                            if (materialButton != null) {
                                i = R.id.progress_bar;
                                if (((LinearProgressIndicator) nq8.B(R.id.progress_bar, inflate)) != null) {
                                    i = R.id.subtitle;
                                    if (((TextView) nq8.B(R.id.subtitle, inflate)) != null) {
                                        i = R.id.title;
                                        if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                            this.w = new rfe((ViewGroup) nestedScrollView, textView, (View) textView2, (View) materialButton, 10);
                                            nestedScrollView.getClass();
                                            return nestedScrollView;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.stone));
        rfe rfeVar = this.w;
        if (rfeVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        z8e.a0((MaterialButton) rfeVar.d, 1000L, new h63(this, 23));
        Currency currency = Currency.getInstance(requireArguments().getString("CURRENCY_CODE"));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        ((TextView) rfeVar.e).setText(getString(R.string.half_price_discount_bullet_1, currencyInstance.format(requireArguments().getDouble("REGULAR_MONTHLY_PRICE"))));
        TextView textView = (TextView) rfeVar.c;
        Locale d = dla.d();
        String quantityString = getResources().getQuantityString(R.plurals.half_price_discount_bullet_2, 7);
        quantityString.getClass();
        me4.s(new Object[]{7}, 1, d, quantityString, textView);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AIInsightsOfferModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
