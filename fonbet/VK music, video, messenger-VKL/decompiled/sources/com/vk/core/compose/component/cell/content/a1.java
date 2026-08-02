package com.vk.core.compose.component.cell.content;

import xsna.jgp;
import xsna.q630;
import xsna.q9g;
import xsna.spg0;
import xsna.us2;
import xsna.wh50;
import xsna.ws2;

/* compiled from: SexyCell.kt */
/* loaded from: classes17.dex */
public abstract class a1 {
    public final wh50 a = androidx.compose.runtime.k.b(SexyCell$Size.Medium);

    /* compiled from: SexyCell.kt */
    public interface a {
        void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: SexyCell.kt */
    public static final class b {
        public static b1 a(g gVar, f fVar, f1 f1Var, f1 f1Var2, e1 e1Var, v vVar, v vVar2, d1 d1Var, f1 f1Var3, androidx.compose.runtime.a aVar, int i) {
            g gVar2 = (i & 1) != 0 ? null : gVar;
            f fVar2 = (i & 2) != 0 ? null : fVar;
            f1 f1Var4 = (i & 4) != 0 ? null : f1Var;
            f1 f1Var5 = (i & 8) != 0 ? null : f1Var2;
            e1 e1Var2 = (i & 16) != 0 ? null : e1Var;
            v vVar3 = (i & 32) != 0 ? null : vVar;
            v vVar4 = (i & 64) != 0 ? null : vVar2;
            d1 d1Var2 = (i & 256) != 0 ? null : d1Var;
            f1 f1Var6 = (i & 512) != 0 ? null : f1Var3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1456200867, 0, 48, "com.vk.core.compose.component.cell.content.SexyCell.Middle.Companion.invoke (SexyCell.kt:336)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2069160641, 6, 0, "com.vk.core.compose.component.cell.content.remember (SexyMiddleImpl.kt:138)");
            }
            b1 a = c1.a(gVar2, fVar2, f1Var4, f1Var5, e1Var2, vVar3, vVar4, null, d1Var2, f1Var6, aVar, 0, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return a;
        }
    }

    /* compiled from: SexyCell.kt */
    public interface c {

        /* compiled from: SexyCell.kt */
        public static final class a {
        }

        void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: SexyCell.kt */
    public interface d {
        void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: SexyCell.kt */
    public interface e {
        void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: SexyCell.kt */
    public interface f {

        /* compiled from: SexyCell.kt */
        public interface a {
            void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: SexyCell.kt */
        public static final class b {
            public static f1 a(String str, int i, androidx.compose.runtime.a aVar, int i2, int i3) {
                int i4 = (i3 & 2) != 0 ? Integer.MAX_VALUE : i;
                int i5 = (i3 & 4) != 0 ? 1 : 3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2031067137, i2, -1, "com.vk.core.compose.component.cell.content.SexyCell.Middle.Subtitle.Companion.invoke (SexyCell.kt:176)");
                }
                us2 b = ws2.b(str, aVar, i2 & 14);
                int i6 = i2 << 3;
                int i7 = (i6 & 234881024) | (i6 & 896) | 48 | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1660868603, i7, -1, "com.vk.core.compose.component.cell.content.SexyCell.Middle.Subtitle.Companion.invoke (SexyCell.kt:188)");
                }
                int i8 = (i7 >> 24) & 14;
                int i9 = i7 << 3;
                int i10 = (i9 & 29360128) | i8 | 384 | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(146008798, i10, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleTextImpl.kt:127)");
                }
                int i11 = ((i10 >> 3) & 3670016) | ((i10 >> 9) & 896) | 12582960 | ((i10 >> 6) & 57344);
                int i12 = i10 << 15;
                f1 a = g1.a(b, jgp.b, null, null, null, null, null, TextType.Subtitle, i4, i5, null, aVar, i11 | (i12 & 234881024) | (i12 & 1879048192), 0, 40);
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

        void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: SexyCell.kt */
    public static abstract class g {
        public final wh50 a = androidx.compose.runtime.k.b(Boolean.FALSE);
        public final wh50 b = androidx.compose.runtime.k.b(SexyCell$Size.Medium);

        /* compiled from: SexyCell.kt */
        public static abstract class a {
            public final wh50 a = androidx.compose.runtime.k.b(SexyCell$Size.Medium);
            public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);

            /* compiled from: SexyCell.kt */
            /* renamed from: com.vk.core.compose.component.cell.content.a1$g$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0735a extends a {
            }

            public abstract void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: SexyCell.kt */
        public static final class b {
            public static f1 a(String str, x xVar, x xVar2, int i, androidx.compose.runtime.a aVar, int i2, int i3) {
                x xVar3 = (i3 & 2) != 0 ? null : xVar;
                x xVar4 = (i3 & 4) != 0 ? null : xVar2;
                int i4 = (i3 & 8) != 0 ? Integer.MAX_VALUE : 1;
                if ((i3 & 16) != 0) {
                    i = 2;
                }
                int i5 = i;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(684545469, i2, -1, "com.vk.core.compose.component.cell.content.SexyCell.Middle.Title.Companion.invoke (SexyCell.kt:80)");
                }
                us2 b = ws2.b(str, aVar, i2 & 14);
                int i6 = i2 << 3;
                f1 b2 = b(b, xVar3, xVar4, i4, i5, aVar, (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return b2;
            }

            public static f1 b(us2 us2Var, a aVar, a aVar2, int i, int i2, androidx.compose.runtime.a aVar3, int i3, int i4) {
                a aVar4 = (i4 & 4) != 0 ? null : aVar;
                a aVar5 = (i4 & 8) != 0 ? null : aVar2;
                int i5 = (i4 & 16) != 0 ? Integer.MAX_VALUE : i;
                int i6 = (i4 & 32) != 0 ? 2 : i2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1651912897, i3, -1, "com.vk.core.compose.component.cell.content.SexyCell.Middle.Title.Companion.invoke (SexyCell.kt:92)");
                }
                int i7 = i3 << 3;
                int i8 = i3 >> 3;
                int i9 = i3 << 9;
                int i10 = (i9 & 3670016) | ((i3 >> 24) & 14) | (i7 & 112) | (i7 & 896) | (i8 & 7168) | (i8 & 57344) | (i9 & 458752) | (29360128 & i7) | (i7 & 234881024);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-644001640, i10, -1, "com.vk.core.compose.component.cell.content.remember (SexyMiddleTextImpl.kt:105)");
                }
                int i11 = i10 >> 3;
                int i12 = i10 << 15;
                f1 a = g1.a(us2Var, jgp.b, null, aVar4, null, aVar5, null, TextType.Title, i5, i6, null, aVar3, (234881024 & i12) | (i11 & 3670016) | (i11 & 14) | 12582912 | (i11 & 112) | ((i10 >> 6) & 7168) | (458752 & i11) | (1879048192 & i12), (i10 >> 24) & 14, 20);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        public abstract void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    public abstract void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
