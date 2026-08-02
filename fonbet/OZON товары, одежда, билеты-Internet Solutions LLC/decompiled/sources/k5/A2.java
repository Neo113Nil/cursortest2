package k5;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class A2 implements M1 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean b(@NonNull InterfaceC7496b0 interfaceC7496b0, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        int i11;
        C7593z2 c7593z2 = (C7593z2) interfaceC7496b0;
        if (c7593z2.o() > 0 && c7593z2.x() > 0) {
            int i12 = -1;
            if (z11) {
                String r11 = c7593z2.r();
                if (r11 != null && !r11.isEmpty()) {
                    try {
                        i11 = Integer.parseInt(r11);
                    } catch (NumberFormatException unused) {
                    }
                    if (i11 >= 100 || i11 > 999) {
                        z13 = false;
                        if (z12) {
                            String z15 = c7593z2.z();
                            if (z15 != null && !z15.isEmpty()) {
                                try {
                                    i12 = Integer.parseInt(z15);
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            if (i12 < 0 || i12 > 999) {
                                z14 = false;
                                if (!z13 && z14) {
                                    return true;
                                }
                            }
                        }
                        z14 = true;
                        if (!z13) {
                        }
                    }
                }
                i11 = -1;
                if (i11 >= 100) {
                }
                z13 = false;
                if (z12) {
                }
                z14 = true;
                if (!z13) {
                }
            }
            z13 = true;
            if (z12) {
            }
            z14 = true;
            if (!z13) {
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean a(@NonNull InterfaceC7496b0 interfaceC7496b0) {
        char c11;
        C7593z2 c7593z2 = (C7593z2) interfaceC7496b0;
        String c12 = c7593z2.c();
        c12.getClass();
        int i11 = -1;
        switch (c12.hashCode()) {
            case 2500:
                if (c12.equals("NR")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 70881:
                if (c12.equals("GSM")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 75709:
                if (c12.equals("LTE")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 2063797:
                if (c12.equals("CDMA")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 2608919:
                if (c12.equals("UMTS")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1954916075:
                if (c12.equals("TD-SCDMA")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
                return b(interfaceC7496b0, true, true);
            case 3:
                if (b(interfaceC7496b0, false, false)) {
                    String r11 = c7593z2.r();
                    if (r11 != null && !r11.isEmpty()) {
                        try {
                            i11 = Integer.parseInt(r11);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (i11 >= 0 && i11 <= 32767) {
                        return true;
                    }
                }
                break;
            default:
                return false;
        }
    }
}
