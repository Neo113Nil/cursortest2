package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import Jb.e;

/* loaded from: classes6.dex */
public final class AdvVideoBannerV2TrackerAnalyticsDelegate_Factory implements e<AdvVideoBannerV2TrackerAnalyticsDelegate> {

    private static final class InstanceHolder {
        private static final AdvVideoBannerV2TrackerAnalyticsDelegate_Factory INSTANCE = new AdvVideoBannerV2TrackerAnalyticsDelegate_Factory();
    }

    public static AdvVideoBannerV2TrackerAnalyticsDelegate_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AdvVideoBannerV2TrackerAnalyticsDelegate newInstance() {
        return new AdvVideoBannerV2TrackerAnalyticsDelegate();
    }

    @Override // Pc.a
    public AdvVideoBannerV2TrackerAnalyticsDelegate get() {
        return newInstance();
    }
}
