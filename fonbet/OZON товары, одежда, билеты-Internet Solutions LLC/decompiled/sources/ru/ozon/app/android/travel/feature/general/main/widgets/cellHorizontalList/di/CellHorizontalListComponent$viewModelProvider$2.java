package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class CellHorizontalListComponent$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<CellHorizontalListViewModel>> {
    public static final CellHorizontalListComponent$viewModelProvider$2 INSTANCE = new CellHorizontalListComponent$viewModelProvider$2();

    CellHorizontalListComponent$viewModelProvider$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CellHorizontalListViewModel invoke$lambda$0() {
        return new CellHorizontalListViewModel();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<CellHorizontalListViewModel> invoke() {
        return new a();
    }
}
