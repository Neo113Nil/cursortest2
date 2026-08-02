package com.sofascore.results.event.details.view.tv.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.c3k;
import defpackage.ce4;
import defpackage.d3k;
import defpackage.dd;
import defpackage.duf;
import defpackage.f3k;
import defpackage.fwi;
import defpackage.ilj;
import defpackage.ivj;
import defpackage.joa;
import defpackage.mc6;
import defpackage.mwj;
import defpackage.nq8;
import defpackage.otk;
import defpackage.rq3;
import defpackage.s2j;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ygi;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/details/view/tv/dialog/TvChannelContributionDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TvChannelContributionDialog extends Hilt_TvChannelContributionDialog {
    public final otk B;
    public dd C;
    public MaterialButton D;
    public final joa E;
    public final joa F;
    public final joa G;
    public Function1 H;

    public TvChannelContributionDialog() {
        s2j s2jVar = new s2j(this, 13);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(s2jVar, 14));
        this.B = new otk(duf.a.getOrCreateKotlinClass(mc6.class), new fwi(a, 29), new ilj(5, this, a), new d3k(a, 0));
        this.E = ypa.a(ysaVar, new c3k(this, 1));
        this.F = ypa.a(ysaVar, new c3k(this, 2));
        this.G = ypa.a(ysaVar, new c3k(this, 3));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View B(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.tv_channels_dialog_footer, (ViewGroup) v().k, false);
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.dialog_button_close, inflate);
        if (materialButton == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.dialog_button_close)));
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        materialButton.setEnabled(false);
        materialButton.setText(requireContext().getString(R.string.submit));
        materialButton.setOnClickListener(new ivj(3, this, materialButton));
        this.D = materialButton;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        ((FrameLayout) v().m).setVisibility(0);
        View inflate = layoutInflater.inflate(R.layout.text_float_layout, (ViewGroup) v().m, false);
        TextView textView = (TextView) nq8.B(R.id.float_text, inflate);
        if (textView == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.float_text)));
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        textView.setText(requireContext().getString(R.string.select_channel) + "\n" + ((String) this.F.getValue()));
        textView.setGravity(8388627);
        frameLayout.setBackground(null);
        return frameLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        dd f = dd.f(layoutInflater, (FrameLayout) v().l);
        this.C = f;
        LinearLayout linearLayout = (LinearLayout) f.b;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        otk otkVar = this.B;
        mc6 mc6Var = (mc6) otkVar.getValue();
        String str = (String) this.E.getValue();
        str.getClass();
        xw3.L(un0.z(mc6Var), null, null, new ce4(mc6Var, str, (rq3) null, 19), 3);
        joa joaVar = this.G;
        ((f3k) joaVar.getValue()).l = new c3k(this, 0);
        dd ddVar = this.C;
        if (ddVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) ddVar.d;
        Context requireContext = requireContext();
        requireContext.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), ao2.s(32, requireContext));
        dd ddVar2 = this.C;
        if (ddVar2 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        ((RecyclerView) ddVar2.d).setAdapter((f3k) joaVar.getValue());
        dd ddVar3 = this.C;
        if (ddVar3 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView2 = (RecyclerView) ddVar3.d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        z8e.b0(recyclerView2, requireContext2, false, false, null, 22);
        dd ddVar4 = this.C;
        if (ddVar4 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        s((RecyclerView) ddVar4.d);
        ((mc6) otkVar.getValue()).g.e(getViewLifecycleOwner(), new ygi(10, new mwj(7, this, view)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TvChannelsContributionModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.where_to_watch);
        string.getClass();
        return string;
    }
}
