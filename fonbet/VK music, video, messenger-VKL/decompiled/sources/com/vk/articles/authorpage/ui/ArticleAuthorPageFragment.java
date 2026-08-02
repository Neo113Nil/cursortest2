package com.vk.articles.authorpage.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.DefaultErrorView;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.movika.sdk.base.logic.processor.actions.h;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abg0;
import xsna.ay0;
import xsna.b3;
import xsna.bbj0;
import xsna.bwt0;
import xsna.cvk;
import xsna.dg;
import xsna.dhr0;
import xsna.e4h;
import xsna.ee;
import xsna.f4m;
import xsna.fkq0;
import xsna.fnj;
import xsna.g3p0;
import xsna.gn3;
import xsna.gzs;
import xsna.h03;
import xsna.hg;
import xsna.iah0;
import xsna.izs;
import xsna.jm0;
import xsna.krv0;
import xsna.m33;
import xsna.msy;
import xsna.nds;
import xsna.o25;
import xsna.oq;
import xsna.oz50;
import xsna.pm3;
import xsna.qcy;
import xsna.qhh0;
import xsna.qm3;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tm3;
import xsna.too0;
import xsna.tq;
import xsna.um3;
import xsna.uqm0;
import xsna.xwk;
import xsna.zx0;

/* compiled from: ArticleAuthorPageFragment.kt */
/* loaded from: classes15.dex */
public final class ArticleAuthorPageFragment extends BaseMvpFragment<tm3> implements nds, too0, qhh0 {
    public static final int f0 = iah0.a(100);
    public static final int g0 = iah0.a(150);
    public static final int h0 = iah0.a(40);
    public AppBarLayout T;
    public Toolbar U;
    public VkText V;
    public VkPlaceholder W;
    public MenuItem X;
    public ArticleAuthorPageRecyclerPaginatedView Y;
    public VkText Z;
    public gn3 a0;
    public qm3 b0;
    public String d0;
    public UserId c0 = UserId.d;
    public final Object e0 = msy.a(LazyThreadSafetyMode.NONE, new b3(this, 6));

    /* compiled from: ArticleAuthorPageFragment.kt */
    public static final class a extends oz50 {
        public static final /* synthetic */ int m = 0;

        /* compiled from: ArticleAuthorPageFragment.kt */
        /* renamed from: com.vk.articles.authorpage.ui.ArticleAuthorPageFragment$a$a, reason: collision with other inner class name */
        public static final class C0378a {
            public static a a(UserId userId) {
                a aVar = new a();
                aVar.j.putParcelable("owner_id", userId);
                return aVar;
            }
        }

        public a() {
            super(ArticleAuthorPageFragment.class, null, null);
        }
    }

    /* compiled from: ArticleAuthorPageFragment.kt */
    public final class b extends AbstractPaginatedView.i {
        public b() {
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void c() {
            View emptyView;
            ArticleAuthorPageFragment articleAuthorPageFragment = ArticleAuthorPageFragment.this;
            pm3 pm3Var = articleAuthorPageFragment.a0.e;
            boolean z = pm3Var.f;
            Owner owner = pm3Var.a;
            if (z && ((!pm3Var.a() || pm3Var.h) && !o25.a().a(owner.b))) {
                ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView = articleAuthorPageFragment.Y;
                if (articleAuthorPageRecyclerPaginatedView != null) {
                    articleAuthorPageRecyclerPaginatedView.x(fkq0.b(owner.b), pm3Var.h);
                }
                articleAuthorPageFragment.oo(pm3Var, false);
                return;
            }
            ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView2 = articleAuthorPageFragment.Y;
            TextView textView = (articleAuthorPageRecyclerPaginatedView2 == null || (emptyView = articleAuthorPageRecyclerPaginatedView2.getEmptyView()) == null) ? null : (TextView) emptyView.findViewById(R.id.text);
            if (textView != null) {
                textView.setText(o25.a().a(owner.b) ? R.string.article_author_current_user_empty : fkq0.d(owner.b) ? R.string.article_author_profile_empty : R.string.article_author_group_empty);
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void d(Throwable th) {
            ArticleAuthorPageFragment articleAuthorPageFragment = ArticleAuthorPageFragment.this;
            ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView = articleAuthorPageFragment.Y;
            ee errorView = articleAuthorPageRecyclerPaginatedView != null ? articleAuthorPageRecyclerPaginatedView.getErrorView() : null;
            if (errorView instanceof DefaultErrorView) {
                if (!(th instanceof VKApiExecutionException) || !((VKApiExecutionException) th).J()) {
                    VkPlaceholder vkPlaceholder = articleAuthorPageFragment.W;
                    if (vkPlaceholder != null) {
                        vkPlaceholder.setVisibility(0);
                    }
                    errorView.setVisibility(0);
                    VkText vkText = articleAuthorPageFragment.Z;
                    if (vkText != null) {
                        f4m.j(vkText);
                        return;
                    }
                    return;
                }
                f4m.j(errorView);
                VkText vkText2 = articleAuthorPageFragment.Z;
                if (vkText2 != null) {
                    vkText2.setVisibility(0);
                }
                VkPlaceholder vkPlaceholder2 = articleAuthorPageFragment.W;
                if (vkPlaceholder2 != null) {
                    vkPlaceholder2.setVisibility(4);
                }
                AppBarLayout appBarLayout = articleAuthorPageFragment.T;
                if (appBarLayout != null) {
                    appBarLayout.g(true, false, true);
                }
            }
        }
    }

    /* compiled from: ArticleAuthorPageFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ArticleAuthorPageSortType, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ArticleAuthorPageSortType articleAuthorPageSortType) {
            ArticleAuthorPageSortType articleAuthorPageSortType2 = articleAuthorPageSortType;
            gn3 gn3Var = ((ArticleAuthorPageFragment) this.receiver).a0;
            if (gn3Var != null) {
                gn3Var.f = articleAuthorPageSortType2;
                gn3Var.b.jo();
                com.vk.lists.c cVar = gn3Var.g;
                if (cVar != null) {
                    cVar.p(false);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ArticleAuthorPageFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ArticleAuthorPageFragment articleAuthorPageFragment = (ArticleAuthorPageFragment) this.receiver;
            int i = ArticleAuthorPageFragment.f0;
            articleAuthorPageFragment.no();
            return s3q0.a;
        }
    }

    public static void ko(Toolbar toolbar) {
        abg0 abg0Var = dhr0.t;
        g3p0.a(toolbar, abg0Var.c(R.attr.vk_ui_text_muted), abg0Var.c(R.attr.vk_ui_text_muted), abg0Var.c(R.attr.vk_ui_icon_accent_themed), ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_accent_themed)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        Toolbar toolbar = this.U;
        if (toolbar != null) {
            ko(toolbar);
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final tm3 io() {
        return this.a0;
    }

    public final void jo() {
        qm3 qm3Var = this.b0;
        if (qm3Var == null) {
            qm3Var = null;
        }
        if (qm3Var.getItemCount() > 0) {
            qm3 qm3Var2 = this.b0;
            ((ListDataSet) (qm3Var2 == null ? null : qm3Var2).c).B(1, (qm3Var2 != null ? qm3Var2 : null).getItemCount() - 1);
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    public final void lo(Throwable th) {
        if (th != null) {
            h03.b(th);
        } else {
            cvk.u(R.string.error, false);
        }
    }

    public final void mo(boolean z) {
        if (!z) {
            VkPlaceholder vkPlaceholder = this.W;
            if (vkPlaceholder != null) {
                vkPlaceholder.setBackgroundResource(0);
                return;
            }
            return;
        }
        VkPlaceholder vkPlaceholder2 = this.W;
        if (vkPlaceholder2 != null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.f0(R.drawable.scrim_bottom_180, R.attr.vk_ui_background_secondary, vkPlaceholder2);
        }
    }

    public final void no() {
        pm3 pm3Var;
        gn3 gn3Var = this.a0;
        if (gn3Var != null && (pm3Var = gn3Var.e) != null) {
            if (pm3Var.a()) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    return;
                }
                gn3 gn3Var2 = this.a0;
                pm3 pm3Var2 = gn3Var2 != null ? gn3Var2.e : null;
                if (pm3Var2 != null && fkq0.b(pm3Var2.a.b)) {
                    Integer num = pm3Var2.d;
                    xwk.e().h0().k(activity, new e4h.b(num != null && num.intValue() == 1, pm3Var2.e, pm3Var2.g, pm3Var2.h, pm3Var2.j, pm3Var2.k, pm3Var2.l), new zx0(this, 4), new ay0(this, 3));
                    return;
                } else {
                    gn3 gn3Var3 = this.a0;
                    if (gn3Var3 != null) {
                        tm3.y3(gn3Var3);
                        return;
                    }
                    return;
                }
            }
        }
        gn3 gn3Var4 = this.a0;
        if (gn3Var4 != null) {
            tm3.y3(gn3Var4);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AppBarLayout appBarLayout;
        super.onConfigurationChanged(configuration);
        if (fnj.d(kn())) {
            return;
        }
        qm3 qm3Var = this.b0;
        if (qm3Var == null) {
            qm3Var = null;
        }
        if (qm3Var.getItemCount() != 0 || (appBarLayout = this.T) == null) {
            return;
        }
        appBarLayout.g(configuration.orientation == 1, false, true);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("owner_id")) == null) {
            userId = UserId.d;
        }
        this.c0 = userId;
        Bundle arguments2 = getArguments();
        this.d0 = arguments2 != null ? arguments2.getString(X3.j.D) : null;
        if (!fkq0.c(this.c0) && ((str = this.d0) == null || str.length() == 0)) {
            L.l("You can't open ArticleAuthorPageFragment without authorId or domain");
            cvk.u(R.string.error, false);
            finish();
        }
        this.a0 = new gn3(this);
        if (fkq0.c(this.c0)) {
            gn3 gn3Var = this.a0;
            if (gn3Var != null) {
                gn3Var.c = this.c0;
                return;
            }
            return;
        }
        gn3 gn3Var2 = this.a0;
        if (gn3Var2 != null) {
            gn3Var2.d = this.d0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.article_author_page_fragment, viewGroup, false);
        this.W = (VkPlaceholder) inflate.findViewById(R.id.header_container);
        this.U = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.V = (VkText) inflate.findViewById(R.id.custom_toolbar_title);
        this.Z = (VkText) inflate.findViewById(R.id.privacy_error);
        final Toolbar toolbar = this.U;
        if (toolbar != null) {
            if (!fnj.d(kn())) {
                toolbar.setNavigationIcon(m33.a(R.drawable.vk_icon_arrow_left_outline_28, toolbar.getContext()));
                toolbar.setNavigationContentDescription(R.string.accessibility_back);
                toolbar.setNavigationOnClickListener(new um3(this, 0));
            }
            MenuItem add = toolbar.getMenu().add(R.string.share);
            this.X = add;
            add.setShowAsAction(2);
            add.setIcon(m33.a(R.drawable.vk_icon_share_outline_24, toolbar.getContext()));
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.vm3
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    String a2;
                    UserId userId;
                    String str;
                    ArticleAuthorPageFragment articleAuthorPageFragment = ArticleAuthorPageFragment.this;
                    Toolbar toolbar2 = toolbar;
                    gn3 gn3Var = articleAuthorPageFragment.a0;
                    if (gn3Var == null || (str = gn3Var.d) == null || (a2 = tdj.a(new StringBuilder("https://"), a0a.d, "/@", str)) == null) {
                        gn3 gn3Var2 = articleAuthorPageFragment.a0;
                        a2 = (gn3Var2 == null || (userId = gn3Var2.c) == null) ? null : tdj.a(new StringBuilder("https://"), a0a.d, "/@", String.valueOf(userId.b));
                    }
                    if (a2 == null) {
                        return true;
                    }
                    bbj0.b bVar = bbj0.a;
                    Context context = toolbar2.getContext();
                    bVar.getClass();
                    bbj0.b.d.a(context).i(a2, false);
                    return true;
                }
            });
            add.setVisible(false);
            ko(toolbar);
        }
        VkText vkText = this.V;
        if (vkText != null) {
            bwt0.i0(vkText, new jm0(this, 1));
        }
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) inflate.findViewById(R.id.collapsing_toolbar_layout);
        collapsingToolbarLayout.setScrimAnimationDuration(100L);
        collapsingToolbarLayout.setScrimVisibleHeightTrigger(f0);
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        this.T = appBarLayout;
        if (appBarLayout != null) {
            if (!fnj.d(kn()) && kn().getResources().getConfiguration().orientation == 2) {
                appBarLayout.g(false, false, true);
            }
            appBarLayout.a(new AppBarLayout.f() { // from class: xsna.wm3
                @Override // com.google.android.material.appbar.AppBarLayout.a
                public final void a(AppBarLayout appBarLayout2, int i) {
                    int i2 = ArticleAuthorPageFragment.f0;
                    int totalScrollRange = appBarLayout2.getTotalScrollRange() + i;
                    int i3 = ArticleAuthorPageFragment.g0;
                    float f = totalScrollRange <= i3 ? totalScrollRange / i3 : 1.0f;
                    ArticleAuthorPageFragment articleAuthorPageFragment = ArticleAuthorPageFragment.this;
                    VkPlaceholder vkPlaceholder = articleAuthorPageFragment.W;
                    if (vkPlaceholder != null) {
                        vkPlaceholder.setAlpha(f);
                    }
                    int i4 = ArticleAuthorPageFragment.h0;
                    if (totalScrollRange <= i4) {
                        VkText vkText2 = articleAuthorPageFragment.V;
                        if (vkText2 != null) {
                            vkText2.setAlpha(1 - (totalScrollRange / i4));
                            return;
                        }
                        return;
                    }
                    VkText vkText3 = articleAuthorPageFragment.V;
                    if (vkText3 != null) {
                        vkText3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
            });
        }
        ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView = (ArticleAuthorPageRecyclerPaginatedView) inflate.findViewById(R.id.list);
        this.Y = articleAuthorPageRecyclerPaginatedView;
        if (articleAuthorPageRecyclerPaginatedView != null) {
            articleAuthorPageRecyclerPaginatedView.setUiStateCallbacks(new b());
        }
        ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView2 = this.Y;
        if (articleAuthorPageRecyclerPaginatedView2 != null) {
            new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, articleAuthorPageRecyclerPaginatedView2).a();
        }
        ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView3 = this.Y;
        if (articleAuthorPageRecyclerPaginatedView3 != null) {
            articleAuthorPageRecyclerPaginatedView3.setToggleSubscription(new dg(this, 4));
        }
        qm3 qm3Var = new qm3(new c(1, this, ArticleAuthorPageFragment.class, "onArticleSortTypeSelected", "onArticleSortTypeSelected(Lcom/vk/articles/authorpage/ArticleAuthorPageSortType;)V", 0), new hg(this, 4));
        this.b0 = qm3Var;
        ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView4 = this.Y;
        if (articleAuthorPageRecyclerPaginatedView4 != null) {
            articleAuthorPageRecyclerPaginatedView4.setAdapter(qm3Var);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.T = null;
        this.W = null;
        this.U = null;
        this.V = null;
        this.Y = null;
        this.Z = null;
        super.onDestroyView();
    }

    public final void oo(pm3 pm3Var, boolean z) {
        f fVar = new f(this, 3);
        VkPlaceholder vkPlaceholder = this.W;
        VkPlaceholder.a.b bVar = null;
        if (vkPlaceholder != null) {
            String f = pm3Var.a.f(200);
            vkPlaceholder.setTop(f != null ? new VkPlaceholder.c.a(new c.d(f, null), iah0.a(72), new g(fVar, 3), 8) : null);
        }
        Owner owner = pm3Var.a;
        boolean z2 = pm3Var.f;
        int i = (fkq0.d(owner.b) && z2) ? R.plurals.article_friends : R.plurals.article_subscribers;
        int i2 = (fkq0.d(owner.b) && z2) ? R.string.article_friends_formatted : R.string.article_subscribers_formatted;
        VkPlaceholder vkPlaceholder2 = this.W;
        if (vkPlaceholder2 != null) {
            String str = owner.c;
            vkPlaceholder2.setMiddle(new VkPlaceholder.b(str != null ? new VkPlaceholder.b.c(new h(fVar, 2), oq.d(tlo0.Companion, str)) : null, new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, uqm0.i(pm3Var.b, i, i2, true)))));
        }
        VkPlaceholder vkPlaceholder3 = this.W;
        if (vkPlaceholder3 != null) {
            if (z) {
                bVar = new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) tq.h(tlo0.Companion, pm3Var.a() ? R.string.article_subscribed : R.string.article_subscribe), (gzs) new d(0, this, ArticleAuthorPageFragment.class, "toggleSubscription", "toggleSubscription()V", 0), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, pm3Var.a() ? VkButton.Mode.Secondary : VkButton.Mode.Primary, (VkButton.Appearance) null, false, 412), null, null, null, 8);
            }
            vkPlaceholder3.setBottom(bVar);
        }
    }

    public final void po(pm3 pm3Var) {
        gn3 gn3Var;
        pm3 pm3Var2;
        ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView;
        boolean z = pm3Var.f;
        boolean a2 = pm3Var.a();
        boolean z2 = pm3Var.h;
        oo(pm3Var, !z || a2);
        if (!z || a2 || (gn3Var = this.a0) == null || (pm3Var2 = gn3Var.e) == null || (articleAuthorPageRecyclerPaginatedView = this.Y) == null) {
            return;
        }
        articleAuthorPageRecyclerPaginatedView.x(fkq0.b(pm3Var2.a.b), z2);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView;
        AppBarLayout appBarLayout = this.T;
        if (appBarLayout != null) {
            appBarLayout.g(true, false, true);
        }
        ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView = this.Y;
        if (articleAuthorPageRecyclerPaginatedView != null && (recyclerView = articleAuthorPageRecyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView.scrollToPosition(0);
        }
        return true;
    }
}
