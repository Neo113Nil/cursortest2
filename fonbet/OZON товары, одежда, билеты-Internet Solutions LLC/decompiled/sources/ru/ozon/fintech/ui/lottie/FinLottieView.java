package ru.ozon.fintech.ui.lottie;

import C.D;
import H30.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.fintech.ui.databinding.FinLottieViewBinding;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/lottie/FinLottieView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FinLottieViewBinding;", "bindState", "", "state", "Lru/ozon/fintech/ui/lottie/FinLottieState;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinLottieView extends ConstraintLayout {

    @NotNull
    private final FinLottieViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinLottieView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull FinLottieState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        z.a(this, state.getPaddings());
        LottieAnimationView lottieAnimationView = this.binding.lottie;
        if (state.getWidth() != null && state.getHeight() != null) {
            ViewGroup.LayoutParams layoutParams = this.binding.lottie.getLayoutParams();
            layoutParams.height = D.d(state.getHeight().intValue());
            layoutParams.width = D.d(state.getWidth().intValue());
            lottieAnimationView.setLayoutParams(layoutParams);
        } else if (state.getRatioW() != null && state.getRatioH() != null) {
            ViewGroup.LayoutParams layoutParams2 = lottieAnimationView.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
            bVar.f41600G = "H," + state.getRatioW() + ProductContainerDTO.RATIO_DELIMITER + state.getRatioH();
            Float percentW = state.getPercentW();
            bVar.f41611R = percentW != null ? percentW.floatValue() : 1.0f;
        }
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (state.getInfinity()) {
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
        }
        lottieAnimationView.setAnimationFromJson(state.getLottieResource(), null);
        lottieAnimationView.playAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinLottieView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinLottieView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinLottieView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FinLottieViewBinding inflate = FinLottieViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }
}
