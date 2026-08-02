package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import Pk0.f;
import Pk0.h;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import Z1.d;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import i1.C6981a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m0.C7980b;
import m0.C7984d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import t1.InterfaceC9723a;
import u0.C9891D;
import u0.C9896e;
import u0.EnumC9909s;
import u0.InterfaceC9895d;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\t\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001ag\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010#\u001a\u00020\u0014*\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000eH\u0002¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b%\u0010&¨\u0006)²\u0006\f\u0010\u0002\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002"}, d2 = {"LS0/A1;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewState;", "viewState", "Lkotlin/Function1;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;", "", "onViewIntent", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onEvent", "MatchShoppingCardsView", "(LS0/A1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "hasCards", "isTeensModeEnabled", "Lkotlin/Function0;", CommentV3DTO.HEADER_FIELD_NAME, "Lu0/d;", "cardsDeck", "likeButton", "dislikeButton", "Landroidx/compose/ui/e;", "modifier", "ScreenLayout", "(ZZLkotlin/jvm/functions/Function2;Lfd/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;", "state", "badgeEnabled", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Header", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Header;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Ll1/Z;", "color", "", "fraction", "bottomLight", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/e;", "barsPadding", "(Landroidx/compose/ui/e;ZLS0/k;I)Landroidx/compose/ui/e;", "Lu0/x;", "systemBarPadding", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(MatchShoppingCardsVI.Header header, boolean z11, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        MatchShoppingCardsVI.Header header2;
        int i13;
        Function1<? super AtomAction, Unit> function12;
        e eVar2;
        String automatizationId;
        int I11;
        int I12;
        int I13;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(176214980);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            header2 = header;
        } else {
            header2 = header;
            if ((i11 & 6) == 0) {
                i13 = (u11.n(header2) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i11 & 384) == 0) {
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 1171) == 1170 || !u11.b()) {
                e eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                float f7 = 6;
                e j11 = T.j(eVar3, f7, 0.0f, f7, 8, 2);
                eVar2 = eVar3;
                TestInfo testInfo = header2.getTestInfo();
                automatizationId = testInfo == null ? testInfo.getAutomatizationId() : null;
                if (automatizationId == null) {
                    automatizationId = "";
                }
                e a11 = Q1.a(j11, automatizationId);
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, a11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f13 = E.f(u11, f11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                u11.o(98410214);
                if (header2.getLeftIcon() != null) {
                    e a13 = c5187j.a(e.f40358c0, InterfaceC6250b.a.h());
                    V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I14 = u11.I();
                    A0 d12 = u11.d();
                    e f15 = c.f(u11, a13);
                    Function0 a14 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a14);
                    } else {
                        u11.e();
                    }
                    Function2 f16 = E.f(u11, f14, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                        a.d(I14, u11, I14, f16);
                    }
                    F1.b(u11, f15, InterfaceC2801g.a.f());
                    DsIconButtonAtomKt.DsIconButtonAtom(header2.getLeftIcon(), null, false, function12, u11, IconButtonV3DTO.$stable | ((i13 << 3) & 7168), 6);
                    u11.f();
                }
                u11.k();
                e.a aVar = e.f40358c0;
                EnumC9909s enumC9909s = EnumC9909s.Max;
                e a15 = c5187j.a(M.a(M.c(aVar, enumC9909s), enumC9909s), InterfaceC6250b.a.e());
                V f17 = C5185h.f(InterfaceC6250b.a.o(), false);
                I12 = u11.I();
                A0 d13 = u11.d();
                e f18 = c.f(u11, a15);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a16);
                }
                Function2 f19 = E.f(u11, f17, u11, d13);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f19);
                }
                F1.b(u11, f18, InterfaceC2801g.a.f());
                DsBadgeAtomKt.DsBadgeAtom(header2.getBadge(), z11 ? C6981a.a(aVar, 0.4f) : aVar, function1, u11, i13 & 896, 0);
                u11 = u11;
                u11.o(1898686188);
                if (!z11) {
                    e d14 = a0.d(aVar);
                    u11.o(1898695304);
                    Object C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = MatchShoppingCardsViewKt$Header$1$2$2$1.INSTANCE;
                        u11.x(C11);
                    }
                    u11.k();
                    C5185h.a(i.b(d14, null, null, false, null, null, (Function0) C11, 28), u11, 0);
                }
                u11.k();
                u11.f();
                e a17 = c5187j.a(aVar, InterfaceC6250b.a.f());
                V f21 = C5185h.f(InterfaceC6250b.a.o(), false);
                I13 = u11.I();
                A0 d15 = u11.d();
                e f22 = c.f(u11, a17);
                Function0 a18 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a18);
                }
                Function2 f23 = E.f(u11, f21, u11, d15);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, f23);
                }
                F1.b(u11, f22, InterfaceC2801g.a.f());
                DsIconButtonAtomKt.DsIconButtonAtom(header2.getRightIcon(), null, false, function1, u11, IconButtonV3DTO.$stable | ((i13 << 3) & 7168), 6);
                u11.f();
                u11.f();
            } else {
                u11.j();
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new MatchShoppingCardsViewKt$Header$2(header2, z11, function1, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        float f72 = 6;
        e j112 = T.j(eVar3, f72, 0.0f, f72, 8, 2);
        eVar2 = eVar3;
        TestInfo testInfo2 = header2.getTestInfo();
        if (testInfo2 == null) {
        }
        if (automatizationId == null) {
        }
        e a112 = Q1.a(j112, automatizationId);
        V f112 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, a112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        u11.o(98410214);
        if (header2.getLeftIcon() != null) {
        }
        u11.k();
        e.a aVar2 = e.f40358c0;
        EnumC9909s enumC9909s2 = EnumC9909s.Max;
        e a152 = c5187j2.a(M.a(M.c(aVar2, enumC9909s2), enumC9909s2), InterfaceC6250b.a.e());
        V f172 = C5185h.f(InterfaceC6250b.a.o(), false);
        I12 = u11.I();
        A0 d132 = u11.d();
        e f182 = c.f(u11, a152);
        Function0 a162 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f192 = E.f(u11, f172, u11, d132);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, f192);
        F1.b(u11, f182, InterfaceC2801g.a.f());
        DsBadgeAtomKt.DsBadgeAtom(header2.getBadge(), z11 ? C6981a.a(aVar2, 0.4f) : aVar2, function1, u11, i13 & 896, 0);
        u11 = u11;
        u11.o(1898686188);
        if (!z11) {
        }
        u11.k();
        u11.f();
        e a172 = c5187j2.a(aVar2, InterfaceC6250b.a.f());
        V f212 = C5185h.f(InterfaceC6250b.a.o(), false);
        I13 = u11.I();
        A0 d152 = u11.d();
        e f222 = c.f(u11, a172);
        Function0 a182 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f232 = E.f(u11, f212, u11, d152);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, f232);
        F1.b(u11, f222, InterfaceC2801g.a.f());
        DsIconButtonAtomKt.DsIconButtonAtom(header2.getRightIcon(), null, false, function1, u11, IconButtonV3DTO.$stable | ((i13 << 3) & 7168), 6);
        u11.f();
        u11.f();
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void MatchShoppingCardsView(@NotNull A1<MatchShoppingCardsViewState> a12, @NotNull Function1<? super MatchShoppingCardsViewIntent, Unit> onViewIntent, @NotNull Function1<? super TokenizedTrackingInfo, Unit> onEvent, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1;
        C7980b c7980b;
        C7980b c7980b2;
        SwipeConfiguration swipeConfiguration;
        e b11;
        Function1<? super MatchShoppingCardsViewIntent, Unit> function1;
        Function1<? super TokenizedTrackingInfo, Unit> function12;
        C3969l c3969l;
        A1<MatchShoppingCardsViewState> viewState = a12;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onViewIntent, "onViewIntent");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        C3969l u11 = interfaceC3967k.u(-203768520);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(viewState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onViewIntent) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onEvent) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = onEvent;
            function1 = onViewIntent;
            c3969l = u11;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((D) C11).a();
            d dVar = (d) u11.m(K0.e());
            InterfaceC9723a interfaceC9723a = (InterfaceC9723a) u11.m(K0.i());
            List<MatchShoppingCardsVI.Card> visibleCards = MatchShoppingCardsView$lambda$0(viewState).getVisibleCards();
            u11.o(1840822697);
            boolean n11 = u11.n(visibleCards);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = C7984d.a(0.0f);
                u11.x(C12);
            }
            C7980b c7980b3 = (C7980b) C12;
            Object b12 = h.b(u11, 1840825297);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = C7984d.a(0.0f);
                u11.x(b12);
            }
            C7980b c7980b4 = (C7980b) b12;
            u11.k();
            boolean z11 = false;
            SwipeConfiguration rememberSwipeConfiguration = SwipeConfigurationKt.rememberSwipeConfiguration(u11, 0);
            u11.o(1840830729);
            boolean F11 = u11.F(interfaceC9723a);
            if ((i12 & 112) == 32) {
                z11 = true;
            }
            boolean F12 = F11 | z11 | u11.F(c7980b3) | u11.n(rememberSwipeConfiguration) | u11.F(c7980b4);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1(interfaceC9723a, onViewIntent, c7980b4, c7980b3, rememberSwipeConfiguration, null);
                c7980b = c7980b4;
                c7980b2 = c7980b3;
                swipeConfiguration = rememberSwipeConfiguration;
                u11.x(matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1);
            } else {
                matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 = C13;
                c7980b = c7980b4;
                c7980b2 = c7980b3;
                swipeConfiguration = rememberSwipeConfiguration;
            }
            InterfaceC6511n interfaceC6511n = (InterfaceC6511n) matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1;
            u11.k();
            b11 = c.b(e.f40358c0, C5236c1.a(), new MatchShoppingCardsViewKt$MatchShoppingCardsView$1(c7980b, viewState));
            boolean z12 = !MatchShoppingCardsView$lambda$0(viewState).getVisibleCards().isEmpty();
            boolean isTeensModeEnabled = MatchShoppingCardsView$lambda$0(viewState).getIsTeensModeEnabled();
            C4912a c11 = a1.c.c(1806674237, new MatchShoppingCardsViewKt$MatchShoppingCardsView$2(onViewIntent, viewState), u11);
            MatchShoppingCardsViewKt$MatchShoppingCardsView$3 matchShoppingCardsViewKt$MatchShoppingCardsView$3 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$3(onViewIntent, onEvent, a11, c7980b2, c7980b, swipeConfiguration, viewState, interfaceC6511n, dVar);
            function1 = onViewIntent;
            C7980b c7980b5 = c7980b;
            function12 = onEvent;
            viewState = a12;
            c3969l = u11;
            ScreenLayout(z12, isTeensModeEnabled, c11, a1.c.c(577376718, matchShoppingCardsViewKt$MatchShoppingCardsView$3, u11), a1.c.c(1798675263, new MatchShoppingCardsViewKt$MatchShoppingCardsView$4(c7980b5, a12, function12, a11, interfaceC6511n), u11), a1.c.c(-352807872, new MatchShoppingCardsViewKt$MatchShoppingCardsView$5(c7980b5, viewState, function12, a11, interfaceC6511n), u11), b11, c3969l, 224640, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new MatchShoppingCardsViewKt$MatchShoppingCardsView$6(viewState, function1, function12, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0(A1<MatchShoppingCardsViewState> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenLayout(boolean z11, boolean z12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC6511n<? super InterfaceC9895d, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int I11;
        int I12;
        int I13;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1190733758);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z12) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(interfaceC6511n) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(function22) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= u11.F(function23) ? 131072 : 65536;
        }
        int i14 = i12 & 64;
        if (i14 != 0) {
            i13 |= 1572864;
        } else if ((1572864 & i11) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 1048576 : 524288;
            if ((599187 & i13) == 599186 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                e barsPadding = barsPadding(eVar4, z12, u11, ((i13 >> 18) & 14) | (i13 & 112));
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, barsPadding);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                C9896e c9896e = C9896e.f99653a;
                int i15 = i13 >> 6;
                function2.invoke(u11, Integer.valueOf(i15 & 14));
                e.a aVar = e.f40358c0;
                e a13 = c9896e.a(a0.e(aVar, 1.0f), true);
                V f11 = C5185h.f(new e1.d(0.0f, -0.4f), false);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f12 = c.f(u11, a13);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 f13 = E.f(u11, f11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                C5194q a15 = C5193p.a(C5179b.b(), InterfaceC6250b.a.k(), u11, 6);
                I13 = u11.I();
                A0 d13 = u11.d();
                e f14 = c.f(u11, aVar);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a16);
                }
                Function2 g11 = b.g(u11, a15, u11, d13);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, g11);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                interfaceC6511n.invoke(c9896e, u11, Integer.valueOf(6 | (i15 & 112)));
                u11.o(-506240669);
                if (z11) {
                    e e11 = a0.e(aVar, 1.0f);
                    Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                    int I14 = u11.I();
                    A0 d14 = u11.d();
                    e f15 = c.f(u11, e11);
                    Function0 a17 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a17);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d14);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                        a.d(I14, u11, I14, h11);
                    }
                    F1.b(u11, f15, InterfaceC2801g.a.f());
                    C9891D c9891d = C9891D.f99599a;
                    u0.E.a(u11, c9891d.a(aVar, 1.0f, true));
                    function23.invoke(u11, Integer.valueOf((i13 >> 15) & 14));
                    u0.E.a(u11, a0.r(aVar, 16));
                    function22.invoke(u11, Integer.valueOf((i13 >> 12) & 14));
                    u0.E.a(u11, c9891d.a(aVar, 1.0f, true));
                    u11.f();
                }
                u11.k();
                u11.f();
                u11.f();
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new MatchShoppingCardsViewKt$ScreenLayout$2(z11, z12, function2, interfaceC6511n, function22, function23, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((599187 & i13) == 599186) {
        }
        if (i14 == 0) {
        }
        e barsPadding2 = barsPadding(eVar4, z12, u11, ((i13 >> 18) & 14) | (i13 & 112));
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, barsPadding2);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        C9896e c9896e2 = C9896e.f99653a;
        int i152 = i13 >> 6;
        function2.invoke(u11, Integer.valueOf(i152 & 14));
        e.a aVar2 = e.f40358c0;
        e a132 = c9896e2.a(a0.e(aVar2, 1.0f), true);
        V f112 = C5185h.f(new e1.d(0.0f, -0.4f), false);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f122 = c.f(u11, a132);
        Function0 a142 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        C5194q a152 = C5193p.a(C5179b.b(), InterfaceC6250b.a.k(), u11, 6);
        I13 = u11.I();
        A0 d132 = u11.d();
        e f142 = c.f(u11, aVar2);
        Function0 a162 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g112 = b.g(u11, a152, u11, d132);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, g112);
        F1.b(u11, f142, InterfaceC2801g.a.f());
        interfaceC6511n.invoke(c9896e2, u11, Integer.valueOf(6 | (i152 & 112)));
        u11.o(-506240669);
        if (z11) {
        }
        u11.k();
        u11.f();
        u11.f();
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final e barsPadding(e eVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        interfaceC3967k.o(-704286385);
        b11 = c.b(eVar, C5236c1.a(), new MatchShoppingCardsViewKt$barsPadding$1(z11));
        interfaceC3967k.k();
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e bottomLight(e eVar, Function0<C7807Z> function0, Function0<Float> function02) {
        return androidx.compose.ui.draw.c.d(eVar, new MatchShoppingCardsViewKt$bottomLight$1(function02, function0));
    }
}
