package com.sofascore.results.sharemodal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import defpackage.ez0;
import defpackage.g7;
import defpackage.hcb;
import defpackage.ich;
import defpackage.ldh;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z0;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/BaseSinglePageShareModal;", "Lcom/sofascore/results/sharemodal/BaseShareModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSinglePageShareModal extends BaseShareModal {
    public ez0 w;
    public final mqi x = ypa.b(new z0(this, 26));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.modal_share_single_page, (ViewGroup) v().l, false);
        int i = R.id.gradient_overlay;
        View B = nq8.B(R.id.gradient_overlay, inflate);
        if (B != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                i = R.id.touchBlocker;
                View B2 = nq8.B(R.id.touchBlocker, inflate);
                if (B2 != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this.w = new ez0(frameLayout, B, recyclerView, B2, 28);
                    frameLayout.getClass();
                    return frameLayout;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    public final ich H() {
        return (ich) this.x.getValue();
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    public final RecyclerView K() {
        ez0 ez0Var = this.w;
        if (ez0Var != null) {
            return (RecyclerView) ez0Var.d;
        }
        Intrinsics.i("modalBinding");
        throw null;
    }

    public abstract void L();

    public abstract g7 M();

    public abstract void N();

    @Override // com.sofascore.results.sharemodal.BaseShareModal, com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ez0 ez0Var = this.w;
        if (ez0Var == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) ez0Var.d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        ez0 ez0Var2 = this.w;
        if (ez0Var2 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        ((RecyclerView) ez0Var2.d).setAdapter(M());
        ez0 ez0Var3 = this.w;
        if (ez0Var3 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        ((View) ez0Var3.e).setOnTouchListener(new ldh(view, true));
        L();
        N();
        g7 M = M();
        LayoutInflater layoutInflater = getLayoutInflater();
        ez0 ez0Var4 = this.w;
        if (ez0Var4 != null) {
            g7.o(M, (ImageView) hcb.b(layoutInflater, (FrameLayout) ez0Var4.b).b, 6);
        } else {
            Intrinsics.i("modalBinding");
            throw null;
        }
    }
}
