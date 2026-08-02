package com.unity3d.ads;

import java.util.Map;
import xsna.jgp;
import xsna.zcl;

/* compiled from: BannerConfiguration.kt */
/* loaded from: classes14.dex */
public final class BannerConfiguration {
    private final String adMarkup;
    private final BannerSize bannerSize;
    private final Map<String, String> extras;
    private final BannerShowListener listener;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    /* compiled from: BannerConfiguration.kt */
    public static final class Builder {
        private String adMarkup;
        private final BannerSize bannerSize;
        private Map<String, String> extras = jgp.b;
        private final BannerShowListener listener;
        private String mediationAdUnitId;
        private MediationInfo mediationInfo;
        private final String placementId;

        public Builder(String str, BannerSize bannerSize, BannerShowListener bannerShowListener) {
            this.placementId = str;
            this.bannerSize = bannerSize;
            this.listener = bannerShowListener;
        }

        public final BannerConfiguration build() {
            return new BannerConfiguration(this.placementId, this.bannerSize, this.listener, this.extras, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, null);
        }

        public final Builder withAdMarkup(String str) {
            this.adMarkup = str;
            return this;
        }

        public final Builder withExtras(Map<String, String> map) {
            this.extras = map;
            return this;
        }

        public final Builder withMediationAdUnitId(String str) {
            this.mediationAdUnitId = str;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public /* synthetic */ BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map map, String str2, MediationInfo mediationInfo, String str3, zcl zclVar) {
        this(str, bannerSize, bannerShowListener, map, str2, mediationInfo, str3);
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final BannerSize getBannerSize() {
        return this.bannerSize;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final BannerShowListener getListener() {
        return this.listener;
    }

    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    private BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map<String, String> map, String str2, MediationInfo mediationInfo, String str3) {
        this.placementId = str;
        this.bannerSize = bannerSize;
        this.listener = bannerShowListener;
        this.extras = map;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BannerConfiguration(java.lang.String r9, com.unity3d.ads.BannerSize r10, com.unity3d.ads.BannerShowListener r11, java.util.Map r12, java.lang.String r13, com.unity3d.ads.MediationInfo r14, java.lang.String r15, int r16, xsna.zcl r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            xsna.jgp r12 = xsna.jgp.b
        L6:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r12 = r16 & 32
            if (r12 == 0) goto L15
            r6 = r0
            goto L16
        L15:
            r6 = r14
        L16:
            r12 = r16 & 64
            if (r12 == 0) goto L20
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r0 = r8
            goto L25
        L20:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L25:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.BannerConfiguration.<init>(java.lang.String, com.unity3d.ads.BannerSize, com.unity3d.ads.BannerShowListener, java.util.Map, java.lang.String, com.unity3d.ads.MediationInfo, java.lang.String, int, xsna.zcl):void");
    }
}
