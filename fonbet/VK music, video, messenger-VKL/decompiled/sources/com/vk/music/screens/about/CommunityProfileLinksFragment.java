package com.vk.music.screens.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.music.screens.about.entity.CommunityProfileLinksState;
import com.vk.profile.community.details.links.feature.CommunityProfileLinksArgs;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.dkg;
import xsna.fpf0;
import xsna.iqh;
import xsna.izs;
import xsna.k87;
import xsna.kai;
import xsna.l9h;
import xsna.msy;
import xsna.oa5;
import xsna.oz50;
import xsna.qcy;
import xsna.qqh;
import xsna.r37;
import xsna.s200;
import xsna.sqh;
import xsna.t9e;
import xsna.u1h0;
import xsna.vdi;
import xsna.wcy;
import xsna.yzs;

/* compiled from: CommunityProfileLinksFragment.kt */
/* loaded from: classes.dex */
public final class CommunityProfileLinksFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] P;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new l9h(this, 2));
    public final u1h0 O;

    /* compiled from: CommunityProfileLinksFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends oz50 {
        public a(CommunityProfileLinksArgs communityProfileLinksArgs) {
            super(CommunityProfileLinksFragment.class, null, null);
            this.j.putParcelable("arguments_community_profile_links_fragment", communityProfileLinksArgs);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunityProfileLinksFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public CommunityProfileLinksFragment() {
        t9e t9eVar = new t9e(this, 8);
        int i = wcy.c;
        this.O = s200.N(this, fpf0.e(bn50.class, wcy.a.a(fpf0.d(CommunityProfileLinksState.class)), wcy.a.a(fpf0.d(CommunityProfileLinksState.class)), wcy.a.a(fpf0.d(iqh.class)), wcy.a.a(fpf0.d(qqh.class))).toString(), this, t9eVar);
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1985375512);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-1985375512, i2, -1, "com.vk.music.screens.about.CommunityProfileLinksFragment.ScreenContent (CommunityProfileLinksFragment.kt:54)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new dkg(this, 4);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new sqh(this, null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, vdi.a, M, 384, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.l(new k87(this, i, 2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(-304447293, new oa5(this, 3)));
        return composeView;
    }
}
