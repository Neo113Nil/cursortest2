package com.vk.catalog2.common.ui.holders.video.playlist.cover;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumShuffle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.video.VideoAlbum;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.b2;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.Iterator;
import java.util.List;
import xsna.asu0;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.efr0;
import xsna.f4m;
import xsna.fks0;
import xsna.ftu0;
import xsna.g5g;
import xsna.i7;
import xsna.iah0;
import xsna.j5g;
import xsna.j720;
import xsna.l7s;
import xsna.m33;
import xsna.mba;
import xsna.mcr0;
import xsna.n7b0;
import xsna.p4t0;
import xsna.u4t0;
import xsna.u730;
import xsna.u9e;
import xsna.y730;
import xsna.zy2;

/* compiled from: VideoPlaylistCoverXmlVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistCoverXmlVh extends VideoPlaylistCover {
    public final u4t0 e;
    public final fks0 f;
    public final boolean g;
    public VkImageViewTopCrop h;
    public VkSimpleButton i;
    public VkButton j;
    public ImageView k;
    public VkButton l;
    public VkButton m;
    public int n;
    public UIBlockVideoAlbum o;
    public c p;
    public final int q;

    public VideoPlaylistCoverXmlVh(mba mbaVar, b5a b5aVar, u4t0 u4t0Var, fks0 fks0Var) {
        super(mbaVar, b5aVar);
        this.e = u4t0Var;
        this.f = fks0Var;
        boolean r = fks0Var.r();
        this.g = r;
        this.p = EmptyDisposable.INSTANCE;
        this.q = r ? R.layout.catalog2_video_playlist_cover_with_shuffle : R.layout.catalog2_video_playlist_cover;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.e.a();
        this.p.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        g(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCover
    public final void c(UIBlock uIBlock) {
        this.d = uIBlock;
        g(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCover
    public final void d(float f) {
        VkImageViewTopCrop vkImageViewTopCrop = this.h;
        if (vkImageViewTopCrop == null) {
            return;
        }
        if (vkImageViewTopCrop == null) {
            vkImageViewTopCrop = null;
        }
        vkImageViewTopCrop.setAlpha(f);
        VkButton vkButton = this.j;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setAlpha(f);
        if (!this.g) {
            VkSimpleButton vkSimpleButton = this.i;
            (vkSimpleButton != null ? vkSimpleButton : null).setAlpha(f);
            return;
        }
        VkButton vkButton2 = this.m;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.setAlpha(f);
        VkButton vkButton3 = this.l;
        (vkButton3 != null ? vkButton3 : null).setAlpha(f);
    }

    public final void e(boolean z) {
        String string;
        VkButton vkButton = this.m;
        if (vkButton == null) {
            vkButton = null;
        }
        VkButton vkButton2 = this.j;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        if (vkButton2.getVisibility() == 8 && z) {
            string = vkButton.getContext().getString(R.string.video_catalog_subscribed);
        } else {
            VkButton vkButton3 = this.j;
            string = (vkButton3 != null ? vkButton3 : null).getVisibility() == 8 ? vkButton.getContext().getString(R.string.video_catalog_subscribe) : "";
        }
        vkButton.setText(string);
        vkButton.a5(true, Integer.valueOf(z ? R.drawable.vk_icon_done_outline_24 : R.drawable.vk_icon_add_square_outline_24));
    }

    public final void g(UIBlock uIBlock) {
        Object obj;
        int i;
        int i2;
        c cVar;
        if (uIBlock instanceof UIBlockVideoAlbum) {
            UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) uIBlock;
            VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
            List<UIBlockAction> list = uIBlockVideoAlbum.z;
            this.o = uIBlockVideoAlbum;
            UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = (UIBlockActionPlayVideosFromBlock) j5g.a0(g5g.E(list, UIBlockActionPlayVideosFromBlock.class));
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((UIBlockAction) obj) instanceof UIBlockActionToggleAlbumShuffle) {
                        break;
                    }
                }
            }
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            int i3 = 1;
            if (uIBlockActionPlayVideosFromBlock != null) {
                String str = uIBlockActionPlayVideosFromBlock.z;
                VkButton vkButton = this.j;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setVisibility(0);
                if (drm0.N(str)) {
                    str = vkButton.getContext().getString(R.string.video_catalog_watch_all);
                }
                vkButton.setText(str);
                Context context = vkButton.getContext();
                e3m.a aVar = e3m.a;
                vkButton.Z4(m33.a(R.drawable.vk_icon_play_24, context), true);
            } else {
                VkButton vkButton2 = this.j;
                if (vkButton2 == null) {
                    vkButton2 = null;
                }
                f4m.j(vkButton2);
            }
            boolean z = uIBlockActionPlayVideosFromBlock != null;
            boolean z2 = uIBlockAction != null;
            boolean z3 = this.g;
            if (z3 && z2 && z) {
                VkButton vkButton3 = this.l;
                if (vkButton3 == null) {
                    vkButton3 = null;
                }
                vkButton3.setVisibility(0);
                VkButton vkButton4 = this.m;
                if (vkButton4 == null) {
                    vkButton4 = null;
                }
                ViewGroup.LayoutParams layoutParams = vkButton4.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.R = 0.16f;
                bVar.t = -1;
                vkButton4.setLayoutParams(bVar);
                e(videoAlbum.l);
            } else if (z3 || (z2 && !z)) {
                VkButton vkButton5 = this.l;
                if (vkButton5 == null) {
                    vkButton5 = null;
                }
                f4m.j(vkButton5);
                VkButton vkButton6 = this.m;
                if (vkButton6 == null) {
                    vkButton6 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = vkButton6.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                bVar2.t = R.id.left_guideline;
                vkButton6.setLayoutParams(bVar2);
                e(videoAlbum.l);
            } else if (z) {
                VkSimpleButton vkSimpleButton = this.i;
                if (vkSimpleButton == null) {
                    vkSimpleButton = null;
                }
                f4m.s(iah0.a(4), vkSimpleButton);
            } else if (!z) {
                VkSimpleButton vkSimpleButton2 = this.i;
                if (vkSimpleButton2 == null) {
                    vkSimpleButton2 = null;
                }
                f4m.s(iah0.a(16), vkSimpleButton2);
            }
            boolean z4 = ((UIBlockActionToggleAlbumSubscription) j5g.a0(g5g.E(list, UIBlockActionToggleAlbumSubscription.class))) != null;
            this.e.d(z4);
            if (z3 && z4) {
                VkButton vkButton7 = this.m;
                if (vkButton7 == null) {
                    vkButton7 = null;
                }
                vkButton7.setVisibility(0);
                VkButton vkButton8 = this.l;
                if (vkButton8 == null) {
                    vkButton8 = null;
                }
                f4m.r(iah0.a(8), vkButton8);
            } else if (z3 && !z4) {
                VkButton vkButton9 = this.m;
                if (vkButton9 == null) {
                    vkButton9 = null;
                }
                f4m.j(vkButton9);
                VkButton vkButton10 = this.l;
                if (vkButton10 == null) {
                    vkButton10 = null;
                }
                f4m.r(iah0.a(0), vkButton10);
            } else if (z4) {
                VkButton vkButton11 = this.j;
                if (vkButton11 == null) {
                    vkButton11 = null;
                }
                f4m.r(iah0.a(4), vkButton11);
            } else if (!z4) {
                VkButton vkButton12 = this.j;
                if (vkButton12 == null) {
                    vkButton12 = null;
                }
                f4m.r(iah0.a(16), vkButton12);
            }
            Image image = videoAlbum.h;
            VkImageViewTopCrop vkImageViewTopCrop = this.h;
            if (vkImageViewTopCrop == null) {
                vkImageViewTopCrop = null;
            }
            if (vkImageViewTopCrop.getWidth() > 0) {
                VkImageViewTopCrop vkImageViewTopCrop2 = this.h;
                if (vkImageViewTopCrop2 == null) {
                    vkImageViewTopCrop2 = null;
                }
                i = vkImageViewTopCrop2.getWidth();
            } else {
                i = this.n;
            }
            ImageSize Cb = image.Cb(i, true, false);
            if (Cb != null) {
                com.vk.dto.common.im.Image image2 = Cb.d;
                boolean z5 = videoAlbum.i;
                boolean z6 = image2.c >= image2.b;
                VkImageViewTopCrop vkImageViewTopCrop3 = this.h;
                if (vkImageViewTopCrop3 == null) {
                    vkImageViewTopCrop3 = null;
                }
                vkImageViewTopCrop3.setTopCrop(z6);
                if (z6) {
                    vkImageViewTopCrop3.setTopCrop(z6);
                    i2 = R.dimen.video_catalog_playlist_cover_height;
                } else {
                    vkImageViewTopCrop3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    i2 = R.dimen.video_catalog_playlist_cover_height_horizontal;
                }
                ViewGroup.LayoutParams layoutParams3 = vkImageViewTopCrop3.getLayoutParams();
                layoutParams3.height = e3m.a(i2, vkImageViewTopCrop3.getContext());
                vkImageViewTopCrop3.setLayoutParams(layoutParams3);
                vkImageViewTopCrop3.setForeground(dhr0.t.a(R.drawable.cover_scrim));
                ImageView imageView = this.k;
                if (imageView == null) {
                    imageView = null;
                }
                int i4 = z6 ? R.dimen.video_catalog_playlist_cover_padding_top : R.dimen.video_catalog_playlist_cover_padding_top_horizontal;
                int i5 = z6 ? R.dimen.video_catalog_playlist_cover_padding_bottom : R.dimen.video_catalog_playlist_cover_padding_bottom_horizontal;
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                int a = e3m.a(i4, context2);
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                imageView.setPadding(0, a, 0, e3m.a(i5, context3));
                VkImageViewTopCrop vkImageViewTopCrop4 = this.h;
                if (vkImageViewTopCrop4 == null) {
                    vkImageViewTopCrop4 = null;
                }
                String str2 = image2.d;
                VkImageViewTopCrop vkImageViewTopCrop5 = this.h;
                u9e u9eVar = new u9e(1, vkImageViewTopCrop5 == null ? null : vkImageViewTopCrop5, VkImageViewTopCrop.class, "setImageBitmap", "setImageBitmap(Landroid/graphics/Bitmap;)V", 0, 8);
                vkImageViewTopCrop4.getClass();
                Bitmap k = mcr0.k(str2);
                if (k == null) {
                    int i6 = 3;
                    b2 h0 = new s0(new i7(str2, i6)).L(new u730(new zy2(z5, i6), 20), false).h0(2L);
                    asu0 asu0Var = asu0.a;
                    cVar = h0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new j720(new n7b0(u9eVar, 28), 19), new y730(new ftu0(vkImageViewTopCrop4, i3), 24));
                } else {
                    u9eVar.invoke(k);
                    cVar = EmptyDisposable.INSTANCE;
                }
                this.p = cVar;
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new l7s(context, dhr0.u().c)).inflate(this.q, viewGroup, false);
        VkImageViewTopCrop vkImageViewTopCrop = (VkImageViewTopCrop) inflate.findViewById(R.id.video_playlist_cover);
        this.h = vkImageViewTopCrop;
        if (vkImageViewTopCrop == null) {
            vkImageViewTopCrop = null;
        }
        bwt0.d(vkImageViewTopCrop, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (r4 & 2) != 0, (r4 & 4) != 0);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cover_overlay);
        imageView.setBackground(new p4t0());
        imageView.setImageDrawable(dhr0.t.a(R.drawable.empty_playlist_cover));
        bwt0.d(imageView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (r4 & 2) != 0, (r4 & 4) != 0);
        this.k = imageView;
        c98 c98Var = new c98(this, 1);
        View findViewById = inflate.findViewById(R.id.watch_button);
        if (findViewById != null) {
            findViewById.setOnClickListener(c98Var);
        }
        this.j = (VkButton) findViewById;
        int z = iah0.z(inflate.getContext());
        int a = iah0.a(800);
        if (z > a) {
            z = a;
        }
        this.n = z;
        boolean z2 = this.g;
        u4t0 u4t0Var = this.e;
        if (!z2) {
            c98 c98Var2 = new c98(this, 1);
            View findViewById2 = inflate.findViewById(R.id.subscribe_button);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(c98Var2);
            }
            VkSimpleButton vkSimpleButton = (VkSimpleButton) findViewById2;
            this.i = vkSimpleButton;
            u4t0Var.c = vkSimpleButton != null ? vkSimpleButton : null;
            return inflate;
        }
        c98 c98Var3 = new c98(this, 1);
        View findViewById3 = inflate.findViewById(R.id.subscribe_button);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(c98Var3);
        }
        this.m = (VkButton) findViewById3;
        c98 c98Var4 = new c98(this, 1);
        View findViewById4 = inflate.findViewById(R.id.watch_with_shuffle_button);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(c98Var4);
        }
        this.l = (VkButton) findViewById4;
        u4t0Var.f.add(new efr0(this, 6));
        VkButton vkButton = this.l;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setBackgroundTint(R.attr.vk_ui_background_contrast_secondary_alpha);
        VkButton vkButton2 = this.m;
        (vkButton2 != null ? vkButton2 : null).setBackgroundTint(R.attr.vk_ui_background_contrast_secondary_alpha);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        UIBlockVideoAlbum uIBlockVideoAlbum;
        super.z(i, uIBlock);
        if (i != R.id.subscribe_button || uIBlock == null || (uIBlockVideoAlbum = this.o) == null) {
            return;
        }
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        boolean z = this.g;
        u4t0 u4t0Var = this.e;
        if (!z) {
            u4t0Var.c(videoAlbum);
            return;
        }
        VkButton vkButton = this.m;
        if (vkButton == null) {
            vkButton = null;
        }
        Context context = vkButton.getContext();
        if (u4t0Var.j.h()) {
            u4t0Var.e(context, videoAlbum);
        }
    }
}
