package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private String a;
    private String b;
    private String c;
    private BidListennning e;
    private BidResponsedEx f;
    private int g;
    private long i;
    private long j;
    private boolean k;
    private int l;
    private boolean h = false;
    private Context d = com.mbridge.msdk.foundation.controller.c.n().d();

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public void a(boolean z) {
        try {
            if (this.h) {
                a("current unit is biding");
                return;
            }
            this.h = true;
            if (this.d == null) {
                a("context is null");
            }
            com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.d);
            e eVar = new e();
            String b = com.mbridge.msdk.foundation.controller.c.n().b();
            eVar.a(MBridgeConstans.APP_ID, b);
            eVar.a("sign", SameMD5.getMD5(b + com.mbridge.msdk.foundation.controller.c.n().c()));
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            if (TextUtils.isEmpty(this.a)) {
                this.a = "";
            }
            eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.a);
            if (com.mbridge.msdk.util.b.a()) {
                eVar.a("install_ids", c.a());
            }
            eVar.a("bid_floor", this.c);
            eVar.a(e.h, v0.a(this.d, this.b));
            eVar.a(e.g, com.mbridge.msdk.foundation.same.buffer.b.a(this.b, ""));
            String str = "1";
            eVar.a("req_type", this.k ? "1" : "2");
            eVar.a(U3.i.n, m0.G(this.d) + "");
            int i = this.g;
            if (i == 296) {
                if (this.i <= 0 || this.j <= 0) {
                    a("bid required param is missing or error");
                    return;
                }
                eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.j + "x" + this.i);
                try {
                    Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                    if (method.invoke(null, this.b) instanceof String) {
                        eVar.a("close_id", method.invoke(null, this.b).toString());
                    }
                } catch (Exception unused) {
                    a("banner module is miss");
                    return;
                }
            } else if (i == 297) {
                if (this.i <= 0 || this.j <= 0) {
                    a("ad display area is too small");
                    return;
                }
                eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.j + "x" + this.i);
                StringBuilder sb = new StringBuilder();
                sb.append(this.l);
                sb.append("");
                eVar.a(U3.i.n, sb.toString());
            } else if (i != 298) {
                if (!z) {
                    str = "0";
                }
                eVar.a("rw_plus", str);
            } else {
                if (this.i <= 0 || this.j <= 0) {
                    a("bid required param is missing or error");
                    return;
                }
                eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.j + "x" + this.i);
            }
            String md5 = SameMD5.getMD5(v0.d());
            eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
            a aVar2 = new a(this.a, this.b, md5);
            aVar2.setUnitId(this.b);
            aVar2.setPlacementId(this.a);
            aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        } catch (Throwable th) {
            a(th.getMessage());
        }
    }

    public void b(boolean z) {
        this.k = z;
    }

    public void b(int i) {
        this.l = i;
    }

    public void b(long j) {
        this.j = j;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.mbridge.msdk.mbbid.common.middle.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.h = false;
            b.this.f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.d, b.this.b, bidResponsedEx.getBidId(), this.b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i, String str) {
            b.this.h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.d, b.this.b, str, this.b);
            b.this.a(str);
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(long j) {
        this.i = j;
    }

    public void a(BidListennning bidListennning) {
        this.e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
