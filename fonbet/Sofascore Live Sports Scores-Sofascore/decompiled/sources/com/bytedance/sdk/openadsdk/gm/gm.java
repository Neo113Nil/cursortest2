package com.bytedance.sdk.openadsdk.gm;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ye;
import com.bytedance.sdk.openadsdk.gm.oo;
import com.bytedance.sdk.openadsdk.gm.tmg;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements ye {
    private oo gm;
    private boolean oo;
    public tmg pcc;
    private final Context sf;
    private ye.pcc vj;

    public gm(Context context, String str, List<FilterWord> list, of ofVar) {
        this.sf = context;
        pcc(str, list, ofVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        Context context = this.sf;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.pcc.isShowing()) {
            return;
        }
        this.pcc.show();
    }

    private void pcc(String str, List<FilterWord> list, of ofVar) {
        this.gm = new oo(this.sf, str, list);
        tmg tmgVar = new tmg(this.sf, this.gm.getDislikeManager());
        this.pcc = tmgVar;
        tmgVar.pcc(ofVar);
        this.pcc.pcc(new tmg.pcc() { // from class: com.bytedance.sdk.openadsdk.gm.gm.1
            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void gm() {
                gm.this.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void pcc(int i, FilterWord filterWord, String str2) {
                gm.this.gm.onSuggestionSubmit(str2);
                gm.this.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void sf() {
                gm.this.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void pcc() {
            }
        });
        this.gm.pcc(new oo.pcc() { // from class: com.bytedance.sdk.openadsdk.gm.gm.2
            @Override // com.bytedance.sdk.openadsdk.gm.oo.pcc
            public void pcc() {
                gm.this.pcc(true);
                if (gm.this.gm != null && gm.this.gm.isShowing()) {
                    gm.this.gm.hide();
                }
                gm.this.oo();
            }

            @Override // com.bytedance.sdk.openadsdk.gm.oo.pcc
            public void sf() {
                try {
                    if (gm.this.vj != null) {
                        gm.this.vj.pcc();
                    }
                } catch (Throwable th) {
                    lo.pcc("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.gm.oo.pcc
            public void pcc(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && gm.this.vj != null) {
                        gm.this.vj.pcc(i, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ye
    public void sf() {
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.destroy();
        }
    }

    public boolean gm() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ye
    public void pcc() {
        Context context = this.sf;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.gm.isShowing()) {
            return;
        }
        this.gm.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ye
    public void pcc(ye.pcc pccVar) {
        this.vj = pccVar;
    }

    public void pcc(boolean z) {
        this.oo = z;
    }
}
