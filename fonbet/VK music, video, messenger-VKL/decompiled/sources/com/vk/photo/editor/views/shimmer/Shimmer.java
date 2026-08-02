package com.vk.photo.editor.views.shimmer;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.ilq;
import xsna.zrp;

/* compiled from: Shimmer.kt */
/* loaded from: classes4.dex */
public final class Shimmer {
    public int f;
    public ValueAnimator q;
    public final float[] a = new float[5];
    public final int[] b = new int[5];
    public final Direction c = Direction.LEFT_TO_RIGHT;
    public int d = -1;
    public int e = -7829368;
    public final float g = 1.0f;
    public final float h = 1.0f;
    public final boolean i = true;
    public boolean j = true;
    public boolean k = true;
    public final int l = -1;
    public final int m = 1;
    public final long n = 1200;
    public final long o = 1200;
    public final ilq p = new ilq();

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
    public static abstract class a<T extends a<T>> {
        public final Shimmer a = new Shimmer();

        public final Shimmer a() {
            Shimmer shimmer = this.a;
            int[] iArr = shimmer.b;
            int i = shimmer.e;
            iArr[0] = i;
            iArr[1] = i;
            iArr[2] = shimmer.d;
            iArr[3] = i;
            iArr[4] = i;
            float[] fArr = shimmer.a;
            fArr[0] = 0.0f;
            fArr[1] = 0.25f;
            fArr[2] = 0.5f;
            fArr[3] = 0.75f;
            fArr[4] = 1.0f;
            return shimmer;
        }

        public abstract b b();

        public final a c() {
            int min = ((int) (Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) * 255.0f)) << 24;
            Shimmer shimmer = this.a;
            shimmer.e = min | (shimmer.e & 16777215);
            return b();
        }

        public final a d() {
            int min = ((int) (Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.08f)) * 255.0f)) << 24;
            Shimmer shimmer = this.a;
            shimmer.d = min | (shimmer.d & 16777215);
            return b();
        }
    }

    /* compiled from: Shimmer.kt */
    public static final class b extends a<b> {
        public b() {
            this.a.k = false;
        }

        public final void e(int i) {
            Shimmer shimmer = this.a;
            shimmer.e = (i & 16777215) | (shimmer.e & (-16777216));
        }

        @Override // com.vk.photo.editor.views.shimmer.Shimmer.a
        public final b b() {
            return this;
        }
    }
}
