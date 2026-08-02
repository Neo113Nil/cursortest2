package com.vk.draftslist.impl.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.akh;
import xsna.beo;
import xsna.bn50;
import xsna.c1c0;
import xsna.eeo;
import xsna.f9h;
import xsna.fpf0;
import xsna.iuc0;
import xsna.jai;
import xsna.k6k;
import xsna.kai;
import xsna.mag;
import xsna.msy;
import xsna.nzw;
import xsna.oz50;
import xsna.p4r;
import xsna.p870;
import xsna.qcy;
import xsna.ql2;
import xsna.rrv0;
import xsna.sdo;
import xsna.tdo;
import xsna.u61;
import xsna.w1;
import xsna.wcy;
import xsna.xyh;
import xsna.zdo;

/* compiled from: DraftsListFragment.kt */
/* loaded from: classes18.dex */
public final class DraftsListFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final Object N;
    public final nzw O;
    public final Object P;

    /* compiled from: DraftsListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DraftsListFragment.kt */
    public static final class b implements zdo {
        public final Context a;
        public final UserId b;
        public final NewsfeedRouter c;
        public final c1c0 d;
        public final beo e;
        public final p870 f;
        public final p4r g;

        public b(DraftsListFragment draftsListFragment, UserId userId, NewsFeedComponent newsFeedComponent) {
            this.a = draftsListFragment.requireContext();
            this.b = userId;
            this.c = newsFeedComponent.l0();
            newsFeedComponent.n0();
            this.d = iuc0.b;
            this.e = new beo(userId);
            this.f = newsFeedComponent.w();
            this.g = new p4r();
        }

        @Override // xsna.zdo
        public final beo a() {
            return this.e;
        }

        @Override // xsna.zdo
        public final p4r b() {
            return this.g;
        }

        @Override // xsna.zdo
        public final Context getContext() {
            return this.a;
        }

        @Override // xsna.zdo
        public final c1c0 n0() {
            return this.d;
        }

        @Override // xsna.zdo
        public final UserId q() {
            return this.b;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DraftsListFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    public DraftsListFragment() {
        akh akhVar = new akh(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, akhVar);
        xyh xyhVar = new xyh(this, 7);
        int i = wcy.c;
        this.O = new nzw(fpf0.e(bn50.class, wcy.a.a(fpf0.d(DraftsListState.class)), wcy.a.a(fpf0.d(DraftsListState.class)), wcy.a.a(fpf0.d(sdo.class)), wcy.a.a(fpf0.d(tdo.class))).toString(), this, xyhVar);
        this.P = msy.a(lazyThreadSafetyMode, new mag(this, 16));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo().b(sdo.a.b);
        return true;
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(686062677);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(686062677, i2, -1, "com.vk.draftslist.impl.ui.DraftsListFragment.ScreenContent (DraftsListFragment.kt:101)");
            }
            rrv0.d(null, null, null, null, kai.c(-1597200006, new f9h(this, 3), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new u61(this, i, 4);
        }
    }

    public final bn50<DraftsListState, DraftsListState, sdo, tdo> fo() {
        qcy<Object> qcyVar = Q[0];
        return (bn50) this.O.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setContent(new jai(140331226, new w1(this, 3), true));
        return composeView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((b) this.N.getValue()).f.g((eeo) this.P.getValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo().b(sdo.n.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        super.onViewCreated(view, bundle);
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.c(new k6k(this, 4));
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.l0("closeDrafts", this, new ql2(this, 18));
    }
}
