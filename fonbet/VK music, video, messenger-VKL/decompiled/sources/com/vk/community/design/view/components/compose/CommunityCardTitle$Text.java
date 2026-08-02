package com.vk.community.design.view.components.compose;

import androidx.compose.runtime.f;
import xsna.alb0;
import xsna.asp;
import xsna.epx;
import xsna.frv0;
import xsna.gtg;
import xsna.q630;
import xsna.qed;
import xsna.qoy;
import xsna.rrv0;
import xsna.wlb0;
import xsna.wuv0;
import xsna.zrp;

/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public final class CommunityCardTitle$Text {
    public final String a;
    public final boolean b;
    public final Mode c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityCard.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Regular;
        public static final Mode Semibold;
        public static final Mode Subhead;

        static {
            Mode mode = new Mode("Regular", 0);
            Regular = mode;
            Mode mode2 = new Mode("Semibold", 1);
            Semibold = mode2;
            Mode mode3 = new Mode("Subhead", 2);
            Subhead = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: CommunityCard.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.Semibold.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.Subhead.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommunityCardTitle$Text(String str, boolean z, Mode mode, int i) {
        mode = (i & 8) != 0 ? Mode.Regular : mode;
        this.a = str;
        this.b = z;
        this.c = mode;
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        frv0 frv0Var;
        androidx.compose.runtime.a M = aVar.M(-1416805881);
        int i2 = (M.J(q630Var) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1416805881, i2, -1, "com.vk.community.design.view.components.compose.CommunityCardTitle.Text.Content (CommunityCard.kt:77)");
            }
            int i3 = a.$EnumSwitchMapping$0[this.c.ordinal()];
            if (i3 == 1) {
                M.K(-45810160);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.J;
                M.j();
            } else if (i3 == 2) {
                M.K(-45808042);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.M;
                M.j();
            } else {
                if (i3 != 3) {
                    throw alb0.c(-45812146, M);
                }
                M.K(-45805778);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var3.d0;
                M.j();
            }
            int i4 = (i2 << 6) & 7168;
            gtg.a(this.a, frv0Var, wlb0.h(M).getText().m, q630Var, wlb0.l(M).i0, wlb0.h(M).getText().p, this.b, M, i4, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new qed(this, q630Var, i, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityCardTitle$Text)) {
            return false;
        }
        CommunityCardTitle$Text communityCardTitle$Text = (CommunityCardTitle$Text) obj;
        return epx.f(this.a, communityCardTitle$Text.a) && this.b == communityCardTitle$Text.b && this.c == communityCardTitle$Text.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 961, 31, this.b);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", meta=null, verified=" + this.b + ", mode=" + this.c + ')';
    }
}
