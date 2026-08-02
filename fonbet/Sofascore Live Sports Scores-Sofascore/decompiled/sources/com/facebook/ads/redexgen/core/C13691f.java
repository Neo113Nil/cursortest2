package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.1f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C13691f extends AE implements Handler.Callback {
    public static byte[] A0C;
    public static String[] A0D = {"NK", "vMUMQm9t3PVEHAhulw0MAIkQwbUiUT4C", "VzHAp2e3DLoJMdzQNED0QcuPK7cYUDq5", "FnbOiwq", "xIduLB4T8250", "Cs28mBuu0mG0MZGGLuKaoZOHc13snW3U", "yvPpy336WGNf4g7OJVDaRPYRY7Bcuv5q", "KVpXSq2ZIE7gcar9k8WJ"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC1778Hw A03;
    public List<ImfDataTrack> A04;
    public boolean A05;
    public final Handler A06;
    public final InterfaceC1607Bd A07;
    public final InterfaceC1609Bf A08;
    public final C15669e A09;
    public final long[] A0A;
    public final Metadata[] A0B;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{86, 97, 97, 124, 97, 51, 122, 125, 51, 99, 114, 97, 96, 122, 125, 116, 51, 90, 94, 85, 51, 96, 99, 118, 112, 124, 84, 69, 80, 85, 80, 69, 80, 99, 84, 95, 85, 84, 67, 84, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.A02(); i++) {
            C3212qI A9b = metadata.A03(i).A9b();
            if (A9b == null || !this.A07.AKN(A9b)) {
                list.add(metadata.A03(i));
            } else {
                InterfaceC1778Hw A5J = this.A07.A5J(A9b);
                byte[] bArr = (byte[]) AbstractC14363y.A01(metadata.A03(i).A9a());
                this.A09.A0A();
                this.A09.A0C(bArr.length);
                ((ByteBuffer) C5C.A0f(this.A09.A02)).put(bArr);
                this.A09.A0B();
                Metadata A5o = A5J.A5o(this.A09);
                if (A5o != null) {
                    A07(A5o, list);
                }
            }
        }
    }

    static {
        A02();
    }

    public C13691f(InterfaceC1609Bf interfaceC1609Bf, Looper looper) {
        this(interfaceC1609Bf, looper, InterfaceC1607Bd.A00, null);
    }

    public C13691f(InterfaceC1609Bf interfaceC1609Bf, Looper looper, InterfaceC1607Bd interfaceC1607Bd, String str) {
        super(5);
        this.A08 = (InterfaceC1609Bf) AbstractC14363y.A01(interfaceC1609Bf);
        this.A06 = looper == null ? null : C5C.A0c(looper, this);
        this.A07 = (InterfaceC1607Bd) AbstractC14363y.A01(interfaceC1607Bd);
        this.A09 = new C15669e();
        this.A0B = new Metadata[5];
        this.A0A = new long[5];
        A08(str);
    }

    private void A01() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A03(long j) {
        if (this.A04 == null) {
            return;
        }
        for (ImfDataTrack imfDataTrack : this.A04) {
            if (imfDataTrack.A01 > j || imfDataTrack.A00 >= j) {
            }
        }
    }

    private void A04(long j) {
        if (this.A04 == null) {
            return;
        }
        long A01 = C2Y.A01(j);
        if (this.A06 != null) {
            this.A06.obtainMessage(1, Long.valueOf(A01)).sendToTarget();
        } else {
            A03(A01);
        }
    }

    private void A05(Metadata metadata, long j) {
        if (this.A06 != null) {
            Handler handler = this.A06;
            String[] strArr = A0D;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "4kdXpcjsywiaLxx0LOctAJHWIf081Tdg";
            handler.obtainMessage(0, new Object[]{metadata, Long.valueOf(j)}).sendToTarget();
            return;
        }
        A06(metadata, j);
    }

    private void A06(Metadata metadata, long j) {
        this.A08.AEt(metadata, j);
    }

    private void A08(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = ImfSpecParser.A01(str);
            } catch (JSONException unused) {
                AbstractC14444g.A05(A00(25, 16, 46), A00(0, 25, 12));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1Z() {
        A01();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1a(long j, boolean z) {
        A01();
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1c(C3212qI[] c3212qIArr, long j, long j2) {
        this.A03 = this.A07.A5J(c3212qIArr[0]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final boolean AAP() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final boolean AAe() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void AIX(long j, long j2) {
        A04(j);
        if (!this.A05) {
            int i = this.A00;
            String[] strArr = A0D;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[6] = "1aiib0Ku6fHDvKwfwiyuvRv8M83XUpBK";
            if (i < 5) {
                this.A09.A0A();
                C15156z A1U = A1U();
                int A1R = A1R(A1U, this.A09, 0);
                if (A1R == -4) {
                    if (this.A09.A05()) {
                        this.A05 = true;
                    } else if (!this.A09.A04()) {
                        this.A09.A00 = this.A02;
                        this.A09.A0B();
                        Metadata A5o = ((InterfaceC1778Hw) C5C.A0f(this.A03)).A5o(this.A09);
                        if (A5o != null) {
                            ArrayList arrayList = new ArrayList(A5o.A02());
                            A07(A5o, arrayList);
                            if (!arrayList.isEmpty()) {
                                Metadata metadata = new Metadata(arrayList);
                                int i2 = (this.A01 + this.A00) % 5;
                                this.A0B[i2] = metadata;
                                this.A0A[i2] = this.A09.A01;
                                this.A00++;
                            }
                        }
                    }
                } else if (A1R == -5) {
                    this.A02 = ((C3212qI) AbstractC14363y.A01(A1U.A00)).A0M;
                }
            }
        }
        if (this.A00 > 0 && this.A0A[this.A01] <= j) {
            A05((Metadata) C5C.A0f(this.A0B[this.A01]), C2Y.A01(j - this.A0A[this.A01]));
            this.A0B[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC15317p
    public final int AKM(C3212qI c3212qI) {
        int i;
        if (this.A07.AKN(c3212qI)) {
            if (AbstractC13701g.A1G(c3212qI)) {
                i = 4;
            } else {
                i = 2;
            }
            return AbstractC15247i.A00(i);
        }
        return AbstractC15247i.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo, com.facebook.ads.redexgen.core.InterfaceC15317p
    public final String getName() {
        return A00(25, 16, 46);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                A06((Metadata) objArr[0], ((Long) objArr[1]).longValue());
                return true;
            case 1:
                A03(((Long) message.obj).longValue());
                String[] strArr = A0D;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new RuntimeException();
                }
                A0D[5] = "UckPrHUV0DeFsLdW0mSA3sL7bYTaY94z";
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
