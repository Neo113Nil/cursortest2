package com.vk.catalog2.feature.music.holders.vkmix.small;

import android.content.Context;
import android.content.res.Configuration;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UiBlockSimpleVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import xsna.b4k0;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.sk7;
import xsna.u2b0;
import xsna.zaf0;
import xsna.zb60;

/* compiled from: SmallVkMixVh.kt */
/* loaded from: classes16.dex */
public final class SmallVkMixVh extends MusicVkMixVh<UiBlockSimpleVkMix> implements ResumableViewHolder {
    public final b5a i;
    public UiBlockSimpleVkMix j;
    public TextView k;
    public TextView l;
    public MusicRoundPlayView m;
    public VKImageView n;
    public Group o;
    public GLSurfaceView p;
    public b4k0 q;
    public boolean r;

    public SmallVkMixVh(int i, b5a b5aVar, u2b0 u2b0Var, zaf0 zaf0Var) {
        super(u2b0Var, zaf0Var, i);
        this.i = b5aVar;
        this.j = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        int[] referencedIds;
        View findViewById;
        if (uIBlock instanceof UiBlockSimpleVkMix) {
            UiBlockSimpleVkMix uiBlockSimpleVkMix = (UiBlockSimpleVkMix) uIBlock;
            this.j = uiBlockSimpleVkMix;
            Group group = this.o;
            if (group != null && (referencedIds = group.getReferencedIds()) != null) {
                for (int i : referencedIds) {
                    ViewGroup viewGroup = this.e;
                    if (viewGroup != null && (findViewById = viewGroup.findViewById(i)) != null) {
                        bwt0.i0(findViewById, new zb60(this, 24));
                    }
                }
            }
            TextView textView = this.l;
            if (textView == null) {
                textView = null;
            }
            textView.setText(uiBlockSimpleVkMix.A);
            VKImageView vKImageView = this.n;
            if (vKImageView != null) {
                vKImageView.s0(uiBlockSimpleVkMix.D);
            }
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
        b4k0 b4k0Var = this.q;
        if (b4k0Var != null) {
            boolean z = state != MusicRoundPlayView.State.PAUSE;
            if (b4k0Var.v != z) {
                b4k0Var.v = z;
                if (z) {
                    b4k0Var.k(0.45f, 0.4f);
                    b4k0Var.l(1.0f, 2.3f);
                    b4k0Var.d(1.9f, 2.4f);
                } else {
                    b4k0Var.k(0.4f, 0.45f);
                    b4k0Var.l(2.3f, 1.0f);
                    b4k0Var.d(2.4f, 1.9f);
                }
            }
        }
        UiBlockSimpleVkMix uiBlockSimpleVkMix = this.j;
        if (uiBlockSimpleVkMix != null && this.r) {
            this.i.a(new cfp0(uiBlockSimpleVkMix, state));
            this.r = false;
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final UiBlockSimpleVkMix b() {
        return this.j;
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void d() {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return;
        }
        this.k = (TextView) bwt0.p(viewGroup, R.id.title, null, null, 6);
        this.l = (TextView) bwt0.p(viewGroup, R.id.description, null, null, 6);
        this.m = (MusicRoundPlayView) bwt0.p(viewGroup, R.id.play_button, null, null, 6);
        this.n = (VKImageView) bwt0.q(viewGroup, R.id.image, null, 6);
        this.o = (Group) bwt0.q(viewGroup, R.id.title_block, null, 6);
        this.c.d();
        GLSurfaceView gLSurfaceView = (GLSurfaceView) bwt0.q(viewGroup, R.id.sineWaveGlSurfaceView, null, 6);
        if (gLSurfaceView == null) {
            return;
        }
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextClientVersion(2);
        b4k0 b4k0Var = new b4k0(gLSurfaceView.getContext().getApplicationContext());
        gLSurfaceView.setRenderer(b4k0Var);
        this.q = b4k0Var;
        gLSurfaceView.setRenderMode(1);
        this.p = gLSurfaceView;
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void k(String str) {
        if (this.j != null) {
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
        this.r = true;
        MusicRoundPlayView musicRoundPlayView = this.m;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        MusicVkMixVh.h(this, musicRoundPlayView.a(), null, new sk7(context, 2), 2);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        GLSurfaceView gLSurfaceView = this.p;
        if (gLSurfaceView != null) {
            gLSurfaceView.onPause();
            gLSurfaceView.onResume();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        GLSurfaceView gLSurfaceView = this.p;
        if (gLSurfaceView != null) {
            gLSurfaceView.onPause();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        GLSurfaceView gLSurfaceView = this.p;
        if (gLSurfaceView != null) {
            gLSurfaceView.onResume();
        }
    }
}
