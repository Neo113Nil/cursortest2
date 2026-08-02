package K9;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public abstract class x {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (n.i()) {
            StrictMode.setVmPolicy(w.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
