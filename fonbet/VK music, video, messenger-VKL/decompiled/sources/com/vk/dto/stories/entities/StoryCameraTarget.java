package com.vk.dto.stories.entities;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryCameraTarget.kt */
/* loaded from: classes18.dex */
public final class StoryCameraTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryCameraTarget[] $VALUES;
    public static final StoryCameraTarget CLIP_FRAGMENT;
    public static final StoryCameraTarget GROUP;
    public static final StoryCameraTarget IM;
    public static final StoryCameraTarget ME;
    public static final StoryCameraTarget PROFILE;
    public static final StoryCameraTarget UNDEFINED;
    public static final StoryCameraTarget VMOJI_UPLOAD;

    static {
        StoryCameraTarget storyCameraTarget = new StoryCameraTarget("UNDEFINED", 0);
        UNDEFINED = storyCameraTarget;
        StoryCameraTarget storyCameraTarget2 = new StoryCameraTarget("IM", 1);
        IM = storyCameraTarget2;
        StoryCameraTarget storyCameraTarget3 = new StoryCameraTarget("ME", 2);
        ME = storyCameraTarget3;
        StoryCameraTarget storyCameraTarget4 = new StoryCameraTarget("PROFILE", 3);
        PROFILE = storyCameraTarget4;
        StoryCameraTarget storyCameraTarget5 = new StoryCameraTarget("GROUP", 4);
        GROUP = storyCameraTarget5;
        StoryCameraTarget storyCameraTarget6 = new StoryCameraTarget("VMOJI_UPLOAD", 5);
        VMOJI_UPLOAD = storyCameraTarget6;
        StoryCameraTarget storyCameraTarget7 = new StoryCameraTarget("CLIP_FRAGMENT", 6);
        CLIP_FRAGMENT = storyCameraTarget7;
        StoryCameraTarget[] storyCameraTargetArr = {storyCameraTarget, storyCameraTarget2, storyCameraTarget3, storyCameraTarget4, storyCameraTarget5, storyCameraTarget6, storyCameraTarget7};
        $VALUES = storyCameraTargetArr;
        $ENTRIES = new asp(storyCameraTargetArr);
    }

    public StoryCameraTarget() {
        throw null;
    }

    public static StoryCameraTarget valueOf(String str) {
        return (StoryCameraTarget) Enum.valueOf(StoryCameraTarget.class, str);
    }

    public static StoryCameraTarget[] values() {
        return (StoryCameraTarget[]) $VALUES.clone();
    }

    public final boolean h() {
        return this == IM || this == ME;
    }
}
