package com.vk.music.player;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResumeReason.kt */
@ozl
/* loaded from: classes3.dex */
public final class ResumeReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ResumeReason[] $VALUES;
    public static final ResumeReason AUTO;
    public static final ResumeReason USER_CLICKED;

    static {
        ResumeReason resumeReason = new ResumeReason("USER_CLICKED", 0);
        USER_CLICKED = resumeReason;
        ResumeReason resumeReason2 = new ResumeReason("AUTO", 1);
        AUTO = resumeReason2;
        ResumeReason[] resumeReasonArr = {resumeReason, resumeReason2};
        $VALUES = resumeReasonArr;
        $ENTRIES = new asp(resumeReasonArr);
    }

    public ResumeReason() {
        throw null;
    }

    public static ResumeReason valueOf(String str) {
        return (ResumeReason) Enum.valueOf(ResumeReason.class, str);
    }

    public static ResumeReason[] values() {
        return (ResumeReason[]) $VALUES.clone();
    }
}
