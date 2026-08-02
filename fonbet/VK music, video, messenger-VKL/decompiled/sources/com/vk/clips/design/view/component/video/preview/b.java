package com.vk.clips.design.view.component.video.preview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.cno;
import xsna.d3m;
import xsna.f4m;
import xsna.fot;
import xsna.gzs;
import xsna.odc0;
import xsna.pvh0;
import xsna.s3q0;

/* compiled from: UploadBadgeClipPreview.kt */
/* loaded from: classes16.dex */
public final class b extends FrameLayout implements View.OnTouchListener {
    public final ClipRectanglePreview b;
    public final bpn0 c;
    public cno<ImageView> d;
    public boolean e;
    public boolean f;
    public boolean g;
    public View.OnClickListener h;
    public gzs<s3q0> i;
    public gzs<s3q0> j;

    public b(Context context) {
        super(context, null, 0);
        this.c = new bpn0(new pvh0(this, 12));
        LayoutInflater.from(context).inflate(R.layout.upload_badge_clip_preview, (ViewGroup) this, true);
        ClipRectanglePreview clipRectanglePreview = (ClipRectanglePreview) findViewById(R.id.upload_badge_clip_preview);
        this.b = clipRectanglePreview;
        clipRectanglePreview.setClipRatio(1.2777777777777777d);
        clipRectanglePreview.setEnableBackgroundGradient(false);
        clipRectanglePreview.setEnableDimmingOverlay(true);
        f4m.j(clipRectanglePreview);
        clipRectanglePreview.setOnTouchListener(this);
    }

    public static void b(b bVar) {
        Animation loadAnimation = AnimationUtils.loadAnimation(bVar.getContext(), R.anim.upload_badge_hide);
        d3m.h(loadAnimation, new odc0(bVar, 23));
        loadAnimation.setStartOffset(0L);
        bVar.b.startAnimation(loadAnimation);
    }

    private final fot getGestureDetector() {
        return (fot) this.c.getValue();
    }

    public final void a() {
        if (this.b.getVisibility() == 0) {
            if (this.f) {
                this.g = true;
            } else {
                this.f = true;
                b(this);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((action == 1 || action == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        getGestureDetector().a(motionEvent);
        if (motionEvent.getAction() == 1) {
            float x = getX();
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > x || x > getWidth()) {
                a();
                this.e = false;
                gzs<s3q0> gzsVar = this.i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
            } else {
                animate().x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).start();
            }
            if (view != null) {
                view.performClick();
            }
        }
        return true;
    }

    public final void setOnCancelClickListener(gzs<s3q0> gzsVar) {
        this.j = gzsVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void setOnDismissListener(gzs<s3q0> gzsVar) {
        this.i = gzsVar;
    }
}
