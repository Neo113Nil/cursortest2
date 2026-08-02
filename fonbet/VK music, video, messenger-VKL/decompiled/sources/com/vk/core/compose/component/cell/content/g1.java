package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.Map;
import xsna.dud0;
import xsna.izs;
import xsna.jai;
import xsna.jgp;
import xsna.kai;
import xsna.ljo0;
import xsna.r0x;
import xsna.rgk;
import xsna.s3q0;
import xsna.us2;
import xsna.zak0;
import xsna.zzs;

/* compiled from: SexyMiddleTextImpl.kt */
/* loaded from: classes17.dex */
public final class g1 {
    public static final f1 a(us2 us2Var, Map<String, r0x> map, a1.f.a aVar, a1.g.a aVar2, a1.f.a aVar3, a1.g.a aVar4, SemanticsConfiguration semanticsConfiguration, TextType textType, int i, int i2, izs<? super ljo0, s3q0> izsVar, androidx.compose.runtime.a aVar5, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            map = jgp.b;
        }
        Map<String, r0x> map2 = map;
        a1.f.a aVar6 = (i5 & 4) != 0 ? null : aVar;
        a1.g.a aVar7 = (i5 & 8) != 0 ? null : aVar2;
        a1.f.a aVar8 = (i5 & 16) != 0 ? null : aVar3;
        a1.g.a aVar9 = (i5 & 32) != 0 ? null : aVar4;
        izs<? super ljo0, s3q0> izsVar2 = (i5 & 1024) != 0 ? null : izsVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1157542295, i3, i4, "com.vk.core.compose.component.cell.content.rememberInternal (SexyMiddleTextImpl.kt:238)");
        }
        Object x = aVar5.x();
        if (x == a.C0011a.a) {
            f1 f1Var = new f1(us2Var, map2, aVar7, aVar9, aVar6, aVar8, semanticsConfiguration, textType, i, i2, izsVar2);
            aVar5.R(f1Var);
            x = f1Var;
        }
        f1 f1Var2 = (f1) x;
        ((zak0) f1Var2.g).setValue(us2Var);
        ((zak0) f1Var2.h).setValue(aVar7);
        ((zak0) f1Var2.i).setValue(aVar9);
        ((zak0) f1Var2.j).setValue(aVar6);
        ((zak0) f1Var2.k).setValue(aVar8);
        ((zak0) f1Var2.l).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f1Var2;
    }

    public static final d0 b(RichCell$Middle.c.a aVar, androidx.compose.runtime.a aVar2, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-393430782, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellAlong (SexyMiddleTextImpl.kt:271)");
        }
        jai c = kai.c(-1072589940, new rgk(aVar, 1), aVar2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1509771860, 54, -1, "com.vk.core.compose.component.cell.content.InternalAlongSlot.Companion.invoke (InternalSlots.kt:51)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new d0(c);
            aVar2.R(x);
        }
        d0 d0Var = (d0) x;
        ((zak0) d0Var.c).setValue(c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d0Var;
    }

    public static final d0 c(RichCell$Middle.g.a aVar, androidx.compose.runtime.a aVar2, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-393430782, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellAlong (SexyMiddleTextImpl.kt:267)");
        }
        jai c = kai.c(-1072589940, new dud0(aVar, 1), aVar2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1509771860, 54, -1, "com.vk.core.compose.component.cell.content.InternalAlongSlot.Companion.invoke (InternalSlots.kt:51)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new d0(c);
            aVar2.R(x);
        }
        d0 d0Var = (d0) x;
        ((zak0) d0Var.c).setValue(c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d0Var;
    }

    public static final d0 d(final RichCell$Middle.h.a aVar, androidx.compose.runtime.a aVar2, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-393430782, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellAlong (SexyMiddleTextImpl.kt:263)");
        }
        jai c = kai.c(-1072589940, new zzs() { // from class: xsna.k4j0
            @Override // xsna.zzs
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i2;
                spg0 spg0Var = (spg0) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i2 = (aVar3.J(spg0Var) ? 4 : 2) | intValue;
                } else {
                    i2 = intValue;
                }
                if ((intValue & 48) == 0) {
                    i2 |= aVar3.J(q630Var) ? 32 : 16;
                }
                if (aVar3.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1072589940, i2, -1, "com.vk.core.compose.component.cell.content.toSexyCellAlong.<anonymous> (SexyMiddleTextImpl.kt:263)");
                    }
                    RichCell$Middle.h.a.this.b(spg0Var, q630Var, RichCell$Middle.Size.Medium, aVar3, (i2 & 14) | 384 | (i2 & 112));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            }
        }, aVar2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1509771860, 54, -1, "com.vk.core.compose.component.cell.content.InternalAlongSlot.Companion.invoke (InternalSlots.kt:51)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new d0(c);
            aVar2.R(x);
        }
        d0 d0Var = (d0) x;
        ((zak0) d0Var.c).setValue(c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d0Var;
    }
}
