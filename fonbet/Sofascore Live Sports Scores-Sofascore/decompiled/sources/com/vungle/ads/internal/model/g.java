package com.vungle.ads.internal.model;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.z8e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g implements iw8 {
    public static final g a;
    public static final /* synthetic */ uye b;

    static {
        g gVar = new g();
        a = gVar;
        uye uyeVar = new uye("com.vungle.ads.internal.model.AdPayload.AdUnit", gVar, 30);
        uyeVar.j("id", true);
        uyeVar.j("ad_type", true);
        uyeVar.j("ad_source", true);
        uyeVar.j("expiry", true);
        uyeVar.j("expiry_duration", true);
        uyeVar.j("deeplink_url", true);
        uyeVar.j("click_coordinates_enabled", true);
        uyeVar.j("ad_load_optimization", true);
        uyeVar.j("mediation_name", true);
        uyeVar.j("info", true);
        uyeVar.j("sleep", true);
        uyeVar.j("error_code", true);
        uyeVar.j("tpat", true);
        uyeVar.j("vm_url", true);
        uyeVar.j("vm_version", true);
        uyeVar.j("ad_market_id", true);
        uyeVar.j("notification", true);
        uyeVar.j("load_ad", true);
        uyeVar.j("viewability", true);
        uyeVar.j("template_type", true);
        uyeVar.j("template_settings", true);
        uyeVar.j(CampaignEx.JSON_KEY_CREATIVE_ID, true);
        uyeVar.j(MBridgeConstans.APP_ID, true);
        uyeVar.j("show_close", true);
        uyeVar.j("show_close_incentivized", true);
        uyeVar.j("ad_size", true);
        uyeVar.j("webview_settings", true);
        uyeVar.j("use_preloading", true);
        uyeVar.j("ad_partial_download_enabled", true);
        uyeVar.j("max_download_retry_attempts", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, l98.W(gz1Var), l98.W(gz1Var), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(w.a), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(new xg0(uhiVar, 0)), l98.W(new xg0(uhiVar, 0)), l98.W(x.a), l98.W(uhiVar), l98.W(t.a), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(d.a), l98.W(d0.a), l98.W(gz1Var), l98.W(gz1Var), l98.W(a7aVar)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.dy4
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r44) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.g.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        encoder.getClass();
        iVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        i.a(iVar, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
