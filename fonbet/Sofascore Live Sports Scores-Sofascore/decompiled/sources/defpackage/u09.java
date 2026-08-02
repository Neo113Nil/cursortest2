package defpackage;

import com.adsbynimbus.google.DynamicPriceRenderer;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class u09 {
    public static final void a(AdManagerAdRequest.Builder builder, wcd wcdVar, iub iubVar) {
        Map o;
        builder.getClass();
        wcdVar.getClass();
        iubVar.getClass();
        DynamicPriceRenderer.getDynamicPriceAdCache().d(wcdVar.b, wcdVar);
        cp cpVar = cf5.a;
        sv1 sv1Var = wcdVar.a;
        Pair pair = new Pair("na_id", sv1Var.b);
        StringBuilder sb = new StringBuilder();
        sb.append(sv1Var.i);
        sb.append('x');
        sb.append(sv1Var.h);
        Pair pair2 = new Pair("na_size", sb.toString());
        String str = sv1Var.a;
        Map h = tub.h(pair, pair2, new Pair("na_type", Intrinsics.c(str, "video") ? "video" : "static"), new Pair("na_network", sv1Var.l));
        if (Intrinsics.c(str, "video")) {
            String a = iubVar.a(wcdVar);
            String str2 = gcd.a;
            o = tub.h(new Pair("na_bid_video", a != null ? a : "0"), new Pair("na_duration", String.valueOf(sv1Var.q)));
        } else {
            String a2 = iubVar.a(wcdVar);
            String str3 = gcd.a;
            o = wv8.o("na_bid", a2 != null ? a2 : "0");
        }
        for (Map.Entry entry : tub.k(h, o).entrySet()) {
            builder.addCustomTargeting((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
