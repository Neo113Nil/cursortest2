package com.vk.toggle.data;

import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VideoAdFreeSubscriptionFeatureConfig.kt */
/* loaded from: classes11.dex */
public final class VideoAdFreeSubscriptionFeatureConfig {
    public static final a k = new a();
    public static final VideoAdFreeSubscriptionFeatureConfig l;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final Set<PopupStrategy> h;
    public final Set<ButtonStrategy> i;
    public final int j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAdFreeSubscriptionFeatureConfig.kt */
    /* loaded from: classes6.dex */
    public static final class ButtonStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonStrategy[] $VALUES;
        public static final ButtonStrategy DURING_AD;
        public static final ButtonStrategy MID_ROLL;
        public static final ButtonStrategy WITH_POPUP;

        static {
            ButtonStrategy buttonStrategy = new ButtonStrategy("MID_ROLL", 0);
            MID_ROLL = buttonStrategy;
            ButtonStrategy buttonStrategy2 = new ButtonStrategy("DURING_AD", 1);
            DURING_AD = buttonStrategy2;
            ButtonStrategy buttonStrategy3 = new ButtonStrategy("WITH_POPUP", 2);
            WITH_POPUP = buttonStrategy3;
            ButtonStrategy[] buttonStrategyArr = {buttonStrategy, buttonStrategy2, buttonStrategy3};
            $VALUES = buttonStrategyArr;
            $ENTRIES = new asp(buttonStrategyArr);
        }

        public ButtonStrategy() {
            throw null;
        }

        public static ButtonStrategy valueOf(String str) {
            return (ButtonStrategy) Enum.valueOf(ButtonStrategy.class, str);
        }

        public static ButtonStrategy[] values() {
            return (ButtonStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAdFreeSubscriptionFeatureConfig.kt */
    /* loaded from: classes6.dex */
    public static final class PopupStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PopupStrategy[] $VALUES;
        public static final PopupStrategy AD_END;
        public static final PopupStrategy AD_FIRST;
        public static final PopupStrategy AD_SKIP;
        public static final PopupStrategy AD_TIMER;
        public static final PopupStrategy APP_START;
        public static final PopupStrategy DISCOVERY_START;
        public static final PopupStrategy VIDEO_TAB_START;

        static {
            PopupStrategy popupStrategy = new PopupStrategy("APP_START", 0);
            APP_START = popupStrategy;
            PopupStrategy popupStrategy2 = new PopupStrategy("DISCOVERY_START", 1);
            DISCOVERY_START = popupStrategy2;
            PopupStrategy popupStrategy3 = new PopupStrategy("AD_SKIP", 2);
            AD_SKIP = popupStrategy3;
            PopupStrategy popupStrategy4 = new PopupStrategy("AD_END", 3);
            AD_END = popupStrategy4;
            PopupStrategy popupStrategy5 = new PopupStrategy("AD_FIRST", 4);
            AD_FIRST = popupStrategy5;
            PopupStrategy popupStrategy6 = new PopupStrategy("AD_TIMER", 5);
            AD_TIMER = popupStrategy6;
            PopupStrategy popupStrategy7 = new PopupStrategy("VIDEO_TAB_START", 6);
            VIDEO_TAB_START = popupStrategy7;
            PopupStrategy[] popupStrategyArr = {popupStrategy, popupStrategy2, popupStrategy3, popupStrategy4, popupStrategy5, popupStrategy6, popupStrategy7};
            $VALUES = popupStrategyArr;
            $ENTRIES = new asp(popupStrategyArr);
        }

        public PopupStrategy() {
            throw null;
        }

        public static PopupStrategy valueOf(String str) {
            return (PopupStrategy) Enum.valueOf(PopupStrategy.class, str);
        }

        public static PopupStrategy[] values() {
            return (PopupStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAdFreeSubscriptionFeatureConfig.kt */
    public static final class a {
    }

    static {
        EmptySet emptySet = EmptySet.b;
        l = new VideoAdFreeSubscriptionFeatureConfig(7, 7, "", "", "", "", false, emptySet, emptySet, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAdFreeSubscriptionFeatureConfig(int i, int i2, String str, String str2, String str3, String str4, boolean z, Set<? extends PopupStrategy> set, Set<? extends ButtonStrategy> set2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = set;
        this.i = set2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdFreeSubscriptionFeatureConfig)) {
            return false;
        }
        VideoAdFreeSubscriptionFeatureConfig videoAdFreeSubscriptionFeatureConfig = (VideoAdFreeSubscriptionFeatureConfig) obj;
        return this.a == videoAdFreeSubscriptionFeatureConfig.a && this.b == videoAdFreeSubscriptionFeatureConfig.b && epx.f(this.c, videoAdFreeSubscriptionFeatureConfig.c) && epx.f(this.d, videoAdFreeSubscriptionFeatureConfig.d) && epx.f(this.e, videoAdFreeSubscriptionFeatureConfig.e) && epx.f(this.f, videoAdFreeSubscriptionFeatureConfig.f) && this.g == videoAdFreeSubscriptionFeatureConfig.g && epx.f(this.h, videoAdFreeSubscriptionFeatureConfig.h) && epx.f(this.i, videoAdFreeSubscriptionFeatureConfig.i) && this.j == videoAdFreeSubscriptionFeatureConfig.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + fw3.b(fw3.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdFreeSubscriptionFeatureConfig(popupIntervalDays=");
        sb.append(this.a);
        sb.append(", greyButtonIntervalDays=");
        sb.append(this.b);
        sb.append(", popupProceedButtonText=");
        sb.append(this.c);
        sb.append(", popupTermsOfServiceButtonText=");
        sb.append(this.d);
        sb.append(", popupTitle=");
        sb.append(this.e);
        sb.append(", greyButtonText=");
        sb.append(this.f);
        sb.append(", settingsEntryEnabled=");
        sb.append(this.g);
        sb.append(", popupStrategies=");
        sb.append(this.h);
        sb.append(", buttonStrategies=");
        sb.append(this.i);
        sb.append(", queueTimeoutMins=");
        return vu5.b(sb, this.j, ')');
    }
}
