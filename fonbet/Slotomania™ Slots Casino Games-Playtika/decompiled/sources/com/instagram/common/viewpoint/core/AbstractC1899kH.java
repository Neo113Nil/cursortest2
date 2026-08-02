package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.kH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1899kH extends AbstractC0947Mt {
    public static String A04;
    public static String A05;
    public static String A06;
    public static byte[] A07;
    public static String[] A08 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public int A00;
    public final boolean A01;
    public final N0 A02;
    public final boolean A03;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        byte[] bArr = {60, 19, Ascii.SYN, Ascii.FS, Ascii.DC4, 95, 19, Ascii.DLE, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.ETB, Ascii.GS, Ascii.VT, Ascii.SYN, Ascii.DLE, Ascii.GS, 87, Ascii.DLE, Ascii.ETB, Ascii.CR, Ascii.FS, Ascii.ETB, Ascii.CR, 87, Ascii.CAN, Ascii.SUB, Ascii.CR, Ascii.DLE, Ascii.SYN, Ascii.ETB, 87, 47, 48, 60, 46, 17, Ascii.DC2, Ascii.DLE, Ascii.CAN, 44, 7, Ascii.SUB, Ascii.RS, Ascii.SYN, 35, 42, 46, 57, 42, Ascii.DLE, 59, 38, 34, 42, 34, 56, 57, 46, 34, 32, 40, 41, 47, 57, 57, 63, 41, 41, 65, 90, 93, 66, 81, 70, 71, 85, 88, 107, 88, 93, 90, 95, Ascii.DC4, Ascii.DC2, 4, 19, 62, Ascii.NAK, 19, 0, 2, 10, 4, 19, 62, 8, Ascii.DC2, 62, Ascii.SI, Ascii.SO, Ascii.NAK, 62, Ascii.SI, Ascii.DC4, Ascii.CR, Ascii.CR, 7, 1, Ascii.ETB, 0, 17, Ascii.RS, Ascii.ESC, 17, Ascii.EM, 111, 121, 108, 123, 112, 71, 121, 118, 124, 71, 122, 106, 119, 111, 107, 125};
        if (A08[1].length() != 9) {
            throw new RuntimeException();
        }
        A08[7] = "E0qxoPtldo8saq";
        A07 = bArr;
    }

    public abstract EnumC0944Mq A0H();

    static {
        A0E();
        A04 = A0D(64, 7, 106);
        A05 = A0D(85, 24, 81);
        A06 = A0D(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 16, 40);
    }

    public AbstractC1899kH(C1695gi c1695gi, VA va, String str, N0 n0, boolean z) {
        this(c1695gi, va, str, n0, z, false);
    }

    public AbstractC1899kH(C1695gi c1695gi, VA va, String str, N0 n0, boolean z, boolean z2) {
        super(c1695gi, va, str);
        this.A00 = 0;
        this.A02 = n0;
        this.A03 = z;
        this.A01 = z2;
        if (this.A02 != null) {
            this.A02.A07(new InterfaceC0946Ms() { // from class: com.facebook.ads.redexgen.X.kI
                @Override // com.instagram.common.viewpoint.core.InterfaceC0946Ms
                public final void AFa() {
                    AbstractC1899kH.this.A0I();
                }
            });
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0947Mt
    public final EnumC0944Mq A0G(String str) {
        if (this.A02 != null) {
            this.A02.A08(super.A03);
        }
        if (C1374bV.A04(super.A01)) {
            return EnumC0944Mq.A06;
        }
        if (A0L(str)) {
            return EnumC0944Mq.A06;
        }
        return A0H();
    }

    public final /* synthetic */ void A0I() {
        this.A00++;
        if (A0L(null)) {
            InterfaceC0945Mr interfaceC0945Mr = super.A00;
            if (A08[1].length() != 9) {
                throw new RuntimeException();
            }
            A08[0] = "ZLZB3DtfqcSTIr4ga6zBSlI";
            if (interfaceC0945Mr != null) {
                super.A00.ACk();
            }
        }
    }

    public final void A0J(Map<String, String> extraData, EnumC0944Mq enumC0944Mq) {
        if (!TextUtils.isEmpty(super.A03)) {
            if (this instanceof AnonymousClass87) {
                super.A02.AC8(super.A03, extraData);
            } else {
                super.A02.ABM(super.A03, extraData);
            }
            boolean A02 = EnumC0944Mq.A02(enumC0944Mq);
            boolean z = this.A02 != null;
            boolean isError = C1145Up.A2U(super.A01);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !A02;
                navigationDataMap.put(A04, Boolean.toString(isError2));
                navigationDataMap.put(A05, Boolean.toString(z));
                String str = A06;
                boolean isError3 = this.A01;
                navigationDataMap.put(str, Boolean.toString(isError3));
                super.A02.ABn(super.A03, navigationDataMap);
            }
            if (this.A02 != null) {
                this.A02.A06(enumC0944Mq);
                if (A02) {
                    this.A02.A05();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(A0D(47, 10, 127), Long.toString(-1L));
                hashMap.put(A0D(38, 9, 67), Long.toString(-1L));
                hashMap.put(A0D(57, 7, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), EnumC0944Mq.A05.name());
                super.A02.AC9(super.A03, hashMap);
            }
        }
        XI.A04(super.A01, A0D(0, 12, 79));
    }

    public final boolean A0K(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0D(71, 14, 4));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0D(12, 26, 73), XB.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C1199Wu.A0D(super.A01, intent);
        } catch (C1197Ws unused) {
            return false;
        }
    }

    public final boolean A0L(String str) {
        return (str == null || !str.equals(A0D(109, 9, 66))) && this.A00 != 0 && this.A00 >= C1145Up.A0I(super.A01);
    }
}
