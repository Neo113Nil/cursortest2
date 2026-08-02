package com.plaid.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.twilio.voice.EventKeys;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39220a;

    public E0(Context context) {
        this.f39220a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D0 a(D0 d02) {
        String[] strArr;
        String networkOperator;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk", 20901);
        jSONObject.put("accept", "json");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("device", jSONObject2);
        jSONObject2.put("os", "and");
        jSONObject2.put("ver", "" + Build.VERSION.SDK_INT);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str)) {
            str2 = str + " " + str2;
        }
        jSONObject2.put("model", str2);
        try {
            networkOperator = ((TelephonyManager) this.f39220a.getSystemService("phone")).getNetworkOperator();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(networkOperator)) {
            strArr = new String[]{networkOperator.substring(0, 3), networkOperator.substring(3)};
            if (strArr.length == 2) {
                jSONObject2.put("mcc", strArr[0]);
                jSONObject2.put("mnc", strArr[1]);
            }
            jSONObject2.put(EventKeys.IP, d02.f39192a);
            if (d02.f39193b != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("msg", C3791x7.a(d02.f39193b.getMessage()));
                Exception exc = d02.f39193b;
                if (exc instanceof r) {
                    r rVar = (r) exc;
                    EnumC3684l7 enumC3684l7 = rVar.f41008a;
                    if (enumC3684l7 != null) {
                        jSONObject3.put("st", enumC3684l7.getCode());
                    }
                    if (rVar.a() != null) {
                        jSONObject3.put("er", rVar.a().getCode());
                    }
                }
                jSONObject.put("error", jSONObject3);
            }
            return new D0(d02.f39192a, d02.f39193b, Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
        }
        strArr = new String[0];
        if (strArr.length == 2) {
        }
        jSONObject2.put(EventKeys.IP, d02.f39192a);
        if (d02.f39193b != null) {
        }
        return new D0(d02.f39192a, d02.f39193b, Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
    }
}
