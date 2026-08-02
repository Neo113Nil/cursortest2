package org.maplibre.android.maps.renderer.textureview;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.annotation.NonNull;
import java.util.LinkedList;

/* loaded from: classes10.dex */
abstract class TextureViewRenderThread extends Thread implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    protected final TextureViewMapRenderer f79942a;

    /* renamed from: b, reason: collision with root package name */
    protected final Object f79943b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected final LinkedList<Runnable> f79944c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    protected SurfaceTexture f79945d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f79946e;

    /* renamed from: f, reason: collision with root package name */
    protected int f79947f;

    /* renamed from: g, reason: collision with root package name */
    protected int f79948g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f79949h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f79950i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f79951j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f79952k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f79953l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f79954m;

    TextureViewRenderThread(@NonNull TextureView textureView, @NonNull TextureViewMapRenderer textureViewMapRenderer) {
        textureView.setOpaque(!textureViewMapRenderer.a());
        textureView.setSurfaceTextureListener(this);
        this.f79942a = textureViewMapRenderer;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        synchronized (this.f79943b) {
            this.f79945d = surfaceTexture;
            this.f79947f = i11;
            this.f79948g = i12;
            this.f79949h = true;
            this.f79943b.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.f79943b) {
            this.f79945d = null;
            this.f79952k = true;
            this.f79949h = false;
            this.f79943b.notifyAll();
            while (this.f79946e && !this.f79954m) {
                try {
                    this.f79943b.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        synchronized (this.f79943b) {
            this.f79947f = i11;
            this.f79948g = i12;
            this.f79950i = true;
            this.f79949h = true;
            this.f79943b.notifyAll();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
