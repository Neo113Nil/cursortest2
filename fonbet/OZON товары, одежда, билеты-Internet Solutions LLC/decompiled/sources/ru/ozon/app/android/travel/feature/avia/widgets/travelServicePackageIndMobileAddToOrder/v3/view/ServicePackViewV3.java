package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$drawable;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewServicePackV3Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3VO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/view/ServicePackViewV3;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewServicePackV3Binding;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackViewV3 extends ConstraintLayout {

    @NotNull
    private final ViewServicePackV3Binding binding;

    public /* synthetic */ ServicePackViewV3(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull ServicePackSelectionV3VO.PackageTabVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setSelected(item.getIsSelected());
        TextAtomView travelServicePackV3TitleTAV = this.binding.travelServicePackV3TitleTAV;
        Intrinsics.checkNotNullExpressionValue(travelServicePackV3TitleTAV, "travelServicePackV3TitleTAV");
        TextAtomHolderKt.bind$default(travelServicePackV3TitleTAV, item.getTitle(), null, 2, null);
        this.binding.travelServicePackV3TitleTAV.setTextSize(1, 14.0f);
        PriceView travelServicePackV3PricePV = this.binding.travelServicePackV3PricePV;
        Intrinsics.checkNotNullExpressionValue(travelServicePackV3PricePV, "travelServicePackV3PricePV");
        PriceHolderKt.bindOrGone$default(travelServicePackV3PricePV, item.getPrice(), null, 2, null);
        BadgeView travelServicePackV3RecommendedBadgeBV = this.binding.travelServicePackV3RecommendedBadgeBV;
        Intrinsics.checkNotNullExpressionValue(travelServicePackV3RecommendedBadgeBV, "travelServicePackV3RecommendedBadgeBV");
        BadgeHolderKt.bindOrGone$default(travelServicePackV3RecommendedBadgeBV, item.getBadge(), (Function1) null, 2, (Object) null);
        ImageView travelServicePackV3PremiumIV = this.binding.travelServicePackV3PremiumIV;
        Intrinsics.checkNotNullExpressionValue(travelServicePackV3PremiumIV, "travelServicePackV3PremiumIV");
        travelServicePackV3PremiumIV.setVisibility(item.getIsPremium() ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackViewV3(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewServicePackV3Binding inflate = ViewServicePackV3Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setBackground(a.getDrawable(context, R$drawable.bg_travel_service_pack));
    }
}
