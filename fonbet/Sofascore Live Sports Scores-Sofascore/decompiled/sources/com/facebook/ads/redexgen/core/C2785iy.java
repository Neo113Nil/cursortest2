package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2785iy implements NC {
    public static byte[] A02;
    public final /* synthetic */ C15257j A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, 21, 21, 68, 19, 17, 77, 104, 109, 124, 120, 105, 126, 44, 101, Byte.MAX_VALUE, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, Byte.MAX_VALUE, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, 63, 48, 1, 63, 61, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C2785iy(C15257j c15257j, Runnable runnable) {
        this.A00 = c15257j;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEC(C2839jz c2839jz, String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(XB.A00(str));
                C2156Wu.A0D(this.A00.A0B, intent);
            } catch (C2154Ws e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), AbstractC2064Td.A04, new C2065Te(th));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AED(C2839jz c2839jz) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEE(C2839jz c2839jz) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEF(C2839jz c2839jz) {
        if (c2839jz != this.A00.A00) {
            return;
        }
        if (c2839jz == null) {
            this.A00.A0B.A08().ABC(A00(111, 3, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), AbstractC2064Td.A0X, new C2065Te(A00(8, 37, 54)));
            AEG(c2839jz, AdError.internalError(2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c2839jz;
        this.A00.A0L();
        this.A00.A07.A0F(c2839jz);
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEG(C2839jz c2839jz, AdError adError) {
        if (c2839jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c2839jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C2124Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEH(C2839jz c2839jz) {
        AbstractC2135Vy.A05(A00(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
