package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view;

import Bl.b;
import Lc.a;
import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/BankCardView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bankImageAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "numberTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "paymentSystemImage", "Lru/ozon/uni/android/atom/image/Image;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$BankCardMethodVO;", "placeView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BankCardView extends AbstractCardView {

    @NotNull
    private final AppCompatImageView bankImageAciv;

    @NotNull
    private final TextAtomV2View numberTav;

    @NotNull
    private final Image paymentSystemImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.travelPaymentV4BankName);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(88, context), UiExtKt.toPx(16, context)));
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_START);
        this.bankImageAciv = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(textAtomV2View, R$id.travelPaymentV4CardNumber, -2, -2, false);
        this.numberTav = textAtomV2View;
        Image image = (Image) b.a(Image.class, "type", qVar, null);
        if (image == null) {
            Image image2 = new Image(context, null, 0, 6, null);
            image2.setId(R$id.travelPaymentV4PaymentSystem);
            image2.setLayoutParams(new ConstraintLayout.b(getDp24(), getDp24()));
            image = image2;
        }
        this.paymentSystemImage = image;
        setPadding(getDp14(), 0, getDp14(), getDp8());
        placeView();
    }

    private final void placeView() {
        addView(this.bankImageAciv);
        addView(this.numberTav);
        addView(this.paymentSystemImage);
        ConstraintLayoutExtKt.updateConstraints(this, new BankCardView$placeView$1(this));
        placeBadge();
    }

    public final void bind(@NotNull TravelPaymentV4VO.BankCardMethodVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.loadImageOrGone(this.bankImageAciv, item.getBankImage());
        TextHolderKt.bindOrGone$default(this.numberTav, item.getNumber(), null, 2, null);
        ImageHolderKt.bindOrGone$default(this.paymentSystemImage, item.getPaymentSystem(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getBadge(), item.getBadge(), (Function1) null, 2, (Object) null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBorderColor(Integer.valueOf(styleParser.parseColor(context, item.getBorderColor(), UniColors.GRAPHIC_NEUTRAL.getResId())));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context2, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
    }
}
