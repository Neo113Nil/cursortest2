package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.ork.fum;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.ork.pcc {
    private fum pcc;

    public pcc(@NonNull Context context) {
        super(context);
    }

    public void pcc(fum fumVar) {
        this.pcc = fumVar;
        fumVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    public void pcc(View view, int i, dax daxVar) {
        fum fumVar = this.pcc;
        if (fumVar != null) {
            fumVar.pcc(view, i, daxVar);
        }
    }
}
