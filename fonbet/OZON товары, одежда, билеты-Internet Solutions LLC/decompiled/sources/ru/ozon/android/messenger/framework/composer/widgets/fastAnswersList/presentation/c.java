package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import E0.C2942q;
import N9.o;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import WZ.l;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l1.C7807Z;
import l1.J0;
import l1.y0;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

/* loaded from: classes10.dex */
public final class c {

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FastAnswerDTO.FastAnswerTemplateCellDTO f86972b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<Unit> f86973c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> f86974d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO, h<Unit> hVar, Function1<? super ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> function1) {
            super(0);
            this.f86972b = fastAnswerTemplateCellDTO;
            this.f86973c = hVar;
            this.f86974d = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o.c(this.f86972b.getText().getText().toString());
            h<Unit> hVar = this.f86973c;
            if (hVar != null) {
                ((Function1) hVar).invoke(ru.ozon.android.messenger.framework.composer.action.c.f86599a);
            }
            this.f86974d.invoke(a.C1553a.f86965a);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FastAnswerDTO.FastAnswerTemplateCellDTO f86975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
            super(1);
            this.f86975b = fastAnswerTemplateCellDTO;
            this.f86976c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomActionDTO action;
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar;
            Map<String, String> c11;
            AtomAction action2 = atomAction;
            Intrinsics.checkNotNullParameter(action2, "action");
            if (action2 instanceof AtomAction.Move) {
                FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO = this.f86975b;
                CommonControlSettings common = fastAnswerTemplateCellDTO.getEditButton().getCommon();
                if (common != null && (action = common.getAction()) != null && (aVar = this.f86976c) != null) {
                    String link = action.getLink();
                    Map<String, String> params = action.getParams();
                    if (params == null || (c11 = U.n(params, new Pair("text", fastAnswerTemplateCellDTO.getText().getText().toString()))) == null) {
                        c11 = U.c();
                    }
                    aVar.a(link, c11);
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.c$c, reason: collision with other inner class name */
    static final class C1554c extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FastAnswerDTO.FastAnswerTemplateCellDTO f86977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1554c(FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
            super(1);
            this.f86977b = fastAnswerTemplateCellDTO;
            this.f86978c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar;
            Map<String, String> c11;
            AtomAction a11 = atomAction;
            Intrinsics.checkNotNullParameter(a11, "a");
            if (a11 instanceof AtomAction.Move) {
                FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO = this.f86977b;
                CommonControlSettings common = fastAnswerTemplateCellDTO.getRemoveButton().getCommon();
                AtomActionDTO action = common != null ? common.getAction() : null;
                String b11 = V.e.b(new Object[]{fastAnswerTemplateCellDTO.getText().getText().toString()}, 1, "«%1s»", "format(...)");
                if (action != null && (aVar = this.f86978c) != null) {
                    String link = action.getLink();
                    Map<String, String> params = action.getParams();
                    if (params == null || (c11 = U.n(params, new Pair("text", b11))) == null) {
                        c11 = U.c();
                    }
                    aVar.a(link, c11);
                }
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.b f86979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86980c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7851b f86981d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86982e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> f86983f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.b bVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, InterfaceC7851b interfaceC7851b, ru.ozon.android.messenger.framework.domain.repository.a aVar2, Function1<? super ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> function1, int i11) {
            super(2);
            this.f86979b = bVar;
            this.f86980c = aVar;
            this.f86981d = interfaceC7851b;
            this.f86982e = aVar2;
            this.f86983f = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            ru.ozon.android.messenger.framework.domain.repository.a aVar = this.f86982e;
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2 = this.f86980c;
            InterfaceC7851b interfaceC7851b = this.f86981d;
            c.a(this.f86979b, aVar2, interfaceC7851b, aVar, this.f86983f, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<Tg.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86984b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FastAnswerDTO.FastAnswerTemplateCellDTO f86985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.domain.repository.a aVar, FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO) {
            super(1);
            this.f86984b = aVar;
            this.f86985c = fastAnswerTemplateCellDTO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Tg.b bVar) {
            Tg.b atomAction = bVar;
            Intrinsics.checkNotNullParameter(atomAction, "atomAction");
            if (atomAction instanceof ru.ozon.android.messenger.framework.composer.action.c) {
                this.f86984b.d(new ru.ozon.android.messenger.framework.navigation.action.a(this.f86985c.getAction(), null, null, 6));
            }
            return Boolean.FALSE;
        }
    }

    static final class f extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> f86986b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> function1) {
            super(1);
            this.f86986b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a aVar) {
            ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a it = aVar;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f86986b.invoke(it);
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d f86987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7851b f86989d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86990e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> f86991f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d dVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, InterfaceC7851b interfaceC7851b, ru.ozon.android.messenger.framework.domain.repository.a aVar2, Function1<? super ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> function1, int i11) {
            super(2);
            this.f86987b = dVar;
            this.f86988c = aVar;
            this.f86989d = interfaceC7851b;
            this.f86990e = aVar2;
            this.f86991f = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(24577);
            ru.ozon.android.messenger.framework.domain.repository.a aVar = this.f86990e;
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2 = this.f86988c;
            InterfaceC7851b interfaceC7851b = this.f86989d;
            c.b(this.f86987b, aVar2, interfaceC7851b, aVar, this.f86991f, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.b state, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, InterfaceC7851b interfaceC7851b, ru.ozon.android.messenger.framework.domain.repository.a aVar2, @NotNull Function1<? super ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        h<Unit> hVar;
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(63667996);
        int i12 = i11 | (u11.n(state) ? 4 : 2) | (u11.n(aVar) ? 32 : 16) | (u11.F(interfaceC7851b) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(aVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(onAction) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            FastAnswerDTO.FastAnswerTemplateCellDTO a11 = state.a();
            float f7 = 8;
            float f11 = 16;
            float px = CornerRadius.RADIUS_600.getPx();
            J0 b12 = (state.e() && state.d()) ? A0.h.b(px) : state.e() ? A0.h.d(px, px, 0.0f, 0.0f, 12) : state.d() ? A0.h.d(0.0f, 0.0f, px, px, 3) : y0.a();
            u11.o(-1674623939);
            if (interfaceC7851b != null) {
                b.a aVar3 = new b.a(interfaceC7851b, aVar);
                aVar3.a((l) u11.m(b00.f.e()));
                u11.o(-1674615250);
                boolean F11 = ((i12 & 7168) == 2048) | u11.F(a11);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new e(aVar2, a11);
                    u11.x(C11);
                }
                u11.k();
                aVar3.d((Function1) C11);
                hVar = aVar3.b();
            } else {
                hVar = null;
            }
            u11.k();
            d.b i13 = InterfaceC6250b.a.i();
            e.a aVar4 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(C6988h.a(T.j(aVar4, 0.0f, state.c(), 0.0f, state.b(), 5), b12), 1.0f);
            u11.o(-1674597196);
            boolean F12 = ((i12 & 57344) == 16384) | u11.F(a11) | u11.n(hVar);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new a(a11, hVar, onAction);
                u11.x(C12);
            }
            u11.k();
            androidx.compose.ui.e c11 = i.c(e11, false, null, null, (Function0) C12, 7);
            String backgroundColor = a11.getBackgroundColor();
            u11.o(-1674588066);
            C7807Z m11 = backgroundColor != null ? C7807Z.m(UniCompositionLocalKt.getThemedColor(new UniColorToken(backgroundColor), u11, UniColorToken.$stable)) : null;
            u11.k();
            u11.o(-1674588673);
            long themedColor = m11 == null ? UniCompositionLocalKt.getThemedColor(new UniColorToken(StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR), u11, UniColorToken.$stable) : m11.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(c11, themedColor, y0.a());
            androidx.compose.ui.e f12 = T.f(b11, f11);
            Y b13 = X.b(C5179b.f(), i13, u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, f12);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, aVar4);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            IconButtonV3DTO editButton = a11.getEditButton();
            u11.o(-583723352);
            int i14 = i12 & 112;
            boolean F13 = u11.F(a11) | (i14 == 32);
            Object C13 = u11.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new b(a11, aVar);
                u11.x(C13);
            }
            u11.k();
            int i15 = IconButtonV3DTO.$stable;
            DsIconButtonAtomKt.DsIconButtonAtom(editButton, null, false, (Function1) C13, u11, i15, 6);
            IconButtonV3DTO removeButton = a11.getRemoveButton();
            androidx.compose.ui.e j11 = T.j(aVar4, 0.0f, f7, 0.0f, 0.0f, 13);
            u11.o(-583706417);
            boolean F14 = u11.F(a11) | (i14 == 32);
            Object C14 = u11.C();
            if (F14 || C14 == InterfaceC3967k.a.a()) {
                C14 = new C1554c(a11, aVar);
                u11.x(C14);
            }
            u11.k();
            DsIconButtonAtomKt.DsIconButtonAtom(removeButton, j11, false, (Function1) C14, u11, i15 | 48, 4);
            u11.f();
            TextDTO text = a11.getText();
            androidx.compose.ui.e h12 = T.h(aVar4, f7, 0.0f, 2);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(text, h12.l0(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), u11, 0, 0);
            IconDTO chevronIcon = a11.getChevronIcon();
            u11.o(-159775926);
            if (chevronIcon != null) {
                DsIconAtomKt.DsIconAtom(chevronIcon, P.c(aVar4, f7, 0.0f, 2), u11, IconDTO.$stable | 48, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(state, aVar, interfaceC7851b, aVar2, onAction, i11));
        }
    }

    public static final void b(@NotNull ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d state, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, InterfaceC7851b interfaceC7851b, ru.ozon.android.messenger.framework.domain.repository.a aVar2, @NotNull Function1<? super ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.a, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(1782641913);
        ru.ozon.android.messenger.framework.domain.repository.a aVar3 = aVar2;
        int i12 = i11 | (u11.n(state) ? 4 : 2) | (u11.n(aVar) ? 32 : 16) | (u11.F(interfaceC7851b) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(aVar3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            e.a aVar4 = androidx.compose.ui.e.f40358c0;
            int i13 = 0;
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar4);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(32077823);
            for (Object obj : state.a()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.b bVar = (ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.b) obj;
                u11.o(517405091);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = new f(onAction);
                    u11.x(C11);
                }
                u11.k();
                a(bVar, aVar, interfaceC7851b, aVar3, (Function1) C11, u11, i12 & 8176);
                aVar3 = aVar2;
                i13 = i14;
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(state, aVar, interfaceC7851b, aVar2, onAction, i11));
        }
    }
}
