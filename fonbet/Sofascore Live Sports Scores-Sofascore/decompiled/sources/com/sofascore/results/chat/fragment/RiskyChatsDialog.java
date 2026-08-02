package com.sofascore.results.chat.fragment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.ao2;
import defpackage.duf;
import defpackage.eqb;
import defpackage.hy1;
import defpackage.mme;
import defpackage.nm5;
import defpackage.nq8;
import defpackage.otk;
import defpackage.pq2;
import defpackage.pte;
import defpackage.rq3;
import defpackage.s5g;
import defpackage.un0;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.z3f;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/chat/fragment/RiskyChatsDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RiskyChatsDialog extends Hilt_RiskyChatsDialog {
    public final otk B = new otk(duf.a.getOrCreateKotlinClass(pq2.class), new s5g(this, 0), new s5g(this, 2), new s5g(this, 1));
    public z3f C;
    public nm5 D;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        Context requireContext = requireContext();
        requireContext.getClass();
        int v = ao2.v(16, requireContext);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int v2 = ao2.v(8, requireContext2);
        TextView textView = new TextView(requireContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(v2, v2, v2, v2);
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundTintList(ColorStateList.valueOf(requireContext().getColor(R.color.surface_2)));
        textView.setPaddingRelative(v, v2, v, v2);
        textView.setBackgroundResource(R.drawable.rectangle_16dp_corners);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setGravity(16);
        textView.setText(R.string.risky_rooms_label);
        textView.setCompoundDrawablePadding(v2);
        textView.setTextAlignment(5);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(textView.getContext().getColor(R.color.n_lv_3)));
        textView.setTextAppearance(R.style.BodySmall);
        return textView;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.risky_chats_dialog, (ViewGroup) v().l, false);
        int i = R.id.empty_risky_chat;
        GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_risky_chat, inflate);
        if (graphicLarge != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                this.C = new z3f(3, recyclerView, (LinearLayout) inflate, graphicLarge);
                Context requireContext = requireContext();
                requireContext.getClass();
                this.D = new nm5(requireContext, 3);
                z3f z3fVar = this.C;
                if (z3fVar == null) {
                    Intrinsics.i("dialogBinding");
                    throw null;
                }
                RecyclerView recyclerView2 = (RecyclerView) z3fVar.d;
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                z8e.b0(recyclerView2, requireContext2, false, false, null, 30);
                nm5 nm5Var = this.D;
                if (nm5Var == null) {
                    Intrinsics.i("dialogAdapter");
                    throw null;
                }
                recyclerView2.setAdapter(nm5Var);
                recyclerView2.setVisibility(8);
                nm5 nm5Var2 = this.D;
                if (nm5Var2 == null) {
                    Intrinsics.i("dialogAdapter");
                    throw null;
                }
                nm5Var2.a.d = new pte(this, 13);
                z3f z3fVar2 = this.C;
                if (z3fVar2 == null) {
                    Intrinsics.i("dialogBinding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) z3fVar2.b;
                linearLayout.getClass();
                return linearLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        z3f z3fVar = this.C;
        rq3 rq3Var = null;
        if (z3fVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        s((RecyclerView) z3fVar.d);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
        otk otkVar = this.B;
        pq2 pq2Var = (pq2) otkVar.getValue();
        xw3.L(un0.z(pq2Var), null, null, new hy1(pq2Var, rq3Var, 9), 3);
        ((pq2) otkVar.getValue()).q.e(this, new eqb(22, new mme(this, 24)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "RiskyChatsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.risky_chats);
        string.getClass();
        return string;
    }
}
