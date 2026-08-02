package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/screen/compose/k;", "Lru/ozon/android/messenger/framework/presentation/common/screen/compose/a;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends ru.ozon.android.messenger.framework.presentation.common.screen.compose.a {

    /* renamed from: f, reason: collision with root package name */
    private static final float f91087f = Paddings.PADDING_300.m1867getDpD9Ej5fM();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f91088g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f91089h = 0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Map<String, TokenizedTrackingInfo>, Unit> f91090e = new b();

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.curtain.c f91092c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<AtomAction, Unit> f91093d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f91094e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ru.ozon.android.messenger.blocks.curtain.c cVar, Function1<? super AtomAction, Unit> function1, int i11) {
            super(2);
            this.f91092c = cVar;
            this.f91093d = function1;
            this.f91094e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f91094e | 1);
            ru.ozon.android.messenger.blocks.curtain.c cVar = this.f91092c;
            Function1<AtomAction, Unit> function1 = this.f91093d;
            k.this.z(cVar, function1, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Map<String, ? extends TokenizedTrackingInfo>, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map) {
            Map<String, ? extends TokenizedTrackingInfo> trackingInfo = map;
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            k.this.w().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
            return Unit.f71690a;
        }
    }

    static {
        float f7;
        e.a aVar = androidx.compose.ui.e.f40358c0;
        f7 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91049c;
        f91088g = a0.e(T.h(aVar, f7, 0.0f, 2), 1.0f);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new SheetDialog(requireContext, 0, true, 0, true, true, null, null, false, false, null, false, 0, false, null, 32714, null);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.compose.a
    protected final void t(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1647459575);
        Bundle arguments = getArguments();
        ru.ozon.android.messenger.blocks.curtain.c cVar = arguments != null ? (ru.ozon.android.messenger.blocks.curtain.c) arguments.getParcelable("ARG_CURTAIN") : null;
        interfaceC3967k.o(801971308);
        if (cVar != null) {
            interfaceC3967k.o(626961665);
            boolean n11 = interfaceC3967k.n(this);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                l lVar = new l(1, this, k.class, "handleAction", "handleAction(Lru/ozon/uni/atoms/af/AtomAction;)V", 0);
                interfaceC3967k.x(lVar);
                C11 = lVar;
            }
            interfaceC3967k.k();
            z(cVar, (Function1) ((kotlin.reflect.h) C11), interfaceC3967k, 0);
            y(cVar.e());
            Unit unit = Unit.f71690a;
        }
        interfaceC3967k.k();
        if (x() != null) {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k.o(626968059);
            boolean n12 = interfaceC3967k.n(this);
            Object C12 = interfaceC3967k.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new m(this);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            e3.i.a(aVar, null, (Function0) C12, interfaceC3967k, 6);
        }
        interfaceC3967k.k();
    }

    public final void z(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtain, @NotNull Function1<? super AtomAction, Unit> onButtonAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f7;
        float f11;
        Intrinsics.checkNotNullParameter(curtain, "curtain");
        Intrinsics.checkNotNullParameter(onButtonAction, "onButtonAction");
        C3969l u11 = interfaceC3967k.u(786868234);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(curtain) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onButtonAction) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            ImageDTO b11 = curtain.b();
            u11.o(-202076991);
            if (b11 != null) {
                ImageDTO b12 = curtain.b();
                f11 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91049c;
                DsImageAtomKt.DsImageAtom(b12, T.j(f91088g, 0.0f, 0.0f, 0.0f, f11, 7).l0(new HorizontalAlignElement(InterfaceC6250b.a.g())), u11, 0, 0);
            }
            u11.k();
            TextDTO d12 = curtain.d();
            androidx.compose.ui.e eVar = f91088g;
            DsTextAtomKt.DsTextAtom(d12, eVar, u11, 48, 0);
            TextDTO c11 = curtain.c();
            u11.o(-202066510);
            if (c11 != null) {
                DsTextAtomKt.DsTextAtom(curtain.c(), T.h(eVar, 0.0f, f91087f, 1), u11, 48, 0);
            }
            u11.k();
            f7 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91049c;
            ru.ozon.android.messenger.framework.presentation.common.utils.a.a(f7, u11);
            i.a(curtain.a(), null, 0.0f, f91087f, this.f91090e, onButtonAction, u11, 24582 | ((i12 << 15) & 3670016), 6);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(curtain, onButtonAction, i11));
        }
    }
}
