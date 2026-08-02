package com.vk.catalog2.common.ui.mvp.holder.header;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.g;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abg0;
import xsna.asu0;
import xsna.be50;
import xsna.d02;
import xsna.dhr0;
import xsna.dml;
import xsna.duh0;
import xsna.f4m;
import xsna.f9m;
import xsna.gcw0;
import xsna.grp0;
import xsna.gzs;
import xsna.hcw0;
import xsna.i0q0;
import xsna.jjc;
import xsna.n9m0;
import xsna.ow60;
import xsna.qd0;
import xsna.rzl0;
import xsna.s3q0;
import xsna.sxh0;
import xsna.txh0;
import xsna.vtk0;
import xsna.whm0;
import xsna.wx40;
import xsna.wzs;
import xsna.yka0;

/* compiled from: VkSearchViewVh.kt */
/* loaded from: classes16.dex */
public final class VkSearchViewVh implements CatalogSearchQueryViewHolder {
    public final int b;
    public final txh0 c;
    public final grp0 d;
    public final duh0 e;
    public VkSearchView f;
    public final g g = new g();

    /* compiled from: VkSearchViewVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((duh0) this.receiver).n();
            return s3q0.a;
        }
    }

    /* compiled from: VkSearchViewVh.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((sxh0) this.receiver).c();
            return s3q0.a;
        }
    }

    /* compiled from: VkSearchViewVh.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((sxh0) this.receiver).d();
            return s3q0.a;
        }
    }

    public VkSearchViewVh(int i, txh0 txh0Var, grp0 grp0Var, dml dmlVar) {
        this.b = i;
        this.c = txh0Var;
        this.d = grp0Var;
        this.e = dmlVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Fb() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.a5();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void K6(boolean z) {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.g5(true);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Kf(gzs<s3q0> gzsVar) {
        throw null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Km(long j) {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.d0();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.g.dispose();
        this.f = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void P1(String str) {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.setHint(str);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ta() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.e5();
        }
    }

    public final void a(VkSearchView vkSearchView) {
        Pair<Long, wzs<String, SearchInputMethod, s3q0>> c3 = this.e.c3();
        long longValue = c3.d().longValue();
        wzs<String, SearchInputMethod, s3q0> g = c3.g();
        q U = d02.y(vkSearchView, 0L, 3).U(new wx40(new yka0(this, 29), 16));
        if (longValue > 0) {
            U = U.z(longValue, TimeUnit.MILLISECONDS, asu0.a.c());
        }
        this.g.b(U.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new whm0(new n9m0(g, 21), 10), new be50(new ow60(21), 27)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final Boolean c9() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            return Boolean.valueOf(vkSearchView.w.isFocused());
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            f4m.j(vkSearchView);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final String i() {
        VkSearchView vkSearchView = this.f;
        String query = vkSearchView != null ? vkSearchView.getQuery() : null;
        return query == null ? "" : query;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void k3() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.U4();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final VkSearchView vkSearchView = new VkSearchView(layoutInflater.getContext(), null, 6, 0);
        vkSearchView.setHint(this.b);
        vkSearchView.X4(false);
        vkSearchView.setOnActionSearchQueryClick(new f9m(3, this, vkSearchView));
        vkSearchView.setOnActionClearListener(new b(0, this.e, duh0.class, "onActionClearClicked", "onActionClearClicked()V", 0));
        txh0 txh0Var = this.c;
        vkSearchView.setOnBackClickListener(new c(0, txh0Var, sxh0.class, "backIconClick", "backIconClick()Z", 8));
        vkSearchView.setSecondaryOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.liv0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                VkSearchViewVh.this.e.E2(vkSearchView.getQuery());
                return true;
            }
        });
        if (vtk0.d().b(vkSearchView.getContext())) {
            vkSearchView.setVoiceInputEnabled(true);
            vkSearchView.setVoiceActionDelegate(new a(new d(0, txh0Var, sxh0.class, "voiceIconClick", "voiceIconClick()V", 0)));
        } else {
            vkSearchView.setVoiceInputEnabled(false);
        }
        a(vkSearchView);
        this.f = vkSearchView;
        return vkSearchView;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void om(boolean z) {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.Y4(true);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final /* bridge */ /* synthetic */ ModernSearchView pi() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void setEnabled(boolean z) {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.setEnabled(z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void y8() {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView != null) {
            vkSearchView.X4(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void zf(String str, boolean z) {
        VkSearchView vkSearchView = this.f;
        if (vkSearchView == null || str.equals(i())) {
            return;
        }
        if (!z) {
            vkSearchView.setQuery(str);
        } else {
            vkSearchView.setQuery(str);
            a(vkSearchView);
        }
    }

    /* compiled from: VkSearchViewVh.kt */
    public static final class a implements hcw0 {
        public final d a;

        public a(d dVar) {
            this.a = dVar;
            gcw0 gcw0Var = gcw0.a;
        }

        @Override // xsna.hcw0
        public final void a() {
            this.a.invoke();
        }

        @Override // xsna.hcw0
        public final void b(ImageView imageView) {
            abg0 abg0Var = dhr0.t;
            imageView.setImageDrawable(abg0Var.a(R.drawable.vk_icon_voice_outline_24));
            imageView.setColorFilter(abg0Var.c(R.attr.vk_ui_vkontakte_color_search_bar_field_tint));
            imageView.setVisibility(0);
            jjc.g(imageView, new rzl0(this, 25));
        }

        @Override // xsna.hcw0
        public final void c() {
            i0q0.d(500L, new qd0(this, 20));
        }

        @Override // xsna.hcw0
        public final boolean d() {
            return true;
        }

        @Override // xsna.hcw0
        public final void onDetachedFromWindow() {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ml(int i, int i2) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
