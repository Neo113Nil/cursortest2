package ru.ozon.app.android.composer.view.multiframebinder;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinder;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\f2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u0010\u000eJ\u001f\u00104\u001a\u00020\f2\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0010H\u0007¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u00010\u00102\u0006\u00106\u001a\u00020\u0016H\u0007¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u00106\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010=R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010>R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010GR\u001b\u0010L\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "scrollStateListener", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderAnalyticHelper;", "analyticHelper", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "multiFrameBinderOptimizer", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderAnalyticHelper;Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "bindByScrollingState", "()V", "performRemainingSteps", "", "frameTime", "performNextBindStep", "(Ljava/lang/Long;)V", "addCallback", "removeCallback", "", "position", "executeStep", "(I)V", "Landroid/view/View;", "itemView", "init", "(Landroid/view/View;)V", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "composerVoObjHashCode", "bind", "(Ljava/util/List;I)V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "applyRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lkotlin/Function0;", "action", "onAttach", "(Lkotlin/jvm/functions/Function0;)V", "onDetach", "onRecycle", "stepPosition", "duration", "updateStepInfo", "(IJ)V", "bindStep", "getStepDuration", "(I)Ljava/lang/Long;", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderAnalyticHelper;", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "Lru/ozon/app/android/network/abtool/FeatureService;", "I", "Ljava/util/List;", "Landroid/view/Choreographer$FrameCallback;", "frameCallback", "Landroid/view/Choreographer$FrameCallback;", "attachAction", "Lkotlin/jvm/functions/Function0;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStepInfo;", "stepsInfo", "Ljava/lang/Float;", "minOffscreenOffset$delegate", "LSc/j;", "getMinOffscreenOffset", "()F", "minOffscreenOffset", "", "isBindFinished", "()Z", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiFrameBinder implements FrameBinder {

    @NotNull
    private final MultiFrameBinderAnalyticHelper analyticHelper;
    private Function0<Unit> attachAction;
    private int bindStep;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Choreographer.FrameCallback frameCallback;

    /* renamed from: minOffscreenOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j minOffscreenOffset;

    @NotNull
    private final MultiFrameBinderOptimizer multiFrameBinderOptimizer;
    private Float offscreenOffsetPercent;

    @NotNull
    private final ScrollStateListener scrollStateListener;

    @NotNull
    private List<? extends BindStep> steps;

    @NotNull
    private final List<BindStepInfo> stepsInfo;
    public static final int $stable = 8;

    public MultiFrameBinder(@NotNull ScrollStateListener scrollStateListener, @NotNull MultiFrameBinderAnalyticHelper analyticHelper, @NotNull MultiFrameBinderOptimizer multiFrameBinderOptimizer, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(scrollStateListener, "scrollStateListener");
        Intrinsics.checkNotNullParameter(analyticHelper, "analyticHelper");
        Intrinsics.checkNotNullParameter(multiFrameBinderOptimizer, "multiFrameBinderOptimizer");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.scrollStateListener = scrollStateListener;
        this.analyticHelper = analyticHelper;
        this.multiFrameBinderOptimizer = multiFrameBinderOptimizer;
        this.featureService = featureService;
        this.steps = K.f71697a;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: Or.a
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                MultiFrameBinder.frameCallback$lambda$0(MultiFrameBinder.this, j11);
            }
        };
        this.stepsInfo = new ArrayList();
        this.minOffscreenOffset = LazyUtilsKt.unsafeLazy(new MultiFrameBinder$minOffscreenOffset$2(this));
    }

    private final void addCallback() {
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.removeFrameCallback(this.frameCallback);
        choreographer.postFrameCallback(this.frameCallback);
    }

    private final void bindByScrollingState() {
        if (!this.scrollStateListener.getIsScrolling() || this.scrollStateListener.getIsScrollingBack()) {
            performNextBindStep$default(this, null, 1, null);
        } else {
            addCallback();
        }
    }

    private final void executeStep(int position) {
        long nanoTime = System.nanoTime();
        this.steps.get(position).invoke();
        updateStepInfo(position, System.nanoTime() - nanoTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameCallback$lambda$0(MultiFrameBinder multiFrameBinder, long j11) {
        multiFrameBinder.performNextBindStep(Long.valueOf(j11));
    }

    private final float getMinOffscreenOffset() {
        return ((Number) this.minOffscreenOffset.getValue()).floatValue();
    }

    private final boolean isBindFinished() {
        return this.bindStep >= this.steps.size();
    }

    private final void performNextBindStep(Long frameTime) {
        if (isBindFinished()) {
            return;
        }
        if (frameTime != null && !this.multiFrameBinderOptimizer.isFrameAvailable(frameTime.longValue(), getStepDuration(this.bindStep), this.offscreenOffsetPercent)) {
            bindByScrollingState();
            return;
        }
        executeStep(this.bindStep);
        this.analyticHelper.addBindStepAnalytic(this.bindStep);
        this.analyticHelper.addLayoutStepAnalytic(this.bindStep);
        this.bindStep++;
        if (!isBindFinished()) {
            bindByScrollingState();
            return;
        }
        Function0<Unit> function0 = this.attachAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    static /* synthetic */ void performNextBindStep$default(MultiFrameBinder multiFrameBinder, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        multiFrameBinder.performNextBindStep(l11);
    }

    private final void performRemainingSteps() {
        removeCallback();
        if (isBindFinished()) {
            return;
        }
        int size = this.steps.size();
        for (int i11 = this.bindStep; i11 < size; i11++) {
            executeStep(i11);
            this.analyticHelper.addBindStepAnalytic(i11);
        }
        this.analyticHelper.addLayoutRemainingStepsAnalytic(this.bindStep, this.steps.size());
        this.bindStep = this.steps.size();
        Function0<Unit> function0 = this.attachAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void removeCallback() {
        Choreographer.getInstance().removeFrameCallback(this.frameCallback);
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void applyRecycler(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.scrollStateListener.setOn(recyclerView);
        }
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void bind(@NotNull List<? extends BindStep> steps, int composerVoObjHashCode) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        if (!this.analyticHelper.isInitialized()) {
            throw new IllegalArgumentException("Call init method before bind.");
        }
        removeCallback();
        this.analyticHelper.setObjHashCode(composerVoObjHashCode);
        this.attachAction = null;
        this.bindStep = 0;
        this.steps = steps;
        bindByScrollingState();
    }

    public final Long getStepDuration(int bindStep) {
        BindStepInfo bindStepInfo = (BindStepInfo) C7714v.Q(bindStep, this.stepsInfo);
        if (bindStepInfo != null) {
            return Long.valueOf(bindStepInfo.getAvgStepDuration());
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void init(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.analyticHelper.init(itemView);
        MultiFrameBinderOptimizer multiFrameBinderOptimizer = this.multiFrameBinderOptimizer;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        multiFrameBinderOptimizer.init(context);
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onAttach(Function0<Unit> action) {
        this.attachAction = action;
        if (!isBindFinished()) {
            bindByScrollingState();
            return;
        }
        Function0<Unit> function0 = this.attachAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onDetach() {
        removeCallback();
        this.offscreenOffsetPercent = null;
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        if (isBindFinished()) {
            return;
        }
        this.offscreenOffsetPercent = Float.valueOf(offscreenOffsetPercent);
        if (offscreenOffsetPercent < getMinOffscreenOffset()) {
            performRemainingSteps();
        }
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onRecycle() {
        removeCallback();
        this.steps = K.f71697a;
        this.offscreenOffsetPercent = null;
    }

    public final void updateStepInfo(int stepPosition, long duration) {
        BindStepInfo bindStepInfo = (BindStepInfo) C7714v.Q(stepPosition, this.stepsInfo);
        if (bindStepInfo == null) {
            this.stepsInfo.add(stepPosition, new BindStepInfo(duration, 1));
            return;
        }
        long avgStepDuration = (bindStepInfo.getAvgStepDuration() * bindStepInfo.getCallCount()) + duration;
        bindStepInfo.setCallCount(bindStepInfo.getCallCount() + 1);
        bindStepInfo.setAvgStepDuration(avgStepDuration / bindStepInfo.getCallCount());
    }
}
