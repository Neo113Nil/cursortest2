package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.J0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/screen/compose/d;", "Lru/ozon/android/messenger/framework/presentation/common/screen/compose/a;", "<init>", "()V", "f", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.presentation.common.screen.compose.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f91057e = 0;

    static final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            d.this.dismiss();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<AtomAction, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction action = atomAction;
            Intrinsics.checkNotNullParameter(action, "action");
            d.this.handleAction(action);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextDTO f91061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<CellDTO> f91062d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<ButtonV3DTO> f91063e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f91064f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TextDTO textDTO, List<CellDTO> list, List<ButtonV3DTO> list2, int i11) {
            super(2);
            this.f91061c = textDTO;
            this.f91062d = list;
            this.f91063e = list2;
            this.f91064f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f91064f | 1);
            List<CellDTO> list = this.f91062d;
            List<ButtonV3DTO> list2 = this.f91063e;
            d.this.z(this.f91061c, list, list2, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.screen.compose.d$d, reason: collision with other inner class name */
    static final class C1699d extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CellDTO f91065b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f91066c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1699d(d dVar, CellDTO cellDTO) {
            super(1);
            this.f91065b = cellDTO;
            this.f91066c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            Map<String, TokenizedTrackingInfo> trackingInfo;
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            CellDTO cellDTO = this.f91065b;
            CommonControlSettings common = cellDTO.getCommon();
            d dVar = this.f91066c;
            if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                dVar.w().m(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
            }
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.e preCloseActionBlock = new ru.ozon.android.messenger.framework.presentation.common.screen.compose.e(dVar, cellDTO);
            dVar.getClass();
            Intrinsics.checkNotNullParameter(preCloseActionBlock, "preCloseActionBlock");
            preCloseActionBlock.invoke();
            dVar.dismiss();
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<CellDTO> f91068c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f91069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List<CellDTO> list, int i11) {
            super(2);
            this.f91068c = list;
            this.f91069d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f91069d | 1);
            d.this.A(this.f91068c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final class f {
        @NotNull
        public static d a(@NotNull C9514a actionCurtain, @NotNull String namespace) {
            Intrinsics.checkNotNullParameter(actionCurtain, "actionCurtain");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            d dVar = new d();
            ru.ozon.android.messenger.utils.g.g(dVar, new Pair("ARG_ATOMS", actionCurtain), new Pair("ARG_MESSENGER_NAMESPACE", namespace));
            return dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(List<CellDTO> list, InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        float f11;
        C3969l u11 = interfaceC3967k.u(-1955983689);
        int i12 = 2;
        int i13 = (i11 & 6) == 0 ? ((i11 & 8) == 0 ? u11.n(list) : u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= u11.n(this) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C7714v.O0();
                    throw null;
                }
                CellDTO cellDTO = (CellDTO) obj;
                int size = list.size();
                f7 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91050d;
                J0 d11 = i14 == 0 ? A0.h.d(f7, f7, 0.0f, 0.0f, 12) : i14 == size - 1 ? A0.h.d(0.0f, 0.0f, f7, f7, 3) : y0.a();
                e.a aVar = androidx.compose.ui.e.f40358c0;
                f11 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91049c;
                androidx.compose.ui.e h11 = T.h(aVar, f11, 0.0f, i12);
                C7807Z parseColorToken = TokenParserKt.parseColorToken("bgSecondary", u11, 6);
                u11.o(-1395545236);
                long bgSecondary = parseColorToken == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : parseColorToken.w();
                u11.k();
                androidx.compose.ui.e b11 = androidx.compose.foundation.e.b(h11, bgSecondary, d11);
                u11.o(-430711988);
                boolean F11 = u11.F(cellDTO) | ((i13 & 112) == 32);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C1699d(this, cellDTO);
                    u11.x(C11);
                }
                u11.k();
                DsCellAtomKt.DsCellAtom(cellDTO, b11, (Function1) C11, u11, CellDTO.$stable, 0);
                i14 = i15;
                i12 = 2;
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(list, i11));
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.compose.a
    protected final void t(InterfaceC3967k interfaceC3967k) {
        InterfaceC3967k interfaceC3967k2;
        interfaceC3967k.o(1883390643);
        Bundle arguments = getArguments();
        C9514a c9514a = arguments != null ? (C9514a) arguments.getParcelable("ARG_ATOMS") : null;
        if (c9514a == null) {
            interfaceC3967k2 = interfaceC3967k;
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k.o(1129350724);
            boolean F11 = interfaceC3967k.F(c9514a) | interfaceC3967k.n(this);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ru.ozon.android.messenger.framework.presentation.common.screen.compose.f(c9514a, this);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
            interfaceC3967k2 = interfaceC3967k;
            z(c9514a.d(), c9514a.c(), c9514a.b(), interfaceC3967k2, CellDTO.$stable << 3);
        }
        interfaceC3967k2.k();
    }

    public final void z(@NotNull TextDTO title, @NotNull List<CellDTO> cells, @NotNull List<ButtonV3DTO> buttons, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f7;
        float f11;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        C3969l u11 = interfaceC3967k.u(716620586);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(cells) : u11.F(cells) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(buttons) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(this) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
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
            U7.i.b(u11, f12, 632692267);
            int i13 = i12 & 7168;
            boolean z11 = i13 == 2048;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a();
                u11.x(C11);
            }
            u11.k();
            j.a(title, (Function1) C11, u11, i12 & 14);
            f7 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91049c;
            ru.ozon.android.messenger.framework.presentation.common.utils.a.a(f7, u11);
            int i14 = i12 >> 3;
            A(cells, u11, ((i12 >> 6) & 112) | CellDTO.$stable | (i14 & 14));
            f11 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.a.f91049c;
            ru.ozon.android.messenger.framework.presentation.common.utils.a.a(f11, u11);
            u11.o(632697948);
            boolean z12 = i13 == 2048;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new b();
                u11.x(C12);
            }
            u11.k();
            i.a(buttons, null, 0.0f, 0.0f, null, (Function1) C12, u11, 6 | (i14 & 112), 30);
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(title, cells, buttons, i11));
        }
    }
}
