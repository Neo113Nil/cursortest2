package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3521jd {
    public static final List a(C3525jh c3525jh) {
        c3525jh.getClass();
        return kotlin.collections.b.j(new Pair(c3525jh.b, (short) 0), new Pair(c3525jh.a.getTitleView(), (short) 3), new Pair(c3525jh.a.getDescriptionView(), (short) 4), new Pair(c3525jh.a.getIconView(), (short) 5), new Pair(c3525jh.a.getCtaView(), (short) 6), new Pair(c3525jh.c, (short) 7), new Pair(c3525jh.a.getRatingView(), (short) 8), new Pair(c3525jh.a.getAdvertiserView(), (short) 9));
    }

    public static final void a(C3525jh c3525jh, InterfaceC3880x9 interfaceC3880x9) {
        c3525jh.getClass();
        if (interfaceC3880x9 == null) {
            return;
        }
        List<Pair> a = a(c3525jh);
        ViewGroup parentView = c3525jh.a.getParentView();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : a) {
            View view = (View) pair.a;
            short shortValue = ((Number) pair.b).shortValue();
            if (view != null) {
                boolean z = view.getVisibility() == 0;
                jSONArray.put(((int) shortValue) + " - " + z + " " + Un.a(view, parentView));
            }
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        ((C3906y9) interfaceC3880x9).a("NativeRenderedState", jSONArray2);
    }
}
