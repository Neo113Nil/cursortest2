package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0975Nw implements InterfaceC1229Ya {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ NO A00;

    public C0975Nw(NO no) {
        this.A00 = no;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1229Ya
    public final void ACl(AbstractC1230Yb abstractC1230Yb) {
        boolean A0Y;
        boolean z;
        VI vi;
        C0967No c0967No;
        C1695gi c1695gi;
        InterfaceC1236Yh interfaceC1236Yh;
        ZU zu;
        C1695gi c1695gi2;
        AtomicBoolean atomicBoolean;
        boolean A0X;
        AtomicBoolean atomicBoolean2;
        C1387bi c1387bi;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            atomicBoolean2 = this.A00.A0b;
            if (!atomicBoolean2.get()) {
                c1387bi = this.A00.A0Z;
                c1387bi.A07(this.A00);
                return;
            }
        }
        NO no = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            z = no.A0d;
            if (z) {
                atomicBoolean = this.A00.A0b;
                if (!atomicBoolean.get()) {
                    A0X = this.A00.A0X();
                    if (A0X) {
                        this.A00.A0g.setToolbarActionMode(0);
                        this.A00.A0N();
                        return;
                    }
                }
            }
            vi = this.A00.A0T;
            vi.A04(VH.A07, null);
            c0967No = this.A00.A0P;
            if (c0967No.A0c()) {
                c1695gi2 = this.A00.A0R;
                c1695gi2.A0F().AEO();
            }
            c1695gi = this.A00.A0R;
            c1695gi.A0F().AB0();
            interfaceC1236Yh = this.A00.A0W;
            zu = this.A00.A0X;
            String A7w = zu.A7w();
            if (A01[6].charAt(7) != 'V') {
                String[] strArr = A01;
                strArr[3] = "iNY9OvP3hEWy4eydF9NsffnrPtCfLtIx";
                strArr[7] = "zl19Behk0RYI4HrdG27XeFY6Dxp3Bz2i";
                interfaceC1236Yh.A4j(A7w);
                return;
            }
        }
        throw new RuntimeException();
    }
}
