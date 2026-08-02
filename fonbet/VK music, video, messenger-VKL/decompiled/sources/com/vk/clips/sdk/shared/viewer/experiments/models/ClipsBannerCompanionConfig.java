package com.vk.clips.sdk.shared.viewer.experiments.models;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.zrp;

/* compiled from: ClipsBannerCompanionConfig.kt */
/* loaded from: classes17.dex */
public final class ClipsBannerCompanionConfig {
    public static final ClipsBannerCompanionConfig d = new ClipsBannerCompanionConfig(0);
    public final boolean a;
    public final int b;
    public final BannerType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsBannerCompanionConfig.kt */
    public static final class BannerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerType[] $VALUES;
        public static final BannerType CTA;
        public static final BannerType NO_CTA;
        private final String type;

        static {
            BannerType bannerType = new BannerType(NativeAdContent.ViewTag.CTA, 0, X3.i.G0);
            CTA = bannerType;
            BannerType bannerType2 = new BannerType("NO_CTA", 1, "no_cta");
            NO_CTA = bannerType2;
            BannerType[] bannerTypeArr = {bannerType, bannerType2};
            $VALUES = bannerTypeArr;
            $ENTRIES = new asp(bannerTypeArr);
        }

        public BannerType(String str, int i, String str2) {
            this.type = str2;
        }

        public static BannerType valueOf(String str) {
            return (BannerType) Enum.valueOf(BannerType.class, str);
        }

        public static BannerType[] values() {
            return (BannerType[]) $VALUES.clone();
        }

        public final String h() {
            return this.type;
        }
    }

    /* compiled from: ClipsBannerCompanionConfig.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        
            if (xsna.epx.f(r5, r3.h()) != false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ClipsBannerCompanionConfig a(JSONObject jSONObject, boolean z) {
            int optInt = jSONObject != null ? jSONObject.optInt("slot_id") : 1800185;
            BannerType bannerType = null;
            String optString = jSONObject != null ? jSONObject.optString("banner_type") : null;
            BannerType bannerType2 = BannerType.CTA;
            if (!epx.f(optString, bannerType2.h())) {
                bannerType2 = BannerType.NO_CTA;
            }
            bannerType = bannerType2;
            return new ClipsBannerCompanionConfig(z, optInt, bannerType);
        }
    }

    public ClipsBannerCompanionConfig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsBannerCompanionConfig)) {
            return false;
        }
        ClipsBannerCompanionConfig clipsBannerCompanionConfig = (ClipsBannerCompanionConfig) obj;
        return this.a == clipsBannerCompanionConfig.a && this.b == clipsBannerCompanionConfig.b && this.c == clipsBannerCompanionConfig.c;
    }

    public final int hashCode() {
        int a2 = shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        BannerType bannerType = this.c;
        return a2 + (bannerType == null ? 0 : bannerType.hashCode());
    }

    public final String toString() {
        return "ClipsBannerCompanionConfig(isOn=" + this.a + ", slotId=" + this.b + ", bannerType=" + this.c + ')';
    }

    public ClipsBannerCompanionConfig(boolean z, int i, BannerType bannerType) {
        this.a = z;
        this.b = i;
        this.c = bannerType;
    }

    public /* synthetic */ ClipsBannerCompanionConfig(int i) {
        this(false, 1800185, BannerType.NO_CTA);
    }
}
