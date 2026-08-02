package com.vk.debug.design;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DebugMockApiResponsesScreen.kt */
/* loaded from: classes17.dex */
public final class MockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MockType[] $VALUES;
    public static final MockType FILE;
    public static final MockType TEXT;

    static {
        MockType mockType = new MockType("TEXT", 0);
        TEXT = mockType;
        MockType mockType2 = new MockType("FILE", 1);
        FILE = mockType2;
        MockType[] mockTypeArr = {mockType, mockType2};
        $VALUES = mockTypeArr;
        $ENTRIES = new asp(mockTypeArr);
    }

    public MockType() {
        throw null;
    }

    public static MockType valueOf(String str) {
        return (MockType) Enum.valueOf(MockType.class, str);
    }

    public static MockType[] values() {
        return (MockType[]) $VALUES.clone();
    }
}
