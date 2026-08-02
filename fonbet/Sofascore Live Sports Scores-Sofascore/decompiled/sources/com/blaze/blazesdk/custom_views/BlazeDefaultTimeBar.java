package com.blaze.blazesdk.custom_views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ironsource.C4018c8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.task.g;
import defpackage.ahj;
import defpackage.chj;
import defpackage.nik;
import defpackage.njf;
import defpackage.s2;
import defpackage.uql;
import defpackage.wt3;
import defpackage.y2;
import defpackage.z1a;
import defpackage.z1g;
import defpackage.zzl;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002efB=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010 \u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u0017J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0017J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010%\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u0017J\u0017\u0010&\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010(\u001a\u00020\u000f2\b\b\u0001\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0017J\u0017\u0010)\u001a\u00020\u000f2\b\b\u0001\u0010'\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010*\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u000f2\b\b\u0001\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0017J\u0017\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010,\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0017J\u0017\u00100\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0017J\u0017\u00102\u001a\u00020\u000f2\b\b\u0001\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\u0017J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010\u0017J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000203H\u0016¢\u0006\u0004\b:\u00106J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u000203H\u0016¢\u0006\u0004\b<\u00106J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u000203H\u0016¢\u0006\u0004\b>\u00106J\u000f\u0010?\u001a\u000203H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\rH\u0016¢\u0006\u0004\bB\u0010\u0011R\u001a\u0010H\u001a\u00020C8BX\u0082\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\u00020C8BX\u0082\u0004¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR\u001a\u0010N\u001a\u00020C8BX\u0082\u0004¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u001e\u0010P\u001a\u0004\u0018\u00010O8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010T\u001a\u00020\u00078B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010WR\u0014\u0010\\\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010@R\u0014\u0010b\u001a\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010@¨\u0006g"}, d2 = {"Lcom/blaze/blazesdk/custom_views/BlazeDefaultTimeBar;", "Landroid/view/View;", "Lchj;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "timebarAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V", "", C4018c8.k, "", "setPlayingScrubberIsVisible", "(Z)V", "setPausedScrubberIsVisible", "setPausedSeekbarIsVisible", "setPlayingSeekbarIsVisible", "size", "setScrubberPlayingSize", "(I)V", "setScrubberDisabledSize", "setScrubberPausedSize", "", "cornerRadius", "setSeekbarPlayingCornerRadius", "(F)V", "setSeekbarPausedCornerRadius", "setBarPlayingHeight", "setBarPausedHeight", "color", "setPlayedPaintPlayingColor", "setPlayedPaintPausedColor", "scrubberColor", "setScrubberPlayingColor", "setScrubberPausedColor", "thumbImage", "setPlayingThumbImage", "setPausedThumbImage", "bufferedColor", "setBufferedColor", "unplayedColor", "setUnplayedPlayingColor", "setUnplayedPausedColor", "adMarkerColor", "setAdMarkerColor", "playedAdMarkerColor", "setPlayedAdMarkerColor", "", "time", "setKeyTimeIncrement", "(J)V", "count", "setKeyCountIncrement", "position", "setPosition", "bufferedPosition", "setBufferedPosition", IronSourceConstants.EVENTS_DURATION, "setDuration", "getPreferredUpdateDelay", "()J", "enabled", "setEnabled", "Landroid/graphics/Paint;", g.e, "Landroid/graphics/Paint;", "getPlayedPaint", "()Landroid/graphics/Paint;", "playedPaint", CampaignEx.JSON_KEY_AD_K, "getUnplayedPaint", "unplayedPaint", TtmlNode.TAG_P, "getScrubberPaint", "scrubberPaint", "Landroid/graphics/drawable/Drawable;", "scrubberDrawable", "Landroid/graphics/drawable/Drawable;", "getScrubberDrawable", "()Landroid/graphics/drawable/Drawable;", "barHeight", "I", "getBarHeight", "()I", "getBarGravity", "barGravity", "getSeekbarCornerRadius", "()F", "seekbarCornerRadius", "getScrubberPosition", "scrubberPosition", "", "getProgressText", "()Ljava/lang/String;", "progressText", "getPositionIncrement", "positionIncrement", "com/blaze/blazesdk/custom_views/a", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeDefaultTimeBar extends View implements chj {
    public static final a e0 = new a(null);
    public int A;
    public final int B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public final int G;
    public final StringBuilder H;
    public final Formatter I;
    public final y2 J;
    public final CopyOnWriteArraySet K;
    public final Point L;
    public final float M;
    public int N;
    public long O;
    public int P;
    public float Q;
    public boolean R;
    public long S;
    public long T;
    public long U;
    public long V;
    public int W;
    public final Rect a;
    public Rect a0;
    public final Rect b;
    public long[] b0;
    public final Rect c;
    public boolean[] c0;
    public final Rect d;
    public boolean d0;
    public int e;
    public int f;

    /* renamed from: g, reason: from kotlin metadata */
    public final Paint playedPaint;
    public final Paint h;
    public int i;
    public int j;

    /* renamed from: k, reason: from kotlin metadata */
    public final Paint unplayedPaint;
    public final Paint l;
    public final Paint m;
    public int n;
    public int o;

    /* renamed from: p, reason: from kotlin metadata */
    public final Paint scrubberPaint;
    public Drawable q;
    public Drawable r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public final int w;
    public final int x;
    public int y;
    public int z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final int a(a aVar, float f, int i) {
            aVar.getClass();
            return (int) ((i * f) + 0.5f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeDefaultTimeBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        int i3;
        context.getClass();
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.playedPaint = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        this.unplayedPaint = new Paint();
        Paint paint2 = new Paint();
        this.l = paint2;
        Paint paint3 = new Paint();
        this.m = paint3;
        this.scrubberPaint = new Paint();
        this.u = true;
        this.v = true;
        this.C = true;
        this.D = true;
        getScrubberPaint().setAntiAlias(true);
        this.K = new CopyOnWriteArraySet();
        this.L = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.M = f;
        a aVar = e0;
        this.G = a.a(aVar, f, -50);
        int a2 = a.a(aVar, f, 4);
        int a3 = a.a(aVar, f, 26);
        int a4 = a.a(aVar, f, 4);
        int a5 = a.a(aVar, f, 12);
        int a6 = a.a(aVar, f, 0);
        int a7 = a.a(aVar, f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, njf.a, i, i2);
            obtainStyledAttributes.getClass();
            try {
                obtainStyledAttributes.getDrawable(10);
                if (getScrubberDrawable() != null) {
                    Drawable scrubberDrawable = getScrubberDrawable();
                    scrubberDrawable.getClass();
                    scrubberDrawable.setLayoutDirection(getLayoutDirection());
                    Drawable scrubberDrawable2 = getScrubberDrawable();
                    scrubberDrawable2.getClass();
                    int minimumHeight = scrubberDrawable2.getMinimumHeight();
                    if (minimumHeight >= a3) {
                        a3 = minimumHeight;
                    }
                }
                obtainStyledAttributes.getDimensionPixelSize(3, a2);
                this.w = obtainStyledAttributes.getDimensionPixelSize(12, a3);
                this.x = obtainStyledAttributes.getDimensionPixelSize(1, a4);
                this.y = obtainStyledAttributes.getDimensionPixelSize(11, a5);
                this.z = obtainStyledAttributes.getDimensionPixelSize(8, a6);
                this.A = obtainStyledAttributes.getDimensionPixelSize(9, a7);
                int i4 = obtainStyledAttributes.getInt(6, -1);
                int i5 = obtainStyledAttributes.getInt(7, -1);
                int i6 = obtainStyledAttributes.getInt(4, -855638017);
                int i7 = obtainStyledAttributes.getInt(13, 872415231);
                int i8 = obtainStyledAttributes.getInt(0, -1291845888);
                int i9 = obtainStyledAttributes.getInt(5, 872414976);
                getPlayedPaint().setColor(i4);
                getScrubberPaint().setColor(i5);
                paint.setColor(i6);
                getUnplayedPaint().setColor(i7);
                paint2.setColor(i8);
                paint3.setColor(i9);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.s = a2;
            this.t = a2;
            this.w = a3;
            this.x = a4;
            this.y = a5;
            this.z = a6;
            this.A = a7;
            getPlayedPaint().setColor(-1);
            getScrubberPaint().setColor(-1);
            paint.setColor(-855638017);
            getUnplayedPaint().setColor(872415231);
            paint2.setColor(-1291845888);
            paint3.setColor(872414976);
        }
        StringBuilder sb = new StringBuilder();
        this.H = sb;
        this.I = new Formatter(sb, Locale.getDefault());
        this.J = new y2(this, 24);
        if (getScrubberDrawable() != null) {
            Drawable scrubberDrawable3 = getScrubberDrawable();
            scrubberDrawable3.getClass();
            i3 = (scrubberDrawable3.getMinimumWidth() + 1) / 2;
        } else {
            int i10 = this.z;
            int i11 = this.y;
            int i12 = this.A;
            i11 = i11 < i12 ? i12 : i11;
            i3 = ((i10 < i11 ? i11 : i10) + 1) / 2;
        }
        this.B = i3;
        this.Q = 1.0f;
        new ValueAnimator().addUpdateListener(new s2(this, 4));
        this.T = C.TIME_UNSET;
        this.O = C.TIME_UNSET;
        this.N = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private final int getBarGravity() {
        return ((this.D || this.C) ? 1 : 0) ^ 1;
    }

    private final int getBarHeight() {
        return (this.R || this.d0) ? this.t : this.s;
    }

    private final Paint getPlayedPaint() {
        boolean z = this.R;
        Paint paint = this.playedPaint;
        if (z || this.d0) {
            paint.setColor(this.f);
            return paint;
        }
        paint.setColor(this.e);
        return paint;
    }

    private final long getPositionIncrement() {
        long j = this.O;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = this.T;
        if (j2 == C.TIME_UNSET) {
            return 0L;
        }
        return j2 / this.N;
    }

    private final String getProgressText() {
        String G = nik.G(this.H, this.I, this.U);
        G.getClass();
        return G;
    }

    private final Drawable getScrubberDrawable() {
        return (this.R || this.d0) ? this.r : this.q;
    }

    private final Paint getScrubberPaint() {
        boolean z = this.R;
        Paint paint = this.scrubberPaint;
        if (z || this.d0) {
            paint.setColor(this.o);
            return paint;
        }
        paint.setColor(this.n);
        return paint;
    }

    private final long getScrubberPosition() {
        if (this.b.width() <= 0 || this.T == C.TIME_UNSET) {
            return 0L;
        }
        return (this.d.width() * this.T) / r0.width();
    }

    private final float getSeekbarCornerRadius() {
        return (this.R || this.d0) ? this.F : this.E;
    }

    private final Paint getUnplayedPaint() {
        boolean z = this.R;
        Paint paint = this.unplayedPaint;
        if (z || this.d0) {
            paint.setColor(this.j);
            return paint;
        }
        paint.setColor(this.i);
        return paint;
    }

    @Override // defpackage.chj
    public final void a(long[] jArr, boolean[] zArr, int i) {
        z1a.s(i == 0 || !(jArr == null || zArr == null));
        this.W = i;
        this.b0 = jArr;
        this.c0 = zArr;
        c();
    }

    @Override // defpackage.chj
    public final void b(ahj ahjVar) {
        ahjVar.getClass();
        ahjVar.getClass();
        this.K.add(ahjVar);
    }

    public final void c() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.R ? this.S : this.U;
        if (this.T > 0) {
            int width = rect2.left + ((int) ((rect2.width() * this.V) / this.T));
            int i = rect2.right;
            if (width > i) {
                width = i;
            }
            rect.right = width;
            int width2 = rect2.left + ((int) ((rect2.width() * j) / this.T));
            int i2 = rect2.right;
            if (width2 > i2) {
                width2 = i2;
            }
            rect3.right = width2;
        } else {
            int i3 = rect2.left;
            rect.right = i3;
            rect3.right = i3;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r7.height() == r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, int i2, int i3, int i4) {
        int i5;
        int barHeight;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        int i8 = (this.D || this.C) ? this.B : 0;
        int barGravity = getBarGravity();
        int i9 = this.w;
        if (barGravity == 1) {
            i5 = (i7 - getPaddingBottom()) - i9;
            int paddingBottom = (i7 - getPaddingBottom()) - getBarHeight();
            int barHeight2 = i8 - (getBarHeight() / 2);
            if (barHeight2 < 0) {
                barHeight2 = 0;
            }
            barHeight = paddingBottom - barHeight2;
        } else {
            i5 = (i7 - i9) / 2;
            barHeight = (i7 - getBarHeight()) / 2;
        }
        Rect rect = this.a;
        rect.set(paddingLeft, i5, paddingRight, i9 + i5);
        this.b.set(rect.left + i8, barHeight, rect.right - i8, getBarHeight() + barHeight);
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect2 = this.a0;
            if (rect2 != null && rect2.width() == i6) {
                Rect rect3 = this.a0;
                rect3.getClass();
            }
            Rect rect4 = new Rect(0, 0, i6, i7);
            this.a0 = rect4;
            setSystemGestureExclusionRects(kotlin.collections.a.c(rect4));
        }
        c();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (getScrubberDrawable() != null) {
            Drawable scrubberDrawable = getScrubberDrawable();
            scrubberDrawable.getClass();
            if (scrubberDrawable.isStateful()) {
                Drawable scrubberDrawable2 = getScrubberDrawable();
                scrubberDrawable2.getClass();
                if (scrubberDrawable2.setState(getDrawableState())) {
                    invalidate();
                }
            }
        }
    }

    public final void e(Canvas canvas, float f, float f2, float f3, float f4, uql uqlVar, Paint paint) {
        float[] fArr;
        float[] fArr2;
        Path path = new Path();
        int ordinal = uqlVar.ordinal();
        int i = 0;
        if (ordinal == 0) {
            fArr = new float[]{getSeekbarCornerRadius(), getSeekbarCornerRadius(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getSeekbarCornerRadius(), getSeekbarCornerRadius()};
        } else if (ordinal == 1) {
            fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getSeekbarCornerRadius(), getSeekbarCornerRadius(), getSeekbarCornerRadius(), getSeekbarCornerRadius(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    zzl.b();
                    return;
                }
                float[] fArr3 = new float[8];
                while (i < 8) {
                    fArr3[i] = 0.0f;
                    i++;
                }
                fArr2 = fArr3;
                path.addRoundRect(f, f2, f3, f4, fArr2, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
            fArr = new float[8];
            while (i < 8) {
                fArr[i] = getSeekbarCornerRadius();
                i++;
            }
        }
        fArr2 = fArr;
        path.addRoundRect(f, f2, f3, f4, fArr2, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    public final void f(boolean z) {
        removeCallbacks(this.J);
        this.R = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.K.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ahj) it.next()).b(this, this.S, z);
        }
    }

    public final boolean g(long j) {
        long j2 = this.T;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.R ? this.S : this.U;
        long k = nik.k(j3 + j, 0L, j2);
        if (k == j3) {
            return false;
        }
        boolean z = this.R;
        CopyOnWriteArraySet copyOnWriteArraySet = this.K;
        if (!z) {
            this.S = k;
            this.R = true;
            setPressed(true);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            Iterator it = copyOnWriteArraySet.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((ahj) it.next()).a(this, k);
            }
        } else if (this.S != k) {
            this.S = k;
            Iterator it2 = copyOnWriteArraySet.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                ((ahj) it2.next()).c(this, k);
            }
        }
        c();
        return true;
    }

    @Override // defpackage.chj
    public long getPreferredUpdateDelay() {
        int width = this.b.width();
        e0.getClass();
        int i = (int) (width / this.M);
        if (i == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.T;
        if (j == 0 || j == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j / i;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (getScrubberDrawable() != null) {
            Drawable scrubberDrawable = getScrubberDrawable();
            scrubberDrawable.getClass();
            scrubberDrawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        Paint paint;
        Canvas canvas2;
        canvas.getClass();
        setEnabled((this.R || this.d0) ? this.v : this.u);
        if ((this.R || this.d0) ? this.v : this.u) {
            canvas.save();
            Rect rect = this.b;
            int height = rect.height();
            int centerY = rect.centerY() - (height / 2);
            int i = centerY + height;
            long j2 = this.T;
            long j3 = 0;
            Rect rect2 = this.d;
            if (j2 <= 0) {
                canvas2 = canvas;
                e(canvas2, rect.left, centerY, rect.right, i, uql.BOTH, getUnplayedPaint());
            } else {
                Rect rect3 = this.c;
                int i2 = rect3.left;
                int i3 = rect3.right;
                int i4 = rect.left;
                if (i4 < i3) {
                    i4 = i3;
                }
                int i5 = rect2.right;
                if (i4 < i5) {
                    i4 = i5;
                }
                int i6 = rect.right;
                if (i4 < i6) {
                    e(canvas, i4, centerY, i6, i, i4 == 0 ? uql.BOTH : uql.RIGHT, getUnplayedPaint());
                }
                int i7 = rect2.right;
                if (i2 < i7) {
                    i2 = i7;
                }
                if (i3 > i2) {
                    e(canvas, i2, centerY, i3, i, uql.NONE, this.h);
                }
                if (rect2.width() > 0) {
                    e(canvas, rect2.left, centerY, rect2.right, i, this.U == 100 ? uql.BOTH : uql.LEFT, getPlayedPaint());
                }
                if (this.W != 0) {
                    long[] jArr = this.b0;
                    jArr.getClass();
                    boolean[] zArr = this.c0;
                    zArr.getClass();
                    int i8 = this.x;
                    int i9 = i8 / 2;
                    int i10 = this.W;
                    int i11 = 0;
                    while (i11 < i10) {
                        int width = ((int) ((rect.width() * nik.k(jArr[i11], 0L, this.T)) / this.T)) - i9;
                        int i12 = rect.left;
                        int width2 = rect.width() - i8;
                        if (width <= 0) {
                            width = 0;
                        }
                        if (width2 > width) {
                            width2 = width;
                        }
                        int i13 = width2 + i12;
                        int i14 = i10;
                        float f = i13;
                        int i15 = i11;
                        float f2 = centerY;
                        float f3 = i13 + i8;
                        float f4 = i;
                        uql uqlVar = uql.NONE;
                        if (zArr[i15]) {
                            j = j3;
                            paint = this.m;
                        } else {
                            j = j3;
                            paint = this.l;
                        }
                        int i16 = i8;
                        e(canvas, f, f2, f3, f4, uqlVar, paint);
                        i11 = i15 + 1;
                        i8 = i16;
                        i10 = i14;
                        j3 = j;
                    }
                }
                canvas2 = canvas;
            }
            if (this.T > j3) {
                if ((this.R || this.d0) ? this.D : this.C) {
                    int j4 = nik.j(rect2.right, rect2.left, rect.right);
                    int centerY2 = rect2.centerY();
                    if (getScrubberDrawable() == null) {
                        canvas2.drawCircle(j4, centerY2, (int) ((((this.R || isFocused() || this.d0) ? this.A : this.y) * this.Q) / 2.0f), getScrubberPaint());
                    } else {
                        getScrubberDrawable().getClass();
                        int intrinsicWidth = (int) (r4.getIntrinsicWidth() * this.Q);
                        getScrubberDrawable().getClass();
                        int intrinsicHeight = (int) (r5.getIntrinsicHeight() * this.Q);
                        Drawable scrubberDrawable = getScrubberDrawable();
                        scrubberDrawable.getClass();
                        int i17 = intrinsicWidth / 2;
                        int i18 = intrinsicHeight / 2;
                        scrubberDrawable.setBounds(j4 - i17, centerY2 - i18, j4 + i17, centerY2 + i18);
                        Drawable scrubberDrawable2 = getScrubberDrawable();
                        scrubberDrawable2.getClass();
                        scrubberDrawable2.draw(canvas2);
                    }
                }
            }
            d(getLeft(), getTop(), getRight(), getBottom());
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.R || z) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getClass();
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.T <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                y2 y2Var = this.J;
                switch (i) {
                    case 21:
                        if (g(-positionIncrement)) {
                            removeCallbacks(y2Var);
                            postDelayed(y2Var, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (g(positionIncrement)) {
                            removeCallbacks(y2Var);
                            postDelayed(y2Var, 1000L);
                            return true;
                        }
                        break;
                }
            }
            if (this.R) {
                f(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.w;
        if (mode == 0 || (mode != 1073741824 && i3 <= size)) {
            size = i3;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        if (getScrubberDrawable() != null) {
            Drawable scrubberDrawable = getScrubberDrawable();
            scrubberDrawable.getClass();
            if (scrubberDrawable.isStateful()) {
                Drawable scrubberDrawable2 = getScrubberDrawable();
                scrubberDrawable2.getClass();
                if (scrubberDrawable2.setState(getDrawableState())) {
                    invalidate();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (getScrubberDrawable() != null) {
            Drawable scrubberDrawable = getScrubberDrawable();
            scrubberDrawable.getClass();
            e0.getClass();
            if (scrubberDrawable.setLayoutDirection(i)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r3 != 3) goto L48;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (isEnabled() && this.T > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.L;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            CopyOnWriteArraySet copyOnWriteArraySet = this.K;
            Rect rect = this.b;
            Rect rect2 = this.d;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.R) {
                            if (i2 < this.G) {
                                int i3 = this.P;
                                rect2.right = nik.j(wt3.f(i, i3, 3, i3), rect.left, rect.right);
                            } else {
                                this.P = i;
                                rect2.right = nik.j(i, rect.left, rect.right);
                            }
                            long scrubberPosition = getScrubberPosition();
                            if (this.S != scrubberPosition) {
                                this.S = scrubberPosition;
                                Iterator it = copyOnWriteArraySet.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    ((ahj) it.next()).c(this, scrubberPosition);
                                }
                            }
                            c();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.R) {
                    f(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                int i4 = i;
                if (this.a.contains(i4, i2)) {
                    rect2.right = nik.j(i4, rect.left, rect.right);
                    long scrubberPosition2 = getScrubberPosition();
                    this.S = scrubberPosition2;
                    this.R = true;
                    setPressed(true);
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        ((ahj) it2.next()).a(this, scrubberPosition2);
                    }
                    c();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.T <= 0) {
            return false;
        }
        if (i != 4096) {
            if (i != 8192) {
                return false;
            }
            if (g(-getPositionIncrement())) {
                f(false);
            }
        } else if (g(getPositionIncrement())) {
            f(false);
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final void setAdMarkerColor(int adMarkerColor) {
        this.l.setColor(adMarkerColor);
        invalidate();
    }

    public final void setBarPausedHeight(int size) {
        this.t = size;
        invalidate();
    }

    public final void setBarPlayingHeight(int size) {
        this.s = size;
        invalidate();
    }

    public final void setBufferedColor(int bufferedColor) {
        this.h.setColor(bufferedColor);
        invalidate();
    }

    @Override // defpackage.chj
    public void setBufferedPosition(long bufferedPosition) {
        if (this.V == bufferedPosition) {
            return;
        }
        this.V = bufferedPosition;
        c();
    }

    @Override // defpackage.chj
    public void setDuration(long duration) {
        if (this.T == duration) {
            return;
        }
        this.T = duration;
        if (this.R && duration == C.TIME_UNSET) {
            f(true);
        }
        c();
    }

    @Override // android.view.View, defpackage.chj
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!this.R || enabled) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int count) {
        z1a.s(count > 0);
        this.N = count;
        this.O = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long time) {
        z1a.s(time > 0);
        this.N = -1;
        this.O = time;
    }

    public final void setPausedScrubberIsVisible(boolean isVisible) {
        this.D = isVisible;
        invalidate();
    }

    public final void setPausedSeekbarIsVisible(boolean isVisible) {
        this.v = isVisible;
        invalidate();
    }

    public final void setPausedThumbImage(int thumbImage) {
        Resources resources = getResources();
        ThreadLocal threadLocal = z1g.a;
        this.r = resources.getDrawable(thumbImage, null);
    }

    public final void setPlayedAdMarkerColor(int playedAdMarkerColor) {
        this.m.setColor(playedAdMarkerColor);
        invalidate();
    }

    public final void setPlayedPaintPausedColor(int color) {
        this.f = color;
        invalidate();
    }

    public final void setPlayedPaintPlayingColor(int color) {
        this.e = color;
        invalidate();
    }

    public final void setPlayingScrubberIsVisible(boolean isVisible) {
        this.C = isVisible;
        invalidate();
    }

    public final void setPlayingSeekbarIsVisible(boolean isVisible) {
        this.u = isVisible;
        invalidate();
    }

    public final void setPlayingThumbImage(int thumbImage) {
        Resources resources = getResources();
        ThreadLocal threadLocal = z1g.a;
        this.q = resources.getDrawable(thumbImage, null);
    }

    @Override // defpackage.chj
    public void setPosition(long position) {
        if (this.U == position) {
            return;
        }
        this.U = position;
        c();
    }

    public final void setScrubberDisabledSize(int size) {
        this.z = size;
        invalidate();
    }

    public final void setScrubberPausedColor(int scrubberColor) {
        this.o = scrubberColor;
        invalidate();
    }

    public final void setScrubberPausedSize(int size) {
        this.A = size;
        invalidate();
    }

    public final void setScrubberPlayingColor(int scrubberColor) {
        this.n = scrubberColor;
        invalidate();
    }

    public final void setScrubberPlayingSize(int size) {
        this.y = size;
        invalidate();
    }

    public final void setSeekbarPausedCornerRadius(float cornerRadius) {
        this.F = cornerRadius;
        invalidate();
    }

    public final void setSeekbarPlayingCornerRadius(float cornerRadius) {
        this.E = cornerRadius;
        invalidate();
    }

    public final void setUnplayedPausedColor(int unplayedColor) {
        this.j = unplayedColor;
        invalidate();
    }

    public final void setUnplayedPlayingColor(int unplayedColor) {
        this.i = unplayedColor;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeDefaultTimeBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 0, 28, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeDefaultTimeBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0, 24, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeDefaultTimeBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0, 16, null);
        context.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BlazeDefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? r2 : attributeSet2, (i3 & 16) != 0 ? 0 : i2);
        AttributeSet attributeSet3 = (i3 & 2) != 0 ? null : attributeSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeDefaultTimeBar(@NotNull Context context) {
        this(context, null, 0, null, 0, 30, null);
        context.getClass();
    }
}
