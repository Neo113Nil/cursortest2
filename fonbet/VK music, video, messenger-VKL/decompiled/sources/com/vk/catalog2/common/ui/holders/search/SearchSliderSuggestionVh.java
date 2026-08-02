package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchSuggestionAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.dto.music.SearchSuggestion;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.b5a;
import xsna.cfp0;
import xsna.jjc;
import xsna.mba;
import xsna.myc0;
import xsna.nt10;
import xsna.s490;
import xsna.t440;

/* compiled from: SearchSliderSuggestionVh.kt */
/* loaded from: classes16.dex */
public final class SearchSliderSuggestionVh extends CatalogClickableViewHolder {
    public VkToolButton e;

    /* compiled from: SearchSliderSuggestionVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchSuggestion.Type.values().length];
            try {
                iArr[SearchSuggestion.Type.Recent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchSuggestion.Type.RecentWithoutClear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchSuggestion.Type.Popular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchSuggestion.Type.SectionLink.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchSuggestion.Type.MovieLink.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchSuggestion.Type.MetaChannelLink.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SearchSliderSuggestionVh(mba mbaVar, b5a b5aVar) {
        super(mbaVar, b5aVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final cfp0 a(int i, UIBlock uIBlock) {
        return i == R.id.search_suggestion ? new cfp0(uIBlock, new SearchSuggestionAnalyticsInfo(SearchSuggestionAnalyticsInfo.ClickTarget.Open)) : super.a(i, uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        Context context;
        int i;
        VkToolButton vkToolButton = this.e;
        if (vkToolButton == null || (context = vkToolButton.getContext()) == null || !(uIBlock instanceof UIBlockSearchSuggestion)) {
            return;
        }
        SearchSuggestion searchSuggestion = ((UIBlockSearchSuggestion) uIBlock).y;
        String str = searchSuggestion.d;
        CharSequence charSequence = searchSuggestion.c;
        String str2 = searchSuggestion.e;
        if (myc0.f(str)) {
            charSequence = Html.fromHtml(searchSuggestion.d, 0);
        } else if (myc0.f(str2)) {
            charSequence = s490.d(context, charSequence, str2, R.attr.vk_ui_text_secondary);
        }
        VkToolButton vkToolButton2 = this.e;
        if (vkToolButton2 != null) {
            vkToolButton2.setText(charSequence);
            switch (a.$EnumSwitchMapping$0[searchSuggestion.g.ordinal()]) {
                case 1:
                case 2:
                    i = R.drawable.vk_icon_history_backward_outline_24;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i = R.drawable.vk_icon_search_outline_16;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            VkToolButton.c(vkToolButton2, Integer.valueOf(i));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(R.layout.catalog_common_slider_search_hint_item, viewGroup, false);
        VkToolButton vkToolButton = (VkToolButton) inflate.findViewById(R.id.search_suggestion);
        this.e = vkToolButton;
        if (vkToolButton != null) {
            jjc.g(vkToolButton, new nt10(this, 21));
            awt0.o(vkToolButton, new t440(vkToolButton, 23));
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
