package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import S0.Q;
import S0.n1;
import WZ.l;
import a00.C4911f;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6616a;
import g3.C6617b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1 extends AbstractC7737t implements InterfaceC6512o<i<UserAdultModalV2VO>, g.a, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1 INSTANCE = new ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1();

    ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1() {
        super(4);
    }

    private static final BirthdateStateUi invoke$lambda$2(A1<? extends BirthdateStateUi> a12) {
        return a12.getValue();
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(i<UserAdultModalV2VO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(iVar, aVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(i<UserAdultModalV2VO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "$this$content");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(content) ? 4 : 2;
        }
        if ((i11 & 131) == 130 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(AdultConfirmationViewModelV2.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        AdultConfirmationViewModelV2 adultConfirmationViewModelV2 = (AdultConfirmationViewModelV2) a12;
        l lVar = (l) interfaceC3967k.m(f.e());
        UserAdultModalV2VO b11 = content.b();
        UserAdultModalV2VO userAdultModalV2VO = b11 instanceof UserAdultModalV2VO ? b11 : null;
        interfaceC3967k.o(79398995);
        int i12 = i11 & 14;
        boolean F11 = interfaceC3967k.F(adultConfirmationViewModelV2) | (i12 == 4) | interfaceC3967k.F(c4911f);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$1$1(adultConfirmationViewModelV2, content, c4911f, null);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, userAdultModalV2VO, (Function2) C11);
        AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
        interfaceC3967k.o(79414245);
        boolean F12 = interfaceC3967k.F(lVar) | (i12 == 4);
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$2$1(content, lVar);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        e3.i.a(aVar, null, (Function0) C12, interfaceC3967k, 6);
        BirthdateStateUi invoke$lambda$2 = invoke$lambda$2(n1.b(adultConfirmationViewModelV2.getUiStateScreen(), interfaceC3967k));
        if (!(invoke$lambda$2 instanceof BirthdateStateUi.ConfirmBirthdate)) {
            if (!Intrinsics.d(invoke$lambda$2, BirthdateStateUi.Loading.INSTANCE)) {
                throw U7.l.c(interfaceC3967k, 79424428);
            }
            interfaceC3967k.o(79441274);
            ComposeAdultConfirmationViewHolderKt.Loading(interfaceC3967k, 0);
            interfaceC3967k.k();
            return;
        }
        interfaceC3967k.o(79427110);
        UserAdultModalV2VO b12 = content.b();
        BirthdateStateUi.ConfirmBirthdate confirmBirthdate = (BirthdateStateUi.ConfirmBirthdate) invoke$lambda$2;
        interfaceC3967k.o(79431241);
        boolean F13 = interfaceC3967k.F(c4911f) | interfaceC3967k.n(invoke$lambda$2);
        Object C13 = interfaceC3967k.C();
        if (F13 || C13 == InterfaceC3967k.a.a()) {
            C13 = new ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$3$1(c4911f, invoke$lambda$2);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        ComposeAdultConfirmationViewHolderKt.AdultScrollableContent(b12, confirmBirthdate, (Function0) C13, interfaceC3967k, 0);
        interfaceC3967k.k();
    }
}
