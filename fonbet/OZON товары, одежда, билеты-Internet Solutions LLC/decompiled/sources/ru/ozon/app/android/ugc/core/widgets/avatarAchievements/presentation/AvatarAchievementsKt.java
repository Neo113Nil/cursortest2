package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import B1.B;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import Tc.b;
import WZ.t;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5239d1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import e1.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.ActiveTooltip;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.AnimatedTooltipKt;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.composer.compose.widget.scrollable.f;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00022\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aw\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001a\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009d\u0001\u0010'\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00022\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u00022\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b'\u0010(\u001a\u0097\u0001\u0010*\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00022\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u00022\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b*\u0010+\u001a#\u00102\u001a\u00020\u0005*\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0003¢\u0006\u0004\b0\u00101¨\u00066²\u0006\u0010\u00103\u001a\u0004\u0018\u00010%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00105\u001a\u0004\u0018\u0001048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "item", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "", "", "shouldShowTooltip", "onTooltipShown", "Lkotlin/Function0;", "onTooltipClosed", "AvatarAchievements", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "AvatarAchievementsContent", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "avatar", "AvatarIcon", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lu0/b;", "AvatarBadge", "(Lu0/b;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AchievementVO;", "achievements", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "paddings", "isTooltipClosed", "isDarkTheme", "activeTooltipKey", "isWidgetVisible", "Lru/ozon/app/android/pdp/ui/configurators/tooltip/ActiveTooltip;", "onTooltipRequest", "AchievementsRow", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;ZZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "achievement", "AchievementItem", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AchievementVO;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Ll1/Z;", "strokeColor", "AchievementBadge-XO-JAsU", "(Lu0/b;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;JLS0/k;I)V", "AchievementBadge", "activeTooltip", "LB1/B;", "tooltipAnchorCoordinates", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AvatarAchievementsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AchievementBadge-XO-JAsU, reason: not valid java name */
    public static final void m1463AchievementBadgeXOJAsU(InterfaceC9893b interfaceC9893b, BadgeDTO badgeDTO, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        BadgeDTO badgeDTO2;
        C3969l u11 = interfaceC3967k.u(-1936186138);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(badgeDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            badgeDTO2 = badgeDTO;
        } else {
            e a11 = interfaceC9893b.a(e.f40358c0, InterfaceC6250b.a.m());
            u11.o(1540956115);
            boolean z11 = (i12 & 896) == 256;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AvatarAchievementsKt$AchievementBadge$1$1(j11);
                u11.x(C11);
            }
            u11.k();
            badgeDTO2 = badgeDTO;
            DsBadgeAtomKt.DsBadgeAtom(badgeDTO2, c.d(a11, (Function1) C11), null, u11, (i12 >> 3) & 14, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AvatarAchievementsKt$AchievementBadge$2(interfaceC9893b, badgeDTO2, j11, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f0, code lost:
    
        if (r8 == null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AchievementItem(e eVar, AvatarAchievementsVO.AchievementVO achievementVO, boolean z11, boolean z12, boolean z13, String str, Function1<? super AtomAction, Unit> function1, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function1<? super ActiveTooltip, Unit> function14, InterfaceC3967k interfaceC3967k, int i11) {
        e eVar2;
        int i12;
        B b11;
        Boolean bool;
        Boolean bool2;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-624405984);
        if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i12 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(achievementVO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.p(z13) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(str) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(function12) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(function13) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= u11.F(function14) ? 536870912 : 268435456;
        }
        if ((i12 & 306783379) == 306783378 && u11.b()) {
            u11.j();
        } else {
            ImageDTO darkThemeImage = achievementVO.getDarkThemeImage();
            if (darkThemeImage != null) {
                if (!z12) {
                    darkThemeImage = null;
                }
            }
            darkThemeImage = achievementVO.getDefaultImage();
            u11.o(-978877976);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            e c11 = a0.c(eVar2);
            u11.o(-978870052);
            int i13 = i12 & 112;
            int i14 = i12;
            boolean z14 = (i13 == 32) | ((i12 & 3670016) == 1048576);
            Object C12 = u11.C();
            if (z14 || C12 == InterfaceC3967k.a.a()) {
                C12 = new AvatarAchievementsKt$AchievementItem$1$1(achievementVO, function1);
                u11.x(C12);
            }
            u11.k();
            e b12 = i.b(c11, null, null, false, null, null, (Function0) C12, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.m(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, b12);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            u11.o(-342336744);
            e a12 = c5187j.a(e.f40358c0, InterfaceC6250b.a.e());
            if (achievementVO.getTooltip() != null) {
                u11.o(1468382102);
                Object C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = new AvatarAchievementsKt$AchievementItem$2$1$1$1(interfaceC3978p0);
                    u11.x(C13);
                }
                u11.k();
                a12 = androidx.compose.ui.layout.c.a(a12, (Function1) C13);
            }
            u11.k();
            DsImageAtomKt.DsImageAtom(darkThemeImage, a12, u11, 0, 0);
            BadgeDTO counter = achievementVO.getCounter();
            u11.o(-342328063);
            if (counter != null) {
                C7807Z c7807z = TokenParserKt.tokenToColor(achievementVO.getCounterStrokeColor(), u11, 0);
                u11.o(-342324802);
                long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                u11.k();
                m1463AchievementBadgeXOJAsU(c5187j, counter, layerFloor1, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.f();
            TooltipDTO tooltip = achievementVO.getTooltip();
            if (tooltip != null) {
                boolean d12 = Intrinsics.d(str, achievementVO.getTooltipKey());
                boolean z15 = (z11 || !z13 || AchievementItem$lambda$25(interfaceC3978p0) == null) ? false : true;
                Boolean valueOf = Boolean.valueOf(z15);
                Boolean valueOf2 = Boolean.valueOf(d12);
                B AchievementItem$lambda$25 = AchievementItem$lambda$25(interfaceC3978p0);
                u11.o(-342312147);
                boolean z16 = z15;
                boolean p11 = ((i14 & 1879048192) == 536870912) | u11.p(z15) | u11.p(d12) | ((i14 & 458752) == 131072) | ((i14 & 29360128) == 8388608) | (i13 == 32) | u11.F(tooltip) | ((i14 & 234881024) == 67108864);
                Object C14 = u11.C();
                if (p11 || C14 == InterfaceC3967k.a.a()) {
                    b11 = AchievementItem$lambda$25;
                    bool = valueOf;
                    bool2 = valueOf2;
                    c3969l = u11;
                    AvatarAchievementsKt$AchievementItem$3$1$1 avatarAchievementsKt$AchievementItem$3$1$1 = new AvatarAchievementsKt$AchievementItem$3$1$1(z16, d12, function14, str, function12, achievementVO, tooltip, function13, interfaceC3978p0, null);
                    c3969l.x(avatarAchievementsKt$AchievementItem$3$1$1);
                    C14 = avatarAchievementsKt$AchievementItem$3$1$1;
                } else {
                    c3969l = u11;
                    bool = valueOf;
                    bool2 = valueOf2;
                    b11 = AchievementItem$lambda$25;
                }
                c3969l.k();
                Q.f(bool, bool2, b11, (Function2) C14, c3969l);
                Unit unit2 = Unit.f71690a;
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new AvatarAchievementsKt$AchievementItem$4(eVar, achievementVO, z11, z12, z13, str, function1, function12, function13, function14, i11));
                    return;
                }
                return;
            }
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B AchievementItem$lambda$25(InterfaceC3978p0<B> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AchievementsRow(List<AvatarAchievementsVO.AchievementVO> list, AvatarAchievementsVO.PaddingsVO paddingsVO, boolean z11, boolean z12, String str, boolean z13, Function1<? super AtomAction, Unit> function1, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function1<? super ActiveTooltip, Unit> function14, InterfaceC3967k interfaceC3967k, int i11) {
        AvatarAchievementsVO.PaddingsVO paddingsVO2;
        boolean z14;
        Function1<? super AtomAction, Unit> function15;
        Function1<? super String, Boolean> function16;
        Function1<? super String, Unit> function17;
        Function1<? super ActiveTooltip, Unit> function18;
        C3969l c3969l;
        List<AvatarAchievementsVO.AchievementVO> list2 = list;
        C3969l u11 = interfaceC3967k.u(984015274);
        int i12 = (i11 & 6) == 0 ? (u11.F(list2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            paddingsVO2 = paddingsVO;
            i12 |= u11.n(paddingsVO2) ? 32 : 16;
        } else {
            paddingsVO2 = paddingsVO;
        }
        boolean z15 = z11;
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        boolean z16 = z12;
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z16) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(str) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            z14 = z13;
            i12 |= u11.p(z14) ? 131072 : 65536;
        } else {
            z14 = z13;
        }
        if ((1572864 & i11) == 0) {
            function15 = function1;
            i12 |= u11.F(function15) ? 1048576 : 524288;
        } else {
            function15 = function1;
        }
        if ((12582912 & i11) == 0) {
            function16 = function12;
            i12 |= u11.F(function16) ? 8388608 : 4194304;
        } else {
            function16 = function12;
        }
        if ((100663296 & i11) == 0) {
            function17 = function13;
            i12 |= u11.F(function17) ? 67108864 : 33554432;
        } else {
            function17 = function13;
        }
        if ((805306368 & i11) == 0) {
            function18 = function14;
            i12 |= u11.F(function18) ? 536870912 : 268435456;
        } else {
            function18 = function14;
        }
        if ((306783379 & i12) == 306783378 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            int i13 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(-paddingsVO2.getIntersectionPadding());
            d.b i14 = InterfaceC6250b.a.i();
            e.a aVar = e.f40358c0;
            Y b11 = X.b(n11, i14, u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(-952371978);
            int i15 = 0;
            for (int size = list2.size(); i15 < size; size = size) {
                AchievementItem(P.c(j.a(e.f40358c0, list2.size() - i15), -paddingsVO.getRightPadding(), 0.0f, 2), list2.get(i15), z15, z16, z14, str, function15, function16, function17, function18, u11, (i12 & 8064) | ((i12 >> 3) & 57344) | ((i12 << 3) & 458752) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (1879048192 & i12));
                i15++;
                list2 = list;
                z15 = z11;
                z16 = z12;
                z14 = z13;
                function15 = function1;
                function16 = function12;
                function17 = function13;
                function18 = function14;
            }
            c3969l = u11;
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new AvatarAchievementsKt$AchievementsRow$2(list, paddingsVO, z11, z12, str, z13, function1, function12, function13, function14, i11));
        }
    }

    public static final void AvatarAchievements(@NotNull AvatarAchievementsVO item, @NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> onClick, @NotNull Function1<? super String, Boolean> shouldShowTooltip, @NotNull Function1<? super String, Unit> onTooltipShown, @NotNull Function0<Unit> onTooltipClosed, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(shouldShowTooltip, "shouldShowTooltip");
        Intrinsics.checkNotNullParameter(onTooltipShown, "onTooltipShown");
        Intrinsics.checkNotNullParameter(onTooltipClosed, "onTooltipClosed");
        C3969l u11 = interfaceC3967k.u(-1070279133);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(shouldShowTooltip) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onTooltipShown) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onTooltipClosed) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            b builder = C7714v.B();
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                builder.add(tokenizedEvent);
            }
            List<AvatarAchievementsVO.AchievementVO> achievements = item.getAchievements();
            if (achievements == null) {
                achievements = K.f71697a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = achievements.iterator();
            while (it.hasNext()) {
                t tokenizedEvent2 = ((AvatarAchievementsVO.AchievementVO) it.next()).getTokenizedEvent();
                if (tokenizedEvent2 != null) {
                    arrayList.add(tokenizedEvent2);
                }
            }
            builder.addAll(arrayList);
            Intrinsics.checkNotNullParameter(builder, "builder");
            b B11 = builder.B();
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(2132819623);
            boolean F11 = ((i12 & 112) == 32) | u11.F(B11);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AvatarAchievementsKt$AvatarAchievements$1$1(B11, onView);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            AvatarAchievementsContent(null, item, onClick, shouldShowTooltip, onTooltipShown, onTooltipClosed, u11, ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AvatarAchievementsKt$AvatarAchievements$2(item, onView, onClick, shouldShowTooltip, onTooltipShown, onTooltipClosed, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AvatarAchievementsContent(e eVar, AvatarAchievementsVO avatarAchievementsVO, Function1<? super AtomAction, Unit> function1, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        AvatarAchievementsVO avatarAchievementsVO2;
        int i14;
        Function1<? super AtomAction, Unit> function14;
        int i15;
        Function1<? super String, Boolean> function15;
        int i16;
        Function1<? super String, Unit> function16;
        int i17;
        Function0<Unit> function02;
        int i18;
        Function1<? super String, Boolean> function17;
        Function0<Unit> function03;
        IconDTO.IconSize size;
        Object C11;
        Object b11;
        boolean booleanValue;
        e eVar3;
        e b12;
        int I11;
        List<AvatarAchievementsVO.AchievementVO> achievements;
        Function1<? super String, Unit> function18;
        Function1<? super AtomAction, Unit> function19;
        Function1<? super AtomAction, Unit> function110;
        e eVar4;
        Function0<Unit> function04;
        Function1<? super String, Boolean> function111;
        Function1<? super String, Unit> function112;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1365156302);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            avatarAchievementsVO2 = avatarAchievementsVO;
            i13 |= u11.n(avatarAchievementsVO2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function14 = function1;
                i13 |= u11.F(function14) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function15 = function12;
                    i13 |= u11.F(function15) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function16 = function13;
                        i13 |= u11.F(function16) ? 16384 : 8192;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                            function02 = function0;
                        } else {
                            function02 = function0;
                            if ((i11 & 196608) == 0) {
                                i13 |= u11.F(function02) ? 131072 : 65536;
                            }
                        }
                        i18 = i13;
                        if ((i18 & 74899) == 74898 || !u11.b()) {
                            e eVar5 = i19 != 0 ? e.f40358c0 : eVar2;
                            if (i14 != 0) {
                                u11.o(1715189167);
                                Object C12 = u11.C();
                                if (C12 == InterfaceC3967k.a.a()) {
                                    C12 = AvatarAchievementsKt$AvatarAchievementsContent$1$1.INSTANCE;
                                    u11.x(C12);
                                }
                                u11.k();
                                function14 = (Function1) C12;
                            }
                            if (i15 != 0) {
                                u11.o(1715190774);
                                Object C13 = u11.C();
                                if (C13 == InterfaceC3967k.a.a()) {
                                    C13 = AvatarAchievementsKt$AvatarAchievementsContent$2$1.INSTANCE;
                                    u11.x(C13);
                                }
                                u11.k();
                                function17 = (Function1) C13;
                            } else {
                                function17 = function15;
                            }
                            if (i16 != 0) {
                                u11.o(1715192399);
                                Object C14 = u11.C();
                                if (C14 == InterfaceC3967k.a.a()) {
                                    C14 = AvatarAchievementsKt$AvatarAchievementsContent$3$1.INSTANCE;
                                    u11.x(C14);
                                }
                                u11.k();
                                function16 = (Function1) C14;
                            }
                            if (i17 != 0) {
                                u11.o(1715193615);
                                Object C15 = u11.C();
                                if (C15 == InterfaceC3967k.a.a()) {
                                    C15 = AvatarAchievementsKt$AvatarAchievementsContent$4$1.INSTANCE;
                                    u11.x(C15);
                                }
                                function03 = (Function0) C15;
                                u11.k();
                            } else {
                                function03 = function02;
                            }
                            C7807Z c7807z = TokenParserKt.tokenToColor(avatarAchievementsVO2.getBackgroundColor(), u11, 0);
                            u11.o(1715194767);
                            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                            u11.k();
                            boolean isDarkThemeActive = ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                            size = avatarAchievementsVO2.getAvatar().getIcon().getSize();
                            if (size == null) {
                                size = IconDTO.IconSize.SIZE_700;
                            }
                            float m1462getVERTICAL_PADDINGD9Ej5fM = (2 * AvatarAchievementsDefaults.INSTANCE.m1462getVERTICAL_PADDINGD9Ej5fM()) + size.getSizeShape();
                            u11.o(1715204158);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = n1.f(null, D1.f25195a);
                                u11.x(C11);
                            }
                            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                            b11 = h.b(u11, 1715206607);
                            if (b11 == InterfaceC3967k.a.a()) {
                                b11 = n1.f(Boolean.FALSE, D1.f25195a);
                                u11.x(b11);
                            }
                            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) b11;
                            u11.k();
                            booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
                            u11.o(1715211426);
                            if (booleanValue) {
                                eVar3 = eVar5;
                            } else {
                                u11.o(-115045491);
                                boolean z11 = (i18 & 458752) == 131072;
                                Object C16 = u11.C();
                                if (z11 || C16 == InterfaceC3967k.a.a()) {
                                    C16 = new AvatarAchievementsKt$AvatarAchievementsContent$5$1$1(function03, interfaceC3978p02, interfaceC3978p0);
                                    u11.x(C16);
                                }
                                u11.k();
                                eVar3 = f.b(eVar5, (Function1) C16);
                            }
                            u11.k();
                            b12 = androidx.compose.foundation.e.b(a0.e(a0.f(eVar3, m1462getVERTICAL_PADDINGD9Ej5fM), 1.0f), layerFloor1, y0.a());
                            e j11 = T.j(b12, avatarAchievementsVO2.getPaddings().getLeftPadding(), 0.0f, 0.0f, 0.0f, 14);
                            Y b13 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f7 = androidx.compose.ui.c.f(u11, j11);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 h11 = Cm.e.h(u11, b13, u11, d11);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                a.d(I11, u11, I11, h11);
                            }
                            F1.b(u11, f7, InterfaceC2801g.a.f());
                            AvatarIcon(avatarAchievementsVO2.getAvatar(), function14, u11, (i18 >> 3) & 112);
                            achievements = avatarAchievementsVO2.getAchievements();
                            u11.o(-115023456);
                            if (achievements == null) {
                                function19 = function14;
                                function18 = function16;
                            } else {
                                AvatarAchievementsVO.PaddingsVO paddings = avatarAchievementsVO.getPaddings();
                                function18 = function16;
                                Function1<? super AtomAction, Unit> function113 = function14;
                                boolean isTooltipClosed = avatarAchievementsVO.getIsTooltipClosed();
                                boolean AvatarAchievementsContent$lambda$11 = AvatarAchievementsContent$lambda$11(interfaceC3978p02);
                                ActiveTooltip AvatarAchievementsContent$lambda$8 = AvatarAchievementsContent$lambda$8(interfaceC3978p0);
                                String key = AvatarAchievementsContent$lambda$8 != null ? AvatarAchievementsContent$lambda$8.getKey() : null;
                                u11.o(671928353);
                                Object C17 = u11.C();
                                if (C17 == InterfaceC3967k.a.a()) {
                                    C17 = new AvatarAchievementsKt$AvatarAchievementsContent$6$1$1$1(interfaceC3978p0);
                                    u11.x(C17);
                                }
                                Function1 function114 = (Function1) C17;
                                u11.k();
                                int i21 = i18 << 12;
                                AchievementsRow(achievements, paddings, isTooltipClosed, isDarkThemeActive, key, AvatarAchievementsContent$lambda$11, function113, function17, function18, function114, u11, (3670016 & i21) | 805306368 | (29360128 & i21) | (i21 & 234881024));
                                function19 = function113;
                                u11 = u11;
                                Unit unit = Unit.f71690a;
                            }
                            u11.k();
                            u11.f();
                            Function0<Unit> function05 = function03;
                            AnimatedTooltipKt.AnimatedTooltip(AvatarAchievementsContent$lambda$8(interfaceC3978p0), function05, false, false, u11, ActiveTooltip.$stable | ((i18 >> 12) & 112), 12);
                            function110 = function19;
                            eVar4 = eVar5;
                            function04 = function05;
                            function111 = function17;
                            function112 = function18;
                        } else {
                            u11.j();
                            eVar4 = eVar2;
                            function111 = function15;
                            function112 = function16;
                            function04 = function02;
                            function110 = function14;
                        }
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new AvatarAchievementsKt$AvatarAchievementsContent$7(eVar4, avatarAchievementsVO, function110, function111, function112, function04, i11, i12));
                            return;
                        }
                        return;
                    }
                    function16 = function13;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    i18 = i13;
                    if ((i18 & 74899) == 74898) {
                    }
                    if (i19 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    C7807Z c7807z2 = TokenParserKt.tokenToColor(avatarAchievementsVO2.getBackgroundColor(), u11, 0);
                    u11.o(1715194767);
                    long layerFloor12 = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z2.w();
                    u11.k();
                    boolean isDarkThemeActive2 = ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                    size = avatarAchievementsVO2.getAvatar().getIcon().getSize();
                    if (size == null) {
                    }
                    float m1462getVERTICAL_PADDINGD9Ej5fM2 = (2 * AvatarAchievementsDefaults.INSTANCE.m1462getVERTICAL_PADDINGD9Ej5fM()) + size.getSizeShape();
                    u11.o(1715204158);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C11;
                    b11 = h.b(u11, 1715206607);
                    if (b11 == InterfaceC3967k.a.a()) {
                    }
                    InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) b11;
                    u11.k();
                    booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
                    u11.o(1715211426);
                    if (booleanValue) {
                    }
                    u11.k();
                    b12 = androidx.compose.foundation.e.b(a0.e(a0.f(eVar3, m1462getVERTICAL_PADDINGD9Ej5fM2), 1.0f), layerFloor12, y0.a());
                    e j112 = T.j(b12, avatarAchievementsVO2.getPaddings().getLeftPadding(), 0.0f, 0.0f, 0.0f, 14);
                    Y b132 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f72 = androidx.compose.ui.c.f(u11, j112);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h112 = Cm.e.h(u11, b132, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, h112);
                    F1.b(u11, f72, InterfaceC2801g.a.f());
                    AvatarIcon(avatarAchievementsVO2.getAvatar(), function14, u11, (i18 >> 3) & 112);
                    achievements = avatarAchievementsVO2.getAchievements();
                    u11.o(-115023456);
                    if (achievements == null) {
                    }
                    u11.k();
                    u11.f();
                    Function0<Unit> function052 = function03;
                    AnimatedTooltipKt.AnimatedTooltip(AvatarAchievementsContent$lambda$8(interfaceC3978p03), function052, false, false, u11, ActiveTooltip.$stable | ((i18 >> 12) & 112), 12);
                    function110 = function19;
                    eVar4 = eVar5;
                    function04 = function052;
                    function111 = function17;
                    function112 = function18;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                function15 = function12;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function16 = function13;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                i18 = i13;
                if ((i18 & 74899) == 74898) {
                }
                if (i19 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                C7807Z c7807z22 = TokenParserKt.tokenToColor(avatarAchievementsVO2.getBackgroundColor(), u11, 0);
                u11.o(1715194767);
                long layerFloor122 = c7807z22 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z22.w();
                u11.k();
                boolean isDarkThemeActive22 = ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                size = avatarAchievementsVO2.getAvatar().getIcon().getSize();
                if (size == null) {
                }
                float m1462getVERTICAL_PADDINGD9Ej5fM22 = (2 * AvatarAchievementsDefaults.INSTANCE.m1462getVERTICAL_PADDINGD9Ej5fM()) + size.getSizeShape();
                u11.o(1715204158);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p032 = (InterfaceC3978p0) C11;
                b11 = h.b(u11, 1715206607);
                if (b11 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) b11;
                u11.k();
                booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
                u11.o(1715211426);
                if (booleanValue) {
                }
                u11.k();
                b12 = androidx.compose.foundation.e.b(a0.e(a0.f(eVar3, m1462getVERTICAL_PADDINGD9Ej5fM22), 1.0f), layerFloor122, y0.a());
                e j1122 = T.j(b12, avatarAchievementsVO2.getPaddings().getLeftPadding(), 0.0f, 0.0f, 0.0f, 14);
                Y b1322 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f722 = androidx.compose.ui.c.f(u11, j1122);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h1122 = Cm.e.h(u11, b1322, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h1122);
                F1.b(u11, f722, InterfaceC2801g.a.f());
                AvatarIcon(avatarAchievementsVO2.getAvatar(), function14, u11, (i18 >> 3) & 112);
                achievements = avatarAchievementsVO2.getAchievements();
                u11.o(-115023456);
                if (achievements == null) {
                }
                u11.k();
                u11.f();
                Function0<Unit> function0522 = function03;
                AnimatedTooltipKt.AnimatedTooltip(AvatarAchievementsContent$lambda$8(interfaceC3978p032), function0522, false, false, u11, ActiveTooltip.$stable | ((i18 >> 12) & 112), 12);
                function110 = function19;
                eVar4 = eVar5;
                function04 = function0522;
                function111 = function17;
                function112 = function18;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            function14 = function1;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function15 = function12;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function16 = function13;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            i18 = i13;
            if ((i18 & 74899) == 74898) {
            }
            if (i19 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            C7807Z c7807z222 = TokenParserKt.tokenToColor(avatarAchievementsVO2.getBackgroundColor(), u11, 0);
            u11.o(1715194767);
            long layerFloor1222 = c7807z222 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z222.w();
            u11.k();
            boolean isDarkThemeActive222 = ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
            size = avatarAchievementsVO2.getAvatar().getIcon().getSize();
            if (size == null) {
            }
            float m1462getVERTICAL_PADDINGD9Ej5fM222 = (2 * AvatarAchievementsDefaults.INSTANCE.m1462getVERTICAL_PADDINGD9Ej5fM()) + size.getSizeShape();
            u11.o(1715204158);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            InterfaceC3978p0 interfaceC3978p0322 = (InterfaceC3978p0) C11;
            b11 = h.b(u11, 1715206607);
            if (b11 == InterfaceC3967k.a.a()) {
            }
            InterfaceC3978p0 interfaceC3978p02222 = (InterfaceC3978p0) b11;
            u11.k();
            booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
            u11.o(1715211426);
            if (booleanValue) {
            }
            u11.k();
            b12 = androidx.compose.foundation.e.b(a0.e(a0.f(eVar3, m1462getVERTICAL_PADDINGD9Ej5fM222), 1.0f), layerFloor1222, y0.a());
            e j11222 = T.j(b12, avatarAchievementsVO2.getPaddings().getLeftPadding(), 0.0f, 0.0f, 0.0f, 14);
            Y b13222 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f7222 = androidx.compose.ui.c.f(u11, j11222);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h11222 = Cm.e.h(u11, b13222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h11222);
            F1.b(u11, f7222, InterfaceC2801g.a.f());
            AvatarIcon(avatarAchievementsVO2.getAvatar(), function14, u11, (i18 >> 3) & 112);
            achievements = avatarAchievementsVO2.getAchievements();
            u11.o(-115023456);
            if (achievements == null) {
            }
            u11.k();
            u11.f();
            Function0<Unit> function05222 = function03;
            AnimatedTooltipKt.AnimatedTooltip(AvatarAchievementsContent$lambda$8(interfaceC3978p0322), function05222, false, false, u11, ActiveTooltip.$stable | ((i18 >> 12) & 112), 12);
            function110 = function19;
            eVar4 = eVar5;
            function04 = function05222;
            function111 = function17;
            function112 = function18;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        avatarAchievementsVO2 = avatarAchievementsVO;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function14 = function1;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function15 = function12;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function16 = function13;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        i18 = i13;
        if ((i18 & 74899) == 74898) {
        }
        if (i19 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        C7807Z c7807z2222 = TokenParserKt.tokenToColor(avatarAchievementsVO2.getBackgroundColor(), u11, 0);
        u11.o(1715194767);
        long layerFloor12222 = c7807z2222 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z2222.w();
        u11.k();
        boolean isDarkThemeActive2222 = ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
        size = avatarAchievementsVO2.getAvatar().getIcon().getSize();
        if (size == null) {
        }
        float m1462getVERTICAL_PADDINGD9Ej5fM2222 = (2 * AvatarAchievementsDefaults.INSTANCE.m1462getVERTICAL_PADDINGD9Ej5fM()) + size.getSizeShape();
        u11.o(1715204158);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p03222 = (InterfaceC3978p0) C11;
        b11 = h.b(u11, 1715206607);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p022222 = (InterfaceC3978p0) b11;
        u11.k();
        booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
        u11.o(1715211426);
        if (booleanValue) {
        }
        u11.k();
        b12 = androidx.compose.foundation.e.b(a0.e(a0.f(eVar3, m1462getVERTICAL_PADDINGD9Ej5fM2222), 1.0f), layerFloor12222, y0.a());
        e j112222 = T.j(b12, avatarAchievementsVO2.getPaddings().getLeftPadding(), 0.0f, 0.0f, 0.0f, 14);
        Y b132222 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f72222 = androidx.compose.ui.c.f(u11, j112222);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112222 = Cm.e.h(u11, b132222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112222);
        F1.b(u11, f72222, InterfaceC2801g.a.f());
        AvatarIcon(avatarAchievementsVO2.getAvatar(), function14, u11, (i18 >> 3) & 112);
        achievements = avatarAchievementsVO2.getAchievements();
        u11.o(-115023456);
        if (achievements == null) {
        }
        u11.k();
        u11.f();
        Function0<Unit> function052222 = function03;
        AnimatedTooltipKt.AnimatedTooltip(AvatarAchievementsContent$lambda$8(interfaceC3978p03222), function052222, false, false, u11, ActiveTooltip.$stable | ((i18 >> 12) & 112), 12);
        function110 = function19;
        eVar4 = eVar5;
        function04 = function052222;
        function111 = function17;
        function112 = function18;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final boolean AvatarAchievementsContent$lambda$11(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvatarAchievementsContent$lambda$12(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveTooltip AvatarAchievementsContent$lambda$8(InterfaceC3978p0<ActiveTooltip> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AvatarBadge(InterfaceC9893b interfaceC9893b, AvatarAchievementsVO.AvatarVO avatarVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(642733346);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(avatarVO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else if (avatarVO.getBadge() != null) {
            e.a aVar = e.f40358c0;
            e v11 = a0.v(P.c(interfaceC9893b.a(aVar, InterfaceC6250b.a.b()), 0.0f, (float) 2.5d, 1), null, 1);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, v11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            u11.o(442184195);
            if (avatarVO.getIsTopAuthor()) {
                float f13 = 3;
                C8366G.a(G1.e.a(R$drawable.bg_top_author_badge_ribbon_left, u11, 0), null, P.b(c5187j.a(aVar, InterfaceC6250b.a.h()), -9, f13), null, InterfaceC2547p.a.d(), 0.0f, null, u11, 24624, 104);
                c3969l = u11;
                C8366G.a(G1.e.a(R$drawable.bg_top_author_badge_ribbon_right, u11, 0), null, P.b(c5187j.a(aVar, InterfaceC6250b.a.f()), 9, f13), null, InterfaceC2547p.a.d(), 0.0f, null, c3969l, 24624, 104);
            } else {
                c3969l = u11;
            }
            c3969l.k();
            DsBadgeAtomKt.DsBadgeAtom(avatarVO.getBadge(), a0.t(aVar, 0.0f, 82, 1), function1, c3969l, (i12 & 896) | 48, 0);
            c3969l.f();
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new AvatarAchievementsKt$AvatarBadge$2(interfaceC9893b, avatarVO, function1, i11));
                return;
            }
            return;
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvatarIcon(AvatarAchievementsVO.AvatarVO avatarVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C5187j c5187j;
        C3969l u11 = interfaceC3967k.u(-1207650289);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(avatarVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            IconDTO.IconSize size = avatarVO.getIcon().getSize();
            if (size == null) {
                size = IconDTO.IconSize.SIZE_700;
            }
            float sizeShape = size.getSizeShape();
            e.a aVar = e.f40358c0;
            e n11 = a0.n(aVar, sizeShape);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, n11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            u11.o(-1331545180);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AvatarAchievementsKt$AvatarIcon$1$1$1(avatarVO, function1);
                u11.x(C11);
            }
            u11.k();
            DsIconAtomKt.DsIconAtom(avatarVO.getIcon(), i.b(aVar, null, null, false, null, null, (Function0) C11, 28), u11, IconDTO.$stable, 0);
            u11.o(-1331541480);
            if (avatarVO.getIsTopAuthor()) {
                c5187j = c5187j2;
                C8366G.a(G1.e.a(R$drawable.bg_circle_with_laurels_social_profile, u11, 0), null, a0.x(a0.i(aVar, sizeShape + 1), null, 1), null, InterfaceC2547p.a.d(), 0.0f, null, u11, 24624, 104);
            } else {
                c5187j = c5187j2;
            }
            u11.k();
            int i13 = i12 << 3;
            AvatarBadge(c5187j, avatarVO, function1, u11, (i13 & 896) | (i13 & 112) | 6);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AvatarAchievementsKt$AvatarIcon$2(avatarVO, function1, i11));
        }
    }
}
