package com.vk.core.compose.component.cell.content;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.gv1;
import xsna.q630;
import xsna.spg0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: AlongPairImpl.kt */
/* loaded from: classes17.dex */
public final class a implements Cell$Middle.d.a {
    public final wh50 a;
    public final wh50 b;

    public a(x xVar, x xVar2) {
        this.a = androidx.compose.runtime.k.b(xVar);
        this.b = androidx.compose.runtime.k.b(xVar2);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell.Middle.d.a
    public final void c(spg0 spg0Var, q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1083192880);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(size.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1083192880, i2, -1, "com.vk.core.compose.component.cell.content.AlongPairImpl.Content (AlongPairImpl.kt:22)");
            }
            M.K(1566276195);
            Cell$Middle.d.a.InterfaceC0732a interfaceC0732a = (Cell$Middle.d.a.InterfaceC0732a) ((zak0) this.a).getValue();
            int i3 = i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
            interfaceC0732a.c(spg0Var, q630Var, size, M, i3);
            M.j();
            ((Cell$Middle.d.a.InterfaceC0732a) ((zak0) this.b).getValue()).c(spg0Var, q630Var, size, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gv1(this, spg0Var, q630Var, size, i);
        }
    }
}
