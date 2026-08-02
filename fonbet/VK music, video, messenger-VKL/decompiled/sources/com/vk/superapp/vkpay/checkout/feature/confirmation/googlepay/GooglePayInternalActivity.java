package com.vk.superapp.vkpay.checkout.feature.confirmation.googlepay;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.ironsource.X3;
import com.vk.superapp.bridges.dto.GooglePayMerchantInfo;
import com.vk.superapp.bridges.dto.GooglePayTransactionRequest;
import com.vkontakte.android.R;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bau;
import xsna.cau;
import xsna.dhr0;
import xsna.e370;
import xsna.eau;
import xsna.exc0;
import xsna.fj5;
import xsna.gfx0;
import xsna.kvz0;
import xsna.ps90;
import xsna.sgn0;
import xsna.ysg0;

/* compiled from: GooglePayInternalActivity.kt */
/* loaded from: classes6.dex */
public final class GooglePayInternalActivity extends Activity {
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 51617) {
            ysg0.b.a(new cau(i2, intent));
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        setTheme(!dhr0.M() ? R.style.VkSuperappkit_Light_Transparent_Floating : R.style.VkSuperappkit_Dark_Transparent_Floating);
        GooglePayTransactionRequest googlePayTransactionRequest = (GooglePayTransactionRequest) getIntent().getSerializableExtra("google_pay_transaction_request");
        sgn0 sgn0Var = e370.g;
        (sgn0Var != null ? sgn0Var : null).getClass();
        eau eauVar = sgn0.b;
        if (eauVar != null) {
            eauVar.getClass();
            int i = bau.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(X3.s, 2);
            jSONObject.put("apiVersionMinor", 0);
            JSONArray jSONArray = new JSONArray();
            JSONObject a = bau.a();
            GooglePayMerchantInfo g = googlePayTransactionRequest.g();
            a.put("tokenizationSpecification", new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "moneymailru").put("gatewayMerchantId", "vksdk" + g.d())));
            jSONObject.put("allowedPaymentMethods", jSONArray.put(a));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("totalPrice", String.valueOf(googlePayTransactionRequest.h()));
            jSONObject2.put("totalPriceStatus", "FINAL");
            jSONObject2.put("currencyCode", googlePayTransactionRequest.d());
            jSONObject.put("transactionInfo", jSONObject2);
            jSONObject.put("merchantInfo", new JSONObject().put("merchantName", googlePayTransactionRequest.g().g()));
            String jSONObject3 = jSONObject.toString();
            PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
            paymentDataRequest.j = true;
            exc0.j(jSONObject3, "paymentDataRequestJson cannot be null!");
            paymentDataRequest.k = jSONObject3;
            ps90 ps90Var = eauVar.a;
            ps90Var.getClass();
            Task<TResult> doWrite = ps90Var.doWrite(new kvz0(paymentDataRequest));
            int i2 = fj5.c;
            fj5.a<?> aVar = new fj5.a<>();
            int incrementAndGet = fj5.a.g.incrementAndGet();
            aVar.b = incrementAndGet;
            fj5.a.f.put(incrementAndGet, aVar);
            fj5.a.e.postDelayed(aVar, fj5.a);
            doWrite.addOnCompleteListener(aVar);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            int i3 = aVar.b;
            int i4 = fj5.b.e;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("resolveCallId", i3);
            bundle2.putInt("requestCode", 51617);
            bundle2.putLong("initializationElapsedRealtime", fj5.b);
            fj5.b bVar = new fj5.b();
            bVar.setArguments(bundle2);
            int i5 = aVar.b;
            StringBuilder sb = new StringBuilder(58);
            sb.append("com.google.android.gms.wallet.AutoResolveHelper");
            sb.append(i5);
            beginTransaction.add(bVar, sb.toString()).commit();
        }
    }
}
