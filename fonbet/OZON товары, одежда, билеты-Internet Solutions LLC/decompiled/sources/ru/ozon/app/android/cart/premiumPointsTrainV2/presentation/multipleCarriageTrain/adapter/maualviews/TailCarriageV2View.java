package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.common.CarriageUtilsKt;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/TailCarriageV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/ItemPremiumPointsV2TrainTailCarriageWrapper;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "pointsTv", "getPointsTv", "pointsIconIv", "Landroid/widget/ImageView;", "getPointsIconIv", "()Landroid/widget/ImageView;", "carriageCv", "getCarriageCv", "()Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/TailCarriageV2View;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TailCarriageV2View extends ConstraintLayout implements ItemPremiumPointsV2TrainTailCarriageWrapper {

    @NotNull
    private final ImageView pointsIconIv;

    @NotNull
    private final TextView pointsTv;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_4 = UiExtKt.toPx(4);
    private static final int DP_12 = UiExtKt.toPx(12);
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_56 = UiExtKt.toPx(54);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.TailCarriageV2View$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            updateConstraints.s(TailCarriageV2View.this.getTitleTv().getId(), 6, 0, 6);
            updateConstraints.s(TailCarriageV2View.this.getTitleTv().getId(), 3, 0, 3);
            updateConstraints.s(TailCarriageV2View.this.getTitleTv().getId(), 7, 0, 7);
            updateConstraints.s(TailCarriageV2View.this.getTitleTv().getId(), 4, TailCarriageV2View.this.getPointsTv().getId(), 3);
            updateConstraints.g0(TailCarriageV2View.this.getTitleTv().getId(), 2);
            updateConstraints.s(TailCarriageV2View.this.getPointsTv().getId(), 6, 0, 6);
            updateConstraints.s(TailCarriageV2View.this.getPointsTv().getId(), 3, TailCarriageV2View.this.getTitleTv().getId(), 4);
            updateConstraints.s(TailCarriageV2View.this.getPointsTv().getId(), 4, 0, 4);
            updateConstraints.s(TailCarriageV2View.this.getPointsIconIv().getId(), 4, TailCarriageV2View.this.getPointsTv().getId(), 4);
            updateConstraints.t(TailCarriageV2View.this.getPointsIconIv().getId(), 6, TailCarriageV2View.this.getPointsTv().getId(), 7, TailCarriageV2View.Companion.getDP_4());
            updateConstraints.s(TailCarriageV2View.this.getPointsIconIv().getId(), 3, TailCarriageV2View.this.getPointsTv().getId(), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/TailCarriageV2View$Companion;", "", "<init>", "()V", "", "DP_4", "I", "getDP_4", "()I", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_4() {
            return TailCarriageV2View.DP_4;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TailCarriageV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper
    @NotNull
    public TailCarriageV2View getCarriageCv() {
        return this;
    }

    @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper
    @NotNull
    public ImageView getPointsIconIv() {
        return this.pointsIconIv;
    }

    @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper
    @NotNull
    public TextView getPointsTv() {
        return this.pointsTv;
    }

    @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper
    @NotNull
    public View getRoot() {
        return this;
    }

    @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper
    public ImageView getStatusIv() {
        return ItemPremiumPointsV2TrainTailCarriageWrapper.DefaultImpls.getStatusIv(this);
    }

    @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper
    @NotNull
    public TextView getTitleTv() {
        return this.titleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TailCarriageV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.premiumPointsItemTitle);
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(StyleParser.TextStyle.CAPTION.getStyleName());
        if (parseTextStyle != null) {
            appCompatTextView.setTextAppearance(parseTextStyle.intValue());
        }
        this.titleTv = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.premiumPointsItemSubtitle);
        appCompatTextView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        Integer parseTextStyle2 = styleParser.parseTextStyle(StyleParser.TextStyle.CAPTION_BOLD.getStyleName());
        if (parseTextStyle2 != null) {
            appCompatTextView2.setTextAppearance(parseTextStyle2.intValue());
        }
        this.pointsTv = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.premiumPointsItemIcon);
        int i13 = DP_16;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(i13, i13));
        this.pointsIconIv = appCompatImageView;
        setId(R$id.premiumPointsItem);
        setLayoutParams(new ConstraintLayout.b(-2, DP_56));
        int i14 = DP_12;
        setPadding(i14, 0, i14, 0);
        CarriageUtilsKt.setCarriageAppearance(this);
        addView(getTitleTv());
        addView(getPointsTv());
        addView(getPointsIconIv());
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }
}
