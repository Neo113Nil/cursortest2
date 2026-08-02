package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$drawable;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/StatusTailCarriageViewFresh;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/ItemFreshPremiumPointsTrainTailCarriageWrapper;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "carriageCv", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/TailCarriageViewFresh;", "getCarriageCv", "()Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/TailCarriageViewFresh;", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "pointsTv", "getPointsTv", "pointsIconIv", "Landroid/widget/ImageView;", "getPointsIconIv", "()Landroid/widget/ImageView;", "statusIv", "getStatusIv", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusTailCarriageViewFresh extends ConstraintLayout implements ItemFreshPremiumPointsTrainTailCarriageWrapper {

    @NotNull
    private final TailCarriageViewFresh carriageCv;

    @NotNull
    private final ImageView pointsIconIv;

    @NotNull
    private final TextView pointsTv;

    @NotNull
    private final ImageView statusIv;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_2 = UiExtKt.toPx(2);
    private static final int DP_4 = UiExtKt.toPx(4);
    private static final int DP_6 = UiExtKt.toPx(6);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_20 = UiExtKt.toPx(20);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.StatusTailCarriageViewFresh$1, reason: invalid class name */
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
            updateConstraints.s(StatusTailCarriageViewFresh.this.getCarriageCv().getId(), 6, 0, 6);
            updateConstraints.t(StatusTailCarriageViewFresh.this.getCarriageCv().getId(), 3, 0, 3, StatusTailCarriageViewFresh.Companion.getDP_16());
            updateConstraints.t(StatusTailCarriageViewFresh.this.getStatusIv().getId(), 7, StatusTailCarriageViewFresh.this.getCarriageCv().getId(), 7, StatusTailCarriageViewFresh.Companion.getDP_8());
            updateConstraints.t(StatusTailCarriageViewFresh.this.getStatusIv().getId(), 3, 0, 3, StatusTailCarriageViewFresh.Companion.getDP_6());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/StatusTailCarriageViewFresh$Companion;", "", "<init>", "()V", "", "DP_6", "I", "getDP_6", "()I", "DP_8", "getDP_8", "DP_16", "getDP_16", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_16() {
            return StatusTailCarriageViewFresh.DP_16;
        }

        public final int getDP_6() {
            return StatusTailCarriageViewFresh.DP_6;
        }

        public final int getDP_8() {
            return StatusTailCarriageViewFresh.DP_8;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StatusTailCarriageViewFresh(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper
    @NotNull
    public ImageView getPointsIconIv() {
        return this.pointsIconIv;
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper
    @NotNull
    public TextView getPointsTv() {
        return this.pointsTv;
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper
    @NotNull
    public View getRoot() {
        return this;
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper
    @NotNull
    public ImageView getStatusIv() {
        return this.statusIv;
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper
    @NotNull
    public TextView getTitleTv() {
        return this.titleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusTailCarriageViewFresh(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TailCarriageViewFresh tailCarriageViewFresh = new TailCarriageViewFresh(context, null, 0, 0, 14, null);
        tailCarriageViewFresh.setId(View.generateViewId());
        this.carriageCv = tailCarriageViewFresh;
        this.titleTv = getCarriageCv().getTitleTv();
        this.pointsTv = getCarriageCv().getPointsTv();
        this.pointsIconIv = getCarriageCv().getPointsIconIv();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        int i13 = DP_20;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(i13, i13));
        int i14 = DP_2;
        appCompatImageView.setPadding(i14, i14, i14, i14);
        appCompatImageView.setBackgroundResource(R$drawable.bg_premium_points_train_icon);
        appCompatImageView.setElevation(DP_4);
        this.statusIv = appCompatImageView;
        setId(R$id.premiumPointsItem);
        setLayoutParams(new ConstraintLayout.b(-2, -2));
        setClipToPadding(false);
        setClipChildren(false);
        setPadding(0, 0, 0, DP_16);
        addView(getCarriageCv());
        addView(getStatusIv());
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper
    @NotNull
    public TailCarriageViewFresh getCarriageCv() {
        return this.carriageCv;
    }
}
