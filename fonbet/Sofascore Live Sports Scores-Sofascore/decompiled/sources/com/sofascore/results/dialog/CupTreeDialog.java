package com.sofascore.results.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import defpackage.duf;
import defpackage.h63;
import defpackage.hl6;
import defpackage.j63;
import defpackage.joa;
import defpackage.mqi;
import defpackage.otk;
import defpackage.p24;
import defpackage.rh4;
import defpackage.rq3;
import defpackage.u74;
import defpackage.un0;
import defpackage.v74;
import defpackage.w74;
import defpackage.xd6;
import defpackage.xw3;
import defpackage.y1;
import defpackage.y7;
import defpackage.yd6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/CupTreeDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CupTreeDialog extends Hilt_CupTreeDialog {
    public w74 B;
    public final mqi C = ypa.b(new h63(this, 12));
    public final otk D;

    public CupTreeDialog() {
        joa a = ypa.a(ysa.c, new j63(new j63(this, 6), 7));
        this.D = new otk(duf.a.getOrCreateKotlinClass(yd6.class), new p24(a, 3), new y1(23, this, a), new p24(a, 4));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        this.B = w74.a(layoutInflater, (FrameLayout) v().l);
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("FROM_UNIQUE_TOURNAMENT_ID")) : null;
        mqi mqiVar = this.C;
        v74 v74Var = (v74) mqiVar.getValue();
        hl6 hl6Var = new hl6(26, this, valueOf);
        v74Var.getClass();
        v74Var.a.d = hl6Var;
        w74 w74Var = this.B;
        if (w74Var == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView = w74Var.c;
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        z8e.b0(recyclerView, requireActivity, false, false, null, 22);
        s(recyclerView);
        recyclerView.setAdapter((v74) mqiVar.getValue());
        w74 w74Var2 = this.B;
        if (w74Var2 != null) {
            return w74Var2.b;
        }
        Intrinsics.i("dialogBinding");
        throw null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        otk otkVar = this.D;
        ((yd6) otkVar.getValue()).g.e(getViewLifecycleOwner(), new y7(12, new u74(this, 0)));
        ArrayList<Integer> integerArrayList = requireArguments().getIntegerArrayList("ID_LIST");
        rq3 rq3Var = null;
        if (integerArrayList != null) {
            yd6 yd6Var = (yd6) otkVar.getValue();
            xw3.L(un0.z(yd6Var), null, null, new rh4(yd6Var, integerArrayList, rq3Var, 17), 3);
        }
        int i = requireArguments().getInt("EVENT_ID");
        if (i > 0) {
            yd6 yd6Var2 = (yd6) otkVar.getValue();
            xw3.L(un0.z(yd6Var2), null, null, new xd6(yd6Var2, i, rq3Var, 1), 3);
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CupTreeModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.series);
        string.getClass();
        return string;
    }
}
