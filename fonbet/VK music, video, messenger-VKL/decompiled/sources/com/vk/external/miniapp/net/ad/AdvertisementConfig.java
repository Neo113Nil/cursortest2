package com.vk.external.miniapp.net.ad;

import com.ironsource.C4313f8;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ho8;
import xsna.jgp;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.v11;
import xsna.vu5;

/* compiled from: AdvertisementConfig.kt */
/* loaded from: classes18.dex */
public final class AdvertisementConfig {
    public static final AdvertisementConfig a = new AdvertisementConfig(EmptyList.b);

    @pmi0(C4313f8.p)
    private final List<ConfigItem> configs;

    /* compiled from: AdvertisementConfig.kt */
    public static final class ConfigItem {

        @pmi0("banner")
        private final SlotConfig banner;

        @pmi0("closing_ads")
        private final SlotConfig closingAds;

        @pmi0("id")
        private final int id;

        @pmi0("interstitial")
        private final SlotConfig interstitial;

        @pmi0("mobWeb")
        private final MobWebSlotConfig mobWeb;

        @pmi0("multi_interstitial")
        private final SlotConfig multiInterstitial;

        @pmi0("rewarded")
        private final SlotConfig rewarded;

        @pmi0("splash_ads")
        private final SlotConfig splashAds;

        static {
            SlotConfig slotConfig = SlotConfig.a;
            new ConfigItem(0, slotConfig, slotConfig, slotConfig, slotConfig, slotConfig, slotConfig, new MobWebSlotConfig(null));
        }

        public ConfigItem(int i, SlotConfig slotConfig, SlotConfig slotConfig2, SlotConfig slotConfig3, SlotConfig slotConfig4, SlotConfig slotConfig5, SlotConfig slotConfig6, MobWebSlotConfig mobWebSlotConfig) {
            this.id = i;
            this.rewarded = slotConfig;
            this.interstitial = slotConfig2;
            this.multiInterstitial = slotConfig3;
            this.banner = slotConfig4;
            this.splashAds = slotConfig5;
            this.closingAds = slotConfig6;
            this.mobWeb = mobWebSlotConfig;
        }

        public final SlotConfig a() {
            return this.banner;
        }

        public final SlotConfig b() {
            return this.closingAds;
        }

        public final int c() {
            return this.id;
        }

        public final SlotConfig d() {
            return this.interstitial;
        }

        public final SlotConfig e() {
            return this.multiInterstitial;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfigItem)) {
                return false;
            }
            ConfigItem configItem = (ConfigItem) obj;
            return this.id == configItem.id && epx.f(this.rewarded, configItem.rewarded) && epx.f(this.interstitial, configItem.interstitial) && epx.f(this.multiInterstitial, configItem.multiInterstitial) && epx.f(this.banner, configItem.banner) && epx.f(this.splashAds, configItem.splashAds) && epx.f(this.closingAds, configItem.closingAds) && epx.f(this.mobWeb, configItem.mobWeb);
        }

        public final SlotConfig f() {
            return this.rewarded;
        }

        public final SlotConfig g() {
            return this.splashAds;
        }

        public final int hashCode() {
            return this.mobWeb.hashCode() + ((this.closingAds.hashCode() + ((this.splashAds.hashCode() + ((this.banner.hashCode() + ((this.multiInterstitial.hashCode() + ((this.interstitial.hashCode() + ((this.rewarded.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ConfigItem(id=" + this.id + ", rewarded=" + this.rewarded + ", interstitial=" + this.interstitial + ", multiInterstitial=" + this.multiInterstitial + ", banner=" + this.banner + ", splashAds=" + this.splashAds + ", closingAds=" + this.closingAds + ", mobWeb=" + this.mobWeb + ')';
        }
    }

    /* compiled from: AdvertisementConfig.kt */
    public static final class MobWebSlotConfig {

        @pmi0("app_url")
        private final String appUrl;

        public MobWebSlotConfig(String str) {
            this.appUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MobWebSlotConfig) && epx.f(this.appUrl, ((MobWebSlotConfig) obj).appUrl);
        }

        public final int hashCode() {
            String str = this.appUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MobWebSlotConfig(appUrl="), this.appUrl, ')');
        }
    }

    /* compiled from: AdvertisementConfig.kt */
    public static final class SlotConfig {
        public static final SlotConfig a = new SlotConfig(EmptyList.b, jgp.b, 30000, 10000, 0, 0);

        @pmi0("auto_update_ms")
        private final int autoUpdateMs;

        @pmi0("limit_ms")
        private final int limitMs;

        @pmi0("preload_ttl")
        private final int preloadTtl;

        @pmi0("slot_ids")
        private final List<Integer> slotIds;

        @pmi0("timeout_ms")
        private final int timeoutMs;

        @pmi0("virtual_slots")
        private final Map<Integer, String> virtualSlots;

        public SlotConfig(List<Integer> list, Map<Integer, String> map, int i, int i2, int i3, int i4) {
            this.slotIds = list;
            this.virtualSlots = map;
            this.autoUpdateMs = i;
            this.limitMs = i2;
            this.timeoutMs = i3;
            this.preloadTtl = i4;
        }

        public final int a() {
            return this.autoUpdateMs;
        }

        public final int b() {
            return this.limitMs;
        }

        public final int c() {
            return this.preloadTtl;
        }

        public final List<Integer> d() {
            return this.slotIds;
        }

        public final int e() {
            return this.timeoutMs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotConfig)) {
                return false;
            }
            SlotConfig slotConfig = (SlotConfig) obj;
            return epx.f(this.slotIds, slotConfig.slotIds) && epx.f(this.virtualSlots, slotConfig.virtualSlots) && this.autoUpdateMs == slotConfig.autoUpdateMs && this.limitMs == slotConfig.limitMs && this.timeoutMs == slotConfig.timeoutMs && this.preloadTtl == slotConfig.preloadTtl;
        }

        public final Map<Integer, String> f() {
            return this.virtualSlots;
        }

        public final int hashCode() {
            return Integer.hashCode(this.preloadTtl) + shy.a(this.timeoutMs, shy.a(this.limitMs, shy.a(this.autoUpdateMs, v11.a(this.slotIds.hashCode() * 31, 31, this.virtualSlots), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SlotConfig(slotIds=");
            sb.append(this.slotIds);
            sb.append(", virtualSlots=");
            sb.append(this.virtualSlots);
            sb.append(", autoUpdateMs=");
            sb.append(this.autoUpdateMs);
            sb.append(", limitMs=");
            sb.append(this.limitMs);
            sb.append(", timeoutMs=");
            sb.append(this.timeoutMs);
            sb.append(", preloadTtl=");
            return vu5.b(sb, this.preloadTtl, ')');
        }
    }

    public AdvertisementConfig(List<ConfigItem> list) {
        this.configs = list;
    }

    public final List<ConfigItem> a() {
        return this.configs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdvertisementConfig) && epx.f(this.configs, ((AdvertisementConfig) obj).configs);
    }

    public final int hashCode() {
        return this.configs.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AdvertisementConfig(configs="), this.configs);
    }
}
