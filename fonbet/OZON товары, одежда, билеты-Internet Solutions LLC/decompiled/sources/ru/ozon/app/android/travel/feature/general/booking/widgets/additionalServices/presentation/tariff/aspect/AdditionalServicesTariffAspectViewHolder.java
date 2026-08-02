package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.aspect;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemAdditionalServicesTariffBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemAdditionalServicesTariffBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;", "", "onTariffActionWrapperClicked", "", "cellId", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemAdditionalServicesTariffBinding;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;)V", "bindAspect", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "subtitle", "bindSubtitle", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemAdditionalServicesTariffBinding;", "Lkotlin/jvm/functions/Function1;", "I", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesTariffAspectViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemAdditionalServicesTariffBinding binding;
    private final int cellId;

    @NotNull
    private final Function1<AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalServicesTariffAspectViewHolder(@NotNull ItemAdditionalServicesTariffBinding binding, @NotNull Function1<? super AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked, int i11, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onTariffActionWrapperClicked, "onTariffActionWrapperClicked");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.onTariffActionWrapperClicked = onTariffActionWrapperClicked;
        this.cellId = i11;
        this.actionHandler = actionHandler;
        binding.additionalServiceTitleTAV.setTextIsSelectable(false);
        binding.additionalServiceSubtitleTAV.setTextIsSelectable(false);
    }

    public final void bind(@NotNull AdditionalServicesTariffAspectVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindAspect(item);
        bindTitle(item.getTitle());
        bindSubtitle(item.getSubtitle());
    }

    public final void bindAspect(@NotNull AdditionalServicesTariffAspectVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectView additionalServiceAspectAV = this.binding.additionalServiceAspectAV;
        Intrinsics.checkNotNullExpressionValue(additionalServiceAspectAV, "additionalServiceAspectAV");
        AspectHolderKt.bind$default(additionalServiceAspectAV, item.getAspect(), null, 2, null);
        AspectView additionalServiceAspectAV2 = this.binding.additionalServiceAspectAV;
        Intrinsics.checkNotNullExpressionValue(additionalServiceAspectAV2, "additionalServiceAspectAV");
        ViewExtKt.setOnClickListenerThrottle$default(additionalServiceAspectAV2, 0L, new AdditionalServicesTariffAspectViewHolder$bindAspect$1(item, this), 1, null);
    }

    public final void bindSubtitle(TextDTO subtitle) {
        TextAtomV2View additionalServiceSubtitleTAV = this.binding.additionalServiceSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServiceSubtitleTAV, "additionalServiceSubtitleTAV");
        TextHolderKt.bindOrGone$default(additionalServiceSubtitleTAV, subtitle, null, 2, null);
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextAtomV2View additionalServiceTitleTAV = this.binding.additionalServiceTitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServiceTitleTAV, "additionalServiceTitleTAV");
        TextHolderKt.bind$default(additionalServiceTitleTAV, title, null, 2, null);
    }
}
