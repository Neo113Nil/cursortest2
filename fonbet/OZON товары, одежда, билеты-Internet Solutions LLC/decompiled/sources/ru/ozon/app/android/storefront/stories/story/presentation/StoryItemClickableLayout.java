package ru.ozon.app.android.storefront.stories.story.presentation;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import iK.RunnableC7030a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003!\"#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "touchEventListener", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$TouchEventListener;", "getTouchEventListener", "()Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$TouchEventListener;", "setTouchEventListener", "(Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$TouchEventListener;)V", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "runnable", "Lkotlin/Function0;", "", "downEventX", "", "wasUpEvent", "", "isLongClick", "onActionDown", "x", "onActionUp", "onClickUp", "onLongClickDown", "onLongClickUp", "resetState", "Companion", "TouchEventListener", "AreaType", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryItemClickableLayout extends ConstraintLayout {
    private float downEventX;

    @NotNull
    private final GestureDetectorCompat gestureDetector;
    private boolean isLongClick;

    @NotNull
    private final Function0<Unit> runnable;
    private TouchEventListener touchEventListener;
    private boolean wasUpEvent;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$AreaType;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AreaType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AreaType[] $VALUES;
        public static final AreaType LEFT = new AreaType("LEFT", 0);
        public static final AreaType CENTER = new AreaType("CENTER", 1);
        public static final AreaType RIGHT = new AreaType("RIGHT", 2);

        private static final /* synthetic */ AreaType[] $values() {
            return new AreaType[]{LEFT, CENTER, RIGHT};
        }

        static {
            AreaType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AreaType(String str, int i11) {
        }

        public static AreaType valueOf(String str) {
            return (AreaType) Enum.valueOf(AreaType.class, str);
        }

        public static AreaType[] values() {
            return (AreaType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$Companion;", "", "<init>", "()V", "LONG_CLICK_DELAY", "", "SWIPE_DOWN_MIN_DISTANCE", "", "THROTTLE_TIME", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$TouchEventListener;", "", "onClickUp", "", "areaType", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemClickableLayout$AreaType;", "onLongClickDown", "onLongClickUp", "onSwipeDown", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TouchEventListener {
        void onClickUp(@NotNull AreaType areaType);

        void onLongClickDown();

        void onLongClickUp();

        void onSwipeDown();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryItemClickableLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(StoryItemClickableLayout storyItemClickableLayout, View view, MotionEvent motionEvent) {
        if (!storyItemClickableLayout.gestureDetector.a(motionEvent)) {
            int action = motionEvent.getAction();
            if (action == 0) {
                storyItemClickableLayout.onActionDown(motionEvent.getRawX());
            } else if (action == 1) {
                storyItemClickableLayout.onActionUp();
            }
        }
        return true;
    }

    private final void onActionDown(float x11) {
        resetState();
        this.downEventX = x11;
        getHandler().postDelayed(new RunnableC7030a(this.runnable, 1), 150L);
    }

    private final void onActionUp() {
        this.wasUpEvent = true;
        if (this.isLongClick) {
            onLongClickUp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickUp() {
        float width = getWidth();
        getLocationOnScreen(new int[2]);
        float f7 = this.downEventX - r2[0];
        AreaType areaType = (0.0f > f7 || f7 > width / ((float) 3)) ? ((((float) 2) * width) / ((float) 3) > f7 || f7 > width) ? AreaType.CENTER : AreaType.RIGHT : AreaType.LEFT;
        TouchEventListener touchEventListener = this.touchEventListener;
        if (touchEventListener != null) {
            touchEventListener.onClickUp(areaType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLongClickDown() {
        TouchEventListener touchEventListener = this.touchEventListener;
        if (touchEventListener != null) {
            touchEventListener.onLongClickDown();
        }
    }

    private final void onLongClickUp() {
        TouchEventListener touchEventListener = this.touchEventListener;
        if (touchEventListener != null) {
            touchEventListener.onLongClickUp();
        }
    }

    private final void resetState() {
        this.downEventX = 0.0f;
        this.wasUpEvent = false;
        this.isLongClick = false;
        getHandler().removeCallbacks(new iK.b(this.runnable, 1));
    }

    public final TouchEventListener getTouchEventListener() {
        return this.touchEventListener;
    }

    public final void setTouchEventListener(TouchEventListener touchEventListener) {
        this.touchEventListener = touchEventListener;
    }

    public /* synthetic */ StoryItemClickableLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryItemClickableLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout$gestureDetector$1
            private long lastClickTime;

            private final boolean isSwipeDown(MotionEvent firstMotionEvent, MotionEvent secondMotionEvent) {
                return secondMotionEvent.getY() > firstMotionEvent.getY() && secondMotionEvent.getY() - firstMotionEvent.getY() >= 180.0f;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent firstEvent, MotionEvent secondEvent, float distanceX, float distanceY) {
                Intrinsics.checkNotNullParameter(secondEvent, "secondEvent");
                if (firstEvent == null || !isSwipeDown(firstEvent, secondEvent)) {
                    return false;
                }
                if (SystemClock.elapsedRealtime() - this.lastClickTime < 300) {
                    Lm0.a.f17149a.d("swipe throttle", new Object[0]);
                    return true;
                }
                this.lastClickTime = SystemClock.elapsedRealtime();
                StoryItemClickableLayout.TouchEventListener touchEventListener = StoryItemClickableLayout.this.getTouchEventListener();
                if (touchEventListener != null) {
                    touchEventListener.onSwipeDown();
                }
                return true;
            }
        });
        this.runnable = new StoryItemClickableLayout$runnable$1(this);
        setOnTouchListener(new FB.a(this, 2));
    }
}
