package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.asp;
import xsna.esc;
import xsna.ffa;
import xsna.gzs;
import xsna.jai;
import xsna.kai;
import xsna.o750;
import xsna.ozl;
import xsna.q630;
import xsna.q9g;
import xsna.rfv;
import xsna.spg0;
import xsna.us2;
import xsna.vuy;
import xsna.wph0;
import xsna.ws2;
import xsna.zak0;
import xsna.zrp;

/* compiled from: RichCell.kt */
/* loaded from: classes17.dex */
public interface RichCell$Middle {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RichCell.kt */
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

        public static zrp<Size> h() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: RichCell.kt */
    public interface a {

        /* compiled from: RichCell.kt */
        /* renamed from: com.vk.core.compose.component.cell.content.RichCell$Middle$a$a, reason: collision with other inner class name */
        public static final class C0734a {
            public static v a(ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, ButtonSize buttonSize, String str, com.vk.core.compose.component.semantics.a aVar, gzs gzsVar, androidx.compose.runtime.a aVar2, int i, int i2, int i3) {
                ButtonSize buttonSize2 = (i3 & 4) != 0 ? ButtonSize.Small : buttonSize;
                com.vk.core.compose.component.semantics.a aVar3 = (i3 & 8192) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-424501554, i, i2, "com.vk.core.compose.component.cell.content.RichCell.Middle.Button.Companion.invoke (RichCell.kt:303)");
                }
                int i4 = i << 3;
                int i5 = (i4 & 57344) | ((i2 >> 15) & 14) | 48 | (i4 & 896) | (i4 & 7168) | 1074003968;
                int i6 = i2 << 3;
                int i7 = (i6 & 458752) | (i2 & 112) | ((i2 << 6) & 896) | (i6 & 7168) | (i6 & 57344);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-824068835, i5, i7, "com.vk.core.compose.component.cell.content.remember (CommonButtonImpl.kt:99)");
                }
                int i8 = i7 << 3;
                v a = w.a(buttonStyle, buttonAppearance, buttonSize2, str, null, null, null, null, false, aVar3, gzsVar, aVar2, (i5 & 57344) | ((i5 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | (i8 & 7168) | ((i7 << 6) & 458752) | 2097152, 8 | (i8 & 896) | (i7 & 57344) | (i7 & 458752), 8192);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: RichCell.kt */
    public static final class b {
        public static b1 a(f1 f1Var, f1 f1Var2, f1 f1Var3, f1 f1Var4, p0 p0Var, v vVar, v vVar2, v vVar3, d1 d1Var, androidx.compose.runtime.a aVar, int i, int i2) {
            f0 f0Var;
            f0 f0Var2;
            f0 f0Var3;
            f0 f0Var4;
            f0 f0Var5;
            e0 b;
            e0 b2;
            e0 b3;
            e0 e0Var;
            if ((i2 & 1) != 0) {
                Size size = Size.Medium;
            }
            f1 f1Var5 = (i2 & 2) != 0 ? null : f1Var;
            f1 f1Var6 = (i2 & 4) != 0 ? null : f1Var2;
            f1 f1Var7 = (i2 & 8) != 0 ? null : f1Var3;
            f1 f1Var8 = (i2 & 16) != 0 ? null : f1Var4;
            p0 p0Var2 = (i2 & 32) != 0 ? null : p0Var;
            v vVar4 = (i2 & 64) != 0 ? null : vVar;
            v vVar5 = (i2 & 128) != 0 ? null : vVar2;
            v vVar6 = (i2 & 256) != 0 ? null : vVar3;
            d1 d1Var2 = (i2 & 512) != 0 ? null : d1Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-324983544, i, 48, "com.vk.core.compose.component.cell.content.RichCell.Middle.Companion.invoke (RichCell.kt:367)");
            }
            int i3 = ((i << 3) & 112) | 6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-73370762, i3, 0, "com.vk.core.compose.component.cell.content.remember (SexyMiddleImpl.kt:165)");
            }
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (f1Var5 == null) {
                aVar.K(350620407);
                aVar.j();
                f0Var = null;
            } else {
                aVar.K(-1789804982);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-142101704, 0, -1, "com.vk.core.compose.component.cell.content.toSexyCellSubtitle (SexyMiddleImpl.kt:192)");
                }
                jai c = kai.c(-533200298, new o750(f1Var5, 1), aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(397674870, 54, -1, "com.vk.core.compose.component.cell.content.InternalTitleSlot.Companion.invoke (InternalSlots.kt:74)");
                }
                Object x = aVar.x();
                if (x == c0012a) {
                    x = new f0(c);
                    aVar.R(x);
                }
                f0Var = (f0) x;
                ((zak0) f0Var.c).setValue(c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            if (f1Var6 == null) {
                aVar.K(350660986);
                aVar.j();
                f0Var2 = null;
            } else {
                aVar.K(-1789803673);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-805692428, 0, -1, "com.vk.core.compose.component.cell.content.toSexyCellTitle (SexyMiddleImpl.kt:180)");
                }
                jai c2 = kai.c(2109436566, new ffa(f1Var6, 1), aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(397674870, 54, -1, "com.vk.core.compose.component.cell.content.InternalTitleSlot.Companion.invoke (InternalSlots.kt:74)");
                }
                Object x2 = aVar.x();
                if (x2 == c0012a) {
                    x2 = new f0(c2);
                    aVar.R(x2);
                }
                f0 f0Var6 = (f0) x2;
                ((zak0) f0Var6.c).setValue(c2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                f0Var2 = f0Var6;
            }
            if (f1Var7 == null) {
                aVar.K(350704727);
                aVar.j();
                f0Var3 = null;
            } else {
                aVar.K(-1789802262);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1596978968, 0, -1, "com.vk.core.compose.component.cell.content.toSexyCellSubtitle (SexyMiddleImpl.kt:184)");
                }
                jai c3 = kai.c(191520266, new rfv(f1Var7, 1), aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(397674870, 54, -1, "com.vk.core.compose.component.cell.content.InternalTitleSlot.Companion.invoke (InternalSlots.kt:74)");
                }
                Object x3 = aVar.x();
                if (x3 == c0012a) {
                    x3 = new f0(c3);
                    aVar.R(x3);
                }
                f0Var3 = (f0) x3;
                ((zak0) f0Var3.c).setValue(c3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            if (f1Var8 == null) {
                aVar.K(350761271);
                aVar.j();
                f0Var4 = null;
            } else {
                aVar.K(-1789800438);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-302231940, 0, -1, "com.vk.core.compose.component.cell.content.toSexyCellSubtitle (SexyMiddleImpl.kt:188)");
                }
                jai c4 = kai.c(1502863002, new vuy(f1Var8, 1), aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(397674870, 54, -1, "com.vk.core.compose.component.cell.content.InternalTitleSlot.Companion.invoke (InternalSlots.kt:74)");
                }
                Object x4 = aVar.x();
                if (x4 == c0012a) {
                    x4 = new f0(c4);
                    aVar.R(x4);
                }
                f0Var4 = (f0) x4;
                ((zak0) f0Var4.c).setValue(c4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            if (p0Var2 == null) {
                aVar.K(350799835);
                aVar.j();
                f0Var5 = null;
            } else {
                aVar.K(-1789799194);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(559735976, 0, -1, "com.vk.core.compose.component.cell.content.toSexyCellSlot (SexyMiddleImpl.kt:196)");
                }
                jai c5 = kai.c(661093322, new wph0(p0Var2, 1), aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(397674870, 54, -1, "com.vk.core.compose.component.cell.content.InternalTitleSlot.Companion.invoke (InternalSlots.kt:74)");
                }
                Object x5 = aVar.x();
                if (x5 == c0012a) {
                    x5 = new f0(c5);
                    aVar.R(x5);
                }
                f0 f0Var7 = (f0) x5;
                ((zak0) f0Var7.c).setValue(c5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                f0Var5 = f0Var7;
            }
            if (vVar4 == null) {
                aVar.K(350848505);
                aVar.j();
                b = null;
            } else {
                aVar.K(-1789797624);
                b = c1.b(vVar4, aVar, 0);
                aVar.j();
            }
            if (vVar5 == null) {
                aVar.K(350901081);
                aVar.j();
                b2 = null;
            } else {
                aVar.K(-1789795928);
                b2 = c1.b(vVar5, aVar, 0);
                aVar.j();
            }
            if (vVar6 == null) {
                aVar.K(350951673);
                aVar.j();
                b3 = null;
            } else {
                aVar.K(-1789794296);
                b3 = c1.b(vVar6, aVar, 0);
                aVar.j();
            }
            if (d1Var2 == null) {
                aVar.K(350988315);
                aVar.j();
                e0Var = null;
            } else {
                aVar.K(-1789793114);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1232274421, 0, -1, "com.vk.core.compose.component.cell.content.toSexyCellMeta (SexyMiddleImpl.kt:204)");
                }
                jai c6 = kai.c(882964735, new esc(d1Var2, 1), aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-156301732, 54, -1, "com.vk.core.compose.component.cell.content.InternalMiddleRowSlot.Companion.invoke (InternalSlots.kt:29)");
                }
                Object x6 = aVar.x();
                if (x6 == c0012a) {
                    x6 = new e0(c6);
                    aVar.R(x6);
                }
                e0Var = (e0) x6;
                ((zak0) e0Var.b).setValue(c6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            e0 e0Var2 = e0Var;
            b1 a = c1.a(f0Var2, f0Var3, f0Var4, f0Var, f0Var5, b, b2, b3, e0Var2, null, aVar, 0, 0, 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return a;
        }
    }

    /* compiled from: RichCell.kt */
    public interface c {

        /* compiled from: RichCell.kt */
        public interface a {
            void b(spg0 spg0Var, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: RichCell.kt */
        public static final class b {
            public static f1 a(String str, x xVar, x xVar2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                boolean z = (i2 & 2) == 0;
                x xVar3 = (i2 & 4) != 0 ? null : xVar;
                x xVar4 = (i2 & 8) != 0 ? null : xVar2;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1434480862, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.ExtraSubtitle.Companion.invoke (RichCell.kt:213)");
                }
                f1 b = b(ws2.b(str, aVar2, i & 14), z, xVar3, xVar4, aVar3, aVar2, i & 524272, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b;
            }

            public static f1 b(us2 us2Var, boolean z, a aVar, a aVar2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar3, int i, int i2) {
                d0 b;
                d0 d0Var = null;
                a aVar4 = (i2 & 4) != 0 ? null : aVar;
                a aVar5 = (i2 & 8) != 0 ? null : aVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1911663954, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.ExtraSubtitle.Companion.invoke (RichCell.kt:228)");
                }
                int i3 = ((i << 9) & 57344) | (i & 896) | 6 | (i & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(872250283, i3, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleTextImpl.kt:215)");
                }
                if (aVar4 == null) {
                    aVar3.K(656462181);
                    aVar3.j();
                    b = null;
                } else {
                    aVar3.K(713912860);
                    b = g1.b(aVar4, aVar3, (i3 >> 6) & 14);
                    aVar3.j();
                }
                if (aVar5 == null) {
                    aVar3.K(656511781);
                } else {
                    aVar3.K(713914460);
                    d0Var = g1.b(aVar5, aVar3, (i3 >> 9) & 14);
                }
                aVar3.j();
                f1 a = g1.a(us2Var, null, b, null, d0Var, null, semanticsConfiguration, TextType.ExtraSubtitle, z ? Integer.MAX_VALUE : 1, 2, null, aVar3, 817889280, 0, 1066);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        void b(q9g q9gVar, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: RichCell.kt */
    public interface d {

        /* compiled from: RichCell.kt */
        public static final class a {
            public static d1 a(String str, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                us2 us2Var = null;
                String str2 = (i2 & 2) != 0 ? null : "Submeta";
                if ((i2 & 4) != 0) {
                    aVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1945835663, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Meta.Companion.invoke (RichCell.kt:334)");
                }
                us2 b = ws2.b(str, aVar2, i & 14);
                if (str2 == null) {
                    aVar2.K(783676949);
                } else {
                    aVar2.K(-1637288084);
                    us2Var = ws2.b(str2, aVar2, (i >> 3) & 14);
                }
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-902608617, 3072, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Meta.Companion.invoke (RichCell.kt:345)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1987670703, 6, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleMetaImpl.kt:64)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new d1(b, us2Var, aVar);
                    aVar2.R(x);
                }
                d1 d1Var = (d1) x;
                ((zak0) d1Var.a).setValue(b);
                ((zak0) d1Var.b).setValue(us2Var);
                ((zak0) d1Var.c).setValue(aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return d1Var;
            }
        }

        void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: RichCell.kt */
    public interface e {

        /* compiled from: RichCell.kt */
        public static final class a {
            public static f1 a(String str, androidx.compose.runtime.a aVar, int i) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(7923772, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Overtitle.Companion.invoke (RichCell.kt:102)");
                }
                us2 b = ws2.b(str, aVar, i & 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(518777288, 3072, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Overtitle.Companion.invoke (RichCell.kt:113)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1628912393, 6, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleTextImpl.kt:163)");
                }
                f1 a = g1.a(b, null, null, null, null, null, null, TextType.Overtitle, 1, 2, null, aVar, 817889280, 0, 1086);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        void b(q9g q9gVar, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: RichCell.kt */
    public interface f {
        void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: RichCell.kt */
    public interface g {

        /* compiled from: RichCell.kt */
        public interface a {
            void b(spg0 spg0Var, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: RichCell.kt */
        public static final class b {
            public static f1 a(String str, boolean z, x xVar, x xVar2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                d0 c;
                boolean z2 = (i2 & 2) != 0 ? false : z;
                d0 d0Var = null;
                x xVar3 = (i2 & 4) != 0 ? null : xVar;
                x xVar4 = (i2 & 8) != 0 ? null : xVar2;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1021373898, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Subtitle.Companion.invoke (RichCell.kt:155)");
                }
                us2 b = ws2.b(str, aVar2, i & 14);
                int i3 = 524272 & i;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2035839062, i3, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Subtitle.Companion.invoke (RichCell.kt:170)");
                }
                int i4 = (i & 7168) | ((i3 >> 15) & 14) | (i & 896) | ((i3 << 9) & 57344) | (458752 & (i3 << 3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-312336677, i4, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleTextImpl.kt:197)");
                }
                if (xVar3 == null) {
                    aVar2.K(-1922379083);
                    aVar2.j();
                    c = null;
                } else {
                    aVar2.K(492177100);
                    c = g1.c(xVar3, aVar2, (i4 >> 6) & 14);
                    aVar2.j();
                }
                if (xVar4 == null) {
                    aVar2.K(-1922329483);
                } else {
                    aVar2.K(492178700);
                    d0Var = g1.c(xVar4, aVar2, (i4 >> 9) & 14);
                }
                aVar2.j();
                f1 a = g1.a(b, null, c, null, d0Var, null, aVar3, TextType.Subtitle, z2 ? Integer.MAX_VALUE : 1, 2, null, aVar2, 817889280 | ((i4 << 3) & 3670016), 0, 1066);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        void b(q9g q9gVar, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: RichCell.kt */
    public interface h {

        /* compiled from: RichCell.kt */
        public interface a {
            void b(spg0 spg0Var, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: RichCell.kt */
        public static final class b {
            public static f1 a(String str, x xVar, a aVar, com.vk.core.compose.component.semantics.a aVar2, androidx.compose.runtime.a aVar3, int i, int i2) {
                x xVar2 = (i2 & 4) != 0 ? null : xVar;
                a aVar4 = (i2 & 8) != 0 ? null : aVar;
                com.vk.core.compose.component.semantics.a aVar5 = (i2 & 16) != 0 ? null : aVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(366257474, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Title.Companion.invoke (RichCell.kt:47)");
                }
                f1 b = b(ws2.b(str, aVar3, i & 14), false, xVar2, aVar4, aVar5, aVar3, 196608, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b;
            }

            public static f1 b(us2 us2Var, boolean z, a aVar, a aVar2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar3, int i, int i2) {
                d0 d;
                d0 d0Var = null;
                a aVar4 = (i2 & 4) != 0 ? null : aVar;
                a aVar5 = (i2 & 8) != 0 ? null : aVar2;
                SemanticsConfiguration semanticsConfiguration2 = (i2 & 16) != 0 ? null : semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-661389106, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Title.Companion.invoke (RichCell.kt:62)");
                }
                int i3 = ((i << 9) & 57344) | 6;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1684347461, i3, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleTextImpl.kt:179)");
                }
                if (aVar4 == null) {
                    aVar3.K(-291910027);
                    aVar3.j();
                    d = null;
                } else {
                    aVar3.K(544772876);
                    d = g1.d(aVar4, aVar3, 0);
                    aVar3.j();
                }
                if (aVar5 == null) {
                    aVar3.K(-291863403);
                } else {
                    aVar3.K(544774380);
                    d0Var = g1.d(aVar5, aVar3, 0);
                }
                aVar3.j();
                f1 a = g1.a(us2Var, null, null, d, null, d0Var, semanticsConfiguration2, TextType.Title, z ? Integer.MAX_VALUE : 1, 2, null, aVar3, 817889280, 0, 1046);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        void b(q9g q9gVar, q630 q630Var, Size size, androidx.compose.runtime.a aVar, int i);
    }

    void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
