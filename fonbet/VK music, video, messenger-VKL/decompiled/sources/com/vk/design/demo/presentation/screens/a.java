package com.vk.design.demo.presentation.screens;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vkontakte.android.R;
import java.util.Map;
import ru.ok.gl.tf.Tensorflow;
import xsna.ae2;
import xsna.af2;
import xsna.alb0;
import xsna.aoj;
import xsna.aou0;
import xsna.bap;
import xsna.cei;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.eko;
import xsna.f9t;
import xsna.g53;
import xsna.gzs;
import xsna.hbh0;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.koj;
import xsna.krv0;
import xsna.loj;
import xsna.m33;
import xsna.mpj0;
import xsna.n34;
import xsna.o26;
import xsna.q0z;
import xsna.q630;
import xsna.qoj;
import xsna.qri;
import xsna.r18;
import xsna.ra8;
import xsna.rrv0;
import xsna.s200;
import xsna.s2x;
import xsna.s3q0;
import xsna.sy90;
import xsna.tc8;
import xsna.txj0;
import xsna.ty6;
import xsna.uc8;
import xsna.ur;
import xsna.voj;
import xsna.vsx;
import xsna.wh50;
import xsna.wqb;
import xsna.wzs;
import xsna.y9i0;
import xsna.ylu0;
import xsna.yqv0;
import xsna.z0v0;
import xsna.zov0;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final float a = PsExtractor.VIDEO_STREAM_MASK;

    /* compiled from: ContextMenuScreenContent.kt */
    /* renamed from: com.vk.design.demo.presentation.screens.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0894a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[ContextMenuScreenContent.ImplementationType.values().length];
            try {
                iArr[ContextMenuScreenContent.ImplementationType.Compose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextMenuScreenContent.ImplementationType.View.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContextMenuScreenContent.MenuToolButtonsVariant.values().length];
            try {
                iArr2[ContextMenuScreenContent.MenuToolButtonsVariant.Three.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ContextMenuScreenContent.MenuToolButtonsVariant.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ContextMenuScreenContent.MenuToolButtonsVariant.Two.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ContextMenuScreenContent.MenuHeaderVariant.values().length];
            try {
                iArr3[ContextMenuScreenContent.MenuHeaderVariant.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ContextMenuScreenContent.MenuHeaderVariant.OneLine.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ContextMenuScreenContent.MenuHeaderVariant.Multiline.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ContextMenuScreenContent.MenuHeaderVariant.OneLineFade.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ContextMenuScreenContent.MenuHeaderVariant.MultilineFade.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ContextMenuScreenContent.MenuItemsVariant.values().length];
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Simple.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Icon.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Checked.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Expandable.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Avatar.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Picture.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.RightIcon.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Negative.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ContextMenuScreenContent.MenuItemsVariant.Full.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ContextMenuScreenContent.OverlayPosition.values().length];
            try {
                iArr5[ContextMenuScreenContent.OverlayPosition.Above.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[ContextMenuScreenContent.OverlayPosition.Below.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final void a(final String str, final Map map, final Object obj, final izs izsVar, final q630 q630Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1645853271);
        int i2 = i | (M.J(map) ? 32 : 16) | (M.J(obj) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (b.d()) {
                b.f(-1645853271, i2, -1, "com.vk.design.demo.presentation.screens.ContextMenuSelect (ContextMenuScreenContent.kt:369)");
            }
            if (z) {
                M.K(-267911142);
                y9i0.a(str, map, obj, izsVar, q630Var, M, 65534 & i2, 0);
                M.j();
            } else {
                M.K(-267708402);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                yqv0.c(str, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
                String valueOf = String.valueOf(obj);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new g53(13);
                    M.R(x);
                }
                z0v0.a(s2x.b.a.b(valueOf, false, (izs) x, null, null, 0L, 0L, null, cei.a, M, Tensorflow.FRAME_WIDTH, Z3.l), txj0.f(q630.a.a, 1.0f), null, false, M, 3120, 4);
                M.G();
                M.j();
            }
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(str, map, obj, izsVar, q630Var, z, i) { // from class: xsna.poj
                public final /* synthetic */ String b;
                public final /* synthetic */ Map c;
                public final /* synthetic */ Object d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ boolean g;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(7);
                    com.vk.design.demo.presentation.screens.a.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final dt1 dt1Var, final ContextMenuScreenContent.ImplementationType implementationType, final ContextMenuScreenContent.MenuToolButtonsVariant menuToolButtonsVariant, final ContextMenuScreenContent.MenuHeaderVariant menuHeaderVariant, final ContextMenuScreenContent.MenuItemsVariant menuItemsVariant, final int i, final ContextMenuScreenContent.OverlayPosition overlayPosition, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        wh50 wh50Var;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1437385535);
        int i4 = i2 | (M.J(dt1Var) ? 4 : 2) | (M.o(implementationType.ordinal()) ? 32 : 16) | (M.o(menuToolButtonsVariant.ordinal()) ? 256 : 128) | (M.o(menuHeaderVariant.ordinal()) ? 2048 : 1024) | (M.o(menuItemsVariant.ordinal()) ? 16384 : 8192) | (M.o(i) ? 131072 : 65536) | (M.o(overlayPosition.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(q630Var) ? 8388608 : 4194304);
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (b.d()) {
                b.f(-1437385535, i4, -1, "com.vk.design.demo.presentation.screens.DropdownSandbox (ContextMenuScreenContent.kt:408)");
            }
            float f = 2;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            q630 a2 = r18.a(f, ylu0Var.q().b, q630Var, e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Boolean bool = (Boolean) M.r(vsx.b);
            bool.getClass();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = k.b(null);
                M.R(x3);
            }
            wh50 wh50Var4 = (wh50) x3;
            boolean l = M.l(((Boolean) wh50Var3.getValue()).booleanValue());
            Object x4 = M.x();
            if (l || x4 == c0012a) {
                x4 = "Show Dropdown".concat(((Boolean) wh50Var3.getValue()).booleanValue() ? " Overlay" : "");
                M.R(x4);
            }
            String str = (String) x4;
            M.W(82589540, M.O(Boolean.FALSE, bool));
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 q = txj0.q(ra8Var.b(aVar3, dt1Var), 1);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new qoj(0, wh50Var4);
                M.R(x5);
            }
            izs izsVar = (izs) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                wh50Var = wh50Var2;
                x6 = new tc8(1, wh50Var4);
                M.R(x6);
            } else {
                wh50Var = wh50Var2;
            }
            ae2.a(390, 0, M, izsVar, (izs) x6, q);
            M.a0();
            ty6.a aVar4 = dt1.a.o;
            float f2 = 8;
            q630 D2 = s200.D(txj0.d(aVar3, 1.0f), f2);
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            c a3 = androidx.compose.foundation.layout.b.a(cVar2, aVar4, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f3 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a4 = j.a(cVar2, dt1.a.l, M, 54);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, f3);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            boolean booleanValue = ((Boolean) wh50Var3.getValue()).booleanValue();
            Object x7 = M.x();
            if (x7 == c0012a) {
                i3 = 2;
                x7 = new uc8(i3, wh50Var3);
                M.R(x7);
            } else {
                i3 = 2;
            }
            izs izsVar2 = (izs) x7;
            wh50 wh50Var5 = wh50Var;
            zov0.a(booleanValue, izsVar2, null, false, null, M, 48, 28);
            f9t.e(txj0.v(aVar3, f2), M, 6);
            int i5 = i3;
            yqv0.c("Enable overlay", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new o26(1, wh50Var5);
                M.R(x8);
            }
            mpj0.a(384, 2, M, str, (gzs) x8, null);
            M = M;
            M.G();
            int i6 = C0894a.$EnumSwitchMapping$0[implementationType.ordinal()];
            if (i6 == 1) {
                M.K(-1733411471);
                ((Boolean) wh50Var3.getValue()).getClass();
                M.K(-1732410543);
                boolean c4 = c(wh50Var5);
                Object x9 = M.x();
                if (x9 == c0012a) {
                    x9 = new koj(0, wh50Var5);
                    M.R(x9);
                }
                d(dt1Var, c4, menuToolButtonsVariant, menuHeaderVariant, menuItemsVariant, i, (gzs) x9, M, (i4 & 14) | 1572864 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                M.j();
                M.j();
                s3q0 s3q0Var = s3q0.a;
            } else {
                if (i6 != i5) {
                    throw alb0.c(82629353, M);
                }
                M.K(-1731782638);
                View view = (View) wh50Var4.getValue();
                if (view == null) {
                    M.K(-1731754243);
                } else {
                    M.K(-1731754242);
                    ((Boolean) wh50Var3.getValue()).getClass();
                    M.K(1218837534);
                    boolean c5 = c(wh50Var5);
                    Object x10 = M.x();
                    if (x10 == c0012a) {
                        x10 = new loj(0, wh50Var5);
                        M.R(x10);
                    }
                    int i7 = i4 << 6;
                    e(view, dt1Var, c5, (gzs) x10, menuToolButtonsVariant, menuHeaderVariant, menuItemsVariant, i, M, ((i4 << 3) & 112) | 3072 | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128));
                    M = M;
                    M.j();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                M.j();
                M.j();
            }
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(implementationType, menuToolButtonsVariant, menuHeaderVariant, menuItemsVariant, i, overlayPosition, q630Var, i2) { // from class: xsna.moj
                public final /* synthetic */ ContextMenuScreenContent.ImplementationType c;
                public final /* synthetic */ ContextMenuScreenContent.MenuToolButtonsVariant d;
                public final /* synthetic */ ContextMenuScreenContent.MenuHeaderVariant e;
                public final /* synthetic */ ContextMenuScreenContent.MenuItemsVariant f;
                public final /* synthetic */ int g;
                public final /* synthetic */ ContextMenuScreenContent.OverlayPosition h;
                public final /* synthetic */ q630 i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.design.demo.presentation.screens.a.b(dt1.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final boolean c(wh50<Boolean> wh50Var) {
        return wh50Var.getValue().booleanValue();
    }

    public static final void d(final dt1 dt1Var, final boolean z, final ContextMenuScreenContent.MenuToolButtonsVariant menuToolButtonsVariant, final ContextMenuScreenContent.MenuHeaderVariant menuHeaderVariant, final ContextMenuScreenContent.MenuItemsVariant menuItemsVariant, final int i, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1546567250);
        if ((i2 & 6) == 0) {
            i3 = (M.J(dt1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(menuToolButtonsVariant.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(menuHeaderVariant.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.o(menuItemsVariant.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (b.d()) {
                b.f(-1546567250, i3, -1, "com.vk.design.demo.presentation.screens.Menu (ContextMenuScreenContent.kt:1253)");
            }
            int i4 = (i3 >> 6) & 8190;
            M.K(352557351);
            if (b.d()) {
                b.f(352557351, i4, -1, "com.vk.design.demo.presentation.screens.menuScopeContent (ContextMenuScreenContent.kt:1128)");
            }
            af2 af2Var = new af2(12);
            if (b.d()) {
                b.e();
            }
            M.j();
            aVar2 = M;
            aou0.g(z, gzsVar, null, dt1Var, 0L, null, null, af2Var, aVar2, ((i3 >> 3) & 14) | ((i3 >> 15) & 112) | ((i3 << 9) & 7168), 244);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ooj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.design.demo.presentation.screens.a.d(dt1.this, z, menuToolButtonsVariant, menuHeaderVariant, menuItemsVariant, i, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final View view, final dt1 dt1Var, final boolean z, final gzs gzsVar, final ContextMenuScreenContent.MenuToolButtonsVariant menuToolButtonsVariant, final ContextMenuScreenContent.MenuHeaderVariant menuHeaderVariant, final ContextMenuScreenContent.MenuItemsVariant menuItemsVariant, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1319290552);
        if ((i2 & 6) == 0) {
            i3 = (M.y(view) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(dt1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.o(menuToolButtonsVariant == null ? -1 : menuToolButtonsVariant.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(menuHeaderVariant == null ? -1 : menuHeaderVariant.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.o(menuItemsVariant == null ? -1 : menuItemsVariant.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= M.o(i) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (b.d()) {
                b.f(1319290552, i3, -1, "com.vk.design.demo.presentation.screens.ViewMenu (ContextMenuScreenContent.kt:1053)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean l = M.l(((Boolean) M.r(vsx.b)).booleanValue()) | M.J(view) | M.J(context) | M.l(false) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (l || x == c0012a) {
                int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                i4 = i3;
                e.b bVar = new e.b(view, null, null, l2, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.i(Integer.valueOf(hbh0.b(276, context)));
                bVar.l = new q0z(context);
                x = bVar.a();
                ((com.vk.core.view.components.context.menu.e) x).q = gzsVar;
                M.R(x);
            } else {
                i4 = i3;
            }
            VkContextMenu vkContextMenu = (VkContextMenu) x;
            if (z) {
                M.K(-259165354);
                int i5 = i4 & 112;
                boolean y = M.y(vkContextMenu) | (i5 == 32);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new wqb(5, vkContextMenu, dt1Var);
                    M.R(x2);
                }
                bap.b(vkContextMenu, dt1Var, (izs) x2, M, 8 | i5);
            } else {
                M.K(-299376694);
            }
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.noj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.design.demo.presentation.screens.a.e(view, dt1Var, z, gzsVar, menuToolButtonsVariant, menuHeaderVariant, menuItemsVariant, i, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final ImageView f(int i, Context context) {
        int b = hbh0.b(16, context);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(b, b, 17));
        imageView.setImageDrawable(m33.a(i, context));
        return imageView;
    }

    public static final eko g(gzs gzsVar) {
        return new eko((Drawable) gzsVar.invoke());
    }

    public static void h(aoj aojVar, int i) {
        aojVar.a(new voj(true, (i & 1) != 0 ? "Action" : "Neutral"));
    }
}
