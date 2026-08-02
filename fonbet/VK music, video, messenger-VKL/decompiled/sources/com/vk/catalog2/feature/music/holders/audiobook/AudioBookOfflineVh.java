package com.vk.catalog2.feature.music.holders.audiobook;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ahn;
import xsna.bma;
import xsna.c98;
import xsna.cma;
import xsna.dko;
import xsna.fl4;
import xsna.gko;
import xsna.gzs;
import xsna.hq;
import xsna.iah0;
import xsna.jno0;
import xsna.k1u0;
import xsna.ngv0;
import xsna.qgv0;
import xsna.sgv0;
import xsna.th4;
import xsna.tlo0;
import xsna.vgv0;
import xsna.wx0;
import xsna.x7g;

/* compiled from: AudioBookOfflineVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookOfflineVh implements CatalogViewHolder {
    public final fl4 b;
    public UIBlockAudioBookItem c;
    public VkRichCell d;

    public AudioBookOfflineVh(fl4 fl4Var) {
        this.b = fl4Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockAudioBookItem) {
            UIBlockAudioBookItem uIBlockAudioBookItem = (UIBlockAudioBookItem) uIBlock;
            this.c = uIBlockAudioBookItem;
            AudioBook audioBook = uIBlockAudioBookItem.y;
            if (audioBook == null) {
                return;
            }
            VkRichCell vkRichCell = this.d;
            if (vkRichCell == null) {
                vkRichCell = null;
            }
            VkCell.Left.a aVar = VkCell.Left.Companion;
            Image image = audioBook.j;
            vkRichCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.d(new cma(image != null ? new Thumb(image) : null), VkCell.Left.Main.Size.Large)));
            VkRichCell vkRichCell2 = this.d;
            if (vkRichCell2 == null) {
                vkRichCell2 = null;
            }
            tlo0.a aVar2 = tlo0.Companion;
            List list = audioBook.k;
            if (list == null) {
                list = EmptyList.b;
            }
            tlo0.d b = hq.b(aVar2, R.plurals.music_title_several_audio_book_chapters, list.size());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkRichCell2.setMiddle(ahn.v(new vgv0(new tlo0.h(audioBook.c), (ngv0.a) null, !audioBook.f ? null : new ngv0.a(new gko(R.drawable.vk_icon_explicit_12), new x7g(R.attr.vk_ui_icon_tertiary), null, null, 12), 1, 2), null, new qgv0(new tlo0.h(audioBook.Db()), (ngv0.a) null, (ngv0.a) null, 1, 6), new sgv0(6, b), null, null, null, 498));
            VkRichCell vkRichCell3 = this.d;
            if (vkRichCell3 == null) {
                vkRichCell3 = null;
            }
            vkRichCell3.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_arrow_down_circle_16), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_track_buffer)), (Size) null, (tlo0) null, false, (gzs) null, 60), new VkCell.Right.ExtraAction.d(new wx0(1, this, audioBook), (tlo0.f) null, 6), null, 25));
            VkRichCell vkRichCell4 = this.d;
            View findViewById = (vkRichCell4 != null ? vkRichCell4 : null).findViewById(R.id.ds_internal_cell_right_extra_actions_wrapper);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = iah0.a(26.0f);
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRichCell vkRichCell = new VkRichCell(layoutInflater.getContext(), null, 6, 0);
        this.d = vkRichCell;
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkRichCell.setLeftMainPictureController(new bma());
        vkRichCell.setOnClickListener(new c98(new th4(0, this, vkRichCell), 1));
        TextView textView = (TextView) vkRichCell.findViewById(R.id.overtitle);
        if (textView != null) {
            jno0.c(textView, R.attr.vk_ui_text_secondary);
        }
        return vkRichCell;
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
