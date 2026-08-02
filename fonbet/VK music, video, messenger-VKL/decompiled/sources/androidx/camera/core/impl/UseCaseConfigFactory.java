package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.InitializationException;
import xsna.kf9;

/* loaded from: classes11.dex */
public interface UseCaseConfigFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CaptureType {
        private static final /* synthetic */ CaptureType[] $VALUES;
        public static final CaptureType IMAGE_ANALYSIS;
        public static final CaptureType IMAGE_CAPTURE;
        public static final CaptureType PREVIEW;
        public static final CaptureType VIDEO_CAPTURE;

        static {
            CaptureType captureType = new CaptureType("IMAGE_CAPTURE", 0);
            IMAGE_CAPTURE = captureType;
            CaptureType captureType2 = new CaptureType("PREVIEW", 1);
            PREVIEW = captureType2;
            CaptureType captureType3 = new CaptureType("IMAGE_ANALYSIS", 2);
            IMAGE_ANALYSIS = captureType3;
            CaptureType captureType4 = new CaptureType("VIDEO_CAPTURE", 3);
            VIDEO_CAPTURE = captureType4;
            $VALUES = new CaptureType[]{captureType, captureType2, captureType3, captureType4};
        }

        public CaptureType() {
            throw null;
        }

        public static CaptureType valueOf(String str) {
            return (CaptureType) Enum.valueOf(CaptureType.class, str);
        }

        public static CaptureType[] values() {
            return (CaptureType[]) $VALUES.clone();
        }
    }

    public interface a {
        @NonNull
        kf9 a(@NonNull Context context) throws InitializationException;
    }

    @Nullable
    Config a(@NonNull CaptureType captureType);
}
