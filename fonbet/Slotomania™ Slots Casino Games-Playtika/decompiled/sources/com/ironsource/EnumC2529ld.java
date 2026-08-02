package com.ironsource;

import com.braze.Constants;

/* renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC2529ld {
    PER_DAY(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE),
    PER_HOUR("h");

    public String a;

    EnumC2529ld(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
