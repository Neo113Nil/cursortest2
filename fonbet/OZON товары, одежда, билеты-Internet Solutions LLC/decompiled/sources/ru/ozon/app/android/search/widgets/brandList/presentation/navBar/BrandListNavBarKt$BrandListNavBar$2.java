package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BrandListNavBarKt$BrandListNavBar$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function0<Unit> $onClear;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ String $searchText;
    final /* synthetic */ BrandListDTO.NavBar $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BrandListNavBarKt$BrandListNavBar$2(BrandListDTO.NavBar navBar, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, int i11) {
        super(2);
        this.$state = navBar;
        this.$searchText = str;
        this.$onValueChange = function1;
        this.$onClear = function0;
        this.$onBack = function02;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BrandListNavBarKt.BrandListNavBar(this.$state, this.$searchText, this.$onValueChange, this.$onClear, this.$onBack, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
