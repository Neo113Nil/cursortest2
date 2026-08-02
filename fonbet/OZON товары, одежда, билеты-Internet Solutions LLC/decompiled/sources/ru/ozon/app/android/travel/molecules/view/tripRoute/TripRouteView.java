package ru.ozon.app.android.travel.molecules.view.tripRoute;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewTripRouteBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewTripRouteBinding;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TripRouteView extends ConstraintLayout {

    @NotNull
    private final ViewTripRouteBinding binding;

    public /* synthetic */ TripRouteView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull TripRouteVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.tripRouteArlineIconViewGroup.bindOrGone(item.getAirlineIconUrls());
        TextAtomView tripRouteTripTimeTv = this.binding.tripRouteTripTimeTv;
        Intrinsics.checkNotNullExpressionValue(tripRouteTripTimeTv, "tripRouteTripTimeTv");
        TextAtomHolderKt.bindOrGone$default(tripRouteTripTimeTv, item.getTripTime(), null, 2, null);
        AppCompatTextView appCompatTextView = this.binding.tripRouteDayCountTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getArrivalDays() != null ? 0 : 8);
        appCompatTextView.setText(item.getArrivalDays());
        TextAtomView tripRouteTripDurationTv = this.binding.tripRouteTripDurationTv;
        Intrinsics.checkNotNullExpressionValue(tripRouteTripDurationTv, "tripRouteTripDurationTv");
        TextAtomHolderKt.bindOrGone$default(tripRouteTripDurationTv, item.getTripDuration(), null, 2, null);
        TextAtomView tripRouteInfoTv = this.binding.tripRouteInfoTv;
        Intrinsics.checkNotNullExpressionValue(tripRouteInfoTv, "tripRouteInfoTv");
        TextAtomHolderKt.bindOrGone$default(tripRouteInfoTv, item.getRouteInfo(), null, 2, null);
        ImageView imageView = this.binding.tripRouteTransferIconIv;
        Intrinsics.f(imageView);
        imageView.setVisibility(item.getTransferIcon() != null ? 0 : 8);
        Icon transferIcon = item.getTransferIcon();
        ImageViewExtKt.load$default(imageView, transferIcon != null ? transferIcon.getImage() : null, null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon transferIcon2 = item.getTransferIcon();
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, transferIcon2 != null ? transferIcon2.getTintColor() : null));
        TextAtomView tripRouteTransferInfoTv = this.binding.tripRouteTransferInfoTv;
        Intrinsics.checkNotNullExpressionValue(tripRouteTransferInfoTv, "tripRouteTransferInfoTv");
        TextAtomHolderKt.bindOrGone$default(tripRouteTransferInfoTv, item.getTransferInfo(), null, 2, null);
        TextAtomView tripRouteTransferTimeTv = this.binding.tripRouteTransferTimeTv;
        Intrinsics.checkNotNullExpressionValue(tripRouteTransferTimeTv, "tripRouteTransferTimeTv");
        TextAtomHolderKt.bindOrGone$default(tripRouteTransferTimeTv, item.getTransferTime(), null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripRouteView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewTripRouteBinding inflate = ViewTripRouteBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}
