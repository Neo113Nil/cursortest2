package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.ironsource.Ua;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C15267k extends AbstractC2787j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public AnonymousClass76 A02;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C15267k(AnonymousClass76 anonymousClass76, O7 o7) {
        super(anonymousClass76, o7);
        this.A00 = Ua.s;
        this.A02 = anonymousClass76;
    }

    private C2790j3 A01(Runnable runnable) {
        return new C2790j3(this, runnable);
    }

    private List<JSONObject> A04(O8 o8) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = o8.A03();
        if (A032.has(A03(22, 12, 71))) {
            try {
                this.A00 = A032.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String A033 = A03(36, 38, 101);
                this.A02.A0F().A5g(C2124Vm.A01(AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC2848k8 interfaceC2848k8, JSONObject jSONObject, C2084Tx c2084Tx) {
        this.A0C = false;
        C2789j2 c2789j2 = new C2789j2(this, interfaceC2848k8, AbstractC2163Xd.A02(jSONObject, A03(34, 2, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE)));
        A0H().postDelayed(c2789j2, c2084Tx.A05());
        interfaceC2848k8.AAt(this.A02, this.A09, this.A08.A08, A01(c2789j2), jSONObject, c2084Tx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final void A0R(N1 n1, C2083Tw c2083Tw, C2081Tu c2081Tu, final O8 o8) {
        this.A02.A0F().A4Y();
        final InterfaceC2848k8 interfaceC2848k8 = (InterfaceC2848k8) n1;
        if (interfaceC2848k8.AKL()) {
            final List<JSONObject> A04 = A04(o8);
            A06(interfaceC2848k8, A04.get(0), o8.A01());
            if (A04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15267k.this.A0a(interfaceC2848k8, A04, o8);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2848k8, o8.A03(), o8.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2848k8 interfaceC2848k8, List list, O8 o8) {
        A06(interfaceC2848k8, (JSONObject) list.get(1), o8.A01());
    }
}
