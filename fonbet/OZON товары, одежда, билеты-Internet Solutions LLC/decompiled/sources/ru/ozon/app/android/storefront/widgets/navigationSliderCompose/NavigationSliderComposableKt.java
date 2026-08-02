package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import J0.u3;
import K00.b;
import K1.T;
import P1.C3810q;
import P1.C3815w;
import P1.C3816x;
import P1.F;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import T7.E;
import V1.e;
import V1.h;
import Z1.d;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import b1.C5503f;
import b1.C5517t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$font;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "item", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "adapterCallback", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "", "NavigationSliderComposable", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;Lru/ozon/app/android/tools/ItemAdapterCallback;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LS0/k;I)V", "Ll1/Z;", "textPrimaryColor", "Landroidx/compose/ui/e;", "modifier", "NavigationSliderRawBlock-cf5BqRc", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;Lru/ozon/app/android/account/adult/presenter/AdultHandler;JLandroidx/compose/ui/e;LS0/k;II)V", "NavigationSliderRawBlock", "LK1/T;", "headM", "LK1/T;", "compact300xsmall", "", "isItemInViewPort", "shouldBlur", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderComposableKt {

    @NotNull
    private static final T compact300xsmall;

    @NotNull
    private static final T headM = new T(0, Hj0.T.d(20), new F(700), C3810q.a(C3815w.a(R$font.onest_bold, null, 14)), Hj0.T.f(0.02f, 4294967296L), 0, Hj0.T.f(1.3f, 4294967296L), null, 0, 16645977);

    static {
        int i11;
        long d11 = Hj0.T.d(12);
        C3816x a11 = C3810q.a(C3815w.a(R$font.onest_regular, null, 14));
        long f7 = Hj0.T.f(14.0f, 4294967296L);
        long d12 = Hj0.T.d(0);
        i11 = e.f27905c;
        compact300xsmall = new T(0L, d11, null, a11, d12, 0, f7, null, i11, 10354525);
    }

    public static final void NavigationSliderComposable(@NotNull NavigationSliderV2VO item, @NotNull ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> adapterCallback, @NotNull AdultHandler adultHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        e.a aVar;
        int i13;
        I i14;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        C3969l u11 = interfaceC3967k.u(-1129179826);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(adapterCallback) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(adultHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            d dVar = (d) u11.m(K0.e());
            long b12 = C7811b0.b(ResourceExtKt.color(context, R$color.text_primary));
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            b11 = androidx.compose.foundation.e.b(aVar2, C7811b0.b(ResourceExtKt.color(context, ru.ozon.uni.R$color.layer_floor_1)), y0.a());
            u11.o(403635730);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = NavigationSliderComposableKt$NavigationSliderComposable$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            androidx.compose.ui.e c11 = o.c(b11, false, (Function1) C11);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = c.f(u11, c11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(701739838);
            String title = item.getTitle();
            if (title == null || title.length() == 0) {
                aVar = aVar2;
                i13 = 0;
            } else {
                float f11 = 16;
                aVar = aVar2;
                i13 = 0;
                u3.b(item.getTitle(), Q1.a(androidx.compose.foundation.layout.T.j(aVar2, f11, 0.0f, f11, 8, 2), "titleTv"), b12, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, headM, u11, 48, 1572864, 65528);
                b12 = b12;
                u11 = u11;
            }
            u11.k();
            Object[] objArr = new Object[i13];
            long j11 = b12;
            C5517t c5517t = I.f101467x;
            u11.o(701755347);
            boolean F11 = u11.F(item);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new NavigationSliderComposableKt$NavigationSliderComposable$2$state$1$1(item);
                u11.x(C12);
            }
            u11.k();
            I i15 = (I) C5503f.c(objArr, c5517t, (Function0) C12, u11, 0, 4);
            androidx.compose.ui.e a13 = Q1.a(aVar, "listRv");
            boolean isScrollable = item.getIsScrollable();
            C9915y a14 = androidx.compose.foundation.layout.T.a(8, 2, 0.0f);
            u11.o(701765528);
            boolean F12 = u11.F(item) | u11.n(i15) | u11.F(adapterCallback) | u11.n(dVar) | u11.F(adultHandler) | u11.s(j11);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                i14 = i15;
                NavigationSliderComposableKt$NavigationSliderComposable$2$1$1 navigationSliderComposableKt$NavigationSliderComposable$2$1$1 = new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1(item, adapterCallback, adultHandler, j11, i14, dVar);
                u11.x(navigationSliderComposableKt$NavigationSliderComposable$2$1$1);
                C13 = navigationSliderComposableKt$NavigationSliderComposable$2$1$1;
            } else {
                i14 = i15;
            }
            u11.k();
            C3969l c3969l = u11;
            C10164d.b(a13, i14, a14, null, null, null, isScrollable, (Function1) C13, c3969l, 390, 120);
            u11 = c3969l;
            u11.o(701800144);
            boolean F13 = u11.F(item) | u11.n(i14);
            Object C14 = u11.C();
            if (F13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new NavigationSliderComposableKt$NavigationSliderComposable$2$2$1(item, i14);
                u11.x(C14);
            }
            u11.k();
            int i16 = Q.f25307b;
            u11.g((Function0) C14);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new NavigationSliderComposableKt$NavigationSliderComposable$3(item, adapterCallback, adultHandler, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006c  */
    /* renamed from: NavigationSliderRawBlock-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1049NavigationSliderRawBlockcf5BqRc(@NotNull NavigationSliderV2VO.NavigationItemV2 item, @NotNull AdultHandler adultHandler, long j11, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        int i14;
        androidx.compose.ui.e eVar2;
        boolean F11;
        Object C11;
        InterfaceC3978p0 interfaceC3978p0;
        boolean F12;
        Object C12;
        int I11;
        int i15;
        androidx.compose.ui.e eVar3;
        boolean z11;
        androidx.compose.ui.e eVar4;
        androidx.compose.ui.e b11;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        C3969l u11 = interfaceC3967k.u(298235872);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(adultHandler) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            j12 = j11;
            i13 |= u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    androidx.compose.ui.e eVar5 = i14 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                    Object[] objArr = new Object[0];
                    u11.o(631575578);
                    F11 = u11.F(adultHandler) | u11.F(item);
                    C11 = u11.C();
                    if (!F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new NavigationSliderComposableKt$NavigationSliderRawBlock$shouldBlur$2$1(adultHandler, item);
                        u11.x(C11);
                    }
                    u11.k();
                    interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C11, u11, 0, 6);
                    item.setShouldBlur(NavigationSliderRawBlock_cf5BqRc$lambda$6(interfaceC3978p0));
                    u11.o(631580220);
                    F12 = u11.F(adultHandler) | u11.n(interfaceC3978p0) | u11.F(item);
                    C12 = u11.C();
                    if (!F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new NavigationSliderComposableKt$NavigationSliderRawBlock$1$1(adultHandler, item, interfaceC3978p0, null);
                        u11.x(C12);
                    }
                    u11.k();
                    Q.e(u11, item, (Function2) C12);
                    C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    androidx.compose.ui.e f7 = c.f(u11, eVar5);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    if (NavigationSliderRawBlock_cf5BqRc$lambda$6(interfaceC3978p0)) {
                        u11.o(-151650469);
                        e.a aVar = androidx.compose.ui.e.f40358c0;
                        b11 = androidx.compose.foundation.e.b(a0.n(androidx.compose.foundation.layout.T.j(aVar, 0.0f, 0.0f, 0.0f, 2, 7), 48), C7811b0.b(ResourceExtKt.color((Context) u11.m(AndroidCompositionLocals_androidKt.d()), ru.ozon.app.android.uikit.R$color.old_black_60)), y0.a());
                        androidx.compose.ui.e a13 = Q1.a(b11, "overlayView");
                        V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                        int I12 = u11.I();
                        A0 d12 = u11.d();
                        androidx.compose.ui.e f12 = c.f(u11, a13);
                        Function0 a14 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.H(a14);
                        } else {
                            u11.e();
                        }
                        Function2 f13 = E.f(u11, f11, u11, d12);
                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                            a.d(I12, u11, I12, f13);
                        }
                        F1.b(u11, f12, InterfaceC2801g.a.f());
                        z11 = false;
                        i15 = 3;
                        eVar3 = eVar5;
                        C8366G.a(G1.e.a(R$drawable.ic_adult, u11, 0), null, Q1.a(a0.v(aVar, null, 3), "adultEyeLogoIv"), null, null, 0.0f, null, u11, 432, 120);
                        u11.f();
                        u11.k();
                    } else {
                        i15 = 3;
                        eVar3 = eVar5;
                        z11 = false;
                        u11.o(-150960440);
                        Ag0.e.a(item.getImage(), Q1.a(a0.n(androidx.compose.foundation.layout.T.j(androidx.compose.ui.e.f40358c0, 0.0f, 0.0f, 0.0f, 2, 7), 48), "categoryIv"), null, null, InterfaceC2547p.a.d(), 0.0f, null, u11, 199728, 212);
                        u11.k();
                    }
                    androidx.compose.ui.e a15 = Q1.a(androidx.compose.foundation.layout.T.h(androidx.compose.ui.e.f40358c0, 1, 0.0f, 2), "titleTv");
                    u3.b(item.getTitle(), a15, j12, 0L, null, 0L, h.a(i15), 0L, 0, item.getMaxLines() != 1 ? true : z11, item.getMaxLines(), item.getMaxLines(), null, compact300xsmall, u11, (i13 & 896) | 48, 1572864, 36344);
                    u11 = u11;
                    u11.f();
                    eVar4 = eVar3;
                } else {
                    u11.j();
                    eVar4 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new NavigationSliderComposableKt$NavigationSliderRawBlock$3(item, adultHandler, j11, eVar4, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            Object[] objArr2 = new Object[0];
            u11.o(631575578);
            F11 = u11.F(adultHandler) | u11.F(item);
            C11 = u11.C();
            if (!F11) {
            }
            C11 = new NavigationSliderComposableKt$NavigationSliderRawBlock$shouldBlur$2$1(adultHandler, item);
            u11.x(C11);
            u11.k();
            interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr2, null, (Function0) C11, u11, 0, 6);
            item.setShouldBlur(NavigationSliderRawBlock_cf5BqRc$lambda$6(interfaceC3978p0));
            u11.o(631580220);
            F12 = u11.F(adultHandler) | u11.n(interfaceC3978p0) | u11.F(item);
            C12 = u11.C();
            if (!F12) {
            }
            C12 = new NavigationSliderComposableKt$NavigationSliderRawBlock$1$1(adultHandler, item, interfaceC3978p0, null);
            u11.x(C12);
            u11.k();
            Q.e(u11, item, (Function2) C12);
            C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            I11 = u11.I();
            A0 d112 = u11.d();
            androidx.compose.ui.e f72 = c.f(u11, eVar5);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            F1.b(u11, f72, InterfaceC2801g.a.f());
            if (NavigationSliderRawBlock_cf5BqRc$lambda$6(interfaceC3978p0)) {
            }
            androidx.compose.ui.e a152 = Q1.a(androidx.compose.foundation.layout.T.h(androidx.compose.ui.e.f40358c0, 1, 0.0f, 2), "titleTv");
            u3.b(item.getTitle(), a152, j12, 0L, null, 0L, h.a(i15), 0L, 0, item.getMaxLines() != 1 ? true : z11, item.getMaxLines(), item.getMaxLines(), null, compact300xsmall, u11, (i13 & 896) | 48, 1572864, 36344);
            u11 = u11;
            u11.f();
            eVar4 = eVar3;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        j12 = j11;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        Object[] objArr22 = new Object[0];
        u11.o(631575578);
        F11 = u11.F(adultHandler) | u11.F(item);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new NavigationSliderComposableKt$NavigationSliderRawBlock$shouldBlur$2$1(adultHandler, item);
        u11.x(C11);
        u11.k();
        interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr22, null, (Function0) C11, u11, 0, 6);
        item.setShouldBlur(NavigationSliderRawBlock_cf5BqRc$lambda$6(interfaceC3978p0));
        u11.o(631580220);
        F12 = u11.F(adultHandler) | u11.n(interfaceC3978p0) | u11.F(item);
        C12 = u11.C();
        if (!F12) {
        }
        C12 = new NavigationSliderComposableKt$NavigationSliderRawBlock$1$1(adultHandler, item, interfaceC3978p0, null);
        u11.x(C12);
        u11.k();
        Q.e(u11, item, (Function2) C12);
        C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
        I11 = u11.I();
        A0 d1122 = u11.d();
        androidx.compose.ui.e f722 = c.f(u11, eVar5);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g1022);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        if (NavigationSliderRawBlock_cf5BqRc$lambda$6(interfaceC3978p0)) {
        }
        androidx.compose.ui.e a1522 = Q1.a(androidx.compose.foundation.layout.T.h(androidx.compose.ui.e.f40358c0, 1, 0.0f, 2), "titleTv");
        u3.b(item.getTitle(), a1522, j12, 0L, null, 0L, h.a(i15), 0L, 0, item.getMaxLines() != 1 ? true : z11, item.getMaxLines(), item.getMaxLines(), null, compact300xsmall, u11, (i13 & 896) | 48, 1572864, 36344);
        u11 = u11;
        u11.f();
        eVar4 = eVar3;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final boolean NavigationSliderRawBlock_cf5BqRc$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationSliderRawBlock_cf5BqRc$lambda$7(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
