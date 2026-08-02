package com.sofascore.results.fantasy.competition.chat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import defpackage.bsk;
import defpackage.dr2;
import defpackage.gca;
import defpackage.joa;
import defpackage.krk;
import defpackage.kt4;
import defpackage.mqi;
import defpackage.pp6;
import defpackage.srk;
import defpackage.u9l;
import defpackage.x9l;
import defpackage.yhk;
import defpackage.yn8;
import defpackage.ypa;
import defpackage.ysa;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/chat/FantasyCompetitionChatFragment;", "Lcom/sofascore/results/chat/fragment/AbstractChatFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionChatFragment extends Hilt_FantasyCompetitionChatFragment {
    public final mqi R = ypa.b(new pp6(this, 0));
    public final joa S = ypa.a(ysa.c, new pp6(this, 1));

    public static final void R(FantasyCompetitionChatFragment fantasyCompetitionChatFragment, View view, x9l x9lVar) {
        int i;
        Window window;
        u9l u9lVar = x9lVar.a;
        view.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            i = u9lVar.i(WindowInsets.Type.ime()).d;
        } else {
            FragmentActivity activity = fantasyCompetitionChatFragment.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(32);
            }
            i = 0;
        }
        view.setPadding(0, 0, 0, i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer valueOf = Integer.valueOf(u9lVar.i(519).d);
        if (i != 0) {
            valueOf = null;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, valueOf != null ? valueOf.intValue() : 0);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    /* renamed from: E */
    public final dr2 getR() {
        return (dr2) this.R.getValue();
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final gca G() {
        return (gca) this.S.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FantasyCompetitionChatTab";
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        krk krkVar = this.l;
        krkVar.getClass();
        ConstraintLayout constraintLayout = ((yn8) krkVar).a;
        kt4 kt4Var = new kt4(this, 16);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(constraintLayout, kt4Var);
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final void N() {
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
