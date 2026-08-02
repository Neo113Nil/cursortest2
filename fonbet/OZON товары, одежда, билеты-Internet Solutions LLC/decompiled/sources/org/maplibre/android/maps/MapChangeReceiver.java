package org.maplibre.android.maps;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.NativeMapView;
import org.maplibre.android.tile.TileOperation;

/* loaded from: classes10.dex */
class MapChangeReceiver implements NativeMapView.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f79673a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f79674b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f79675c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f79676d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f79677e = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList f79678f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList f79679g = new CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArrayList f79680h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f79681i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList f79682j = new CopyOnWriteArrayList();

    /* renamed from: k, reason: collision with root package name */
    private final CopyOnWriteArrayList f79683k = new CopyOnWriteArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArrayList f79684l = new CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArrayList f79685m = new CopyOnWriteArrayList();

    /* renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArrayList f79686n = new CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f79687o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList f79688p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList f79689q = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    private final CopyOnWriteArrayList f79690r = new CopyOnWriteArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final CopyOnWriteArrayList f79691s = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList f79692t = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final CopyOnWriteArrayList f79693u = new CopyOnWriteArrayList();

    /* renamed from: v, reason: collision with root package name */
    private final CopyOnWriteArrayList f79694v = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    private final CopyOnWriteArrayList f79695w = new CopyOnWriteArrayList();

    /* renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArrayList f79696x = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private final CopyOnWriteArrayList f79697y = new CopyOnWriteArrayList();

    /* renamed from: z, reason: collision with root package name */
    private final CopyOnWriteArrayList f79698z = new CopyOnWriteArrayList();

    MapChangeReceiver() {
    }

    final void A(MapView.OnCameraIsChangingListener onCameraIsChangingListener) {
        this.f79674b.add(onCameraIsChangingListener);
    }

    final void B(MapView.OnCameraWillChangeListener onCameraWillChangeListener) {
        this.f79673a.add(onCameraWillChangeListener);
    }

    final void C(MapView.OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.f79688p.add(onCanRemoveUnusedStyleImageListener);
    }

    final void D(MapView.OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.f79684l.add(onDidBecomeIdleListener);
    }

    final void E(MapView.OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.f79678f.add(onDidFailLoadingMapListener);
    }

    final void F(MapView.OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.f79677e.add(onDidFinishLoadingMapListener);
    }

    final void G(MapView.OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.f79685m.add(onDidFinishLoadingStyleListener);
    }

    final void H(MapView.OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.f79680h.add(onDidFinishRenderingFrameListener);
    }

    final void I(MapView.OnDidFinishRenderingFrameWithStatsListener onDidFinishRenderingFrameWithStatsListener) {
        this.f79681i.add(onDidFinishRenderingFrameWithStatsListener);
    }

    final void J(MapView.OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.f79683k.add(onDidFinishRenderingMapListener);
    }

    public final void K(MapView.OnGlyphsErrorListener onGlyphsErrorListener) {
        this.f79693u.add(onGlyphsErrorListener);
    }

    public final void L(MapView.OnGlyphsLoadedListener onGlyphsLoadedListener) {
        this.f79692t.add(onGlyphsLoadedListener);
    }

    public final void M(MapView.OnGlyphsRequestedListener onGlyphsRequestedListener) {
        this.f79694v.add(onGlyphsRequestedListener);
    }

    public final void N(MapView.OnPostCompileShaderListener onPostCompileShaderListener) {
        this.f79690r.add(onPostCompileShaderListener);
    }

    public final void O(MapView.OnPreCompileShaderListener onPreCompileShaderListener) {
        this.f79689q.add(onPreCompileShaderListener);
    }

    public final void P(MapView.OnShaderCompileFailedListener onShaderCompileFailedListener) {
        this.f79691s.add(onShaderCompileFailedListener);
    }

    final void Q(MapView.OnSourceChangedListener onSourceChangedListener) {
        this.f79686n.add(onSourceChangedListener);
    }

    public final void R(MapView.OnSpriteErrorListener onSpriteErrorListener) {
        this.f79697y.add(onSpriteErrorListener);
    }

    public final void S(MapView.OnSpriteLoadedListener onSpriteLoadedListener) {
        this.f79696x.add(onSpriteLoadedListener);
    }

    public final void T(MapView.OnSpriteRequestedListener onSpriteRequestedListener) {
        this.f79698z.add(onSpriteRequestedListener);
    }

    final void U(MapView.OnStyleImageMissingListener onStyleImageMissingListener) {
        this.f79687o.add(onStyleImageMissingListener);
    }

    public final void V(MapView.OnTileActionListener onTileActionListener) {
        this.f79695w.add(onTileActionListener);
    }

    final void W(MapView.OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.f79676d.add(onWillStartLoadingMapListener);
    }

    final void X(MapView.OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.f79679g.add(onWillStartRenderingFrameListener);
    }

    final void Y(MapView.OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.f79682j.add(onWillStartRenderingMapListener);
    }

    final void Z() {
        this.f79673a.clear();
        this.f79674b.clear();
        this.f79675c.clear();
        this.f79676d.clear();
        this.f79677e.clear();
        this.f79678f.clear();
        this.f79679g.clear();
        this.f79680h.clear();
        this.f79682j.clear();
        this.f79683k.clear();
        this.f79684l.clear();
        this.f79685m.clear();
        this.f79686n.clear();
        this.f79687o.clear();
        this.f79688p.clear();
        this.f79689q.clear();
        this.f79690r.clear();
        this.f79691s.clear();
        this.f79692t.clear();
        this.f79693u.clear();
        this.f79694v.clear();
        this.f79695w.clear();
        this.f79696x.clear();
        this.f79697y.clear();
        this.f79698z.clear();
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79674b;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnCameraIsChangingListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraIsChanging", th2);
            throw th2;
        }
    }

    final void a0(MapView.OnCameraDidChangeListener onCameraDidChangeListener) {
        this.f79675c.remove(onCameraDidChangeListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79679g;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnWillStartRenderingFrameListener) it.next()).b();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingFrame", th2);
            throw th2;
        }
    }

    final void b0(MapView.OnCameraIsChangingListener onCameraIsChangingListener) {
        this.f79674b.remove(onCameraIsChangingListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79682j;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnWillStartRenderingMapListener) it.next()).c();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingMap", th2);
            throw th2;
        }
    }

    final void c0(MapView.OnCameraWillChangeListener onCameraWillChangeListener) {
        this.f79673a.remove(onCameraWillChangeListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void d(boolean z11) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79675c;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnCameraDidChangeListener) it.next()).d(z11);
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraDidChange", th2);
            throw th2;
        }
    }

    final void d0(MapView.OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.f79688p.remove(onCanRemoveUnusedStyleImageListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final boolean e(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79688p;
        boolean z11 = true;
        if (!copyOnWriteArrayList.isEmpty()) {
            try {
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        z11 &= ((MapView.OnCanRemoveUnusedStyleImageListener) it.next()).e(str);
                    }
                }
            } catch (Throwable th2) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onCanRemoveUnusedStyleImage", th2);
                throw th2;
            }
        }
        return z11;
    }

    final void e0(MapView.OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.f79684l.remove(onDidBecomeIdleListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StyleCallback
    public final void f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79676d;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnWillStartLoadingMapListener) it.next()).f();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartLoadingMap", th2);
            throw th2;
        }
    }

    final void f0(MapView.OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.f79678f.remove(onDidFailLoadingMapListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79677e;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishLoadingMapListener) it.next()).g();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingMap", th2);
            throw th2;
        }
    }

    final void g0(MapView.OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.f79677e.remove(onDidFinishLoadingMapListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void h(boolean z11) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79683k;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishRenderingMapListener) it.next()).h(z11);
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingMap", th2);
            throw th2;
        }
    }

    final void h0(MapView.OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.f79685m.remove(onDidFinishLoadingStyleListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void i(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79687o;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnStyleImageMissingListener) it.next()).i(str);
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onStyleImageMissing", th2);
            throw th2;
        }
    }

    final void i0(MapView.OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.f79680h.remove(onDidFinishRenderingFrameListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StyleCallback
    public final void j() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79685m;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishLoadingStyleListener) it.next()).j();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingStyle", th2);
            throw th2;
        }
    }

    final void j0(MapView.OnDidFinishRenderingFrameWithStatsListener onDidFinishRenderingFrameWithStatsListener) {
        this.f79681i.remove(onDidFinishRenderingFrameWithStatsListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void k() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79684l;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidBecomeIdleListener) it.next()).k();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidBecomeIdle", th2);
            throw th2;
        }
    }

    final void k0(MapView.OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.f79683k.remove(onDidFinishRenderingMapListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void l(boolean z11, RenderingStats renderingStats) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79680h;
        try {
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    MapView.OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener = (MapView.OnDidFinishRenderingFrameListener) it.next();
                    double d11 = renderingStats.encodingTime;
                    onDidFinishRenderingFrameListener.a(z11);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f79681i;
            if (copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            Iterator it2 = copyOnWriteArrayList2.iterator();
            while (it2.hasNext()) {
                ((MapView.OnDidFinishRenderingFrameWithStatsListener) it2.next()).b();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingFrame", th2);
            throw th2;
        }
    }

    public final void l0(MapView.OnGlyphsErrorListener onGlyphsErrorListener) {
        this.f79693u.remove(onGlyphsErrorListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void m(String str, String str2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79698z;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnSpriteRequestedListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteRequested", th2);
            throw th2;
        }
    }

    public final void m0(MapView.OnGlyphsLoadedListener onGlyphsLoadedListener) {
        this.f79692t.remove(onGlyphsLoadedListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void n(boolean z11) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79673a;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnCameraWillChangeListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraWillChange", th2);
            throw th2;
        }
    }

    public final void n0(MapView.OnGlyphsRequestedListener onGlyphsRequestedListener) {
        this.f79694v.remove(onGlyphsRequestedListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void o(String[] strArr, int i11, int i12) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79692t;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnGlyphsLoadedListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsLoaded", th2);
            throw th2;
        }
    }

    public final void o0(MapView.OnPostCompileShaderListener onPostCompileShaderListener) {
        this.f79690r.remove(onPostCompileShaderListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void p(String str, String str2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79697y;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnSpriteErrorListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteError", th2);
            throw th2;
        }
    }

    public final void p0(MapView.OnPreCompileShaderListener onPreCompileShaderListener) {
        this.f79689q.remove(onPreCompileShaderListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void q(int i11, int i12, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79690r;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnPostCompileShaderListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onPostCompileShader", th2);
            throw th2;
        }
    }

    public final void q0(MapView.OnShaderCompileFailedListener onShaderCompileFailedListener) {
        this.f79691s.remove(onShaderCompileFailedListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void r(int i11, int i12, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79689q;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnPreCompileShaderListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onPreCompileShader", th2);
            throw th2;
        }
    }

    final void r0(MapView.OnSourceChangedListener onSourceChangedListener) {
        this.f79686n.remove(onSourceChangedListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void s(TileOperation tileOperation, int i11, int i12, int i13, int i14, int i15, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79695w;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnTileActionListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onTileAction", th2);
            throw th2;
        }
    }

    public final void s0(MapView.OnSpriteErrorListener onSpriteErrorListener) {
        this.f79697y.remove(onSpriteErrorListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void t(String str, String str2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79696x;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnSpriteLoadedListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteLoaded", th2);
            throw th2;
        }
    }

    public final void t0(MapView.OnSpriteLoadedListener onSpriteLoadedListener) {
        this.f79696x.remove(onSpriteLoadedListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void u(int i11, int i12, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79691s;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnShaderCompileFailedListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onShaderCompileFailed", th2);
            throw th2;
        }
    }

    public final void u0(MapView.OnSpriteRequestedListener onSpriteRequestedListener) {
        this.f79698z.remove(onSpriteRequestedListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void v(String[] strArr, int i11, int i12) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79693u;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnGlyphsErrorListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsError", th2);
            throw th2;
        }
    }

    final void v0(MapView.OnStyleImageMissingListener onStyleImageMissingListener) {
        this.f79687o.remove(onStyleImageMissingListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void w(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79678f;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFailLoadingMapListener) it.next()).c();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFailLoadingMap", th2);
            throw th2;
        }
    }

    public final void w0(MapView.OnTileActionListener onTileActionListener) {
        this.f79695w.remove(onTileActionListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void x(String[] strArr, int i11, int i12) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79694v;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnGlyphsRequestedListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsRequested", th2);
            throw th2;
        }
    }

    final void x0(MapView.OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.f79676d.remove(onWillStartLoadingMapListener);
    }

    @Override // org.maplibre.android.maps.NativeMapView.StateCallback
    public final void y(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f79686n;
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((MapView.OnSourceChangedListener) it.next()).a();
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSourceChanged", th2);
            throw th2;
        }
    }

    final void y0(MapView.OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.f79679g.remove(onWillStartRenderingFrameListener);
    }

    final void z(MapView.OnCameraDidChangeListener onCameraDidChangeListener) {
        this.f79675c.add(onCameraDidChangeListener);
    }

    final void z0(MapView.OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.f79682j.remove(onWillStartRenderingMapListener);
    }
}
