package com.vk.catalog2.feature.music.ui.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockClearDownloadsHistory;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import defpackage.e0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.enj;
import xsna.fpf0;
import xsna.ix4;
import xsna.nf3;
import xsna.p5j;
import xsna.q3a;
import xsna.qcy;
import xsna.tlo0;
import xsna.wq70;

/* compiled from: MusicHistoryRemoveAllVh.kt */
/* loaded from: classes16.dex */
public final class MusicHistoryRemoveAllVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(MusicHistoryRemoveAllVh.class, "itemView", "getItemView()Lcom/vk/core/view/components/group/header/VkGroupHeader;", 0), p5j.a(0, MusicHistoryRemoveAllVh.class, "title", "getTitle()Lcom/vk/core/view/components/group/header/VkGroupHeader$Title;", fpf0.a), new MutablePropertyReference1Impl(MusicHistoryRemoveAllVh.class, "buttonText", "getButtonText()Lcom/vk/core/view/components/group/header/VkGroupHeader$Right;", 0)};
    public final q3a b;
    public final nf3 c = new nf3();
    public final a d = new a(new VkGroupHeader.d("", null, null, null, 0, null, 510), this);
    public final b e = new b();
    public final ix4 f = new ix4();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: Delegates.kt */
    public static final class a extends wq70<VkGroupHeader.d> {
        public final /* synthetic */ MusicHistoryRemoveAllVh b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VkGroupHeader.d dVar, MusicHistoryRemoveAllVh musicHistoryRemoveAllVh) {
            super(dVar);
            this.b = musicHistoryRemoveAllVh;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, VkGroupHeader.d dVar, VkGroupHeader.d dVar2) {
            qcy<Object>[] qcyVarArr = MusicHistoryRemoveAllVh.h;
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
            qcy<Object>[] qcyVarArr = MusicHistoryRemoveAllVh.h;
            MusicHistoryRemoveAllVh.this.a().setRight(right2);
        }
    }

    public MusicHistoryRemoveAllVh(q3a q3aVar) {
        this.b = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.g.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockClearDownloadsHistory) {
            Integer num = ((UIBlockClearDownloadsHistory) uIBlock).z;
            VkGroupHeader.d dVar = new VkGroupHeader.d(num != null ? enj.f(R.plurals.remove_tracks_title, num.intValue(), a().getContext()) : "", null, null, null, 0, null, 510);
            qcy<?>[] qcyVarArr = h;
            this.d.setValue(this, qcyVarArr[1], dVar);
            a().setSize(VkGroupHeader.Size.Small);
            tlo0.a aVar = tlo0.Companion;
            String string = a().getContext().getString(R.string.music_offline_download_history_clean);
            aVar.getClass();
            this.e.setValue(this, qcyVarArr[2], new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(new tlo0.h(string), new e0(14, this, uIBlock), VkButton.Size.Small, null, VkButton.Appearance.Accent, null, 488), null, null, 6));
        }
    }

    public final VkGroupHeader a() {
        return (VkGroupHeader) this.c.getValue(this, h[0]);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkGroupHeader vkGroupHeader = new VkGroupHeader(layoutInflater.getContext(), null, 6);
        qcy<Object> qcyVar = h[0];
        this.c.c = vkGroupHeader;
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
