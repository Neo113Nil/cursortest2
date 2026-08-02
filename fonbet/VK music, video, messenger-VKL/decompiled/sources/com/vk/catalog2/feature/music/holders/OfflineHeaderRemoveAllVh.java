package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.lq40;
import xsna.nf3;
import xsna.oc40;
import xsna.p5j;
import xsna.q3a;
import xsna.qcy;
import xsna.ss3;
import xsna.tlo0;
import xsna.wq70;
import xsna.x8c;

/* compiled from: OfflineHeaderRemoveAllVh.kt */
/* loaded from: classes16.dex */
public final class OfflineHeaderRemoveAllVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] j = {new MutablePropertyReference1Impl(OfflineHeaderRemoveAllVh.class, "itemView", "getItemView()Lcom/vk/core/view/components/group/header/VkGroupHeader;", 0), p5j.a(0, OfflineHeaderRemoveAllVh.class, "title", "getTitle()Lcom/vk/core/view/components/group/header/VkGroupHeader$Title;", fpf0.a), new MutablePropertyReference1Impl(OfflineHeaderRemoveAllVh.class, "buttonText", "getButtonText()Lcom/vk/core/view/components/group/header/VkGroupHeader$Right;", 0)};
    public final /* synthetic */ x8c b;
    public final lq40 c;
    public final q3a d;
    public final oc40 e;
    public final nf3 f = new nf3();
    public final a g = new a(new VkGroupHeader.d("", null, null, null, 0, null, 510), this);
    public final b h = new b();
    public final io.reactivex.rxjava3.disposables.b i = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: Delegates.kt */
    public static final class a extends wq70<VkGroupHeader.d> {
        public final /* synthetic */ OfflineHeaderRemoveAllVh b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VkGroupHeader.d dVar, OfflineHeaderRemoveAllVh offlineHeaderRemoveAllVh) {
            super(dVar);
            this.b = offlineHeaderRemoveAllVh;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, VkGroupHeader.d dVar, VkGroupHeader.d dVar2) {
            qcy<Object>[] qcyVarArr = OfflineHeaderRemoveAllVh.j;
            this.b.a().setTitle(dVar2);
        }
    }

    /* compiled from: Delegates.kt */
    public static final class b extends wq70<VkGroupHeader.Right> {
        public b() {
            super(null);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, VkGroupHeader.Right right, VkGroupHeader.Right right2) {
            qcy<Object>[] qcyVarArr = OfflineHeaderRemoveAllVh.j;
            OfflineHeaderRemoveAllVh.this.a().setRight(right2);
        }
    }

    public OfflineHeaderRemoveAllVh(q3a q3aVar, oc40 oc40Var, lq40 lq40Var) {
        this.b = new x8c(lq40Var);
        this.c = lq40Var;
        this.d = q3aVar;
        this.e = oc40Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.i.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return;
        }
        String str = uIBlockHeader.y;
        if (str == null) {
            str = "";
        }
        VkGroupHeader.d dVar = new VkGroupHeader.d(str, null, null, null, 0, null, 510);
        qcy<?>[] qcyVarArr = j;
        this.g.setValue(this, qcyVarArr[1], dVar);
        UIBlockActionClearRecent uIBlockActionClearRecent = ((UIBlockHeader) uIBlock).H;
        a().setSize(VkGroupHeader.Size.Small);
        if (uIBlockActionClearRecent != null) {
            tlo0.a aVar = tlo0.Companion;
            String string = a().getContext().getString(R.string.music_offline_remove_all);
            aVar.getClass();
            this.h.setValue(this, qcyVarArr[2], new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(new tlo0.h(string), new ss3(17, this, uIBlock), VkButton.Size.Small, null, VkButton.Appearance.Accent, null, 488), null, null, 6));
        }
    }

    public final VkGroupHeader a() {
        return (VkGroupHeader) this.f.getValue(this, j[0]);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkGroupHeader vkGroupHeader = new VkGroupHeader(layoutInflater.getContext(), null, 6);
        qcy<Object> qcyVar = j[0];
        this.f.c = vkGroupHeader;
        return vkGroupHeader;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
