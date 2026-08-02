package defpackage;

import com.android.billingclient.api.BillingClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum px9 {
    INAPP(BillingClient.ProductType.INAPP),
    SUBS(BillingClient.ProductType.SUBS);

    public final String a;

    px9(String str) {
        this.a = str;
    }
}
