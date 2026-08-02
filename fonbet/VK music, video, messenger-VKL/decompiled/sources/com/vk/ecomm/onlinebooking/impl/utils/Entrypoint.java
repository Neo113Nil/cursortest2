package com.vk.ecomm.onlinebooking.impl.utils;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CustomCategoryUtils.kt */
/* loaded from: classes18.dex */
public final class Entrypoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Entrypoint[] $VALUES;
    public static final Entrypoint STORIES;
    private final String value = "stories";
    private final int titleRes = R.string.booking_services_category_in_stories;

    static {
        Entrypoint entrypoint = new Entrypoint();
        STORIES = entrypoint;
        Entrypoint[] entrypointArr = {entrypoint};
        $VALUES = entrypointArr;
        $ENTRIES = new asp(entrypointArr);
    }

    public static Entrypoint valueOf(String str) {
        return (Entrypoint) Enum.valueOf(Entrypoint.class, str);
    }

    public static Entrypoint[] values() {
        return (Entrypoint[]) $VALUES.clone();
    }

    public final int h() {
        return this.titleRes;
    }

    public final String i() {
        return this.value;
    }
}
