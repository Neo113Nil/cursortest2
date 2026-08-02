package com.vk.profile.questions.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuestionsAdapter.kt */
/* loaded from: classes5.dex */
public final class AnswerSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AnswerSource[] $VALUES;
    public static final AnswerSource MESSAGE_REPLY;
    public static final AnswerSource STORY_REPLY;

    static {
        AnswerSource answerSource = new AnswerSource("STORY_REPLY", 0);
        STORY_REPLY = answerSource;
        AnswerSource answerSource2 = new AnswerSource("MESSAGE_REPLY", 1);
        MESSAGE_REPLY = answerSource2;
        AnswerSource[] answerSourceArr = {answerSource, answerSource2};
        $VALUES = answerSourceArr;
        $ENTRIES = new asp(answerSourceArr);
    }

    public AnswerSource() {
        throw null;
    }

    public static AnswerSource valueOf(String str) {
        return (AnswerSource) Enum.valueOf(AnswerSource.class, str);
    }

    public static AnswerSource[] values() {
        return (AnswerSource[]) $VALUES.clone();
    }
}
