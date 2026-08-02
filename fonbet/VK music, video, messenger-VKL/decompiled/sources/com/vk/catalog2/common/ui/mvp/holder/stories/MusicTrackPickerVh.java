package com.vk.catalog2.common.ui.mvp.holder.stories;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockEmbeddedTabs;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.awt0;
import xsna.b5a;
import xsna.bd0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c98;
import xsna.dhr0;
import xsna.dlh;
import xsna.e43;
import xsna.epx;
import xsna.h94;
import xsna.izs;
import xsna.jwp0;
import xsna.m33;
import xsna.mba;
import xsna.ow2;
import xsna.p4g;
import xsna.q3a;
import xsna.r7g;
import xsna.s3q0;
import xsna.u2b0;
import xsna.ub50;
import xsna.w2o0;

/* compiled from: MusicTrackPickerVh.kt */
/* loaded from: classes16.dex */
public final class MusicTrackPickerVh extends CatalogClickableViewHolder implements View.OnClickListener {
    public static final h94 m = new h94(R.drawable.vk_icon_pause_16, R.string.music_talkback_pause, 0);
    public static final r7g n = new r7g(R.drawable.vk_icon_pause_16, R.string.music_talkback_pause, R.color.vk_white);
    public static final h94 o = new h94(R.drawable.vk_icon_play_16, R.string.music_talkback_play, 0);
    public static final r7g p = new r7g(R.drawable.vk_icon_play_16, R.string.music_talkback_play, R.color.vk_white);
    public final u2b0 e;
    public final int f;
    public final boolean g;
    public final q3a h;
    public ow2 i;
    public ImageView j;
    public ImageView k;
    public final bd0 l;

    /* compiled from: MusicTrackPickerVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            MusicTrackPickerVh musicTrackPickerVh = (MusicTrackPickerVh) this.receiver;
            UIBlock uIBlock = musicTrackPickerVh.d;
            q3a q3aVar = musicTrackPickerVh.h;
            UIBlockMusicTrack uIBlockMusicTrack = uIBlock instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) uIBlock : null;
            if (uIBlockMusicTrack != null) {
                MusicTrack musicTrack = uIBlockMusicTrack.z;
                if (musicTrack.M != booleanValue) {
                    UIBlockMusicTrack Pb = uIBlockMusicTrack.Pb(MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, booleanValue, false, null, null, null, -1, 1048543));
                    if (q3aVar != null) {
                        q3aVar.b(new jwp0(Pb, new dlh(2, musicTrackPickerVh, MusicTrackPickerVh.class, "recursiveFindAndUpdateTrackInBlock", "recursiveFindAndUpdateTrackInBlock(Lcom/vk/catalog2/common/dto/api/ui/UIBlock;Lcom/vk/catalog2/common/dto/api/ui/UIBlock;)Lcom/vk/catalog2/common/dto/api/ui/UIBlock;", 0, 1)), false);
                    }
                } else {
                    UIBlockMusicTrack uIBlockMusicTrack2 = uIBlockMusicTrack;
                    if (q3aVar != null) {
                        q3aVar.b(new jwp0(uIBlockMusicTrack2, new dlh(2, musicTrackPickerVh, MusicTrackPickerVh.class, "recursiveFindAndUpdateTrackInBlock", "recursiveFindAndUpdateTrackInBlock(Lcom/vk/catalog2/common/dto/api/ui/UIBlock;Lcom/vk/catalog2/common/dto/api/ui/UIBlock;)Lcom/vk/catalog2/common/dto/api/ui/UIBlock;", 0, 1)), false);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public /* synthetic */ MusicTrackPickerVh(mba mbaVar, b5a b5aVar, u2b0 u2b0Var, int i) {
        this(mbaVar, b5aVar, u2b0Var, i, false, null);
    }

    public static UIBlock c(UIBlock uIBlock, UIBlock uIBlock2) {
        if (!(uIBlock2 instanceof UIBlockMusicTrack)) {
            return uIBlock;
        }
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            ArrayList<UIBlock> arrayList = uIBlockList.y;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(c((UIBlock) it.next(), uIBlock2));
            }
            uIBlockList.y = p4g.q(arrayList2);
            return uIBlock;
        }
        if (!(uIBlock instanceof UIBlockEmbeddedTabs)) {
            if (!(uIBlock instanceof UIBlockMusicTrack)) {
                return uIBlock;
            }
            UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
            UIBlockMusicTrack uIBlockMusicTrack2 = (UIBlockMusicTrack) uIBlock2;
            return epx.f(uIBlockMusicTrack.F, uIBlockMusicTrack2.F) ? uIBlockMusicTrack.Pb(uIBlockMusicTrack2.z) : uIBlockMusicTrack;
        }
        UIBlockEmbeddedTabs uIBlockEmbeddedTabs = (UIBlockEmbeddedTabs) uIBlock;
        int i = 0;
        for (Object obj : uIBlockEmbeddedTabs.y.A) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            uIBlockEmbeddedTabs.y.A.set(i, c((UIBlock) obj, uIBlock2));
            i = i2;
        }
        return uIBlock;
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicTrack) {
            MusicTrack musicTrack = ((UIBlockMusicTrack) uIBlock).z;
            ow2 ow2Var = this.i;
            if (ow2Var == null) {
                ow2Var = null;
            }
            ow2Var.V5("", false, 0, musicTrack);
            ImageView imageView = this.k;
            if (imageView != null) {
                awt0.u(imageView, musicTrack.L);
            }
            u2b0 u2b0Var = this.e;
            boolean h = u2b0Var.h();
            h94 h94Var = o;
            h94 h94Var2 = m;
            boolean z = this.g;
            w2o0 w2o0Var = (h && epx.f(u2b0Var.b(), musicTrack)) ? z ? n : h94Var2 : z ? p : h94Var;
            ImageView imageView2 = this.j;
            if (imageView2 == null) {
                imageView2 = null;
            }
            w2o0Var.a(imageView2, true);
            if (w2o0Var == h94Var2 || w2o0Var == h94Var) {
                ImageView imageView3 = this.j;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                ow2 ow2Var2 = this.i;
                if (ow2Var2 == null) {
                    ow2Var2 = null;
                }
                imageView3.setImageTintList(ColorStateList.valueOf(dhr0.Y(R.attr.vk_legacy_button_secondary_foreground, bwt0.t(ow2Var2.itemView.getContext()))));
                ImageView imageView4 = this.j;
                if (imageView4 == null) {
                    imageView4 = null;
                }
                imageView4.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
            }
            if (z) {
                ImageView imageView5 = this.j;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                bwt0.p0(imageView5, epx.f(u2b0Var.b(), musicTrack));
            }
            ImageView imageView6 = this.k;
            if (imageView6 != null) {
                imageView6.setSelected(musicTrack.M);
            }
            ImageView imageView7 = this.j;
            (imageView7 != null ? imageView7 : null).setAlpha(musicTrack.B() ? 0.4f : 1.0f);
            ImageView imageView8 = this.k;
            if (imageView8 != null) {
                imageView8.setEnabled(!musicTrack.B() || musicTrack.M);
                imageView8.setAlpha(imageView8.isEnabled() ? 1.0f : 0.4f);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        ImageView imageView = null;
        ub50 ub50Var = new ub50(null);
        ub50Var.h = inflate;
        ub50Var.d();
        ow2 a2 = ub50Var.a(null);
        this.i = a2;
        a2.itemView.setOnClickListener(new c98(this, 1));
        ow2 ow2Var = this.i;
        if (ow2Var == null) {
            ow2Var = null;
        }
        ow2Var.itemView.findViewById(R.id.audio_play_pause_btn).setOnClickListener(new c98(this, 1));
        ow2 ow2Var2 = this.i;
        if (ow2Var2 == null) {
            ow2Var2 = null;
        }
        View findViewById = ow2Var2.itemView.findViewById(R.id.audio_play_pause_btn_icon);
        boolean z = this.g;
        if (z) {
            ImageView imageView2 = (ImageView) findViewById;
            imageView2.setBackground(m33.a(R.drawable.bg_clip_button_play, imageView2.getContext()));
        }
        this.j = (ImageView) findViewById;
        if (z) {
            ow2 ow2Var3 = this.i;
            if (ow2Var3 == null) {
                ow2Var3 = null;
            }
            ImageView imageView3 = (ImageView) ow2Var3.itemView.findViewById(R.id.bookmark_btn);
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                imageView3.setOnClickListener(new c98(this.l, 1));
                imageView = imageView3;
            }
            this.k = imageView;
        }
        return inflate;
    }

    public MusicTrackPickerVh(mba mbaVar, b5a b5aVar, u2b0 u2b0Var, int i, boolean z, q3a q3aVar) {
        super(mbaVar, b5aVar);
        this.e = u2b0Var;
        this.f = i;
        this.g = z;
        this.h = q3aVar;
        this.l = new bd0(this, 11);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
