package com.instagram.common.viewpoint.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.h6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1719h6 implements InterfaceC1093Sp {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final List<C1877ju> A00;
    public final /* synthetic */ C1718h5 A01;

    public C1719h6(C1718h5 c1718h5, List<C1877ju> list) {
        this.A01 = c1718h5;
        this.A00 = list;
    }

    private void A00() {
        S6 s6;
        S6 s62;
        S6 s63;
        C1695gi c1695gi;
        S6 s64;
        S6 s65;
        C1695gi c1695gi2;
        NativeAd.NativeOptions nativeOptions;
        s6 = this.A01.A01;
        s6.A05(true);
        s62 = this.A01.A01;
        s62.A02();
        s63 = this.A01.A01;
        s63.A03(0);
        Iterator<C1877ju> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                C1877ju next = it.next();
                c1695gi = this.A01.A02;
                C1140Uk A0K = UK.A0K();
                s64 = this.A01.A01;
                UK uk2 = new UK(c1695gi, next, null, A0K, s64.A01());
                if (uk2.A12() != null && uk2.A12().A0F() != null) {
                    ((AbstractC1825iv) uk2.A12().A0F()).A00(uk2);
                }
                s65 = this.A01.A01;
                c1695gi2 = this.A01.A02;
                nativeOptions = this.A01.A00;
                s65.A04(new NativeAd(c1695gi2, uk2, nativeOptions));
            } else {
                WT.A00(new C1720h7(this));
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1093Sp
    public final void ADL() {
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1093Sp
    public final void ADT() {
        A00();
    }
}
