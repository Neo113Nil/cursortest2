package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0745Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2210pY A01;
    public final Object A02;
    public final C05777s[] A03;
    public final InterfaceC2067nE[] A04;

    public C0745Ex(C05777s[] c05777sArr, InterfaceC2067nE[] interfaceC2067nEArr, C2210pY c2210pY, Object obj) {
        this.A03 = c05777sArr;
        this.A04 = (InterfaceC2067nE[]) interfaceC2067nEArr.clone();
        this.A01 = c2210pY;
        this.A02 = obj;
        this.A00 = c05777sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C0745Ex c0745Ex, int i) {
        if (c0745Ex == null) {
            return false;
        }
        C05777s[] c05777sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c05777sArr[i], c0745Ex.A03[i])) {
                return false;
            }
            InterfaceC2067nE interfaceC2067nE = this.A04[i];
            InterfaceC2067nE interfaceC2067nE2 = c0745Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2067nE, interfaceC2067nE2);
            }
        }
        throw new RuntimeException();
    }
}
