package com.inmobi.media;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import defpackage.wem;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3862wh implements BillingClientStateListener {
    public final /* synthetic */ Ah a;
    public final /* synthetic */ Function1 b;

    public C3862wh(Function1 function1, Ah ah) {
        this.a = ah;
        this.b = function1;
    }

    public static final void a(Function1 function1, Ah ah) {
        ah.getClass();
        function1.invoke(new C3784th("Billing Service Disconnected", -1));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.a.getClass();
        AbstractC3424fj.g.submit(new defpackage.am(2, this.a, this.b));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        Object c3784th;
        billingResult.getClass();
        this.a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c3784th = C3810uh.a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            debugMessage.getClass();
            c3784th = new C3784th(debugMessage, responseCode);
        }
        AbstractC3424fj.g.submit(new wem(17, this.b, c3784th));
    }

    public static final void a(Function1 function1, AbstractC3836vh abstractC3836vh) {
        function1.invoke(abstractC3836vh);
    }
}
