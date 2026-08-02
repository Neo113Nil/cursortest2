package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/SignManualView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "signIv", "Landroid/widget/ImageView;", "getSignIv", "()Landroid/widget/ImageView;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SignManualView extends FrameLayout {

    @NotNull
    private final ImageView signIv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_2 = UiExtKt.toPx(2);
    private static final int DP_10 = UiExtKt.toPx(10);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/SignManualView$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SignManualView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final ImageView getSignIv() {
        return this.signIv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignManualView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int i13 = DP_10;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(i13, i13, 16));
        this.signIv = appCompatImageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int i14 = DP_2;
        layoutParams.setMargins(i14, 0, i14, 0);
        setLayoutParams(layoutParams);
        addView(appCompatImageView);
    }
}
