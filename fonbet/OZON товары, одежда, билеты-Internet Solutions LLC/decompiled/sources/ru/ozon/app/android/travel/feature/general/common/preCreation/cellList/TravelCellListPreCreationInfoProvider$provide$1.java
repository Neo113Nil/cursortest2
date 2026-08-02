package ru.ozon.app.android.travel.feature.general.common.preCreation.cellList;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelCellListPreCreationInfoProvider$provide$1 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TravelCellListPreCreationInfoProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCellListPreCreationInfoProvider$provide$1(Context context, TravelCellListPreCreationInfoProvider travelCellListPreCreationInfoProvider) {
        super(0);
        this.$context = context;
        this.this$0 = travelCellListPreCreationInfoProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        CellDTO cellDTO;
        SingleAtom singleAtom = new SingleAtom(this.$context, null, 0, 0, 14, null);
        cellDTO = this.this$0.cellMock;
        SingleAtom.bind$default(singleAtom, cellDTO, false, 2, null);
        return singleAtom;
    }
}
