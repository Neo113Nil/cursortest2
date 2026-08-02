package ru.ozon.app.android.travel.feature.general.main.widgets.requestsPanel.presentation;

import A0.h;
import S0.InterfaceC3967k;
import Tg.b;
import a1.C4912a;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import v0.G;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RequestPanelWidgetContentKt$RequestPanelWidgetContent$1$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ RequestPanelVI $state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv0/e;", "", "index", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.requestsPanel.presentation.RequestPanelWidgetContentKt$RequestPanelWidgetContent$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function1<b, Unit> $actionHandler;
        final /* synthetic */ RequestPanelVI $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(RequestPanelVI requestPanelVI, Function1<? super b, Unit> function1) {
            super(4);
            this.$state = requestPanelVI;
            this.$actionHandler = function1;
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
            invoke(interfaceC10165e, num.intValue(), interfaceC3967k, num2.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e items, int i11, InterfaceC3967k interfaceC3967k, int i12) {
            int i13;
            CornerRadius cornerRadius;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i12 & 6) == 0) {
                i13 = (interfaceC3967k.n(items) ? 4 : 2) | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 48) == 0) {
                i13 |= interfaceC3967k.r(i11) ? 32 : 16;
            }
            if ((i13 & 147) == 146 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            CellDTO cellDTO = this.$state.getRequests().get(i11);
            e a11 = items.a(e.f40358c0);
            CellDTO.Settings settings = cellDTO.getSettings();
            if (settings == null || (cornerRadius = settings.getCornerRadius()) == null) {
                cornerRadius = CornerRadius.RADIUS_500;
            }
            DsCellAtomKt.DsCellAtom(cellDTO, C6988h.a(a11, h.b(cornerRadius.m1866getDpD9Ej5fM())), this.$actionHandler, interfaceC3967k, CellDTO.$stable, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RequestPanelWidgetContentKt$RequestPanelWidgetContent$1$1$1(RequestPanelVI requestPanelVI, Function1<? super b, Unit> function1) {
        super(1);
        this.$state = requestPanelVI;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        G.c(LazyRow, this.$state.getRequests().size(), null, new C4912a(true, -286087961, new AnonymousClass1(this.$state, this.$actionHandler)), 6);
    }
}
