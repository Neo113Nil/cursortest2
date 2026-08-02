package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.view;

import Sc.s;
import Wc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$raw;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/view/TravelRailwaySearchResultsV3LoaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "updateAnim", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lxe/M;", "scope", "startAnimation", "(Lxe/M;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "atomAction", "completeAnimationAndRefresh", "(Lxe/M;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/AtomAction;)V", "pauseAnimation", "()V", "resumeAnimation", "cancelAnimation", "Lxe/B0;", "animationJob", "Lxe/B0;", "", "delayTiming", "J", "", "", "loaderSpeeds", "Ljava/util/List;", "speedCoefficient", "F", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "Lcom/airbnb/lottie/LottieAnimationView;", "skeletonOffset", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/view/TravelRailwaySearchResultsV3SkeletonProView;", "skeletonView", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/view/TravelRailwaySearchResultsV3SkeletonProView;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3LoaderView extends FrameLayout {
    private B0 animationJob;
    private final long delayTiming;

    @NotNull
    private final List<Float> loaderSpeeds;

    @NotNull
    private LottieAnimationView lottieView;
    private final float skeletonOffset;

    @NotNull
    private TravelRailwaySearchResultsV3SkeletonProView skeletonView;
    private final float speedCoefficient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV3LoaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.delayTiming = 5000L;
        this.loaderSpeeds = C7714v.b0(Float.valueOf(0.1681f), Float.valueOf(0.15f), Float.valueOf(0.041f), Float.valueOf(0.0066f));
        this.speedCoefficient = 4.0f;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setAnimation(R$raw.animation_railway_search_train);
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(lottieAnimationView);
        this.lottieView = lottieAnimationView;
        this.skeletonOffset = ResourceExtKt.toPxF(4, context);
        this.skeletonView = new TravelRailwaySearchResultsV3SkeletonProView(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:10:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateAnim(d<? super Unit> dVar) {
        TravelRailwaySearchResultsV3LoaderView$updateAnim$1 travelRailwaySearchResultsV3LoaderView$updateAnim$1;
        int i11;
        TravelRailwaySearchResultsV3LoaderView travelRailwaySearchResultsV3LoaderView;
        int size;
        int i12;
        if (dVar instanceof TravelRailwaySearchResultsV3LoaderView$updateAnim$1) {
            travelRailwaySearchResultsV3LoaderView$updateAnim$1 = (TravelRailwaySearchResultsV3LoaderView$updateAnim$1) dVar;
            int i13 = travelRailwaySearchResultsV3LoaderView$updateAnim$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                travelRailwaySearchResultsV3LoaderView$updateAnim$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = travelRailwaySearchResultsV3LoaderView$updateAnim$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = travelRailwaySearchResultsV3LoaderView$updateAnim$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    travelRailwaySearchResultsV3LoaderView = this;
                    size = this.loaderSpeeds.size();
                    i12 = 1;
                    if (i12 < size) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = travelRailwaySearchResultsV3LoaderView$updateAnim$1.I$1;
                    i12 = travelRailwaySearchResultsV3LoaderView$updateAnim$1.I$0;
                    travelRailwaySearchResultsV3LoaderView = (TravelRailwaySearchResultsV3LoaderView) travelRailwaySearchResultsV3LoaderView$updateAnim$1.L$0;
                    s.b(obj);
                    travelRailwaySearchResultsV3LoaderView.lottieView.setSpeed(travelRailwaySearchResultsV3LoaderView.loaderSpeeds.get(i12).floatValue());
                    i12++;
                    if (i12 < size) {
                        long j11 = travelRailwaySearchResultsV3LoaderView.delayTiming;
                        travelRailwaySearchResultsV3LoaderView$updateAnim$1.L$0 = travelRailwaySearchResultsV3LoaderView;
                        travelRailwaySearchResultsV3LoaderView$updateAnim$1.I$0 = i12;
                        travelRailwaySearchResultsV3LoaderView$updateAnim$1.I$1 = size;
                        travelRailwaySearchResultsV3LoaderView$updateAnim$1.label = 1;
                        if (Y.b(j11, travelRailwaySearchResultsV3LoaderView$updateAnim$1) == aVar) {
                            return aVar;
                        }
                        travelRailwaySearchResultsV3LoaderView.lottieView.setSpeed(travelRailwaySearchResultsV3LoaderView.loaderSpeeds.get(i12).floatValue());
                        i12++;
                        if (i12 < size) {
                            return Unit.f71690a;
                        }
                    }
                }
            }
        }
        travelRailwaySearchResultsV3LoaderView$updateAnim$1 = new TravelRailwaySearchResultsV3LoaderView$updateAnim$1(this, dVar);
        Object obj2 = travelRailwaySearchResultsV3LoaderView$updateAnim$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = travelRailwaySearchResultsV3LoaderView$updateAnim$1.label;
        if (i11 != 0) {
        }
    }

    public final void cancelAnimation() {
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animationJob = null;
        this.lottieView.cancelAnimation();
    }

    public final void completeAnimationAndRefresh(@NotNull M scope, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animationJob = C10727i.c(scope, null, null, new TravelRailwaySearchResultsV3LoaderView$completeAnimationAndRefresh$1(this, actionHandler, atomAction, null), 3);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.translate(0.0f, 0.0f);
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                this.skeletonView.draw(canvas);
                canvas.translate(0.0f, this.skeletonView.getHeight() + this.skeletonOffset);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        TravelRailwaySearchResultsV3SkeletonProView travelRailwaySearchResultsV3SkeletonProView = this.skeletonView;
        travelRailwaySearchResultsV3SkeletonProView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        travelRailwaySearchResultsV3SkeletonProView.layout(0, 0, travelRailwaySearchResultsV3SkeletonProView.getMeasuredWidth(), travelRailwaySearchResultsV3SkeletonProView.getMeasuredHeight());
    }

    public final void pauseAnimation() {
        this.lottieView.pauseAnimation();
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void resumeAnimation(@NotNull M scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.lottieView.isAnimating()) {
            return;
        }
        this.lottieView.resumeAnimation();
        if (this.lottieView.isAnimating()) {
            this.animationJob = C10727i.c(scope, null, null, new TravelRailwaySearchResultsV3LoaderView$resumeAnimation$1(this, null), 3);
        }
    }

    public final void startAnimation(@NotNull M scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
        LottieAnimationView lottieAnimationView = this.lottieView;
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.playAnimation();
        lottieAnimationView.setSpeed(this.loaderSpeeds.get(0).floatValue());
        this.animationJob = C10727i.c(scope, null, null, new TravelRailwaySearchResultsV3LoaderView$startAnimation$2(this, null), 3);
    }
}
