package com.vk.photogallery;

import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: PhotoGalleryViewer.kt */
/* loaded from: classes4.dex */
public final class b implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        UiTracker.i.j(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_GALLERY), true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
