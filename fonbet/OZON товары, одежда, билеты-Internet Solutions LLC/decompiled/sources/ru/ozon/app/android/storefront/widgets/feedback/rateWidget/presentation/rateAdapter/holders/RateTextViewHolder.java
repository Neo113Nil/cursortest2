package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateSectionDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateTextViewHolder;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onCreateViewHolder", "", "bindItem", "item", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "position", "", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateTextViewHolder extends RateBaseViewHolder<TextAtomView> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int VERTICAL_MARGIN = ResourceExtKt.toPx(14);
    private static final int LEFT_MARGIN = ResourceExtKt.toPx(16);
    private static final int RIGHT_MARGIN = ResourceExtKt.toPx(48);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateTextViewHolder$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateTextViewHolder(@NotNull Context context) {
        super(new TextAtomView(context, null, 0, 6, null));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void bindItem(@NotNull RateSection item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof RateSection.SectionText) {
            TextAtomView containerView = getContainerView();
            TextAtomHolderKt.bind$default(containerView, ((RateSection.SectionText) item).getText(), null, 2, null);
            containerView.setLetterSpacing(0.0f);
            containerView.setContentDescription(RateSectionDTO.TEXT_SECTION + position);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void onCreateViewHolder() {
        TextAtomView containerView = getContainerView();
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        ((ViewGroup.MarginLayoutParams) pVar).leftMargin = LEFT_MARGIN;
        ((ViewGroup.MarginLayoutParams) pVar).rightMargin = RIGHT_MARGIN;
        int i11 = VERTICAL_MARGIN;
        ((ViewGroup.MarginLayoutParams) pVar).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) pVar).bottomMargin = i11;
        containerView.setLayoutParams(pVar);
    }
}
