package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4342h1;
import com.ironsource.C4430m0;
import com.ironsource.mediationsdk.j;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class LevelPlayAdSize {
    private static final int f = 320;
    private static final int g = 50;
    private static final int h = 320;
    private static final int i = 90;
    private static final int j = 300;
    private static final int k = 250;
    private static final int l = 728;
    private static final int m = 90;
    private int a;
    private int b;
    private final String c;
    private final boolean d;
    private final LevelPlayAdSize e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, "BANNER", false, null, 16, null);
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, j.g, false, null, 16, null);
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(728, 90, j.d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, "LARGE", false, null, 16, null);

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        public final LevelPlayAdSize createAdSize$mediationsdk_release(String str) {
            int hashCode = str.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && str.equals("BANNER")) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (str.equals(j.d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (str.equals("LARGE")) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (str.equals(j.g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        public final LevelPlayAdSize createCustomSize(int i, int i2) {
            return new LevelPlayAdSize(i, i2, "CUSTOM", false, null, 16, null);
        }

        private Companion() {
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            return new C4342h1(new C4430m0()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i2, int i3, String str, boolean z, LevelPlayAdSize levelPlayAdSize) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = z;
        this.e = levelPlayAdSize;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    public static final LevelPlayAdSize createCustomSize(int i2, int i3) {
        return Companion.createCustomSize(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LevelPlayAdSize.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.a == levelPlayAdSize.a && this.b == levelPlayAdSize.b && epx.f(this.c, levelPlayAdSize.c);
    }

    public final String getDescription() {
        return String.valueOf(this.c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.e;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public int hashCode() {
        int i2 = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.d;
    }

    public String toString() {
        return this.c + " " + this.a + "x" + this.b;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public /* synthetic */ LevelPlayAdSize(int i2, int i3, String str, boolean z, LevelPlayAdSize levelPlayAdSize, int i4, zcl zclVar) {
        this(i2, i3, (i4 & 4) != 0 ? null : str, z, (i4 & 16) != 0 ? null : levelPlayAdSize);
    }
}
