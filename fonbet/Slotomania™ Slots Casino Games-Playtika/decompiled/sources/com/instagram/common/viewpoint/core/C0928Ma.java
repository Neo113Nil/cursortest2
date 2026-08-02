package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0928Ma implements InterfaceC1544eG {
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

    public C0928Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C0928Ma(MW mw, C0940Mm c0940Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AEA() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AEh() {
        C0967No c0967No;
        AtomicBoolean atomicBoolean;
        c0967No = this.A00.A0H;
        if (!c0967No.A0b()) {
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AFQ() {
        C1546eI c1546eI;
        C1695gi c1695gi;
        this.A00.AFA(false);
        c1546eI = this.A00.A0Q;
        c1546eI.A0E(8);
        c1695gi = this.A00.A0J;
        c1695gi.A0F().AFH();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1544eG
    public final void AGg() {
        InterfaceC1236Yh interfaceC1236Yh;
        interfaceC1236Yh = this.A00.A0O;
        interfaceC1236Yh.ADJ(15);
    }
}
