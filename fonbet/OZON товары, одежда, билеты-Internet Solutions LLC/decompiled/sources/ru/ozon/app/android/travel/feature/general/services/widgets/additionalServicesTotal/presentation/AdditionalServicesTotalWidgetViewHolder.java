package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.services.databinding.WidgetAdditionalServicesTotalBinding;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.adapter.AdditionalServicesTotalAdapter;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.adapter.AdditionalServicesTotalDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/general/services/databinding/WidgetAdditionalServicesTotalBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/services/databinding/WidgetAdditionalServicesTotalBinding;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/adapter/AdditionalServicesTotalAdapter;", "luggageAdapter", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/adapter/AdditionalServicesTotalAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServicesTotalWidgetViewHolder extends k<AdditionalServicesTotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAdditionalServicesTotalBinding binding;

    @NotNull
    private final AdditionalServicesTotalAdapter luggageAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServicesTotalWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetAdditionalServicesTotalBinding bind = WidgetAdditionalServicesTotalBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AdditionalServicesTotalAdapter additionalServicesTotalAdapter = new AdditionalServicesTotalAdapter();
        this.luggageAdapter = additionalServicesTotalAdapter;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        RecyclerView recyclerView = bind.additionalServicesTotalRV;
        recyclerView.setAdapter(additionalServicesTotalAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new AdditionalServicesTotalDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalServicesTotalVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView additionalServicesTotalTitleTAV = this.binding.additionalServicesTotalTitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesTotalTitleTAV, "additionalServicesTotalTitleTAV");
        TextAtomHolderKt.bind$default(additionalServicesTotalTitleTAV, item.getTitle(), null, 2, null);
        this.luggageAdapter.setItems(item.getServiceItems());
        TextAtomView additionalServicesTotalPriceTAV = this.binding.additionalServicesTotalPriceTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesTotalPriceTAV, "additionalServicesTotalPriceTAV");
        TextAtomHolderKt.bind$default(additionalServicesTotalPriceTAV, item.getTotalPrice(), null, 2, null);
        TextAtomView additionalServicesTotalInfoTAV = this.binding.additionalServicesTotalInfoTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesTotalInfoTAV, "additionalServicesTotalInfoTAV");
        TextAtomHolderKt.bind$default(additionalServicesTotalInfoTAV, item.getPriceDescription(), null, 2, null);
        this.binding.additionalServicesTotalSmallButtonSBBV.bindOrGone(item.getDetailsLinkButton(), this.actionHandler);
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.f(constraintLayout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(item.getMarginHorizontal());
        marginLayoutParams.setMarginEnd(item.getMarginHorizontal());
        constraintLayout.setLayoutParams(marginLayoutParams);
        constraintLayout.setElevation(item.getBgElevation());
    }
}
