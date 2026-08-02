package androidx.mediarouter.app;

import android.view.View;

/* compiled from: MediaRouteExpandCollapseButton.java */
/* loaded from: classes12.dex */
public final class g implements View.OnClickListener {
    public final /* synthetic */ MediaRouteExpandCollapseButton b;

    public g(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.b = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.b;
        boolean z = mediaRouteExpandCollapseButton.i;
        mediaRouteExpandCollapseButton.i = !z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f);
            mediaRouteExpandCollapseButton.f.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.g);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.e);
            mediaRouteExpandCollapseButton.e.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.h);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
