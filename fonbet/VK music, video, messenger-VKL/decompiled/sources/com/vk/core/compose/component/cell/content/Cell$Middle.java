package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.Map;
import xsna.asp;
import xsna.d40;
import xsna.izs;
import xsna.jgp;
import xsna.l5g;
import xsna.lg90;
import xsna.ozl;
import xsna.q630;
import xsna.spg0;
import xsna.us2;
import xsna.ws2;
import xsna.zak0;
import xsna.zrp;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public interface Cell$Middle {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Cell.kt */
    @ozl
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;

        static {
            Size size = new Size("Medium", 0);
            Medium = size;
            Size size2 = new Size("Large", 1);
            Large = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: Cell.kt */
    public static final class a {
        public static k0 a(d dVar, c cVar, b bVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            if ((i2 & 1) != 0) {
                dVar = null;
            }
            if ((i2 & 2) != 0) {
                cVar = null;
            }
            if ((i2 & 4) != 0) {
                bVar = null;
            }
            if ((i2 & 8) != 0) {
                Size size = Size.Medium;
            }
            if ((i2 & 16) != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(952192263, i, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.Companion.invoke (Cell.kt:512)");
            }
            int i3 = (i >> 15) & 14;
            int i4 = i << 3;
            int i5 = (i4 & 458752) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1672939542, i5, -1, "com.vk.core.compose.component.cell.content.remember (MiddleImpl.kt:60)");
            }
            aVar2.K(-258023330);
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new k0(dVar, cVar, 28);
                aVar2.R(x);
            }
            k0 k0Var = (k0) x;
            ((zak0) k0Var.a).setValue(dVar);
            ((zak0) k0Var.b).setValue(cVar);
            ((zak0) k0Var.c).setValue(bVar);
            ((zak0) k0Var.e).setValue(aVar);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return k0Var;
        }
    }

    /* compiled from: Cell.kt */
    public interface b {

        /* compiled from: Cell.kt */
        public static final class a {
            public static h1 a(String str, int i, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i2, int i3) {
                if ((i3 & 2) != 0) {
                    i = Integer.MAX_VALUE;
                }
                int i4 = i;
                int i5 = (i3 & 4) != 0 ? 1 : 2;
                if ((i3 & 8) != 0) {
                    aVar = null;
                }
                com.vk.core.compose.component.semantics.a aVar3 = aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1301928526, i2, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.ExtraSubtitle.Companion.invoke (Cell.kt:490)");
                }
                us2 b = ws2.b(str, aVar2, i2 & 14);
                int i6 = i2 << 3;
                h1 b2 = b(b, i4, i5, aVar3, aVar2, (i6 & 7168) | (i6 & 896) | 48 | 196608, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b2;
            }

            public static h1 b(us2 us2Var, int i, int i2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i3, int i4) {
                int i5 = (i4 & 8) != 0 ? 1 : i2;
                SemanticsConfiguration semanticsConfiguration2 = (i4 & 16) != 0 ? null : semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1433701458, i3, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.ExtraSubtitle.Companion.invoke (Cell.kt:499)");
                }
                int i6 = i3 << 3;
                int i7 = (i6 & 458752) | ((i3 >> 15) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-78866603, i7, -1, "com.vk.core.compose.component.cell.content.remember (TextImpl.kt:137)");
                }
                aVar.K(-167203533);
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    h1 h1Var = new h1(us2Var, jgp.b, null, null, null, null, semanticsConfiguration2, CellTextType.ExtraSubtitle, i, i5, null, null, null, 6204);
                    aVar.R(h1Var);
                    x = h1Var;
                }
                h1 h1Var2 = (h1) x;
                ((zak0) h1Var2.g).setValue(us2Var);
                ((zak0) h1Var2.l).setValue(semanticsConfiguration2);
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return h1Var2;
            }
        }

        void c(q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: Cell.kt */
    public interface c {

        /* compiled from: Cell.kt */
        public interface a {
            void c(spg0 spg0Var, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: Cell.kt */
        public static final class b {
            public static h1 a(us2 us2Var, Map map, int i, int i2, a aVar, a aVar2, SemanticsConfiguration semanticsConfiguration, izs izsVar, androidx.compose.runtime.a aVar3, int i3, int i4) {
                Map map2 = (i4 & 2) != 0 ? jgp.b : map;
                int i5 = (i4 & 4) != 0 ? Integer.MAX_VALUE : i;
                int i6 = (i4 & 8) != 0 ? 1 : i2;
                a aVar4 = (i4 & 16) != 0 ? null : aVar;
                a aVar5 = (i4 & 32) != 0 ? null : aVar2;
                SemanticsConfiguration semanticsConfiguration2 = (i4 & 64) != 0 ? null : semanticsConfiguration;
                Object x = aVar3.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new d40(6);
                    aVar3.R(x);
                }
                izs izsVar2 = (i4 & 256) != 0 ? null : izsVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(565914546, i3, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.Subtitle.Companion.invoke (Cell.kt:464)");
                }
                int i7 = i3 << 3;
                int i8 = (i7 & 1879048192) | ((i3 >> 27) & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1291919990, i8, -1, "com.vk.core.compose.component.cell.content.remember (TextImpl.kt:95)");
                }
                aVar3.K(387401941);
                Object x2 = aVar3.x();
                if (x2 == c0012a) {
                    h1 h1Var = new h1(us2Var, map2, aVar4, null, aVar5, null, semanticsConfiguration2, CellTextType.Subtitle, i5, i6, null, null, izsVar2, 2088);
                    aVar3.R(h1Var);
                    x2 = h1Var;
                }
                h1 h1Var2 = (h1) x2;
                ((zak0) h1Var2.g).setValue(us2Var);
                ((zak0) h1Var2.h).setValue(aVar4);
                ((zak0) h1Var2.j).setValue(aVar5);
                ((zak0) h1Var2.l).setValue(semanticsConfiguration2);
                aVar3.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return h1Var2;
            }

            public static h1 b(String str, int i, x xVar, x xVar2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i2, int i3) {
                if ((i3 & 2) != 0) {
                    i = Integer.MAX_VALUE;
                }
                int i4 = i;
                int i5 = (i3 & 4) != 0 ? 1 : 2;
                x xVar3 = (i3 & 8) != 0 ? null : xVar;
                x xVar4 = (i3 & 16) != 0 ? null : xVar2;
                com.vk.core.compose.component.semantics.a aVar3 = (i3 & 32) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(181123937, i2, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.Subtitle.Companion.invoke (Cell.kt:451)");
                }
                int i6 = i2 << 3;
                h1 a = a(ws2.b(str, aVar2, i2 & 14), jgp.b, i4, i5, xVar3, xVar4, aVar3, null, aVar2, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i2 << 6) & 1879048192), 384);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        void c(q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: Cell.kt */
    public interface d {

        /* compiled from: Cell.kt */
        public interface a {

            /* compiled from: Cell.kt */
            /* renamed from: com.vk.core.compose.component.cell.content.Cell$Middle$d$a$a, reason: collision with other inner class name */
            public interface InterfaceC0732a extends a {

                /* compiled from: Cell.kt */
                /* renamed from: com.vk.core.compose.component.cell.content.Cell$Middle$d$a$a$a, reason: collision with other inner class name */
                public static final class C0733a {
                    public static x a(lg90 lg90Var, long j, String str, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                        long j2 = (i2 & 2) != 0 ? l5g.k : j;
                        String str2 = (i2 & 4) != 0 ? null : str;
                        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 8) != 0 ? null : aVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-821581205, i, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.Title.Along.Icon.Companion.invoke (Cell.kt:387)");
                        }
                        int i3 = ((i << 3) & 896) | 70;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(986972119, i3, -1, "com.vk.core.compose.component.cell.content.remember (CommonIconImpl.kt:151)");
                        }
                        x a = y.a(lg90Var, j2, null, AlongIconType.AlongTitle, str2, null, aVar3, aVar2, 24584 | ((i3 >> 3) & 112), 76);
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

            void c(spg0 spg0Var, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: Cell.kt */
        public static final class b {
            public static h1 a(String str, a aVar, a aVar2, int i, SemanticsConfiguration semanticsConfiguration, izs izsVar, androidx.compose.runtime.a aVar3, int i2, int i3) {
                a aVar4 = (i3 & 2) != 0 ? null : aVar;
                a aVar5 = (i3 & 4) != 0 ? null : aVar2;
                int i4 = (i3 & 8) != 0 ? Integer.MAX_VALUE : i;
                int i5 = (i3 & 16) != 0 ? 1 : 2;
                SemanticsConfiguration semanticsConfiguration2 = (i3 & 32) != 0 ? null : semanticsConfiguration;
                izs izsVar2 = (i3 & 64) != 0 ? null : izsVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1275653405, i2, -1, "com.vk.core.compose.component.cell.content.Cell.Middle.Title.Companion.invoke (Cell.kt:355)");
                }
                int i6 = i2 << 3;
                h1 b = b(ws2.b(str, aVar3, i2 & 14), jgp.b, aVar4, aVar5, i4, i5, semanticsConfiguration2, null, izsVar2, aVar3, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i2 << 9) & 1879048192), (i2 >> 21) & 14, 384);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b;
            }

            public static h1 b(us2 us2Var, Map map, a aVar, a aVar2, int i, int i2, SemanticsConfiguration semanticsConfiguration, Float f, izs izsVar, androidx.compose.runtime.a aVar3, int i3, int i4, int i5) {
                Float valueOf = Float.valueOf(1.0f);
                Map map2 = (i5 & 2) != 0 ? jgp.b : map;
                a aVar4 = (i5 & 4) != 0 ? null : aVar;
                a aVar5 = (i5 & 8) != 0 ? null : aVar2;
                int i6 = (i5 & 16) != 0 ? Integer.MAX_VALUE : i;
                int i7 = (i5 & 32) != 0 ? 1 : i2;
                SemanticsConfiguration semanticsConfiguration2 = (i5 & 64) != 0 ? null : semanticsConfiguration;
                Float f2 = (i5 & 128) != 0 ? null : valueOf;
                Float f3 = (i5 & 256) != 0 ? null : f;
                izs izsVar2 = (i5 & 512) != 0 ? null : izsVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1195080257, i3, i4, "com.vk.core.compose.component.cell.content.Cell.Middle.Title.Companion.invoke (Cell.kt:369)");
                }
                int i8 = i3 << 3;
                int i9 = i3 >> 3;
                int i10 = (i4 & 14) | (i8 & 112) | (i8 & 896) | (i9 & 7168) | (i9 & 57344);
                int i11 = i3 << 9;
                int i12 = i10 | (458752 & i11) | (i11 & 3670016) | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192);
                int i13 = (i3 >> 27) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1013876960, i12, i13, "com.vk.core.compose.component.cell.content.remember (TextImpl.kt:175)");
                }
                aVar3.K(2097395041);
                Object x = aVar3.x();
                if (x == a.C0011a.a) {
                    h1 h1Var = new h1(us2Var, map2, null, aVar4, null, aVar5, semanticsConfiguration2, CellTextType.Title, i6, i7, f2, f3, izsVar2, 20);
                    aVar3.R(h1Var);
                    x = h1Var;
                }
                h1 h1Var2 = (h1) x;
                ((zak0) h1Var2.g).setValue(us2Var);
                ((zak0) h1Var2.i).setValue(aVar4);
                ((zak0) h1Var2.k).setValue(aVar5);
                ((zak0) h1Var2.l).setValue(semanticsConfiguration2);
                aVar3.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return h1Var2;
            }
        }

        void c(q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
