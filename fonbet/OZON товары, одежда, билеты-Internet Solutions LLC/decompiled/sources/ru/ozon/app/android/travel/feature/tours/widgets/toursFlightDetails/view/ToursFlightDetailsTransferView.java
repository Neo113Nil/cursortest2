package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.tours.databinding.ViewToursFlightDetailsTransferBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data.ToursFlightDetailsDTO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/view/ToursFlightDetailsTransferView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/ViewToursFlightDetailsTransferBinding;", "bind", "", "transfer", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Transfer;", "bindOrGone", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightDetailsTransferView extends ConstraintLayout {

    @NotNull
    private final ViewToursFlightDetailsTransferBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToursFlightDetailsTransferView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull ToursFlightDetailsDTO.Transfer transfer) {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        AppCompatImageView toursFlightDetailsTransferIconACIV = this.binding.toursFlightDetailsTransferIconACIV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsTransferIconACIV, "toursFlightDetailsTransferIconACIV");
        ImageViewExtKt.load$default(toursFlightDetailsTransferIconACIV, transfer.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, transfer.getIcon().getTintColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            AppCompatImageView toursFlightDetailsTransferIconACIV2 = this.binding.toursFlightDetailsTransferIconACIV;
            Intrinsics.checkNotNullExpressionValue(toursFlightDetailsTransferIconACIV2, "toursFlightDetailsTransferIconACIV");
            ThemeExtKt.tint(toursFlightDetailsTransferIconACIV2, Integer.valueOf(intValue));
        }
        TextAtomView toursFlightDetailsTransferTitleTAV = this.binding.toursFlightDetailsTransferTitleTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsTransferTitleTAV, "toursFlightDetailsTransferTitleTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsTransferTitleTAV, transfer.getTitle(), null, 2, null);
        TextAtomView toursFlightDetailsTransferDescriptionTAV = this.binding.toursFlightDetailsTransferDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsTransferDescriptionTAV, "toursFlightDetailsTransferDescriptionTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsTransferDescriptionTAV, transfer.getDescription(), null, 2, null);
        TextAtomView toursFlightDetailsTransferNotificationTAV = this.binding.toursFlightDetailsTransferNotificationTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsTransferNotificationTAV, "toursFlightDetailsTransferNotificationTAV");
        TextAtomHolderKt.bindOrGone$default(toursFlightDetailsTransferNotificationTAV, transfer.getNotification(), null, 2, null);
    }

    public final void bindOrGone(ToursFlightDetailsDTO.Transfer transfer) {
        if (transfer == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(transfer);
        }
    }

    public /* synthetic */ ToursFlightDetailsTransferView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursFlightDetailsTransferView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewToursFlightDetailsTransferBinding inflate = ViewToursFlightDetailsTransferBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        int px = ResourceExtKt.toPx(16, context);
        setPadding(px, px, px, px);
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgPrimary), ResourceExtKt.toPxF(16, context)));
    }
}
