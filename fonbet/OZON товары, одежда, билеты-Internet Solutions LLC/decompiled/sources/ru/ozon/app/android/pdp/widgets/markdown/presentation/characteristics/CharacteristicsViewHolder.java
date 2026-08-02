package ru.ozon.app.android.pdp.widgets.markdown.presentation.characteristics;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.ItemDescriptionWidgetCharacteristicBinding;
import ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO$Characteristic;", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO$Characteristic;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/pdp/databinding/ItemDescriptionWidgetCharacteristicBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/ItemDescriptionWidgetCharacteristicBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemDescriptionWidgetCharacteristicBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        ItemDescriptionWidgetCharacteristicBinding bind = ItemDescriptionWidgetCharacteristicBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public final void bind(@NotNull MarkdownVO.Characteristic item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemDescriptionWidgetCharacteristicBinding itemDescriptionWidgetCharacteristicBinding = this.binding;
        itemDescriptionWidgetCharacteristicBinding.nameTv.setText(item.getName());
        itemDescriptionWidgetCharacteristicBinding.valueTv.setText(item.getValue());
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }
}
