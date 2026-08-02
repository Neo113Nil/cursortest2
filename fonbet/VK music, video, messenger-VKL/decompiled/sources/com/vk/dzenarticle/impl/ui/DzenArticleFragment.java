package com.vk.dzenarticle.impl.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.toggle.features.FeedFeatures;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.anj;
import xsna.b25;
import xsna.bfm;
import xsna.bn50;
import xsna.cro;
import xsna.cw50;
import xsna.db4;
import xsna.dgm;
import xsna.dmx0;
import xsna.dro;
import xsna.enj;
import xsna.fe0;
import xsna.fpf0;
import xsna.fro;
import xsna.gt7;
import xsna.gzs;
import xsna.h20;
import xsna.hue;
import xsna.ia4;
import xsna.iaz0;
import xsna.jai;
import xsna.k87;
import xsna.kai;
import xsna.kbj0;
import xsna.msy;
import xsna.ncb;
import xsna.nzw;
import xsna.oro;
import xsna.oz50;
import xsna.ozl;
import xsna.pvh;
import xsna.qcy;
import xsna.qdz;
import xsna.qfj;
import xsna.qro;
import xsna.rrv0;
import xsna.s3q0;
import xsna.u6z0;
import xsna.uro;
import xsna.vro;
import xsna.wcy;
import xsna.wnh;
import xsna.xxs;
import xsna.yzs;
import xsna.zu50;

/* compiled from: DzenArticleFragment.kt */
/* loaded from: classes18.dex */
public final class DzenArticleFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] R;
    public final Object N;
    public final nzw O;
    public final Object P;
    public final a Q;

    /* compiled from: DzenArticleFragment.kt */
    public final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String Db;
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                DzenArticleFragment dzenArticleFragment = DzenArticleFragment.this;
                if (hashCode == -42973149) {
                    if (action.equals("com.vkontakte.android.AD_REPORT_CANCELLED")) {
                        Bundle extras = intent.getExtras();
                        Object obj = extras != null ? extras.get("ad_entry") : null;
                        NewsEntry newsEntry = obj instanceof NewsEntry ? (NewsEntry) obj : null;
                        Db = newsEntry != null ? newsEntry.Db() : null;
                        qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                        dzenArticleFragment.fo().b(new cro.a(Db));
                        return;
                    }
                    return;
                }
                if (hashCode == 1398742544 && action.equals("com.vkontakte.android.AD_REPORTED")) {
                    Bundle extras2 = intent.getExtras();
                    String string = extras2 != null ? extras2.getString("adchoice_option_text") : null;
                    Bundle extras3 = intent.getExtras();
                    Object obj2 = extras3 != null ? extras3.get("ad_entry") : null;
                    NewsEntry newsEntry2 = obj2 instanceof NewsEntry ? (NewsEntry) obj2 : null;
                    Db = newsEntry2 != null ? newsEntry2.Db() : null;
                    qcy<Object>[] qcyVarArr2 = DzenArticleFragment.R;
                    dzenArticleFragment.fo().b(new cro.b(string, Db));
                }
            }
        }
    }

    /* compiled from: DzenArticleFragment.kt */
    public static final class b extends oz50 {
        public b(String str, String str2) {
            super(DzenArticleFragment.class, null, null);
            s(false);
            this.j.putString("article_id", str);
            this.j.putString("entry_point", str2);
        }
    }

    /* compiled from: DzenArticleFragment.kt */
    public static final class c implements oro {
        public final String a;
        public final String b;
        public final b25 d;
        public final kbj0 e;
        public final qdz f;
        public final NewsfeedRouter g;
        public final ia4 j;
        public final db4 k;
        public final qro c = new qro(new vro());
        public final dro h = new dro();
        public final uro i = new uro();

        public c(String str, String str2, b25 b25Var, kbj0 kbj0Var, qdz qdzVar, NewsfeedRouter newsfeedRouter, AudienceResearchComponent audienceResearchComponent) {
            this.a = str;
            this.b = str2;
            this.d = b25Var;
            this.e = kbj0Var;
            this.f = qdzVar;
            this.g = newsfeedRouter;
            this.j = audienceResearchComponent.b();
            this.k = audienceResearchComponent.Z2();
        }

        @Override // xsna.oro
        public final qro a() {
            return this.c;
        }

        @Override // xsna.oro
        public final uro b() {
            return this.i;
        }

        @Override // xsna.oro
        public final ia4 c() {
            return this.j;
        }

        @Override // xsna.oro
        public final dro d() {
            return this.h;
        }

        @Override // xsna.oro
        public final String e() {
            return this.a;
        }

        @Override // xsna.oro
        public final db4 f() {
            return this.k;
        }

        @Override // xsna.oro
        public final String getEntryPoint() {
            return this.b;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DzenArticleFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
    }

    public DzenArticleFragment() {
        qfj qfjVar = new qfj(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, qfjVar);
        h20 h20Var = new h20(this, 25);
        int i = wcy.c;
        this.O = new nzw(fpf0.e(bn50.class, wcy.a.a(fpf0.d(DzenArticleState.class)), wcy.a.a(fpf0.d(DzenArticleState.class)), wcy.a.a(fpf0.d(cro.class)), wcy.a.a(fpf0.d(fro.class))).toString(), this, h20Var);
        this.P = msy.a(lazyThreadSafetyMode, new pvh(this, 3));
        this.Q = new a();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo().b(cro.c.b);
        return true;
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(882527450);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(882527450, i2, -1, "com.vk.dzenarticle.impl.ui.DzenArticleFragment.ScreenContent (DzenArticleFragment.kt:145)");
            }
            rrv0.d(null, null, null, null, kai.c(-398995051, new ncb(this, 1), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new hue(this, i, 2);
        }
    }

    public final bn50<DzenArticleState, DzenArticleState, cro, fro> fo() {
        qcy<Object> qcyVar = R[0];
        return (bn50) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void go(int i, fe0 fe0Var, yzs<? super cw50, ? super zu50, ? super fe0, s3q0> yzsVar, gzs<s3q0> gzsVar) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        zu50 zu50Var = new zu50(i, fe0Var, mo2getContext);
        u6z0 u6z0Var = zu50Var.a;
        u6z0Var.a.i(String.valueOf(((c) this.N.getValue()).d.c().b));
        if (dmx0.c()) {
            u6z0Var.a.g("is_whitelist_internet", "1");
        }
        zu50Var.i = new d(yzsVar, fe0Var, gzsVar);
        zu50Var.g();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.AD_REPORTED");
        intentFilter.addAction("com.vkontakte.android.AD_REPORT_CANCELLED");
        anj.d(mo2getContext, this.Q, intentFilter, null, 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setContent(new jai(-551913931, new k87(this, 4), true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        fo().b(cro.m.b);
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            enj.s(mo2getContext, this.Q);
        }
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        xxs xxsVar = (xxs) this.P.getValue();
        dgm dgmVar = xxsVar.b;
        if (dgmVar != null) {
            dgmVar.invoke();
        }
        xxsVar.b = null;
        fo().b(cro.n.b);
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo().b(cro.o.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FeedFeatures feedFeatures = FeedFeatures.DZEN_TOP_AD;
        feedFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(feedFeatures)) {
            go(2014793, new fe0(), new com.vk.friends.requests.impl.allrequests.presentation.a(this, 2), new wnh(this, 11));
        }
        FeedFeatures feedFeatures2 = FeedFeatures.DZEN_MIDDLE_AD;
        feedFeatures2.getClass();
        if (bVar.a(feedFeatures2)) {
            go(2014922, new fe0(), new gt7(this, 2), new bfm(this, 4));
        }
    }

    /* compiled from: DzenArticleFragment.kt */
    public static final class d implements zu50.c {
        public final /* synthetic */ yzs<cw50, zu50, fe0, s3q0> a;
        public final /* synthetic */ fe0 b;
        public final /* synthetic */ gzs<s3q0> c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(yzs<? super cw50, ? super zu50, ? super fe0, s3q0> yzsVar, fe0 fe0Var, gzs<s3q0> gzsVar) {
            this.a = yzsVar;
            this.b = fe0Var;
            this.c = gzsVar;
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            zu50Var.a();
            this.c.invoke();
        }

        @Override // xsna.zu50.c
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            this.a.invoke(cw50Var, zu50Var, this.b);
        }

        @Override // xsna.zu50.c
        public final void onClick() {
        }

        @Override // xsna.zu50.c
        @ozl
        public final void onVideoComplete() {
        }

        @Override // xsna.zu50.c
        @ozl
        public final void onVideoPause() {
        }

        @Override // xsna.zu50.c
        @ozl
        public final void onVideoPlay() {
        }

        @Override // xsna.zu50.c
        public final void b(zu50 zu50Var) {
        }

        @Override // xsna.zu50.c
        public final void a(View view, zu50 zu50Var) {
        }
    }
}
