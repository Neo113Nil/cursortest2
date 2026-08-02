package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import Q1.X;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import a00.C4911f;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.i;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d00.C6020f;
import e1.InterfaceC6250b;
import j1.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.datePicker.DatePickerDialogFragment;
import ru.ozon.app.android.session.R$drawable;
import ru.ozon.app.android.session.userAdultModalMobileV2.data.models.UserAdultModalV2DTO;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.composer.compose.widget.k;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.q;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aE\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010!\u001a\u00020\u000b2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"*\n\u0010#\"\u00020\u00192\u00020\u0019¨\u0006'²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020&8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonSerializer", "Ln20/i;", "adultWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "vo", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$ConfirmBirthdate;", "stateUi", "Lkotlin/Function0;", "", "onClick", "AdultScrollableContent", "(Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$ConfirmBirthdate;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lkotlin/Function1;", "LTg/b;", "onAction", "AdultOverlayButtonContent", "(Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$ConfirmBirthdate;Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Loading", "(LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "", "birthdate", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/AtomActionComposerAction;", "mapAction", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;)Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "dateInView", "openDatePickerFragment", "(La00/f;Ljava/lang/String;)V", "AtomActionComposerAction", "LVg/c;", "defaultActionHandlers", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi;", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposeAdultConfirmationViewHolderKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdultOverlayButtonContent(@NotNull BirthdateStateUi.ConfirmBirthdate stateUi, @NotNull UserAdultModalV2VO vo, Function1<? super b, Unit> function1, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super b, Unit> function12;
        Function1<? super b, Unit> function13;
        int I11;
        boolean F11;
        Object C11;
        ButtonV3DTO secondaryButton;
        Function1<? super b, Unit> function14;
        J0 m02;
        Intrinsics.checkNotNullParameter(stateUi, "stateUi");
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-348848671);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(stateUi) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(vo) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(onClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                function13 = i14 == 0 ? null : function12;
                e.a aVar = e.f40358c0;
                e h11 = T.h(a0.e(a0.v(aVar, null, 3), 1.0f), 16, 0.0f, 2);
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, h11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = K00.b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                ButtonV3DTO primaryButton = vo.getPrimaryButton();
                e j11 = T.j(a0.e(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 12, 7);
                u11.o(2065729157);
                int i15 = i13 & 896;
                F11 = ((i13 & 14) != 4) | u11.F(vo) | (i15 != 256);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$1$1$1(vo, stateUi, function13);
                    u11.x(C11);
                }
                u11.k();
                DsButtonAtomKt.DsButtonAtom(primaryButton, j11, false, (Function1) C11, u11, 48, 4);
                secondaryButton = vo.getSecondaryButton();
                u11.o(2065737366);
                if (secondaryButton != null) {
                    e j12 = T.j(a0.e(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 24, 7);
                    u11.o(1689477009);
                    boolean z11 = ((i13 & 7168) == 2048) | (i15 == 256);
                    Object C12 = u11.C();
                    if (z11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$1$2$1$1(onClick, function13);
                        u11.x(C12);
                    }
                    u11.k();
                    DsButtonAtomKt.DsButtonAtom(secondaryButton, j12, false, (Function1) C12, u11, 48, 4);
                }
                u11.k();
                u11.f();
                function14 = function13;
            } else {
                u11.j();
                function14 = function12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$2(stateUi, vo, function14, onClick, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 8) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        e.a aVar2 = e.f40358c0;
        e h112 = T.h(a0.e(a0.v(aVar2, null, 3), 1.0f), 16, 0.0f, 2);
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, h112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = K00.b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        ButtonV3DTO primaryButton2 = vo.getPrimaryButton();
        e j112 = T.j(a0.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 12, 7);
        u11.o(2065729157);
        int i152 = i13 & 896;
        F11 = ((i13 & 14) != 4) | u11.F(vo) | (i152 != 256);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$1$1$1(vo, stateUi, function13);
        u11.x(C11);
        u11.k();
        DsButtonAtomKt.DsButtonAtom(primaryButton2, j112, false, (Function1) C11, u11, 48, 4);
        secondaryButton = vo.getSecondaryButton();
        u11.o(2065737366);
        if (secondaryButton != null) {
        }
        u11.k();
        u11.f();
        function14 = function13;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void AdultScrollableContent(@NotNull UserAdultModalV2VO vo, @NotNull BirthdateStateUi.ConfirmBirthdate stateUi, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String automatizationId;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(stateUi, "stateUi");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-622467061);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(vo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(stateUi) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.o(591950164);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new r();
                u11.x(C11);
            }
            r rVar = (r) C11;
            u11.k();
            e.a aVar = e.f40358c0;
            e h11 = T.h(a0.e(a0.v(aVar, null, 3), 1.0f), 16, 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            String str = null;
            C8366G.a(G1.e.a(R$drawable.ic_ozon_id_logo_bx, u11, 0), "logo", T.j(aVar, 0.0f, 24, 0.0f, 0.0f, 13), null, null, 0.0f, null, u11, 432, 120);
            DsTextAtomKt.DsTextAtom(vo.getTitle(), null, u11, 0, 2);
            DsTextAtomKt.DsTextAtom(vo.getSubtitle(), null, u11, 0, 2);
            UserAdultModalV2DTO.Input input = vo.getInput();
            u11.o(-1942555326);
            if (input != null) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                UniIconToken ic_m_calendar_filled = uniTheme.getIconTokens().getIc_m_calendar_filled();
                String birthdate = stateUi.getBirthdate();
                String label = vo.getInput().getLabel();
                DsInputType.Button button = new DsInputType.Button(onClick);
                String errorMessage = stateUi.getErrorMessage();
                if (errorMessage != null && errorMessage.length() > 0) {
                    str = errorMessage;
                }
                long textNegative = uniTheme.getColors(u11, UniTheme.$stable).getTextNegative();
                String errorMessage2 = stateUi.getErrorMessage();
                DsInputStatus dsInputStatus = (errorMessage2 == null || errorMessage2.length() == 0) ? DsInputStatus.NEUTRAL : DsInputStatus.ERROR;
                e a13 = i.a(T.j(aVar, 0.0f, 0.0f, 0.0f, 20, 7), rVar);
                u11.o(-1443671538);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = ComposeAdultConfirmationViewHolderKt$AdultScrollableContent$1$1$2$1.INSTANCE;
                    u11.x(C12);
                }
                u11.k();
                e a14 = androidx.compose.ui.focus.g.a(a13, (Function1) C12);
                u11.o(-1443665245);
                boolean z11 = (i12 & 896) == 256;
                Object C13 = u11.C();
                if (z11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new ComposeAdultConfirmationViewHolderKt$AdultScrollableContent$1$1$3$1(rVar, onClick);
                    u11.x(C13);
                }
                u11.k();
                e a15 = androidx.compose.ui.focus.a.a(a14, (Function1) C13);
                TestInfo testInfo = vo.getInput().getTestInfo();
                if (testInfo != null && (automatizationId = testInfo.getAutomatizationId()) != null) {
                    Q1.a(a15, automatizationId);
                }
                u11.o(-1443689577);
                Object C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = ComposeAdultConfirmationViewHolderKt$AdultScrollableContent$1$1$5$1.INSTANCE;
                    u11.x(C14);
                }
                u11.k();
                DsInputBaseKt.m1743DsInputBaseawFkL_c(birthdate, (Function1<? super String, Unit>) C14, a15, (DsInputSize) null, (DsInputType) button, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, label, (DsInputLabelPosition) null, (String) null, str, C7807Z.m(textNegative), (UniIconToken) null, ic_m_calendar_filled, false, false, false, (N0) null, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) u11, (DsInputType.Button.$stable << 12) | 48, UniIconToken.$stable << 15, 0, 536825192);
                u11 = u11;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ComposeAdultConfirmationViewHolderKt$AdultScrollableContent$2(vo, stateUi, onClick, i11));
        }
    }

    public static final void Loading(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1163618219);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            e d11 = a0.d(e.f40358c0);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, d11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsLoaderKt.m1753DsLoader3IgeMak(null, 0L, null, u11, 0, 7);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ComposeAdultConfirmationViewHolderKt$Loading$2(i11));
        }
    }

    @NotNull
    public static final n20.i adultWidget(@NotNull JsonParser jsonSerializer) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        return C6020f.a("csma", "userAdultModalMobile", k.a(2), new ComposeAdultConfirmationViewHolderKt$adultWidget$1(jsonSerializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomAction.ComposerAction mapAction(ButtonV3DTO buttonV3DTO, String str) {
        AtomActionDTO action;
        String link;
        Map<String, String> c11;
        AtomActionDTO action2;
        AtomActionDTO action3;
        CommonControlSettings common = buttonV3DTO.getCommon();
        String str2 = null;
        if (common == null || (action = common.getAction()) == null || (link = action.getLink()) == null) {
            return null;
        }
        CommonControlSettings common2 = buttonV3DTO.getCommon();
        if (common2 == null || (action3 = common2.getAction()) == null || (c11 = action3.getParams()) == null) {
            c11 = U.c();
        }
        CommonControlSettings common3 = buttonV3DTO.getCommon();
        if (common3 != null && (action2 = common3.getAction()) != null) {
            str2 = action2.getId();
        }
        return new AtomAction.ComposerAction(str2, link, U.m(c11, U.i(new Pair("birthdate", str))), buttonV3DTO.getTrackingInfo(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openDatePickerFragment(C4911f c4911f, String str) {
        DatePickerDialogFragment.INSTANCE.newInstance(str.length() == 0 ? LocalDate.A().v() : LocalDate.B(str)).show(c4911f.k(), "DatePickerDialogFragment");
    }
}
