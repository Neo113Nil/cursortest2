package com.vk.articles.authorpage.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.paging.list.a;
import com.vkontakte.android.R;
import xsna.ee;
import xsna.f4m;
import xsna.gxp;
import xsna.gy0;
import xsna.iah0;
import xsna.izs;
import xsna.mn3;
import xsna.s3q0;
import xsna.whp;

/* compiled from: ArticleAuthorPageRecyclerPaginatedView.kt */
/* loaded from: classes15.dex */
public final class ArticleAuthorPageRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public static final int Q = iah0.a(48);
    public izs<? super View, s3q0> O;
    public mn3 P;

    public ArticleAuthorPageRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void Fe() {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.Fe();
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.article_author_empty_view, (ViewGroup) this, false);
        inflate.setLayoutParams(e());
        return inflate;
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        VkErrorView vkErrorView = new VkErrorView(context, null, 6, 0);
        vkErrorView.setLayoutParams(e());
        vkErrorView.c(a.C0851a.a(context, new gy0(vkErrorView, 4)));
        return vkErrorView;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final FrameLayout.LayoutParams e() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = Q;
        return layoutParams;
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void e0() {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.e0();
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void f0() {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.f0();
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.fj(th, gxpVar);
    }

    public final izs<View, s3q0> getToggleSubscription() {
        return this.O;
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void lb() {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.lb();
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void n(Context context, AttributeSet attributeSet, int i) {
        super.n(context, attributeSet, i);
        mn3 mn3Var = new mn3(context);
        this.P = mn3Var;
        mn3Var.setLayoutParams(e());
        mn3 mn3Var2 = this.P;
        if (mn3Var2 == null) {
            mn3Var2 = null;
        }
        f4m.j(mn3Var2);
        mn3 mn3Var3 = this.P;
        addView(mn3Var3 != null ? mn3Var3 : null);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void qg(whp whpVar) {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.qg(whpVar);
    }

    public final void setToggleSubscription(izs<? super View, s3q0> izsVar) {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        mn3Var.setToggleSubscription(izsVar);
        this.O = izsVar;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void t() {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        f4m.j(mn3Var);
        super.t();
    }

    public final void x(boolean z, boolean z2) {
        mn3 mn3Var = this.P;
        if (mn3Var == null) {
            mn3Var = null;
        }
        p(1, mn3Var, this.b, this.e, this.c, this.d);
        mn3 mn3Var2 = this.P;
        if (mn3Var2 == null) {
            mn3Var2 = null;
        }
        TextView textView = mn3Var2.c;
        VkButton vkButton = mn3Var2.d;
        if (z2) {
            if (z) {
                textView.setText(R.string.article_closed_group);
            } else {
                textView.setText(R.string.article_closed_profile);
            }
            vkButton.setText(R.string.article_closed_subscribe_sended);
            vkButton.setMode(VkButton.Mode.Secondary);
            vkButton.d5(Integer.valueOf(R.drawable.vk_icon_dropdown_16));
            return;
        }
        if (z) {
            textView.setText(R.string.article_closed_group);
            vkButton.setText(R.string.article_closed_group_subscribe);
        } else {
            textView.setText(R.string.article_closed_profile);
            vkButton.setText(R.string.article_closed_profile_subscribe);
        }
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.d5(null);
    }
}
