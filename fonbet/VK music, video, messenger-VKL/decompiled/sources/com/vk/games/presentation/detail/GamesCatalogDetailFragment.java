package com.vk.games.presentation.detail;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeGameCatalogItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.atm;
import xsna.bpn0;
import xsna.btm;
import xsna.cu1;
import xsna.dv2;
import xsna.e370;
import xsna.e3m;
import xsna.epx;
import xsna.exi0;
import xsna.gy;
import xsna.i21;
import xsna.ibt;
import xsna.ig;
import xsna.jg0;
import xsna.km50;
import xsna.lbt;
import xsna.m1o;
import xsna.mat;
import xsna.mk50;
import xsna.msy;
import xsna.nat;
import xsna.nm0;
import xsna.nvg;
import xsna.nw50;
import xsna.obh;
import xsna.oz50;
import xsna.rha;
import xsna.s200;
import xsna.sim;
import xsna.tat;
import xsna.vg0;
import xsna.vk50;
import xsna.w9t;
import xsna.wat;
import xsna.ww50;
import xsna.x1q0;

/* compiled from: GamesCatalogDetailFragment.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogDetailFragment extends MviImplFragment<tat, ibt, mat> {
    public static final /* synthetic */ int d0 = 0;
    public nat Q;
    public final bpn0 R = new bpn0(new obh(this, 10));
    public final bpn0 S = new bpn0(new sim(this, 7));
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;

    /* compiled from: GamesCatalogDetailFragment.kt */
    public static final class a extends oz50 {
        public a(GamesHeaderSectionInfo gamesHeaderSectionInfo, String str) {
            super(GamesCatalogDetailFragment.class, null, null);
            this.j.putParcelable("games_catalog_detail_section_info", gamesHeaderSectionInfo);
            this.j.putString("games_catalog_visit_source", str);
        }
    }

    public GamesCatalogDetailFragment() {
        atm atmVar = new atm(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, atmVar);
        this.U = msy.a(lazyThreadSafetyMode, new m1o(this, 5));
        this.V = msy.a(lazyThreadSafetyMode, new btm(this, 7));
        this.W = msy.a(lazyThreadSafetyMode, new vg0(15));
        this.X = msy.a(lazyThreadSafetyMode, new cu1(13));
        this.Y = msy.a(lazyThreadSafetyMode, new dv2(19));
        this.Z = msy.a(lazyThreadSafetyMode, new jg0(21));
        this.a0 = msy.a(lazyThreadSafetyMode, new nm0(15));
        this.b0 = msy.a(lazyThreadSafetyMode, new ig(10));
        this.c0 = msy.a(lazyThreadSafetyMode, new i21(10));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        nat natVar = new nat(new rha(((Number) this.b0.getValue()).floatValue(), ((Boolean) this.W.getValue()).booleanValue(), ((Boolean) this.a0.getValue()).booleanValue(), ((Boolean) this.c0.getValue()).booleanValue()), this, requireContext());
        this.Q = natVar;
        return new mk50.c(natVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ibt ibtVar = (ibt) ao50Var;
        nat natVar = this.Q;
        if (natVar != null) {
            natVar.f(ibtVar, new gy(1, this, GamesCatalogDetailFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 11));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((tat) vk50Var).k.a(new nvg(this, 28), this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Context mo2getContext;
        ww50 v;
        Activity h;
        fo().d = true;
        if (((Boolean) this.X.getValue()).booleanValue()) {
            FragmentActivity activity = getActivity();
            boolean z = (activity == null || (h = e3m.h(activity)) == null || !h.isTaskRoot()) ? false : true;
            Context mo2getContext2 = mo2getContext();
            Integer valueOf = (mo2getContext2 == null || (v = s200.v(mo2getContext2)) == null) ? null : Integer.valueOf(v.b.n().p());
            if (z && valueOf != null && valueOf.intValue() == 1 && (mo2getContext = mo2getContext()) != null) {
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).a0(mo2getContext);
                finish();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final w9t fo() {
        return (w9t) this.Z.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w9t fo = fo();
        fo.a = null;
        fo.b = null;
        fo.c = null;
        fo.d = false;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        fo().e = true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        w9t fo = fo();
        fo.e = false;
        fo.f.clear();
        fo.g.clear();
        fo.h.clear();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new tat((GamesHeaderSectionInfo) this.R.getValue(), fo(), (wat) this.T.getValue(), (lbt) this.V.getValue(), ((Boolean) this.Y.getValue()).booleanValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        GamesHeaderSectionInfo gamesHeaderSectionInfo = (GamesHeaderSectionInfo) this.R.getValue();
        if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Section) {
            SectionIdType sectionIdType = ((GamesHeaderSectionInfo.Section) gamesHeaderSectionInfo).c;
            if (epx.f(sectionIdType, SectionIdType.CategoriesScreen.c)) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.APPS_GAMES_CATEGORIES;
            } else if (sectionIdType instanceof SectionIdType.Custom) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_CATEGORY;
            } else if (epx.f(sectionIdType, SectionIdType.FriendsActivity.c)) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_FRIENDS_ACTIVITY;
            } else if (epx.f(sectionIdType, SectionIdType.Installed.c)) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_MY;
            } else if (epx.f(sectionIdType, SectionIdType.New.c)) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_NEW;
            } else if (epx.f(sectionIdType, SectionIdType.Notifications.c)) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_NOTIFICATIONS;
            } else {
                if (!epx.f(sectionIdType, SectionIdType.Recommended.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_RECOMMENDED;
            }
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GAMES_CATEGORY;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
        fo().getClass();
        uiTrackingScreen.e.removeIf(new x1q0(new exi0(SchemeStat$TypeGameCatalogItem.class, 13)));
        nw50 a2 = fo().a();
        if (a2 == null) {
            return;
        }
        uiTrackingScreen.a(a2.a);
        uiTrackingScreen.f = a2.b;
    }
}
