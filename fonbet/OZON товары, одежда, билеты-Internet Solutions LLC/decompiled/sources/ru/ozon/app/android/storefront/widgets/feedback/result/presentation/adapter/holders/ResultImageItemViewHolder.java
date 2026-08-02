package ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders;

import Ck.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.databinding.ItemNpsServiceSuggestionBinding;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultImageItemViewHolder;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultBaseViewHolder;", "Landroid/view/View;", "containerView", "onServiceClickAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getContainerView", "()Landroid/view/View;", "currentItem", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ServiceCellImage;", "binding", "Lru/ozon/app/android/storefront/databinding/ItemNpsServiceSuggestionBinding;", "onCreateViewHolder", "bindItem", "item", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "position", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultImageItemViewHolder extends ResultBaseViewHolder<View> {

    @NotNull
    private final ItemNpsServiceSuggestionBinding binding;

    @NotNull
    private final View containerView;
    private ResultServiceCell.ServiceCellImage currentItem;

    @NotNull
    private final Function1<AtomAction, Unit> onServiceClickAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResultImageItemViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> onServiceClickAction) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onServiceClickAction, "onServiceClickAction");
        this.containerView = containerView;
        this.onServiceClickAction = onServiceClickAction;
        ItemNpsServiceSuggestionBinding bind = ItemNpsServiceSuggestionBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$0(ResultImageItemViewHolder resultImageItemViewHolder, View view) {
        AtomAction action;
        Function1<AtomAction, Unit> function1 = resultImageItemViewHolder.onServiceClickAction;
        ResultServiceCell.ServiceCellImage serviceCellImage = resultImageItemViewHolder.currentItem;
        if (serviceCellImage == null || (action = serviceCellImage.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultBaseViewHolder
    public void bindItem(@NotNull ResultServiceCell item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof ResultServiceCell.ServiceCellImage) {
            ResultServiceCell.ServiceCellImage serviceCellImage = (ResultServiceCell.ServiceCellImage) item;
            this.currentItem = serviceCellImage;
            AppCompatImageView appCompatImageView = this.binding.imageServiceCard;
            appCompatImageView.setClipToOutline(true);
            ImageViewExtKt.load$default(appCompatImageView, serviceCellImage.getImageUrl(), null, null, null, null, false, null, 126, null);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultBaseViewHolder
    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultBaseViewHolder
    public void onCreateViewHolder() {
        getContainerView().setOnClickListener(new a(this, 3));
    }
}
