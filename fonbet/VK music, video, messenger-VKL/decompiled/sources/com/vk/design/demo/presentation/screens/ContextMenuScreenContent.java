package com.vk.design.demo.presentation.screens;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.asp;
import xsna.c5g;
import xsna.cp10;
import xsna.cri;
import xsna.djn0;
import xsna.dt1;
import xsna.efu;
import xsna.eoj;
import xsna.f9t;
import xsna.fgh;
import xsna.foj;
import xsna.gzs;
import xsna.ire;
import xsna.izs;
import xsna.j8;
import xsna.j9x;
import xsna.ja8;
import xsna.jh;
import xsna.ju;
import xsna.k9q0;
import xsna.k9x;
import xsna.l2i;
import xsna.lg90;
import xsna.lqd;
import xsna.ly5;
import xsna.m200;
import xsna.muv0;
import xsna.n34;
import xsna.on00;
import xsna.p490;
import xsna.pcg;
import xsna.q630;
import xsna.q9g;
import xsna.qri;
import xsna.qzu0;
import xsna.s200;
import xsna.sy90;
import xsna.tpg0;
import xsna.txj0;
import xsna.ty6;
import xsna.u890;
import xsna.uqy;
import xsna.ur;
import xsna.vsx;
import xsna.w3i;
import xsna.wh50;
import xsna.wze;
import xsna.x5;
import xsna.yah0;
import xsna.yqv0;
import xsna.zak0;
import xsna.zov0;
import xsna.zrp;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class ContextMenuScreenContent implements yah0 {
    public final ArrayList b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContextMenuScreenContent.kt */
    public static final class ImplementationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImplementationType[] $VALUES;
        public static final ImplementationType Compose;
        public static final ImplementationType View;

        static {
            ImplementationType implementationType = new ImplementationType("Compose", 0);
            Compose = implementationType;
            ImplementationType implementationType2 = new ImplementationType("View", 1);
            View = implementationType2;
            ImplementationType[] implementationTypeArr = {implementationType, implementationType2};
            $VALUES = implementationTypeArr;
            $ENTRIES = new asp(implementationTypeArr);
        }

        public ImplementationType() {
            throw null;
        }

        public static ImplementationType valueOf(String str) {
            return (ImplementationType) Enum.valueOf(ImplementationType.class, str);
        }

        public static ImplementationType[] values() {
            return (ImplementationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContextMenuScreenContent.kt */
    public static final class MenuHeaderVariant {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuHeaderVariant[] $VALUES;
        public static final MenuHeaderVariant Multiline;
        public static final MenuHeaderVariant MultilineFade;
        public static final MenuHeaderVariant None;
        public static final MenuHeaderVariant OneLine;
        public static final MenuHeaderVariant OneLineFade;

        static {
            MenuHeaderVariant menuHeaderVariant = new MenuHeaderVariant("None", 0);
            None = menuHeaderVariant;
            MenuHeaderVariant menuHeaderVariant2 = new MenuHeaderVariant("OneLine", 1);
            OneLine = menuHeaderVariant2;
            MenuHeaderVariant menuHeaderVariant3 = new MenuHeaderVariant("Multiline", 2);
            Multiline = menuHeaderVariant3;
            MenuHeaderVariant menuHeaderVariant4 = new MenuHeaderVariant("OneLineFade", 3);
            OneLineFade = menuHeaderVariant4;
            MenuHeaderVariant menuHeaderVariant5 = new MenuHeaderVariant("MultilineFade", 4);
            MultilineFade = menuHeaderVariant5;
            MenuHeaderVariant[] menuHeaderVariantArr = {menuHeaderVariant, menuHeaderVariant2, menuHeaderVariant3, menuHeaderVariant4, menuHeaderVariant5};
            $VALUES = menuHeaderVariantArr;
            $ENTRIES = new asp(menuHeaderVariantArr);
        }

        public MenuHeaderVariant() {
            throw null;
        }

        public static zrp<MenuHeaderVariant> h() {
            return $ENTRIES;
        }

        public static MenuHeaderVariant valueOf(String str) {
            return (MenuHeaderVariant) Enum.valueOf(MenuHeaderVariant.class, str);
        }

        public static MenuHeaderVariant[] values() {
            return (MenuHeaderVariant[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContextMenuScreenContent.kt */
    public static final class MenuItemsVariant {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuItemsVariant[] $VALUES;
        public static final MenuItemsVariant Avatar;
        public static final MenuItemsVariant Checked;
        public static final MenuItemsVariant Expandable;
        public static final MenuItemsVariant Full;
        public static final MenuItemsVariant Icon;
        public static final MenuItemsVariant Negative;
        public static final MenuItemsVariant Picture;
        public static final MenuItemsVariant RightIcon;
        public static final MenuItemsVariant Simple;

        static {
            MenuItemsVariant menuItemsVariant = new MenuItemsVariant("Simple", 0);
            Simple = menuItemsVariant;
            MenuItemsVariant menuItemsVariant2 = new MenuItemsVariant("Icon", 1);
            Icon = menuItemsVariant2;
            MenuItemsVariant menuItemsVariant3 = new MenuItemsVariant("Checked", 2);
            Checked = menuItemsVariant3;
            MenuItemsVariant menuItemsVariant4 = new MenuItemsVariant("Expandable", 3);
            Expandable = menuItemsVariant4;
            MenuItemsVariant menuItemsVariant5 = new MenuItemsVariant("Avatar", 4);
            Avatar = menuItemsVariant5;
            MenuItemsVariant menuItemsVariant6 = new MenuItemsVariant("Picture", 5);
            Picture = menuItemsVariant6;
            MenuItemsVariant menuItemsVariant7 = new MenuItemsVariant("RightIcon", 6);
            RightIcon = menuItemsVariant7;
            MenuItemsVariant menuItemsVariant8 = new MenuItemsVariant("Negative", 7);
            Negative = menuItemsVariant8;
            MenuItemsVariant menuItemsVariant9 = new MenuItemsVariant("Full", 8);
            Full = menuItemsVariant9;
            MenuItemsVariant[] menuItemsVariantArr = {menuItemsVariant, menuItemsVariant2, menuItemsVariant3, menuItemsVariant4, menuItemsVariant5, menuItemsVariant6, menuItemsVariant7, menuItemsVariant8, menuItemsVariant9};
            $VALUES = menuItemsVariantArr;
            $ENTRIES = new asp(menuItemsVariantArr);
        }

        public MenuItemsVariant() {
            throw null;
        }

        public static zrp<MenuItemsVariant> h() {
            return $ENTRIES;
        }

        public static MenuItemsVariant valueOf(String str) {
            return (MenuItemsVariant) Enum.valueOf(MenuItemsVariant.class, str);
        }

        public static MenuItemsVariant[] values() {
            return (MenuItemsVariant[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContextMenuScreenContent.kt */
    public static final class MenuToolButtonsVariant {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MenuToolButtonsVariant[] $VALUES;
        public static final MenuToolButtonsVariant None;
        public static final MenuToolButtonsVariant Three;
        public static final MenuToolButtonsVariant Two;

        static {
            MenuToolButtonsVariant menuToolButtonsVariant = new MenuToolButtonsVariant("None", 0);
            None = menuToolButtonsVariant;
            MenuToolButtonsVariant menuToolButtonsVariant2 = new MenuToolButtonsVariant("Two", 1);
            Two = menuToolButtonsVariant2;
            MenuToolButtonsVariant menuToolButtonsVariant3 = new MenuToolButtonsVariant("Three", 2);
            Three = menuToolButtonsVariant3;
            MenuToolButtonsVariant[] menuToolButtonsVariantArr = {menuToolButtonsVariant, menuToolButtonsVariant2, menuToolButtonsVariant3};
            $VALUES = menuToolButtonsVariantArr;
            $ENTRIES = new asp(menuToolButtonsVariantArr);
        }

        public MenuToolButtonsVariant() {
            throw null;
        }

        public static zrp<MenuToolButtonsVariant> h() {
            return $ENTRIES;
        }

        public static MenuToolButtonsVariant valueOf(String str) {
            return (MenuToolButtonsVariant) Enum.valueOf(MenuToolButtonsVariant.class, str);
        }

        public static MenuToolButtonsVariant[] values() {
            return (MenuToolButtonsVariant[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContextMenuScreenContent.kt */
    public static final class OverlayPosition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OverlayPosition[] $VALUES;
        public static final OverlayPosition Above;
        public static final OverlayPosition Below;

        static {
            OverlayPosition overlayPosition = new OverlayPosition("Above", 0);
            Above = overlayPosition;
            OverlayPosition overlayPosition2 = new OverlayPosition("Below", 1);
            Below = overlayPosition2;
            OverlayPosition[] overlayPositionArr = {overlayPosition, overlayPosition2};
            $VALUES = overlayPositionArr;
            $ENTRIES = new asp(overlayPositionArr);
        }

        public OverlayPosition() {
            throw null;
        }

        public static zrp<OverlayPosition> h() {
            return $ENTRIES;
        }

        public static OverlayPosition valueOf(String str) {
            return (OverlayPosition) Enum.valueOf(OverlayPosition.class, str);
        }

        public static OverlayPosition[] values() {
            return (OverlayPosition[]) $VALUES.clone();
        }
    }

    public ContextMenuScreenContent() {
        Field[] declaredFields = dt1.a.class.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(dt1.a);
            dt1 dt1Var = obj instanceof dt1 ? (dt1) obj : null;
            Pair pair = dt1Var != null ? new Pair(field.getName(), dt1Var) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        this.b = arrayList;
        zrp<MenuToolButtonsVariant> h = MenuToolButtonsVariant.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj2 : h) {
            linkedHashMap.put(obj2, ((MenuToolButtonsVariant) obj2).name());
        }
        this.c = linkedHashMap;
        zrp<MenuHeaderVariant> h2 = MenuHeaderVariant.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj3 : h2) {
            linkedHashMap2.put(obj3, ((MenuHeaderVariant) obj3).name());
        }
        this.d = linkedHashMap2;
        zrp<MenuItemsVariant> h3 = MenuItemsVariant.h();
        int e3 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3 < 16 ? 16 : e3);
        for (Object obj4 : h3) {
            linkedHashMap3.put(obj4, ((MenuItemsVariant) obj4).name());
        }
        this.e = linkedHashMap3;
        k9x k9xVar = new k9x(1, 12, 1);
        int e4 = on00.e(c5g.u(k9xVar, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e4 < 16 ? 16 : e4);
        j9x it = k9xVar.iterator();
        while (it.d) {
            Object next = it.next();
            linkedHashMap4.put(next, String.valueOf(((Number) next).intValue()));
        }
        this.f = linkedHashMap4;
        zrp<OverlayPosition> h4 = OverlayPosition.h();
        int e5 = on00.e(c5g.u(h4, 10));
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e5 >= 16 ? e5 : 16);
        for (Object obj5 : h4) {
            linkedHashMap5.put(obj5, ((OverlayPosition) obj5).name());
        }
        this.g = linkedHashMap5;
        this.h = k.b(MenuToolButtonsVariant.Three);
        this.i = k.b(MenuHeaderVariant.OneLine);
        this.j = k.b(MenuItemsVariant.Full);
        this.k = k.b(8);
        this.l = k.b(OverlayPosition.Above);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(1655959827);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (b.d()) {
                b.f(1655959827, i2, -1, "com.vk.design.demo.presentation.screens.ContextMenuScreenContent.Content (ContextMenuScreenContent.kt:181)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Context Menu", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(2133254901);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(2133255734);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            M.K(1706671245);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(a4, d.b.a.C0757a.a(q, null, x5Var, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, true, M, 438, 0);
            q630 d = txj0.d(aVar2, 1.0f);
            ty6.a aVar4 = dt1.a.o;
            c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, d);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = k.b(dt1.a.b);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = k.b(ImplementationType.Compose);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            q630 a6 = q9g.a(txj0.f(aVar2, 1.0f), 1.0f);
            float f2 = 8;
            int i4 = i2;
            q630 D3 = p490.D(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, a6), p490.x(M), 14);
            c a7 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(12), aVar4, M, 54);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, D3);
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
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 H = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            ImplementationType implementationType = (ImplementationType) wh50Var2.getValue();
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new w3i(1, wh50Var2);
                M.R(x3);
            }
            b(implementationType, (izs) x3, H, M, ((i4 >> 6) & 7168) | Tensorflow.FRAME_WIDTH);
            c((i4 >> 15) & 14, M);
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c5 = qri.c(M, h);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            a.b((dt1) wh50Var.getValue(), (ImplementationType) wh50Var2.getValue(), (MenuToolButtonsVariant) ((zak0) this.h).getValue(), (MenuHeaderVariant) ((zak0) this.i).getValue(), (MenuItemsVariant) ((zak0) this.j).getValue(), ((Number) ((zak0) this.k).getValue()).intValue(), (OverlayPosition) ((zak0) this.l).getValue(), txj0.s(aVar2, 276, 180), M, 0);
            M.G();
            q630 h2 = txj0.h(aVar2, 176);
            efu.a aVar5 = new efu.a(160);
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
            boolean y = M.y(this);
            Object x4 = M.x();
            if (y || x4 == obj) {
                x4 = new ju(7, this, wh50Var);
                M.R(x4);
            }
            uqy.b(aVar5, h2, null, n, null, null, null, false, null, (izs) x4, M, 3120, 0, 1012);
            M = M;
            M.G();
            M.G();
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new eoj(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(ImplementationType implementationType, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1841310272);
        if ((i & 6) == 0) {
            i2 = (M.o(implementationType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(1841310272, i2, -1, "com.vk.design.demo.presentation.screens.ContextMenuScreenContent.ImplementationSwitch (ContextMenuScreenContent.kt:275)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = j.a(cVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("Compose", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            float f = 8;
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.v(aVar4, f), M, 6);
            boolean z = implementationType == ImplementationType.View;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new lqd(izsVar, 1);
                M.R(x);
            }
            zov0.a(z, (izs) x, null, false, null, M, 0, 28);
            f9t.e(txj0.v(aVar4, f), M, 6);
            aVar2 = M;
            yqv0.c("View", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 6, 0, 16382);
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
            s.d = new foj(this, implementationType, izsVar, q630Var, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        tpg0 tpg0Var;
        androidx.compose.runtime.a M = aVar.M(-871294146);
        if ((i & 6) == 0) {
            i2 = i | (M.y(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-871294146, i2, -1, "com.vk.design.demo.presentation.screens.ContextMenuScreenContent.MenuSettings (ContextMenuScreenContent.kt:303)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            float f2 = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a = j.a(g, bVar, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            tpg0 tpg0Var2 = tpg0.a;
            q630 b = tpg0Var2.b(1.0f, aVar2, true);
            MenuToolButtonsVariant menuToolButtonsVariant = (MenuToolButtonsVariant) ((zak0) this.h).getValue();
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                tpg0Var = tpg0Var2;
                x = new fgh(this, 4);
                M.R(x);
            } else {
                tpg0Var = tpg0Var2;
            }
            tpg0 tpg0Var3 = tpg0Var;
            a.a("Tool buttons", this.c, menuToolButtonsVariant, (izs) x, b, false, M, 6);
            q630 b2 = tpg0Var3.b(1.0f, aVar2, true);
            MenuHeaderVariant menuHeaderVariant = (MenuHeaderVariant) ((zak0) this.i).getValue();
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new l2i(this, 2);
                M.R(x2);
            }
            a.a("Header", this.d, menuHeaderVariant, (izs) x2, b2, false, M, 6);
            q630 b3 = tpg0Var3.b(1.0f, aVar2, true);
            MenuItemsVariant menuItemsVariant = (MenuItemsVariant) ((zak0) this.j).getValue();
            boolean y3 = M.y(this);
            Object x3 = M.x();
            if (y3 || x3 == c0012a) {
                x3 = new ire(this, 10);
                M.R(x3);
            }
            a.a("Items", this.e, menuItemsVariant, (izs) x3, b3, false, M, 6);
            M.G();
            q630 f3 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a2 = j.a(androidx.compose.foundation.layout.a.g(f2), bVar, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 b4 = tpg0Var3.b(1.0f, aVar2, true);
            Integer valueOf2 = Integer.valueOf(((Number) ((zak0) this.k).getValue()).intValue());
            boolean y4 = M.y(this);
            Object x4 = M.x();
            if (y4 || x4 == c0012a) {
                x4 = new pcg(this, 9);
                M.R(x4);
            }
            a.a("Items count", this.f, valueOf2, (izs) x4, b4, false, M, 6);
            q630 b5 = tpg0Var3.b(1.0f, aVar2, true);
            OverlayPosition overlayPosition = (OverlayPosition) ((zak0) this.l).getValue();
            boolean y5 = M.y(this);
            Object x5 = M.x();
            if (y5 || x5 == c0012a) {
                x5 = new wze(this, 11);
                M.R(x5);
            }
            a.a("Overlay", this.g, overlayPosition, (izs) x5, b5, false, M, 6);
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ly5(this, i, 2);
        }
    }
}
