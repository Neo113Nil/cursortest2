package com.sofascore.results.event.details.view.tv.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.crj;
import defpackage.d3k;
import defpackage.dd;
import defpackage.dk2;
import defpackage.duf;
import defpackage.h3k;
import defpackage.ilj;
import defpackage.ix1;
import defpackage.joa;
import defpackage.mqi;
import defpackage.nc6;
import defpackage.otk;
import defpackage.qdj;
import defpackage.s2j;
import defpackage.uri;
import defpackage.w1i;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/details/view/tv/dialog/TvChannelCountriesDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TvChannelCountriesDialog extends Hilt_TvChannelCountriesDialog {
    public final otk B;
    public final mqi C;
    public dd D;
    public final joa E;
    public Function1 F;

    public TvChannelCountriesDialog() {
        s2j s2jVar = new s2j(this, 15);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(s2jVar, 16));
        this.B = new otk(duf.a.getOrCreateKotlinClass(nc6.class), new d3k(a, 1), new ilj(6, this, a), new d3k(a, 2));
        this.C = ypa.b(new w1i(this, 28));
        this.E = ypa.a(ysaVar, new ix1(14, new crj(14), this));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        ((FrameLayout) v().m).setVisibility(0);
        dd f = dd.f(layoutInflater, (FrameLayout) v().l);
        this.D = f;
        LinearLayout linearLayout = (LinearLayout) f.b;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        mqi mqiVar = this.C;
        h3k h3kVar = (h3k) mqiVar.getValue();
        uri uriVar = new uri(this, 15);
        h3kVar.getClass();
        h3kVar.a.d = uriVar;
        dd ddVar = this.D;
        if (ddVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) ddVar.d;
        Context requireContext = requireContext();
        requireContext.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), ao2.s(32, requireContext));
        dd ddVar2 = this.D;
        if (ddVar2 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        ((RecyclerView) ddVar2.d).setAdapter((h3k) mqiVar.getValue());
        dd ddVar3 = this.D;
        if (ddVar3 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView2 = (RecyclerView) ddVar3.d;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        dd ddVar4 = this.D;
        if (ddVar4 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        s((RecyclerView) ddVar4.d);
        dd ddVar5 = this.D;
        if (ddVar5 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        ((dk2) ddVar5.c).b.setVisibility(8);
        dd ddVar6 = this.D;
        if (ddVar6 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        ((RecyclerView) ddVar6.d).setVisibility(0);
        ((nc6) this.B.getValue()).h.e(getViewLifecycleOwner(), new ygi(11, new qdj(this, 10)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TvChannelsCountriesModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.where_to_watch);
        string.getClass();
        return string;
    }
}
