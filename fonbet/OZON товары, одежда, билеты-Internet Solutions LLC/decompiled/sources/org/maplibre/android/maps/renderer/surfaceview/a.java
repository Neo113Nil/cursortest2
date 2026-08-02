package org.maplibre.android.maps.renderer.surfaceview;

import org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f79928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f79929b;

    public /* synthetic */ a(a aVar, Runnable runnable) {
        this.f79928a = aVar;
        this.f79929b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = MapLibreSurfaceView.RenderThread.f79909q;
        a aVar = this.f79928a;
        if (aVar != null) {
            aVar.run();
        }
        Runnable runnable = this.f79929b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
