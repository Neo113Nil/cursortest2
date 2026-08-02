package com.vk.ecomm.moderation.api.restrictions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModerationRestriction.kt */
/* loaded from: classes18.dex */
public final class ModerationRestriction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ModerationRestriction[] $VALUES;
    public static final ModerationRestriction BLUR;
    public static final ModerationRestriction BLUR_ONLY_FOR_ADULT;
    public static final ModerationRestriction HARDBLOCK;
    public static final ModerationRestriction NONE;

    static {
        ModerationRestriction moderationRestriction = new ModerationRestriction("NONE", 0);
        NONE = moderationRestriction;
        ModerationRestriction moderationRestriction2 = new ModerationRestriction("BLUR", 1);
        BLUR = moderationRestriction2;
        ModerationRestriction moderationRestriction3 = new ModerationRestriction("BLUR_ONLY_FOR_ADULT", 2);
        BLUR_ONLY_FOR_ADULT = moderationRestriction3;
        ModerationRestriction moderationRestriction4 = new ModerationRestriction("HARDBLOCK", 3);
        HARDBLOCK = moderationRestriction4;
        ModerationRestriction[] moderationRestrictionArr = {moderationRestriction, moderationRestriction2, moderationRestriction3, moderationRestriction4};
        $VALUES = moderationRestrictionArr;
        $ENTRIES = new asp(moderationRestrictionArr);
    }

    public ModerationRestriction() {
        throw null;
    }

    public static ModerationRestriction valueOf(String str) {
        return (ModerationRestriction) Enum.valueOf(ModerationRestriction.class, str);
    }

    public static ModerationRestriction[] values() {
        return (ModerationRestriction[]) $VALUES.clone();
    }

    public final boolean h() {
        return this == BLUR || this == BLUR_ONLY_FOR_ADULT;
    }
}
