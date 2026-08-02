package defpackage;

import android.os.Bundle;
import com.facebook.appevents.p;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.moloco.sdk.internal.publisher.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class kx9 {
    public static final List a = a.c("fb_currency");
    public static final List b = a.c("_valueToSum");
    public static final long c = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    public static final List d = b.j(new Pair("fb_iap_product_id", a.c("fb_iap_product_id")), new Pair("fb_iap_product_description", a.c("fb_iap_product_description")), new Pair("fb_iap_product_title", a.c("fb_iap_product_title")), new Pair("fb_iap_purchase_token", a.c("fb_iap_purchase_token")));

    public static Pair a(Bundle bundle, Bundle bundle2, p pVar) {
        if (bundle == null) {
            return new Pair(bundle2, pVar);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    Map map = p.b;
                    str.getClass();
                    Pair o = h0.o(str, string, bundle2, pVar);
                    Bundle bundle3 = (Bundle) o.a;
                    pVar = (p) o.b;
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, pVar);
    }

    public static List b(boolean z) {
        u b2 = x.b(w.b());
        if ((b2 != null ? b2.w : null) != null) {
            List<Pair> list = b2.w;
            if (!list.isEmpty()) {
                if (!z) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list) {
                    Iterator it = ((List) pair.b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair((String) it.next(), a.c(pair.a)));
                    }
                }
                return arrayList;
            }
        }
        return d;
    }

    public static List c(boolean z) {
        List<Pair> list;
        u b2 = x.b(w.b());
        if (b2 == null || (list = b2.x) == null || list.isEmpty()) {
            return null;
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            Iterator it = ((List) pair.b).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), a.c(pair.a)));
            }
        }
        return arrayList;
    }
}
