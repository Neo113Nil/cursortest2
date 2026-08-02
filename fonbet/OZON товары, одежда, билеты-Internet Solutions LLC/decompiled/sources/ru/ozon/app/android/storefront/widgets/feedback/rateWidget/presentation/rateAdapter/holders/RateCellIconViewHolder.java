package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import Ej.b;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle40IconHolderKt;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateSectionDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateCellIconViewHolder;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle40IconView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onCreateViewHolder", "", "bindItem", "item", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "position", "", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateCellIconViewHolder extends RateBaseViewHolder<CellWithSubtitle40IconView> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int CELL_HEIGHT = ResourceExtKt.toPx(64);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateCellIconViewHolder$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateCellIconViewHolder(@NotNull Context context) {
        super(new CellWithSubtitle40IconView(context, null, 0, 6, null));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void bindItem(@NotNull RateSection item, int position) {
        String a11;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof RateSection.SectionIcon) {
            CellWithSubtitle40IconView containerView = getContainerView();
            RateSection.SectionIcon sectionIcon = (RateSection.SectionIcon) item;
            CellWithSubtitle40IconHolderKt.bind$default(containerView, sectionIcon.getCell(), null, 2, null);
            TestInfo testInfo = sectionIcon.getCell().getTestInfo();
            if (testInfo == null || (a11 = testInfo.getAutomatizationId()) == null) {
                a11 = b.a(position, RateSectionDTO.CELL_ICON_SECTION);
            }
            containerView.setContentDescription(a11);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void onCreateViewHolder() {
        getContainerView().setLayoutParams(new RecyclerView.p(-1, CELL_HEIGHT));
    }
}
