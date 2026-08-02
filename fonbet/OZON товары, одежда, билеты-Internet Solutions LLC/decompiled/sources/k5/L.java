package k5;

import android.os.BatteryManager;
import android.os.Build;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class L extends C7488G {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.D0
    @NonNull
    protected final Integer s() throws D1 {
        int i11;
        Integer num;
        String str = Build.MANUFACTURER;
        int i12 = (str.contains("Google") && Build.HARDWARE.contains("ranchu") && Build.BOARD.contains("goldfish")) ? 2 : 0;
        if (str.contains("Genymobile") && Build.HARDWARE.contains("vbox")) {
            i12 |= 4;
        }
        if (Build.getRadioVersion().isEmpty() || ((BatteryManager) this.f70555e.getSystemService("batterymanager")).getIntProperty(4) <= 0) {
            i12 |= 1;
        }
        if (i12 > 0) {
            return Integer.valueOf(i12);
        }
        try {
            num = (Integer) p(InterfaceC7500c0.f70717a);
        } catch (Throwable unused) {
            i11 = -1;
        }
        if (num != null) {
            i11 = num.intValue();
            return Integer.valueOf(i11);
        }
        e();
        throw new P1(C7563s0.a(new byte[]{-103, -75, 14, 84, 69, -13, 108, -7, -111, 8, -91, -65, 8, 77, 23, 37, -119, -24, -98, -123, -58, 2, 22, -11, -46, -113, -60, -89, 96, 60, 110, -110}));
    }
}
