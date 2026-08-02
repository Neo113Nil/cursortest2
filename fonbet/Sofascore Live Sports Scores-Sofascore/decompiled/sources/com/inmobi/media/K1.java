package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K1 extends FrameLayout {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Of f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(Context context) {
        super(context, null);
        context.getClass();
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i == this.b && i2 == this.c && i5 == this.d && i6 == this.e) {
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i5;
        this.e = i6;
        Of of = this.f;
        if (of != null) {
            V7 v7 = ((J7) of).a;
            VideoViewPosition videoViewPosition = new VideoViewPosition();
            videoViewPosition.setX(N3.a(i));
            videoViewPosition.setY(N3.a(i2));
            videoViewPosition.setWidth(N3.a(i5));
            videoViewPosition.setHeight(N3.a(i6));
            v7.a(new C3749s8(videoViewPosition));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = this.a;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = size;
            float f3 = size2;
            if (f2 / f3 > f) {
                size = (int) (f3 * f);
            } else {
                size2 = (int) (f2 / f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void setOnPositionChangeListener(@Nullable Of of) {
        this.f = of;
    }
}
