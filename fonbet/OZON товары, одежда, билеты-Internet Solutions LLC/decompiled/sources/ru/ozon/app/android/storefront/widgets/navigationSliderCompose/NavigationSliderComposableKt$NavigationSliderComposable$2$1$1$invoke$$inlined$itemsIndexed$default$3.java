package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import S0.A1;
import S0.InterfaceC3967k;
import S0.Q;
import S0.n1;
import Z1.d;
import Z1.h;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import t0.p;
import t0.q;
import v0.I;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv0/e;", "", "it", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$invoke$$inlined$itemsIndexed$default$3 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ItemAdapterCallback $adapterCallback$inlined;
    final /* synthetic */ AdultHandler $adultHandler$inlined;
    final /* synthetic */ d $density$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ I $state$inlined;
    final /* synthetic */ long $textPrimaryColor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$invoke$$inlined$itemsIndexed$default$3(List list, ItemAdapterCallback itemAdapterCallback, AdultHandler adultHandler, long j11, I i11, d dVar) {
        super(4);
        this.$items = list;
        this.$adapterCallback$inlined = itemAdapterCallback;
        this.$adultHandler$inlined = adultHandler;
        this.$textPrimaryColor$inlined = j11;
        this.$state$inlined = i11;
        this.$density$inlined = dVar;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        invoke(interfaceC10165e, num.intValue(), interfaceC3967k, num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(@NotNull InterfaceC10165e interfaceC10165e, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        boolean invoke$lambda$7$lambda$1;
        if ((i12 & 6) == 0) {
            i13 = i12 | (interfaceC3967k.n(interfaceC10165e) ? 4 : 2);
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
        NavigationSliderV2VO.NavigationItemV2 navigationItemV2 = (NavigationSliderV2VO.NavigationItemV2) this.$items.get(i11);
        interfaceC3967k.o(-84230095);
        interfaceC3967k.o(2075492913);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.e(new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$isItemInViewPort$2$1(this.$state$inlined, i11));
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        interfaceC3967k.o(2075501610);
        invoke$lambda$7$lambda$1 = NavigationSliderComposableKt$NavigationSliderComposable$2$1$1.invoke$lambda$7$lambda$1((A1) C11);
        if (invoke$lambda$7$lambda$1) {
            Unit unit = Unit.f71690a;
            interfaceC3967k.o(2075503607);
            boolean F11 = interfaceC3967k.F(this.$adapterCallback$inlined) | ((((i13 & 112) ^ 48) > 32 && interfaceC3967k.r(i11)) || (i13 & 48) == 32) | interfaceC3967k.F(navigationItemV2);
            Object C12 = interfaceC3967k.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$1$1(this.$adapterCallback$inlined, i11, navigationItemV2, null);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            Q.e(interfaceC3967k, unit, (Function2) C12);
        }
        interfaceC3967k.k();
        e.a aVar = e.f40358c0;
        interfaceC3967k.o(2075509158);
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = h.a(this.$density$inlined.B(navigationItemV2.getItemWidth()));
            interfaceC3967k.x(C13);
        }
        float d11 = ((h) C13).d();
        interfaceC3967k.k();
        e r11 = a0.r(aVar, d11);
        interfaceC3967k.o(2075513654);
        Object C14 = interfaceC3967k.C();
        if (C14 == InterfaceC3967k.a.a()) {
            C14 = p.a();
            interfaceC3967k.x(C14);
        }
        q qVar = (q) C14;
        interfaceC3967k.k();
        interfaceC3967k.o(2075517304);
        boolean F12 = interfaceC3967k.F(this.$adapterCallback$inlined) | ((((i13 & 112) ^ 48) > 32 && interfaceC3967k.r(i11)) || (i13 & 48) == 32) | interfaceC3967k.F(navigationItemV2);
        Object C15 = interfaceC3967k.C();
        if (F12 || C15 == InterfaceC3967k.a.a()) {
            C15 = new NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$4$1(this.$adapterCallback$inlined, i11, navigationItemV2);
            interfaceC3967k.x(C15);
        }
        interfaceC3967k.k();
        NavigationSliderComposableKt.m1049NavigationSliderRawBlockcf5BqRc(navigationItemV2, this.$adultHandler$inlined, this.$textPrimaryColor$inlined, i.b(r11, qVar, null, false, null, null, (Function0) C15, 28), interfaceC3967k, 0, 0);
        interfaceC3967k.k();
    }
}
