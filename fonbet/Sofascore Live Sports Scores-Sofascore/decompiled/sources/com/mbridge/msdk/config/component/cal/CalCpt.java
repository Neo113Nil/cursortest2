package com.mbridge.msdk.config.component.cal;

import android.text.TextUtils;
import com.ironsource.C4094gc;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import defpackage.w1l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class CalCpt extends a {
    private com.mbridge.msdk.config.component.cal.model.a h;
    private MBridgeIds i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private Object q;

    private void a(boolean z, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("500"), z ? "1" : "0");
        if (!z) {
            hashMap.put(c.c("code"), str);
            hashMap.put(c.c("reason"), str2);
        }
        a(a("910002", (Map<String, Object>) hashMap));
    }

    private String h() {
        Map<String, Object> f = this.h.f();
        this.j = w1l.j("107", f);
        this.k = w1l.j("cbType", f);
        this.l = w1l.j("110", f);
        this.m = w1l.j("111", f);
        this.n = w1l.j("106", f);
        this.o = w1l.j("108", f);
        this.p = w1l.j("109", f);
        Object b = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.d.b((Object) "adModel")).b((Object) "host");
        StringBuilder sb = new StringBuilder();
        if (b instanceof String) {
            sb.append(b);
            sb.append("/addReward?user_id=");
            sb.append(this.j);
            sb.append("&cb_type=");
            sb.append(this.k);
            sb.append("&reward_name=");
            sb.append(this.l);
            sb.append("&reward_amount=");
            sb.append(this.m);
            sb.append("&unit_id=");
            sb.append(this.n);
            sb.append("&click_id=");
            sb.append(this.o);
            sb.append("&extra=");
            sb.append(this.p);
        }
        return sb.toString();
    }

    private void i() {
        Map<String, Object> f = this.h.f();
        this.l = w1l.j("110", f);
        this.m = w1l.j("111", f);
        RewardInfo rewardInfo = new RewardInfo(f.get(c.c("112")).equals("1"), 1);
        rewardInfo.setRewardName(this.l);
        rewardInfo.setRewardAmount(this.m);
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.i, rewardInfo);
        }
    }

    private void j() {
        if (this.q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("buyer_id"), this.h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.q).a(hashMap);
        }
    }

    private void k() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.i);
        }
    }

    private void l() {
        if (this.q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c(MBridgeConstans.PROPERTIES_UNIT_ID), this.h.g());
            hashMap.put(c.c("ready_state"), Boolean.valueOf(this.h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.q).a(hashMap);
        }
    }

    private void m() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.i, this.h.c() == null ? "" : this.h.c());
        }
    }

    private void n() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.i);
        }
    }

    private void o() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.i);
        }
    }

    private void p() {
        if (this.q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("init_status"), Integer.valueOf(this.h.d()));
            hashMap.put(c.c("reason"), this.h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.q).a(hashMap);
        }
    }

    private void q() {
        String h = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("URLs", h);
        hashMap2.put("scheme", "HTTP");
        hashMap2.put("method", C4094gc.a);
        hashMap.put("componentConfig", hashMap2);
        noriCpt.a(hashMap, this.d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.i, this.h.c() == null ? "" : this.h.c());
        }
    }

    private void s() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.i);
        }
    }

    private void t() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.i);
        }
    }

    private void u() {
        Object obj = this.q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "910001";
        this.h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.i = mBridgeIds;
        mBridgeIds.setUnitId(this.h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.d;
            if (aVar != null && aVar.a((Object) c.c("sdk_context"))) {
                Object b = this.d.b((Object) c.c("sdk_context"));
                if (b instanceof Map) {
                    this.q = ((Map) b).get(c.c("callback"));
                }
            }
            if (this.q == null) {
                a(false, "", "Callback Listener is NULL");
            }
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = this.d;
            if (aVar2 != null && aVar2.a((Object) c.c("51"))) {
                Object b2 = this.d.b((Object) c.c("51"));
                if (b2 instanceof Map) {
                    String valueOf = String.valueOf(((Map) b2).get("id"));
                    if (!TextUtils.isEmpty(valueOf) && valueOf.contains("-")) {
                        this.i.setContextId(valueOf);
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("CalCpt", th.getMessage(), th);
        }
        g();
    }

    public void g() {
        String b = this.h.b();
        if (b == null) {
            a(false, "900001", "command is null");
            return;
        }
        try {
            if (c.c("loadV3Success").equals(b)) {
                n();
            } else if (c.c("loadSuccess").equals(b)) {
                o();
            } else if (c.c("loadFailed").equals(b)) {
                m();
            } else if (c.c("301").equals(b)) {
                s();
            } else if (c.c("302").equals(b)) {
                r();
            } else if (c.c("304").equals(b)) {
                k();
            } else if (c.c("305").equals(b)) {
                t();
            } else if (c.c("306").equals(b)) {
                i();
            } else if (c.c("303").equals(b)) {
                u();
            } else if (c.c("308").equals(b)) {
                q();
            } else if (c.c("300").equals(b)) {
                l();
            } else if (c.c("sdkInit").equals(b)) {
                p();
            } else if (c.c("309").equals(b)) {
                j();
            }
        } catch (Exception e) {
            q0.b("CalCpt", e.getMessage(), e);
            a(false, "900002", "callback type failed");
        }
        a(true, "", "");
    }
}
