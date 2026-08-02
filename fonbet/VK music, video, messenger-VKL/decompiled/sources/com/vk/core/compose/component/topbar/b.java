package com.vk.core.compose.component.topbar;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.k;
import kotlin.NoWhenBranchMatchedException;
import xsna.alb0;
import xsna.byc0;
import xsna.epx;
import xsna.f870;
import xsna.iyk0;
import xsna.kqu0;
import xsna.m7p0;
import xsna.q6x;
import xsna.rrv0;
import xsna.s890;
import xsna.u890;
import xsna.ylu0;

/* compiled from: MilkshakeTopBarDefaults.kt */
/* loaded from: classes17.dex */
public final class b extends m7p0 {
    public static final b e = new b();

    /* compiled from: MilkshakeTopBarDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TopBar$Middle.Text.Title.Size.values().length];
            try {
                iArr[TopBar$Middle.Text.Title.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TopBar$Middle.Text.Title.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static float b(k kVar) {
        if (epx.f(kVar, k.a.C0761a.a)) {
            return kqu0.t;
        }
        if (epx.f(kVar, k.a.b.a) || epx.f(kVar, k.b.a)) {
            return kqu0.r;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float c(k kVar) {
        if (kVar.equals(k.a.C0761a.a)) {
            return kqu0.b;
        }
        if (kVar.equals(k.a.b.a) || kVar.equals(k.b.a)) {
            return kqu0.t;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long d(k kVar, float f, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1833760844);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1833760844, i, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.iconColor (MilkshakeTopBarDefaults.kt:112)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        iyk0 iyk0Var = rrv0.a;
        ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j2 = ylu0Var2.getIcon().c;
        if (!kVar.equals(k.a.b.a)) {
            j2 = f870.D(j, j2, f);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j2;
    }

    public final long e() {
        float f = 44;
        return byc0.b(f, f);
    }

    public final boolean f(k kVar, float f) {
        if ((kVar instanceof k.b) || (kVar instanceof k.a.C0761a)) {
            return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (kVar instanceof k.a.b) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final s890 g(k kVar, float f) {
        k.b bVar;
        k kVar2;
        boolean z = kVar instanceof k.b;
        if (z) {
            bVar = (k.b) kVar;
        } else {
            if (!(kVar instanceof k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = k.b.a;
        }
        float c = c(bVar);
        if (z) {
            kVar2 = k.a.C0761a.a;
        } else {
            if (!(kVar instanceof k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar2 = (k.a) kVar;
        }
        float z2 = q6x.z(c, c(kVar2), f);
        float f2 = kqu0.r;
        return new u890(z2, f2, z2, f2);
    }

    public final long h(k kVar, androidx.compose.runtime.a aVar, int i) {
        long j;
        aVar.K(887817264);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(887817264, i, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.subtitleTextColor (MilkshakeTopBarDefaults.kt:75)");
        }
        if (kVar instanceof k.b) {
            aVar.K(-1506096451);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().p;
            aVar.j();
        } else {
            if (!(kVar instanceof k.a)) {
                throw alb0.c(-1506098392, aVar);
            }
            aVar.K(-1506094372);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().d;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }
}
