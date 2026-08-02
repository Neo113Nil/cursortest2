package com.sofascore.results.ads.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.ads.ui.ManageSubscriptionsBottomSheet;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.nq8;
import defpackage.yhk;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/ads/ui/ManageSubscriptionsBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManageSubscriptionsBottomSheet extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.view_manage_subscriptions, (ViewGroup) v().l, false);
        int i2 = R.id.button_yes;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_yes, inflate);
        if (materialButton != null) {
            i2 = R.id.cancel_button;
            MaterialButton materialButton2 = (MaterialButton) nq8.B(R.id.cancel_button, inflate);
            if (materialButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: brb
                    public final /* synthetic */ ManageSubscriptionsBottomSheet b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        ManageSubscriptionsBottomSheet manageSubscriptionsBottomSheet = this.b;
                        switch (i3) {
                            case 0:
                                manageSubscriptionsBottomSheet.j();
                                break;
                            default:
                                Intent intent = new Intent("android.intent.action.VIEW");
                                Uri parse = Uri.parse("https://play.google.com/store/account/subscriptions?package=" + manageSubscriptionsBottomSheet.requireContext().getPackageName());
                                parse.getClass();
                                intent.setData(parse);
                                manageSubscriptionsBottomSheet.startActivity(intent);
                                manageSubscriptionsBottomSheet.q();
                                break;
                        }
                    }
                });
                final int i3 = 1;
                materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: brb
                    public final /* synthetic */ ManageSubscriptionsBottomSheet b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32 = i3;
                        ManageSubscriptionsBottomSheet manageSubscriptionsBottomSheet = this.b;
                        switch (i32) {
                            case 0:
                                manageSubscriptionsBottomSheet.j();
                                break;
                            default:
                                Intent intent = new Intent("android.intent.action.VIEW");
                                Uri parse = Uri.parse("https://play.google.com/store/account/subscriptions?package=" + manageSubscriptionsBottomSheet.requireContext().getPackageName());
                                parse.getClass();
                                intent.setData(parse);
                                manageSubscriptionsBottomSheet.startActivity(intent);
                                manageSubscriptionsBottomSheet.q();
                                break;
                        }
                    }
                });
                linearLayout.getClass();
                return linearLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ManageSubscriptionModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.manage_subscription);
        string.getClass();
        return string;
    }
}
