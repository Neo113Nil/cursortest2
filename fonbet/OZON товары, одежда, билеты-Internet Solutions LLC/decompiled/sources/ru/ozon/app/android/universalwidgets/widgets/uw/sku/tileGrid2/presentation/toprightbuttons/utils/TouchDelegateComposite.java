package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0001R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "Landroid/view/TouchDelegate;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "delegates", "", "", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "addDelegate", "", "key", "delegate", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TouchDelegateComposite extends TouchDelegate {

    @NotNull
    private final Map<Integer, TouchDelegate> delegates;

    public TouchDelegateComposite(View view) {
        super(new Rect(), view);
        this.delegates = new LinkedHashMap();
    }

    public final void addDelegate(int key, @NotNull TouchDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegates.put(Integer.valueOf(key), delegate);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        boolean z11;
        Intrinsics.checkNotNullParameter(event, "event");
        while (true) {
            for (TouchDelegate touchDelegate : this.delegates.values()) {
                event.setLocation(event.getX(), event.getY());
                z11 = touchDelegate.onTouchEvent(event) || z11;
            }
            return z11;
        }
    }
}
