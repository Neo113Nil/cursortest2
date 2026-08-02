package com.sofascore.results.fantasy.league.chat;

import defpackage.dr2;
import defpackage.gca;
import defpackage.joa;
import defpackage.mqi;
import defpackage.q37;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/league/chat/FantasyLeagueChatFragment;", "Lcom/sofascore/results/chat/fragment/AbstractChatFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueChatFragment extends Hilt_FantasyLeagueChatFragment {
    public final joa R;
    public final mqi S;
    public final joa T;

    public FantasyLeagueChatFragment() {
        q37 q37Var = new q37(this, 0);
        ysa ysaVar = ysa.c;
        this.R = ypa.a(ysaVar, q37Var);
        this.S = ypa.b(new q37(this, 1));
        this.T = ypa.a(ysaVar, new q37(this, 2));
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    /* renamed from: E */
    public final dr2 getR() {
        return (dr2) this.S.getValue();
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final gca G() {
        return (gca) this.T.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FantasyLeagueChatTab";
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final void N() {
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
