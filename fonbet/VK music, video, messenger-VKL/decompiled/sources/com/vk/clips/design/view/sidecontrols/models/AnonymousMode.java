package com.vk.clips.design.view.sidecontrols.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnonymousMode.kt */
/* loaded from: classes16.dex */
public final class AnonymousMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AnonymousMode[] $VALUES;
    public static final AnonymousMode INTERACTION_ALLOWED;
    public static final AnonymousMode INTERACTION_DISALLOWED;
    private final boolean isInteractionAllowedForAnon;

    static {
        AnonymousMode anonymousMode = new AnonymousMode("INTERACTION_ALLOWED", 0, true);
        INTERACTION_ALLOWED = anonymousMode;
        AnonymousMode anonymousMode2 = new AnonymousMode("INTERACTION_DISALLOWED", 1, false);
        INTERACTION_DISALLOWED = anonymousMode2;
        AnonymousMode[] anonymousModeArr = {anonymousMode, anonymousMode2};
        $VALUES = anonymousModeArr;
        $ENTRIES = new asp(anonymousModeArr);
    }

    public AnonymousMode(String str, int i, boolean z) {
        this.isInteractionAllowedForAnon = z;
    }

    public static AnonymousMode valueOf(String str) {
        return (AnonymousMode) Enum.valueOf(AnonymousMode.class, str);
    }

    public static AnonymousMode[] values() {
        return (AnonymousMode[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.isInteractionAllowedForAnon;
    }
}
