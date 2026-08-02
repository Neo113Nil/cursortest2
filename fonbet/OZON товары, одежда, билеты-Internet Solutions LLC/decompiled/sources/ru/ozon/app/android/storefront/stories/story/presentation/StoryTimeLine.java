package ru.ozon.app.android.storefront.stories.story.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002*+B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001e\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0015J\u0006\u0010 \u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\u0015J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\n\u0010%\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryTimeLine;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationListener", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryTimeLine$AnimationListener;", "getAnimationListener", "()Lru/ozon/app/android/storefront/stories/story/presentation/StoryTimeLine$AnimationListener;", "setAnimationListener", "(Lru/ozon/app/android/storefront/stories/story/presentation/StoryTimeLine$AnimationListener;)V", "progressBars", "", "Lru/ozon/app/android/storefront/stories/story/presentation/AnimatedProgressBar;", "currentItemPosition", "init", "", "framesCount", "startPosition", "duration", "", "setDuration", "play", "pause", "previous", "next", "replay", "stopAndReset", "fullReset", "hasPrevious", "", "hasNext", "currentProgressBar", "createProgressBar", "index", "createSpace", "Landroid/view/View;", "Companion", "AnimationListener", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryTimeLine extends LinearLayout {
    private AnimationListener animationListener;
    private int currentItemPosition;

    @NotNull
    private final List<AnimatedProgressBar> progressBars;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int SPACE_WIDTH = ResourceExtKt.toPx(4);
    private static final int PROGRESS_HEIGHT = ResourceExtKt.toPx(3);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryTimeLine$AnimationListener;", "", "onAnimationComplete", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AnimationListener {
        void onAnimationComplete();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryTimeLine$Companion;", "", "<init>", "()V", "", "DEFAULT_DURATION", "J", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTimeLine(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AnimatedProgressBar createProgressBar(int index) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AnimatedProgressBar animatedProgressBar = new AnimatedProgressBar(context, null, 0, 6, null);
        animatedProgressBar.setLayoutParams(new LinearLayout.LayoutParams(0, PROGRESS_HEIGHT, 1.0f));
        animatedProgressBar.setOnAnimationEnd(new StoryTimeLine$createProgressBar$1$1(this));
        animatedProgressBar.setContentDescription(StringProvider.getString(R$string.story_time_line_story_frame_android, Integer.valueOf(index)));
        return animatedProgressBar;
    }

    private final View createSpace() {
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(SPACE_WIDTH, -2));
        return view;
    }

    private final AnimatedProgressBar currentProgressBar() {
        return (AnimatedProgressBar) C7714v.Q(this.currentItemPosition, this.progressBars);
    }

    private final boolean hasNext() {
        return this.currentItemPosition + 1 < this.progressBars.size();
    }

    private final boolean hasPrevious() {
        return this.currentItemPosition - 1 >= 0;
    }

    public final void fullReset() {
        for (AnimatedProgressBar animatedProgressBar : this.progressBars) {
            animatedProgressBar.stopAndReset();
            animatedProgressBar.clear();
        }
        this.progressBars.clear();
        this.currentItemPosition = 0;
        removeAllViews();
    }

    public final AnimationListener getAnimationListener() {
        return this.animationListener;
    }

    public final void init(int framesCount, int startPosition, long duration) {
        this.currentItemPosition = startPosition;
        for (int i11 = 0; i11 < framesCount; i11++) {
            AnimatedProgressBar createProgressBar = createProgressBar(i11);
            this.progressBars.add(createProgressBar);
            addView(createProgressBar);
            createProgressBar.setDuration(duration);
            if (i11 < startPosition) {
                createProgressBar.stopAndFill();
            }
            if (i11 < framesCount - 1) {
                addView(createSpace());
            }
        }
    }

    public final void next() {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.stopAndFill();
        }
        if (hasNext()) {
            this.currentItemPosition++;
            return;
        }
        AnimationListener animationListener = this.animationListener;
        if (animationListener != null) {
            animationListener.onAnimationComplete();
        }
    }

    public final void pause() {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.pause();
        }
    }

    public final void play() {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.play();
        }
    }

    public final void previous() {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.stopAndReset();
        }
        if (hasPrevious()) {
            this.currentItemPosition--;
            AnimatedProgressBar currentProgressBar2 = currentProgressBar();
            if (currentProgressBar2 != null) {
                currentProgressBar2.stopAndReset();
            }
        }
    }

    public final void replay() {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.stopAndReset();
        }
        AnimatedProgressBar currentProgressBar2 = currentProgressBar();
        if (currentProgressBar2 != null) {
            currentProgressBar2.play();
        }
    }

    public final void setAnimationListener(AnimationListener animationListener) {
        this.animationListener = animationListener;
    }

    public final void setDuration(long duration) {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.setDuration(duration);
        }
    }

    public final void stopAndReset() {
        AnimatedProgressBar currentProgressBar = currentProgressBar();
        if (currentProgressBar != null) {
            currentProgressBar.stopAndReset();
        }
    }

    public /* synthetic */ StoryTimeLine(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryTimeLine(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressBars = new ArrayList();
        setOrientation(0);
    }
}
