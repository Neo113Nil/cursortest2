package com.sofascore.results.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.newNetwork.TeamUniqueTournament;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.ate;
import defpackage.gz8;
import defpackage.mqi;
import defpackage.pte;
import defpackage.q6f;
import defpackage.w74;
import defpackage.ypa;
import defpackage.z8e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/PreviousTournamentsModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PreviousTournamentsModal extends BaseModalBottomSheetDialog {
    public w74 w;
    public final mqi x = ypa.b(new ate(this, 8));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        this.w = w74.a(layoutInflater, (FrameLayout) v().l);
        mqi mqiVar = this.x;
        q6f q6fVar = (q6f) mqiVar.getValue();
        pte pteVar = new pte(this, 5);
        q6fVar.getClass();
        q6fVar.a.d = pteVar;
        w74 w74Var = this.w;
        if (w74Var == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView = w74Var.c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 22);
        s(recyclerView);
        recyclerView.setAdapter((q6f) mqiVar.getValue());
        w74 w74Var2 = this.w;
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
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "TOURNAMENT_LIST", ArrayList.class);
        if (M == null) {
            a70.p("Serializable TOURNAMENT_LIST not found");
            return;
        }
        q6f q6fVar = (q6f) this.x.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) M) {
            if (obj instanceof TeamUniqueTournament) {
                arrayList.add(obj);
            }
        }
        q6fVar.F(arrayList);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PreviousTournamentModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.previous_tournament);
        string.getClass();
        return string;
    }
}
