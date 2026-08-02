package com.facebook.ads.redexgen.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class TZ extends AbstractRunnableC2139Wc {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ WA A00;
    public final /* synthetic */ WD A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, 63, 51, 50, 50, 57, 63, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2652gi c2652gi;
        C2652gi c2652gi2;
        C2652gi c2652gi3;
        C2652gi c2652gi4;
        C2652gi c2652gi5;
        long j;
        C2652gi c2652gi6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC2604fw A032;
        C2652gi c2652gi7;
        C2652gi c2652gi8;
        C2652gi c2652gi9;
        C2652gi c2652gi10;
        long j2;
        this.A01.A00 = System.currentTimeMillis();
        c2652gi = this.A01.A05;
        if (AbstractC2185Xz.A00(c2652gi) == EnumC2184Xy.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 62);
            c2652gi10 = this.A01.A05;
            InterfaceC1878Lt A0F = c2652gi10.A0F();
            j2 = this.A01.A01;
            A0F.A3W(Y1.A01(j2), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0E(new C2124Vm(adErrorType, A00));
            return;
        }
        c2652gi2 = this.A01.A05;
        C2074Tn.A08(c2652gi2);
        c2652gi3 = this.A01.A05;
        SZ.A07(c2652gi3);
        UG A002 = UG.A00();
        c2652gi4 = this.A01.A05;
        boolean z = true;
        Map<String, String> A0A = this.A00.A0A(A002.A01(c2652gi4, true).A7y(this.A00.A05()));
        this.A01.A03 = A0A;
        try {
            c2652gi7 = this.A01.A05;
            PackageManager packageManager = c2652gi7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 92);
                StringBuilder sb = new StringBuilder();
                c2652gi8 = this.A01.A05;
                StringBuilder append = sb.append(c2652gi8.getPackageName()).append(A00(0, 1, 59));
                c2652gi9 = this.A01.A05;
                A0A.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c2652gi9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC2127Vq.A04 && this.A00.A07() != EnumC2127Vq.A06 && this.A00.A07() != EnumC2127Vq.A05 && this.A00.A07() != null) {
                z = false;
            }
            c2652gi6 = this.A01.A05;
            InterfaceC2603fv A022 = C2621gD.A02(z, c2652gi6);
            str = this.A01.A07;
            C2617g9 c2617g9 = new C2617g9();
            map = this.A01.A03;
            byte[] A08 = c2617g9.A05(map).A08();
            A032 = this.A01.A03(Y1.A00(), this.A00);
            A022.AGy(str, A08, A032);
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            c2652gi5 = this.A01.A05;
            InterfaceC1878Lt A0F2 = c2652gi5.A0F();
            j = this.A01.A01;
            A0F2.A3W(Y1.A01(j), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            WD wd = this.A01;
            C2124Vm A01 = C2124Vm.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            wd.A0E(A01);
        }
    }

    static {
        A01();
    }

    public TZ(WD wd, WA wa) {
        this.A01 = wd;
        this.A00 = wa;
    }
}
