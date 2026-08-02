package com.vk.catalog2.common.ui.mvp.holder.video.playlist;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.cp2;
import xsna.cus0;
import xsna.dhr0;
import xsna.fxc0;
import xsna.gd5;
import xsna.iah0;
import xsna.jwr0;
import xsna.khc0;
import xsna.m33;
import xsna.mba;
import xsna.msy;
import xsna.q8i0;
import xsna.qyi0;
import xsna.tmz;
import xsna.too0;
import xsna.u4a;
import xsna.u4t0;
import xsna.wjs0;
import xsna.yo80;
import xsna.zj3;

/* compiled from: VideoPlaylistToolbarVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistToolbarVh extends VideoPlaylistToolbar implements too0 {
    public final u4t0 e;
    public final u4a.a f;
    public final zj3 g;
    public Drawable h;
    public Drawable i;
    public Toolbar j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public c n;
    public VideoAlbum o;
    public final boolean p;
    public final Object q;
    public final int r;
    public int s;
    public float t;

    /* compiled from: VideoPlaylistToolbarVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoPlaylistBottomSheet.Action.values().length];
            try {
                iArr[VideoPlaylistBottomSheet.Action.ShowAuthor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlaylistBottomSheet.Action.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPlaylistBottomSheet.Action.Share.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoPlaylistBottomSheetRedesign.Action.values().length];
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.ShowAuthor.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.Share.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VideoPlaylistToolbarVh(mba mbaVar, b5a b5aVar, u4t0 u4t0Var, u4a.a aVar) {
        super(mbaVar, b5aVar);
        this.e = u4t0Var;
        this.f = aVar;
        this.g = new zj3();
        this.n = EmptyDisposable.INSTANCE;
        this.p = fxc0.B().J().x0();
        this.q = msy.a(LazyThreadSafetyMode.NONE, new yo80(12));
        this.r = -1;
        this.s = dhr0.t.c(dhr0.L() ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_text_primary);
        this.t = 1.0f;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.n.dispose();
    }

    @Override // xsna.too0
    public final void Ng() {
        Toolbar toolbar = this.j;
        Context context = toolbar != null ? toolbar.getContext() : null;
        this.s = dhr0.Y(dhr0.L() ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_text_primary, context);
        g();
        int Y = dhr0.Y(R.attr.vk_ui_text_primary, context);
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextColor(Y);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockVideoAlbum) {
            c((UIBlockVideoAlbum) uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar
    public final void c(UIBlockVideoAlbum uIBlockVideoAlbum) {
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        this.o = videoAlbum;
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(videoAlbum.d);
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(0);
            bwt0.i0(imageView, new qyi0(this, 22));
        }
        ImageView imageView2 = this.m;
        if (imageView2 == null) {
            imageView2 = null;
        }
        bwt0.i0(imageView2, new gd5(videoAlbum, this, uIBlockVideoAlbum, 10));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar
    public final void d(float f) {
        this.t = f;
        g();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar
    public final void e(boolean z) {
        if (z) {
            TextView textView = this.k;
            if (textView != null) {
                cp2.c(textView, 100L, 0L, null, null, 14);
                return;
            }
            return;
        }
        TextView textView2 = this.k;
        if (textView2 != null) {
            cp2.d(textView2, 0L, null, null, 30);
        }
    }

    public final void g() {
        ColorStateList valueOf = ColorStateList.valueOf(((Integer) this.g.evaluate(this.t, Integer.valueOf(this.s), Integer.valueOf(this.r))).intValue());
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setTintList(valueOf);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setTintList(valueOf);
        }
        ImageView imageView = this.m;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageTintList(valueOf);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.p ? R.layout.catalog_video_playlist_toolbar_tablet : R.layout.catalog_video_playlist_toolbar, viewGroup, false);
        this.k = (TextView) inflate.findViewById(R.id.playlist_collapsed_title);
        this.h = m33.a(R.drawable.vk_icon_arrow_left_outline_28, inflate.getContext());
        this.i = m33.a(R.drawable.vk_icon_more_vertical_24, inflate.getContext());
        Toolbar toolbar = (Toolbar) inflate;
        this.j = toolbar;
        int i = 1;
        toolbar.setOnClickListener(new c98(this, i));
        toolbar.setNavigationIcon(this.h);
        toolbar.setNavigationContentDescription(R.string.accessibility_back);
        toolbar.setNavigationOnClickListener(new c98(this, i));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.menu_button);
        imageView.setImageDrawable(this.i);
        this.l = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.menu_toggle_subscribe);
        this.e.d = imageView2;
        imageView2.setVisibility(iah0.r(imageView2.getContext()) ? 0 : 8);
        this.m = imageView2;
        this.n = new i0(wjs0.b.b0(jwr0.class), new khc0(new q8i0(this, 25), 13)).subscribe(new tmz(new cus0(this, 2), 26));
        Ng();
        return inflate;
    }
}
