package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/SwipeDetector;", "", "context", "Landroid/content/Context;", "onSwipeDown", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "swipeThreshold", "", "detectSwipeDown", "", "startEventX", "startEventY", "endEventX", "endEventY", "(Ljava/lang/Float;Ljava/lang/Float;FF)Z", "detectHorizontalSwipe", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwipeDetector {
    private final Function0<Unit> onSwipeDown;
    private final float swipeThreshold;

    public SwipeDetector(@NotNull Context context, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.onSwipeDown = function0;
        this.swipeThreshold = ResourceExtKt.toPxF(50, context);
    }

    public final boolean detectHorizontalSwipe(Float startEventX, Float startEventY, float endEventX, float endEventY) {
        if (startEventX != null && startEventY != null) {
            if (Math.abs(endEventX - startEventX.floatValue()) > Math.abs(endEventY - startEventY.floatValue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean detectSwipeDown(Float startEventX, Float startEventY, float endEventX, float endEventY) {
        if (startEventX != null && startEventY != null) {
            float floatValue = endEventY - startEventY.floatValue();
            if (Math.abs(floatValue) > Math.abs(endEventX - startEventX.floatValue()) && floatValue > this.swipeThreshold) {
                Function0<Unit> function0 = this.onSwipeDown;
                if (function0 == null) {
                    return true;
                }
                function0.invoke();
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ SwipeDetector(Context context, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : function0);
    }
}
