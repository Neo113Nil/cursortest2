package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.m1;

/* loaded from: classes12.dex */
public final class h implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, h1 h1Var, int i3, int i4, int i5, int i6) {
        if (h1Var == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(i3, i5) - com.fyber.inneractive.sdk.util.o.b(i6 * 2);
            h1Var.a = min;
            h1Var.b = min;
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int min2 = Math.min(i3, i5) - com.fyber.inneractive.sdk.util.o.b(i6 * 2);
            h1Var.a = min2;
            h1Var.b = (min2 * 9) / 16;
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.MRECT) {
            h1Var.a = com.fyber.inneractive.sdk.util.o.b(300);
            h1Var.b = com.fyber.inneractive.sdk.util.o.b(250);
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            m1.a(unitDisplayType, h1Var, i, i2, i3, i4);
            return h1Var;
        }
        h1Var.a = 0;
        h1Var.b = 0;
        return h1Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i, int i2, h1 h1Var, int i3, ViewGroup viewGroup) {
        h1 h1Var2 = new h1(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int i4 = h1Var.a;
            m1.a(unitDisplayType, h1Var2, i, i2, i4, i4);
            return h1Var2;
        }
        m1.a(unitDisplayType, h1Var2, i, i2, h1Var.a, h1Var.b);
        return h1Var2;
    }
}
