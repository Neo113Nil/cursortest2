package com.vk.clips.design.view.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import one.video.player.OneVideoPlayer;
import one.video.view.OneVideoPlayerView;
import xsna.d3m;
import xsna.iah0;
import xsna.k8;
import xsna.ma;
import xsna.msy;
import xsna.t0w0;
import xsna.x4d0;
import xsna.xm1;

/* compiled from: ClipsVideoAndPhotoView.kt */
/* loaded from: classes16.dex */
public final class ClipsVideoAndPhotoView extends FrameLayout {
    public static final float e = iah0.b(20.0f);
    public final Object b;
    public final Object c;
    public x4d0 d;

    public ClipsVideoAndPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j jVar = new j(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, jVar);
        this.c = msy.a(lazyThreadSafetyMode, new xm1(this, 24));
        LayoutInflater.from(context).inflate(R.layout.clips_choosee_preview_stickers_and_photo, this);
        setClipToOutline(true);
        setOutlineProvider(new t0w0(6, e, false, false));
        getPlayerView().setClipToOutline(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getPhotoView() {
        return (VkImageSimple) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final OneVideoPlayerView getPlayerView() {
        return (OneVideoPlayerView) this.c.getValue();
    }

    public final void a(k8 k8Var) {
        Bitmap createBitmap = Bitmap.createBitmap(getPlayerView().getWidth(), getPlayerView().getHeight(), Bitmap.Config.ARGB_8888);
        OneVideoPlayerView.d(getPlayerView(), createBitmap, new ma(6, k8Var, createBitmap));
    }

    public final void b() {
        OneVideoPlayer player = getPlayerView().getPlayer();
        if (player != null) {
            player.j0(null);
        }
    }

    public final void c(OneVideoPlayer oneVideoPlayer, x4d0 x4d0Var) {
        this.d = x4d0Var;
        getPlayerView().setPlayer(oneVideoPlayer);
    }

    public final Size getPlayerViewSize() {
        return new Size(getPlayerView().getWidth(), getPlayerView().getHeight());
    }

    public final void setPhotoSelected(boolean z) {
        if (z) {
            d3m.c(getPhotoView(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(getPhotoView(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    public final void setPhotoUri(Uri uri) {
        getPhotoView().setImageURI(uri);
    }
}
