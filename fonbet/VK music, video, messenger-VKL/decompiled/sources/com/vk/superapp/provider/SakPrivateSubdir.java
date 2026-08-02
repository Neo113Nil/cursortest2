package com.vk.superapp.provider;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SakPrivateSubdir.kt */
/* loaded from: classes6.dex */
public final class SakPrivateSubdir {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SakPrivateSubdir[] $VALUES;
    public static final SakPrivateSubdir CLIPS_UPLOADS;
    public static final SakPrivateSubdir STORIES_UPLOADS;
    public static final SakPrivateSubdir TEMP_UPLOADS;
    private final String relativePath;

    static {
        SakPrivateSubdir sakPrivateSubdir = new SakPrivateSubdir("TEMP_UPLOADS", 0, "TempUploads");
        TEMP_UPLOADS = sakPrivateSubdir;
        SakPrivateSubdir sakPrivateSubdir2 = new SakPrivateSubdir("STORIES_UPLOADS", 1, "stories_temp");
        STORIES_UPLOADS = sakPrivateSubdir2;
        SakPrivateSubdir sakPrivateSubdir3 = new SakPrivateSubdir("CLIPS_UPLOADS", 2, "clips_temp");
        CLIPS_UPLOADS = sakPrivateSubdir3;
        SakPrivateSubdir[] sakPrivateSubdirArr = {sakPrivateSubdir, sakPrivateSubdir2, sakPrivateSubdir3};
        $VALUES = sakPrivateSubdirArr;
        $ENTRIES = new asp(sakPrivateSubdirArr);
    }

    public SakPrivateSubdir(String str, int i, String str2) {
        this.relativePath = str2;
    }

    public static SakPrivateSubdir valueOf(String str) {
        return (SakPrivateSubdir) Enum.valueOf(SakPrivateSubdir.class, str);
    }

    public static SakPrivateSubdir[] values() {
        return (SakPrivateSubdir[]) $VALUES.clone();
    }

    public final String h() {
        return this.relativePath;
    }
}
