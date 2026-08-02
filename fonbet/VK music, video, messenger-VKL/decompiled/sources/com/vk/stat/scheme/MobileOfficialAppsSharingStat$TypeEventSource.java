package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$TypeEventSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsSharingStat$TypeEventSource[] $VALUES;

    @pmi0("action_menu")
    public static final MobileOfficialAppsSharingStat$TypeEventSource ACTION_MENU;

    @pmi0("button")
    public static final MobileOfficialAppsSharingStat$TypeEventSource BUTTON;

    static {
        MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource = new MobileOfficialAppsSharingStat$TypeEventSource("ACTION_MENU", 0);
        ACTION_MENU = mobileOfficialAppsSharingStat$TypeEventSource;
        MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource2 = new MobileOfficialAppsSharingStat$TypeEventSource("BUTTON", 1);
        BUTTON = mobileOfficialAppsSharingStat$TypeEventSource2;
        MobileOfficialAppsSharingStat$TypeEventSource[] mobileOfficialAppsSharingStat$TypeEventSourceArr = {mobileOfficialAppsSharingStat$TypeEventSource, mobileOfficialAppsSharingStat$TypeEventSource2};
        $VALUES = mobileOfficialAppsSharingStat$TypeEventSourceArr;
        $ENTRIES = new asp(mobileOfficialAppsSharingStat$TypeEventSourceArr);
    }

    private MobileOfficialAppsSharingStat$TypeEventSource(String str, int i) {
    }

    public static MobileOfficialAppsSharingStat$TypeEventSource valueOf(String str) {
        return (MobileOfficialAppsSharingStat$TypeEventSource) Enum.valueOf(MobileOfficialAppsSharingStat$TypeEventSource.class, str);
    }

    public static MobileOfficialAppsSharingStat$TypeEventSource[] values() {
        return (MobileOfficialAppsSharingStat$TypeEventSource[]) $VALUES.clone();
    }
}
