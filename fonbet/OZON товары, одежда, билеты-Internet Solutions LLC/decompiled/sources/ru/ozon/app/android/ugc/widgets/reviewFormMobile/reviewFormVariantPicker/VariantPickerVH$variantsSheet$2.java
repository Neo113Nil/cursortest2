package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.component.sheet.SheetView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/component/sheet/SheetView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VariantPickerVH$variantsSheet$2 extends AbstractC7737t implements Function0<SheetView> {
    final /* synthetic */ VariantPickerVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantPickerVH$variantsSheet$2(VariantPickerVH variantPickerVH) {
        super(0);
        this.this$0 = variantPickerVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SheetView invoke() {
        RecyclerView contentView;
        contentView = this.this$0.getContentView();
        return new SheetView(contentView, null, null, true, 6, null);
    }
}
