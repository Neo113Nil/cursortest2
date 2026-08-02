package com.vk.core.tips;

import com.vk.core.tips.Tooltip;
import xsna.p4p0;
import xsna.r4p0;

/* compiled from: Tooltip.kt */
/* loaded from: classes17.dex */
public final class b implements Tooltip.b {
    public final /* synthetic */ r4p0 b;
    public final /* synthetic */ p4p0 c;

    public b(r4p0 r4p0Var, p4p0 p4p0Var) {
        this.b = r4p0Var;
        this.c = p4p0Var;
    }

    @Override // com.vk.core.tips.Tooltip.b
    public final void b(boolean z) {
        if (z) {
            this.b.invoke(4);
        } else {
            this.c.invoke(4);
        }
    }

    @Override // xsna.dcn
    public final void dismiss() {
        b(false);
    }
}
