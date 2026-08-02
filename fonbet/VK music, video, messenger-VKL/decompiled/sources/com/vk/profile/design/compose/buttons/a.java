package com.vk.profile.design.compose.buttons;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.alb0;
import xsna.aud0;
import xsna.bhu0;
import xsna.bn20;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.egi;
import xsna.gzs;
import xsna.h24;
import xsna.hr80;
import xsna.i3h;
import xsna.i66;
import xsna.iv90;
import xsna.izs;
import xsna.k9q0;
import xsna.kai;
import xsna.l5g;
import xsna.lc10;
import xsna.lg90;
import xsna.n34;
import xsna.pg90;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.rrv0;
import xsna.rv5;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ua8;
import xsna.wh50;
import xsna.wzs;
import xsna.xpy;
import xsna.ylu0;
import xsna.yzs;
import xsna.zhf0;

/* compiled from: ProfileButtonsContent.kt */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: ProfileButtonsContent.kt */
    /* renamed from: com.vk.profile.design.compose.buttons.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1653a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileButtons.ButtonType.values().length];
            try {
                iArr[ProfileButtons.ButtonType.Messages.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Message.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Subscribe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileButtons.ButtonType.BecomeFriends.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Write.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfileButtons.ButtonType.VKCall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Advertise.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Gift.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProfileButtons.ButtonType.OpenApp.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProfileButtons.ButtonType.OpenUrl.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProfileButtons.ButtonType.OpenInternalUrl.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Call.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProfileButtons.ButtonType.OpenInternalApp.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ProfileButtons.ButtonType.OpenBooking.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ProfileButtons.ButtonType.Email.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ProfileButtons.ButtonType.BellChecked.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ProfileButtons.ButtonType.BellUnChecked.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ProfileButtons.ButtonType buttonType, rv5 rv5Var, izs<? super ProfileButtons.b, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        rv5 rv5Var2;
        androidx.compose.runtime.a aVar2;
        lg90 Y0;
        androidx.compose.runtime.a M = aVar.M(607298322);
        if ((i & 6) == 0) {
            i2 = (M.o(buttonType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            rv5Var2 = rv5Var;
            i2 |= M.J(rv5Var2) ? 32 : 16;
        } else {
            rv5Var2 = rv5Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(607298322, i2, -1, "com.vk.profile.design.compose.buttons.CompactButton (ProfileButtonsContent.kt:98)");
            }
            int i3 = i2 & 14;
            if (b.d()) {
                b.f(-1018583737, i3, -1, "com.vk.profile.design.compose.buttons.resolveIcon (ProfileButtonsContent.kt:180)");
            }
            switch (C1653a.$EnumSwitchMapping$0[buttonType.ordinal()]) {
                case 6:
                case 12:
                    M.K(393583829);
                    qzu0.a.getClass();
                    Y0 = qzu0.Y0(M);
                    M.j();
                    break;
                case 7:
                default:
                    M.K(393599964);
                    qzu0.a.getClass();
                    Y0 = qzu0.f(M);
                    M.j();
                    break;
                case 8:
                    M.K(393598708);
                    if (b.d()) {
                        b.f(799264392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GiftOutline24> (VkSdkIcons.kt:994)");
                    }
                    Y0 = pg90.a(R.drawable.vk_icon_gift_outline_24, 0, M);
                    if (b.d()) {
                        b.e();
                    }
                    M.j();
                    break;
                case 9:
                case 10:
                case 11:
                    M.K(393580156);
                    qzu0.a.getClass();
                    Y0 = qzu0.f(M);
                    M.j();
                    break;
                case 13:
                    M.K(393586396);
                    if (b.d()) {
                        b.f(1573031794, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LegoServicesOutline28> (VkSdkIcons.kt:1914)");
                    }
                    Y0 = pg90.a(R.drawable.vk_icon_lego_services_outline_28, 0, M);
                    if (b.d()) {
                        b.e();
                    }
                    M.j();
                    break;
                case 14:
                    M.K(393589016);
                    if (b.d()) {
                        b.f(49016044, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CalendarOutline24> (VkSdkIcons.kt:180)");
                    }
                    Y0 = pg90.a(R.drawable.vk_icon_calendar_outline_24, 0, M);
                    if (b.d()) {
                        b.e();
                    }
                    M.j();
                    break;
                case 15:
                    M.K(393591260);
                    qzu0.a.getClass();
                    if (b.d()) {
                        b.f(1899735084, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoEnvelopeOutline24> (VkIcons.kt:4790)");
                    }
                    Y0 = pg90.a(R.drawable.vk_icon_lego_envelope_outline_24, 0, M);
                    if (b.d()) {
                        b.e();
                    }
                    M.j();
                    break;
                case 16:
                    M.K(393593816);
                    qzu0.a.getClass();
                    if (b.d()) {
                        b.f(-1687257338, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoBellOutline24> (VkIcons.kt:4298)");
                    }
                    Y0 = pg90.a(R.drawable.vk_icon_lego_bell_outline_24, 0, M);
                    if (b.d()) {
                        b.e();
                    }
                    M.j();
                    break;
                case 17:
                    M.K(393596284);
                    qzu0.a.getClass();
                    if (b.d()) {
                        b.f(1057251090, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoBellPlusOutline24> (VkIcons.kt:4302)");
                    }
                    Y0 = pg90.a(R.drawable.vk_icon_lego_bell_plus_outline_24, 0, M);
                    if (b.d()) {
                        b.e();
                    }
                    M.j();
                    break;
            }
            lg90 lg90Var = Y0;
            if (b.d()) {
                b.e();
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = k.b(zhf0.e);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            bn20 z = hr80.z();
            ButtonSize buttonSize = ButtonSize.Large;
            float w = z.w(buttonSize, M, 6);
            q630 s = txj0.s(ahn.E(q630.a.a, "author_header_button_compact"), w, w);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new iv90(1, wh50Var);
                M.R(x2);
            }
            q630 o = egi.o(s, (izs) x2);
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            long j = ylu0Var.getIcon().c;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new h24(izsVar, buttonType, wh50Var, 2);
                M.R(x3);
            }
            aVar2 = M;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, o, null, false, false, lg90Var, new l5g(j), null, null, null, null, null, null, false, rv5Var2, null, null, aVar2, 1073745328, (i2 << 21) & 234881024, 0, 3930592);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new i3h(i, 5, buttonType, rv5Var, izsVar);
        }
    }

    public static final void b(final ProfileButtons.a aVar, final boolean z, final rv5 rv5Var, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        rv5 rv5Var2;
        androidx.compose.runtime.a aVar3;
        f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        String str;
        int i3;
        androidx.compose.runtime.a M = aVar2.M(-552895599);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            rv5Var2 = rv5Var;
            i2 |= M.J(rv5Var2) ? 256 : 128;
        } else {
            rv5Var2 = rv5Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (b.d()) {
                b.f(-552895599, i2, -1, "com.vk.profile.design.compose.buttons.MainButton (ProfileButtonsContent.kt:131)");
            }
            ProfileButtons.c cVar = aVar.c;
            ProfileButtons.ButtonType buttonType = aVar.a;
            if (b.d()) {
                b.f(-1464834714, 0, -1, "com.vk.profile.design.compose.buttons.resolve (ProfileButtonsContent.kt:156)");
            }
            if (cVar instanceof ProfileButtons.c.b) {
                M.K(1043118486);
                if (b.d()) {
                    b.f(-1365965663, 0, -1, "com.vk.profile.design.compose.buttons.labelFromLocal (ProfileButtonsContent.kt:162)");
                }
                switch (C1653a.$EnumSwitchMapping$0[buttonType.ordinal()]) {
                    case 1:
                        i3 = R.string.author_header_community_button_messages;
                        break;
                    case 2:
                        i3 = R.string.author_header_button_message;
                        break;
                    case 3:
                        i3 = R.string.author_header_button_subscribe;
                        break;
                    case 4:
                        i3 = R.string.author_header_user_become_friends;
                        break;
                    case 5:
                        i3 = R.string.author_header_button_write;
                        break;
                    case 6:
                        i3 = R.string.author_header_button_call;
                        break;
                    case 7:
                        i3 = R.string.author_header_user_advertise;
                        break;
                    case 8:
                        i3 = R.string.author_header_button_gift;
                        break;
                    default:
                        throw new IllegalStateException(("Button " + buttonType + " should have string resource").toString());
                }
                str = d370.N(i3, 0, M);
                if (b.d()) {
                    b.e();
                }
                M.j();
            } else {
                if (!(cVar instanceof ProfileButtons.c.a)) {
                    throw alb0.c(1043116367, M);
                }
                M.K(1043120426);
                M.j();
                str = ((ProfileButtons.c.a) cVar).a;
            }
            String str2 = str;
            if (b.d()) {
                b.e();
            }
            if (str2 == null) {
                if (b.d()) {
                    b.e();
                }
                s = M.s();
                if (s != null) {
                    final rv5 rv5Var3 = rv5Var2;
                    wzsVar = new wzs() { // from class: xsna.bud0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            com.vk.profile.design.compose.buttons.a.b(ProfileButtons.a.this, z, rv5Var3, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = k.b(zhf0.e);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new lc10(2, wh50Var);
                M.R(x2);
            }
            q630 o = egi.o(q630Var, (izs) x2);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = z ? ButtonStyle.Primary : ButtonStyle.Secondary;
            Integer num = aVar.b;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new i66(izsVar, aVar, wh50Var, 2);
                M.R(x3);
            }
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, o, null, false, false, null, null, null, str2, num, null, null, null, false, rv5Var, null, null, M, 3120, (i2 << 18) & 234881024, 0, 3919840);
            aVar3 = M;
            if (b.d()) {
                b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        s = aVar3.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.cud0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.profile.design.compose.buttons.a.b(ProfileButtons.a.this, z, rv5Var, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void c(final ProfileButtons profileButtons, izs izsVar, q630 q630Var, final boolean z, rv5 rv5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ProfileButtons profileButtons2;
        int i3;
        final izs izsVar2 = izsVar;
        final rv5 rv5Var2 = rv5Var;
        androidx.compose.runtime.a M = aVar.M(-486488601);
        if ((i & 6) == 0) {
            i2 = (M.J(profileButtons) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(rv5Var2) ? 16384 : 8192;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (b.d()) {
                b.f(-486488601, i4, -1, "com.vk.profile.design.compose.buttons.ProfileButtonsContent (ProfileButtonsContent.kt:41)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            int i5 = i4 >> 6;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = j.a(g, dt1.a.k, M, 6);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            final ProfileButtons.a aVar3 = profileButtons.b;
            if (aVar3 != null) {
                M.K(1815085952);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                ua8.a(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, kai.c(1675312562, new yzs() { // from class: xsna.ztd0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        va8 va8Var = (va8) obj;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar4.J(va8Var) ? 4 : 2;
                        }
                        if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1675312562, intValue, -1, "com.vk.profile.design.compose.buttons.ProfileButtonsContent.<anonymous>.<anonymous> (ProfileButtonsContent.kt:49)");
                            }
                            float f = 8;
                            float j = (va8Var.j() - f) / 2;
                            a.j g2 = androidx.compose.foundation.layout.a.g(f);
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g2, dt1.a.k, aVar4, 6);
                            int hashCode2 = Long.hashCode(n34.n(aVar4));
                            sy90 D2 = aVar4.D();
                            q630.a aVar5 = q630.a.a;
                            q630 c2 = qri.c(aVar4, aVar5);
                            cri.h7.getClass();
                            LayoutNode.a aVar6 = cri.a.b;
                            if (aVar4.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar4.H();
                            if (aVar4.L()) {
                                aVar4.I(aVar6);
                            } else {
                                aVar4.f();
                            }
                            k9q0.w(aVar4, a2, cri.a.f);
                            k9q0.w(aVar4, D2, cri.a.e);
                            k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                            k9q0.t(aVar4, cri.a.h);
                            k9q0.w(aVar4, c2, cri.a.d);
                            ProfileButtons.a aVar7 = ProfileButtons.this.a;
                            boolean z2 = !z;
                            q630 E = ahn.E(txj0.x(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5), "author_header_button_primary");
                            rv5 rv5Var3 = rv5Var2;
                            izs izsVar3 = izsVar2;
                            com.vk.profile.design.compose.buttons.a.b(aVar7, z2, rv5Var3, izsVar3, E, aVar4, 0);
                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            com.vk.profile.design.compose.buttons.a.b(aVar3, false, rv5Var3, izsVar3, ahn.E(new xpy(1.0f, true), "author_header_button_secondary"), aVar4, 48);
                            aVar4.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 3072, 6);
                M.j();
                izsVar2 = izsVar;
                rv5Var2 = rv5Var;
                profileButtons2 = profileButtons;
                i3 = i4;
            } else {
                M.K(1816116454);
                ProfileButtons.a aVar4 = profileButtons.a;
                boolean z2 = !z;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                profileButtons2 = profileButtons;
                i3 = i4;
                b(aVar4, z2, rv5Var, izsVar, ahn.E(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "author_header_button_primary"), M, (i5 & 896) | ((i4 << 6) & 7168));
                rv5Var2 = rv5Var;
                izsVar2 = izsVar;
                M = M;
                M.j();
            }
            ProfileButtons.ButtonType buttonType = profileButtons2.c;
            if (buttonType == null) {
                M.K(1816481013);
            } else {
                M.K(1816481014);
                a(buttonType, rv5Var2, izsVar2, M, ((i3 >> 9) & 112) | ((i3 << 3) & 896));
            }
            M.j();
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            profileButtons2 = profileButtons;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new aud0(profileButtons2, izsVar2, q630Var, z, rv5Var2, i, 0);
        }
    }
}
