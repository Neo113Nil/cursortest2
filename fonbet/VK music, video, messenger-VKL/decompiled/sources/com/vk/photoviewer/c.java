package com.vk.photoviewer;

import android.view.View;
import xsna.ggs;
import xsna.sns0;

/* compiled from: PhotoViewer.kt */
/* loaded from: classes3.dex */
public final class c implements View.OnAttachStateChangeListener {
    public final /* synthetic */ PhotoViewer b;

    public c(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        PhotoViewer photoViewer = this.b;
        photoViewer.c.j(photoViewer);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        PhotoViewer photoViewer = this.b;
        ggs ggsVar = photoViewer.q.k.get(photoViewer.r);
        if ((ggsVar instanceof sns0 ? (sns0) ggsVar : null) == null || photoViewer.p.size() != 1) {
            photoViewer.c.onDismiss();
        }
    }
}
