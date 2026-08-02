package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.j;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final int b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AdSize banner() {
            return new AdSize(320, 50, "BANNER", null);
        }

        public final AdSize large() {
            return new AdSize(320, 90, "LARGE", null);
        }

        public final AdSize leaderboard() {
            return new AdSize(728, 90, j.d, null);
        }

        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, j.g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i, int i2, String str, zcl zclVar) {
        this(i, i2, str);
    }

    public static final AdSize banner() {
        return Companion.banner();
    }

    public static final AdSize large() {
        return Companion.large();
    }

    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.b;
    }

    public final String getSizeDescription() {
        return this.c;
    }

    public final int getWidth() {
        return this.a;
    }

    private AdSize(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}
