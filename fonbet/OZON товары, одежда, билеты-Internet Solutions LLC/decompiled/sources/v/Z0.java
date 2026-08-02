package v;

import C.InterfaceC2689i;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import androidx.concurrent.futures.b;
import u.C9887a;
import v.a2;
import w.C10368u;

/* loaded from: classes8.dex */
final class Z0 implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final C10368u f101178a;

    /* renamed from: c, reason: collision with root package name */
    private b.a<Void> f101180c;

    /* renamed from: b, reason: collision with root package name */
    private Rect f101179b = null;

    /* renamed from: d, reason: collision with root package name */
    private Rect f101181d = null;

    Z0(@NonNull C10368u c10368u) {
        this.f101178a = c10368u;
    }

    @Override // v.a2.b
    public final void a(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.f101180c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f101181d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f101180c.c(null);
            this.f101180c = null;
            this.f101181d = null;
        }
    }

    @Override // v.a2.b
    public final void b(float f7, @NonNull b.a<Void> aVar) {
        ((Rect) this.f101178a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float width = r0.width() / f7;
        float height = r0.height() / f7;
        float width2 = (r0.width() - width) / 2.0f;
        float height2 = (r0.height() - height) / 2.0f;
        this.f101179b = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        b.a<Void> aVar2 = this.f101180c;
        if (aVar2 != null) {
            aVar2.e(new InterfaceC2689i.a("There is a new zoomRatio being set"));
        }
        this.f101181d = this.f101179b;
        this.f101180c = aVar;
    }

    @Override // v.a2.b
    public final void c() {
        this.f101181d = null;
        this.f101179b = null;
        b.a<Void> aVar = this.f101180c;
        if (aVar != null) {
            aVar.e(new InterfaceC2689i.a("Camera is not active."));
            this.f101180c = null;
        }
    }

    @Override // v.a2.b
    public final void d(@NonNull C9887a.C2193a c2193a) {
        Rect rect = this.f101179b;
        if (rect != null) {
            c2193a.f(CaptureRequest.SCALER_CROP_REGION, rect, T.b.REQUIRED);
        }
    }

    @Override // v.a2.b
    @NonNull
    public final Rect e() {
        Rect rect = this.f101179b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.f101178a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // v.a2.b
    public final float getMaxZoom() {
        Float f7 = (Float) this.f101178a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f7 != null && f7.floatValue() >= 1.0f) {
            return f7.floatValue();
        }
        return 1.0f;
    }

    @Override // v.a2.b
    public final float getMinZoom() {
        return 1.0f;
    }
}
