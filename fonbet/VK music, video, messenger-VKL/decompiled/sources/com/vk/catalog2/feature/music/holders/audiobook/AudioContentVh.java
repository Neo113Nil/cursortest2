package com.vk.catalog2.feature.music.holders.audiobook;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.cvk;
import xsna.e3m;
import xsna.fy0;
import xsna.gzs;
import xsna.izs;
import xsna.jm4;
import xsna.k1u0;
import xsna.kbj0;
import xsna.km4;
import xsna.maz;
import xsna.nr4;
import xsna.o0r0;
import xsna.oq;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.u2b0;
import xsna.x7g;
import xsna.xwk;

/* compiled from: AudioContentVh.kt */
/* loaded from: classes16.dex */
public final class AudioContentVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final b5a c;
    public UIBlockAudioContentCard d;
    public VkCell e;

    /* compiled from: AudioContentVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            Podcast podcast;
            int intValue = num.intValue();
            AudioContentVh audioContentVh = (AudioContentVh) this.receiver;
            UIBlockAudioContentCard uIBlockAudioContentCard = audioContentVh.d;
            UIBlockAudioContentCard.PodcastCard podcastCard = uIBlockAudioContentCard instanceof UIBlockAudioContentCard.PodcastCard ? (UIBlockAudioContentCard.PodcastCard) uIBlockAudioContentCard : null;
            if (podcastCard != null && (podcast = podcastCard.A) != null) {
                VkCell vkCell = audioContentVh.e;
                Context context = (vkCell != null ? vkCell : null).getContext();
                if (context != null) {
                    if (intValue == R.id.music_action_go_to_community) {
                        xwk.e().m(context, podcast.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    } else if (intValue == R.id.music_action_share) {
                        kbj0.c(nr4.b(), context, podcast.d(), true, null, null, false, 120);
                    } else if (intValue == R.id.music_action_copy_link) {
                        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                        String d = podcast.d();
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(d, d));
                        cvk.u(R.string.link_copied, false);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public AudioContentVh(u2b0 u2b0Var, b5a b5aVar) {
        this.b = u2b0Var;
        this.c = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockAudioContentCard uIBlockAudioContentCard = uIBlock instanceof UIBlockAudioContentCard ? (UIBlockAudioContentCard) uIBlock : null;
        if (uIBlockAudioContentCard == null) {
            return;
        }
        this.d = uIBlockAudioContentCard;
        UIBlockAudioContentCard uIBlockAudioContentCard2 = (UIBlockAudioContentCard) uIBlock;
        if (uIBlockAudioContentCard2 instanceof UIBlockAudioContentCard.AudioBookCard) {
            VkCell vkCell = this.e;
            if (vkCell == null) {
                vkCell = null;
            }
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.h d = oq.d(tlo0.Companion, ((UIBlockAudioContentCard.AudioBookCard) uIBlock).A.c);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(d, 2, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.f(R.string.audiobook_badge), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
            return;
        }
        if (!(uIBlockAudioContentCard2 instanceof UIBlockAudioContentCard.PodcastCard)) {
            throw new NoWhenBranchMatchedException();
        }
        Podcast podcast = ((UIBlockAudioContentCard.PodcastCard) uIBlock).A;
        String str = podcast.d;
        List<Thumb> list = podcast.f;
        if (list != null) {
            VkCell vkCell2 = this.e;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            vkCell2.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new km4(list), VkCell.Left.Main.Size.Large)));
        }
        VkCell vkCell3 = this.e;
        if (vkCell3 == null) {
            vkCell3 = null;
        }
        vkCell3.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, str == null ? null : new VkCell.Middle.e(oq.d(tlo0.Companion, str), 2, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(tq.h(tlo0.Companion, R.string.podcast_badge), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_vk_cell_item, viewGroup, false);
        inflate.setOnClickListener(new c98(this, 1));
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.cell);
        vkCell.setLeftMainPictureController(new jm4());
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new fy0(2, this, inflate), tq.h(tlo0.Companion, R.string.music_talkback_more), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary))), null, 27));
        this.e = vkCell;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        UIBlockAudioContentCard uIBlockAudioContentCard = this.d;
        if (uIBlockAudioContentCard instanceof UIBlockAudioContentCard.AudioBookCard) {
            return;
        }
        if (!(uIBlockAudioContentCard instanceof UIBlockAudioContentCard.PodcastCard)) {
            if (uIBlockAudioContentCard != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (uIBlockAudioContentCard != null) {
            this.c.a(new cfp0(uIBlockAudioContentCard, null));
        }
        maz e = xwk.d().e();
        Uri parse = Uri.parse(((UIBlockAudioContentCard.PodcastCard) uIBlockAudioContentCard).A.d());
        LaunchContext.a aVar = new LaunchContext.a();
        UIBlockAudioContentCard uIBlockAudioContentCard2 = this.d;
        aVar.d = uIBlockAudioContentCard2 != null ? uIBlockAudioContentCard2.f : null;
        e.d(h, parse, aVar.a(), null);
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
