package com.sofascore.results.tv.fragments;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import defpackage.bba;
import defpackage.cd5;
import defpackage.dd;
import defpackage.duf;
import defpackage.g4k;
import defpackage.gz8;
import defpackage.km5;
import defpackage.kr9;
import defpackage.lzb;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.obd;
import defpackage.otk;
import defpackage.pbd;
import defpackage.xxb;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/tv/fragments/NewChannelsDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NewChannelsDialog extends DialogFragment {
    public dd r;
    public int t;
    public final otk q = new otk(duf.a.getOrCreateKotlinClass(g4k.class), new obd(this, 0), new obd(this, 2), new obd(this, 1));
    public final mqi s = ypa.b(new xxb(this, 14));

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Dialog l = super.l(bundle);
        l.requestWindowFeature(1);
        return l;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(0, R.style.RedesignFullScreenDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dialog_new_channels, viewGroup, false);
        int i = R.id.dialog_header;
        if (((AppBarLayout) nq8.B(R.id.dialog_header, inflate)) != null) {
            i = R.id.dialog_toolbar;
            Toolbar toolbar = (Toolbar) nq8.B(R.id.dialog_toolbar, inflate);
            if (toolbar != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                if (recyclerView != null) {
                    this.r = new dd((CoordinatorLayout) inflate, toolbar, recyclerView, 11);
                    toolbar.setNavigationOnClickListener(new cd5(this, 23));
                    Bundle requireArguments = requireArguments();
                    requireArguments.getClass();
                    List list = (ArrayList) gz8.M(requireArguments, "NEW_CHANNELS", ArrayList.class);
                    if (list == null) {
                        list = km5.a;
                    }
                    this.t = requireArguments().getInt("TOTAL_SELECTED_CHANNELS");
                    mqi mqiVar = this.s;
                    ((pbd) mqiVar.getValue()).F(list);
                    pbd pbdVar = (pbd) mqiVar.getValue();
                    bba bbaVar = new bba(this, 19);
                    pbdVar.getClass();
                    pbdVar.a.d = bbaVar;
                    dd ddVar = this.r;
                    if (ddVar == null) {
                        Intrinsics.i("dialogBinding");
                        throw null;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) ddVar.d;
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    z8e.b0(recyclerView2, requireContext, false, false, null, 30);
                    recyclerView2.setAdapter((pbd) mqiVar.getValue());
                    lzb lzbVar = new lzb(requireContext());
                    int color = recyclerView2.getContext().getColor(R.color.n_lv_4);
                    lzbVar.c = color;
                    ShapeDrawable shapeDrawable = lzbVar.a;
                    lzbVar.a = shapeDrawable;
                    shapeDrawable.setTint(color);
                    lzbVar.g = false;
                    recyclerView2.addItemDecoration(lzbVar);
                    dd ddVar2 = this.r;
                    if (ddVar2 == null) {
                        Intrinsics.i("dialogBinding");
                        throw null;
                    }
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ddVar2.b;
                    coordinatorLayout.getClass();
                    return coordinatorLayout;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        dd ddVar = this.r;
        if (ddVar != null) {
            ((Toolbar) ddVar.c).setOnMenuItemClickListener(new kr9(this, 16));
        } else {
            Intrinsics.i("dialogBinding");
            throw null;
        }
    }
}
