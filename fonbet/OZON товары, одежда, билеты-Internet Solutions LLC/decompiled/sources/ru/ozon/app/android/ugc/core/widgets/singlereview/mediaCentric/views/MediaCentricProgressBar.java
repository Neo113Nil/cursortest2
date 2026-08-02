package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricProgressBarItem;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nJ\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\u000fJ\u0006\u0010#\u001a\u00020\u000fJ\u0018\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0015H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "progressBars", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "currentItemPosition", "getCurrentItemPosition", "()I", "init", "", "items", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "startPosition", "isProgressBarVisible", "", "setAnimationListener", "position", "onAnimationEnd", "Lkotlin/Function0;", "removeAnimationListener", "setCurrentProgressBar", "setProgressDuration", "duration", "", "play", "pause", "stopAndFill", "stopAndReset", "fullReset", "createProgressBar", "item", "withMargin", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricProgressBar extends LinearLayout {
    private int currentItemPosition;

    @NotNull
    private final List<MediaCentricProgressBarItem> progressBars;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int SPACE_WIDTH = ResourceExtKt.toPx(4);
    private static final int PROGRESS_HEIGHT = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar$Companion;", "", "<init>", "()V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressBars = new ArrayList();
        setOrientation(0);
    }

    private final MediaCentricProgressBarItem createProgressBar(MediaCentricVO.MediaItemVO item, boolean withMargin) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MediaCentricProgressBarItem mediaCentricProgressBarItem = new MediaCentricProgressBarItem(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, PROGRESS_HEIGHT, 1.0f);
        layoutParams.rightMargin = withMargin ? SPACE_WIDTH : 0;
        mediaCentricProgressBarItem.setLayoutParams(layoutParams);
        if (item instanceof MediaCentricVO.MediaItemVO.Video) {
            mediaCentricProgressBarItem.setType(MediaCentricProgressBarItem.Type.ANIMATED);
        }
        return mediaCentricProgressBarItem;
    }

    public final void fullReset() {
        for (MediaCentricProgressBarItem mediaCentricProgressBarItem : this.progressBars) {
            mediaCentricProgressBarItem.stopAndReset();
            mediaCentricProgressBarItem.clear();
        }
        this.progressBars.clear();
        removeAllViews();
    }

    public final int getCurrentItemPosition() {
        return this.currentItemPosition;
    }

    public final void init(@NotNull List<? extends MediaCentricVO.MediaItemVO> items, int startPosition, boolean isProgressBarVisible) {
        Intrinsics.checkNotNullParameter(items, "items");
        fullReset();
        this.currentItemPosition = startPosition;
        if (isProgressBarVisible) {
            int i11 = 0;
            for (Object obj : items) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                MediaCentricVO.MediaItemVO mediaItemVO = (MediaCentricVO.MediaItemVO) obj;
                MediaCentricProgressBarItem createProgressBar = createProgressBar(mediaItemVO, i11 < C7714v.P(items));
                this.progressBars.add(createProgressBar);
                addView(createProgressBar);
                if (i11 == startPosition && (mediaItemVO instanceof MediaCentricVO.MediaItemVO.Image)) {
                    createProgressBar.stopAndFill();
                }
                i11 = i12;
            }
        }
    }

    public final void pause(int position) {
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if (mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.pause();
        }
    }

    public final void play(int position) {
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if (mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.play();
        }
    }

    public final void removeAnimationListener(int position) {
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if (mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.setOnAnimationEnd(null);
        }
    }

    public final void setAnimationListener(int position, @NotNull Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if (mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.setOnAnimationEnd(onAnimationEnd);
        }
    }

    public final void setCurrentProgressBar(int position) {
        stopAndReset();
        this.currentItemPosition = position;
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if (mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.setAsCurrent();
        }
    }

    public final void setProgressDuration(int position, long duration) {
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if ((mediaCentricProgressBarItem == null || mediaCentricProgressBarItem.getDuration() != duration) && mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.setDuration(duration);
        }
    }

    public final void stopAndFill(int position) {
        MediaCentricProgressBarItem mediaCentricProgressBarItem = (MediaCentricProgressBarItem) C7714v.Q(position, this.progressBars);
        if (mediaCentricProgressBarItem != null) {
            mediaCentricProgressBarItem.stopAndFill();
        }
    }

    public final void stopAndReset() {
        Iterator<T> it = this.progressBars.iterator();
        while (it.hasNext()) {
            ((MediaCentricProgressBarItem) it.next()).stopAndReset();
        }
    }
}
