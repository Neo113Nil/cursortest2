package com.vk.auth.main;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LibverifyControllerProvider.kt */
/* loaded from: classes15.dex */
public final class LibverifyVerificationSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LibverifyVerificationSource[] $VALUES;
    public static final LibverifyVerificationSource ALREADY_VERIFIED;

    static {
        LibverifyVerificationSource libverifyVerificationSource = new LibverifyVerificationSource("ALREADY_VERIFIED", 0);
        ALREADY_VERIFIED = libverifyVerificationSource;
        LibverifyVerificationSource[] libverifyVerificationSourceArr = {libverifyVerificationSource};
        $VALUES = libverifyVerificationSourceArr;
        $ENTRIES = new asp(libverifyVerificationSourceArr);
    }

    public LibverifyVerificationSource() {
        throw null;
    }

    public static LibverifyVerificationSource valueOf(String str) {
        return (LibverifyVerificationSource) Enum.valueOf(LibverifyVerificationSource.class, str);
    }

    public static LibverifyVerificationSource[] values() {
        return (LibverifyVerificationSource[]) $VALUES.clone();
    }
}
