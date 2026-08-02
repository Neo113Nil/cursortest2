package com.inmobi.media;

import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B8 extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ D8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(D8 d8, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = d8;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        B8 b8 = new B8(this.b, rq3Var);
        b8.a = obj;
        return b8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        B8 b8 = new B8(this.b, (rq3) obj2);
        b8.a = (AbstractC3712qm) obj;
        return b8.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        AbstractC3712qm abstractC3712qm = (AbstractC3712qm) this.a;
        this.b.a(abstractC3712qm);
        Hi hi = this.b.b;
        if (hi != null) {
            abstractC3712qm.getClass();
            if (abstractC3712qm instanceof C3568l8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C3568l8) abstractC3712qm).a;
                Map a = hi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                a.put("payload", jSONObject.toString());
                C3839vk c3839vk = C3839vk.a;
                C3839vk.b("VideoLoadStarted", a, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof C3646o8) {
                C3646o8 c3646o8 = (C3646o8) abstractC3712qm;
                Map a2 = hi.a();
                Long latency = c3646o8.a.getLatency();
                a2.put(Payload.LATENCY, Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("videoUrl", c3646o8.a.getVideoUrl());
                jSONObject2.put("cacheProgress", c3646o8.b);
                a2.put("payload", jSONObject2.toString());
                C3839vk c3839vk2 = C3839vk.a;
                C3839vk.b("VideoLoadSuccess", a2, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof Jn) {
                Map a3 = hi.a();
                C3839vk c3839vk3 = C3839vk.a;
                C3839vk.b("VideoStart", a3, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof Wm) {
                Map a4 = hi.a();
                C3839vk c3839vk4 = C3839vk.a;
                C3839vk.b("VideoFirstQuartile", a4, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof Hn) {
                Map a5 = hi.a();
                C3839vk c3839vk5 = C3839vk.a;
                C3839vk.b("VideoSecondQuartile", a5, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof Qn) {
                Map a6 = hi.a();
                C3839vk c3839vk6 = C3839vk.a;
                C3839vk.b("VideoThirdQuartile", a6, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof C3660om) {
                Map a7 = hi.a();
                C3839vk c3839vk7 = C3839vk.a;
                C3839vk.b("VideoComplete", a7, EnumC3943zk.SDK);
            } else if (abstractC3712qm instanceof C3516j8) {
                C3516j8 c3516j8 = (C3516j8) abstractC3712qm;
                Map a8 = hi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c3516j8.a.getVideoFiles());
                a8.put("payload", jSONObject3.toString());
                a8.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(c3516j8.b));
                C3839vk c3839vk8 = C3839vk.a;
                C3839vk.b("VideoLoadFailure", a8, EnumC3943zk.SDK);
            }
        }
        return Unit.a;
    }
}
