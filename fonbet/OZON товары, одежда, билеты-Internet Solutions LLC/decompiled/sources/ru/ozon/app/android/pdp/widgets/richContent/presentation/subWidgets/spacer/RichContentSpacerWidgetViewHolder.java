package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.spacer;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentSpacerBinderDelegate;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/spacer/RichContentSpacerWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/RichContentSubWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/spacer/RichContentSpacerVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentSpacerBinderDelegate;", "billboardView", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "bindSubWidget", "", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RichContentSpacerWidgetViewHolder extends RichContentSubWidgetViewHolder<RichContentSpacerVoWrapper> implements RichContentSpacerBinderDelegate {

    @NotNull
    private final View billboardView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichContentSpacerWidgetViewHolder(@NotNull View billboardView, @NotNull ComposerReferences refs) {
        super(billboardView, refs);
        Intrinsics.checkNotNullParameter(billboardView, "billboardView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.billboardView = billboardView;
    }

    public void bindSpacer(@NotNull View view, @NotNull RichContentVO.Item.Spacer spacer) {
        RichContentSpacerBinderDelegate.DefaultImpls.bindSpacer(this, view, spacer);
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder
    public void bindSubWidget(@NotNull RichContentSpacerVoWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindSpacer(this.billboardView, item.getBillboardVO());
    }
}
