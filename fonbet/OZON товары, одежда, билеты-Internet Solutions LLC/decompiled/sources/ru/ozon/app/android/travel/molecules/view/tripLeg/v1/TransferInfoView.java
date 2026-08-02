package ru.ozon.app.android.travel.molecules.view.tripLeg.v1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TransferInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "transferTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "technicalStopBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bindOrGone", "", "item", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "addViews", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferInfoView extends LinearLayout {

    @NotNull
    private final BadgeView technicalStopBadgeView;

    @NotNull
    private final AppCompatTextView transferTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M_Black);
        this.transferTextView = appCompatTextView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ResourceExtKt.toPx(4, context), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        badgeView.setLayoutParams(layoutParams2);
        this.technicalStopBadgeView = badgeView;
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        addView(this.transferTextView);
        addView(this.technicalStopBadgeView);
    }

    public final void bindOrGone(@NotNull TripLegVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setVisibility(item.getIsTransferGroupVisible() ? 0 : 8);
        AppCompatTextView appCompatTextView = this.transferTextView;
        appCompatTextView.setVisibility(item.getIsSegmentTransferVisible() ? 0 : 8);
        appCompatTextView.setText(item.getSegmentTransfer());
        BadgeHolderKt.bindOrGone$default(this.technicalStopBadgeView, item.getTechStopButton(), (Function1) null, 2, (Object) null);
    }
}
