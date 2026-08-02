package com.vk.core.ui.bottomsheet.internal;

import com.vk.core.ui.bottomsheet.internal.b;
import xsna.iah0;

/* compiled from: LegoActionListSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class c extends b {
    public final float a;
    public int b;
    public int c;

    public c(float f) {
        this.a = f;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        int a = this.c - ((iah0.a(16) + ((int) (this.a * this.c))) + this.b);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return iah0.a(16) + ((int) (this.a * i2)) + this.b;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final void e(int i, int i2, int i3, int i4, b.a aVar) {
        this.c = i3;
        super.e(i, i2, i3, i4, aVar);
    }
}
