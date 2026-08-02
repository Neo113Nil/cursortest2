package ru.ozon.android.messenger.blocks.replyInputBlock;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import U7.i;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

/* loaded from: classes10.dex */
public final class f {

    static final class a extends AbstractC7737t implements Function1<Context, ProductMediaView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductMediaDTO f86351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ProductMediaDTO productMediaDTO) {
            super(1);
            this.f86351b = productMediaDTO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ProductMediaView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            ProductMediaView productMediaView = new ProductMediaView(context2, null, 0, 6, null);
            ProductMediaHolderKt.bindOrGone$default(productMediaView, this.f86351b, null, 2, null);
            return productMediaView;
        }
    }

    static final class b extends AbstractC7737t implements Function1<ProductMediaView, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductMediaDTO f86352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ProductMediaDTO productMediaDTO) {
            super(1);
            this.f86352b = productMediaDTO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ProductMediaView productMediaView) {
            ProductMediaView view = productMediaView;
            Intrinsics.checkNotNullParameter(view, "view");
            ProductMediaHolderKt.bindOrGone$default(view, this.f86352b, null, 2, null);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f86353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ IconDTO f86354c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProductMediaDTO f86355d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextDTO f86356e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextDTO f86357f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ IconButtonV3DTO f86358g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Tg.b, Unit> f86359h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f86360i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, IconDTO iconDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, Function1<? super Tg.b, Unit> function1, int i11) {
            super(2);
            this.f86353b = str;
            this.f86354c = iconDTO;
            this.f86355d = productMediaDTO;
            this.f86356e = textDTO;
            this.f86357f = textDTO2;
            this.f86358g = iconButtonV3DTO;
            this.f86359h = function1;
            this.f86360i = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f86360i | 1);
            IconButtonV3DTO iconButtonV3DTO = this.f86358g;
            Function1<Tg.b, Unit> function1 = this.f86359h;
            f.a(this.f86353b, this.f86354c, this.f86355d, this.f86356e, this.f86357f, iconButtonV3DTO, function1, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(String str, @NotNull IconDTO leftIcon, ProductMediaDTO productMediaDTO, @NotNull TextDTO titleAtom, @NotNull TextDTO subtitleAtom, @NotNull IconButtonV3DTO closeIconButton, @NotNull Function1<? super Tg.b, Unit> onCloseClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(subtitleAtom, "subtitleAtom");
        Intrinsics.checkNotNullParameter(closeIconButton, "closeIconButton");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        C3969l u11 = interfaceC3967k.u(-617307011);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(leftIcon) : u11.F(leftIcon) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(productMediaDTO) : u11.F(productMediaDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(titleAtom) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(subtitleAtom) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= (262144 & i11) == 0 ? u11.n(closeIconButton) : u11.F(closeIconButton) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onCloseClick) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            i.b(u11, f7, 1113874214);
            if (str != null) {
                b11 = androidx.compose.foundation.e.b(a0.f(a0.e(aVar, 1.0f), DsSpacings.INSTANCE.m1839getDp1D9Ej5fM()), UniCompositionLocalKt.getThemedColor(new UniColorToken(str), u11, UniColorToken.$stable), y0.a());
                C5185h.a(b11, u11, 0);
            }
            u11.k();
            androidx.compose.ui.e e12 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            androidx.compose.ui.e i13 = T.i(e12, dsSpacings.m1859getDp6D9Ej5fM(), dsSpacings.m1840getDp10D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1840getDp10D9Ej5fM());
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, i13);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(leftIcon, null, u11, IconDTO.$stable | ((i12 >> 3) & 14), 2);
            u11.o(79318294);
            if (productMediaDTO == null) {
                c3969l = u11;
            } else {
                u11.o(1054095213);
                boolean F11 = u11.F(productMediaDTO);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new a(productMediaDTO);
                    u11.x(C11);
                }
                Function1 function1 = (Function1) C11;
                u11.k();
                u11.o(1054099647);
                boolean F12 = u11.F(productMediaDTO);
                Object C12 = u11.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new b(productMediaDTO);
                    u11.x(C12);
                }
                u11.k();
                c3969l = u11;
                androidx.compose.ui.viewinterop.a.a(function1, null, (Function1) C12, c3969l, 0, 2);
                Unit unit = Unit.f71690a;
            }
            c3969l.k();
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            androidx.compose.ui.e j11 = T.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), dsSpacings.m1842getDp12D9Ej5fM(), 0.0f, dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, 10);
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
            int I13 = c3969l.I();
            A0 d13 = c3969l.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(c3969l, j11);
            Function0 a15 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
                c3969l.H(a15);
            } else {
                c3969l.e();
            }
            Function2 g11 = K00.b.g(c3969l, a14, c3969l, d13);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                Ep.a.d(I13, c3969l, I13, g11);
            }
            F1.b(c3969l, f12, InterfaceC2801g.a.f());
            int i14 = i12 >> 9;
            DsTextAtomKt.DsTextAtom(titleAtom, null, c3969l, i14 & 14, 2);
            DsTextAtomKt.DsTextAtom(subtitleAtom, null, c3969l, (i12 >> 12) & 14, 2);
            c3969l.f();
            DsIconButtonAtomKt.DsIconButtonAtom(closeIconButton, null, false, onCloseClick, c3969l, ((i12 >> 15) & 14) | IconButtonV3DTO.$stable | (i14 & 7168), 6);
            c3969l.f();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new c(str, leftIcon, productMediaDTO, titleAtom, subtitleAtom, closeIconButton, onCloseClick, i11));
        }
    }
}
