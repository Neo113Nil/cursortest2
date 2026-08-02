package com.vk.catalog2.feature.music.holders.playmix;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ava0;
import xsna.b780;
import xsna.bv40;
import xsna.c98;
import xsna.e3m;
import xsna.epx;
import xsna.gzs;
import xsna.u2b0;
import xsna.zaf0;

/* compiled from: PlayMixActionVh.kt */
/* loaded from: classes16.dex */
public final class PlayMixActionVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final zaf0 c;
    public final ava0 d;
    public MusicRoundPlayView e;
    public VKImageView f;
    public UIBlockPlayMixAction g;
    public TextView h;
    public final bv40 i;

    /* compiled from: PlayMixActionVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((PlayMixActionVh) this.receiver).a());
        }
    }

    public PlayMixActionVh(u2b0 u2b0Var, zaf0 zaf0Var, ava0 ava0Var) {
        this.b = u2b0Var;
        this.c = zaf0Var;
        this.d = ava0Var;
        this.i = new bv40(u2b0Var, new b(0, this, PlayMixActionVh.class, "isSameMix", "isSameMix()Z", 0));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        VKImageView vKImageView = this.f;
        if (vKImageView != null) {
            vKImageView.setOnLoadCallback(null);
        }
        this.i.b();
        this.c.a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ImageSize Cb;
        String str = null;
        UIBlockPlayMixAction uIBlockPlayMixAction = uIBlock instanceof UIBlockPlayMixAction ? (UIBlockPlayMixAction) uIBlock : null;
        if (uIBlockPlayMixAction == null) {
            return;
        }
        this.g = uIBlockPlayMixAction;
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(((UIBlockPlayMixAction) uIBlock).C.a);
        }
        VKImageView vKImageView = this.f;
        if (vKImageView != null) {
            Image image = ((UIBlockPlayMixAction) uIBlock).C.c;
            if (image != null && (Cb = image.Cb(e3m.a(R.dimen.music_smart_playlist_image_width, vKImageView.getContext()), true, false)) != null) {
                str = Cb.d.d;
            }
            vKImageView.s0(str);
        }
        this.i.e();
    }

    public final boolean a() {
        UIBlockPlayMixAction uIBlockPlayMixAction = this.g;
        String str = uIBlockPlayMixAction != null ? uIBlockPlayMixAction.E : null;
        StartPlaySource j = this.b.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        return epx.f(str, startPlayVkMixSource != null ? startPlayVkMixSource.j : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.d();
        View inflate = layoutInflater.inflate(R.layout.catalog_music_vibe_small_playlist_slider, viewGroup, false);
        MusicRoundPlayView musicRoundPlayView = (MusicRoundPlayView) inflate.findViewById(R.id.play_view);
        this.i.a(musicRoundPlayView);
        musicRoundPlayView.setOnClickListener(new c98(this, 1));
        this.e = musicRoundPlayView;
        this.h = (TextView) inflate.findViewById(R.id.playlist_title);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.playlist_image);
        if (vKImageView != null) {
            vKImageView.W();
            vKImageView.setOnLoadCallback(new a(vKImageView));
        } else {
            vKImageView = null;
        }
        this.f = vKImageView;
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        if (a()) {
            this.b.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        MusicRoundPlayView musicRoundPlayView = this.e;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        if (musicRoundPlayView.a()) {
            return;
        }
        this.i.c();
        UIBlockPlayMixAction uIBlockPlayMixAction = this.g;
        if (uIBlockPlayMixAction != null) {
            this.d.a(uIBlockPlayMixAction);
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

    /* compiled from: PlayMixActionVh.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKImageView b;

        public a(VKImageView vKImageView) {
            this.b = vKImageView;
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.W();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
