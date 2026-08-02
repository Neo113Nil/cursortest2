package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import A0.g;
import B1.V;
import B1.v0;
import D1.InterfaceC2801g;
import Ep.a;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.c;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u00006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\f\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0015\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u001b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "cards", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onEvent", "Landroidx/compose/ui/e;", "modifier", "topCardModifier", "CardsDeck", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LS0/k;II)V", "card", "onCellAction", "Card", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Lkotlin/Function0;", "image", "titleCell", "CardLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LS0/k;II)V", "LZ1/h;", "cornerRadius", "cardShadow-ziNgDLE", "(Landroidx/compose/ui/e;FLS0/k;I)Landroidx/compose/ui/e;", "cardShadow", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void Card(MatchShoppingCardsVI.Card card, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e b11;
        C3969l u11 = interfaceC3967k.u(1736877960);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(card) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            CellDTO.Settings settings = card.getProductInfo().getTitleCell().getSettings();
            String backgroundColor = settings != null ? settings.getBackgroundColor() : null;
            u11.o(178687387);
            C7807Z c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
            Object b12 = h.b(u11, 178688531);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = A0.h.b(24);
                u11.x(b12);
            }
            g gVar = (g) b12;
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(eVar, gVar), c7807z != null ? c7807z.w() : C7807Z.f72259m, y0.a());
            TestInfo testInfo = card.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            CardLayout(c.c(-451940369, new CardsKt$Card$1(card, gVar), u11), c.c(-279526288, new CardsKt$Card$2(card, function1), u11), Q1.a(b11, automatizationId), u11, 54, 0);
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CardsKt$Card$3(card, function1, eVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardLayout(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        C3969l u11 = interfaceC3967k.u(-150138581);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(function2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function22) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar;
            u11.o(-1361502869);
            boolean z11 = ((i13 & 112) == 32) | ((i13 & 14) == 4);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CardsKt$CardLayout$1$1(function22, function2);
                u11.x(C11);
            }
            u11.k();
            v0.b(eVar3, (Function2) C11, u11, (i13 >> 6) & 14, 0);
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CardsKt$CardLayout$2(function2, function22, eVar2, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a A[LOOP:0: B:49:0x015a->B:61:0x01be, LOOP_START, PHI: r5 r9
      0x015a: PHI (r5v9 int) = (r5v7 int), (r5v19 int) binds: [B:48:0x0158, B:61:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r9v4 int) = (r9v3 int), (r9v6 int) binds: [B:48:0x0158, B:61:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardsDeck(@NotNull List<MatchShoppingCardsVI.Card> cards, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super TokenizedTrackingInfo, Unit> onEvent, e eVar, e eVar2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar3;
        int i14;
        e eVar4;
        e eVar5;
        MatchShoppingCardsVI.Card card;
        boolean n11;
        Object C11;
        int I11;
        int size;
        e eVar6;
        e b11;
        J0 m02;
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        C3969l u11 = interfaceC3967k.u(1379590082);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(cards) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(onAction) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onEvent) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar3 = eVar;
            i13 |= u11.n(eVar3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                eVar4 = eVar2;
                i13 |= u11.n(eVar4) ? 16384 : 8192;
                if ((i13 & 9363) == 9362 || !u11.b()) {
                    eVar5 = i15 != 0 ? e.f40358c0 : eVar3;
                    e eVar7 = i14 != 0 ? e.f40358c0 : eVar4;
                    card = (MatchShoppingCardsVI.Card) C7714v.M(cards);
                    u11.G(-778589471, card);
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(-778587214);
                    int i16 = i13 & 896;
                    n11 = u11.n(card) | (i16 == 256);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CardsKt$CardsDeck$1$1(card, onEvent);
                        u11.x(C11);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C11, u11, 6);
                    u11.J();
                    V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = androidx.compose.ui.c.f(u11, eVar5);
                    Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    u11.o(-198721603);
                    size = cards.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i17 = size - 1;
                            MatchShoppingCardsVI.Card card2 = cards.get(size);
                            u11.G(1784902088, card2);
                            u11.o(1784904918);
                            boolean n12 = u11.n(card2) | (i16 == 256) | ((i13 & 112) == 32);
                            Object C12 = u11.C();
                            if (n12 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new CardsKt$CardsDeck$2$1$1$1(card2, onEvent, onAction);
                                u11.x(C12);
                            }
                            u11.k();
                            b11 = androidx.compose.ui.c.b(e.f40358c0, C5236c1.a(), new CardsKt$CardsDeck$2$1$2(card2, card, eVar7));
                            int i18 = i16;
                            Card(card2, (Function1) C12, b11, u11, 0, 0);
                            u11.J();
                            if (i17 < 0) {
                                break;
                            }
                            i16 = i18;
                            size = i17;
                        }
                    }
                    u11.k();
                    u11.f();
                    eVar6 = eVar7;
                } else {
                    u11.j();
                    eVar5 = eVar3;
                    eVar6 = eVar4;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new CardsKt$CardsDeck$3(cards, onAction, onEvent, eVar5, eVar6, i11, i12));
                    return;
                }
                return;
            }
            eVar4 = eVar2;
            if ((i13 & 9363) == 9362) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            card = (MatchShoppingCardsVI.Card) C7714v.M(cards);
            u11.G(-778589471, card);
            AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
            u11.o(-778587214);
            int i162 = i13 & 896;
            n11 = u11.n(card) | (i162 == 256);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = new CardsKt$CardsDeck$1$1(card, onEvent);
            u11.x(C11);
            u11.k();
            i.a(aVar2, null, (Function0) C11, u11, 6);
            u11.J();
            V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = androidx.compose.ui.c.f(u11, eVar5);
            Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            u11.o(-198721603);
            size = cards.size() - 1;
            if (size >= 0) {
            }
            u11.k();
            u11.f();
            eVar6 = eVar7;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar3 = eVar;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        eVar4 = eVar2;
        if ((i13 & 9363) == 9362) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        card = (MatchShoppingCardsVI.Card) C7714v.M(cards);
        u11.G(-778589471, card);
        AbstractC5434v.a aVar22 = AbstractC5434v.a.ON_RESUME;
        u11.o(-778587214);
        int i1622 = i13 & 896;
        n11 = u11.n(card) | (i1622 == 256);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new CardsKt$CardsDeck$1$1(card, onEvent);
        u11.x(C11);
        u11.k();
        i.a(aVar22, null, (Function0) C11, u11, 6);
        u11.J();
        V f722 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = androidx.compose.ui.c.f(u11, eVar5);
        Function0 a1122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        u11.o(-198721603);
        size = cards.size() - 1;
        if (size >= 0) {
        }
        u11.k();
        u11.f();
        eVar6 = eVar7;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cardShadow-ziNgDLE, reason: not valid java name */
    public static final e m813cardShadowziNgDLE(e eVar, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        interfaceC3967k.o(64530428);
        b11 = androidx.compose.ui.c.b(eVar, C5236c1.a(), new CardsKt$cardShadow$1(f7));
        interfaceC3967k.k();
        return b11;
    }
}
