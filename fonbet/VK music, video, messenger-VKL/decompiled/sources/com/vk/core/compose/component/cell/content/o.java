package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import xsna.gzs;
import xsna.l5g;
import xsna.q630;
import xsna.rrv0;
import xsna.spg0;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public interface o {

    /* compiled from: Cell.kt */
    public interface a extends o {
    }

    /* compiled from: Cell.kt */
    public interface b extends o {

        /* compiled from: Cell.kt */
        public static final class a {
            public static u0 a(gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, long j, boolean z, androidx.compose.runtime.a aVar2, int i, int i2) {
                gzs gzsVar2 = (i2 & 1) != 0 ? null : gzsVar;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 4) != 0 ? null : aVar;
                if ((i2 & 8) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().l;
                }
                long j2 = j;
                if ((i2 & 16) != 0) {
                    z = true;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(262589058, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Chevron.Companion.invoke (Cell.kt:775)");
                }
                int i3 = i << 3;
                int i4 = ((i >> 15) & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1995037811, i4, -1, "com.vk.core.compose.component.cell.content.remember (RightChevronImpl.kt:86)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    u0 u0Var = new u0(j2, aVar3, null, gzsVar2);
                    aVar2.R(u0Var);
                    x = u0Var;
                }
                u0 u0Var2 = (u0) x;
                ((zak0) u0Var2.a).setValue(null);
                ((zak0) u0Var2.b).setValue(gzsVar2);
                ((zak0) u0Var2.c).setValue(aVar3);
                ((zak0) u0Var2.d).setValue(new l5g(j2));
                ((zak0) u0Var2.e).setValue(Boolean.valueOf(z));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return u0Var2;
            }
        }
    }

    /* compiled from: Cell.kt */
    public static final class c {
        public static y0 a(a aVar, d dVar, e eVar, u0 u0Var, z0 z0Var, androidx.compose.runtime.a aVar2, int i) {
            a aVar3 = (i & 1) != 0 ? null : aVar;
            d dVar2 = (i & 2) != 0 ? null : dVar;
            e eVar2 = (i & 4) != 0 ? null : eVar;
            u0 u0Var2 = (i & 8) != 0 ? null : u0Var;
            z0 z0Var2 = (i & 16) != 0 ? null : z0Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(246789304, 1572864, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Companion.invoke (Cell.kt:531)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1243435129, 6, -1, "com.vk.core.compose.component.cell.content.remember (RightImpl.kt:67)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                y0 y0Var = new y0(aVar3, dVar2, eVar2, u0Var2, z0Var2);
                aVar2.R(y0Var);
                x = y0Var;
            }
            y0 y0Var2 = (y0) x;
            ((zak0) y0Var2.a).setValue(aVar3);
            ((zak0) y0Var2.b).setValue(dVar2);
            ((zak0) y0Var2.c).setValue(eVar2);
            ((zak0) y0Var2.d).setValue(u0Var2);
            ((zak0) y0Var2.e).setValue(z0Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return y0Var2;
        }
    }

    /* compiled from: Cell.kt */
    public interface d extends o {
    }

    /* compiled from: Cell.kt */
    public interface e extends o {

        /* compiled from: Cell.kt */
        public interface a extends e {

            /* compiled from: Cell.kt */
            /* renamed from: com.vk.core.compose.component.cell.content.o$e$a$a, reason: collision with other inner class name */
            public static final class C0736a {
                public static b0 a(boolean z, gzs gzsVar, boolean z2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                    if ((i2 & 2) != 0) {
                        gzsVar = null;
                    }
                    if ((i2 & 4) != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        aVar = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(341927648, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.ExtraAction.Check.Companion.invoke (Cell.kt:691)");
                    }
                    int i3 = (i >> 12) & 14;
                    int i4 = i << 3;
                    int i5 = (i4 & 57344) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-728098465, i5, -1, "com.vk.core.compose.component.cell.content.remember (ExtraCheckImpl.kt:61)");
                    }
                    b0 a = c0.a(z, gzsVar, z2, aVar, aVar2, (i5 >> 3) & 8190);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return a;
                }
            }
        }
    }

    /* compiled from: Cell.kt */
    public interface f extends o {

        /* compiled from: Cell.kt */
        public static final class a {
            public static z0 a(String str, androidx.compose.runtime.a aVar, int i) {
                if ((i & 4) != 0) {
                    str = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-396950686, 3072, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Reorder.Companion.invoke (Cell.kt:762)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-373125691, 6, -1, "com.vk.core.compose.component.cell.content.remember (RightReorderImpl.kt:46)");
                }
                Object x = aVar.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                q630.a aVar2 = q630.a.a;
                if (x == c0012a) {
                    x = new z0(aVar2, str);
                    aVar.R(x);
                }
                z0 z0Var = (z0) x;
                ((zak0) z0Var.b).setValue(aVar2);
                ((zak0) z0Var.a).setValue(null);
                ((zak0) z0Var.c).setValue(str);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return z0Var;
            }
        }
    }

    void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
