package com.mbridge.msdk.reward.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RewardVideoControllerHandler.java */
/* loaded from: classes14.dex */
public class b extends Handler {
    private final a a;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.a = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        com.mbridge.msdk.foundation.same.report.metrics.c a = this.a.a(message);
        CopyOnWriteArrayList<CampaignEx> i2 = this.a.i();
        List<CampaignEx> h = this.a.h();
        com.mbridge.msdk.reward.adapter.c n = this.a.n();
        boolean s = this.a.s();
        String l = this.a.l();
        String p = this.a.p();
        a.h k = this.a.k();
        InterVideoOutListener o = this.a.o();
        boolean r = this.a.r();
        MBridgeIds g = this.a.g();
        boolean t = this.a.t();
        switch (i) {
            case 8:
                if (i2 != null && i2.size() > 0) {
                    boolean z = (h == null || h.size() <= 0) ? false : !TextUtils.isEmpty(h.get(0).getCMPTEntryUrl());
                    int nscpt = i2.get(0).getNscpt();
                    if (n != null && n.a(i2, z, nscpt)) {
                        if (k != null && s) {
                            k.c(l, p, a);
                            break;
                        }
                    } else if (k != null && s) {
                        com.mbridge.msdk.videocommon.a.a(p);
                        com.mbridge.msdk.videocommon.a.a();
                        com.mbridge.msdk.foundation.error.b a2 = com.mbridge.msdk.foundation.error.a.a(880010, "load timeout");
                        if (a != null) {
                            a.a(a2);
                        }
                        k.a(a2, a);
                        break;
                    }
                }
                break;
            case 9:
                if (o != null && s) {
                    if (r) {
                        this.a.a();
                    }
                    o.onVideoLoadSuccess(g);
                    break;
                }
                break;
            case 16:
            case 18:
                if (o != null && s) {
                    String obj2 = obj instanceof String ? obj.toString() : "";
                    if (a != null && a.u() != null) {
                        obj2 = a.u().l();
                    }
                    com.mbridge.msdk.videocommon.a.a(p);
                    com.mbridge.msdk.videocommon.a.a();
                    if (r) {
                        this.a.a();
                    }
                    o.onVideoLoadFail(g, obj2);
                    break;
                }
                break;
            case 17:
                if (o != null && s) {
                    if (r) {
                        this.a.a();
                    }
                    o.onLoadSuccess(g);
                    break;
                }
                break;
            case 1001001:
                this.a.a(false, d.b().a(0, t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, p, true, 1));
                break;
            case 1001002:
                if (n != null) {
                    if (!n.l()) {
                        if (!n.g(false)) {
                            if (n.g(true)) {
                                if (!n.l()) {
                                    n.h(true);
                                    break;
                                } else if (k != null) {
                                    n.f(true);
                                    CopyOnWriteArrayList<CampaignEx> h2 = n.h();
                                    if (h2 != null && h2.size() == 0) {
                                        h2 = n.f();
                                    }
                                    this.a.a(h2);
                                    com.mbridge.msdk.foundation.same.report.metrics.c a3 = this.a.a(h2, a);
                                    if (a3 != null) {
                                        a3.b(h2);
                                    }
                                    k.d(l, p, a3);
                                    break;
                                }
                            }
                        } else if (!n.l()) {
                            n.h(false);
                            if (n.g(true)) {
                                if (!n.l()) {
                                    n.h(true);
                                    break;
                                } else if (k != null) {
                                    n.f(true);
                                    CopyOnWriteArrayList<CampaignEx> h3 = n.h();
                                    if (h3 != null && h3.size() == 0) {
                                        h3 = n.f();
                                    }
                                    this.a.a(h3);
                                    com.mbridge.msdk.foundation.same.report.metrics.c a4 = this.a.a(h3, a);
                                    if (a4 != null) {
                                        a4.b(h3);
                                    }
                                    k.d(l, p, a4);
                                    break;
                                }
                            }
                        } else if (k != null) {
                            n.f(false);
                            CopyOnWriteArrayList<CampaignEx> h4 = n.h();
                            if (h4 != null && h4.size() == 0) {
                                h4 = n.f();
                            }
                            this.a.a(h4);
                            com.mbridge.msdk.foundation.same.report.metrics.c a5 = this.a.a(h4, a);
                            if (a5 != null) {
                                a5.b(h4);
                            }
                            k.d(l, p, a5);
                            break;
                        }
                    } else if (k != null) {
                        CopyOnWriteArrayList<CampaignEx> h5 = n.h();
                        if (h5 != null && h5.size() == 0) {
                            h5 = n.f();
                        }
                        this.a.a(h5);
                        com.mbridge.msdk.foundation.same.report.metrics.c a6 = this.a.a(h5, a);
                        if (a6 != null) {
                            a6.b(h5);
                        }
                        k.d(l, p, a6);
                        break;
                    }
                }
                break;
        }
    }
}
