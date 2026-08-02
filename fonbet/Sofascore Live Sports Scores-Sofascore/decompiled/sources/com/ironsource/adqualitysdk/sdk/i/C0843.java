package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵍ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0843 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = AbstractC0416.f1206;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                jSONObject.put(AbstractC0416.f1183, intent.hasExtra(StringFog.decrypt("Ry/2YJ9QUQ==\n", "N0ODB/g1NdI=\n")) ? intent.getIntExtra(StringFog.decrypt("0/Uk2iKx1w==\n", "o5lRvUXUs60=\n"), -1) : -1);
                jSONObject.put(AbstractC0416.f1182, Math.round(((intent.hasExtra(StringFog.decrypt("YYN5Nzs=\n", "DeYPUleIVn4=\n")) ? intent.getIntExtra(StringFog.decrypt("iuZ9jW0=\n", "5oML6AH6gc8=\n"), -1) : -1) * 100.0f) / (intent.hasExtra(StringFog.decrypt("NYdTkwM=\n", "RuQy/2alUuQ=\n")) ? intent.getIntExtra(StringFog.decrypt("W3SAaYg=\n", "KBfhBe1xqE4=\n"), -1) : -1)));
            } catch (Throwable th) {
                AbstractC0420.m243(AbstractC0416.f1206, StringFog.decrypt("PWWMGJT/6h4cfpAQxr3qDgxyjA7Gs+4MHXuNV5KwqxALeJBNxg==\n", "eBf+d+bfi3o=\n") + th.getLocalizedMessage());
            }
        }
        synchronized (AbstractC0416.class) {
            AbstractC0416.f1180 = jSONObject;
        }
    }
}
