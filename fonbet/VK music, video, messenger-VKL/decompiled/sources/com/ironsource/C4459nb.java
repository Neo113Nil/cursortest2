package com.ironsource;

import com.ironsource.adapters.bigo.BigoConstants;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.adapters.yandex.YandexConstants;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.cw4;
import xsna.e43;
import xsna.gq4;
import xsna.p09;
import xsna.zcl;

/* renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4459nb {
    public static final String d = "do_not_sell";
    private final C4602vb a;
    private final com.ironsource.mediationsdk.c b;
    public static final a c = new a(null);
    private static final List<String> e = e43.l("admob_tfcd", "admob_tfua", "BidMachine_COPPA", "chartboost_coppa", FyberConstants.META_DATA_DT_COPPA_KEY, com.ironsource.mediationsdk.metadata.a.b, BigoConstants.META_DATA_BIGO_COPPA_KEY, "meta_mixed_audience", MintegralConstants.META_DATA_MINTEGRAL_COPPA_KEY, "Moloco_COPPA", "Pangle_COPPA", "UnityAds_COPPA", VungleConstants.META_DATA_VUNGLE_COPPA_KEY, YandexConstants.META_DATA_YANDEX_COPPA_KEY);
    private static C4459nb f = new C4459nb(new C4602vb(), com.ironsource.mediationsdk.c.b());

    /* renamed from: com.ironsource.nb$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final List<String> a() {
            return C4459nb.e;
        }

        public final C4459nb b() {
            return C4459nb.f;
        }

        private a() {
        }

        public final void a(C4459nb c4459nb) {
            C4459nb.f = c4459nb;
        }
    }

    public C4459nb(C4602vb c4602vb, com.ironsource.mediationsdk.c cVar) {
        this.a = c4602vb;
        this.b = cVar;
    }

    public final void b(boolean z) {
        this.a.c(new cw4(this, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4459nb c4459nb, boolean z) {
        c4459nb.a.b(z);
        Iterator<String> it = e.iterator();
        while (it.hasNext()) {
            c4459nb.b.c(it.next(), Collections.singletonList(String.valueOf(z)));
        }
    }

    public final void a(Map<String, Boolean> map) {
        this.a.c(new gq4(8, this, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4459nb c4459nb, Map map) {
        c4459nb.a.a((Map<String, Boolean>) map);
        c4459nb.b.a((Map<String, Boolean>) map);
    }

    public final void a(boolean z) {
        this.a.c(new p09(this, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4459nb c4459nb, boolean z) {
        c4459nb.a.a(z);
        c4459nb.b.c("do_not_sell", Collections.singletonList(String.valueOf(z)));
    }
}
