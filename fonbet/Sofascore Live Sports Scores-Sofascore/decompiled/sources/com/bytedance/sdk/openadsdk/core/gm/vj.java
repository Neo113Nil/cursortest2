package com.bytedance.sdk.openadsdk.core.gm;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.of;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class vj extends pcc {
    public vj(@NonNull Context context, @NonNull of ofVar, @NonNull String str, int i) {
        super(context, ofVar, str, i);
    }

    public abstract void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, boolean z);

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        if (pcc(view, z)) {
            pcc(view, f, f2, f3, f4, sparseArray, this.mk, this.jsj, this.tsz, z);
        }
        super.pcc(view, f, f2, f3, f4, sparseArray, z);
    }
}
