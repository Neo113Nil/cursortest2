package v;

import C.InterfaceC2689i;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import androidx.concurrent.futures.b;
import kotlin.jvm.internal.Intrinsics;
import u.C9887a;
import v.a2;
import w.C10368u;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10085c implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final C10368u f101213a;

    /* renamed from: b, reason: collision with root package name */
    private final Range<Float> f101214b;

    /* renamed from: d, reason: collision with root package name */
    private b.a<Void> f101216d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f101218f;

    /* renamed from: c, reason: collision with root package name */
    private float f101215c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f101217e = 1.0f;

    C10085c(@NonNull C10368u c10368u) {
        CameraCharacteristics.Key key;
        this.f101218f = false;
        this.f101213a = c10368u;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f101214b = (Range) c10368u.a(key);
        this.f101218f = c10368u.c();
    }

    @Override // v.a2.b
    public final void a(@NonNull TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f7;
        if (this.f101216d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f7 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f7 = (Float) request.get(key);
            }
            if (f7 == null) {
                return;
            }
            if (this.f101217e == f7.floatValue()) {
                this.f101216d.c(null);
                this.f101216d = null;
            }
        }
    }

    @Override // v.a2.b
    public final void b(float f7, @NonNull b.a<Void> aVar) {
        this.f101215c = f7;
        b.a<Void> aVar2 = this.f101216d;
        if (aVar2 != null) {
            aVar2.e(new InterfaceC2689i.a("There is a new zoomRatio being set"));
        }
        this.f101217e = this.f101215c;
        this.f101216d = aVar;
    }

    @Override // v.a2.b
    public final void c() {
        this.f101215c = 1.0f;
        b.a<Void> aVar = this.f101216d;
        if (aVar != null) {
            aVar.e(new InterfaceC2689i.a("Camera is not active."));
            this.f101216d = null;
        }
    }

    @Override // v.a2.b
    public final void d(@NonNull C9887a.C2193a options) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.f101215c);
        T.b priority = T.b.REQUIRED;
        options.f(key, valueOf, priority);
        if (this.f101218f) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(priority, "priority");
            if (Build.VERSION.SDK_INT >= 34) {
                key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                options.f(key2, 1, priority);
            }
        }
    }

    @Override // v.a2.b
    @NonNull
    public final Rect e() {
        Rect rect = (Rect) this.f101213a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // v.a2.b
    public final float getMaxZoom() {
        return this.f101214b.getUpper().floatValue();
    }

    @Override // v.a2.b
    public final float getMinZoom() {
        return this.f101214b.getLower().floatValue();
    }
}
