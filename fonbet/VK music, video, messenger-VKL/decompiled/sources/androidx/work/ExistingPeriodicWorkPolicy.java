package androidx.work;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ozl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExistingPeriodicWorkPolicy.kt */
/* loaded from: classes.dex */
public final class ExistingPeriodicWorkPolicy {
    private static final /* synthetic */ ExistingPeriodicWorkPolicy[] $VALUES;
    public static final ExistingPeriodicWorkPolicy CANCEL_AND_REENQUEUE;
    public static final ExistingPeriodicWorkPolicy KEEP;

    @ozl
    public static final ExistingPeriodicWorkPolicy REPLACE;
    public static final ExistingPeriodicWorkPolicy UPDATE;

    static {
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = new ExistingPeriodicWorkPolicy("REPLACE", 0);
        REPLACE = existingPeriodicWorkPolicy;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy2 = new ExistingPeriodicWorkPolicy("KEEP", 1);
        KEEP = existingPeriodicWorkPolicy2;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy3 = new ExistingPeriodicWorkPolicy(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 2);
        UPDATE = existingPeriodicWorkPolicy3;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy4 = new ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3);
        CANCEL_AND_REENQUEUE = existingPeriodicWorkPolicy4;
        $VALUES = new ExistingPeriodicWorkPolicy[]{existingPeriodicWorkPolicy, existingPeriodicWorkPolicy2, existingPeriodicWorkPolicy3, existingPeriodicWorkPolicy4};
    }

    public ExistingPeriodicWorkPolicy() {
        throw null;
    }

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) $VALUES.clone();
    }
}
