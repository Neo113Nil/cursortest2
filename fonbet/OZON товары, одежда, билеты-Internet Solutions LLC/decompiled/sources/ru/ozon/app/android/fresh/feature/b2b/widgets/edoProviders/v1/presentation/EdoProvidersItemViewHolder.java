package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation;

import AW.b;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetEdoProvidersItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoProvidersItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoProvidersItemBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoVO;", "item", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoVO;)Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoProvidersItemBinding;", "Lkotlin/jvm/functions/Function1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoProvidersItemViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetEdoProvidersItemBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EdoProvidersItemViewHolder(@NotNull WidgetEdoProvidersItemBinding binding, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.onAction = onAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$2$lambda$1(EdoProvidersVO.EdoInfoVO edoInfoVO, EdoProvidersItemViewHolder edoProvidersItemViewHolder, View view) {
        AtomAction action = edoInfoVO.getRemoveButton().getAction();
        if (action != null) {
            edoProvidersItemViewHolder.onAction.invoke(action);
        }
    }

    @NotNull
    public final SingleAtom bind(@NotNull EdoProvidersVO.EdoInfoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetEdoProvidersItemBinding widgetEdoProvidersItemBinding = this.binding;
        TextAtomV2View title = widgetEdoProvidersItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
        DisclosureTitleSubtitleCellView edoId = widgetEdoProvidersItemBinding.edoId;
        Intrinsics.checkNotNullExpressionValue(edoId, "edoId");
        DisclosureTitleSubtitleCellHolderKt.bind(edoId, item.getEdoId(), this.onAction);
        AppCompatImageView addonView = widgetEdoProvidersItemBinding.edoId.getAddonView();
        CommonAtomIconDTO disclosureIcon = item.getEdoId().getDisclosureIcon();
        addonView.setContentDescription(disclosureIcon != null ? disclosureIcon.getIcon() : null);
        ImageView imageView = widgetEdoProvidersItemBinding.removeButton;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, item.getRemoveButton().getIcon(), null, null, null, null, false, null, 126, null);
        imageView.setOnClickListener(new b(3, item, this));
        SingleAtom singleAtom = widgetEdoProvidersItemBinding.infoBadge;
        SingleAtom.bind$default(singleAtom, item.getInfoBadge(), false, 2, null);
        singleAtom.setOnAction(this.onAction);
        Intrinsics.checkNotNullExpressionValue(singleAtom, "with(...)");
        return singleAtom;
    }
}
