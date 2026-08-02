package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view;

import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import y7.k;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/ImageBankCardView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "image", "Lcom/google/android/material/imageview/ShapeableImageView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$BankImageMethodVO;", "placeView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageBankCardView extends AbstractCardView {

    @NotNull
    private final ShapeableImageView image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageBankCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeableImageView shapeableImageView = (ShapeableImageView) q.f64554a.i(N.b(ShapeableImageView.class), context);
        shapeableImageView = shapeableImageView == null ? new ShapeableImageView(context) : shapeableImageView;
        shapeableImageView.setId(R$id.travelPaymentV4BankImage);
        shapeableImageView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        shapeableImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        shapeableImageView.setShapeAppearanceModel(new k().o(ResourceExtKt.toPxF(12, context)));
        this.image = shapeableImageView;
        setPadding(getDp6(), 0, getDp6(), getDp6());
        placeView();
    }

    private final void placeView() {
        addView(this.image);
        ConstraintLayoutExtKt.updateConstraints(this, new ImageBankCardView$placeView$1(this));
        placeBadge();
    }

    public final void bind(@NotNull TravelPaymentV4VO.BankImageMethodVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.image, item.getUrl(), null, null, null, null, false, null, 126, null);
        BadgeHolderKt.bindOrGone$default(getBadge(), item.getBadge(), (Function1) null, 2, (Object) null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBorderColor(styleParser.parseColor(context, item.getBorderColor()));
    }
}
