package ru.ozon.app.android.pikazon.placeholdertracker;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAttachStateChangeListener;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackerImpl;", "placeholderTracker$delegate", "LSc/j;", "getPlaceholderTracker", "()Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackerImpl;", "placeholderTracker", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderAttachStateChangeListener implements View.OnAttachStateChangeListener {

    @NotNull
    public static final PlaceholderAttachStateChangeListener INSTANCE = new PlaceholderAttachStateChangeListener();

    /* renamed from: placeholderTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j placeholderTracker = k.b(PlaceholderAttachStateChangeListener$placeholderTracker$2.INSTANCE);

    private PlaceholderAttachStateChangeListener() {
    }

    private final PlaceholderTrackerImpl getPlaceholderTracker() {
        return (PlaceholderTrackerImpl) placeholderTracker.getValue();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        getPlaceholderTracker().addView(v11);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        getPlaceholderTracker().removeView(v11);
    }
}
