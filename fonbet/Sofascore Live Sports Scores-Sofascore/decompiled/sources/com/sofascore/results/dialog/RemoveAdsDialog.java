package com.sofascore.results.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.dialog.RemoveAdsDialog;
import defpackage.av;
import defpackage.bv;
import defpackage.c1f;
import defpackage.dn;
import defpackage.duf;
import defpackage.dv;
import defpackage.ez0;
import defpackage.hjg;
import defpackage.ke0;
import defpackage.nv;
import defpackage.s01;
import defpackage.vm;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/RemoveAdsDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoveAdsDialog extends Hilt_RemoveAdsDialog {
    public boolean v = true;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        final int i = 1;
        ke0.l = true;
        int i2 = s01.i;
        Context requireContext = requireContext();
        requireContext.getClass();
        final s01 o = hjg.o(requireContext, duf.a.getOrCreateKotlinClass(c1f.class));
        ez0 e = ez0.e(o.getLayoutInflater());
        ((TextView) e.e).setText(o.getContext().getString(R.string.remove_ads_popup_text));
        ((TextView) e.d).setText(o.getContext().getString(R.string.remove_ads_popup_body));
        ((MaterialCheckBox) e.c).setVisibility(8);
        final int i3 = 0;
        o.setCanceledOnTouchOutside(false);
        ScrollView scrollView = (ScrollView) e.b;
        vm vmVar = o.g;
        vmVar.g = scrollView;
        vmVar.h = false;
        o.g(-1, o.getContext().getString(R.string.uninstall_popup_button_continue), new DialogInterface.OnClickListener(this) { // from class: gyf
            public final /* synthetic */ RemoveAdsDialog b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i3;
                s01 s01Var = o;
                RemoveAdsDialog removeAdsDialog = this.b;
                switch (i5) {
                    case 0:
                        removeAdsDialog.v = false;
                        Context context = s01Var.getContext();
                        context.getClass();
                        nv.k0(context, bv.REMOVE_ADS, av.CTA_CLICK, dv.POPUP_QUEUE, null, null, 48);
                        int i6 = UpgradeSofascoreActivity.M;
                        FragmentActivity requireActivity = removeAdsDialog.requireActivity();
                        requireActivity.getClass();
                        e2f.k(requireActivity, false);
                        s01Var.dismiss();
                        break;
                    default:
                        removeAdsDialog.v = false;
                        Context context2 = s01Var.getContext();
                        context2.getClass();
                        nv.k0(context2, bv.REMOVE_ADS, av.CLOSE, dv.POPUP_QUEUE, null, null, 48);
                        FragmentActivity requireActivity2 = removeAdsDialog.requireActivity();
                        requireActivity2.getClass();
                        z8e.W(requireActivity2);
                        s01Var.dismiss();
                        break;
                }
            }
        });
        o.g(-3, o.getContext().getString(R.string.no_thanks), new DialogInterface.OnClickListener(this) { // from class: gyf
            public final /* synthetic */ RemoveAdsDialog b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i;
                s01 s01Var = o;
                RemoveAdsDialog removeAdsDialog = this.b;
                switch (i5) {
                    case 0:
                        removeAdsDialog.v = false;
                        Context context = s01Var.getContext();
                        context.getClass();
                        nv.k0(context, bv.REMOVE_ADS, av.CTA_CLICK, dv.POPUP_QUEUE, null, null, 48);
                        int i6 = UpgradeSofascoreActivity.M;
                        FragmentActivity requireActivity = removeAdsDialog.requireActivity();
                        requireActivity.getClass();
                        e2f.k(requireActivity, false);
                        s01Var.dismiss();
                        break;
                    default:
                        removeAdsDialog.v = false;
                        Context context2 = s01Var.getContext();
                        context2.getClass();
                        nv.k0(context2, bv.REMOVE_ADS, av.CLOSE, dv.POPUP_QUEUE, null, null, 48);
                        FragmentActivity requireActivity2 = removeAdsDialog.requireActivity();
                        requireActivity2.getClass();
                        z8e.W(requireActivity2);
                        s01Var.dismiss();
                        break;
                }
            }
        });
        o.setOnShowListener(new dn(o, 3));
        return o;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.v) {
            Context requireContext = requireContext();
            requireContext.getClass();
            nv.k0(requireContext, bv.REMOVE_ADS, av.CLOSE, dv.POPUP_QUEUE, null, null, 48);
        }
    }
}
