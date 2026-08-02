package com.vk.core.view.shimmer;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.k0;
import xsna.asp;
import xsna.ilq;
import xsna.lhg;
import xsna.zrp;

/* compiled from: Shimmer.kt */
/* loaded from: classes17.dex */
public final class Shimmer {
    public final float[] a = new float[5];
    public final int[] b = new int[5];
    public final Direction c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public final float i;
    public final boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    public final int n;
    public long o;
    public long p;
    public Interpolator q;
    public ValueAnimator r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Shimmer.kt */
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

    /* compiled from: Shimmer.kt */
    public static abstract class b<T extends b<T>> {
        public final Shimmer a = new Shimmer();

        public final Shimmer a() {
            Shimmer shimmer = this.a;
            shimmer.a();
            float[] fArr = shimmer.a;
            fArr[0] = 0.0f;
            fArr[1] = 0.25f;
            fArr[2] = 0.5f;
            fArr[3] = 0.75f;
            fArr[4] = 1.0f;
            return shimmer;
        }

        public abstract T b();

        public final T c(boolean z) {
            this.a.k = z;
            return b();
        }

        public final b d() {
            int min = ((int) (Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) * 255.0f)) << 24;
            Shimmer shimmer = this.a;
            shimmer.e = min | (shimmer.e & 16777215);
            return b();
        }

        public final T e(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(k0.a(j, "Given a negative duration: ").toString());
            }
            this.a.o = j;
            return b();
        }

        public final T f(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(lhg.a(i, "Given invalid width: ").toString());
            }
            this.a.f = i;
            return b();
        }

        public final T g(float f) {
            int min = ((int) (Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f)) * 255.0f)) << 24;
            Shimmer shimmer = this.a;
            shimmer.d = min | (shimmer.d & 16777215);
            return b();
        }

        public final b h() {
            this.a.p = 1200L;
            return b();
        }

        public final b i() {
            this.a.getClass();
            return b();
        }

        public final b j() {
            this.a.h = 1.7f;
            return (c) this;
        }
    }

    public Shimmer() {
        new RectF();
        this.c = Direction.LEFT_TO_RIGHT;
        this.d = -1;
        this.e = -7829368;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = -1;
        this.n = 1;
        this.o = 1200L;
        this.p = 1200L;
        this.q = new ilq();
    }

    public final void a() {
        int i = this.e;
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = this.d;
        iArr[3] = i;
        iArr[4] = i;
    }

    /* compiled from: Shimmer.kt */
    public static final class a extends b<a> {
        public a() {
            this.a.l = true;
        }

        @Override // com.vk.core.view.shimmer.Shimmer.b
        public final a b() {
            return this;
        }
    }

    /* compiled from: Shimmer.kt */
    public static final class c extends b<c> {
        public c() {
            this.a.l = false;
        }

        public final void k(int i) {
            Shimmer shimmer = this.a;
            shimmer.e = (i & 16777215) | (shimmer.e & (-16777216));
        }

        @Override // com.vk.core.view.shimmer.Shimmer.b
        public final c b() {
            return this;
        }
    }
}
