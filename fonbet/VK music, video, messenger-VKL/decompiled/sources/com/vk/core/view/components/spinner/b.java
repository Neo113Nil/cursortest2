package com.vk.core.view.components.spinner;

import com.vk.core.view.components.spinner.VkSpinnerContent;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: VkScreenSpinnerDialog.kt */
/* loaded from: classes17.dex */
public final class b implements VkSpinnerContent.b {
    public final /* synthetic */ gzs<s3q0> a;
    public final /* synthetic */ c b;

    public b(gzs<s3q0> gzsVar, c cVar) {
        this.a = gzsVar;
        this.b = cVar;
    }

    @Override // com.vk.core.view.components.spinner.VkSpinnerContent.b
    public final void onCancel() {
        this.a.invoke();
        this.b.cancel();
    }
}
