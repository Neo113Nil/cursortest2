package com.sofascore.results.tv.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.d25;
import defpackage.duf;
import defpackage.on2;
import defpackage.otk;
import defpackage.u3k;
import defpackage.uri;
import defpackage.v9g;
import defpackage.vri;
import defpackage.xrh;
import defpackage.yhk;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/tv/fragments/TVChannelsPickerModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TVChannelsPickerModal extends BaseModalBottomSheetDialog {
    public final otk w = new otk(duf.a.getOrCreateKotlinClass(u3k.class), new vri(this, 0), new vri(this, 2), new vri(this, 1));
    public d25 x;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_tv_channels_picker, (ViewGroup) v().l, false);
        if (inflate == null) {
            yhk.s("rootView");
            return null;
        }
        this.x = new d25((RecyclerView) inflate, 0);
        s(F().b);
        return F().b;
    }

    public final d25 F() {
        d25 d25Var = this.x;
        if (d25Var != null) {
            return d25Var;
        }
        Intrinsics.i("dialogBinding");
        throw null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
        Context requireContext = requireContext();
        requireContext.getClass();
        otk otkVar = this.w;
        ArrayList arrayList = ((u3k) otkVar.getValue()).m;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        on2 on2Var = new on2(requireContext, v9g.G(requireContext2, arrayList));
        List list = ((u3k) otkVar.getValue()).p;
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        on2Var.F(v9g.G(requireContext3, list));
        on2Var.a.d = new uri(this, 0);
        RecyclerView recyclerView = F().b;
        Context requireContext4 = requireContext();
        requireContext4.getClass();
        recyclerView.addItemDecoration(new xrh(requireContext4, b.i(((u3k) otkVar.getValue()).m)));
        RecyclerView recyclerView2 = F().b;
        Context requireContext5 = requireContext();
        requireContext5.getClass();
        z8e.b0(recyclerView2, requireContext5, false, false, null, 30);
        F().b.setAdapter(on2Var);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TvChannelsPickerModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.countries);
        string.getClass();
        return string;
    }
}
