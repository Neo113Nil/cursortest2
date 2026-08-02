package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1702Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C3167pY A01;
    public final Object A02;
    public final C15347s[] A03;
    public final InterfaceC3024nE[] A04;

    public C1702Ex(C15347s[] c15347sArr, InterfaceC3024nE[] interfaceC3024nEArr, C3167pY c3167pY, Object obj) {
        this.A03 = c15347sArr;
        this.A04 = (InterfaceC3024nE[]) interfaceC3024nEArr.clone();
        this.A01 = c3167pY;
        this.A02 = obj;
        this.A00 = c15347sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C1702Ex c1702Ex, int i) {
        if (c1702Ex == null) {
            return false;
        }
        C15347s[] c15347sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c15347sArr[i], c1702Ex.A03[i])) {
                return false;
            }
            InterfaceC3024nE interfaceC3024nE = this.A04[i];
            InterfaceC3024nE interfaceC3024nE2 = c1702Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC3024nE, interfaceC3024nE2);
            }
        }
        throw new RuntimeException();
    }
}
