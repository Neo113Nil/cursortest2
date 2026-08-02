package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f17702a = new l();

    public final boolean a(@NotNull MotionEvent event, int i10) {
        float rawX;
        float rawY;
        Intrinsics.checkNotNullParameter(event, "event");
        rawX = event.getRawX(i10);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        rawY = event.getRawY(i10);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
