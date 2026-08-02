package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockArticle;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.articles.Article;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.bwt0;
import xsna.e3m;
import xsna.e43;
import xsna.gmq;
import xsna.gq3;
import xsna.izs;
import xsna.pvo0;
import xsna.s3q0;
import xsna.tmq;
import xsna.ucp;
import xsna.uqm0;
import xsna.vtk0;
import xsna.wzs;

/* compiled from: ArticleVh.kt */
/* loaded from: classes16.dex */
public final class ArticleVh implements CatalogViewHolder, View.OnClickListener {
    public final int b;
    public final int c;
    public View d;
    public UIBlockArticle e;
    public VKImageView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public ImageView j;
    public TextView k;

    /* compiled from: ArticleVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Boolean, gmq, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Boolean bool, gmq gmqVar) {
            boolean booleanValue = bool.booleanValue();
            ImageView imageView = ((ArticleVh) this.receiver).j;
            if (imageView != null) {
                imageView.setActivated(booleanValue);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ArticleVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<gmq, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gmq gmqVar) {
            ArticleVh articleVh = (ArticleVh) this.receiver;
            articleVh.getClass();
            boolean X = gmqVar.X();
            ImageView imageView = articleVh.j;
            if (imageView != null) {
                imageView.setActivated(X);
            }
            return s3q0.a;
        }
    }

    public ArticleVh(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String i;
        if (uIBlock instanceof UIBlockArticle) {
            UIBlockArticle uIBlockArticle = (UIBlockArticle) uIBlock;
            this.e = uIBlockArticle;
            Article article = uIBlockArticle.y;
            VKImageView vKImageView = this.f;
            VKImageView vKImageView2 = vKImageView == null ? null : vKImageView;
            if (vKImageView == null) {
                vKImageView = null;
            }
            String f = article.f(vKImageView.getContext().getResources().getDimensionPixelSize(this.c));
            Owner owner = article.h;
            vKImageView2.load(f);
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            textView.setText(article.f);
            TextView textView2 = this.k;
            if (textView2 != null) {
                ucp ucpVar = ucp.a;
                textView2.setText(ucp.i(owner != null ? owner.c : null));
                VerifyInfoHelper.a.l(textView2, owner != null ? owner.f : null, true, VerifyInfoHelper.ColorTheme.white);
            }
            TextView textView3 = this.h;
            if (textView3 != null) {
                textView3.setText(article.g);
            }
            TextView textView4 = this.i;
            if (textView4 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(pvo0.l((int) article.e));
                sb.append(" · ");
                int i2 = article.m;
                if (i2 == 0) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    i = context.getResources().getString(R.string.no_views).toLowerCase(Locale.ROOT);
                } else {
                    i = uqm0.i(i2, R.plurals.article_view_count, R.string.article_view_count_formatted, true);
                }
                sb.append(i);
                textView4.setText(sb.toString());
            }
            ImageView imageView = this.j;
            if (imageView != null) {
                imageView.setActivated(article.n);
                ImageView imageView2 = this.j;
                int i3 = (imageView2 == null || !imageView2.isActivated()) ? R.string.fave_accessibility_add_to_favorite : R.string.fave_accessibility_remove_from_favorite;
                TextView textView5 = this.g;
                imageView.setContentDescription((textView5 != null ? textView5 : null).getContext().getString(i3));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.d = inflate;
        bwt0.h0(this, inflate);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.article_holder_background);
        Context context = layoutInflater.getContext();
        e3m.a aVar = e3m.a;
        vKImageView.setOverlayImage(new ColorDrawable(context.getColor(R.color.vk_black_alpha60)));
        this.f = vKImageView;
        this.g = (TextView) inflate.findViewById(R.id.article_holder_title);
        this.k = (TextView) bwt0.q(inflate, R.id.article_holder_owner, null, 6);
        this.h = (TextView) bwt0.q(inflate, R.id.article_holder_subtitle, null, 6);
        this.i = (TextView) bwt0.q(inflate, R.id.article_holder_text, null, 6);
        FrameLayout frameLayout = (FrameLayout) bwt0.q(inflate, R.id.article_holder_button, this, 4);
        if (frameLayout != null) {
            bwt0.h0(this, frameLayout);
        }
        this.j = (ImageView) bwt0.q(inflate, R.id.article_holder_toggle_fave, this, 4);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Article article;
        UIBlockArticle uIBlockArticle = this.e;
        if (uIBlockArticle == null || (article = uIBlockArticle.y) == null) {
            return;
        }
        if (view.getId() == R.id.article_holder_toggle_fave) {
            tmq.a().d(view.getContext(), article, null, new a(2, this, ArticleVh.class, "onChangeFave", "onChangeFave(ZLcom/vk/dto/fave/Favable;)V", 0), new b(1, this, ArticleVh.class, "onChangeFave", "onChangeFave(Lcom/vk/dto/fave/Favable;)V", 0), true, article.d, null);
            return;
        }
        bpn0 bpn0Var = vtk0.c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        ((gq3) bpn0Var.getValue()).b(view.getContext(), article);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
