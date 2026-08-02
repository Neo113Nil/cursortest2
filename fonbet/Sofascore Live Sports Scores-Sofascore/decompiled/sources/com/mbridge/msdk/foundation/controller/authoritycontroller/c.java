package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c extends b {
    private static volatile c j;

    private c() {
        h();
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (j == null) {
            synchronized (c.class) {
                try {
                    if (j == null) {
                        j = new c();
                    }
                } finally {
                }
            }
        }
        return j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = i.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.z0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.y0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.A0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z;
        g e = w1l.e(i.b());
        if (e == null) {
            e = i.b().a();
            z = true;
        } else {
            z = false;
        }
        int n0 = e.n0();
        boolean z2 = n0 != 0 ? n0 == 1 && a(e, str) == 1 : a(str) == 1 && a(e, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z2 = a(str) == 1;
        }
        return (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) ? (e.K0() || z || a(str) != 1) ? false : true : z2;
    }

    public static void c(boolean z) {
    }
}
