package com.vk.newsfeed.posting.donut_teaser.domain.interactor;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextValidationInteractor.kt */
/* loaded from: classes4.dex */
public final class TextValidationState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextValidationState[] $VALUES;
    public static final TextValidationState ERROR;
    public static final TextValidationState LOADING;
    public static final TextValidationState SUCCESS;

    static {
        TextValidationState textValidationState = new TextValidationState("SUCCESS", 0);
        SUCCESS = textValidationState;
        TextValidationState textValidationState2 = new TextValidationState("ERROR", 1);
        ERROR = textValidationState2;
        TextValidationState textValidationState3 = new TextValidationState("LOADING", 2);
        LOADING = textValidationState3;
        TextValidationState[] textValidationStateArr = {textValidationState, textValidationState2, textValidationState3};
        $VALUES = textValidationStateArr;
        $ENTRIES = new asp(textValidationStateArr);
    }

    public TextValidationState() {
        throw null;
    }

    public static TextValidationState valueOf(String str) {
        return (TextValidationState) Enum.valueOf(TextValidationState.class, str);
    }

    public static TextValidationState[] values() {
        return (TextValidationState[]) $VALUES.clone();
    }
}
