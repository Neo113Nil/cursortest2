package com.sofascore.results.fantasy.competition.chat;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import defpackage.csk;
import defpackage.gf0;
import defpackage.jc4;
import defpackage.mc4;
import defpackage.o3a;
import defpackage.p1f;
import defpackage.qp6;
import defpackage.rfo;
import defpackage.s5d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FantasyCompetitionChatFragment extends AbstractChatFragment {
    public csk O;
    public boolean P = false;
    public boolean Q = false;

    @Override // com.sofascore.results.chat.fragment.Hilt_AbstractChatFragment
    public final void B() {
        if (this.Q) {
            return;
        }
        this.Q = true;
        qp6 qp6Var = (qp6) f();
        FantasyCompetitionChatFragment fantasyCompetitionChatFragment = (FantasyCompetitionChatFragment) this;
        mc4 mc4Var = ((jc4) qp6Var).a;
        fantasyCompetitionChatFragment.k = (p1f) mc4Var.M0.get();
        fantasyCompetitionChatFragment.t = (s5d) mc4Var.F0.get();
    }

    public final void Q() {
        if (this.O == null) {
            this.O = new csk(super.getContext(), this);
            this.P = rfo.E(super.getContext());
        }
    }

    @Override // com.sofascore.results.chat.fragment.Hilt_AbstractChatFragment, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.P) {
            return null;
        }
        Q();
        return this.O;
    }

    @Override // com.sofascore.results.chat.fragment.Hilt_AbstractChatFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        csk cskVar = this.O;
        o3a.p(cskVar == null || gf0.c(cskVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Q();
        B();
    }

    @Override // com.sofascore.results.chat.fragment.Hilt_AbstractChatFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new csk(onGetLayoutInflater, this));
    }

    @Override // com.sofascore.results.chat.fragment.Hilt_AbstractChatFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Q();
        B();
    }
}
