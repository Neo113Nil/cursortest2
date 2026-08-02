package com.vk.clips.design.view.timeline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.log.L;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.a00;
import xsna.asp;
import xsna.bgy;
import xsna.bh10;
import xsna.bws;
import xsna.c230;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.iah0;
import xsna.iut0;
import xsna.j5g;
import xsna.jv;
import xsna.ku1;
import xsna.oz;
import xsna.t520;
import xsna.tv4;
import xsna.v640;
import xsna.v8;
import xsna.w640;
import xsna.xwk;
import xsna.yzs;
import xsna.zrp;

/* compiled from: MultiVideoTimelineView.kt */
/* loaded from: classes16.dex */
public class MultiVideoTimelineView extends VideoTimelineView {
    public static final int y0 = iah0.a(4);
    public static final long z0 = TimeUnit.SECONDS.toMillis(60);
    public final ArrayList<e> j0;
    public final ArrayList<b> k0;
    public boolean l0;
    public long m0;
    public boolean n0;
    public boolean o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public gzs<? extends ArrayList<Bitmap>> t0;
    public yzs<? super Context, ? super Bitmap, ? super FilterType, Bitmap> u0;
    public volatile int v0;
    public boolean w0;
    public boolean x0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultiVideoTimelineView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BOTH_CORNER;
        public static final a LEFT_CORNER;
        public static final a NORMAL;
        public static final a RIGHT_CORNER;

        static {
            a aVar = new a("NORMAL", 0);
            NORMAL = aVar;
            a aVar2 = new a("LEFT_CORNER", 1);
            LEFT_CORNER = aVar2;
            a aVar3 = new a("RIGHT_CORNER", 2);
            RIGHT_CORNER = aVar3;
            a aVar4 = new a("BOTH_CORNER", 3);
            BOTH_CORNER = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: MultiVideoTimelineView.kt */
    public final class b {
        public final a a;
        public final int b;

        public b(a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    /* compiled from: MultiVideoTimelineView.kt */
    public interface c {
    }

    /* compiled from: MultiVideoTimelineView.kt */
    public final class d {
        public final Bitmap a;
        public final a b;

        public d(Bitmap bitmap, a aVar) {
            this.a = bitmap;
            this.b = aVar;
        }
    }

    /* compiled from: MultiVideoTimelineView.kt */
    public static final class e {
        public final String a;
        public final long b;
        public final long c;
        public final FilterType d;

        public e(String str, long j, long j2, FilterType filterType) {
            this.a = str;
            this.b = j;
            this.c = j2;
            this.d = filterType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "VideoFragment(file=" + this.a + ", startMs=" + this.b + ", endMs=" + this.c + ", filter=" + this.d + ')';
        }
    }

    /* compiled from: MultiVideoTimelineView.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LEFT_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.RIGHT_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BOTH_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiVideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a0 = -1.0f;
        this.j0 = new ArrayList<>();
        this.k0 = new ArrayList<>();
        this.m0 = z0;
        this.v0 = -1;
        iut0.q(this, new w640(this));
    }

    private final void setMultiVideoPaths(List<e> list) {
        this.l0 = list.size() > 1;
        this.v0 = -1;
        this.r0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.q0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.s0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        long j = 0;
        for (e eVar : list) {
            j += eVar.c - eVar.b;
        }
        setVideoLength(j);
        this.j0.clear();
        this.j0.addAll(list);
        this.n0 = false;
    }

    @Override // com.vk.clips.design.view.timeline.a
    public final void a(Canvas canvas, int i) {
        int size = getFrames().size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size && i2 < getFrames().size()) {
            ArrayList<b> arrayList = this.k0;
            if (i2 >= arrayList.size()) {
                return;
            }
            boolean z = true;
            boolean z2 = arrayList.size() > i2;
            if (arrayList.get(i2).a != a.LEFT_CORNER && arrayList.get(i2).a != a.BOTH_CORNER) {
                z = false;
            }
            int i4 = (z2 && z && this.w0) ? y0 : 0;
            int i5 = this.l0 ? arrayList.get(i2).b : 0;
            float maxBoundWidth = ((getMaxBoundWidth() + getHorizontalOffset()) - this.q0) + i3 + i4;
            if (!this.w0) {
                maxBoundWidth -= i5;
            }
            Bitmap bitmap = getFrames().get(i2);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, maxBoundWidth, i, (Paint) null);
            }
            i3 += (getFrameWidth() - i5) + i4;
            i2++;
        }
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView, com.vk.clips.design.view.timeline.a
    public final boolean d(a00 a00Var) {
        boolean d2 = super.d(a00Var);
        int maxBoundWidth = getMaxBoundWidth() + getHorizontalOffset();
        int maxBoundWidth2 = getMaxBoundWidth() + getHorizontalOffset() + getWidth();
        if (d2) {
            return true;
        }
        if (!this.n0 || maxBoundWidth > getX() || getX() > maxBoundWidth2 || getY() < a00Var.g || getY() > getMeasuredHeight()) {
            return false;
        }
        this.o0 = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        invalidate();
        return true;
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView, com.vk.clips.design.view.timeline.a
    public final boolean e(float f2, int i, int i2) {
        if (super.e(f2, i, i2)) {
            return true;
        }
        if (!this.o0 || !this.n0) {
            return false;
        }
        float a2 = xwk.a(this.q0 - (f2 - this.s0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.p0 - i);
        this.q0 = a2;
        this.r0 = a2 / this.p0;
        invalidate();
        return true;
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView, com.vk.clips.design.view.timeline.a
    public final void f() {
        super.f();
        this.o0 = false;
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public float getLeftProgress() {
        return this.n0 ? s(getMProgressLeft()) : super.getLeftProgress();
    }

    public final int getMaxFramesCount() {
        int measuredWidth = (((getMeasuredWidth() - getPaddingEnd()) - getPaddingStart()) - (getHorizontalOffset() * 2)) - (getMaxBoundWidth() * 2);
        if (this.n0) {
            measuredWidth = (int) ((measuredWidth * getVideoLength()) / this.m0);
        }
        return (int) Math.ceil(measuredWidth / ((int) (getFrameHeight() * 0.5625f)));
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public float getProgress() {
        return this.n0 ? s(getMProgress()) : super.getProgress();
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public float getRightProgress() {
        return this.n0 ? s(getMProgressRight()) : super.getRightProgress();
    }

    public final c getScrollingDelegate() {
        return null;
    }

    public final boolean getUseMagnetize() {
        return this.x0;
    }

    public final boolean getUseSeparatedFragmentsDesign() {
        return this.w0;
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public long getWindowVideoLength() {
        return this.n0 ? this.m0 : super.getWindowVideoLength();
    }

    @Override // com.vk.clips.design.view.timeline.a
    public final void h() {
        this.v0 = -1;
        this.k0.clear();
        int measuredWidth = (((getMeasuredWidth() - getPaddingEnd()) - getPaddingStart()) - (getHorizontalOffset() * 2)) - (getMaxBoundWidth() * 2);
        if (this.n0) {
            measuredWidth = (int) ((measuredWidth * getVideoLength()) / this.m0);
        }
        float f2 = measuredWidth;
        this.p0 = f2;
        setFrameWidth((int) (getFrameHeight() * 0.5625f));
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Iterator<e> it = this.j0.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            e next = it.next();
            long j = next.c - next.b;
            float videoLength = (j / getVideoLength()) * f2;
            int max = Math.max(1, (int) Math.ceil(((float) Math.floor(videoLength)) / getFrameWidth()));
            arrayList.add(Integer.valueOf(max));
            arrayList2.add(Long.valueOf(j / ((Number) j5g.i0(arrayList)).longValue()));
            for (int i3 = 0; i3 < max; i3 = tv4.a(arrayList3, 0, i3, 1)) {
            }
            int frameWidth = (getFrameWidth() * max) - ((int) videoLength);
            if (i != e43.h(this.j0) && this.w0) {
                frameWidth += y0;
            }
            arrayList3.set(e43.h(arrayList3), Integer.valueOf(frameWidth));
            i = i2;
        }
        if (this.t0 == null) {
            setReloadFramesDisposable(new q(new s() { // from class: xsna.u640
                /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
                @Override // io.reactivex.rxjava3.core.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                    io.reactivex.rxjava3.core.r rVar2;
                    MultiVideoTimelineView.a aVar;
                    int i4;
                    Integer num;
                    ArrayList arrayList4 = arrayList;
                    MultiVideoTimelineView multiVideoTimelineView = this;
                    ArrayList arrayList5 = arrayList3;
                    ArrayList arrayList6 = arrayList2;
                    int i5 = MultiVideoTimelineView.y0;
                    if (rVar.h()) {
                        rVar.onComplete();
                        return;
                    }
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    int i6 = 0;
                    try {
                        try {
                            int size = arrayList4.size();
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < size) {
                                try {
                                    int intValue = ((Number) arrayList4.get(i7)).intValue();
                                    int i9 = 0;
                                    while (i9 < intValue && !rVar.h()) {
                                        try {
                                            if (i7 != e43.h(arrayList4) && i7 != 0 && (num = (Integer) arrayList4.get(i7)) != null && num.intValue() == 1) {
                                                aVar = MultiVideoTimelineView.a.BOTH_CORNER;
                                                if (multiVideoTimelineView.w0) {
                                                    i4 = 0;
                                                } else {
                                                    i4 = ((Number) ((i8 < 0 || i8 >= arrayList5.size()) ? 0 : arrayList5.get(i8))).intValue();
                                                }
                                                int i10 = i8;
                                                int i11 = i9;
                                                MultiVideoTimelineView.a aVar2 = aVar;
                                                MultiVideoTimelineView.d dVar = new MultiVideoTimelineView.d(multiVideoTimelineView.p(i7, i11, aVar2, i4, ((Number) arrayList6.get(i7)).longValue(), mediaMetadataRetriever), aVar2);
                                                rVar2 = rVar;
                                                rVar2.onNext(dVar);
                                                i9 = i11 + 1;
                                                i8 = i10 + 1;
                                            }
                                            rVar2.onNext(dVar);
                                            i9 = i11 + 1;
                                            i8 = i10 + 1;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i6 = i7;
                                            Exception exc = new Exception(e.getMessage() + ", path: " + multiVideoTimelineView.j0.get(i6).a, e);
                                            L.j(exc, "MultiVideoTimelineView");
                                            L.j(exc, "MultiVideoTimelineView");
                                            mediaMetadataRetriever.release();
                                            rVar2.onComplete();
                                        }
                                        aVar = (i7 == e43.h(arrayList4) || i9 != ((Number) arrayList4.get(i7)).intValue() - 1) ? (i7 == 0 || i9 != 0) ? MultiVideoTimelineView.a.NORMAL : MultiVideoTimelineView.a.LEFT_CORNER : MultiVideoTimelineView.a.RIGHT_CORNER;
                                        if (multiVideoTimelineView.w0) {
                                        }
                                        int i102 = i8;
                                        int i112 = i9;
                                        MultiVideoTimelineView.a aVar22 = aVar;
                                        MultiVideoTimelineView.d dVar2 = new MultiVideoTimelineView.d(multiVideoTimelineView.p(i7, i112, aVar22, i4, ((Number) arrayList6.get(i7)).longValue(), mediaMetadataRetriever), aVar22);
                                        rVar2 = rVar;
                                    }
                                    i7++;
                                    i8 = i8;
                                } catch (Exception e3) {
                                    e = e3;
                                    rVar2 = rVar;
                                }
                            }
                            rVar2 = rVar;
                        } catch (Exception e4) {
                            e = e4;
                            rVar2 = rVar;
                        }
                        mediaMetadataRetriever.release();
                        rVar2.onComplete();
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                }
            }).r0(getRxScheduler()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jv(new ku1(20, arrayList3, this), 27), new v8(new bws(3), 29)));
        } else {
            setReloadFramesDisposable(new v(new v640(this, 0)).q(getRxScheduler()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oz(new bgy(this, 12), 23), new t520(new c230(this, 4), 6)));
        }
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public final float k(float f2, float f3) {
        if (this.x0 && Math.abs(this.s0 - f2) < 5.0f) {
            float s = this.n0 ? s(f3) : f3;
            Iterator<e> it = this.j0.iterator();
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                e next = it.next();
                if (Math.abs(f4 - s) < Math.min(0.02f, 1200.0f / getVideoLength())) {
                    return this.n0 ? o(f4) : f4;
                }
                f4 += ((next.c - next.b) * 1.0f) / getVideoLength();
            }
        }
        return f3;
    }

    public final float o(float f2) {
        return xwk.a(((f2 - this.r0) / this.m0) * getVideoLength(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    @Override // com.vk.clips.design.view.timeline.a, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.s0 = motionEvent.getX();
        return onTouchEvent;
    }

    public final Bitmap p(int i, int i2, a aVar, int i3, long j, MediaMetadataRetriever mediaMetadataRetriever) {
        FilterType filterType;
        yzs<? super Context, ? super Bitmap, ? super FilterType, Bitmap> yzsVar;
        long j2 = 1000;
        long j3 = i2 * j * j2;
        Bitmap bitmap = null;
        try {
            bitmap = q(i, ((j / 2) * j2) + j3, mediaMetadataRetriever);
            if (bitmap != null) {
                Bitmap i4 = com.vk.clips.design.view.timeline.a.i(Math.max(1, getFrameWidth() - i3), getFrameHeight(), bitmap);
                try {
                    bitmap.recycle();
                    bitmap = i4;
                } catch (Exception e2) {
                    e = e2;
                    bitmap = i4;
                    L.j(e, "MultiVideoTimelineView");
                    return bitmap;
                }
            }
            if (bitmap != null && (filterType = this.j0.get(i).d) != FilterType.NONE && (yzsVar = this.u0) != null) {
                Bitmap invoke = yzsVar.invoke(getContext(), bitmap, filterType);
                bitmap.recycle();
                bitmap = invoke;
            }
            return (!this.w0 || bitmap == null || aVar == a.NORMAL) ? bitmap : r(bitmap, aVar);
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final Bitmap q(int i, long j, MediaMetadataRetriever mediaMetadataRetriever) {
        if (!this.j0.isEmpty()) {
            try {
                if (i != this.v0) {
                    mediaMetadataRetriever.setDataSource(this.j0.get(i).a);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((this.j0.get(i).b * 1000) + j);
                this.v0 = i;
                return frameAtTime;
            } catch (Exception e2) {
                L.j(e2, "MultiVideoTimelineView");
            }
        }
        return null;
    }

    public final Bitmap r(Bitmap bitmap, a aVar) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(createBitmap);
        Path path = new Path();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float framesCornerRadius = getFramesCornerRadius();
        int i = f.$EnumSwitchMapping$0[aVar.ordinal()];
        float[] fArr = i != 1 ? i != 2 ? i != 3 ? null : new float[]{framesCornerRadius, framesCornerRadius, framesCornerRadius, framesCornerRadius, framesCornerRadius, framesCornerRadius, framesCornerRadius, framesCornerRadius} : new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, framesCornerRadius, framesCornerRadius, framesCornerRadius, framesCornerRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{framesCornerRadius, framesCornerRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, framesCornerRadius, framesCornerRadius};
        if (fArr != null) {
            path.addRoundRect(new RectF(rect), fArr, Path.Direction.CW);
        }
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, rect, rect, (Paint) null);
        bitmap.recycle();
        path.close();
        return createBitmap;
    }

    public final float s(float f2) {
        return n0.b(this.m0, getVideoLength(), f2, this.r0);
    }

    public final void setExternalFilterToBitmapProvider(yzs<? super Context, ? super Bitmap, ? super FilterType, Bitmap> yzsVar) {
        this.u0 = yzsVar;
    }

    public final void setExternalFrameProvider(gzs<? extends ArrayList<Bitmap>> gzsVar) {
        this.t0 = gzsVar;
        h();
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public void setMoveProgressByTap(boolean z) {
        super.setMoveProgressByTap(z);
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public void setProgress(float f2) {
        if (this.n0) {
            super.setProgress(o(f2));
        } else {
            super.setProgress(f2);
        }
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public void setProgressLeft(float f2) {
        long j;
        if (!this.n0) {
            super.setProgressLeft(f2);
            return;
        }
        long videoLength = (long) (f2 * getVideoLength());
        long videoLength2 = getVideoLength() - this.m0;
        if (videoLength > videoLength2) {
            j = videoLength - videoLength2;
            videoLength = videoLength2;
        } else {
            j = 0;
        }
        float videoLength3 = videoLength / getVideoLength();
        this.r0 = videoLength3;
        this.q0 = videoLength3 * this.p0;
        super.setProgressLeft(j / this.m0);
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public void setProgressRight(float f2) {
        if (this.n0) {
            super.setProgressRight(o(f2));
        } else {
            super.setProgressRight(f2);
        }
    }

    public final void setUseMagnetize(boolean z) {
        this.x0 = z;
    }

    public final void setUseSeparatedFragmentsDesign(boolean z) {
        this.w0 = z;
        setForceRedraw(true);
        g();
        setForceRedraw(true);
    }

    public final void setVideoData(List<e> list) {
        if (list != null) {
            setMultiVideoPaths(list);
        }
    }

    public final void setVideoFragment(e eVar) {
        setMultiVideoPaths(Collections.singletonList(eVar));
    }

    @Override // com.vk.clips.design.view.timeline.VideoTimelineView
    public void setVideoPath(String str) {
        if (str == null) {
            return;
        }
        super.setVideoPath(str);
        setMultiVideoPaths(Collections.singletonList(new e(str, 0L, getVideoLength(), FilterType.NONE)));
    }

    public final void setScrollingDelegate(c cVar) {
    }
}
