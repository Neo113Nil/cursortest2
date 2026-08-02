package com.vk.imageloader.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.imageloader.ImageScreenSize;
import xsna.cir;
import xsna.dlo;
import xsna.e620;
import xsna.f5h0;
import xsna.fhs;
import xsna.ktc0;
import xsna.njt;
import xsna.ojt;
import xsna.sa30;
import xsna.tjo;
import xsna.zjt;

/* compiled from: VKImageView.kt */
/* loaded from: classes.dex */
public class VKImageView extends zjt<fhs> {
    public static final /* synthetic */ int l = 0;
    public Path k;

    public VKImageView(Context context) {
        this(context, null, 6, 0);
    }

    public void L0(Uri uri, ImageScreenSize imageScreenSize) {
        sa30.K(this, uri);
        fhs backend = getBackend();
        if (uri == null) {
            backend.N();
            return;
        }
        backend.S();
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        fhs.a.b(h, imageScreenSize);
        backend.W(h, null);
        backend.i = null;
        backend.u = 0;
        backend.t = null;
    }

    public final void N0(Uri uri, ImageScreenSize imageScreenSize, Uri uri2, ImageScreenSize imageScreenSize2) {
        sa30.K(this, uri);
        sa30.K(this, uri2);
        fhs backend = getBackend();
        backend.getClass();
        if (uri == null || uri2 == null) {
            backend.N();
            return;
        }
        backend.S();
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        fhs.a.b(h, imageScreenSize);
        ImageRequestBuilder h2 = ImageRequestBuilder.h(uri2);
        fhs.a.b(h2, imageScreenSize2);
        backend.W(h2, h);
    }

    public void O0(String str, ImageScreenSize imageScreenSize) {
        sa30.L(this, str);
        fhs backend = getBackend();
        if (backend.r && str != null && str.equals(backend.i) && backend.t == imageScreenSize) {
            return;
        }
        if (str == null || str.length() == 0) {
            backend.N();
            return;
        }
        Uri parse = Uri.parse(str);
        if (imageScreenSize == null && (URLUtil.isFileUrl(str) || URLUtil.isContentUrl(str))) {
            backend.a.setImageURI(parse);
            return;
        }
        backend.S();
        ImageRequestBuilder h = ImageRequestBuilder.h(parse);
        fhs.a.b(h, imageScreenSize);
        backend.W(h, null);
        backend.i = str;
        backend.u = 0;
        backend.t = imageScreenSize;
    }

    public final void Q0(Drawable drawable, f5h0.d dVar) {
        fhs backend = getBackend();
        if (drawable != null) {
            njt U = backend.U();
            if (U != null) {
                U.s(drawable, dVar);
                return;
            }
            return;
        }
        njt U2 = backend.U();
        if (U2 != null) {
            U2.p(null, 1);
        }
    }

    public void S0(ktc0 ktc0Var) {
        getBackend().b0(ktc0Var, null);
    }

    @Override // xsna.zjt
    public final fhs b0() {
        fhs fhsVar = new fhs(this);
        fhsVar.f = new e620(1, this, VKImageView.class, "buildHierarchy", "buildHierarchy(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)V", 0);
        return fhsVar;
    }

    public final dlo getController() {
        return getBackend().T().e;
    }

    public final String getCurrentUrl() {
        return getBackend().i;
    }

    public final njt getHierarchy() {
        return getBackend().X();
    }

    public final ktc0 getHighResPostPostprocessor() {
        return getBackend().h;
    }

    public final ktc0 getLowResPostPostprocessor() {
        return getBackend().g;
    }

    public final Drawable getTopLevelDrawable() {
        return getBackend().T().d();
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path = this.k;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public final void setActualScaleType(f5h0.d dVar) {
        njt U = getBackend().U();
        if (U != null) {
            U.o(dVar);
        }
    }

    public final void setAutoPlayAnimations(boolean z) {
        getBackend().e = z;
    }

    public final void setClipPath(Path path) {
        this.k = path;
    }

    public final void setCollectLoadingMetrics(boolean z) {
        getBackend().l.e = z;
    }

    public final void setController(dlo dloVar) {
        getBackend().a0(dloVar);
    }

    public final void setDrawableFactory(tjo tjoVar) {
        getBackend().q = tjoVar;
    }

    public final void setHierarchy(njt njtVar) {
        fhs backend = getBackend();
        backend.T().i(njtVar);
        cir cirVar = backend.G;
        if (cirVar != null) {
            cirVar.invoke(backend.T().d());
        }
    }

    public void setPostprocessor(ktc0 ktc0Var) {
        getBackend().b0(ktc0Var, ktc0Var);
    }

    public VKImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public VKImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public void K0(ojt ojtVar) {
    }
}
