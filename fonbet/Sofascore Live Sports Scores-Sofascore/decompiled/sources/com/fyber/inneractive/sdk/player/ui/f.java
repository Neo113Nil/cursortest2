package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.m1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i, int i2, h1 h1Var, int i3, ViewGroup viewGroup) {
        h1 h1Var2 = new h1(0, 0);
        if (unitDisplayType != UnitDisplayType.SQUARE) {
            m1.a(unitDisplayType, h1Var2, i, i2, h1Var.a, h1Var.b);
            return h1Var2;
        }
        int min = Math.min(h1Var.a, i3);
        if (viewGroup != null) {
            viewGroup.getLayoutParams().width = min;
            viewGroup.getLayoutParams().height = min;
        }
        m1.a(unitDisplayType, h1Var2, i, i2, min, min);
        return h1Var2;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, h1 h1Var, int i3, int i4, int i5, int i6) {
        h1 h1Var2;
        if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            h1Var2 = h1Var;
            m1.a(unitDisplayType, h1Var2, i, i2, i3, i4);
        } else {
            h1Var2 = h1Var;
        }
        h1Var2.a = 0;
        h1Var2.b = 0;
        return h1Var2;
    }
}
