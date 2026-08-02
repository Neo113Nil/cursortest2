package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.C5106m0;
import androidx.camera.core.impl.O0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import w.C10368u;

/* loaded from: classes8.dex */
final class d2 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C10368u f101235a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final M.d f101236b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f101237c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f101238d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f101239e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f101240f;

    /* renamed from: g, reason: collision with root package name */
    androidx.camera.core.u f101241g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC5111p f101242h;

    /* renamed from: i, reason: collision with root package name */
    private C5106m0 f101243i;

    /* renamed from: j, reason: collision with root package name */
    ImageWriter f101244j;

    final class a extends CameraCaptureSession.StateCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                d2.this.f101244j = ImageWriter.newInstance(inputSurface, 1);
            }
        }
    }

    d2(@NonNull C10368u c10368u) {
        boolean z11;
        this.f101239e = false;
        this.f101240f = false;
        this.f101235a = c10368u;
        int[] iArr = (int[]) c10368u.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 4) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        this.f101239e = z11;
        this.f101240f = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f101236b = new M.d(3, new Ej.b());
    }

    public final void a(@NonNull O0.b bVar) {
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        C10368u c10368u = this.f101235a;
        while (true) {
            M.d dVar = this.f101236b;
            if (dVar.c()) {
                break;
            } else {
                dVar.a().close();
            }
        }
        C5106m0 c5106m0 = this.f101243i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (c5106m0 != null) {
            final androidx.camera.core.u uVar = this.f101241g;
            if (uVar != null) {
                c5106m0.k().a(new Runnable() { // from class: v.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.u.this.j();
                    }
                }, H.c.e());
                this.f101241g = null;
            }
            c5106m0.d();
            this.f101243i = null;
        }
        ImageWriter imageWriter = this.f101244j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f101244j = null;
        }
        if (this.f101237c) {
            bVar.v(1);
            return;
        }
        if (this.f101240f) {
            bVar.v(1);
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) c10368u.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e11) {
            C.S.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e11.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap();
            for (int i11 : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i11);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new G.e(true));
                    hashMap.put(Integer.valueOf(i11), inputSizes[0]);
                }
            }
        }
        if (this.f101239e && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) c10368u.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i12 : validOutputFormatsForInput) {
                if (i12 == 256) {
                    Size size = (Size) hashMap.get(34);
                    androidx.camera.core.s sVar = new androidx.camera.core.s(size.getWidth(), size.getHeight(), 34, 9);
                    this.f101242h = sVar.l();
                    this.f101241g = new androidx.camera.core.u(sVar);
                    sVar.g(new C10148x0(this), H.c.d());
                    C5106m0 c5106m02 = new C5106m0(this.f101241g.a(), new Size(this.f101241g.getWidth(), this.f101241g.getHeight()), 34);
                    this.f101243i = c5106m02;
                    final androidx.camera.core.u uVar2 = this.f101241g;
                    com.google.common.util.concurrent.m<Void> k11 = c5106m02.k();
                    Objects.requireNonNull(uVar2);
                    k11.a(new Runnable() { // from class: v.c2
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.u.this.j();
                        }
                    }, H.c.e());
                    bVar.i(this.f101243i, C.A.f4076d, -1);
                    bVar.c(this.f101242h);
                    bVar.h(new a());
                    bVar.s(new InputConfiguration(this.f101241g.getWidth(), this.f101241g.getHeight(), this.f101241g.b()));
                    return;
                }
            }
        }
        bVar.v(1);
    }

    public final boolean b() {
        return this.f101238d;
    }

    public final boolean c() {
        return this.f101237c;
    }

    public final void d(boolean z11) {
        this.f101238d = z11;
    }

    public final void e(boolean z11) {
        this.f101237c = z11;
    }
}
