package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.a1;
import com.vungle.ads.internal.protos.Sdk;
import xsna.jai;
import xsna.kai;
import xsna.zak0;
import xsna.zzs;

/* compiled from: SexyMiddleImpl.kt */
/* loaded from: classes17.dex */
public final class c1 {
    public static final b1 a(a1.g gVar, a1.f fVar, a1.f fVar2, a1.f fVar3, a1.e eVar, a1.a aVar, a1.a aVar2, e0 e0Var, a1.d dVar, a1.c cVar, androidx.compose.runtime.a aVar3, int i, int i2, int i3) {
        a1.c cVar2 = (i3 & 512) != 0 ? null : cVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1809661555, i, i2, "com.vk.core.compose.component.cell.content.rememberInternal (SexyMiddleImpl.kt:219)");
        }
        Object x = aVar3.x();
        if (x == a.C0011a.a) {
            b1 b1Var = new b1(fVar3, gVar, fVar, fVar2, eVar, aVar, aVar2, e0Var, dVar, cVar2);
            aVar3.R(b1Var);
            x = b1Var;
        }
        b1 b1Var2 = (b1) x;
        ((zak0) b1Var2.c).setValue(gVar);
        ((zak0) b1Var2.d).setValue(fVar);
        ((zak0) b1Var2.e).setValue(fVar2);
        ((zak0) b1Var2.b).setValue(fVar3);
        ((zak0) b1Var2.f).setValue(eVar);
        ((zak0) b1Var2.g).setValue(aVar);
        ((zak0) b1Var2.h).setValue(aVar2);
        ((zak0) b1Var2.i).setValue(e0Var);
        ((zak0) b1Var2.j).setValue(dVar);
        ((zak0) b1Var2.k).setValue(cVar2);
        ((zak0) b1Var2.l).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b1Var2;
    }

    public static final e0 b(final RichCell$Middle.a aVar, androidx.compose.runtime.a aVar2, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1595597931, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellButton (SexyMiddleImpl.kt:200)");
        }
        jai c = kai.c(-1432519777, new zzs() { // from class: xsna.j4j0
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
                        androidx.compose.runtime.b.f(-1432519777, i2, -1, "com.vk.core.compose.component.cell.content.toSexyCellButton.<anonymous> (SexyMiddleImpl.kt:200)");
                    }
                    RichCell$Middle.a.this.a(spg0Var, q630Var, aVar3, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
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
            androidx.compose.runtime.b.f(-156301732, 54, -1, "com.vk.core.compose.component.cell.content.InternalMiddleRowSlot.Companion.invoke (InternalSlots.kt:29)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new e0(c);
            aVar2.R(x);
        }
        e0 e0Var = (e0) x;
        ((zak0) e0Var.b).setValue(c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return e0Var;
    }
}
