package com.vk.core.compose.component.group.header;

import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.eku;
import xsna.jgz;
import xsna.nou0;
import xsna.q630;
import xsna.wh50;
import xsna.zak0;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class d {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    /* compiled from: GroupHeader.kt */
    public static final class a {
        public static d a(int i, CounterAppearance counterAppearance, CounterMode counterMode, CounterSize counterSize, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i2, int i3) {
            int i4;
            if ((i3 & 2) != 0) {
                counterAppearance = null;
            }
            if ((i3 & 4) != 0) {
                counterMode = CounterMode.Primary;
            }
            CounterMode counterMode2 = counterMode;
            if ((i3 & 8) != 0) {
                counterSize = null;
            }
            com.vk.core.compose.component.semantics.a aVar3 = (i3 & 16) != 0 ? null : aVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1843129135, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Along.Counter.Companion.invoke (GroupHeader.kt:243)");
            }
            if (counterAppearance == null) {
                aVar2.K(-1720557884);
                jgz.s().getClass();
                aVar2.K(-1531619331);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1531619331, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeGroupHeaderDefaults.counterAppearance (MilkshakeGroupHeaderDefaults.kt:78)");
                }
                counterAppearance = CounterAppearance.Design.AccentRed;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
            } else {
                aVar2.K(-1720559000);
            }
            aVar2.j();
            CounterAppearance counterAppearance2 = counterAppearance;
            if (counterSize == null) {
                counterSize = CounterSize.Small;
            }
            CounterSize counterSize2 = counterSize;
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                i4 = i;
                d dVar = new d(i4, counterAppearance2, counterMode2, counterSize2, aVar3);
                aVar2.R(dVar);
                x = dVar;
            } else {
                i4 = i;
            }
            d dVar2 = (d) x;
            ((zak0) dVar2.a).setValue(Integer.valueOf(i4));
            ((zak0) dVar2.b).setValue(counterMode2);
            ((zak0) dVar2.d).setValue(counterAppearance2);
            ((zak0) dVar2.e).setValue(aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return dVar2;
        }
    }

    public d(int i, CounterAppearance counterAppearance, CounterMode counterMode, CounterSize counterSize, SemanticsConfiguration semanticsConfiguration) {
        this.a = k.b(Integer.valueOf(i));
        this.b = k.b(counterMode);
        this.c = k.b(counterSize);
        this.d = k.b(counterAppearance);
        this.e = k.b(semanticsConfiguration);
    }

    public final void a(q630 q630Var, f.b bVar, b bVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1218946944);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(bVar) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (66577 & i2) != 66576)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1218946944, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Along.Counter.Content (GroupHeader.kt:223)");
            }
            M.K(bVar.equals(f.b.a.a) ? -299891001 : -1118051217);
            M.j();
            M.K(-299822139);
            nou0.a(((Number) ((zak0) this.a).getValue()).intValue(), (CounterSize) ((zak0) this.c).getValue(), (CounterAppearance) ((zak0) this.d).getValue(), com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue()), (CounterMode) ((zak0) this.b).getValue(), false, M, 0, 32);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new eku(this, q630Var, bVar, bVar2, i, 0);
        }
    }
}
