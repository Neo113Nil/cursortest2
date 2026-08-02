package com.vk.catalog2.feature.music.holders.audiobook;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.bwt0;
import xsna.e3m;
import xsna.eko;
import xsna.fl4;
import xsna.gzs;
import xsna.iah0;
import xsna.ic40;
import xsna.jjc;
import xsna.k1u0;
import xsna.k840;
import xsna.m33;
import xsna.oq;
import xsna.pa40;
import xsna.qa40;
import xsna.s3q0;
import xsna.sa40;
import xsna.tlo0;
import xsna.uj4;
import xsna.vw0;

/* compiled from: AudioBookCellVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookCellVh implements CatalogViewHolder {
    public final fl4 b;
    public UIBlock c;
    public VkCell d;
    public final boolean e;

    /* compiled from: AudioBookCellVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            Activity h;
            UIBlock uIBlock;
            AudioBookCellVh audioBookCellVh = (AudioBookCellVh) this.receiver;
            audioBookCellVh.getClass();
            if (!jjc.c(400L)) {
                VkCell vkCell = audioBookCellVh.d;
                if (vkCell == null) {
                    vkCell = null;
                }
                Context context = vkCell.getContext();
                if (context != null && (h = e3m.h(context)) != null && (uIBlock = audioBookCellVh.c) != null && (uIBlock instanceof UIBlockAudioBookItem)) {
                    ic40 w = audioBookCellVh.b.w();
                    AudioBook audioBook = ((UIBlockAudioBookItem) uIBlock).y;
                    w.o(h, audioBook, new AudioBookBottomSheetLaunchPoint.AudioBookListPoint.AudioBookFavoriteList(audioBook.b, audioBook.r, audioBook.t), MusicPlaybackLaunchContext.Fb(uIBlock.f), false);
                }
            }
            return s3q0.a;
        }
    }

    public AudioBookCellVh(fl4 fl4Var) {
        this.b = fl4Var;
        bpn0 bpn0Var = k840.a.a;
        this.e = k840.a.i.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockAudioBookItem) {
            this.c = uIBlock;
            UIBlockAudioBookItem uIBlockAudioBookItem = (UIBlockAudioBookItem) uIBlock;
            AudioBook audioBook = uIBlockAudioBookItem.y;
            VkCell vkCell = this.d;
            if (vkCell == null) {
                vkCell = null;
            }
            Context context = vkCell.getContext();
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
            VkCell vkCell2 = this.d;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            VkCell.Left.a aVar2 = VkCell.Left.Companion;
            Image image = audioBook.j;
            vkCell2.setLeft(VkCell.Left.a.a(aVar2, new VkCell.Left.Main.e(new qa40(image != null ? new Thumb(image) : null, audioBook.s == AudioBooksAccessStatus.FREE && !this.e), new Size(iah0.a(78), iah0.a(72)))));
            VkCell vkCell3 = this.d;
            if (vkCell3 == null) {
                vkCell3 = null;
            }
            VkCell.Middle.a aVar3 = VkCell.Middle.Companion;
            tlo0.h d = oq.d(tlo0.Companion, audioBook.c);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkCell3.setMiddle(VkCell.Middle.a.a(aVar3, new VkCell.Middle.e(d, 2, truncateAt, (VkCell.Middle.e.b) null, (!audioBook.f || a2 == null) ? null : new VkCell.Middle.e.b.C0817b(new eko(a2), k1u0.c.a, (tlo0.f) null, (Size) null, 12), 18), new VkCell.Middle.d(new tlo0.h(audioBook.Db()), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
            VkCell vkCell4 = this.d;
            if (vkCell4 == null) {
                vkCell4 = null;
            }
            vkCell4.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new uj4(audioBook), new Size(iah0.a(36), iah0.a(16))), null, null, 29));
            VkCell vkCell5 = this.d;
            bwt0.Q(vkCell5 != null ? vkCell5 : null, R.id.catalog_ui_test_audiobook, uIBlockAudioBookItem.Fb());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audiobook_favorite_cell_item, viewGroup, false);
        inflate.setOnClickListener(new vw0(this, 2));
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.cell_music_track);
        vkCell.setLeftMainViewController(new pa40());
        vkCell.setRightExtraViewController(new sa40(new a(0, this, AudioBookCellVh.class, "handleMoreClick", "handleMoreClick()V", 0)));
        this.d = vkCell;
        return inflate;
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
