package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import android.view.GestureDetector;
import android.view.MotionEvent;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J*\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J*\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "host", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwayGestureConsumer;", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwayGestureConsumer;)V", "onDown", "", "motionEvent", "Landroid/view/MotionEvent;", "onScroll", "motionEvent1", "motionEvent2", "distanceX", "", "distanceY", "onSingleTapUp", "onFling", "velocityX", "velocityY", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySchemeGestureListener extends GestureDetector.SimpleOnGestureListener {

    @NotNull
    private final TravelRailwayGestureConsumer host;

    public TravelRailwaySchemeGestureListener(@NotNull TravelRailwayGestureConsumer host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.host.requestDisallowIntercept(true);
        if (!this.host.getScroller().isFinished()) {
            this.host.getScroller().forceFinished(true);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent1, @NotNull MotionEvent motionEvent2, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent2");
        if (Math.abs(velocityX) <= 200.0f) {
            return false;
        }
        this.host.startFling((int) (-velocityX));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent1, @NotNull MotionEvent motionEvent2, float distanceX, float distanceY) {
        Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent2");
        this.host.scrollBy(C6915b.c(distanceX));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.host.handleClick(motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
