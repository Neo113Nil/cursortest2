package androidx.window.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationMode.kt */
/* loaded from: classes12.dex */
public final class VerificationMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerificationMode[] $VALUES;
    public static final VerificationMode LOG;
    public static final VerificationMode QUIET;
    public static final VerificationMode STRICT;

    static {
        VerificationMode verificationMode = new VerificationMode("STRICT", 0);
        STRICT = verificationMode;
        VerificationMode verificationMode2 = new VerificationMode("LOG", 1);
        LOG = verificationMode2;
        VerificationMode verificationMode3 = new VerificationMode("QUIET", 2);
        QUIET = verificationMode3;
        VerificationMode[] verificationModeArr = {verificationMode, verificationMode2, verificationMode3};
        $VALUES = verificationModeArr;
        $ENTRIES = new asp(verificationModeArr);
    }

    public VerificationMode() {
        throw null;
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) $VALUES.clone();
    }
}
