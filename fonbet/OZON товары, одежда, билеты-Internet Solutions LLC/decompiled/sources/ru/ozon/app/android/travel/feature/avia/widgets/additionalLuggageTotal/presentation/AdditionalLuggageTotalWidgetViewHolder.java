package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggageTotal.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetAdditionalLuggageTotalBinding;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.adapter.ExtraLuggageAdapter;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.adapter.ExtraLuggageDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggageTotal/presentation/AdditionalLuggageTotalWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggageTotal/presentation/AdditionalLuggageTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggageTotal/presentation/AdditionalLuggageTotalVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetAdditionalLuggageTotalBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetAdditionalLuggageTotalBinding;", "", "marginShaded", "I", "", "cardElevation", "F", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/adapter/ExtraLuggageAdapter;", "luggageAdapter", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/adapter/ExtraLuggageAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageTotalWidgetViewHolder extends k<AdditionalLuggageTotalVO> {

    @NotNull
    private final WidgetAdditionalLuggageTotalBinding binding;
    private final float cardElevation;

    @NotNull
    private final View containerView;

    @NotNull
    private final ExtraLuggageAdapter luggageAdapter;
    private final int marginShaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalLuggageTotalWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetAdditionalLuggageTotalBinding bind = WidgetAdditionalLuggageTotalBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.marginShaded = ResourceExtKt.toPx(16, getContext());
        this.cardElevation = ResourceExtKt.toPxF(12, getContext());
        ExtraLuggageAdapter extraLuggageAdapter = new ExtraLuggageAdapter();
        this.luggageAdapter = extraLuggageAdapter;
        RecyclerView recyclerView = bind.additionalLuggageTotalRV;
        recyclerView.setAdapter(extraLuggageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ExtraLuggageDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalLuggageTotalVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView additionalLuggageTotalTitleTAV = this.binding.additionalLuggageTotalTitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageTotalTitleTAV, "additionalLuggageTotalTitleTAV");
        TextAtomHolderKt.bind$default(additionalLuggageTotalTitleTAV, item.getTitle(), null, 2, null);
        this.luggageAdapter.setItems(item.getFlightTicketLuggages());
        TextAtomView additionalLuggageTotalPriceTAV = this.binding.additionalLuggageTotalPriceTAV;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageTotalPriceTAV, "additionalLuggageTotalPriceTAV");
        TextAtomHolderKt.bind$default(additionalLuggageTotalPriceTAV, item.getTotalPrice(), null, 2, null);
        TextAtomView additionalLuggageTotalInfoTAV = this.binding.additionalLuggageTotalInfoTAV;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageTotalInfoTAV, "additionalLuggageTotalInfoTAV");
        TextAtomHolderKt.bind$default(additionalLuggageTotalInfoTAV, item.getPriceDescription(), null, 2, null);
        ConstraintLayout constraintLayout = this.binding.additionalLuggageTotalCL;
        Intrinsics.f(constraintLayout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.marginShaded);
        marginLayoutParams.setMarginEnd(this.marginShaded);
        constraintLayout.setLayoutParams(marginLayoutParams);
        constraintLayout.setElevation(this.cardElevation);
    }
}
