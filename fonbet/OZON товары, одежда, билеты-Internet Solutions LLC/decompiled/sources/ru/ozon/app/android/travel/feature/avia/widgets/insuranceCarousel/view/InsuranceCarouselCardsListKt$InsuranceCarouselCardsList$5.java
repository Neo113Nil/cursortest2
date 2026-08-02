package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import S0.InterfaceC3967k;
import WZ.l;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.app.android.travel.utils.compose.ItemVisibilityMode;
import ru.ozon.app.android.travel.utils.compose.LazyRawItemsVisibilityObserverKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/h;", "maxHeight", "", "invoke-8Feqmps", "(FLS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5 extends AbstractC7737t implements InterfaceC6511n<h, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ I $listState;
    final /* synthetic */ InsuranceCarouselVI $state;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5(I i11, InsuranceCarouselVI insuranceCarouselVI, l lVar, Function1<? super AtomAction, Unit> function1) {
        super(3);
        this.$listState = i11;
        this.$state = insuranceCarouselVI;
        this.$tokenizedAnalytics = lVar;
        this.$actionHandler = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(h hVar, InterfaceC3967k interfaceC3967k, Integer num) {
        m1085invoke8Feqmps(hVar.d(), interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m1085invoke8Feqmps(float f7, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.q(f7) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e e11 = a0.e(e.f40358c0, 1.0f);
        I i13 = this.$listState;
        ItemVisibilityMode.Percent percent = new ItemVisibilityMode.Percent(50);
        interfaceC3967k.o(-1958668629);
        boolean F11 = interfaceC3967k.F(this.$state) | interfaceC3967k.F(this.$tokenizedAnalytics);
        InsuranceCarouselVI insuranceCarouselVI = this.$state;
        l lVar = this.$tokenizedAnalytics;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$1$1(insuranceCarouselVI, lVar);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e onLazyRowItemsBecameVisible = LazyRawItemsVisibilityObserverKt.onLazyRowItemsBecameVisible(e11, i13, percent, (Function1) C11);
        int i14 = C5179b.f39454h;
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        C5179b.i n11 = C5179b.n(dsSpacings.m1861getDp8D9Ej5fM());
        C9915y a11 = T.a(dsSpacings.m1845getDp16D9Ej5fM(), 2, 0.0f);
        int i15 = i12;
        I i16 = this.$listState;
        interfaceC3967k.o(-1958657283);
        boolean F12 = ((i15 & 14) == 4) | interfaceC3967k.F(this.$state) | interfaceC3967k.n(this.$actionHandler);
        InsuranceCarouselVI insuranceCarouselVI2 = this.$state;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1(insuranceCarouselVI2, f7, function1);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        C10164d.b(onLazyRowItemsBecameVisible, i16, a11, n11, null, null, false, (Function1) C12, interfaceC3967k, 0, 232);
    }
}
