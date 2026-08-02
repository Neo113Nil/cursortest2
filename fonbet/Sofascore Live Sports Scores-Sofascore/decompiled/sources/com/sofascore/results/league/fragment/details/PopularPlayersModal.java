package com.sofascore.results.league.fragment.details;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import defpackage.ad2;
import defpackage.as9;
import defpackage.ate;
import defpackage.b1d;
import defpackage.beh;
import defpackage.cce;
import defpackage.duf;
import defpackage.e6b;
import defpackage.eqb;
import defpackage.joa;
import defpackage.mme;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.u1f;
import defpackage.u6b;
import defpackage.w1f;
import defpackage.wca;
import defpackage.x42;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/details/PopularPlayersModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopularPlayersModal extends Hilt_PopularPlayersModal {
    public final otk B = new otk(duf.a.getOrCreateKotlinClass(yta.class), new w1f(this, 0), new w1f(this, 2), new w1f(this, 1));
    public final joa C = ypa.a(ysa.c, new ate(this, 6));
    public final boolean D = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        RecyclerView recyclerView = new RecyclerView(requireContext());
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        joa joaVar = this.C;
        recyclerView.setAdapter((u1f) joaVar.getValue());
        s(recyclerView);
        View inflate = layoutInflater.inflate(R.layout.popular_players_modal_header, (ViewGroup) recyclerView, false);
        int i = R.id.guideline;
        if (((Guideline) nq8.B(R.id.guideline, inflate)) != null) {
            i = R.id.league_image;
            ImageView imageView = (ImageView) nq8.B(R.id.league_image, inflate);
            if (imageView != null) {
                i = R.id.league_name_text;
                TextView textView = (TextView) nq8.B(R.id.league_name_text, inflate);
                if (textView != null) {
                    i = R.id.players_label;
                    if (((TextView) nq8.B(R.id.players_label, inflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        otk otkVar = this.B;
                        UniqueTournament uniqueTournament = ((yta) otkVar.getValue()).o().getUniqueTournament();
                        as9.q(imageView, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, ((yta) otkVar.getValue()).o().getId(), null);
                        textView.setText(((yta) otkVar.getValue()).o().getName());
                        u1f u1fVar = (u1f) joaVar.getValue();
                        constraintLayout.getClass();
                        u1fVar.p(u1fVar.g.size(), constraintLayout);
                        ((yta) otkVar.getValue()).B.e(getViewLifecycleOwner(), new eqb(15, new mme(this, 8)));
                        e6b e6bVar = e6b.a;
                        ad2 ad2Var = qv5.a;
                        u6b viewLifecycleOwner = getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        LinkedHashMap linkedHashMap = qv5.b;
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(x42.class);
                        Object obj = linkedHashMap.get(orCreateKotlinClass);
                        if (obj == null) {
                            obj = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass, obj);
                        }
                        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new cce(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
                        UniqueTournament uniqueTournament2 = ((yta) otkVar.getValue()).o().getUniqueTournament();
                        this.t.a = uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null;
                        return recyclerView;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PopularPlayersModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
