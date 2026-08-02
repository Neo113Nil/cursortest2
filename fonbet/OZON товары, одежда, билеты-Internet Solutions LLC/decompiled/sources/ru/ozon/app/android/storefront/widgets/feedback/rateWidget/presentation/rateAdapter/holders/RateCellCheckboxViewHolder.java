package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import Ej.b;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioHolderKt;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateSectionDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateCellCheckboxViewHolder;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleCheckboxRadioView;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "()V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "item", "", "position", "bindItem", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckbox;", "currentItem", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckbox;", "", "checkListener", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateCellCheckboxViewHolder extends RateBaseViewHolder<CellWithSubtitleCheckboxRadioView> {

    @NotNull
    private Function1<? super Boolean, Unit> checkListener;
    private RateSection.RequiredSection.SectionCheckbox currentItem;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RateCellCheckboxViewHolder(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new CellWithSubtitleCheckboxRadioView(context, null, 0, 6, null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.checkListener = new RateCellCheckboxViewHolder$checkListener$1(this);
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void bindItem(@NotNull RateSection item, int position) {
        String a11;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof RateSection.RequiredSection.SectionCheckbox) {
            RateSection.RequiredSection.SectionCheckbox sectionCheckbox = (RateSection.RequiredSection.SectionCheckbox) item;
            this.currentItem = sectionCheckbox;
            CellWithSubtitleCheckboxRadioView containerView = getContainerView();
            CellWithSubtitleCheckboxRadioHolderKt.bind$default(containerView, sectionCheckbox.getCell(), null, 2, null);
            containerView.setOnCheckedChangeListener(this.checkListener);
            TestInfo testInfo = sectionCheckbox.getCell().getTestInfo();
            if (testInfo == null || (a11 = testInfo.getAutomatizationId()) == null) {
                a11 = b.a(position, RateSectionDTO.CELL_RADIO_SECTION);
            }
            containerView.setContentDescription(a11);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void onCreateViewHolder() {
        this.itemView.setLayoutParams(new RecyclerView.p(-1, -2));
    }
}
