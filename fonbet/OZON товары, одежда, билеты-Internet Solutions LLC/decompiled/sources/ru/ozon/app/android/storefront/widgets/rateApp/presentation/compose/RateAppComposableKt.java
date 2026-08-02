package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import D1.InterfaceC2801g;
import K00.b;
import Pk0.h;
import S0.A0;
import S0.A1;
import S0.C0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.layout.g;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m0.C7990g;
import m0.C8004n;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppVO;
import ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.utils.TestTagsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "state", "", "storeName", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/compose/ui/e;", "modifier", "RateAppComposable", "(Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "LZ1/h;", "CORNER_RADIUS", "F", "", "isHiding", "", "height", "translationY", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateAppComposableKt {
    private static final float CORNER_RADIUS = 24;

    /* JADX WARN: Removed duplicated region for block: B:21:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RateAppComposable(@NotNull RateAppVO state, @NotNull String storeName, @NotNull Function1<? super AtomAction, Unit> actionHandler, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Object C11;
        Object b11;
        Object C12;
        boolean n11;
        Object C13;
        e b12;
        int I11;
        boolean z11;
        Object C14;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(677051176);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(storeName) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 1171) == 1170 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                u11.o(-1703774899);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                b11 = h.b(u11, -1703773201);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = C0.a(0.0f);
                    u11.x(b11);
                }
                InterfaceC3970l0 interfaceC3970l0 = (InterfaceC3970l0) b11;
                u11.k();
                A1 b13 = C7990g.b(!RateAppComposable$lambda$1(interfaceC3978p0) ? interfaceC3970l0.getFloatValue() : 0.0f, C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6), "RateAppHide", u11, 3120, 20);
                e e11 = a0.e(eVar4, 1.0f);
                u11.o(-1703762773);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = new RateAppComposableKt$RateAppComposable$1$1(interfaceC3970l0);
                    u11.x(C12);
                }
                u11.k();
                e a11 = g.a(e11, (Function1) C12);
                u11.o(-1703760849);
                n11 = u11.n(b13);
                C13 = u11.C();
                if (!n11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new RateAppComposableKt$RateAppComposable$2$1(b13);
                    u11.x(C13);
                }
                u11.k();
                e a12 = a.a(a11, (Function1) C13);
                float f7 = CORNER_RADIUS;
                b12 = androidx.compose.foundation.e.b(C6988h.a(a12, A0.h.d(f7, f7, 0.0f, 0.0f, 12)), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor2(), y0.a());
                e resourceIdTestTag = TestTagsKt.resourceIdTestTag(b12, "root", true, u11, 432, 0);
                C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, resourceIdTestTag);
                Function0 a14 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 g10 = b.g(u11, a13, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                TextDTO title = state.getTitle();
                e.a aVar = e.f40358c0;
                DsTextAtomKt.DsTextAtom(title, TestTagsKt.resourceIdTestTag(aVar, "titleTAV", true, u11, 438, 0), u11, 0, 0);
                RatingDTO rating = state.getRating();
                e resourceIdTestTag2 = TestTagsKt.resourceIdTestTag(T.j(aVar, 11, 3, 0.0f, 8, 4), "rating", true, u11, 432, 0);
                u11.o(-1078223079);
                z11 = ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.F(state))) | ((i13 & 896) != 256) | ((i13 & 112) == 32);
                C14 = u11.C();
                if (!z11 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new RateAppComposableKt$RateAppComposable$3$1$1(state, actionHandler, storeName, interfaceC3978p0);
                    u11.x(C14);
                }
                u11.k();
                DsRatingKt.DsRatingAtom(rating, resourceIdTestTag2, null, (Function1) C14, u11, RatingDTO.$stable, 4);
                u11 = u11;
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new RateAppComposableKt$RateAppComposable$4(state, storeName, actionHandler, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        u11.o(-1703774899);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
        b11 = h.b(u11, -1703773201);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3970l0 interfaceC3970l02 = (InterfaceC3970l0) b11;
        u11.k();
        A1 b132 = C7990g.b(!RateAppComposable$lambda$1(interfaceC3978p02) ? interfaceC3970l02.getFloatValue() : 0.0f, C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6), "RateAppHide", u11, 3120, 20);
        e e112 = a0.e(eVar4, 1.0f);
        u11.o(-1703762773);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e a112 = g.a(e112, (Function1) C12);
        u11.o(-1703760849);
        n11 = u11.n(b132);
        C13 = u11.C();
        if (!n11) {
        }
        C13 = new RateAppComposableKt$RateAppComposable$2$1(b132);
        u11.x(C13);
        u11.k();
        e a122 = a.a(a112, (Function1) C13);
        float f72 = CORNER_RADIUS;
        b12 = androidx.compose.foundation.e.b(C6988h.a(a122, A0.h.d(f72, f72, 0.0f, 0.0f, 12)), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor2(), y0.a());
        e resourceIdTestTag3 = TestTagsKt.resourceIdTestTag(b12, "root", true, u11, 432, 0);
        C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, resourceIdTestTag3);
        Function0 a142 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a132, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g102);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        TextDTO title2 = state.getTitle();
        e.a aVar2 = e.f40358c0;
        DsTextAtomKt.DsTextAtom(title2, TestTagsKt.resourceIdTestTag(aVar2, "titleTAV", true, u11, 438, 0), u11, 0, 0);
        RatingDTO rating2 = state.getRating();
        e resourceIdTestTag22 = TestTagsKt.resourceIdTestTag(T.j(aVar2, 11, 3, 0.0f, 8, 4), "rating", true, u11, 432, 0);
        u11.o(-1078223079);
        z11 = ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.F(state))) | ((i13 & 896) != 256) | ((i13 & 112) == 32);
        C14 = u11.C();
        if (!z11) {
        }
        C14 = new RateAppComposableKt$RateAppComposable$3$1$1(state, actionHandler, storeName, interfaceC3978p02);
        u11.x(C14);
        u11.k();
        DsRatingKt.DsRatingAtom(rating2, resourceIdTestTag22, null, (Function1) C14, u11, RatingDTO.$stable, 4);
        u11 = u11;
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final boolean RateAppComposable$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RateAppComposable$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RateAppComposable$lambda$6(A1<Float> a12) {
        return a12.getValue().floatValue();
    }
}
