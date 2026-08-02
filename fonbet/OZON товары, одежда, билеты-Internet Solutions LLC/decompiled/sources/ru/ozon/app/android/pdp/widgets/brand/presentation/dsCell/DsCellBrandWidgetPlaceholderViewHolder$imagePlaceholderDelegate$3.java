package ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.brand.presentation.DsCellBrandVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DsCellBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$3 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ DsCellBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$3(DsCellBrandWidgetPlaceholderViewHolder dsCellBrandWidgetPlaceholderViewHolder) {
        super(0);
        this.this$0 = dsCellBrandWidgetPlaceholderViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        CellDTO dsCell;
        CommonControlSettings common;
        DsCellBrandVO dsCellBrandVO = (DsCellBrandVO) this.this$0.getBoundData();
        return Boolean.valueOf(((dsCellBrandVO == null || (dsCell = dsCellBrandVO.getDsCell()) == null || (common = dsCell.getCommon()) == null) ? null : common.getAction()) != null);
    }
}
