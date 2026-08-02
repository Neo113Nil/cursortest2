package ru.ozon.fintech.ui.progress.dots;

import B5.B;
import B5.v;
import H5.e;
import P5.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/progress/dots/FinDotsProgressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lottie", "Lcom/airbnb/lottie/LottieAnimationView;", "bindState", "", "state", "Lru/ozon/fintech/ui/progress/dots/FinDotsProgressViewState;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinDotsProgressView extends FrameLayout {

    @NotNull
    private LottieAnimationView lottie;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinDotsProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull FinDotsProgressViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        B b11 = new B(a.getColor(getContext(), state.getDotsColor()));
        e eVar = new e("**");
        c cVar = new c(b11);
        LottieAnimationView lottieAnimationView = this.lottie;
        lottieAnimationView.setRepeatCount(state.getRepeatCount());
        lottieAnimationView.addValueCallback(eVar, (e) v.f2780F, (c<e>) cVar);
        lottieAnimationView.setAnimation(lottieAnimationView.getContext().getResources().getIdentifier("more_points_animation", "raw", lottieAnimationView.getContext().getPackageName()));
        lottieAnimationView.playAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinDotsProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinDotsProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinDotsProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.fin_dots_progress_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.lottie = (LottieAnimationView) findViewById(R.id.lottie);
    }
}
