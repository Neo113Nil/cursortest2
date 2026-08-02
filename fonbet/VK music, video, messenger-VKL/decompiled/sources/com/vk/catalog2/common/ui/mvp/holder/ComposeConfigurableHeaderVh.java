package com.vk.catalog2.common.ui.mvp.holder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.aza;
import xsna.b5a;
import xsna.dnh;
import xsna.eda;
import xsna.epx;
import xsna.fbh;
import xsna.jai;
import xsna.m2g;
import xsna.msy;
import xsna.nda;

/* compiled from: ComposeConfigurableHeaderVh.kt */
/* loaded from: classes16.dex */
public final class ComposeConfigurableHeaderVh extends ComposeHeaderIconShowAllBadgeVh {
    public static final /* synthetic */ int F = 0;
    public final Object B;
    public final Object C;
    public final Object D;
    public ComposeView E;

    public ComposeConfigurableHeaderVh(a aVar, nda ndaVar, eda edaVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar2, SearchStatInfoProvider searchStatInfoProvider) {
        super(aVar, ndaVar, edaVar, b5aVar, aVar2, searchStatInfoProvider, null, 384);
        m2g m2gVar = new m2g(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = msy.a(lazyThreadSafetyMode, m2gVar);
        this.C = msy.a(lazyThreadSafetyMode, new fbh(this, 5));
        this.D = msy.a(lazyThreadSafetyMode, new dnh(this, 4));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh, com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh, com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        ComposeView j = j();
        ViewParent parent = j.getParent();
        ?? r2 = this.B;
        if (!epx.f(parent, (ConstraintLayout) r2.getValue())) {
            ViewParent parent2 = j.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(j);
            }
            ((ConstraintLayout) r2.getValue()).addView(j);
        }
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        TopTitle topTitle = uIBlockHeader != null ? uIBlockHeader.B : null;
        if (topTitle == null) {
            j.setVisibility(8);
            k(false);
        } else {
            j.setVisibility(0);
            j.setContent(new jai(-1375066719, new aza(topTitle, 2), true));
            k(true);
        }
    }

    public final ComposeView j() {
        ComposeView composeView = this.E;
        if (composeView != null) {
            return composeView;
        }
        ComposeView composeView2 = new ComposeView(a().getContext(), null, 6);
        composeView2.setId(View.generateViewId());
        this.E = composeView2;
        return composeView2;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void k(boolean z) {
        b bVar = new b();
        ?? r6 = this.B;
        bVar.i((ConstraintLayout) r6.getValue());
        ComposeView j = j();
        int dimensionPixelSize = a().getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_m);
        int dimensionPixelSize2 = a().getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_xs);
        ?? r9 = this.C;
        if (z) {
            bVar.l(((TextView) r9.getValue()).getId(), 3, j.getId(), 4, dimensionPixelSize2);
        } else {
            bVar.l(((TextView) r9.getValue()).getId(), 3, 0, 3, 0);
        }
        bVar.l(j.getId(), 3, 0, 3, dimensionPixelSize);
        bVar.l(j.getId(), 6, ((TextView) r9.getValue()).getId(), 6, 0);
        bVar.p(j.getId(), -2);
        bVar.n(j.getId(), -2);
        ?? r11 = this.D;
        bVar.l(((View) r11.getValue()).getId(), 3, ((TextView) r9.getValue()).getId(), 3, 0);
        bVar.l(((View) r11.getValue()).getId(), 4, ((TextView) r9.getValue()).getId(), 4, 0);
        bVar.b((ConstraintLayout) r6.getValue());
    }
}
