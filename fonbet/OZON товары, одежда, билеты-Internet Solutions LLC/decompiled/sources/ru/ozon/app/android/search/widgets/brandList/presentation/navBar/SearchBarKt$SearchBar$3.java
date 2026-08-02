package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarKt$SearchBar$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClear;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ BrandListDTO.SearchBar $searchBar;
    final /* synthetic */ String $searchText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchBarKt$SearchBar$3(BrandListDTO.SearchBar searchBar, e eVar, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$searchBar = searchBar;
        this.$modifier = eVar;
        this.$searchText = str;
        this.$onValueChange = function1;
        this.$onClear = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SearchBarKt.SearchBar(this.$searchBar, this.$modifier, this.$searchText, this.$onValueChange, this.$onClear, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
