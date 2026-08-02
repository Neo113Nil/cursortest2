package com.vk.catalog2.feature.music.holders.vkmix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMixStyle;
import com.vk.catalog2.feature.music.dto.ui.UiBlockSimpleVkMix;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.c98;
import xsna.drm0;
import xsna.e3g;
import xsna.e3m;
import xsna.f4m;
import xsna.fnj;
import xsna.fuc0;
import xsna.iah0;
import xsna.j5g;
import xsna.lrj0;

/* compiled from: SimpleMusicVkMixVh.kt */
/* loaded from: classes16.dex */
public final class SimpleMusicVkMixVh extends MusicVkMixVh<UiBlockSimpleVkMix> {
    public UiBlockSimpleVkMix i;
    public CardView j;
    public TextView k;
    public TextView l;
    public MusicRoundPlayView m;
    public LottieAnimationView n;

    /* compiled from: SimpleMusicVkMixVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiBlockMusicVkMixStyle.values().length];
            try {
                iArr[UiBlockMusicVkMixStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiBlockMusicVkMixStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UiBlockSimpleVkMix) {
            UiBlockSimpleVkMix uiBlockSimpleVkMix = (UiBlockSimpleVkMix) uIBlock;
            this.i = uiBlockSimpleVkMix;
            TextView textView = this.l;
            if (textView == null) {
                textView = null;
            }
            textView.setText(uiBlockSimpleVkMix.A);
            MusicRoundPlayView musicRoundPlayView = this.m;
            if (musicRoundPlayView == null) {
                musicRoundPlayView = null;
            }
            bwt0.i0(musicRoundPlayView, new fuc0(this, 10));
            UiBlockMusicVkMixStyle uiBlockMusicVkMixStyle = uiBlockSimpleVkMix.E;
            CardView cardView = this.j;
            if (cardView == null) {
                cardView = null;
            }
            Context context = cardView.getContext();
            int i = a.$EnumSwitchMapping$0[uiBlockMusicVkMixStyle.ordinal()];
            if (i == 1) {
                CardView cardView2 = this.j;
                if (cardView2 == null) {
                    cardView2 = null;
                }
                f4m.u(cardView2, 0, 0, 0, 0);
                TextView textView2 = this.k;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
                TextView textView3 = this.l;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
                TextView textView4 = this.l;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setAlpha(0.5f);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int a2 = e3m.a(R.dimen.music_vk_mix_card_secondary_margin, context);
                CardView cardView3 = this.j;
                if (cardView3 == null) {
                    cardView3 = null;
                }
                f4m.u(cardView3, a2, a2, a2, a2);
                TextView textView5 = this.k;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setTextColor(context.getColor(R.color.vk_white));
                TextView textView6 = this.l;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setTextColor(context.getColor(R.color.vk_white));
                TextView textView7 = this.l;
                if (textView7 == null) {
                    textView7 = null;
                }
                textView7.setAlpha(0.7f);
            }
            String str = uiBlockSimpleVkMix.C;
            LottieAnimationView lottieAnimationView = this.n;
            LottieAnimationView lottieAnimationView2 = lottieAnimationView != null ? lottieAnimationView : null;
            lottieAnimationView2.setFailureListener(new lrj0());
            lottieAnimationView2.s0(str, (String) j5g.k0(drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
            j(this.b.m0());
        }
    }

    @Override // xsna.x4v0
    public final void a(MusicRoundPlayView.State state) {
        MusicRoundPlayView musicRoundPlayView = this.m;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        musicRoundPlayView.b(state);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final UiBlockSimpleVkMix b() {
        return this.i;
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void d() {
        View inflate;
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        Context context = viewGroup.getContext();
        boolean r = iah0.r(context);
        viewGroup.removeAllViews();
        int i = (!r || fnj.d(context)) ? R.layout.catalog_music_vk_mix : R.layout.catalog_music_vk_mix_small;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (!r || fnj.d(context)) ? e3m.a(R.dimen.music_vk_mix_height, context) : e3m.a(R.dimen.music_vk_mix_height_small, context);
        viewGroup.setLayoutParams(layoutParams);
        LayoutInflater layoutInflater = this.f;
        if (layoutInflater != null && (inflate = layoutInflater.inflate(i, viewGroup, true)) != null) {
            inflate.setClipToOutline(true);
            this.j = (CardView) bwt0.p(inflate, R.id.card_view, null, null, 6);
            this.k = (TextView) bwt0.p(inflate, R.id.title, null, null, 6);
            this.l = (TextView) bwt0.p(inflate, R.id.description, null, null, 6);
            this.m = (MusicRoundPlayView) bwt0.p(inflate, R.id.play_view, null, null, 6);
            this.n = (LottieAnimationView) bwt0.p(inflate, R.id.background_anim, null, null, 6);
            inflate.setOnClickListener(new c98(this, 1));
        }
        this.c.d();
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void k(String str) {
        if (this.i != null) {
            TextView textView = this.k;
            if (textView == null) {
                textView = null;
            }
            textView.setText(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        MusicRoundPlayView musicRoundPlayView = this.m;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        MusicVkMixVh.h(this, musicRoundPlayView.a(), null, new e3g(context, 2), 2);
    }
}
