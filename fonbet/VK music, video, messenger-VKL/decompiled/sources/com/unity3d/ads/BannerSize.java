package com.unity3d.ads;

import xsna.zcl;

/* compiled from: BannerSize.kt */
/* loaded from: classes14.dex */
public final class BannerSize {
    private final int height;
    private final int width;
    public static final Companion Companion = new Companion(null);
    private static final BannerSize leaderboard = new BannerSize(728, 90);
    private static final BannerSize iabStandard = new BannerSize(468, 60);
    private static final BannerSize standard = new BannerSize(320, 50);

    /* compiled from: BannerSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BannerSize getIabStandard() {
            return BannerSize.iabStandard;
        }

        public final BannerSize getLeaderboard() {
            return BannerSize.leaderboard;
        }

        public final BannerSize getStandard() {
            return BannerSize.standard;
        }

        private Companion() {
        }
    }

    public BannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
