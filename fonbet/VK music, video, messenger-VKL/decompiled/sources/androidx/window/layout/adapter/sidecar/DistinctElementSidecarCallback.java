package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import xsna.epx;
import xsna.nlj0;

/* loaded from: classes12.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final nlj0 d;
    public final SidecarInterface.SidecarCallback e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(nlj0 nlj0Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = nlj0Var;
        this.e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.a) {
            try {
                nlj0 nlj0Var = this.d;
                SidecarDeviceState sidecarDeviceState2 = this.b;
                nlj0Var.getClass();
                if (!epx.f(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 != null) {
                        int a = nlj0.a.a(sidecarDeviceState2);
                        int i = 0;
                        if (a < 0 || a > 4) {
                            a = 0;
                        }
                        int a2 = nlj0.a.a(sidecarDeviceState);
                        if (a2 >= 0 && a2 <= 4) {
                            i = a2;
                        }
                    }
                    this.b = sidecarDeviceState;
                    this.e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                this.d.getClass();
                if (epx.f(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b = nlj0.b(nlj0.a.b(sidecarWindowLayoutInfo2), nlj0.a.b(sidecarWindowLayoutInfo));
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
