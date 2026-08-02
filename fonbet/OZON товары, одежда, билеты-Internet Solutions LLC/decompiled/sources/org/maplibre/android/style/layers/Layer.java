package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.JsonElement;
import fg.C6561a;
import org.maplibre.android.style.types.Formatted;
import org.maplibre.android.utils.e;

/* loaded from: classes10.dex */
public abstract class Layer {

    /* renamed from: a, reason: collision with root package name */
    private boolean f79984a;

    @Keep
    private boolean invalidated;

    @Keep
    private long nativePtr;

    static {
        org.maplibre.android.a.a();
    }

    @Keep
    protected Layer(long j11) {
        a();
        this.nativePtr = j11;
    }

    protected static void a() {
        e.a("Mbgl-Layer");
    }

    @NonNull
    public final String b() {
        a();
        return nativeGetId();
    }

    public final float c() {
        a();
        return nativeGetMaxZoom();
    }

    public final float d() {
        a();
        return nativeGetMinZoom();
    }

    public final long e() {
        return this.nativePtr;
    }

    public final void f() {
        this.f79984a = true;
    }

    @Keep
    protected native void finalize() throws Throwable;

    public final void g(float f7) {
        a();
        nativeSetMaxZoom(f7);
    }

    public final void h(float f7) {
        a();
        nativeSetMinZoom(f7);
    }

    public final void i(@NonNull c<?>... cVarArr) {
        if (this.f79984a) {
            return;
        }
        a();
        if (cVarArr.length == 0) {
            return;
        }
        for (c<?> cVar : cVarArr) {
            Object obj = cVar.f79986b;
            if (obj instanceof C6561a) {
                obj = ((C6561a) obj).f();
            } else if (obj instanceof Formatted) {
                obj = ((Formatted) obj).toArray();
            }
            boolean z11 = cVar instanceof b;
            String str = cVar.f79985a;
            if (z11) {
                nativeSetPaintProperty(str, obj);
            } else {
                nativeSetLayoutProperty(str, obj);
            }
        }
    }

    @Keep
    protected native JsonElement nativeGetFilter();

    @NonNull
    @Keep
    protected native String nativeGetId();

    @Keep
    protected native float nativeGetMaxZoom();

    @Keep
    protected native float nativeGetMinZoom();

    @NonNull
    @Keep
    protected native String nativeGetSourceId();

    @NonNull
    @Keep
    protected native String nativeGetSourceLayer();

    @NonNull
    @Keep
    protected native Object nativeGetVisibility();

    @Keep
    protected native void nativeSetFilter(Object[] objArr);

    @Keep
    protected native void nativeSetLayoutProperty(String str, Object obj);

    @Keep
    protected native void nativeSetMaxZoom(float f7);

    @Keep
    protected native void nativeSetMinZoom(float f7);

    @Keep
    protected native void nativeSetPaintProperty(String str, Object obj);

    @Keep
    protected native void nativeSetSourceLayer(String str);

    public Layer() {
        a();
    }
}
