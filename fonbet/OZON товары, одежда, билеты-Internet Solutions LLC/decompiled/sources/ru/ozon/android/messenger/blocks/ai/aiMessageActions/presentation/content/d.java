package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content;

import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
public final class d {

    static final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<h.a, Unit> f84000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a f84001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super h.a, Unit> function1, ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a aVar) {
            super(1);
            this.f84000b = function1;
            this.f84001c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f84000b.invoke(new h.a.b(this.f84001c.getId()));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a> f84002b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h.a, Unit> f84003c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f84004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a> list, Function1<? super h.a, Unit> function1, int i11) {
            super(2);
            this.f84002b = list;
            this.f84003c = function1;
            this.f84004d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f84004d | 1);
            d.b(this.f84002b, this.f84003c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<h.a, Unit> f84005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super h.a, Unit> function1) {
            super(1);
            this.f84005b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f84005b.invoke(h.a.C1456a.f84030a);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.d$d, reason: collision with other inner class name */
    static final class C1455d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BadgeDTO f84006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h.a, Unit> f84007c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f84008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1455d(BadgeDTO badgeDTO, Function1<? super h.a, Unit> function1, int i11) {
            super(2);
            this.f84006b = badgeDTO;
            this.f84007c = function1;
            this.f84008d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f84008d | 1);
            d.c(this.f84006b, this.f84007c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, BadgeDTO badgeDTO, @NotNull List actionButtons, @NotNull Function1 onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(1531566078);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(badgeDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(actionButtons) : u11.F(actionButtons) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onAction) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-1160701534);
            boolean z11 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.b(badgeDTO, onAction);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
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
            U7.i.b(u11, f7, -1333338487);
            if (badgeDTO != null) {
                c(badgeDTO, onAction, u11, (i12 >> 6) & 112);
            }
            u11.k();
            b(actionButtons, onAction, u11, (i12 >> 6) & 126);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.c(eVar, badgeDTO, actionButtons, onAction, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List<? extends ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a> list, Function1<? super h.a, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(708672230);
        int i12 = (i11 & 6) == 0 ? ((i11 & 8) == 0 ? u11.n(list) : u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            androidx.compose.ui.e g10 = T.g(e11, dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM());
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, g10);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            U7.i.b(u11, f7, 1724981870);
            for (ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a aVar : list) {
                IconButtonV3DTO button = aVar.getButton();
                u11.o(-572981390);
                boolean F11 = ((i12 & 112) == 32) | u11.F(aVar);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new a(function1, aVar);
                    u11.x(C11);
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(button, null, false, (Function1) C11, u11, IconButtonV3DTO.$stable, 6);
                ru.ozon.android.messenger.framework.presentation.common.utils.a.b(DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), u11);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(list, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BadgeDTO badgeDTO, Function1<? super h.a, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        BadgeDTO badgeDTO2;
        C3969l u11 = interfaceC3967k.u(1062133735);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(badgeDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            badgeDTO2 = badgeDTO;
        } else {
            androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            androidx.compose.ui.e g10 = T.g(e11, dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1854getDp4D9Ej5fM());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, g10);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            U7.i.b(u11, f11, 1280155665);
            boolean z11 = (i12 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(function1);
                u11.x(C11);
            }
            u11.k();
            badgeDTO2 = badgeDTO;
            DsBadgeAtomKt.DsBadgeAtom(badgeDTO2, null, (Function1) C11, u11, i12 & 14, 2);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C1455d(badgeDTO2, function1, i11));
        }
    }
}
