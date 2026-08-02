package androidx.mediarouter.app;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ MediaRouteExpandCollapseButton a;

    public h(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        AnimationDrawable animationDrawable = mediaRouteExpandCollapseButton.e;
        AnimationDrawable animationDrawable2 = mediaRouteExpandCollapseButton.d;
        boolean z = mediaRouteExpandCollapseButton.h;
        mediaRouteExpandCollapseButton.h = !z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable);
            animationDrawable.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable2);
            animationDrawable2.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.g);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
