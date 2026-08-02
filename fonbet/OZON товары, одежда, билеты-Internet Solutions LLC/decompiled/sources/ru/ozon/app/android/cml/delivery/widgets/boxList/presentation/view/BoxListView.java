package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/view/BoxListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boxesRv", "Landroidx/recyclerview/widget/RecyclerView;", "getBoxesRv", "()Landroidx/recyclerview/widget/RecyclerView;", "boxRequirementsDisclaimer", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "getBoxRequirementsDisclaimer", "()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxListView extends LinearLayout {

    @NotNull
    private final DisclaimerView boxRequirementsDisclaimer;

    @NotNull
    private final RecyclerView boxesRv;

    public /* synthetic */ BoxListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final DisclaimerView getBoxRequirementsDisclaimer() {
        return this.boxRequirementsDisclaimer;
    }

    @NotNull
    public final RecyclerView getBoxesRv() {
        return this.boxesRv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(layoutParams);
        this.boxesRv = recyclerView;
        DisclaimerView disclaimerView = new DisclaimerView(context, null, 0, 0, 14, null);
        disclaimerView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams2.topMargin = dimens.getDp8();
        layoutParams2.bottomMargin = dimens.getDp8();
        layoutParams2.setMarginStart(dimens.getDp16());
        layoutParams2.setMarginEnd(dimens.getDp16());
        disclaimerView.setLayoutParams(layoutParams2);
        this.boxRequirementsDisclaimer = disclaimerView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(recyclerView);
        addView(disclaimerView);
    }
}
