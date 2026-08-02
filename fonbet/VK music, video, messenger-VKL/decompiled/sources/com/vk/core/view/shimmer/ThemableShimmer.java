package com.vk.core.view.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.hbh0;
import xsna.ilq;
import xsna.krv0;
import xsna.lhg;
import xsna.too0;
import xsna.zrp;

/* compiled from: ThemableShimmer.kt */
/* loaded from: classes17.dex */
public final class ThemableShimmer implements too0 {
    public final float[] b = new float[5];
    public final int[] c = new int[5];
    public final Direction d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public float j;
    public int k;
    public int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public long q;
    public long r;
    public final ilq s;
    public Context t;
    public ValueAnimator u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThemableShimmer.kt */
    public static final class Direction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction BOTTOM_TO_TOP;
        public static final Direction LEFT_TO_RIGHT;
        public static final Direction RIGHT_TO_LEFT;
        public static final Direction TOP_TO_BOTTOM;

        static {
            Direction direction = new Direction("LEFT_TO_RIGHT", 0);
            LEFT_TO_RIGHT = direction;
            Direction direction2 = new Direction("TOP_TO_BOTTOM", 1);
            TOP_TO_BOTTOM = direction2;
            Direction direction3 = new Direction("RIGHT_TO_LEFT", 2);
            RIGHT_TO_LEFT = direction3;
            Direction direction4 = new Direction("BOTTOM_TO_TOP", 3);
            BOTTOM_TO_TOP = direction4;
            Direction[] directionArr = {direction, direction2, direction3, direction4};
            $VALUES = directionArr;
            $ENTRIES = new asp(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* compiled from: ThemableShimmer.kt */
    public static final class a {
        public final ThemableShimmer a;

        public a(Context context) {
            ThemableShimmer themableShimmer = new ThemableShimmer();
            this.a = themableShimmer;
            c(hbh0.b(360, context));
            themableShimmer.i = R.attr.vk_ui_skeleton_from;
            themableShimmer.j = Float.POSITIVE_INFINITY;
            d(this);
            themableShimmer.t = context;
        }

        public static void d(a aVar) {
            ThemableShimmer themableShimmer = aVar.a;
            themableShimmer.f = R.attr.vk_ui_skeleton_to;
            themableShimmer.g = Float.POSITIVE_INFINITY;
        }

        public final ThemableShimmer a() {
            ThemableShimmer themableShimmer = this.a;
            themableShimmer.d();
            float[] fArr = themableShimmer.b;
            fArr[0] = 0.0f;
            fArr[1] = 0.25f;
            fArr[2] = 0.5f;
            fArr[3] = 0.75f;
            fArr[4] = 1.0f;
            return themableShimmer;
        }

        public final void b() {
            this.a.q = 1200L;
        }

        public final void c(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(lhg.a(i, "Given invalid width: ").toString());
            }
            this.a.k = i;
        }

        public final void e() {
            this.a.r = 1200L;
        }
    }

    public ThemableShimmer() {
        new RectF();
        this.d = Direction.LEFT_TO_RIGHT;
        this.e = -1;
        this.g = Float.POSITIVE_INFINITY;
        this.h = -16711936;
        this.j = Float.POSITIVE_INFINITY;
        this.m = 1.0f;
        this.n = 1.0f;
        this.o = -1;
        this.p = 1;
        this.q = 1200L;
        this.r = 1200L;
        this.s = new ilq();
    }

    @Override // xsna.too0
    public final void Ng() {
        d();
    }

    public final ValueAnimator a() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (this.r / this.q) + 1.0f);
        ofFloat.setRepeatMode(this.p);
        ofFloat.setRepeatCount(this.o);
        ofFloat.setDuration(this.q);
        ofFloat.setInterpolator(this.s);
        this.u = ofFloat;
        return ofFloat;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.start();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void d() {
        Context context = this.t;
        int i = this.i;
        int m = i != 0 ? context != null ? krv0.m(i, context) : krv0.l(i) : this.h;
        float f = this.j;
        if (!(f == Float.POSITIVE_INFINITY)) {
            Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        }
        int m2 = this.i != 0 ? context != null ? krv0.m(this.f, context) : krv0.l(this.f) : this.e;
        float f2 = this.g;
        if (!(f2 == Float.POSITIVE_INFINITY)) {
            Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2));
        }
        int[] iArr = this.c;
        iArr[0] = m;
        iArr[1] = m;
        iArr[2] = m2;
        iArr[3] = m;
        iArr[4] = m;
    }
}
