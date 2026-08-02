package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class CameraCaptureFailure {
    public final Reason a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Reason {
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason ERROR;

        static {
            Reason reason = new Reason("ERROR", 0);
            ERROR = reason;
            $VALUES = new Reason[]{reason};
        }

        public Reason() {
            throw null;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public CameraCaptureFailure(@NonNull Reason reason) {
        this.a = reason;
    }
}
