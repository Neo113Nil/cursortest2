package com.vk.core.tips;

import androidx.appcompat.app.d;
import com.vk.core.tips.Tooltip;

/* compiled from: Tooltip.kt */
/* loaded from: classes17.dex */
public final class a implements Tooltip.b {
    public final /* synthetic */ d b;
    public final /* synthetic */ Tooltip c;

    public a(d dVar, Tooltip tooltip) {
        this.b = dVar;
        this.c = tooltip;
    }

    @Override // com.vk.core.tips.Tooltip.b
    public final void b(boolean z) {
        this.b.dismiss();
        this.c.l = 4;
    }

    @Override // xsna.dcn
    public final void dismiss() {
        b(false);
    }
}
