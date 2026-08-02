package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.mapper.SecureDealModelMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealModelMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SecureDealCurtainComponent$Companion$create$1$1$secureDealModelMapper$2 extends AbstractC7737t implements Function0<SecureDealModelMapper> {
    final /* synthetic */ SecureDealCurtainComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureDealCurtainComponent$Companion$create$1$1$secureDealModelMapper$2(SecureDealCurtainComponent$Companion$create$1$1 secureDealCurtainComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = secureDealCurtainComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SecureDealModelMapper invoke() {
        CmlCellListMapper cellListMapper;
        InputMoleculeMapper inputMapper;
        cellListMapper = this.this$0.getCellListMapper();
        inputMapper = this.this$0.getInputMapper();
        return new SecureDealModelMapper(cellListMapper, inputMapper);
    }
}
