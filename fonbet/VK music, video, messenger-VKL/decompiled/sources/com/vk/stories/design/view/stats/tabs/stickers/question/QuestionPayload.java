package com.vk.stories.design.view.stats.tabs.stickers.question;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickersQuestionDiffUtilCallback.kt */
/* loaded from: classes6.dex */
public final class QuestionPayload {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QuestionPayload[] $VALUES;
    public static final QuestionPayload AVATAR;
    public static final QuestionPayload BUTTON;
    public static final QuestionPayload DATE;
    public static final QuestionPayload FULL_NAME;
    public static final QuestionPayload OPTIONS;
    public static final QuestionPayload SELECTION;
    public static final QuestionPayload TEXT;

    static {
        QuestionPayload questionPayload = new QuestionPayload("FULL_NAME", 0);
        FULL_NAME = questionPayload;
        QuestionPayload questionPayload2 = new QuestionPayload("AVATAR", 1);
        AVATAR = questionPayload2;
        QuestionPayload questionPayload3 = new QuestionPayload("DATE", 2);
        DATE = questionPayload3;
        QuestionPayload questionPayload4 = new QuestionPayload("TEXT", 3);
        TEXT = questionPayload4;
        QuestionPayload questionPayload5 = new QuestionPayload("BUTTON", 4);
        BUTTON = questionPayload5;
        QuestionPayload questionPayload6 = new QuestionPayload("OPTIONS", 5);
        OPTIONS = questionPayload6;
        QuestionPayload questionPayload7 = new QuestionPayload("SELECTION", 6);
        SELECTION = questionPayload7;
        QuestionPayload[] questionPayloadArr = {questionPayload, questionPayload2, questionPayload3, questionPayload4, questionPayload5, questionPayload6, questionPayload7};
        $VALUES = questionPayloadArr;
        $ENTRIES = new asp(questionPayloadArr);
    }

    public QuestionPayload() {
        throw null;
    }

    public static QuestionPayload valueOf(String str) {
        return (QuestionPayload) Enum.valueOf(QuestionPayload.class, str);
    }

    public static QuestionPayload[] values() {
        return (QuestionPayload[]) $VALUES.clone();
    }
}
