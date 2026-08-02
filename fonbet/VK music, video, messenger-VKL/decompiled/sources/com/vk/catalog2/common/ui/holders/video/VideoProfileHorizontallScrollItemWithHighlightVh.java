package com.vk.catalog2.common.ui.holders.video;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.d3j0;
import xsna.g2u0;
import xsna.gqh0;
import xsna.h7v;
import xsna.jlu0;
import xsna.lw3;
import xsna.msy;
import xsna.o93;
import xsna.q3a;
import xsna.to2;
import xsna.w8i;
import xsna.z8s0;

/* compiled from: VideoProfileHorizontallScrollItemWithHighlightVh.kt */
/* loaded from: classes16.dex */
public final class VideoProfileHorizontallScrollItemWithHighlightVh implements CatalogViewHolder, View.OnClickListener, w8i {
    public final CatalogViewType b;
    public final b5a c;
    public final q3a d;
    public View e;
    public TextView f;
    public UIBlockAction g;
    public View h;
    public VkOnboardingHighlighter i;
    public final Object j;
    public final Object k;

    public VideoProfileHorizontallScrollItemWithHighlightVh(CatalogViewType catalogViewType, b5a b5aVar, q3a q3aVar) {
        this.b = catalogViewType;
        this.c = b5aVar;
        this.d = q3aVar;
        gqh0 gqh0Var = new gqh0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, gqh0Var);
        this.k = msy.a(lazyThreadSafetyMode, new d3j0(this, 19));
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockAction uIBlockAction = uIBlock instanceof UIBlockAction ? (UIBlockAction) uIBlock : null;
        if (uIBlockAction != null) {
            TextView textView = this.f;
            TextView textView2 = textView == null ? null : textView;
            if (textView == null) {
                textView = null;
            }
            Resources resources = textView.getResources();
            UIBlockActionTextButton uIBlockActionTextButton = uIBlockAction instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) uIBlockAction : null;
            textView2.setText(resources.getString(R.string.higlighted_text, uIBlockActionTextButton != null ? uIBlockActionTextButton.z : null));
            this.g = uIBlockAction;
            if (this.b == CatalogViewType.VIDEO_CHANGE_PROFILE) {
                ?? r11 = this.k;
                if (!((h7v) r11.getValue()).m(HintId.INFO_VIDEO_CHILD_PROFILE)) {
                    h7v h7vVar = (h7v) r11.getValue();
                    HintId hintId = HintId.INFO_CHANGE_CHILD_PROFILE;
                    if (h7vVar.m(hintId)) {
                        Hint p = ((h7v) r11.getValue()).p(hintId.getId());
                        if (p != null) {
                            ((h7v) r11.getValue()).s(p);
                        }
                        this.d.b(new z8s0(new lw3(1, this, VideoProfileHorizontallScrollItemWithHighlightVh.class, "isCurrentBlock", "isCurrentBlock(Lcom/vk/catalog2/common/dto/api/ui/UIBlock;)Z", 0, 12)), false);
                        VkOnboardingHighlighter vkOnboardingHighlighter = this.i;
                        (vkOnboardingHighlighter != null ? vkOnboardingHighlighter : null).post(new o93(this, 25));
                    }
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_video_profile_horizontal_item_with_highlight_vh, viewGroup, false);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        View findViewById = inflate.findViewById(R.id.action);
        this.h = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new c98(this, 1));
        }
        inflate.setOnClickListener(new c98(this, 1));
        this.i = (VkOnboardingHighlighter) inflate.findViewById(R.id.highlight);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        VkOnboardingHighlighter vkOnboardingHighlighter = this.i;
        if (vkOnboardingHighlighter == null) {
            vkOnboardingHighlighter = null;
        }
        vkOnboardingHighlighter.post(new to2(this, 15));
        UIBlockAction uIBlockAction = this.g;
        if (uIBlockAction != null) {
            this.c.a(new cfp0(uIBlockAction, null));
        }
        if (this.b == CatalogViewType.VIDEO_CHANGE_PROFILE) {
            Activity c = g2u0.c(view);
            FragmentActivity fragmentActivity = c instanceof FragmentActivity ? (FragmentActivity) c : null;
            if (fragmentActivity == null) {
                return;
            }
            ((jlu0) this.j.getValue()).h(fragmentActivity, MultiAccountEntryPoint.VkVideoProfile.d);
        }
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
