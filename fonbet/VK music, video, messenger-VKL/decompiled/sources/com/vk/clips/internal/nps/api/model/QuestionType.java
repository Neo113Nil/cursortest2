package com.vk.clips.internal.nps.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuestionType.kt */
/* loaded from: classes16.dex */
public final class QuestionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QuestionType[] $VALUES;
    public static final QuestionType MORE_LESS;
    public static final QuestionType MULTISELECT;
    public static final QuestionType SELECT;
    public static final QuestionType SELECT_INLINE;
    public static final QuestionType STARS;
    public static final QuestionType TEXT;

    static {
        QuestionType questionType = new QuestionType("SELECT", 0);
        SELECT = questionType;
        QuestionType questionType2 = new QuestionType("MULTISELECT", 1);
        MULTISELECT = questionType2;
        QuestionType questionType3 = new QuestionType("TEXT", 2);
        TEXT = questionType3;
        QuestionType questionType4 = new QuestionType("STARS", 3);
        STARS = questionType4;
        QuestionType questionType5 = new QuestionType("MORE_LESS", 4);
        MORE_LESS = questionType5;
        QuestionType questionType6 = new QuestionType("SELECT_INLINE", 5);
        SELECT_INLINE = questionType6;
        QuestionType[] questionTypeArr = {questionType, questionType2, questionType3, questionType4, questionType5, questionType6};
        $VALUES = questionTypeArr;
        $ENTRIES = new asp(questionTypeArr);
    }

    public QuestionType() {
        throw null;
    }

    public static QuestionType valueOf(String str) {
        return (QuestionType) Enum.valueOf(QuestionType.class, str);
    }

    public static QuestionType[] values() {
        return (QuestionType[]) $VALUES.clone();
    }
}
