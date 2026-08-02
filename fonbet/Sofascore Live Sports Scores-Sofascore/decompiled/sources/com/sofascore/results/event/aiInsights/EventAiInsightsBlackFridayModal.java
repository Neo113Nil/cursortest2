package com.sofascore.results.event.aiInsights;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.aiInsights.EventAiInsightsBlackFridayModal;
import defpackage.ao2;
import defpackage.dsi;
import defpackage.duf;
import defpackage.nq8;
import defpackage.otk;
import defpackage.tl3;
import defpackage.ur5;
import defpackage.yhk;
import defpackage.z3f;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/aiInsights/EventAiInsightsBlackFridayModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventAiInsightsBlackFridayModal extends BaseModalBottomSheetDialog {
    public z3f w;
    public final boolean x = true;
    public final otk y = new otk(duf.a.getOrCreateKotlinClass(dsi.class), new ur5(this, 0), new ur5(this, 2), new ur5(this, 1));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.view_black_friday_modal, (ViewGroup) v().l, false);
        int i = R.id.bullet_point_one;
        if (((TextView) nq8.B(R.id.bullet_point_one, inflate)) != null) {
            i = R.id.button_not_now;
            TextView textView = (TextView) nq8.B(R.id.button_not_now, inflate);
            if (textView != null) {
                i = R.id.icon;
                if (((ImageView) nq8.B(R.id.icon, inflate)) != null) {
                    i = R.id.next_button;
                    MaterialButton materialButton = (MaterialButton) nq8.B(R.id.next_button, inflate);
                    if (materialButton != null) {
                        i = R.id.subtitle;
                        if (((TextView) nq8.B(R.id.subtitle, inflate)) != null) {
                            i = R.id.title;
                            if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                this.w = new z3f(13, materialButton, nestedScrollView, textView);
                                nestedScrollView.getClass();
                                return nestedScrollView;
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
        this.t.b = "black_friday";
        ImageView imageView = (ImageView) v().c;
        imageView.setImageResource(R.drawable.black_friday_background);
        final int i = 0;
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        Context requireContext = requireContext();
        requireContext.getClass();
        ((ViewGroup.MarginLayoutParams) tl3Var).height = ao2.s(200, requireContext);
        tl3Var.l = -1;
        imageView.setLayoutParams(tl3Var);
        ImageView imageView2 = (ImageView) v().h;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        imageView2.setBackgroundTintList(ColorStateList.valueOf(requireContext2.getColor(R.color.on_color_secondary)));
        z3f z3fVar = this.w;
        if (z3fVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        z8e.a0((TextView) z3fVar.c, 1000L, new Function0(this) { // from class: tr5
            public final /* synthetic */ EventAiInsightsBlackFridayModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EventAiInsightsBlackFridayModal eventAiInsightsBlackFridayModal = this.b;
                switch (i2) {
                    case 0:
                        eventAiInsightsBlackFridayModal.j();
                        break;
                    default:
                        Context requireContext3 = eventAiInsightsBlackFridayModal.requireContext();
                        requireContext3.getClass();
                        nv.z0(requireContext3, kv.CLICK, "check_offer_black_friday", "event_details");
                        ((dsi) eventAiInsightsBlackFridayModal.y.getValue()).f(rd6.d);
                        eventAiInsightsBlackFridayModal.j();
                        break;
                }
                return Unit.a;
            }
        });
        final int i2 = 1;
        z8e.a0((MaterialButton) z3fVar.d, 1000L, new Function0(this) { // from class: tr5
            public final /* synthetic */ EventAiInsightsBlackFridayModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EventAiInsightsBlackFridayModal eventAiInsightsBlackFridayModal = this.b;
                switch (i22) {
                    case 0:
                        eventAiInsightsBlackFridayModal.j();
                        break;
                    default:
                        Context requireContext3 = eventAiInsightsBlackFridayModal.requireContext();
                        requireContext3.getClass();
                        nv.z0(requireContext3, kv.CLICK, "check_offer_black_friday", "event_details");
                        ((dsi) eventAiInsightsBlackFridayModal.y.getValue()).f(rd6.d);
                        eventAiInsightsBlackFridayModal.j();
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AIInsightsOfferModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
