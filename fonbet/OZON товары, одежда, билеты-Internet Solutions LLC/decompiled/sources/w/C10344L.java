package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import w.C10340H;
import w.C10369v;

/* renamed from: w.L, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C10344L implements C10340H.b {

    /* renamed from: a, reason: collision with root package name */
    final CameraManager f103049a;

    /* renamed from: b, reason: collision with root package name */
    final Object f103050b;

    /* renamed from: w.L$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final HashMap f103051a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Handler f103052b;

        a(@NonNull Handler handler) {
            this.f103052b = handler;
        }
    }

    C10344L(@NonNull Context context, Object obj) {
        this.f103049a = (CameraManager) context.getSystemService("camera");
        this.f103050b = obj;
    }

    @Override // w.C10340H.b
    public void a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        C10340H.a aVar;
        a aVar2 = (a) this.f103050b;
        synchronized (aVar2.f103051a) {
            try {
                aVar = (C10340H.a) aVar2.f103051a.get(availabilityCallback);
                if (aVar == null) {
                    aVar = new C10340H.a(executor, availabilityCallback);
                    aVar2.f103051a.put(availabilityCallback, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f103049a.registerAvailabilityCallback(aVar, aVar2.f103052b);
    }

    @Override // w.C10340H.b
    public void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws C10348a {
        executor.getClass();
        stateCallback.getClass();
        try {
            this.f103049a.openCamera(str, new C10369v.b(executor, stateCallback), ((a) this.f103050b).f103052b);
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }

    @Override // w.C10340H.b
    @NonNull
    public CameraCharacteristics c(@NonNull String str) throws C10348a {
        try {
            return this.f103049a.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }

    @Override // w.C10340H.b
    @NonNull
    public Set<Set<String>> d() throws C10348a {
        return Collections.EMPTY_SET;
    }

    @Override // w.C10340H.b
    public void e(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        C10340H.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f103050b;
            synchronized (aVar2.f103051a) {
                aVar = (C10340H.a) aVar2.f103051a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f103049a.unregisterAvailabilityCallback(aVar);
    }
}
