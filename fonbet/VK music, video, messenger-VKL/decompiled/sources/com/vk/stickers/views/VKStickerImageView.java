package com.vk.stickers.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerRender;
import com.vk.metrics.eventtracking.b;
import com.vk.metrics.performance.images.ImageCacheSource;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import xsna.ao90;
import xsna.dhr0;
import xsna.e9i0;
import xsna.f5h0;
import xsna.icl0;
import xsna.iyd0;
import xsna.k130;
import xsna.njt;
import xsna.t6g0;
import xsna.y8l0;

/* compiled from: VKStickerImageView.kt */
/* loaded from: classes6.dex */
public class VKStickerImageView extends VKStickerCachedImageView {
    public static final PorterDuffColorFilter p = new PorterDuffColorFilter(855638016, PorterDuff.Mode.SRC_ATOP);
    public StickerRender n;
    public int o;

    public VKStickerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final String getRenderId() {
        StickerRender stickerRender = this.n;
        if (stickerRender != null) {
            return stickerRender.b;
        }
        return null;
    }

    public final void U0() {
        StickerRender stickerRender = this.n;
        if (stickerRender == null || !stickerRender.f) {
            return;
        }
        t6g0 t6g0Var = t6g0.b;
        StickerRender stickerRender2 = t6g0.d().J().get(getRenderId());
        if (stickerRender2 != null) {
            Y0(stickerRender2, dhr0.M());
        }
    }

    public final void W0(StickerRender stickerRender, int i) {
        this.n = stickerRender;
        this.o = i;
        if (stickerRender.f) {
            X0();
        } else {
            Y0(stickerRender, dhr0.M());
        }
    }

    public final void X0() {
        U0();
        f<icl0> fVar = y8l0.a.a;
        ao90 ao90Var = new ao90(new iyd0(this, 14), 6);
        fVar.getClass();
        new i0(fVar, ao90Var).a0(a.b()).subscribe(new k130(new e9i0(this, 17), 27));
    }

    public final void Y0(StickerRender stickerRender, boolean z) {
        this.n = stickerRender;
        ImageList imageList = z ? stickerRender.d : stickerRender.c;
        if (stickerRender.f || stickerRender.e || !imageList.Jb()) {
            return;
        }
        String Hb = imageList.Hb(this.o);
        if (Hb != null) {
            load(Hb);
            return;
        }
        b.a.q(new IllegalArgumentException("There is no required sticker image size; size:" + this.o + "; imgs:" + imageList));
    }

    @Override // xsna.zjt
    public final void load(String str) {
        String str2;
        if (str != null) {
            str2 = Uri.parse(str).buildUpon().appendQueryParameter("client_cache_source", ImageCacheSource.STICKERS.h()).build().toString();
        } else {
            str2 = null;
        }
        o0(str2, null);
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        StickerRender stickerRender = this.n;
        if (stickerRender == null || !stickerRender.f || (str = stickerRender.b) == null || str.length() == 0) {
            return;
        }
        X0();
    }

    @Override // xsna.zjt, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        njt hierarchy;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            njt hierarchy2 = getHierarchy();
            if (hierarchy2 != null) {
                hierarchy2.n(p);
            }
        } else if (action != 2 && (hierarchy = getHierarchy()) != null) {
            hierarchy.n(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public VKStickerImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        njt hierarchy = getHierarchy();
        if (hierarchy != null) {
            hierarchy.o(f5h0.i.a);
        }
    }
}
