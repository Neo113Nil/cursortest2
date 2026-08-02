package com.sofascore.results.event.overs.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.eq3;
import defpackage.l04;
import defpackage.nq8;
import defpackage.pu1;
import defpackage.yhk;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/overs/dialog/CricketPlayByPlayDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketPlayByPlayDescriptionModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_cricket_play_by_play, (ViewGroup) v().l, false);
        int i = R.id.legend_items_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.legend_items_container, inflate);
        if (linearLayout != null) {
            i = R.id.legend_title;
            if (((TextView) nq8.B(R.id.legend_title, inflate)) != null) {
                i = R.id.text;
                if (((TextView) nq8.B(R.id.text, inflate)) != null) {
                    ScrollView scrollView = (ScrollView) inflate;
                    for (l04 l04Var : l04.d) {
                        pu1 b = pu1.b(layoutInflater.inflate(R.layout.legend_item_row, (ViewGroup) scrollView, false));
                        b.c.setImageTintList(eq3.q(l04Var.b, requireContext()));
                        b.d.setText(requireContext().getString(l04Var.a));
                        linearLayout.addView(b.b);
                    }
                    scrollView.getClass();
                    return scrollView;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CricketModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.cricket_play_by_play);
        string.getClass();
        return string;
    }
}
