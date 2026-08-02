package com.vk.profile.design.view.profileheader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.tools.controls.seekbar.i;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.azl;
import xsna.b6s;
import xsna.cri;
import xsna.drm0;
import xsna.dt1;
import xsna.egi0;
import xsna.eku;
import xsna.esa0;
import xsna.f870;
import xsna.f9t;
import xsna.frv0;
import xsna.fwu0;
import xsna.gyn;
import xsna.gzs;
import xsna.h0k;
import xsna.hik0;
import xsna.hsc0;
import xsna.i9z;
import xsna.iyd0;
import xsna.iyk0;
import xsna.izs;
import xsna.jai;
import xsna.jgp;
import xsna.jrv0;
import xsna.k87;
import xsna.k9q0;
import xsna.kai;
import xsna.kqu0;
import xsna.l2v0;
import xsna.l5g;
import xsna.lg90;
import xsna.lq0;
import xsna.m2l0;
import xsna.n34;
import xsna.nmo0;
import xsna.nn7;
import xsna.nwo;
import xsna.ojc;
import xsna.or;
import xsna.p0h;
import xsna.pdo0;
import xsna.pg90;
import xsna.pvi;
import xsna.pzu0;
import xsna.q630;
import xsna.q8z;
import xsna.qri;
import xsna.qzu0;
import xsna.r0v0;
import xsna.r0x;
import xsna.rrv0;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.sag;
import xsna.seq0;
import xsna.src;
import xsna.sy90;
import xsna.szw;
import xsna.t2v;
import xsna.t9b;
import xsna.th2;
import xsna.tjo0;
import xsna.txj0;
import xsna.ty6;
import xsna.u05;
import xsna.u5s;
import xsna.uog0;
import xsna.up4;
import xsna.us2;
import xsna.uvi;
import xsna.uxb;
import xsna.vog0;
import xsna.vp4;
import xsna.w65;
import xsna.wam0;
import xsna.wdp;
import xsna.wjo0;
import xsna.wlb0;
import xsna.wuv0;
import xsna.wzs;
import xsna.xjo0;
import xsna.xpy;
import xsna.xtm0;
import xsna.xyc;
import xsna.y2;
import xsna.yb1;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zn1;

/* compiled from: UserProfileBaseInfoView.kt */
/* loaded from: classes5.dex */
public final class b {
    public static final uog0 a = vog0.b(8);

    /* compiled from: UserProfileBaseInfoView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserProfileBaseInfoState.VerifyInfo.VerificationType.values().length];
            try {
                iArr[UserProfileBaseInfoState.VerifyInfo.VerificationType.VkVerified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserProfileBaseInfoState.VerifyInfo.VerificationType.ServiceVerified.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1401737542);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1401737542, i2, -1, "com.vk.profile.design.view.profileheader.DeactivatedScreenName (UserProfileBaseInfoView.kt:292)");
            }
            q630 E = ahn.E(q630.a.a, "UserProfileDeactivatedScreenName");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var.getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, (i2 & 14) | 100663344, 48, 5880);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new t2v(str, i);
        }
    }

    public static final void b(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1190682027);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1190682027, i2, -1, "com.vk.profile.design.view.profileheader.DeadUserText (UserProfileBaseInfoView.kt:393)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, f, ylu0Var.getText().s, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, (i2 & 14) | 48, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new y2(str, i, 8);
        }
    }

    public static final void c(UserProfileBaseInfoState.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(486847624);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(486847624, i2, -1, "com.vk.profile.design.view.profileheader.Description (UserProfileBaseInfoView.kt:234)");
            }
            wjo0 a2 = xjo0.a(0, 1, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nmo0 nmo0Var = wuv0Var.d0.a;
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean J = M.J(a2) | ((i2 & 14) == 4) | M.J(nmo0Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new nn7(aVar, a2, nmo0Var, 5);
                M.R(x);
            }
            xtm0.a(f, (wzs) x, M, 6, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new uxb(aVar, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(UserProfileBaseInfoState.a aVar, final boolean z, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a aVar4;
        q630 q630Var;
        a.C0011a.C0012a c0012a;
        us2 n;
        us2 us2Var;
        Spanned spanned;
        us2 us2Var2;
        int i2;
        Object obj;
        Map map;
        Object[] objArr;
        int i3;
        androidx.compose.runtime.a aVar5;
        int i4;
        a.C0011a.C0012a c0012a2;
        char c;
        b6s b6sVar;
        final UserProfileBaseInfoState.a aVar6 = aVar;
        androidx.compose.runtime.a M = aVar2.M(-1505753487);
        int i5 = i | (M.J(aVar6) ? 4 : 2) | (M.l(z) ? 32 : 16);
        int i6 = 0;
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1505753487, i5, -1, "com.vk.profile.design.view.profileheader.DescriptionText (UserProfileBaseInfoView.kt:270)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z2 = (i5 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z2 || x == c0012a3) {
                x = new m2l0(aVar6, 9);
                M.R(x);
            }
            q630 E = ahn.E(egi0.b(f, false, (izs) x), "UserProfileBaseInfoDescription");
            CharSequence charSequence = aVar6.a;
            boolean y = M.y(context);
            Object x2 = M.x();
            if (y || x2 == c0012a3) {
                x2 = new wam0(context, 1);
                M.R(x2);
            }
            final izs izsVar = (izs) x2;
            if (charSequence instanceof Spanned) {
                Spanned spanned2 = (Spanned) charSequence;
                us2.b bVar = new us2.b();
                bVar.f(spanned2);
                Object[] spans = spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
                int length = spans.length;
                while (i6 < length) {
                    final CharacterStyle characterStyle = (CharacterStyle) spans[i6];
                    int spanStart = spanned2.getSpanStart(characterStyle);
                    int spanEnd = spanned2.getSpanEnd(characterStyle);
                    q630 q630Var2 = E;
                    if (characterStyle instanceof StyleSpan) {
                        StyleSpan styleSpan = (StyleSpan) characterStyle;
                        int style = styleSpan.getStyle();
                        objArr = spans;
                        if (style != 0) {
                            i3 = i6;
                            b6sVar = (style == 1 || style == 3) ? b6s.k : null;
                        } else {
                            i3 = i6;
                            b6sVar = b6s.h;
                        }
                        b6s b6sVar2 = b6sVar;
                        int style2 = styleSpan.getStyle();
                        bVar.d(new hik0(0L, 0L, b6sVar2, new u5s((style2 == 2 || style2 == 3) ? 1 : 0), null, null, null, 0L, null, null, null, 0L, null, null, 65523), spanStart, spanEnd);
                    } else {
                        objArr = spans;
                        i3 = i6;
                        if (characterStyle instanceof UnderlineSpan) {
                            bVar.d(new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0.c, null, 61439), spanStart, spanEnd);
                        } else if (characterStyle instanceof ForegroundColorSpan) {
                            bVar.d(new hik0(f870.c(((ForegroundColorSpan) characterStyle).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanStart, spanEnd);
                        } else if (characterStyle instanceof URLSpan) {
                            bVar.e(new seq0(((URLSpan) characterStyle).getURL()), spanStart, spanEnd);
                        } else {
                            if (characterStyle instanceof l2v0) {
                                l2v0 l2v0Var = (l2v0) characterStyle;
                                String i7 = l2v0Var.i();
                                if (i7 == null) {
                                    i7 = "";
                                }
                                i4 = length;
                                c0012a2 = c0012a3;
                                aVar5 = M;
                                c = 14;
                                bVar.b(new q8z.b(i7, new tjo0(new hik0(f870.c(l2v0Var.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), new hik0(f870.c(l2v0Var.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, f870.c(l2v0Var.getColor()), 0.3f), null, null, 63486), new hik0(f870.c(l2v0Var.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, f870.c(l2v0Var.getColor()), 0.3f), null, null, 63486), 4), new i9z() { // from class: xsna.jdp
                                    @Override // xsna.i9z
                                    public final void a(q8z q8zVar) {
                                        izs izsVar2 = izs.this;
                                        if (izsVar2 != null) {
                                            izsVar2.invoke(characterStyle);
                                        }
                                    }
                                }), spanStart, spanEnd);
                            } else {
                                aVar5 = M;
                                i4 = length;
                                c0012a2 = c0012a3;
                                c = 14;
                                if (characterStyle instanceof wdp) {
                                    drm0.Y(spanned2, spanStart, spanEnd, "￼");
                                    bVar.c(spanStart, spanEnd, "androidx.compose.foundation.text.inlineContent", "emoji_" + spanStart + '_' + spanEnd);
                                }
                            }
                            i6 = i3 + 1;
                            M = aVar5;
                            E = q630Var2;
                            length = i4;
                            c0012a3 = c0012a2;
                            spans = objArr;
                        }
                    }
                    aVar5 = M;
                    i4 = length;
                    c0012a2 = c0012a3;
                    c = 14;
                    i6 = i3 + 1;
                    M = aVar5;
                    E = q630Var2;
                    length = i4;
                    c0012a3 = c0012a2;
                    spans = objArr;
                }
                aVar4 = M;
                q630Var = E;
                c0012a = c0012a3;
                n = bVar.n();
            } else {
                aVar4 = M;
                q630Var = E;
                c0012a = c0012a3;
                us2.b bVar2 = new us2.b();
                bVar2.f(charSequence);
                n = bVar2.n();
            }
            us2 us2Var3 = n;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            androidx.compose.runtime.a aVar7 = aVar4;
            wuv0 wuv0Var = (wuv0) aVar7.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar7.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            int i8 = z ? 1 : 2;
            aVar6 = aVar;
            CharSequence charSequence2 = aVar6.a;
            aVar7.K(-1005144637);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1005144637, 0, -1, "com.vk.profile.design.view.profileheader.rememberInlineContentWithEmojis (EmojiHelper.kt:117)");
            }
            if (charSequence2 instanceof Spanned) {
                iyk0 iyk0Var = uvi.h;
                long i0 = ((azl) aVar7.r(iyk0Var)).i0(23);
                long i02 = ((azl) aVar7.r(iyk0Var)).i0(21);
                Spanned spanned3 = (Spanned) charSequence2;
                boolean J = aVar7.J(spanned3);
                Object x3 = aVar7.x();
                if (J || x3 == c0012a) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int i9 = 0;
                    Object[] spans2 = spanned3.getSpans(0, charSequence2.length(), wdp.class);
                    int length2 = spans2.length;
                    while (i9 < length2) {
                        wdp wdpVar = (wdp) spans2[i9];
                        Object[] objArr2 = spans2;
                        String str = "emoji_" + spanned3.getSpanStart(wdpVar) + '_' + spanned3.getSpanEnd(wdpVar);
                        Drawable drawable = wdpVar.g;
                        if (drawable != null) {
                            spanned = spanned3;
                            us2Var2 = us2Var3;
                            i2 = length2;
                            linkedHashMap.put(str, new r0x(new esa0(i0, i02, 7), new jai(1620306970, new gyn(drawable, 1), true)));
                        } else {
                            spanned = spanned3;
                            us2Var2 = us2Var3;
                            i2 = length2;
                        }
                        i9++;
                        spans2 = objArr2;
                        spanned3 = spanned;
                        us2Var3 = us2Var2;
                        length2 = i2;
                    }
                    us2Var = us2Var3;
                    aVar7.R(linkedHashMap);
                    obj = linkedHashMap;
                } else {
                    us2Var = us2Var3;
                    obj = x3;
                }
                map = (Map) obj;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                us2Var3 = us2Var;
            } else {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                map = jgp.b;
            }
            aVar3 = aVar7;
            yqv0.d(us2Var3, q630Var, j, 3, null, i8, false, 2, null, map, frv0Var, aVar3, 0, 6, 2744);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.nmq0
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    com.vk.profile.design.view.profileheader.b.d(UserProfileBaseInfoState.a.this, this.c, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-575422177);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-575422177, i2, -1, "com.vk.profile.design.view.profileheader.EmptyInfo (UserProfileBaseInfoView.kt:442)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new lq0(izsVar, 8);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            q630 c = ojc.c(aVar3, false, null, null, (gzs) x, 15);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a2 = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            yqv0.c(str, null, wlb0.h(M).getText().a, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).T, M, (i2 & 14) | 100663296, 48, 5882);
            f9t.e(txj0.v(aVar3, kqu0.s), M, 0);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1928660030, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ChevronCircleOutline20> (VkIcons.kt:1416)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_circle_outline_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a3, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new xyc(str, izsVar, i, 8);
        }
    }

    public static final void f(int i, int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1677723397);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1677723397, i3, -1, "com.vk.profile.design.view.profileheader.LeftIcon (UserProfileBaseInfoView.kt:384)");
            }
            lg90 a2 = pg90.a(i, i3 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a2, null, null, ylu0Var.getIcon().l, M, 56, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new up4(i, i2);
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1112745240);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1112745240, i3, -1, "com.vk.profile.design.view.profileheader.MusicTrack (UserProfileBaseInfoView.kt:407)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            float f2 = kqu0.q;
            float f3 = kqu0.r;
            q630 d = rte0.d(s200.E(f, f3, f2), a);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zn1(izsVar, 12);
                M.R(x);
            }
            q630 c = ojc.c(d, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.e, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(289060508, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Play16> (VkSdkIcons.kt:2872)");
            }
            lg90 b = or.b(M, -7668273, R.drawable.vk_icon_play_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            f9t.e(txj0.v(aVar3, f3), M, 0);
            aVar2 = M;
            yqv0.c(str, null, wlb0.h(M).getText().a, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).h0, aVar2, (i3 & 14) | 100663296, 48, 5882);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new sag(str, izsVar, i, 6);
        }
    }

    public static final void h(UserProfileBaseInfoState.c cVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-993816769);
        int i2 = (M.J(cVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-993816769, i2, -1, "com.vk.profile.design.view.profileheader.SecondaryInfo (UserProfileBaseInfoView.kt:304)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new iyd0(cVar, 11);
                M.R(x);
            }
            q630 E = ahn.E(egi0.b(f, false, (izs) x), "UserProfileBaseInfoSecondaryInfo");
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f2 = kqu0.t;
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.h(f2, dt1.a.o), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            String str = cVar.b;
            UserProfileBaseInfoState.c.a aVar3 = cVar.c;
            if (str == null || drm0.N(str)) {
                M.K(1796075775);
            } else {
                M.K(1807310082);
                j(cVar.b, M, 0);
            }
            M.j();
            if (aVar3 == null) {
                M.K(1807395641);
            } else {
                M.K(1807395642);
                l(aVar3, M, 6);
            }
            M.j();
            if (cVar.d) {
                M.K(1807491866);
                i(cVar.a, M, 0);
            } else {
                M.K(1796075775);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new i(cVar, i, 19);
        }
    }

    public static final void i(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(475064379);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(475064379, i2, -1, "com.vk.profile.design.view.profileheader.SecondaryInfoDetailed (UserProfileBaseInfoView.kt:359)");
            }
            q630 E = ahn.E(q630.a.a, "UserProfileBaseInfoSecondaryInfoDetailed");
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            f(R.drawable.vk_icon_info_outline_16, 0, M);
            if (str == null) {
                M.K(569734231);
            } else {
                M.K(569734232);
                k(str, M, i2 & 14);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new k87(str, i, 12);
        }
    }

    public static final void j(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2140322602);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2140322602, i2, -1, "com.vk.profile.design.view.profileheader.SecondaryInfoLocation (UserProfileBaseInfoView.kt:331)");
            }
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            f(R.drawable.vk_icon_place_outline_16, 0, M);
            k(str, M, i2 & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new u05(str, i, 11);
        }
    }

    public static final void k(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1295655842);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1295655842, i2, -1, "com.vk.profile.design.view.profileheader.SecondaryInfoText (UserProfileBaseInfoView.kt:372)");
            }
            f9t.e(txj0.v(q630.a.a, kqu0.s), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, null, ylu0Var.getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, (i2 & 14) | 100663296, 48, 5882);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new vp4(str, i, 9);
        }
    }

    public static final void l(UserProfileBaseInfoState.c.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1301648249);
        int i2 = (M.J(aVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1301648249, i2, -1, "com.vk.profile.design.view.profileheader.SecondaryInfoUserActivity (UserProfileBaseInfoView.kt:339)");
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, xpyVar);
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
            String str = aVar.c;
            if (str == null || drm0.N(str)) {
                M.K(582598591);
                f(aVar.b, 0, M);
                M.j();
            } else {
                M.K(582381405);
                r0v0.a(fwu0.l(aVar.c, null, null, null, M, 0, 62), rte0.d(txj0.q(q630.a.a, 16), vog0.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
                M = M;
                M.j();
            }
            k(aVar.a, M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new p0h(aVar, i, 3);
        }
    }

    public static final void m(UserProfileBaseInfoState.b bVar, izs<? super com.vk.profile.design.view.profileheader.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2062800237);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2062800237, i2, -1, "com.vk.profile.design.view.profileheader.StatusImage (UserProfileBaseInfoView.kt:191)");
            }
            q630 d = rte0.d(txj0.q(q630.a.a, 24), a);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new th2(izsVar, 12);
                M.R(x);
            }
            pzu0.b(fwu0.l(bVar.a, null, null, null, M, 0, 62), bVar.b, s200.D(ojc.c(d, false, null, null, (gzs) x, 15), kqu0.q), l5g.k, M, 3080, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new yb1(bVar, izsVar, i, 11);
        }
    }

    public static final void n(UserProfileBaseInfoState.d dVar, UserProfileBaseInfoState.b bVar, UserProfileBaseInfoState.VerifyInfo verifyInfo, izs<? super com.vk.profile.design.view.profileheader.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-997487925);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(verifyInfo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-997487925, i2, -1, "com.vk.profile.design.view.profileheader.UserName (UserProfileBaseInfoView.kt:145)");
            }
            int i3 = i2;
            String str = dVar.a;
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new hsc0(dVar, 22);
                M.R(x);
            }
            q630 E = ahn.E(egi0.b(f, false, (izs) x), "UserProfileBaseInfoUsername");
            a.c cVar = androidx.compose.foundation.layout.a.e;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jrv0.a(str, E, j, 3, cVar, wuv0Var.f, kai.c(-361954481, new nwo(bVar, verifyInfo, izsVar), M), M, 817889712);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new eku(dVar, bVar, verifyInfo, izsVar, i, 1);
        }
    }

    public static final void o(UserProfileBaseInfoState userProfileBaseInfoState, izs izsVar, int i, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-2092868568);
        int i3 = (M.J(userProfileBaseInfoState) ? 4 : 2) | i2 | (M.y(izsVar) ? 32 : 16) | (M.o(i) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2092868568, i3, -1, "com.vk.profile.design.view.profileheader.UserProfileBaseInfoContent (UserProfileBaseInfoView.kt:95)");
            }
            q630 d = rte0.d(txj0.f(q630.a.a, 1.0f), a);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new src(izsVar, 4);
                M.R(x);
            }
            q630 E = s200.E(ojc.c(d, false, null, null, (gzs) x, 15), kqu0.b, kqu0.s);
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.o;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.t), aVar2, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            UserProfileBaseInfoState.d dVar = userProfileBaseInfoState.a;
            String str = userProfileBaseInfoState.i;
            String str2 = userProfileBaseInfoState.h;
            UserProfileBaseInfoState.c cVar = userProfileBaseInfoState.f;
            String str3 = userProfileBaseInfoState.e;
            UserProfileBaseInfoState.a aVar4 = userProfileBaseInfoState.b;
            String str4 = userProfileBaseInfoState.c;
            n(dVar, userProfileBaseInfoState.d, userProfileBaseInfoState.g, izsVar, M, (i3 << 6) & 7168);
            if (str4 == null) {
                M.K(863696192);
            } else {
                M.K(863696193);
                a(str4, M, 0);
            }
            M.j();
            if (aVar4 == null) {
                M.K(863792106);
            } else {
                M.K(863792107);
                M.W(-2115232375, Integer.valueOf(i));
                c(aVar4, M, 0);
                M.a0();
            }
            M.j();
            if (str3 == null) {
                M.K(863937217);
            } else {
                M.K(863937218);
                g(i4, M, str3, izsVar);
            }
            M.j();
            if (cVar == null || !cVar.d) {
                M.K(858958308);
            } else {
                M.K(864053034);
                h(cVar, M, 0);
            }
            M.j();
            if (str2 == null) {
                M.K(864139399);
            } else {
                M.K(864139400);
                b(str2, M, 0);
            }
            M.j();
            if (str == null) {
                M.K(864228927);
            } else {
                M.K(864228928);
                e(i4, M, str, izsVar);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new pvi(userProfileBaseInfoState, izsVar, i, i2);
        }
    }

    public static final void p(UserProfileBaseInfoState.VerifyInfo verifyInfo, izs<? super com.vk.profile.design.view.profileheader.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1122617630);
        int i2 = (M.J(verifyInfo) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1122617630, i2, -1, "com.vk.profile.design.view.profileheader.VerifyIcon (UserProfileBaseInfoView.kt:210)");
            }
            lg90 p = w65.p(verifyInfo.a, M, 0);
            String str = verifyInfo.c;
            q630 d = rte0.d(txj0.q(q630.a.a, 24), a);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new t9b(19, verifyInfo, izsVar);
                M.R(x);
            }
            pzu0.b(p, str, s200.D(ojc.c(d, false, null, null, (gzs) x, 15), kqu0.q), 0L, M, 8, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new h0k(verifyInfo, izsVar, i, 8);
        }
    }
}
