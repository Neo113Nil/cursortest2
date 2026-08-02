package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;

/* loaded from: classes11.dex */
public abstract class SurfaceConfig {

    public enum ConfigSize {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);

        final int mId;

        ConfigSize(int i) {
            this.mId = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConfigType {
        private static final /* synthetic */ ConfigType[] $VALUES;
        public static final ConfigType JPEG;
        public static final ConfigType PRIV;
        public static final ConfigType RAW;
        public static final ConfigType YUV;

        static {
            ConfigType configType = new ConfigType(PrivFrame.ID, 0);
            PRIV = configType;
            ConfigType configType2 = new ConfigType("YUV", 1);
            YUV = configType2;
            ConfigType configType3 = new ConfigType("JPEG", 2);
            JPEG = configType3;
            ConfigType configType4 = new ConfigType("RAW", 3);
            RAW = configType4;
            $VALUES = new ConfigType[]{configType, configType2, configType3, configType4};
        }

        public ConfigType() {
            throw null;
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) $VALUES.clone();
        }
    }

    @NonNull
    public abstract ConfigSize a();

    @NonNull
    public abstract ConfigType b();
}
