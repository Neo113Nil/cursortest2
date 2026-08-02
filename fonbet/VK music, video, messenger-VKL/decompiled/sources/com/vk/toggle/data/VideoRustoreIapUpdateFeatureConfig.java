package com.vk.toggle.data;

import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.zrp;

/* compiled from: VideoRustoreIapUpdateFeatureConfig.kt */
/* loaded from: classes11.dex */
public final class VideoRustoreIapUpdateFeatureConfig {
    public static final a d = new a();
    public static final VideoRustoreIapUpdateFeatureConfig e = new VideoRustoreIapUpdateFeatureConfig(InAppType.FLEXIBLE, SilentUpdateType.SNACKBAR, null);
    public final InAppType a;
    public final SilentUpdateType b;
    public final Long c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRustoreIapUpdateFeatureConfig.kt */
    public static final class InAppType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InAppType[] $VALUES;
        public static final InAppType FLEXIBLE;
        public static final InAppType IMMEDIATE;
        public static final InAppType SILENT;

        static {
            InAppType inAppType = new InAppType("IMMEDIATE", 0);
            IMMEDIATE = inAppType;
            InAppType inAppType2 = new InAppType("SILENT", 1);
            SILENT = inAppType2;
            InAppType inAppType3 = new InAppType("FLEXIBLE", 2);
            FLEXIBLE = inAppType3;
            InAppType[] inAppTypeArr = {inAppType, inAppType2, inAppType3};
            $VALUES = inAppTypeArr;
            $ENTRIES = new asp(inAppTypeArr);
        }

        public InAppType() {
            throw null;
        }

        public static InAppType valueOf(String str) {
            return (InAppType) Enum.valueOf(InAppType.class, str);
        }

        public static InAppType[] values() {
            return (InAppType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRustoreIapUpdateFeatureConfig.kt */
    public static final class SilentUpdateType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SilentUpdateType[] $VALUES;
        public static final SilentUpdateType DIALOG;
        public static final SilentUpdateType NONE;
        public static final SilentUpdateType SNACKBAR;

        static {
            SilentUpdateType silentUpdateType = new SilentUpdateType("SNACKBAR", 0);
            SNACKBAR = silentUpdateType;
            SilentUpdateType silentUpdateType2 = new SilentUpdateType("DIALOG", 1);
            DIALOG = silentUpdateType2;
            SilentUpdateType silentUpdateType3 = new SilentUpdateType("NONE", 2);
            NONE = silentUpdateType3;
            SilentUpdateType[] silentUpdateTypeArr = {silentUpdateType, silentUpdateType2, silentUpdateType3};
            $VALUES = silentUpdateTypeArr;
            $ENTRIES = new asp(silentUpdateTypeArr);
        }

        public SilentUpdateType() {
            throw null;
        }

        public static SilentUpdateType valueOf(String str) {
            return (SilentUpdateType) Enum.valueOf(SilentUpdateType.class, str);
        }

        public static SilentUpdateType[] values() {
            return (SilentUpdateType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoRustoreIapUpdateFeatureConfig.kt */
    public static final class a {
    }

    public VideoRustoreIapUpdateFeatureConfig(InAppType inAppType, SilentUpdateType silentUpdateType, Long l) {
        this.a = inAppType;
        this.b = silentUpdateType;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRustoreIapUpdateFeatureConfig)) {
            return false;
        }
        VideoRustoreIapUpdateFeatureConfig videoRustoreIapUpdateFeatureConfig = (VideoRustoreIapUpdateFeatureConfig) obj;
        return this.a == videoRustoreIapUpdateFeatureConfig.a && this.b == videoRustoreIapUpdateFeatureConfig.b && epx.f(this.c, videoRustoreIapUpdateFeatureConfig.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRustoreIapUpdateFeatureConfig(inAppType=");
        sb.append(this.a);
        sb.append(", silentUpdateType=");
        sb.append(this.b);
        sb.append(", updateAvailableTimeAfterInstall=");
        return iq.b(sb, this.c, ')');
    }
}
