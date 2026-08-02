package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1480dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1479dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1479dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1479dC A01(C1695gi c1695gi, AbstractC1860jd abstractC1860jd, int i, InterfaceC1477dA interfaceC1477dA) {
        C1479dC c1479dC = new C1479dC(c1695gi, abstractC1860jd, c1695gi.A02().A0A(), i);
        c1479dC.A0b(interfaceC1477dA);
        c1479dC.A0X();
        A01.put(abstractC1860jd.A1D(), new WeakReference<>(c1479dC));
        return c1479dC;
    }

    public static C1479dC A02(String str) {
        WeakReference<C1479dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1860jd abstractC1860jd, C1479dC c1479dC) {
        A01.put(abstractC1860jd.A1D(), new WeakReference<>(c1479dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
