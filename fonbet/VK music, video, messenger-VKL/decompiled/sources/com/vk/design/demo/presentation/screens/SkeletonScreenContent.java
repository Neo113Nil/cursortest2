package com.vk.design.demo.presentation.screens;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ae2;
import xsna.akv0;
import xsna.alb0;
import xsna.alj0;
import xsna.asp;
import xsna.c5g;
import xsna.ckv0;
import xsna.cp10;
import xsna.cq0;
import xsna.cri;
import xsna.djn0;
import xsna.dt1;
import xsna.e3;
import xsna.e43;
import xsna.gp;
import xsna.gzs;
import xsna.hbh0;
import xsna.izs;
import xsna.j8;
import xsna.ja8;
import xsna.jh;
import xsna.k9q0;
import xsna.kai;
import xsna.lg90;
import xsna.muv0;
import xsna.n34;
import xsna.n7b0;
import xsna.on00;
import xsna.or;
import xsna.q630;
import xsna.q9g;
import xsna.qri;
import xsna.qzu0;
import xsna.r36;
import xsna.s200;
import xsna.s3q0;
import xsna.sk;
import xsna.sy90;
import xsna.syq;
import xsna.txj0;
import xsna.ur;
import xsna.vkg;
import xsna.vsx;
import xsna.wh50;
import xsna.wzs;
import xsna.x5;
import xsna.y9i0;
import xsna.yah0;
import xsna.zak0;
import xsna.zrp;

/* compiled from: SkeletonScreenContent.kt */
/* loaded from: classes18.dex */
public final class SkeletonScreenContent implements yah0 {
    public final Integer[] b = {48, 56, 64, 72, 80};
    public final ThemableShimmer c;
    public final String d;
    public final LinkedHashMap e;
    public final wh50 f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SkeletonScreenContent.kt */
    public static final class ImplementationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImplementationType[] $VALUES;
        public static final ImplementationType Compose;
        public static final ImplementationType View;

        static {
            ImplementationType implementationType = new ImplementationType("View", 0);
            View = implementationType;
            ImplementationType implementationType2 = new ImplementationType("Compose", 1);
            Compose = implementationType2;
            ImplementationType[] implementationTypeArr = {implementationType, implementationType2};
            $VALUES = implementationTypeArr;
            $ENTRIES = new asp(implementationTypeArr);
        }

        public ImplementationType() {
            throw null;
        }

        public static zrp<ImplementationType> h() {
            return $ENTRIES;
        }

        public static ImplementationType valueOf(String str) {
            return (ImplementationType) Enum.valueOf(ImplementationType.class, str);
        }

        public static ImplementationType[] values() {
            return (ImplementationType[]) $VALUES.clone();
        }
    }

    /* compiled from: SkeletonScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImplementationType.values().length];
            try {
                iArr[ImplementationType.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImplementationType.Compose.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SkeletonScreenContent() {
        String str;
        Context context = e43.a;
        this.c = new ThemableShimmer.a(context == null ? null : context).a();
        this.d = "Welcome to the HEV Mark 4 Protective System, for use in hazardous environment conditions. Power-assist movement activated. High-impact reactive armor activated. Atmospheric contaminant sensors activated. Vital signs monitoring activated. Automatic medical systems engaged. Defensive weapon selection system activated. Munition level monitoring activated. Communications interface online. Have a very safe day.";
        zrp<ImplementationType> h = ImplementationType.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            int i = a.$EnumSwitchMapping$0[((ImplementationType) obj).ordinal()];
            if (i == 1) {
                str = "View";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "Compose";
            }
            linkedHashMap.put(obj, str);
        }
        this.e = linkedHashMap;
        this.f = k.b(ImplementationType.Compose);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        SkeletonScreenContent skeletonScreenContent = this;
        androidx.compose.runtime.a M = aVar.M(-2048348055);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = i | (M.y(gzsVar3) ? 4 : 2);
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 196608) == 0) {
            i2 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(skeletonScreenContent) : M.y(skeletonScreenContent) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (65555 & i3) != 65554)) {
            if (b.d()) {
                b.f(-2048348055, i3, -1, "com.vk.design.demo.presentation.screens.SkeletonScreenContent.Content (SkeletonScreenContent.kt:72)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Skeleton", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (b.d()) {
                b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (b.d()) {
                b.e();
            }
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(-94395989);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(-94395156);
                c = j8.c(qzu0.a, M);
            }
            boolean z = ((458752 & i3) == 131072 || ((i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(skeletonScreenContent))) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new sk(23, gzsVar2, skeletonScreenContent);
                M.R(x);
            }
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(c, null, (gzs) x, null, null, null, M, 1572872, 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            aVar2 = M;
            djn0.a(true, true, aVar2, 438, 0);
            q630 a5 = q9g.a(aVar3, 1.0f);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c3 = qri.c(aVar2, a5);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c3, dVar);
            skeletonScreenContent = this;
            int i4 = a.$EnumSwitchMapping$0[((ImplementationType) ((zak0) skeletonScreenContent.f).getValue()).ordinal()];
            if (i4 == 1) {
                aVar2.K(-748315310);
                skeletonScreenContent.e(((i3 >> 15) & 14) | 8, aVar2);
                aVar2.j();
                s3q0 s3q0Var = s3q0.a;
            } else {
                if (i4 != 2) {
                    throw alb0.c(-748317550, aVar2);
                }
                aVar2.K(-748313259);
                skeletonScreenContent.b(((i3 >> 15) & 14) | 8, aVar2);
                aVar2.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            aVar2.G();
            skeletonScreenContent.d(((i3 >> 15) & 14) | 8, aVar2);
            skeletonScreenContent.c.d();
            aVar2.G();
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new r36(skeletonScreenContent, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(243491769);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(this) : M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(243491769, i2, -1, "com.vk.design.demo.presentation.screens.SkeletonScreenContent.ComposeContent (SkeletonScreenContent.kt:103)");
            }
            ckv0.a(txj0.f(q630.a.a, 1.0f), ckv0.b(null, M, 1), kai.c(-741130882, new syq(this, 2), M), M, ApiInvocationException.ErrorCodes.CENSOR_MATCH, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new vkg(this, i, 2);
        }
    }

    public final void c(SkeletonType skeletonType, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1206053786);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1206053786, i2, -1, "com.vk.design.demo.presentation.screens.SkeletonScreenContent.ComposeSkeletonRow (SkeletonScreenContent.kt:182)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(341765318);
            for (int i3 = 0; i3 < 5; i3++) {
                akv0.a(skeletonType, txj0.q(s200.D(aVar2, 4), this.b[i3].intValue()), M, 6);
            }
            if (gp.d(M)) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new e3(this, skeletonType, i, 13);
        }
    }

    public final void d(final int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-93679640);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(this) : M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-93679640, i2, -1, "com.vk.design.demo.presentation.screens.SkeletonScreenContent.Controls (SkeletonScreenContent.kt:212)");
            }
            ImplementationType implementationType = (ImplementationType) ((zak0) this.f).getValue();
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && M.y(this))) {
                z = true;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new alj0(this, 1);
                M.R(x);
            }
            y9i0.a("Implementation", this.e, implementationType, (izs) x, null, M, 6, 16);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vyj0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    SkeletonScreenContent.this.d(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-856488918);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(this) : M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-856488918, i2, -1, "com.vk.design.demo.presentation.screens.SkeletonScreenContent.ViewContent (SkeletonScreenContent.kt:124)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && M.y(this))) {
                z = true;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new n7b0(this, 8);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, d);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new cq0(this, i);
        }
    }

    public final void f(LinearLayout linearLayout, VkSkeleton.a aVar, LinearLayout linearLayout2) {
        for (int i = 0; i < 5; i++) {
            int intValue = this.b[i].intValue();
            VkSkeleton vkSkeleton = new VkSkeleton(linearLayout.getContext(), null, 0, 14, 0);
            vkSkeleton.setShimmer(this.c);
            vkSkeleton.setShimmerManagedExternally(true);
            vkSkeleton.setArea(new a.C0863a(linearLayout2));
            vkSkeleton.setType(aVar);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(hbh0.b(intValue, vkSkeleton.getContext()), hbh0.b(intValue, vkSkeleton.getContext()));
            int b = hbh0.b(4, vkSkeleton.getContext());
            marginLayoutParams.setMargins(b, b, b, b);
            vkSkeleton.setLayoutParams(marginLayoutParams);
            linearLayout.addView(vkSkeleton);
        }
    }
}
