package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2437dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C2436dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C2436dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C2436dC A01(C2652gi c2652gi, AbstractC2817jd abstractC2817jd, int i, InterfaceC2434dA interfaceC2434dA) {
        C2436dC c2436dC = new C2436dC(c2652gi, abstractC2817jd, c2652gi.A02().A0A(), i);
        c2436dC.A0b(interfaceC2434dA);
        c2436dC.A0X();
        A01.put(abstractC2817jd.A1D(), new WeakReference<>(c2436dC));
        return c2436dC;
    }

    public static C2436dC A02(String str) {
        WeakReference<C2436dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2817jd abstractC2817jd, C2436dC c2436dC) {
        A01.put(abstractC2817jd.A1D(), new WeakReference<>(c2436dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
