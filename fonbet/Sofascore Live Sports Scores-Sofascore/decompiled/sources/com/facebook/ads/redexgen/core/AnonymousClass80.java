package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass80 implements InterfaceC2848k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public N9 A01;
    public NA A02;
    public C2824jk A03;
    public C2822ji A04;
    public AnonymousClass76 A05;
    public Z1 A06;
    public Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(AnonymousClass76 anonymousClass76, C2822ji c2822ji, C2058Sx c2058Sx, N9 n9, Z2 z2) {
        String A7O = c2822ji.A7O();
        if (!TextUtils.isEmpty(A7O)) {
            c2058Sx.A0e(new VI(A7O, anonymousClass76.A0A()));
        }
        C2114Vb A0I = c2822ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0I != null) {
            C2056Sv c2056Sv = new C2056Sv(c2822ji.A0I().getUrl(), c2822ji.A0I().getHeight(), c2822ji.A0I().getWidth(), c2822ji.A0b(), A03(2, 16, 120));
            c2056Sv.A01 = new T3(false, -1, -1);
            c2058Sx.A0W();
            c2058Sx.A0c(c2056Sv);
        }
        if (c2822ji.A0H() != null) {
            c2058Sx.A0c(new C2056Sv(c2822ji.A0H().getUrl(), c2822ji.A0H().getHeight(), c2822ji.A0H().getWidth(), c2822ji.A0b(), A03(2, 16, 120)));
        }
        String A0e = c2822ji.A0e();
        if (A0e != null && !TextUtils.isEmpty(A0e)) {
            c2058Sx.A0b(new C2054St(A0e, c2822ji.A0b(), A03(2, 16, 120), c2822ji.A0D()));
        }
        AbstractC2817jd A0F = c2822ji.A0F();
        String A03 = A03(2, 16, 120);
        if (A0F != null) {
            O0.A00(c2822ji.A0F(), c2058Sx, A03);
        }
        C2836jw c2836jw = new C2836jw(this, z2, n9, anonymousClass76);
        String clientToken2 = c2822ji.A0b();
        c2058Sx.A0X(c2836jw, new C2051Sq(clientToken2, A03));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final AdPlacementType A8k() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2848k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC2126Vp enumC2126Vp, N9 n9, JSONObject jSONObject, C2084Tx c2084Tx) {
        anonymousClass76.A0F().A4N();
        this.A05 = anonymousClass76;
        this.A01 = n9;
        C2058Sx c2058Sx = new C2058Sx(anonymousClass76);
        this.A00 = System.currentTimeMillis();
        C2822ji A00 = NI.A00(anonymousClass76, jSONObject, AbstractC2163Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC1908Mx.A06(anonymousClass76, A00, va)) {
            Z1 adViewListener = new C2838jy(this, anonymousClass76);
            this.A06 = adViewListener;
            Z2 z2 = new Z2(anonymousClass76, va, c2058Sx, new WeakReference(adViewListener), c2084Tx.A04(), c2084Tx.A07(), c2084Tx.A08(), c2084Tx.A09(), A00, this.A08);
            this.A07 = z2;
            this.A03 = new C2824jk(anonymousClass76, new C2837jx(this, anonymousClass76, n9), z2.getViewabilityChecker(), va, A00);
            A05(anonymousClass76, A00, c2058Sx, n9, z2);
            this.A02 = new NA(anonymousClass76, this.A08, this, n9);
            this.A02.A02();
            return;
        }
        anonymousClass76.A0F().A52();
        n9.AEN(this, C2124Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2879kf A0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        NA na = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (na != null) {
            this.A02.A03();
        }
    }
}
