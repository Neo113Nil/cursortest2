package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1885Ma implements InterfaceC2501eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C1885Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1885Ma(MW mw, C1897Mm c1897Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AEA() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AEh() {
        C1924No c1924No;
        AtomicBoolean atomicBoolean;
        c1924No = this.A00.A0H;
        if (!c1924No.A0b()) {
            this.A00.A0N();
            return;
        }
        MW mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        atomicBoolean = mw.A0S;
        atomicBoolean.set(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AFQ() {
        C2503eI c2503eI;
        C2652gi c2652gi;
        this.A00.AFA(false);
        c2503eI = this.A00.A0Q;
        c2503eI.A0E(8);
        c2652gi = this.A00.A0J;
        c2652gi.A0F().AFH();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2501eG
    public final void AGg() {
        InterfaceC2193Yh interfaceC2193Yh;
        interfaceC2193Yh = this.A00.A0O;
        interfaceC2193Yh.ADJ(15);
    }
}
