package com.vk.superapp.api.dto.auth;

import xsna.asp;
import xsna.cqm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LibverifyValidationType.kt */
/* loaded from: classes6.dex */
public final class LibverifyValidationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LibverifyValidationType[] $VALUES;
    public static final a Companion;
    public static final LibverifyValidationType VALIDATION_TYPE_CALLIN;
    public static final LibverifyValidationType VALIDATION_TYPE_CALLRESET;
    public static final LibverifyValidationType VALIDATION_TYPE_MESSENGER;
    private final String value;

    /* compiled from: LibverifyValidationType.kt */
    public static final class a {
        public static LibverifyValidationType a(String str) {
            for (LibverifyValidationType libverifyValidationType : LibverifyValidationType.values()) {
                if (cqm0.m(libverifyValidationType.h()).equals(cqm0.m(str))) {
                    return libverifyValidationType;
                }
            }
            return null;
        }
    }

    static {
        LibverifyValidationType libverifyValidationType = new LibverifyValidationType("VALIDATION_TYPE_CALLIN", 0, "CALLIN");
        VALIDATION_TYPE_CALLIN = libverifyValidationType;
        LibverifyValidationType libverifyValidationType2 = new LibverifyValidationType("VALIDATION_TYPE_CALLRESET", 1, "CALL_RESET");
        VALIDATION_TYPE_CALLRESET = libverifyValidationType2;
        LibverifyValidationType libverifyValidationType3 = new LibverifyValidationType("VALIDATION_TYPE_MESSENGER", 2, "MESSENGER");
        VALIDATION_TYPE_MESSENGER = libverifyValidationType3;
        LibverifyValidationType[] libverifyValidationTypeArr = {libverifyValidationType, libverifyValidationType2, libverifyValidationType3};
        $VALUES = libverifyValidationTypeArr;
        $ENTRIES = new asp(libverifyValidationTypeArr);
        Companion = new a();
    }

    public LibverifyValidationType(String str, int i, String str2) {
        this.value = str2;
    }

    public static LibverifyValidationType valueOf(String str) {
        return (LibverifyValidationType) Enum.valueOf(LibverifyValidationType.class, str);
    }

    public static LibverifyValidationType[] values() {
        return (LibverifyValidationType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
