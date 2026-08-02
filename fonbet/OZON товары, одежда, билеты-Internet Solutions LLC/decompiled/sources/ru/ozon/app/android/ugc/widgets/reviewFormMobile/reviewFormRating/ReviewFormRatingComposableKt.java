package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import D1.InterfaceC2801g;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l1.C7807Z;
import l1.y0;
import m0.C8004n;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aK\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "item", "LZ1/h;", "fullScreenRatingHeight", "Lkotlin/Function1;", "", "", "onSelected", "LWZ/t;", "onFullScreenAnalytics", "ReviewFormRatingComposable-DzVHIIc", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "ReviewFormRatingComposable", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "dto", "SafeRatingWrapper", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "", "resetKey", "actualOnSelected", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormRatingComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006a  */
    /* renamed from: ReviewFormRatingComposable-DzVHIIc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1532ReviewFormRatingComposableDzVHIIc(@NotNull ReviewFormRatingVO item, float f7, Function1<? super Float, Unit> function1, Function1<? super t, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super Float, Unit> function13;
        int i14;
        Function1<? super t, Unit> function14;
        Function1<? super Float, Unit> function15;
        Function1<? super t, Unit> function16;
        boolean z11;
        Object C11;
        int I11;
        Function1<? super Float, Unit> function17;
        Function1<? super t, Unit> function18;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(168922678);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.q(f7) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function13 = function1;
            i13 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                function14 = function12;
                i13 |= u11.F(function14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    if (i15 != 0) {
                        u11.o(1230534286);
                        Object C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = ReviewFormRatingComposableKt$ReviewFormRatingComposable$1$1.INSTANCE;
                            u11.x(C12);
                        }
                        function15 = (Function1) C12;
                        u11.k();
                    } else {
                        function15 = function13;
                    }
                    if (i14 != 0) {
                        u11.o(1230536142);
                        Object C13 = u11.C();
                        if (C13 == InterfaceC3967k.a.a()) {
                            C13 = ReviewFormRatingComposableKt$ReviewFormRatingComposable$2$1.INSTANCE;
                            u11.x(C13);
                        }
                        u11.k();
                        function16 = (Function1) C13;
                    } else {
                        function16 = function14;
                    }
                    Boolean valueOf = Boolean.valueOf(item.getIsRatingFullScreen());
                    u11.o(1230537974);
                    z11 = ((i13 & 14) == 4) | ((i13 & 7168) == 2048);
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1(item, function16, null);
                        u11.x(C11);
                    }
                    u11.k();
                    Q.e(u11, valueOf, (Function2) C11);
                    u11.o(1230556481);
                    e.a aVar = e.f40358c0;
                    e l02 = androidx.compose.animation.a.a(a0.e(aVar, 1.0f), C8004n.d(100, 0, null, 6), 2).l0((item.getIsRatingFullScreen() || Float.compare(f7, (float) 0) <= 0) ? a0.u(aVar, 3) : a0.f(aVar, f7));
                    if (item.getBackgroundColor() != null) {
                        C7807Z parseColorToken = TokenParserKt.parseColorToken(item.getBackgroundColor(), u11, 0);
                        u11.o(1230558512);
                        long layerFloor1 = parseColorToken == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : parseColorToken.w();
                        u11.k();
                        l02 = androidx.compose.foundation.e.b(l02, layerFloor1, y0.a());
                    }
                    u11.k();
                    C5194q a11 = C5193p.a(item.getIsRatingFullScreen() ? C5179b.b() : C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, l02);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        Ep.a.d(I11, u11, I11, g10);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    Function1<? super Float, Unit> function19 = function15;
                    SafeRatingWrapper(T.j(aVar, 6, 0.0f, 0.0f, item.getIsRatingFullScreen() ? 20 : 0, 6), item.getRating(), function19, u11, (i13 & 896) | (RatingDTO.$stable << 3), 0);
                    G.b((item.getIsRatingFullScreen() || item.getTitle() == null) ? false : true, null, androidx.compose.animation.b.h(C8004n.d(100, 0, null, 6), 2), androidx.compose.animation.b.i(C8004n.d(100, 0, null, 6), 2), null, a1.c.c(-1762173272, new ReviewFormRatingComposableKt$ReviewFormRatingComposable$5$1(item), u11), u11, 1600518, 18);
                    u11 = u11;
                    u11.f();
                    function17 = function19;
                    function18 = function16;
                } else {
                    u11.j();
                    function17 = function13;
                    function18 = function14;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ReviewFormRatingComposableKt$ReviewFormRatingComposable$6(item, f7, function17, function18, i11, i12));
                    return;
                }
                return;
            }
            function14 = function12;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            Boolean valueOf2 = Boolean.valueOf(item.getIsRatingFullScreen());
            u11.o(1230537974);
            z11 = ((i13 & 14) == 4) | ((i13 & 7168) == 2048);
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1(item, function16, null);
            u11.x(C11);
            u11.k();
            Q.e(u11, valueOf2, (Function2) C11);
            u11.o(1230556481);
            e.a aVar2 = e.f40358c0;
            e l022 = androidx.compose.animation.a.a(a0.e(aVar2, 1.0f), C8004n.d(100, 0, null, 6), 2).l0((item.getIsRatingFullScreen() || Float.compare(f7, (float) 0) <= 0) ? a0.u(aVar2, 3) : a0.f(aVar2, f7));
            if (item.getBackgroundColor() != null) {
            }
            u11.k();
            C5194q a112 = C5193p.a(item.getIsRatingFullScreen() ? C5179b.b() : C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, l022);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, g102);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            Function1<? super Float, Unit> function192 = function15;
            SafeRatingWrapper(T.j(aVar2, 6, 0.0f, 0.0f, item.getIsRatingFullScreen() ? 20 : 0, 6), item.getRating(), function192, u11, (i13 & 896) | (RatingDTO.$stable << 3), 0);
            G.b((item.getIsRatingFullScreen() || item.getTitle() == null) ? false : true, null, androidx.compose.animation.b.h(C8004n.d(100, 0, null, 6), 2), androidx.compose.animation.b.i(C8004n.d(100, 0, null, 6), 2), null, a1.c.c(-1762173272, new ReviewFormRatingComposableKt$ReviewFormRatingComposable$5$1(item), u11), u11, 1600518, 18);
            u11 = u11;
            u11.f();
            function17 = function192;
            function18 = function16;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function13 = function1;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        function14 = function12;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        Boolean valueOf22 = Boolean.valueOf(item.getIsRatingFullScreen());
        u11.o(1230537974);
        z11 = ((i13 & 14) == 4) | ((i13 & 7168) == 2048);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new ReviewFormRatingComposableKt$ReviewFormRatingComposable$3$1(item, function16, null);
        u11.x(C11);
        u11.k();
        Q.e(u11, valueOf22, (Function2) C11);
        u11.o(1230556481);
        e.a aVar22 = e.f40358c0;
        e l0222 = androidx.compose.animation.a.a(a0.e(aVar22, 1.0f), C8004n.d(100, 0, null, 6), 2).l0((item.getIsRatingFullScreen() || Float.compare(f7, (float) 0) <= 0) ? a0.u(aVar22, 3) : a0.f(aVar22, f7));
        if (item.getBackgroundColor() != null) {
        }
        u11.k();
        C5194q a1122 = C5193p.a(item.getIsRatingFullScreen() ? C5179b.b() : C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, l0222);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g1022);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        Function1<? super Float, Unit> function1922 = function15;
        SafeRatingWrapper(T.j(aVar22, 6, 0.0f, 0.0f, item.getIsRatingFullScreen() ? 20 : 0, 6), item.getRating(), function1922, u11, (i13 & 896) | (RatingDTO.$stable << 3), 0);
        G.b((item.getIsRatingFullScreen() || item.getTitle() == null) ? false : true, null, androidx.compose.animation.b.h(C8004n.d(100, 0, null, 6), 2), androidx.compose.animation.b.i(C8004n.d(100, 0, null, 6), 2), null, a1.c.c(-1762173272, new ReviewFormRatingComposableKt$ReviewFormRatingComposable$5$1(item), u11), u11, 1600518, 18);
        u11 = u11;
        u11.f();
        function17 = function1922;
        function18 = function16;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final void SafeRatingWrapper(e eVar, @NotNull RatingDTO dto, @NotNull Function1<? super Float, Unit> onSelected, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        RatingDTO ratingDTO;
        e eVar2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        C3969l u11 = interfaceC3967k.u(-616987087);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? u11.n(dto) : u11.F(dto) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onSelected) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            ratingDTO = dto;
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            u11.o(1738838148);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3956f1.a(0);
                u11.x(C11);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
            u11.k();
            InterfaceC3978p0 l11 = n1.l(onSelected, u11);
            u11.o(1738842762);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new ReviewFormRatingComposableKt$SafeRatingWrapper$stableOnSelected$1$1(l11, interfaceC3972m0);
                u11.x(C12);
            }
            u11.k();
            u11.G(1738849275, Integer.valueOf(interfaceC3972m0.getIntValue()));
            ratingDTO = dto;
            DsRatingKt.DsRatingAtom(ratingDTO, eVar3, null, (Function1) C12, u11, RatingDTO.$stable | 3072 | ((i13 >> 3) & 14) | ((i13 << 3) & 112), 4);
            u11.J();
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ReviewFormRatingComposableKt$SafeRatingWrapper$1(eVar2, ratingDTO, onSelected, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Float, Unit> SafeRatingWrapper$lambda$8(A1<? extends Function1<? super Float, Unit>> a12) {
        return (Function1) a12.getValue();
    }
}
