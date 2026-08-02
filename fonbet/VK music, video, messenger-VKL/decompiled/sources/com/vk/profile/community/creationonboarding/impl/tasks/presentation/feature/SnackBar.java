package com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreationOnboardingTasksState.kt */
/* loaded from: classes5.dex */
public final class SnackBar {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnackBar[] $VALUES;
    public static final SnackBar COPY;
    public static final SnackBar POST_CREATED;
    public static final SnackBar STORY_CREATED;

    static {
        SnackBar snackBar = new SnackBar("COPY", 0);
        COPY = snackBar;
        SnackBar snackBar2 = new SnackBar("STORY_CREATED", 1);
        STORY_CREATED = snackBar2;
        SnackBar snackBar3 = new SnackBar("POST_CREATED", 2);
        POST_CREATED = snackBar3;
        SnackBar[] snackBarArr = {snackBar, snackBar2, snackBar3};
        $VALUES = snackBarArr;
        $ENTRIES = new asp(snackBarArr);
    }

    public SnackBar() {
        throw null;
    }

    public static SnackBar valueOf(String str) {
        return (SnackBar) Enum.valueOf(SnackBar.class, str);
    }

    public static SnackBar[] values() {
        return (SnackBar[]) $VALUES.clone();
    }
}
