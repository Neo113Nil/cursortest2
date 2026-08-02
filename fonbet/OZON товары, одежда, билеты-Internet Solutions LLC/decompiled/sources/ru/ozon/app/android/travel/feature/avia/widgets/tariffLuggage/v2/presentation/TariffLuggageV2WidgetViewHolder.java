package ru.ozon.app.android.travel.feature.avia.widgets.tariffLuggage.v2.presentation;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
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
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetTariffLuggageV2Binding;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.adapter.ExtraLuggageAdapter;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.adapter.ExtraLuggageDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/tariffLuggage/v2/presentation/TariffLuggageV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/tariffLuggage/v2/presentation/TariffLuggageV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/tariffLuggage/v2/presentation/TariffLuggageV2VO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetTariffLuggageV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetTariffLuggageV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/adapter/ExtraLuggageAdapter;", "luggageAdapter", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/adapter/ExtraLuggageAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TariffLuggageV2WidgetViewHolder extends k<TariffLuggageV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTariffLuggageV2Binding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ExtraLuggageAdapter luggageAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffLuggageV2WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        WidgetTariffLuggageV2Binding bind = WidgetTariffLuggageV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        ExtraLuggageAdapter extraLuggageAdapter = new ExtraLuggageAdapter();
        this.luggageAdapter = extraLuggageAdapter;
        RecyclerView recyclerView = bind.tariffLuggageV2RV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(extraLuggageAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ExtraLuggageDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TariffLuggageV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AppCompatImageView tariffLuggageV2IV = this.binding.tariffLuggageV2IV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2IV, "tariffLuggageV2IV");
        ImageViewExtKt.loadImageOrGone(tariffLuggageV2IV, item.getThemeImageUrl());
        TextAtomView tariffLuggageV2TitleTAV = this.binding.tariffLuggageV2TitleTAV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2TitleTAV, "tariffLuggageV2TitleTAV");
        TextAtomHolderKt.bind$default(tariffLuggageV2TitleTAV, item.getTitle(), null, 2, null);
        TextAtomView tariffLuggageV2SubtitleTAV = this.binding.tariffLuggageV2SubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2SubtitleTAV, "tariffLuggageV2SubtitleTAV");
        TextAtomHolderKt.bindOrGone$default(tariffLuggageV2SubtitleTAV, item.getSubtitle(), null, 2, null);
        TextAtomView tariffLuggageV2TextInfoTAV = this.binding.tariffLuggageV2TextInfoTAV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2TextInfoTAV, "tariffLuggageV2TextInfoTAV");
        TextAtomHolderKt.bindOrGone$default(tariffLuggageV2TextInfoTAV, item.getTextInfo(), null, 2, null);
        RecyclerView tariffLuggageV2RV = this.binding.tariffLuggageV2RV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2RV, "tariffLuggageV2RV");
        tariffLuggageV2RV.setVisibility(item.getIsPricesVisible() ? 0 : 8);
        this.luggageAdapter.setItems(item.getFlightTicketLuggages());
        TextAtomView tariffLuggageV2TotalPriceTAV = this.binding.tariffLuggageV2TotalPriceTAV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2TotalPriceTAV, "tariffLuggageV2TotalPriceTAV");
        TextAtomHolderKt.bind$default(tariffLuggageV2TotalPriceTAV, item.getTotalPrice(), null, 2, null);
        TextAtomView tariffLuggageV2PriceDescriptionTAV = this.binding.tariffLuggageV2PriceDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2PriceDescriptionTAV, "tariffLuggageV2PriceDescriptionTAV");
        TextAtomHolderKt.bind$default(tariffLuggageV2PriceDescriptionTAV, item.getPriceDescription(), null, 2, null);
        SmallButtonView tariffLuggageV2SBV = this.binding.tariffLuggageV2SBV;
        Intrinsics.checkNotNullExpressionValue(tariffLuggageV2SBV, "tariffLuggageV2SBV");
        WrappedButtonHolderKt.bind(tariffLuggageV2SBV, item.getSmallButton(), this.actionHandler);
    }
}
