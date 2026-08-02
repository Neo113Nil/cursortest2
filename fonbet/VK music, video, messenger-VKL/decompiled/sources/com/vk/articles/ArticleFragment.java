package com.vk.articles;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.a;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.PollInfo;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.fragments.FavesFragment;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.movika.sdk.base.observable.e0;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.toggle.features.ComFeatures;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.g;
import defpackage.h;
import defpackage.i;
import defpackage.i0;
import defpackage.j;
import defpackage.k;
import defpackage.r;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import io.reactivex.rxjava3.internal.operators.observable.v2;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.abg0;
import xsna.ahn;
import xsna.anj;
import xsna.ao3;
import xsna.asu0;
import xsna.awt0;
import xsna.b40;
import xsna.bir0;
import xsna.bo3;
import xsna.bpn0;
import xsna.bvv0;
import xsna.bwt0;
import xsna.c0m;
import xsna.ce60;
import xsna.co3;
import xsna.dhr0;
import xsna.do3;
import xsna.e1r0;
import xsna.e3m;
import xsna.e43;
import xsna.e5;
import xsna.enj;
import xsna.enq;
import xsna.epx;
import xsna.f1o;
import xsna.f4m;
import xsna.fes;
import xsna.fkq0;
import xsna.fnj;
import xsna.fxv0;
import xsna.fz2;
import xsna.hd60;
import xsna.hf8;
import xsna.i70;
import xsna.iah0;
import xsna.ies;
import xsna.io3;
import xsna.iu1;
import xsna.iwg0;
import xsna.jbs;
import xsna.jjc;
import xsna.jo3;
import xsna.k1;
import xsna.kbj0;
import xsna.kes;
import xsna.ko3;
import xsna.krv0;
import xsna.kwg0;
import xsna.lo3;
import xsna.lp3;
import xsna.m33;
import xsna.msy;
import xsna.n93;
import xsna.nds;
import xsna.nr4;
import xsna.oen;
import xsna.omw;
import xsna.os2;
import xsna.p40;
import xsna.p870;
import xsna.p90;
import xsna.pla;
import xsna.pro0;
import xsna.qr;
import xsna.qs2;
import xsna.rn3;
import xsna.rp3;
import xsna.rpu;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sp3;
import xsna.sub;
import xsna.sz;
import xsna.t01;
import xsna.too0;
import xsna.uqm0;
import xsna.uqo;
import xsna.vd7;
import xsna.vl1;
import xsna.wz;
import xsna.xp3;
import xsna.xqu;
import xsna.xwk;
import xsna.yfb;
import xsna.yh;
import xsna.yn3;
import xsna.zn3;

/* compiled from: ArticleFragment.kt */
/* loaded from: classes15.dex */
public final class ArticleFragment extends BaseMvpFragment<rn3> implements fes, ies, a.InterfaceC0377a, too0, kes, nds {
    public static final /* synthetic */ int E0 = 0;
    public lp3 C0;
    public Article T;
    public Article U;
    public SnippetAttachment V;
    public QueryParameters W;
    public String Y;
    public boolean Z;
    public View a0;
    public FrameLayout b0;
    public View c0;
    public FrameLayout d0;
    public FrameLayout e0;
    public ProgressBar f0;
    public DefaultErrorView g0;
    public Toolbar h0;
    public FrameLayout i0;
    public ImageView j0;
    public VKCircleImageView k0;
    public ImageView l0;
    public com.vk.articles.a m0;
    public b n0;
    public View o0;
    public View p0;
    public ImageView q0;
    public ImageView r0;
    public ImageView s0;
    public TextView t0;
    public f1o u0;
    public boolean w0;
    public final boolean X = BuildInfo.s();
    public final d v0 = new d();
    public final zn3 x0 = new zn3(this, 0);
    public final ArticleFragment$receiver$1 y0 = new BroadcastReceiver() { // from class: com.vk.articles.ArticleFragment$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            rn3 rn3Var = (rn3) ArticleFragment.this.S;
            if (rn3Var != null) {
                rn3Var.Z3(intent);
            }
        }
    };
    public final vd7 z0 = new vd7();
    public final bpn0 A0 = new bpn0(new g(this, 6));
    public final Object B0 = msy.a(LazyThreadSafetyMode.NONE, new h(this, 2));
    public final c D0 = new c();

    /* compiled from: ArticleFragment.kt */
    public static final class a implements a.c {
        public final WeakReference<ArticleFragment> a;

        public a(ArticleFragment articleFragment) {
            this.a = new WeakReference<>(articleFragment);
        }

        @Override // com.vk.articles.a.c
        public final void a() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator translationY;
            ViewPropertyAnimator duration2;
            ViewPropertyAnimator translationY2;
            b bVar;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator duration3;
            ViewPropertyAnimator translationY3;
            ViewPropertyAnimator duration4;
            ViewPropertyAnimator translationY4;
            ViewPropertyAnimator animate3;
            ViewPropertyAnimator duration5;
            ViewPropertyAnimator translationY5;
            ViewPropertyAnimator duration6;
            ViewPropertyAnimator translationY6;
            b bVar2;
            ViewPropertyAnimator animate4;
            ViewPropertyAnimator duration7;
            ViewPropertyAnimator translationY7;
            ViewPropertyAnimator duration8;
            ViewPropertyAnimator translationY8;
            ArticleFragment articleFragment = this.a.get();
            if (articleFragment != null) {
                int i = ArticleFragment.E0;
                if (articleFragment.Ac()) {
                    boolean z = articleFragment.b0.getTranslationY() <= ((float) (-(articleFragment.b0.getHeight() / 2)));
                    FrameLayout frameLayout = articleFragment.b0;
                    if (frameLayout != null) {
                        if (!z || (bVar2 = articleFragment.n0) == null || bVar2.b) {
                            ViewPropertyAnimator animate5 = frameLayout.animate();
                            if (animate5 != null && (duration6 = animate5.setDuration(150L)) != null && (translationY6 = duration6.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                                translationY6.start();
                            }
                            View view = articleFragment.c0;
                            if (view != null && (animate3 = view.animate()) != null && (duration5 = animate3.setDuration(150L)) != null && (translationY5 = duration5.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                                translationY5.start();
                            }
                        } else {
                            ViewPropertyAnimator animate6 = frameLayout.animate();
                            if (animate6 != null && (duration8 = animate6.setDuration(150L)) != null && (translationY8 = duration8.translationY(-frameLayout.getHeight())) != null) {
                                translationY8.start();
                            }
                            View view2 = articleFragment.c0;
                            if (view2 != null && (animate4 = view2.animate()) != null && (duration7 = animate4.setDuration(150L)) != null && (translationY7 = duration7.translationY(-frameLayout.getHeight())) != null) {
                                translationY7.start();
                            }
                        }
                    }
                    View view3 = articleFragment.p0;
                    if (view3 != null) {
                        if (!z || (bVar = articleFragment.n0) == null || bVar.b) {
                            ViewPropertyAnimator animate7 = view3.animate();
                            if (animate7 != null && (duration2 = animate7.setDuration(150L)) != null && (translationY2 = duration2.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                                translationY2.start();
                            }
                            View view4 = articleFragment.o0;
                            if (view4 == null || (animate = view4.animate()) == null || (duration = animate.setDuration(150L)) == null || (translationY = duration.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) == null) {
                                return;
                            }
                            translationY.start();
                            return;
                        }
                        ViewPropertyAnimator animate8 = view3.animate();
                        if (animate8 != null && (duration4 = animate8.setDuration(150L)) != null && (translationY4 = duration4.translationY(view3.getHeight())) != null) {
                            translationY4.start();
                        }
                        View view5 = articleFragment.o0;
                        if (view5 == null || (animate2 = view5.animate()) == null || (duration3 = animate2.setDuration(150L)) == null || (translationY3 = duration3.translationY(view3.getHeight())) == null) {
                            return;
                        }
                        translationY3.start();
                    }
                }
            }
        }
    }

    /* compiled from: ArticleFragment.kt */
    public final class b implements a.b {
        public final WeakReference<ArticleFragment> a;
        public boolean b;

        public b(ArticleFragment articleFragment) {
            this.a = new WeakReference<>(articleFragment);
        }

        @Override // com.vk.articles.a.b
        public final void a(com.vk.articles.a aVar, int i, int i2) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator animate3;
            ViewPropertyAnimator animate4;
            ArticleFragment.this.w0 = true;
            ArticleFragment articleFragment = this.a.get();
            if (articleFragment == null || !articleFragment.Ac()) {
                return;
            }
            FrameLayout frameLayout = articleFragment.b0;
            if (frameLayout != null && (animate4 = frameLayout.animate()) != null) {
                animate4.cancel();
            }
            View view = articleFragment.c0;
            if (view != null && (animate3 = view.animate()) != null) {
                animate3.cancel();
            }
            View view2 = articleFragment.p0;
            if (view2 != null && (animate2 = view2.animate()) != null) {
                animate2.cancel();
            }
            View view3 = articleFragment.o0;
            if (view3 != null && (animate = view3.animate()) != null) {
                animate.cancel();
            }
            b bVar = articleFragment.n0;
            if (bVar != null) {
                bVar.b = ((float) (aVar.getHeight() + i)) > ((float) aVar.getContentHeight()) - articleFragment.getResources().getDimension(R.dimen.article_top_panel) || ((float) i) < articleFragment.getResources().getDimension(R.dimen.article_top_panel);
            }
            boolean z = ((float) (aVar.getHeight() + i)) > ((float) aVar.getContentHeight()) - articleFragment.getResources().getDimension(R.dimen.article_top_panel);
            int i3 = (i <= i2 || !z) ? i2 - i : i - i2;
            FrameLayout frameLayout2 = articleFragment.b0;
            int height = frameLayout2 != null ? frameLayout2.getHeight() : 0;
            FrameLayout frameLayout3 = articleFragment.b0;
            if (frameLayout3 != null) {
                awt0.w(frameLayout3, i3, -height, 0);
            }
            View view4 = articleFragment.c0;
            if (view4 != null) {
                awt0.w(view4, i3, -height, 0);
            }
            int i4 = (i <= i2 || !z) ? i - i2 : i2 - i;
            View view5 = articleFragment.p0;
            if (view5 != null) {
                awt0.w(view5, i4, 0, view5.getHeight());
            }
            View view6 = articleFragment.o0;
            if (view6 != null) {
                View view7 = articleFragment.p0;
                awt0.w(view6, i4, 0, view7 != null ? view7.getHeight() : 0);
            }
        }
    }

    /* compiled from: ArticleFragment.kt */
    public static final class c implements lp3.b {
        public c() {
        }

        @Override // xsna.lp3.b
        public final void a() {
            ArticleFragment articleFragment = ArticleFragment.this;
            Article article = articleFragment.T;
            if (article != null) {
                int i = ReportFragment.a0;
                ReportFragment.a a = ReportFragment.b.a();
                a.K("article");
                a.D(article.b);
                a.G(article.c);
                a.k(articleFragment.getActivity());
            }
        }

        @Override // xsna.lp3.b
        public final void b(String str) {
            int i = ArticleFragment.E0;
            com.vk.common.links.b.c(ArticleFragment.this.getActivity(), str, null);
        }

        @Override // xsna.lp3.b
        public final void c() {
            int i = ArticleFragment.E0;
            FavesFragment.a aVar = new FavesFragment.a();
            aVar.y(FaveCategory.LINK, FaveSource.LONG_READ);
            aVar.k(ArticleFragment.this.getActivity());
        }

        @Override // xsna.lp3.b
        public final void d() {
            ArticleFragment articleFragment = ArticleFragment.this;
            Article article = articleFragment.T;
            if (article != null) {
                DiscoverSearchFragment.a aVar = new DiscoverSearchFragment.a();
                aVar.B("url:" + article.i);
                aVar.E();
                aVar.k(articleFragment.getActivity());
                com.vk.articles.a aVar2 = articleFragment.m0;
                if (aVar2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("articleRawId", article.b);
                    s3q0 s3q0Var = s3q0.a;
                    aVar2.f("articleMentionClick", jSONObject);
                }
            }
        }

        @Override // xsna.lp3.b
        public final void e() {
            int i = ArticleFragment.E0;
            FavesFragment.a aVar = new FavesFragment.a();
            aVar.y(FaveCategory.ARTICLE, FaveSource.LONG_READ);
            aVar.k(ArticleFragment.this.getActivity());
        }
    }

    public static boolean ko(Intent intent, String str) {
        return intent != null && intent.hasExtra(str) && intent.getBooleanExtra(str, false);
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final boolean Ac() {
        Article article = this.T;
        if (article != null) {
            String str = article.i;
            if (str != null ? Article.a.a(str) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        Drawable drawable;
        com.vk.articles.a aVar = this.m0;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder("Article.toggleDarkMode(");
            sb.append(!dhr0.C().b);
            sb.append(");");
            aVar.e(sb.toString());
        }
        Owner oo = oo();
        yo(oo != null ? oo.i(4) : false);
        ImageView imageView = this.s0;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        drawable.setTint(dhr0.t.c(R.attr.vk_ui_icon_accent_themed));
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final void R2(Object obj) {
        if (lo()) {
            if (obj instanceof PollInfo) {
                rn3 rn3Var = (rn3) this.S;
                if (rn3Var != null) {
                    rn3Var.U3((PollInfo) obj, true, new sz(this, 4));
                    return;
                }
                return;
            }
            if (obj instanceof ArticleAttachment) {
                nr4.b().f(new jbs(this), obj, this.Y);
            } else {
                kbj0.e(nr4.b(), kn(), obj, false, null, false, null, 60);
            }
        }
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final void Vl(String str, JSONObject jSONObject) {
        pro0.e(new n93(this, 1));
        if (this.Z) {
            fxv0.a.a(new bvv0(jSONObject));
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || str.length() == 0) {
            return;
        }
        xwk.d().e().a(activity, str);
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // xsna.kes
    public final boolean Xf() {
        if (getActivity() != null) {
            return !oen.b(r0);
        }
        return true;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.articles.a aVar = this.m0;
        if (aVar != null) {
            aVar.clearFocus();
        }
        return super.a0();
    }

    @Override // xsna.fes
    public final boolean df() {
        if (getActivity() != null) {
            return !oen.b(r0);
        }
        return true;
    }

    public final void jo() {
        Article article = this.U;
        if (article == null || article.d()) {
            com.vk.articles.a aVar = this.m0;
            if (aVar != null) {
                aVar.setOnPageFinishedListener(null);
            }
            com.vk.articles.a aVar2 = this.m0;
            if (aVar2 != null) {
                aVar2.setOnPageErrorListener(null);
                return;
            }
            return;
        }
        com.vk.articles.a aVar3 = this.m0;
        if (aVar3 != null) {
            aVar3.setOnPageFinishedListener(new bo3(this, 0));
        }
        com.vk.articles.a aVar4 = this.m0;
        if (aVar4 != null) {
            aVar4.setOnPageErrorListener(new i70(this, 4));
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    public final boolean lo() {
        FragmentActivity activity;
        return (getActivity() == null || (activity = getActivity()) == null || activity.isDestroyed()) ? false : true;
    }

    public final boolean mo(Article article) {
        Article article2 = this.T;
        if (!epx.f(article2 != null ? Integer.valueOf(article2.b) : null, article != null ? Integer.valueOf(article.b) : null)) {
            return false;
        }
        Article article3 = this.T;
        return epx.f(article3 != null ? article3.c : null, article != null ? article.c : null);
    }

    public final void no(Article article) {
        Article article2 = this.T;
        Owner owner = article2 != null ? article2.h : null;
        Owner owner2 = article != null ? article.h : null;
        boolean z = (epx.f(article2, article) && epx.f(owner != null ? Boolean.valueOf(owner.i(4)) : null, owner2 != null ? Boolean.valueOf(owner2.i(4)) : null)) ? false : true;
        this.T = article;
        this.U = article;
        if (article == null || !z) {
            return;
        }
        Owner owner3 = article.h;
        qo(owner3 != null ? owner3.i(4) : false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 999 && i2 == -1) {
            String str = ko(intent, AppShareType.MESSAGE.h()) ? "share_to_message" : ko(intent, AppShareType.POST.h()) ? "share_to_community" : ko(intent, AppShareType.WALL.h()) ? "share_to_wall" : ko(intent, AppShareType.STORY.h()) ? "share_to_story" : ko(intent, AppShareType.QR.h()) ? "share_to_qr" : null;
            if (str != null) {
                JSONObject jSONObject = new JSONObject();
                Article article = this.T;
                jSONObject.put("articleRawId", article != null ? Integer.valueOf(article.b) : null);
                jSONObject.put("shareType", str);
                s3q0 s3q0Var = s3q0.a;
                to("didShareArticle", jSONObject);
            }
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.T = arguments != null ? (Article) arguments.getParcelable("article") : null;
        Bundle arguments2 = getArguments();
        this.V = arguments2 != null ? (SnippetAttachment) arguments2.getParcelable("parent_snippet") : null;
        Bundle arguments3 = getArguments();
        this.W = arguments3 != null ? (QueryParameters) arguments3.getParcelable("query_parameters") : null;
        Bundle arguments4 = getArguments();
        this.Y = arguments4 != null ? arguments4.getString("track_code") : null;
        Bundle arguments5 = getArguments();
        this.Z = arguments5 != null ? arguments5.getBoolean("from_web_event", false) : false;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            arguments6.getBoolean("start_tts_playing", false);
        }
        this.U = this.T;
        rp3 rp3Var = new rp3(this, (sp3) this.A0.getValue());
        this.S = rp3Var;
        rp3Var.U1(this.U);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        Context context = e43.a;
        anj.d(context != null ? context : null, this.y0, intentFilter, hf8.a, 4);
        ce60.b.getClass();
        p870.f().b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, this.x0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.C0 = new lp3(activity, this.X, new i(this, 6), new j(this, 9), new k(this, 5), this.D0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r10.l == true) goto L48;
     */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        f1o f1oVar;
        ArticleDonut.Placeholder placeholder;
        WebSettings settings;
        rn3 rn3Var;
        String str;
        View inflate = layoutInflater.inflate(R.layout.article_fragment, viewGroup, false);
        inflate.addOnAttachStateChangeListener(this.v0);
        if (Ac() && (rn3Var = (rn3) this.S) != null) {
            Article article = this.T;
            if (article == null || (str = article.i) == null) {
                str = "";
            }
            rn3Var.S5(str, new e5(this, 4));
        }
        this.d0 = (FrameLayout) inflate.findViewById(R.id.fl_content);
        this.e0 = (FrameLayout) inflate.findViewById(R.id.web_view_container);
        this.f0 = (ProgressBar) inflate.findViewById(R.id.pb_loading);
        this.g0 = (DefaultErrorView) inflate.findViewById(R.id.error_view);
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.m0 = this.z0.d(activity.getApplicationContext(), Uri.parse(this.T.j).buildUpon().appendQueryParameter("lang", Locale.getDefault().getLanguage()).build().toString(), Ac(), this.W);
            }
            com.vk.articles.a aVar = this.m0;
            if (aVar != null) {
                aVar.setOnScrollEndListener(new a(this));
            }
            b bVar = new b(this);
            this.n0 = bVar;
            com.vk.articles.a aVar2 = this.m0;
            if (aVar2 != null) {
                aVar2.setOnScrollChangeListener(bVar);
            }
            com.vk.articles.a aVar3 = this.m0;
            if (aVar3 != null) {
                aVar3.setCallback(this);
            }
            com.vk.articles.a aVar4 = this.m0;
            if (aVar4 != null && (settings = aVar4.getSettings()) != null) {
                settings.setJavaScriptEnabled(true);
            }
            com.vk.articles.a aVar5 = this.m0;
            if (aVar5 != null) {
                aVar5.setTrackCode(this.Y);
            }
            Article article2 = this.U;
            if (article2 != null) {
                if (!article2.d()) {
                    com.vk.articles.a aVar6 = this.m0;
                    if (aVar6 != null) {
                        if (!aVar6.k) {
                            if (aVar6.j) {
                            }
                            ro();
                        }
                    }
                }
            }
            FrameLayout frameLayout2 = this.e0;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.m0);
            }
        } catch (AndroidRuntimeException e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                enj.q(R.string.error_webview, 0, activity2);
            }
        }
        FrameLayout frameLayout3 = (FrameLayout) inflate.findViewById(R.id.video_fullscreen_container);
        com.vk.articles.a aVar7 = this.m0;
        if (aVar7 != null) {
            L.p("ArticleWebView", "attachFullScreenContainer() called with: container = " + frameLayout3);
            aVar7.b.b = frameLayout3;
        }
        DefaultErrorView defaultErrorView = this.g0;
        if (defaultErrorView != null) {
            defaultErrorView.setMessageColor(R.attr.vk_ui_text_primary);
        }
        DefaultErrorView defaultErrorView2 = this.g0;
        if (defaultErrorView2 != null) {
            defaultErrorView2.setRetryClickListener(new ao3(this, 0));
        }
        jo();
        Article article3 = this.U;
        if (article3 == null || !article3.d()) {
            com.vk.articles.a aVar8 = this.m0;
            if (aVar8 != null && aVar8.j && !aVar8.l) {
                ProgressBar progressBar = this.f0;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                FrameLayout frameLayout4 = this.e0;
                if (frameLayout4 != null) {
                    frameLayout4.setVisibility(0);
                }
                DefaultErrorView defaultErrorView3 = this.g0;
                if (defaultErrorView3 != null) {
                    defaultErrorView3.setVisibility(4);
                }
            } else if (aVar8 != null && aVar8.j && aVar8.l) {
                wo();
            } else {
                ProgressBar progressBar2 = this.f0;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
                FrameLayout frameLayout5 = this.e0;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(4);
                }
                DefaultErrorView defaultErrorView4 = this.g0;
                if (defaultErrorView4 != null) {
                    defaultErrorView4.setVisibility(4);
                }
            }
        } else {
            Article article4 = this.T;
            if (article4 != null) {
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    f1oVar = new f1o(activity3);
                    f1oVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    f1oVar.setIconSize(f1oVar.getResources().getDimensionPixelSize(R.dimen.article_placeholder_icon_size));
                    f1oVar.setTitleMarginTop(f1oVar.getResources().getDimensionPixelSize(R.dimen.article_placeholder_title_margin_top));
                    f1oVar.setTitleTextSize(f1oVar.getResources().getDimensionPixelSize(R.dimen.article_placeholder_title_text_size));
                    f1oVar.setSubtitleMarginTop(f1oVar.getResources().getDimensionPixelSize(R.dimen.article_placeholder_subtitle_margin_top));
                    ArticleDonut articleDonut = article4.q;
                    if (articleDonut != null && (placeholder = articleDonut.c) != null) {
                        f1oVar.c.setText(placeholder.b);
                        f1oVar.d.setText(hd60.a().h(placeholder.c));
                        LinkButton linkButton = placeholder.d;
                        String str2 = linkButton != null ? linkButton.b : null;
                        VkSimpleButton vkSimpleButton = f1oVar.e;
                        vkSimpleButton.setText(str2);
                        bwt0.i0(vkSimpleButton, new sub(placeholder, f1oVar, article4, 2));
                    }
                    FrameLayout frameLayout6 = this.d0;
                    if (frameLayout6 != null) {
                        frameLayout6.addView(f1oVar);
                    }
                } else {
                    f1oVar = null;
                }
                this.u0 = f1oVar;
                ProgressBar progressBar3 = this.f0;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(4);
                }
                FrameLayout frameLayout7 = this.e0;
                if (frameLayout7 != null) {
                    frameLayout7.setVisibility(4);
                }
                DefaultErrorView defaultErrorView5 = this.g0;
                if (defaultErrorView5 != null) {
                    defaultErrorView5.setVisibility(4);
                }
            }
        }
        if (!Ac() && (frameLayout = this.e0) != null) {
            frameLayout.setPadding(0, (int) kn().getResources().getDimension(R.dimen.article_top_panel), 0, (int) kn().getResources().getDimension(R.dimen.article_bottom_panel));
        }
        FragmentActivity activity4 = getActivity();
        VKActivity vKActivity = activity4 instanceof VKActivity ? (VKActivity) activity4 : null;
        if (vKActivity != null) {
            vKActivity.r = false;
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.y0);
        ce60.b.getClass();
        p870.f().g(this.x0);
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r0.b = null;
        r6.m0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (r1 == null) goto L30;
     */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar;
        vd7 vd7Var = this.z0;
        d dVar = this.v0;
        try {
            super.onDestroyView();
            FragmentActivity activity = getActivity();
            VKActivity vKActivity = activity instanceof VKActivity ? (VKActivity) activity : null;
            if (vKActivity != null) {
                vKActivity.r = true;
            }
            com.vk.articles.a aVar = this.m0;
            if (aVar != null) {
                if (!mo(this.U)) {
                    aVar.scrollTo(0, 0);
                }
                ViewParent parent = aVar.getParent();
                FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                L.p("ArticleWebView", "release() called");
                bir0 bir0Var = aVar.b;
                bir0Var.b = null;
                bir0Var.c = null;
                bir0Var.d = null;
                aVar.o = null;
                io.reactivex.rxjava3.disposables.c cVar2 = aVar.w;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                aVar.setOnScrollChangeListener((a.b) null);
                aVar.setOnPageFinishedListener(null);
                aVar.setOnPageErrorListener(null);
                aVar.onPause();
                this.m0 = null;
            }
            View view = getView();
            if (view != null) {
                view.removeOnAttachStateChangeListener(dVar);
            }
            cVar = (io.reactivex.rxjava3.disposables.c) vd7Var.b;
        } catch (Throwable unused) {
            View view2 = getView();
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(dVar);
            }
            cVar = (io.reactivex.rxjava3.disposables.c) vd7Var.b;
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        com.vk.articles.a aVar;
        if (Ac() && (aVar = this.m0) != null) {
            L.p("ArticleWebView", "onWebViewClosed() called");
            bir0 bir0Var = aVar.b;
            bir0Var.b = null;
            bir0Var.c = null;
            bir0Var.d = null;
            aVar.f("articleWebViewClose", new JSONObject());
        }
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        com.vk.articles.a aVar;
        super.onResume();
        xo(kn());
        if (Ac() && (aVar = this.m0) != null) {
            L.p("ArticleWebView", "onWebViewShown() called");
            if (aVar.d != null) {
                com.vk.articles.a.d(aVar);
            } else {
                v2 y0 = new s0(new os2(aVar, 1)).y0(2L, TimeUnit.SECONDS);
                asu0.a.getClass();
                aVar.c = y0.r0(asu0.p()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new iu1(new vl1(aVar, 4), 3), new qs2(new com.vk.movika.sdk.base.observable.k(aVar, 7), 2));
            }
        }
        com.vk.articles.a aVar2 = this.m0;
        if (aVar2 != null) {
            aVar2.g();
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        ImageView imageView;
        Article a2;
        Article article;
        String str;
        Toolbar toolbar;
        Drawable drawable;
        q U;
        String str2;
        Toolbar toolbar2;
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_header_container);
        this.b0 = frameLayout;
        if (frameLayout != null) {
            bwt0.Z(R.attr.vk_ui_background_modal, frameLayout);
        }
        FrameLayout frameLayout2 = this.b0;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new co3());
        }
        this.c0 = view.findViewById(R.id.top_navigation_shadow);
        this.h0 = (Toolbar) view.findViewById(R.id.toolbar);
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        int i = 1;
        if (!fnj.d(kn)) {
            FragmentActivity kn2 = kn();
            e3m.a aVar = e3m.a;
            Drawable mutate = m33.a(R.drawable.vk_icon_arrow_left_outline_28, kn2).mutate();
            Toolbar toolbar3 = this.h0;
            mutate.setTint((toolbar3 != null ? toolbar3.getContext() : null).getColor(R.color.vk_gray_500));
            Toolbar toolbar4 = this.h0;
            if (toolbar4 != null) {
                toolbar4.setNavigationIcon(mutate);
            }
            Toolbar toolbar5 = this.h0;
            if (toolbar5 != null) {
                toolbar5.setNavigationOnClickListener(new t01(this, i));
            }
        }
        Toolbar toolbar6 = this.h0;
        if (toolbar6 != null) {
            toolbar6.t(R.style.ToolbarArticleTitle, toolbar6.getContext());
        }
        Toolbar toolbar7 = this.h0;
        if (toolbar7 != null) {
            toolbar7.s(R.style.ToolbarArticleSubtitle, toolbar7.getContext());
        }
        Toolbar toolbar8 = this.h0;
        if (toolbar8 != null) {
            Article article2 = this.T;
            toolbar8.setTitle(article2 != null ? article2.f : null);
        }
        Owner oo = oo();
        if (oo != null && (str2 = oo.c) != null && (toolbar2 = this.h0) != null) {
            toolbar2.setSubtitle(str2);
        }
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.fl_longread_toolbar);
        this.i0 = frameLayout3;
        if (frameLayout3 != null) {
            bwt0.Z(R.attr.vk_ui_background_modal, frameLayout3);
        }
        FrameLayout frameLayout4 = this.i0;
        ImageView imageView2 = frameLayout4 != null ? (ImageView) frameLayout4.findViewById(R.id.iv_longread_back) : null;
        this.j0 = imageView2;
        int i2 = 3;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new k1(this, i2));
        }
        ImageView imageView3 = this.j0;
        int i3 = 0;
        if (imageView3 != null) {
            imageView3.setVisibility(!fnj.d(kn()) ? 0 : 8);
        }
        FrameLayout frameLayout5 = this.i0;
        this.k0 = frameLayout5 != null ? (VKCircleImageView) frameLayout5.findViewById(R.id.iv_longread_icon) : null;
        Owner oo2 = oo();
        int i4 = 4;
        if (oo2 != null) {
            VKCircleImageView vKCircleImageView = this.k0;
            if (vKCircleImageView != null) {
                vKCircleImageView.setPlaceholderImage(fkq0.d(oo2.b) ? R.drawable.user_placeholder : R.drawable.group_placeholder);
            }
            String str3 = oo2.e;
            if (str3 == null || str3.length() == 0) {
                if (fkq0.d(oo2.b)) {
                    U = rsg0.y0(new e1r0(oo2.b), null, null, 3).U(new jo3(new io3(i3), i3));
                } else {
                    UserId userId = oo2.b;
                    ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
                    comFeatures.getClass();
                    if (com.vk.toggle.b.A.a(comFeatures)) {
                        fz2 y = yfb.y(xqu.a.a(null, Collections.singletonList(fkq0.a(userId)), null), new b40(i));
                        ahn.D(y);
                        U = rsg0.y0(y, null, null, 3);
                    } else {
                        U = rsg0.y0(new rpu(fkq0.e(userId)), null, null, 3).U(new do3(new e0(i2), i3));
                    }
                }
                i0 i0Var = new i0(this, i4);
                int i5 = kwg0.a;
                eo(U.subscribe(i0Var, new iwg0()));
            } else {
                VKCircleImageView vKCircleImageView2 = this.k0;
                if (vKCircleImageView2 != null) {
                    vKCircleImageView2.o0(oo2.e, null);
                    vKCircleImageView2.setContentDescription(oo2.c);
                }
            }
        }
        VKCircleImageView vKCircleImageView3 = this.k0;
        if (vKCircleImageView3 != null) {
            jjc.g(vKCircleImageView3, new p40(this, i4));
        }
        FrameLayout frameLayout6 = this.i0;
        this.l0 = frameLayout6 != null ? (ImageView) frameLayout6.findViewById(R.id.tv_longread_subscribe) : null;
        Owner oo3 = oo();
        yo(oo3 != null ? oo3.i(4) : false);
        ImageView imageView4 = this.l0;
        r rVar = new r(this, 7);
        yh yhVar = new yh(this, i2);
        boolean z = this.X;
        if (imageView4 != null) {
            bwt0.p0(imageView4, z);
        }
        if (imageView4 != null) {
            jjc.g(imageView4, new wz(this, rVar, yhVar, i));
        }
        if (Ac()) {
            Toolbar toolbar9 = this.h0;
            if (toolbar9 != null) {
                toolbar9.setVisibility(8);
            }
            FrameLayout frameLayout7 = this.i0;
            if (frameLayout7 != null) {
                frameLayout7.setVisibility(0);
            }
        } else {
            Toolbar toolbar10 = this.h0;
            if (toolbar10 != null) {
                toolbar10.setVisibility(0);
            }
            FrameLayout frameLayout8 = this.i0;
            if (frameLayout8 != null) {
                frameLayout8.setVisibility(8);
            }
        }
        this.o0 = view.findViewById(R.id.bottom_navigation_shadow);
        View findViewById2 = view.findViewById(R.id.fl_bottom_panel);
        this.p0 = findViewById2;
        Article article3 = this.T;
        if (article3 == null || !article3.p) {
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            View view2 = this.o0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.p0;
            if (view3 != null && (findViewById = view3.findViewById(R.id.fl_bottom_panel_inner)) != null) {
                bwt0.Z(R.attr.vk_ui_background_modal, findViewById);
            }
            View view4 = this.p0;
            if (view4 != null) {
                view4.setOnClickListener(new co3());
            }
        } else {
            if (findViewById2 != null) {
                f4m.j(findViewById2);
            }
            View view5 = this.o0;
            if (view5 != null) {
                f4m.j(view5);
            }
        }
        View view6 = this.p0;
        this.q0 = view6 != null ? (ImageView) view6.findViewById(R.id.iv_reply) : null;
        View view7 = this.p0;
        ImageView imageView5 = view7 != null ? (ImageView) view7.findViewById(R.id.iv_favourite) : null;
        this.r0 = imageView5;
        if (imageView5 != null) {
            bwt0.p0(imageView5, z);
        }
        Drawable a3 = m33.a(R.drawable.vk_icon_more_vertical_24, view.getContext());
        if (a3 != null) {
            int i6 = uqo.a;
            Drawable mutate2 = a3.mutate();
            FrameLayout frameLayout9 = this.i0;
            ImageView imageView6 = frameLayout9 != null ? (ImageView) frameLayout9.findViewById(R.id.options_btn_top) : null;
            this.s0 = imageView6;
            if (imageView6 != null) {
                imageView6.setImageDrawable(mutate2);
            }
            ImageView imageView7 = this.s0;
            if (imageView7 != null && (drawable = imageView7.getDrawable()) != null) {
                drawable.setTint(dhr0.t.c(R.attr.vk_ui_icon_accent_themed));
            }
        }
        View view8 = this.p0;
        this.t0 = view8 != null ? (TextView) view8.findViewById(R.id.tv_view_count) : null;
        vo();
        ImageView imageView8 = this.q0;
        if (imageView8 != null) {
            imageView8.setOnClickListener(new ko3(this, i3));
        }
        ImageView imageView9 = this.s0;
        if (imageView9 != null) {
            imageView9.setOnClickListener(new lo3(this, i3));
        }
        ImageView imageView10 = this.r0;
        if (imageView10 != null) {
            imageView10.setOnClickListener(new yn3(this, i3));
        }
        this.a0 = view.findViewById(R.id.view_day_mode_anchor);
        FragmentActivity kn3 = kn();
        if (!fnj.d(kn()) && (toolbar = this.h0) != null) {
            int i7 = uqo.a;
            toolbar.setNavigationIcon(toolbar.getNavigationIcon().mutate());
        }
        ImageView imageView11 = this.j0;
        if (imageView11 != null) {
            int i8 = uqo.a;
            imageView11.setImageDrawable(imageView11.getDrawable().mutate());
        }
        ProgressBar progressBar = this.f0;
        if (progressBar != null) {
            int i9 = uqo.a;
            progressBar.setIndeterminateDrawable(progressBar.getIndeterminateDrawable().mutate());
        }
        ImageView imageView12 = this.q0;
        if (imageView12 != null) {
            int i10 = uqo.a;
            imageView12.setImageDrawable(m33.a(R.drawable.vk_icon_share_outline_24, kn3).mutate());
        }
        Article article4 = this.T;
        Drawable a4 = (article4 == null || !article4.n) ? m33.a(R.drawable.vk_icon_bookmark_outline_24, kn3) : m33.a(R.drawable.vk_icon_bookmark_24, kn3);
        ImageView imageView13 = this.r0;
        if (imageView13 != null) {
            int i11 = uqo.a;
            imageView13.setImageDrawable(a4.mutate());
        }
        if (!Ac() && (article = this.T) != null && (str = article.i) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Logger.METHOD_E, "amp_view");
            jSONObject.put("url", str);
            new c0m(jSONObject.toString()).p();
        }
        rn3 rn3Var = (rn3) this.S;
        if (rn3Var != null) {
            rn3Var.W1();
        }
        lp3 lp3Var = this.C0;
        if (lp3Var == null || (imageView = this.s0) == null || (a2 = lp3Var.a()) == null || !a2.u) {
            return;
        }
        pla.e().b().l(imageView, HintId.ARTICLES_MOBILE_EDITOR_TOOLTIP.getId(), null);
    }

    public final Owner oo() {
        Article article = this.T;
        if (article != null) {
            return article.h;
        }
        return null;
    }

    public final void po(Article article) {
        com.vk.articles.a aVar = this.m0;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("articleId", article.b);
            jSONObject.put("articleOwnerId", article.c);
            jSONObject.put("isBookmarked", article.n);
            s3q0 s3q0Var = s3q0.a;
            aVar.f("articleBookmarked", jSONObject);
        }
    }

    public final void qo(boolean z) {
        VKCircleImageView vKCircleImageView;
        VKCircleImageView vKCircleImageView2 = this.k0;
        if (vKCircleImageView2 != null) {
            vKCircleImageView2.setPlaceholderImage(fkq0.d(oo().b) ? R.drawable.user_placeholder : R.drawable.group_placeholder);
        }
        Owner oo = oo();
        if ((oo != null ? oo.e : null) != null && (vKCircleImageView = this.k0) != null) {
            vKCircleImageView.o0(oo().e, null);
        }
        yo(z);
        vo();
        xo(kn());
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final void re(Article article) {
        String str = article.i;
        if (str != null ? Article.a.a(str) : false) {
            enq enqVar = enq.a;
            ArticleAttachment articleAttachment = new ArticleAttachment(article);
            enqVar.getClass();
            enq.c(articleAttachment);
        }
        if (lo() && mo(article)) {
            Article article2 = this.T;
            if (article2 != null) {
                article2.n = article.n;
            }
            xo(kn());
        }
    }

    public final void ro() {
        com.vk.articles.a aVar = this.m0;
        if (aVar != null) {
            String uri = Uri.parse(this.T.j).buildUpon().appendQueryParameter("lang", Locale.getDefault().getLanguage()).build().toString();
            boolean Ac = Ac();
            QueryParameters queryParameters = this.W;
            this.z0.getClass();
            aVar.b(vd7.g(uri, Ac, queryParameters), Ac(), !Ac() ? xp3.a : null);
        }
    }

    public final void so() {
        ro();
        ProgressBar progressBar = this.f0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        FrameLayout frameLayout = this.e0;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        DefaultErrorView defaultErrorView = this.g0;
        if (defaultErrorView != null) {
            defaultErrorView.setVisibility(4);
        }
    }

    public final void to(String str, JSONObject jSONObject) {
        com.vk.articles.a aVar = this.m0;
        if (aVar != null) {
            aVar.f(str, jSONObject);
        }
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final void uj(Article article, boolean z) {
        if (this.w0 && lo()) {
            rn3 rn3Var = (rn3) this.S;
            if (rn3Var != null) {
                rn3Var.y1(article);
            }
            this.T = article;
            qo(z);
        }
    }

    public final void uo(boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(R.drawable.vk_icon_check_square_outline_28), Integer.valueOf(R.attr.vk_ui_icon_tertiary)) : new Pair(Integer.valueOf(R.drawable.vk_icon_add_square_outline_28), Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
        ImageView imageView = this.l0;
        if (imageView != null) {
            int intValue = ((Number) pair.i()).intValue();
            abg0 abg0Var = dhr0.t;
            Drawable a2 = abg0Var.a(intValue);
            if (a2 != null) {
                a2.setTint(abg0Var.c(((Number) pair.j()).intValue()));
            } else {
                a2 = null;
            }
            imageView.setImageDrawable(a2);
        }
    }

    public final void vo() {
        Article article = this.T;
        int i = article != null ? article.m : 0;
        if (i > 0) {
            TextView textView = this.t0;
            if (textView != null) {
                textView.setText(uqm0.f(i));
                return;
            }
            return;
        }
        TextView textView2 = this.t0;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final void wl() {
        FragmentActivity activity = getActivity();
        if (activity == null || iah0.n(activity) || oen.a()) {
            return;
        }
        p90.d(activity);
    }

    public final void wo() {
        ProgressBar progressBar = this.f0;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        FrameLayout frameLayout = this.e0;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        DefaultErrorView defaultErrorView = this.g0;
        if (defaultErrorView != null) {
            defaultErrorView.setVisibility(0);
        }
    }

    public final void xo(Context context) {
        Article article = this.T;
        Drawable a2 = (article == null || !article.n) ? m33.a(R.drawable.vk_icon_bookmark_outline_24, context) : m33.a(R.drawable.vk_icon_bookmark_24, context);
        ImageView imageView = this.r0;
        if (imageView != null) {
            int i = uqo.a;
            imageView.setImageDrawable(a2.mutate());
        }
        ImageView imageView2 = this.r0;
        if (imageView2 != null) {
            omw.b(imageView2, R.attr.vk_ui_icon_secondary);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        UserId userId;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.ARTICLE;
        Owner oo = oo();
        uiTrackingScreen.f = new SchemeStat$EventItem(type, this.T != null ? Long.valueOf(r0.b) : null, (oo == null || (userId = oo.b) == null) ? null : Long.valueOf(userId.b), null, this.Y, null, 40, null);
    }

    public final void yo(boolean z) {
        Owner oo = oo();
        if (qr.f(oo != null ? oo.b : null)) {
            ImageView imageView = this.l0;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.l0;
        if (imageView2 != null) {
            bwt0.p0(imageView2, this.X);
        }
        uo(z);
    }

    @Override // com.vk.articles.a.InterfaceC0377a
    public final void z2(PollInfo pollInfo) {
        rn3 rn3Var = (rn3) this.S;
        if (rn3Var != null) {
            rn3Var.z2(pollInfo);
        }
    }

    /* compiled from: ArticleFragment.kt */
    public static final class d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.setFitsSystemWindows(oen.b(view.getContext()));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
