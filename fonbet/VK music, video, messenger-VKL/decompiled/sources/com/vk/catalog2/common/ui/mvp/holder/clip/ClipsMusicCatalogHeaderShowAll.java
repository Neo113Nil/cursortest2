package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.awt0;
import xsna.b5a;
import xsna.bpn0;
import xsna.c98;
import xsna.cn70;
import xsna.drm0;
import xsna.e43;
import xsna.eda;
import xsna.epx;
import xsna.f4m;
import xsna.h7v;
import xsna.his0;
import xsna.l7v;
import xsna.m52;
import xsna.mf40;
import xsna.nda;
import xsna.pla;
import xsna.wvw;

/* compiled from: ClipsMusicCatalogHeaderShowAll.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicCatalogHeaderShowAll extends HeaderShowAllVh {
    public final h7v B;
    public final String C;
    public final Hint D;
    public VkText E;
    public VkOnboardingHighlighter F;

    public ClipsMusicCatalogHeaderShowAll(mf40 mf40Var, nda ndaVar, eda edaVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(mf40Var, ndaVar, edaVar, b5aVar, aVar, R.layout.catalog_header_music_show_all, searchStatInfoProvider);
        bpn0 bpn0Var = pla.a;
        l7v b = ((wvw) (bpn0Var == null ? null : bpn0Var).getValue()).b();
        this.B = b;
        String id = HintId.CLIPS_MUSIC_PICKER_HIGHLIGHTING_TRENDS_BLOCK.getId();
        this.C = id;
        this.D = b.p(id);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        UIBlockHint uIBlockHint;
        super.N6(uIBlock);
        View view = this.f;
        if (view == null) {
            view = null;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z = false;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader != null) {
            VkText vkText = this.E;
            if (vkText != null) {
                List l = e43.l(uIBlockHeader.C, uIBlockHeader.D, uIBlockHeader.E, uIBlockHeader.F, uIBlockHeader.G, uIBlockHeader.H, uIBlockHeader.I, uIBlockHeader.J, uIBlockHeader.K, uIBlockHeader.L);
                if (!(l instanceof Collection) || !l.isEmpty()) {
                    Iterator it = l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((UIBlock) it.next()) != null) {
                            z = true;
                            break;
                        }
                    }
                }
                awt0.u(vkText, z);
            }
            String str2 = uIBlockHeader.z;
            if (str2 == null || drm0.N(str2)) {
                TextView textView = this.g;
                if (textView == null) {
                    textView = null;
                }
                f4m.q(cn70.b(11), textView);
            } else {
                TextView textView2 = this.g;
                if (textView2 == null) {
                    textView2 = null;
                }
                f4m.q(cn70.b(1), textView2);
            }
            String str3 = uIBlockHeader.y;
            String str4 = this.C;
            h7v h7vVar = this.B;
            if (h7vVar.a(str4)) {
                UIBlockHeader uIBlockHeader2 = this.k;
                String str5 = (uIBlockHeader2 == null || (uIBlockHint = uIBlockHeader2.j) == null) ? null : uIBlockHint.y;
                Hint hint = this.D;
                if (epx.f(str5, hint != null ? hint.b : null)) {
                    TextView textView3 = this.g;
                    TextView textView4 = textView3 != null ? textView3 : null;
                    textView4.setText((textView3 != null ? textView3 : null).getResources().getString(R.string.higlighted_text, str3));
                    his0.x(textView4, R.color.vk_black);
                    f4m.q(cn70.b(1), textView4);
                    textView4.post(new m52(this, 1));
                    if (hint == null || (str = hint.b) == null) {
                        return;
                    }
                    h7vVar.b(str);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        VkText vkText = (VkText) k5.findViewById(R.id.header_show_all);
        this.E = vkText;
        if (vkText != null) {
            vkText.setOnClickListener(new c98(this, 1));
        }
        this.F = (VkOnboardingHighlighter) k5.findViewById(R.id.highlight_title);
        return k5;
    }
}
