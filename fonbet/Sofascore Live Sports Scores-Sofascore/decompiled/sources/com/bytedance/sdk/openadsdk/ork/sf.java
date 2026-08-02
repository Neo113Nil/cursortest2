package com.bytedance.sdk.openadsdk.ork;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.wv8;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf<T> implements dax<T> {
    private final dax<T> gm;
    private final of oo;
    private final long pcc = SystemClock.elapsedRealtime();
    private final String sf;

    public sf(final of ofVar, String str, dax<T> daxVar) {
        this.gm = daxVar;
        this.oo = ofVar;
        this.sf = str;
        com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.ork.sf.1
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("load_img");
                of ofVar2 = ofVar;
                if (ofVar2 != null) {
                    e.gm(ofVar2.lq(Y1.f));
                    e.oo(kun.gm(ofVar.tqg()));
                }
                return e;
            }
        });
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(final int i, final String str, @Nullable final Throwable th) {
        sf<T> sfVar;
        dax<T> daxVar = this.gm;
        if (daxVar != null) {
            daxVar.pcc(i, str, th);
        }
        of ofVar = this.oo;
        if (ofVar != null) {
            if (TextUtils.isEmpty(kun.pcc(ofVar))) {
                sfVar = this;
            } else {
                final long elapsedRealtime = SystemClock.elapsedRealtime() - this.pcc;
                sfVar = this;
                com.bytedance.sdk.openadsdk.dax.oo.pcc("load_image_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.ork.sf.4
                    @Override // com.bytedance.sdk.openadsdk.dax.sf
                    @Nullable
                    public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                        jSONObject.put("url", sf.this.sf);
                        jSONObject.put("error_code", i);
                        Throwable th2 = th;
                        if (th2 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th2);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", sf.this.oo.ct());
                        jSONObject.put("use_new_img", 1);
                        return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("load_image_error").pcc(sf.this.oo.tqg()).sf(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.ork.sf.5
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("load_img");
                    if (sf.this.oo != null) {
                        e.gm(sf.this.oo.lq(Y1.f));
                        e.oo(kun.gm(sf.this.oo.tqg()));
                    }
                    return e;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(vh<T> vhVar) {
        dax<T> daxVar = this.gm;
        if (daxVar != null) {
            daxVar.pcc(vhVar);
        }
        if (this.oo != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.pcc;
            final int qf = vhVar.qf() / 1024;
            final int i = vhVar.wh() ? 1 : 0;
            com.bytedance.sdk.openadsdk.dax.oo.pcc("load_image_success", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.ork.sf.2
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                @Nullable
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                    jSONObject.put("url", sf.this.sf);
                    jSONObject.put("preload_size", qf);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", sf.this.oo.ct());
                    jSONObject.put("use_new_img", 1);
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("load_image_success").pcc(sf.this.oo.tqg()).sf(jSONObject.toString());
                }
            });
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.ork.sf.3
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("load_img");
                    if (sf.this.oo != null) {
                        e.gm(sf.this.oo.lq(Y1.f));
                        e.oo(kun.gm(sf.this.oo.tqg()));
                    }
                    return e;
                }
            });
        }
    }
}
