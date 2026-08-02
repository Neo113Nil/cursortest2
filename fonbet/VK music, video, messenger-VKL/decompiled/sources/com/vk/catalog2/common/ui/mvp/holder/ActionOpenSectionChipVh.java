package com.vk.catalog2.common.ui.mvp.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.f4m;
import xsna.iah0;
import xsna.nda;

/* compiled from: ActionOpenSectionChipVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenSectionChipVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public final nda c;
    public final b5a d;
    public CheckedTextView e;
    public UIBlockActionOpenSection f;

    public ActionOpenSectionChipVh(a aVar, nda ndaVar, b5a b5aVar) {
        this.b = aVar;
        this.c = ndaVar;
        this.d = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlock instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlock : null;
        if (uIBlockActionOpenSection == null) {
            return;
        }
        this.f = uIBlockActionOpenSection;
        CheckedTextView checkedTextView = this.e;
        (checkedTextView != null ? checkedTextView : null).setText(((UIBlockActionOpenSection) uIBlock).z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflater.inflate(R.layout.catalog2_subcategory_filter, viewGroup, false);
        this.e = checkedTextView;
        checkedTextView.setBackground(checkedTextView.getContext().getDrawable(R.drawable.subcategory_filter_button_background));
        float f = 12;
        float f2 = 6;
        checkedTextView.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        float f3 = 16;
        f4m.t(iah0.a(f3), checkedTextView);
        f4m.q(iah0.a(f3), checkedTextView);
        checkedTextView.setOnClickListener(new c98(this, 1));
        return checkedTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionOpenSection uIBlockActionOpenSection = this.f;
        if (uIBlockActionOpenSection == null) {
            return;
        }
        this.d.a(new cfp0(uIBlockActionOpenSection, null));
        nda.e(this.c, view.getContext(), this.b, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
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
