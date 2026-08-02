package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import java.io.IOException;
import xsna.a00;
import xsna.e43;
import xsna.epx;
import xsna.fkt0;
import xsna.iah0;

/* compiled from: VideoTimelineView.kt */
/* loaded from: classes16.dex */
public class VideoTimelineView extends a {
    public boolean W;
    public float a0;
    public float b0;
    public long c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public Float g0;
    public boolean h0;
    public fkt0 i0;

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a0 = -1.0f;
    }

    @Override // com.vk.clips.design.view.timeline.a
    public boolean d(a00 a00Var) {
        VideoTimelineView videoTimelineView;
        if (this.h0) {
            a00Var = a00.a(a00Var, a00Var.c - a.getDEFAULT_MAX_BOUND_WIDTH(), a.getDEFAULT_MAX_BOUND_WIDTH() + a00Var.d, 0, 243);
        }
        if (this.f0) {
            videoTimelineView = this;
            a00Var = a00.a(a00Var, 0, 0, videoTimelineView.m(a00Var.a, a00Var.h, a00Var.c, a00Var.d, false), 239);
        } else {
            videoTimelineView = this;
        }
        int i = a00Var.e;
        float f = a00Var.a;
        if (getWithProgressLine() || getProgressWindowMode()) {
            float f2 = a00Var.b;
            int i2 = a00Var.f;
            int i3 = a00Var.c;
            int i4 = a00Var.d;
            int a = iah0.a(18);
            if (i - a <= f && f <= i + a && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= i2 && ((i3 - a > f || i3 < f) && (a + i4 < f || i4 > f))) {
                videoTimelineView.W = true;
                videoTimelineView.b0 = (int) (f - i);
                getParent().requestDisallowInterceptTouchEvent(true);
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.clips.design.view.timeline.a
    public boolean e(float f, int i, int i2) {
        int maxBoundWidth = getMaxBoundWidth() + getHorizontalOffset();
        int maxBoundWidth2 = getMaxBoundWidth() + getHorizontalOffset() + i;
        if (!getPressedLeft()) {
            if (!this.W) {
                return false;
            }
            m(f, i, maxBoundWidth, maxBoundWidth2, true);
            if (getProgressWindowMode()) {
                n();
            }
            invalidate();
            return true;
        }
        int maxBoundWidth3 = getMaxBoundWidth() + getHorizontalOffset() + i;
        int i3 = (int) (f - this.b0);
        if (i3 < getMaxBoundWidth() + getHorizontalOffset()) {
            i3 = getMaxBoundWidth() + getHorizontalOffset();
        } else {
            int i4 = maxBoundWidth3 - i2;
            if (i3 > i4) {
                i3 = Math.max(i4, getMaxBoundWidth() + getHorizontalOffset());
            }
        }
        float horizontalOffset = ((i3 - getHorizontalOffset()) - getMaxBoundWidth()) / i;
        if (getMProgressRight() - horizontalOffset < this.a0) {
            horizontalOffset = getMProgressRight() - this.a0;
        }
        if (horizontalOffset > getMProgressRight()) {
            return false;
        }
        setMProgressLeft(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(horizontalOffset, getMProgressRight() - (getMinProgressRangeMs() / getWindowVideoLength()))));
        setMProgressLeft(k(f, getMProgressLeft()));
        if (this.i0 != null) {
            getMProgressLeft();
        }
        invalidate();
        return false;
    }

    @Override // com.vk.clips.design.view.timeline.a
    public void f() {
        fkt0 fkt0Var = this.i0;
        if (fkt0Var != null) {
            if (fkt0Var != null) {
                fkt0Var.l(getProgress());
            }
            fkt0 fkt0Var2 = this.i0;
            if (fkt0Var2 != null) {
                fkt0Var2.b();
            }
        }
        setPressedLeft(false);
        this.W = false;
        this.d0 = false;
    }

    public float getLeftProgress() {
        return getMProgressLeft();
    }

    public float getProgress() {
        return getMProgress();
    }

    public float getRightProgress() {
        return getMProgressRight();
    }

    public long getWindowVideoLength() {
        return getVideoLength();
    }

    public final void l(int i) {
        float f = i;
        this.a0 = 1.0f - (((f - 100.0f) * 1.0f) / f);
        setDuration(i);
        setMinDelta(1000.0f / f);
    }

    public final int m(float f, int i, int i2, int i3, boolean z) {
        int horizontalOffset;
        int maxBoundWidth;
        int i4 = (int) (f - this.b0);
        if (i4 >= i2) {
            if (i4 > i3) {
                i2 = i3;
            } else {
                if (i4 < getMaxBoundWidth() + getHorizontalOffset()) {
                    horizontalOffset = getHorizontalOffset();
                    maxBoundWidth = getMaxBoundWidth();
                } else {
                    if (i4 > getMaxBoundWidth() + getHorizontalOffset() + i) {
                        horizontalOffset = getHorizontalOffset() + i;
                        maxBoundWidth = getMaxBoundWidth();
                    } else {
                        i2 = i4;
                    }
                }
                i2 = maxBoundWidth + horizontalOffset;
            }
        }
        setMProgress(((i2 - getHorizontalOffset()) - getMaxBoundWidth()) / i);
        fkt0 fkt0Var = this.i0;
        if (fkt0Var != null) {
            if (z && this.e0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.d0 = true;
                if (currentTimeMillis - this.c0 > 130) {
                    fkt0 fkt0Var2 = this.i0;
                    if (fkt0Var2 != null) {
                        fkt0Var2.l(getProgress());
                    }
                    this.c0 = currentTimeMillis;
                    return i2;
                }
            } else if (fkt0Var != null) {
                fkt0Var.l(getProgress());
            }
        }
        return i2;
    }

    public final void n() {
        Float f = this.g0;
        if (f != null) {
            float floatValue = f.floatValue();
            setMProgressLeft(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMProgress() - (floatValue / 2)), 1 - floatValue));
            setMProgressRight(getMProgressLeft() + floatValue);
        }
    }

    public void setMoveProgressByTap(boolean z) {
        this.f0 = z;
    }

    public void setProgress(float f) {
        if (this.d0) {
            return;
        }
        setMProgress(f);
        invalidate();
    }

    public void setProgressLeft(float f) {
        setMProgressLeft(f);
        invalidate();
    }

    public final void setProgressMs(long j) {
        setProgress(j / getVideoLength());
    }

    public void setProgressRight(float f) {
        setMProgressRight(f);
        invalidate();
    }

    public void setVideoPath(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        setMVideoPath(str);
        Uri parse = Uri.parse(str);
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (epx.f(parse.getScheme(), "CONTENT")) {
                Context context = e43.a;
                mediaMetadataRetriever.setDataSource(context != null ? context : null, parse);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            setVideoLength(extractMetadata != null ? Long.parseLong(extractMetadata) : 0L);
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e2) {
                L.j(e2, "timeline");
            }
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            L.j(new Exception(e.getMessage() + ", path: " + str, e), "timeline");
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (IOException e4) {
                    L.j(e4, "timeline");
                }
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (IOException e5) {
                    L.j(e5, "timeline");
                }
            }
            throw th;
        }
    }

    public float k(float f, float f2) {
        return f2;
    }
}
