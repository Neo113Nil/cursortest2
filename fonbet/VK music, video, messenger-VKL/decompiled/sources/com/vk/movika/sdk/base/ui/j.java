package com.vk.movika.sdk.base.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.common.links.AwayLink;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.profile.tool.view.CommunityProfileTabsContainerLayout;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vk.voip.ui.watchmovie.selectsource.dialog.ui.VoipSelectMovieViewTabs;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import ru.mail.libverify.controls.VerificationVKCListener;
import xsna.bfx;
import xsna.bl2;
import xsna.cij0;
import xsna.cs00;
import xsna.d4p;
import xsna.dlv;
import xsna.dmi;
import xsna.e1;
import xsna.e7;
import xsna.fj1;
import xsna.iie;
import xsna.it80;
import xsna.k00;
import xsna.k4s;
import xsna.k7w;
import xsna.klk;
import xsna.kt20;
import xsna.l2k;
import xsna.l79;
import xsna.mh4;
import xsna.mwa;
import xsna.n79;
import xsna.os00;
import xsna.par0;
import xsna.ps00;
import xsna.q41;
import xsna.qcy;
import xsna.qjc;
import xsna.r9;
import xsna.rnm;
import xsna.s2h;
import xsna.u4u;
import xsna.us6;
import xsna.xur;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements io.reactivex.rxjava3.functions.l, c.b, io.reactivex.rxjava3.functions.j, SwipeRefreshLayout.e, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, VerificationVKCListener, qjc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        ps00 ps00Var = (ps00) this.c;
        os00 os00Var = ps00Var.u;
        if (os00Var != null) {
            ps00Var.l.a(new cs00.j(os00Var.b));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean a() {
        boolean z;
        ViewPager2 viewPager2;
        RecyclerView recyclerView = ((com.vk.profile.community.impl.ui.profile.f) this.c).l;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        CommunityProfileTabsContainerLayout communityProfileTabsContainerLayout = (CommunityProfileTabsContainerLayout) recyclerView.findViewById(R.id.vp_community_profile_content_layout);
        if (communityProfileTabsContainerLayout != null && (viewPager2 = communityProfileTabsContainerLayout.t) != null) {
            int currentItem = viewPager2.getCurrentItem();
            CommunityProfileTabsContainerLayout.a aVar = communityProfileTabsContainerLayout.u;
            if (aVar != null) {
                z = aVar.m0(currentItem);
                return canScrollVertically || z;
            }
        }
        z = false;
        if (canScrollVertically) {
            return true;
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (cij0) ((dmi) this.c).invoke(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        us6 us6Var = (us6) this.c;
        int i2 = us6.p1;
        gVar.q((i < 0 || i >= VoipSelectMovieViewTabs.h().size()) ? "" : us6Var.requireContext().getString(((VoipSelectMovieViewTabs) VoipSelectMovieViewTabs.h().get(i)).titleRes));
    }

    @Override // io.reactivex.rxjava3.functions.j
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (n79) ((l79) this.c).invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // ru.mail.libverify.controls.VerificationVKCListener
    public void onCompletedVKC(String str, String str2) {
        dlv dlvVar = (dlv) ((e7) this.c).c;
        par0.a.getClass();
        par0.e("[LibverifySession] ecosystem libverify session " + str + " has been verified");
        ((CountDownLatch) dlvVar.b).countDown();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((u4u) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((q41) obj2).invoke(obj);
            case 2:
                return (Photo) ((fj1) obj2).invoke(obj);
            case 3:
                return (bl2) ((fj1) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((mh4) obj2).invoke(obj);
            case 5:
            case 8:
            case 11:
            case 17:
            case 19:
            case 23:
            case 25:
            case 26:
            default:
                return (Boolean) ((u4u) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((r9) obj2).invoke(obj);
            case 7:
                int i2 = BroadcastScheduledFragment.U;
                return (it80) ((k00) obj2).invoke(obj);
            case 9:
                return (mwa.a) ((e1) obj2).invoke(obj);
            case 10:
                return (s2h) ((fj1) obj2).invoke(obj);
            case 12:
                xur xurVar = (xur) obj2;
                xurVar.getClass();
                return new BitmapDrawable(xurVar.c.getViewContext().getResources(), (Bitmap) obj);
            case 13:
                return (k4s) ((rnm) obj2).invoke(obj);
            case 14:
                return (Boolean) ((fj1) obj2).invoke(obj);
            case 15:
                return (Boolean) ((fj1) obj2).invoke(obj);
            case 16:
                return (klk) ((fj1) obj2).invoke(obj);
            case 18:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return (Boolean) ((u4u) obj2).invoke(obj);
            case 20:
                return (List) ((iie) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((l2k) obj2).invoke(obj);
            case 22:
                return (k7w) ((u4u) obj2).invoke(obj);
            case 24:
                return (bfx.a) ((u4u) obj2).invoke(obj);
            case 27:
                return (List) ((l2k) obj2).invoke(obj);
            case 28:
                return (d4p.a) ((kt20) obj2).invoke(obj);
        }
    }
}
