package com.vk.libvideo.design.view.autoplay.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.a4s0;
import xsna.afl0;
import xsna.an10;
import xsna.asp;
import xsna.bh10;
import xsna.bwt0;
import xsna.ejf0;
import xsna.epo;
import xsna.epx;
import xsna.f4m;
import xsna.fyd0;
import xsna.ghn0;
import xsna.msy;
import xsna.oqh0;
import xsna.orj0;
import xsna.owo0;
import xsna.p1d0;
import xsna.sox;
import xsna.swe0;
import xsna.zjw;
import xsna.zrp;

/* compiled from: VideoAutoPlaySeekBarLayout2.kt */
/* loaded from: classes2.dex */
public final class VideoAutoPlaySeekBarLayout2 extends ConstraintLayout {
    public a t;
    public VideoAutoPlaySeekBarView2.b u;
    public SeekArea v;
    public final b w;
    public final epo x;
    public final d y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAutoPlaySeekBarLayout2.kt */
    public static final class SeekArea {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SeekArea[] $VALUES;
        public static final SeekArea Large;
        public static final SeekArea Small;

        static {
            SeekArea seekArea = new SeekArea("Small", 0);
            Small = seekArea;
            SeekArea seekArea2 = new SeekArea("Large", 1);
            Large = seekArea2;
            SeekArea[] seekAreaArr = {seekArea, seekArea2};
            $VALUES = seekAreaArr;
            $ENTRIES = new asp(seekAreaArr);
        }

        public SeekArea() {
            throw null;
        }

        public static SeekArea valueOf(String str) {
            return (SeekArea) Enum.valueOf(SeekArea.class, str);
        }

        public static SeekArea[] values() {
            return (SeekArea[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAutoPlaySeekBarLayout2.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final long c;
        public final owo0 d;
        public final sox e;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            owo0 owo0Var = this.d;
            int hashCode = (a + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31;
            sox soxVar = this.e;
            return hashCode + (soxVar != null ? soxVar.hashCode() : 0);
        }

        public final String toString() {
            return "State(position=" + this.a + ", bufferedPosition=" + this.b + ", duration=" + this.c + ", timelineImages=" + this.d + ", intervals=" + this.e + ')';
        }

        public /* synthetic */ a(int i) {
            this(0L, 0L, 0L, null, null);
        }

        public a(long j, long j2, long j3, owo0 owo0Var, sox soxVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = owo0Var;
            this.e = soxVar;
        }
    }

    /* compiled from: VideoAutoPlaySeekBarLayout2.kt */
    public static final class b {
        public final Object a;
        public final Object b;
        public final Object c;
        public final Object d;
        public final Object e;

        public b(VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2) {
            p1d0 p1d0Var = new p1d0(videoAutoPlaySeekBarLayout2, 29);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.a = msy.a(lazyThreadSafetyMode, p1d0Var);
            this.b = msy.a(lazyThreadSafetyMode, new afl0(videoAutoPlaySeekBarLayout2, 12));
            this.c = msy.a(lazyThreadSafetyMode, new orj0(videoAutoPlaySeekBarLayout2, 17));
            this.d = msy.a(lazyThreadSafetyMode, new oqh0(videoAutoPlaySeekBarLayout2, 11));
            this.e = msy.a(lazyThreadSafetyMode, new ghn0(videoAutoPlaySeekBarLayout2, 4));
            View.inflate(videoAutoPlaySeekBarLayout2.getContext(), R.layout.video_autoplay_seekbar_layout_2, videoAutoPlaySeekBarLayout2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final VideoAutoPlaySeekBarView2 a() {
            return (VideoAutoPlaySeekBarView2) this.a.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final SeekPreviewImageView b() {
            return (SeekPreviewImageView) this.c.getValue();
        }
    }

    /* compiled from: VideoAutoPlaySeekBarLayout2.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeekArea.values().length];
            try {
                iArr[SeekArea.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeekArea.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoAutoPlaySeekBarLayout2.kt */
    public static final class d {
        public final Object a;
        public final Object b;

        public d(VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2) {
            ejf0 ejf0Var = new ejf0(videoAutoPlaySeekBarLayout2, 14);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.a = msy.a(lazyThreadSafetyMode, ejf0Var);
            this.b = msy.a(lazyThreadSafetyMode, new fyd0(videoAutoPlaySeekBarLayout2, 15));
        }
    }

    /* compiled from: VideoAutoPlaySeekBarLayout2.kt */
    public static final class e implements VideoAutoPlaySeekBarView2.b {
        public e() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2.b
        public final void a(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
            long j;
            int i2;
            String formatter;
            Object obj;
            VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2 = VideoAutoPlaySeekBarLayout2.this;
            b bVar = videoAutoPlaySeekBarLayout2.w;
            VideoAutoPlaySeekBarView2.b seekBarChangeListener = videoAutoPlaySeekBarLayout2.getSeekBarChangeListener();
            if (seekBarChangeListener != null) {
                seekBarChangeListener.a(videoAutoPlaySeekBarView2, i);
            }
            if (videoAutoPlaySeekBarView2.getProgress() != i) {
                j = an10.c(bwt0.w0(bVar.a(), i) * videoAutoPlaySeekBarLayout2.t.c);
            } else {
                j = videoAutoPlaySeekBarLayout2.getState().a;
            }
            bVar.b().setPosition(j);
            TextView textView = (TextView) bVar.d.getValue();
            epo epoVar = videoAutoPlaySeekBarLayout2.x;
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            Formatter formatter2 = (Formatter) epoVar.c;
            Integer valueOf = Integer.valueOf(seconds);
            if (seconds == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                i2 = intValue / Math.abs(intValue);
            } else {
                i2 = 1;
            }
            int abs = Math.abs(seconds);
            int i3 = abs % 60;
            int i4 = (abs - i3) / 60;
            int i5 = i4 % 60;
            int i6 = ((i4 - i5) / 60) % 60;
            ((StringBuilder) epoVar.b).setLength(0);
            if (i6 > 0) {
                formatter = formatter2.format("%d:%02d:%02d", Integer.valueOf(i2 * i6), Integer.valueOf(i5), Integer.valueOf(i3)).toString();
            } else {
                formatter = formatter2.format("%s%02d:%02d", i2 < 0 ? "-" : "", Integer.valueOf(i5), Integer.valueOf(i3)).toString();
            }
            textView.setText(formatter);
            sox soxVar = videoAutoPlaySeekBarLayout2.getState().e;
            if (soxVar != null) {
                TextView textView2 = (TextView) bVar.e.getValue();
                Iterator it = soxVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    sox.a aVar = (sox.a) obj;
                    long j2 = aVar.a;
                    if (j <= aVar.b && j2 <= j) {
                        break;
                    }
                }
                sox.a aVar2 = (sox.a) obj;
                textView2.setText(aVar2 != null ? aVar2.c : null);
            }
        }

        /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2.b
        public final void b(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
            VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2 = VideoAutoPlaySeekBarLayout2.this;
            VideoAutoPlaySeekBarView2.b seekBarChangeListener = videoAutoPlaySeekBarLayout2.getSeekBarChangeListener();
            if (seekBarChangeListener != null) {
                seekBarChangeListener.b(videoAutoPlaySeekBarView2, i);
            }
            videoAutoPlaySeekBarView2.setProgress(i, false);
            b bVar = videoAutoPlaySeekBarLayout2.w;
            bwt0.a((View) bVar.b.getValue(), false, true, 150L, 120);
            bwt0.a((TextView) bVar.d.getValue(), false, true, 150L, 120);
            bwt0.a((TextView) bVar.e.getValue(), false, true, 150L, 120);
            bwt0.a(bVar.b(), false, false, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2.b
        public final void c(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
            VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2 = VideoAutoPlaySeekBarLayout2.this;
            VideoAutoPlaySeekBarView2.b seekBarChangeListener = videoAutoPlaySeekBarLayout2.getSeekBarChangeListener();
            if (seekBarChangeListener != null) {
                seekBarChangeListener.c(videoAutoPlaySeekBarView2, i);
            }
            b bVar = videoAutoPlaySeekBarLayout2.w;
            bwt0.a((View) bVar.b.getValue(), true, true, 150L, 120);
            bwt0.a((TextView) bVar.d.getValue(), true, true, 150L, 120);
            bwt0.a((TextView) bVar.e.getValue(), videoAutoPlaySeekBarLayout2.getState().e != null, true, 150L, 120);
            bwt0.a(bVar.b(), true, false, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
    }

    public VideoAutoPlaySeekBarLayout2(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final int P4(long j) {
        VideoAutoPlaySeekBarView2 a2 = this.w.a();
        Float valueOf = Float.valueOf(this.t.c);
        if (valueOf.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return an10.b((swe0.f(j / valueOf.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * (a2.getMax() - a2.getMin())) + a2.getMin());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void Q4() {
        int intValue;
        VideoAutoPlaySeekBarView2 a2 = this.w.a();
        int i = c.$EnumSwitchMapping$0[this.v.ordinal()];
        d dVar = this.y;
        if (i == 1) {
            intValue = ((Number) dVar.a.getValue()).intValue();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intValue = ((Number) dVar.b.getValue()).intValue();
        }
        f4m.y(intValue, a2);
    }

    public final zjw getImageLoader() {
        return this.w.b().getImageLoader();
    }

    public final int getPreviewHeight() {
        return this.w.b().getHeight();
    }

    public final SeekArea getSeekArea() {
        return this.v;
    }

    public final VideoAutoPlaySeekBarView2.b getSeekBarChangeListener() {
        return this.u;
    }

    public final a getState() {
        return this.t;
    }

    public final float getThumbSnapFraction() {
        return this.w.a().getThumbSnapFraction();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w.a().setTranslationY(r2.a().getPaddingBottom() - r2.a().getHeight());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public final void setImageLoader(zjw zjwVar) {
        this.w.b().setImageLoader(zjwVar);
    }

    public final void setPreviewHeight(int i) {
        b bVar = this.w;
        if (bVar.b().getHeight() != i) {
            SeekPreviewImageView b2 = bVar.b();
            ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar2).height = i;
            b2.setLayoutParams(bVar2);
        }
    }

    public final void setSeekArea(SeekArea seekArea) {
        this.v = seekArea;
        Q4();
    }

    public final void setSeekBarChangeListener(VideoAutoPlaySeekBarView2.b bVar) {
        this.u = bVar;
    }

    public final void setState(a aVar) {
        this.t = aVar;
        b bVar = this.w;
        VideoAutoPlaySeekBarView2 a2 = bVar.a();
        a2.setProgress(P4(this.t.a), true);
        a2.setSecondaryProgress(P4(this.t.b));
        if (!epx.f(a2.getIntervals(), this.t.e)) {
            a2.setIntervals(this.t.e);
        }
        SeekPreviewImageView b2 = bVar.b();
        b2.setDuration(this.t.c);
        b2.setTimelineImages(this.t.d);
    }

    public final void setThumbSnapFraction(float f) {
        this.w.a().setThumbSnapFraction(f);
    }

    public VideoAutoPlaySeekBarLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoAutoPlaySeekBarLayout2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VideoAutoPlaySeekBarLayout2(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public VideoAutoPlaySeekBarLayout2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = new a(0);
        this.v = SeekArea.Large;
        b bVar = new b(this);
        this.w = bVar;
        epo epoVar = new epo();
        StringBuilder sb = new StringBuilder();
        epoVar.b = sb;
        epoVar.c = new Formatter(sb, Locale.getDefault());
        this.x = epoVar;
        e eVar = new e();
        this.y = new d(this);
        setClipToPadding(false);
        VideoAutoPlaySeekBarView2 a2 = bVar.a();
        Q4();
        a2.setListener(eVar);
        SeekPreviewImageView b2 = bVar.b();
        b2.setShowBorder(false);
        b2.setClipToOutline(false);
        b2.setOutlineProvider(null);
        ((View) bVar.b.getValue()).setBackground(new a4s0(getContext()));
    }
}
