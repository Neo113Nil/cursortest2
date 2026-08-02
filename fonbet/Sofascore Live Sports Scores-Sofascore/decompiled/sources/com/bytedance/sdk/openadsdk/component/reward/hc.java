package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.zti;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.oea;
import defpackage.wv8;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc {
    protected final String gm;
    private final pcc kj;
    protected boolean oo;
    protected final Context pcc;
    protected boolean qf;
    protected final com.bytedance.sdk.openadsdk.core.model.pcc sf;
    protected final AtomicBoolean vj = new AtomicBoolean(false);
    protected boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        Intent pcc(Context context, of ofVar, @Nullable Activity activity);

        void pcc(Intent intent, @Nullable Activity activity, of ofVar, boolean z);

        void pcc(of ofVar);

        void pcc(boolean z);
    }

    public hc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, String str, pcc pccVar2) {
        this.pcc = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context;
        this.sf = pccVar;
        this.gm = str;
        this.oo = false;
        this.kj = pccVar2;
    }

    private void oo() {
        List<of> vj = this.sf.vj();
        if (vj != null) {
            Iterator<of> it = vj.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.sf(this.pcc, it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String pcc(Throwable th, Context context, Intent intent, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("async=");
            sb.append(z);
            sb.append(", newArch=");
            sb.append(z2);
            sb.append(", thread=");
            sb.append(Thread.currentThread().getName());
            sb.append(", context=");
            sb.append(context == null ? "null" : context.getClass().getName());
            sb.append(", intent=");
            sb.append(intent);
            if (th != null) {
                sb.append(", errorClass=");
                sb.append(th.getClass().getName());
                sb.append(", errorMsg=");
                sb.append(th.getMessage());
            } else {
                sb.append(", error=null");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(@Nullable Activity activity) {
        of qf;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = this.sf;
        if (pccVar == null || !pccVar.wh() || (qf = this.sf.qf()) == null) {
            return;
        }
        oo();
        if (!this.vj.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc(qf, "show_ad_fail", this.gm, "repeat_play");
            return;
        }
        if (qf.kez() == null && qf.by().isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.ork.pcc(qf, "show_start", this.gm, (String) null);
        Context context = activity == null ? this.pcc : activity;
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
        if (context == null) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc(qf, "show_ad_fail", this.gm, "context_is_null");
            return;
        }
        Intent pcc2 = this.kj.pcc(context, qf, activity);
        if (pcc2 == null) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc(qf, "show_ad_fail", this.gm, "intent_is_null");
            return;
        }
        pcc2.putExtra("start_show_time", SystemClock.elapsedRealtime());
        boolean ork = com.bytedance.sdk.openadsdk.yt.vj.ork();
        pcc2.putExtra("enable_new_arch", ork);
        this.kj.pcc(pcc2, activity, qf, ork);
        this.kj.pcc(ork);
        pcc(context, pcc2, qf, ork);
        this.kj.pcc(qf);
    }

    public boolean gm() {
        return this.oo;
    }

    public void pcc() {
        if (this.vj.get()) {
            return;
        }
        this.oo = true;
    }

    public Object pcc(String str) {
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = this.sf;
        if (pccVar == null || pccVar.qf() == null || this.sf.qf().oa() == null) {
            return null;
        }
        try {
            return this.sf.qf().oa().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm(this.gm, th.getMessage());
            return null;
        }
    }

    public void pcc(Double d) {
        if (this.wh) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = this.sf;
        if (pccVar != null && pccVar.qf() != null) {
            zti.pcc(this.sf.qf(), d);
        }
        this.wh = true;
    }

    public void pcc(Double d, String str, String str2) {
        if (this.qf) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = this.sf;
        if (pccVar != null && pccVar.qf() != null) {
            zti.pcc(this.sf.qf(), d, str, str2);
        }
        this.qf = true;
    }

    public void pcc(@Nullable final Activity activity) {
        if (!oea.s()) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hc.1
                @Override // java.lang.Runnable
                public void run() {
                    hc.this.sf(activity);
                }
            });
        } else {
            sf(activity);
        }
    }

    private void pcc(final Context context, final Intent intent, final of ofVar, final boolean z) {
        final boolean z2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("start_activity_async", 0) == 1;
        if (z2) {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.hc.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("start_activity");
                    e.oo(hc.this.gm);
                    return e;
                }
            });
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.sf.pcc(context, intent, new sf.InterfaceC0055sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.hc.3
            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
            public void pcc(Throwable th) {
                JSONObject jSONObject;
                String pcc2 = hc.this.pcc(th, context, intent, z2, z);
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_msg_detail", pcc2);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    jSONObject = null;
                }
                com.bytedance.sdk.openadsdk.oo.ork.pcc(ofVar, "show_ad_fail", hc.this.gm, "activity_start_fail", jSONObject);
                if (z2) {
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.hc.3.1
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("start_activity");
                            e.oo(hc.this.gm);
                            return e;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
            public void pcc() {
                if (z2) {
                    hc.this.pcc(elapsedRealtime);
                }
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(long j) {
        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.hc.4
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("start_activity");
                e.oo(hc.this.gm);
                return e;
            }
        });
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        com.bytedance.sdk.openadsdk.dax.oo.pcc("start_activity_action", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.hc.5
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("start_activity_action").sf(jSONObject.toString());
            }
        });
    }

    public Map<String, Object> sf() {
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = this.sf;
        if (pccVar == null || pccVar.qf() == null) {
            return null;
        }
        return this.sf.qf().oa();
    }
}
