package ru.ozon.app.android.monetization.widgets.postsList.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.postsList.presentation.models.PostItemVI;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroidx/compose/ui/e;", "modifier", "PostWidgetView", "(Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PostWidgetViewKt {
    public static final void PostWidgetView(@NotNull PostItemVI state, @NotNull Function1<? super AtomAction, Unit> onAction, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super AtomAction, Unit> function1;
        e eVar2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(688816152);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(onAction) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function1 = onAction;
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            PostItemVI.Item itemDto = state.getItemDto();
            if (itemDto instanceof PostItemVI.Item.CellItem) {
                u11.o(738315945);
                function1 = onAction;
                DsCellAtomKt.DsCellAtom(((PostItemVI.Item.CellItem) itemDto).getValue(), eVar3, function1, u11, CellDTO.$stable | ((i13 >> 3) & 112) | ((i13 << 3) & 896), 0);
                u11.k();
            } else {
                function1 = onAction;
                if (!(itemDto instanceof PostItemVI.Item.TextItem)) {
                    u11.o(1824930184);
                    u11.k();
                    throw new o();
                }
                u11.o(1824936533);
                DsTextAtomKt.DsTextAtom(((PostItemVI.Item.TextItem) itemDto).getValue(), eVar3, u11, (i13 >> 3) & 112, 0);
                u11.k();
            }
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PostWidgetViewKt$PostWidgetView$1(state, function1, eVar2, i11, i12));
        }
    }
}
