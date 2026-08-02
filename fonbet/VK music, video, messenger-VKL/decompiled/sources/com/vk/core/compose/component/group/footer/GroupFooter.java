package com.vk.core.compose.component.group.footer;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import kotlin.NoWhenBranchMatchedException;
import xsna.adh;
import xsna.asp;
import xsna.cp10;
import xsna.cri;
import xsna.ct3;
import xsna.dt1;
import xsna.ft3;
import xsna.gzs;
import xsna.j6l;
import xsna.ja8;
import xsna.k9q0;
import xsna.kqu0;
import xsna.l5g;
import xsna.lg90;
import xsna.mkk0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.s200;
import xsna.sy90;
import xsna.txj0;
import xsna.us2;
import xsna.vqv;
import xsna.wh50;
import xsna.wuv0;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zak0;
import xsna.zfr0;
import xsna.zrp;
import xsna.zy60;

/* compiled from: GroupFooter.kt */
/* loaded from: classes17.dex */
public interface GroupFooter {

    /* compiled from: GroupFooter.kt */
    public interface Loader extends GroupFooter {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupFooter.kt */
        public static final class Size {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            public static final Size L;
            public static final Size M;
            public static final Size S;
            public static final Size XL;
            private final float dp;

            static {
                Size size = new Size("S", 0, 16);
                S = size;
                Size size2 = new Size("M", 1, 24);
                M = size2;
                Size size3 = new Size("L", 2, 32);
                L = size3;
                Size size4 = new Size("XL", 3, 44);
                XL = size4;
                Size[] sizeArr = {size, size2, size3, size4};
                $VALUES = sizeArr;
                $ENTRIES = new asp(sizeArr);
            }

            public Size(String str, int i, float f) {
                this.dp = f;
            }

            public static zrp<Size> i() {
                return $ENTRIES;
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }

            public final float h() {
                return this.dp;
            }
        }

        /* compiled from: GroupFooter.kt */
        public static final class a implements Loader {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c = k.b(null);
            public final wh50 d = k.b(null);

            public a(lg90 lg90Var, Size size) {
                this.a = k.b(lg90Var);
                this.b = k.b(size);
            }

            @Override // com.vk.core.compose.component.group.footer.GroupFooter
            public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a M = aVar.M(762057056);
                if ((i & 6) == 0) {
                    i2 = (M.J(q630Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= M.J(this) ? 32 : 16;
                }
                if (M.t(i2 & 1, (i2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(762057056, i2, -1, "com.vk.core.compose.component.group.footer.GroupFooter.Loader.Icon.Content (GroupFooter.kt:143)");
                    }
                    q630 b = com.vk.core.compose.component.semantics.b.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.y, 1, txj0.f(q630Var, 1.0f)), (SemanticsConfiguration) ((zak0) this.d).getValue());
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    vqv.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.c).getValue(), txj0.q(q630.a.a, ((Size) ((zak0) this.b).getValue()).h()), 0L, M, 8, 8);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                f s = M.s();
                if (s != null) {
                    s.d = new ft3(this, q630Var, i, 2);
                }
            }
        }

        /* compiled from: GroupFooter.kt */
        public static final class b implements Loader {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;
            public final wh50 d;
            public final wh50 e;
            public final wh50 f;

            /* compiled from: GroupFooter.kt */
            public static final class a {
                public static b a(SpinnerState spinnerState, Size size, androidx.compose.runtime.a aVar, int i) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-675831284, i, -1, "com.vk.core.compose.component.group.footer.GroupFooter.Loader.Spinner.Companion.invoke (GroupFooter.kt:229)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new b(spinnerState, j, size);
                        aVar.R(x);
                    }
                    b bVar = (b) x;
                    ((zak0) bVar.a).setValue(spinnerState);
                    ((zak0) bVar.b).setValue(null);
                    ((zak0) bVar.c).setValue(new l5g(j));
                    ((zak0) bVar.d).setValue(size);
                    ((zak0) bVar.e).setValue(null);
                    ((zak0) bVar.f).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return bVar;
                }
            }

            /* compiled from: GroupFooter.kt */
            /* renamed from: com.vk.core.compose.component.group.footer.GroupFooter$Loader$b$b, reason: collision with other inner class name */
            public static final /* synthetic */ class C0742b {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Size.values().length];
                    try {
                        iArr[Size.S.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Size.M.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Size.L.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Size.XL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public b() {
                throw null;
            }

            public b(SpinnerState spinnerState, long j, Size size) {
                this.a = k.b(spinnerState);
                this.b = k.b(null);
                this.c = zy60.d(j);
                this.d = k.b(size);
                this.e = k.b(null);
                this.f = k.b(null);
            }

            @Override // com.vk.core.compose.component.group.footer.GroupFooter
            public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                int i2;
                SpinnerSize spinnerSize;
                androidx.compose.runtime.a M = aVar.M(569081610);
                if ((i & 6) == 0) {
                    i2 = (M.J(q630Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= M.J(this) ? 32 : 16;
                }
                if (M.t(i2 & 1, (i2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(569081610, i2, -1, "com.vk.core.compose.component.group.footer.GroupFooter.Loader.Spinner.Content (GroupFooter.kt:194)");
                    }
                    q630 b = com.vk.core.compose.component.semantics.b.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.y, 1, txj0.f(q630Var, 1.0f)), (SemanticsConfiguration) ((zak0) this.f).getValue());
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    SpinnerState spinnerState = (SpinnerState) ((zak0) this.a).getValue();
                    gzs gzsVar = (gzs) ((zak0) this.b).getValue();
                    long j = ((l5g) ((zak0) this.c).getValue()).a;
                    int i3 = C0742b.$EnumSwitchMapping$0[((Size) ((zak0) this.d).getValue()).ordinal()];
                    if (i3 == 1) {
                        spinnerSize = SpinnerSize.Size16;
                    } else if (i3 == 2) {
                        spinnerSize = SpinnerSize.Size24;
                    } else if (i3 == 3) {
                        spinnerSize = SpinnerSize.Size36;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        spinnerSize = SpinnerSize.Size56;
                    }
                    zfr0.f(spinnerState, null, gzsVar, j, spinnerSize, (mkk0) ((zak0) this.e).getValue(), M, 0, 2);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                f s = M.s();
                if (s != null) {
                    s.d = new j6l(this, q630Var, i, 2);
                }
            }
        }
    }

    /* compiled from: GroupFooter.kt */
    public static final class a implements GroupFooter {
        public final wh50 a;
        public final wh50 b;

        public a(us2 us2Var, com.vk.core.compose.component.semantics.a aVar) {
            this.a = k.b(us2Var);
            this.b = k.b(aVar);
        }

        @Override // com.vk.core.compose.component.group.footer.GroupFooter
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-1297970869);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1297970869, i2, -1, "com.vk.core.compose.component.group.footer.GroupFooter.GroupDescription.Content (GroupFooter.kt:47)");
                }
                q630 f = txj0.f(q630Var, 1.0f);
                float f2 = kqu0.b;
                q630 b = com.vk.core.compose.component.semantics.b.b(s200.G(f, f2, kqu0.r, f2, kqu0.y), (SemanticsConfiguration) ((zak0) this.b).getValue());
                us2 us2Var = (us2) ((zak0) this.a).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.d(us2Var, b, j, 0, null, 0, false, 0, null, null, wuv0Var.i0, aVar2, 0, 0, 8184);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            f s = aVar2.s();
            if (s != null) {
                s.d = new adh(this, q630Var, i, 1);
            }
        }
    }

    /* compiled from: GroupFooter.kt */
    public static final class b implements GroupFooter {
        public final wh50 a = k.b("4 видео");
        public final wh50 b = k.b(null);

        @Override // com.vk.core.compose.component.group.footer.GroupFooter
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-2141119825);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2141119825, i2, -1, "com.vk.core.compose.component.group.footer.GroupFooter.ListFooter.Content (GroupFooter.kt:97)");
                }
                q630 b = com.vk.core.compose.component.semantics.b.b(s200.E(txj0.f(q630Var, 1.0f), kqu0.b, kqu0.y), (SemanticsConfiguration) ((zak0) this.b).getValue());
                String str = (String) ((zak0) this.a).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str, b, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.i0, aVar2, 0, 0, 8120);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            f s = aVar2.s();
            if (s != null) {
                s.d = new ct3(this, q630Var, i, 2);
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
