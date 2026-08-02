package com.vk.api.internal.debug;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FakeApiErrorTypes.kt */
/* loaded from: classes15.dex */
public final class FakeApiErrorTypes {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FakeApiErrorTypes[] $VALUES;
    public static final FakeApiErrorTypes API_ERROR_BACKOFF_API_CODE_29;
    public static final FakeApiErrorTypes API_ERROR_BACKOFF_API_CODE_6;

    static {
        FakeApiErrorTypes fakeApiErrorTypes = new FakeApiErrorTypes("API_ERROR_BACKOFF_API_CODE_6", 0);
        API_ERROR_BACKOFF_API_CODE_6 = fakeApiErrorTypes;
        FakeApiErrorTypes fakeApiErrorTypes2 = new FakeApiErrorTypes("API_ERROR_BACKOFF_API_CODE_29", 1);
        API_ERROR_BACKOFF_API_CODE_29 = fakeApiErrorTypes2;
        FakeApiErrorTypes[] fakeApiErrorTypesArr = {fakeApiErrorTypes, fakeApiErrorTypes2};
        $VALUES = fakeApiErrorTypesArr;
        $ENTRIES = new asp(fakeApiErrorTypesArr);
    }

    public FakeApiErrorTypes() {
        throw null;
    }

    public static FakeApiErrorTypes valueOf(String str) {
        return (FakeApiErrorTypes) Enum.valueOf(FakeApiErrorTypes.class, str);
    }

    public static FakeApiErrorTypes[] values() {
        return (FakeApiErrorTypes[]) $VALUES.clone();
    }
}
