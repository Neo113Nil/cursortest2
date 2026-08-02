package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.iol;
import defpackage.kea;
import defpackage.lm5;
import defpackage.tub;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3782tf {
    public final Context a;
    public final C3906y9 b;
    public String c;
    public boolean d;
    public final SignalsConfig.NovatiqConfig e;

    public C3782tf(Context context, C3906y9 c3906y9) {
        context.getClass();
        this.a = context;
        this.b = c3906y9;
        this.c = "";
        this.e = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final C3730rf a() {
        if (this.d) {
            return new C3730rf(tub.f(new Pair("n-h-id", this.c)));
        }
        C3906y9 c3906y9 = this.b;
        if (c3906y9 != null) {
            c3906y9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return new C3730rf(lm5Var);
    }

    public final void b() {
        String str;
        Context context = this.a;
        context.getClass();
        if (this.e.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
                str = "";
            }
            List<String> carrierNames = this.e.getCarrierNames();
            if (carrierNames == null || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (StringsKt.J(str, (String) it.next(), true)) {
                        try {
                            String a = a(this.a);
                            this.d = true;
                            StringBuilder sb = new StringBuilder();
                            Random random = new Random();
                            for (int i = 0; i < 40; i++) {
                                char charAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i);
                                if (charAt == 'x') {
                                    sb.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb.append(charAt);
                                }
                            }
                            String sb2 = sb.toString();
                            this.c = sb2;
                            ((kea) ((F9) Ve.c.getValue()).a(new C3808uf(this.e, new C3756sf(sb2, a), this.b).a())).n(new iol(this, 14));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C3906y9 c3906y9 = this.b;
        if (c3906y9 != null) {
            c3906y9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final Unit a(C3782tf c3782tf, Throwable th) {
        if (th == null) {
            C3906y9 c3906y9 = c3782tf.b;
            if (c3906y9 != null) {
                c3906y9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C3906y9 c3906y92 = c3782tf.b;
            if (c3906y92 != null) {
                c3906y92.a("NovatiqDataHandler", "Error: " + th);
            }
        }
        return Unit.a;
    }

    public static String a(Context context) {
        context.getClass();
        return kotlin.text.c.s(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_').concat("_app");
    }
}
