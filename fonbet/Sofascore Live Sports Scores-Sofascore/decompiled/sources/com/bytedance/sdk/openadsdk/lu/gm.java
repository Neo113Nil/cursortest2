package com.bytedance.sdk.openadsdk.lu;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.sdk.component.kj.pcc.wh;
import com.bytedance.sdk.component.utils.kj;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.ironsource.mediationsdk.metadata.a;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static volatile HandlerThread gm = kj.pcc("pag__bus_monitor", 0);
    private static volatile wh oo;
    private static volatile pcc pcc;
    private static Boolean sf;

    public static void gm(oo ooVar) {
        pcc().pcc(new vj(ooVar, 0, 0, 1));
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                try {
                    if (pcc == null) {
                        pcc = pcc.pcc(new sf() { // from class: com.bytedance.sdk.openadsdk.lu.gm.1
                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public Context getContext() {
                                return lu.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public wh getHandler() {
                                return gm.vj();
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public int getOnceLogCount() {
                                int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("bus_monitor_config", "once_count", 10);
                                if (pcc2 > 100 || pcc2 < 5) {
                                    return 10;
                                }
                                return pcc2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public int getOnceLogInterval() {
                                int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("bus_monitor_config", "once_interval", 10000);
                                if (pcc2 < 10000) {
                                    return 10000;
                                }
                                return pcc2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public HandlerThread getSafeHandlerThread(String str, int i) {
                                return kj.pcc(str, i);
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public int getUploadIntervalTime() {
                                int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("bus_monitor_config", "interval", 86400000);
                                if (pcc2 < 3600000) {
                                    return 86400000;
                                }
                                return pcc2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public boolean isMonitorOpen() {
                                if (gm.sf != null) {
                                    return gm.sf.booleanValue();
                                }
                                Boolean unused = gm.sf = Boolean.valueOf(com.bytedance.sdk.openadsdk.yt.vj.pcc("bus_monitor_config", a.k, 1) == 1);
                                return gm.sf.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.lu.sf
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.lu.sf.pcc> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar : list) {
                                    com.bytedance.sdk.openadsdk.dax.oo.pcc("bus_monitor", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.lu.gm.1.1
                                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", pccVar.sf());
                                                jSONObject.put("scene", pccVar.gm());
                                                jSONObject.put("start_count", pccVar.oo());
                                                jSONObject.put("success_count", pccVar.vj());
                                                jSONObject.put("fail_count", pccVar.wh());
                                                jSONObject.put("rit", pccVar.qf());
                                                jSONObject.put("tag", pccVar.kj());
                                                jSONObject.put("label", pccVar.vy());
                                                jSONObject.put("mediation", pccVar.vh());
                                                jSONObject.put("is_init", pccVar.tmg());
                                                jSONObject.put("extra", pccVar.hc());
                                                jSONObject.put("date_device", pccVar.ork());
                                                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("bus_monitor").sf(jSONObject.toString());
                                            } catch (Exception e) {
                                                lo.pcc("BusMonitorUtils", "onMonitorUpload: ", e);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public static void sf(oo ooVar) {
        pcc().pcc(new vj(ooVar, 0, 1, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wh vj() {
        if (gm == null || !gm.isAlive()) {
            synchronized (jr.class) {
                try {
                    if (gm != null) {
                        if (!gm.isAlive()) {
                        }
                    }
                    HandlerThread pcc2 = kj.pcc("pag_init_handle", -1);
                    gm = pcc2;
                    oo = pcc(pcc2.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (oo == null) {
            synchronized (jr.class) {
                try {
                    if (oo == null) {
                        oo = pcc(gm.getLooper());
                    }
                } finally {
                }
            }
        }
        return oo;
    }

    public static void sf() {
        pcc().pcc(true);
    }

    public static void pcc(oo ooVar) {
        pcc().pcc(new vj(ooVar, 1, 0, 0));
    }

    private static wh pcc(Looper looper) {
        return new wh(new Handler(looper)) { // from class: com.bytedance.sdk.openadsdk.lu.gm.2
            @Override // com.bytedance.sdk.component.kj.pcc.wh
            public boolean pcc() {
                return com.bytedance.sdk.openadsdk.yt.vj.pcc("bus_handler_run_dispatch", 0) == 1;
            }
        };
    }
}
