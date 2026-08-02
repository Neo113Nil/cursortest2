package com.vk.stickers.api.styles;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickerColorToken.kt */
/* loaded from: classes5.dex */
public final class StickerColorToken {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickerColorToken[] $VALUES;
    public static final StickerColorToken BACKGROUND;
    public static final StickerColorToken CONTENT;
    public static final StickerColorToken POLL_BACKGROUND;
    public static final StickerColorToken POLL_MULTIVOTE_BUTTON_BACKGROUND_FILL;
    public static final StickerColorToken POLL_MULTIVOTE_BUTTON_BACKGROUND_PRESSED;
    public static final StickerColorToken POLL_MULTIVOTE_BUTTON_TEXT;
    public static final StickerColorToken POLL_MULTIVOTE_OPTION_CHECKBOX;
    public static final StickerColorToken POLL_OPTION_BACKGROUND;
    public static final StickerColorToken POLL_OPTION_RESULT_BACKGROUND;
    public static final StickerColorToken POLL_OPTION_RESULT_TEXT;
    public static final StickerColorToken POLL_OPTION_TEXT;
    public static final StickerColorToken POLL_PREVIEW_BACKGROUND;
    public static final StickerColorToken POLL_PREVIEW_CONTENT;
    public static final StickerColorToken POLL_SUBTITLE;
    public static final StickerColorToken POLL_TITLE;
    public static final StickerColorToken QUESTION_CARD_BACKGROUND;
    public static final StickerColorToken QUESTION_CONTENT_INPUT_BACKGROUND;
    public static final StickerColorToken QUESTION_CONTENT_INPUT_PLACEHOLDER;
    public static final StickerColorToken QUESTION_CONTENT_INPUT_TEXT;
    public static final StickerColorToken QUESTION_INPUT_POINTER;
    public static final StickerColorToken QUESTION_PRIMARY_BUTTON;
    public static final StickerColorToken QUESTION_SECONDARY_BUTTON;
    public static final StickerColorToken QUESTION_SELECTOR;
    public static final StickerColorToken QUESTION_TITLE;
    public static final StickerColorToken QUESTION_TITLE_INPUT_PLACEHOLDER;

    static {
        StickerColorToken stickerColorToken = new StickerColorToken("BACKGROUND", 0);
        BACKGROUND = stickerColorToken;
        StickerColorToken stickerColorToken2 = new StickerColorToken("CONTENT", 1);
        CONTENT = stickerColorToken2;
        StickerColorToken stickerColorToken3 = new StickerColorToken("QUESTION_CARD_BACKGROUND", 2);
        QUESTION_CARD_BACKGROUND = stickerColorToken3;
        StickerColorToken stickerColorToken4 = new StickerColorToken("QUESTION_INPUT_POINTER", 3);
        QUESTION_INPUT_POINTER = stickerColorToken4;
        StickerColorToken stickerColorToken5 = new StickerColorToken("QUESTION_TITLE_INPUT_PLACEHOLDER", 4);
        QUESTION_TITLE_INPUT_PLACEHOLDER = stickerColorToken5;
        StickerColorToken stickerColorToken6 = new StickerColorToken("QUESTION_TITLE", 5);
        QUESTION_TITLE = stickerColorToken6;
        StickerColorToken stickerColorToken7 = new StickerColorToken("QUESTION_CONTENT_INPUT_PLACEHOLDER", 6);
        QUESTION_CONTENT_INPUT_PLACEHOLDER = stickerColorToken7;
        StickerColorToken stickerColorToken8 = new StickerColorToken("QUESTION_CONTENT_INPUT_BACKGROUND", 7);
        QUESTION_CONTENT_INPUT_BACKGROUND = stickerColorToken8;
        StickerColorToken stickerColorToken9 = new StickerColorToken("QUESTION_CONTENT_INPUT_TEXT", 8);
        QUESTION_CONTENT_INPUT_TEXT = stickerColorToken9;
        StickerColorToken stickerColorToken10 = new StickerColorToken("QUESTION_PRIMARY_BUTTON", 9);
        QUESTION_PRIMARY_BUTTON = stickerColorToken10;
        StickerColorToken stickerColorToken11 = new StickerColorToken("QUESTION_SECONDARY_BUTTON", 10);
        QUESTION_SECONDARY_BUTTON = stickerColorToken11;
        StickerColorToken stickerColorToken12 = new StickerColorToken("QUESTION_SELECTOR", 11);
        QUESTION_SELECTOR = stickerColorToken12;
        StickerColorToken stickerColorToken13 = new StickerColorToken("POLL_PREVIEW_BACKGROUND", 12);
        POLL_PREVIEW_BACKGROUND = stickerColorToken13;
        StickerColorToken stickerColorToken14 = new StickerColorToken("POLL_PREVIEW_CONTENT", 13);
        POLL_PREVIEW_CONTENT = stickerColorToken14;
        StickerColorToken stickerColorToken15 = new StickerColorToken("POLL_BACKGROUND", 14);
        POLL_BACKGROUND = stickerColorToken15;
        StickerColorToken stickerColorToken16 = new StickerColorToken("POLL_TITLE", 15);
        POLL_TITLE = stickerColorToken16;
        StickerColorToken stickerColorToken17 = new StickerColorToken("POLL_SUBTITLE", 16);
        POLL_SUBTITLE = stickerColorToken17;
        StickerColorToken stickerColorToken18 = new StickerColorToken("POLL_OPTION_BACKGROUND", 17);
        POLL_OPTION_BACKGROUND = stickerColorToken18;
        StickerColorToken stickerColorToken19 = new StickerColorToken("POLL_OPTION_RESULT_BACKGROUND", 18);
        POLL_OPTION_RESULT_BACKGROUND = stickerColorToken19;
        StickerColorToken stickerColorToken20 = new StickerColorToken("POLL_OPTION_RESULT_TEXT", 19);
        POLL_OPTION_RESULT_TEXT = stickerColorToken20;
        StickerColorToken stickerColorToken21 = new StickerColorToken("POLL_OPTION_TEXT", 20);
        POLL_OPTION_TEXT = stickerColorToken21;
        StickerColorToken stickerColorToken22 = new StickerColorToken("POLL_MULTIVOTE_BUTTON_BACKGROUND_FILL", 21);
        POLL_MULTIVOTE_BUTTON_BACKGROUND_FILL = stickerColorToken22;
        StickerColorToken stickerColorToken23 = new StickerColorToken("POLL_MULTIVOTE_BUTTON_BACKGROUND_PRESSED", 22);
        POLL_MULTIVOTE_BUTTON_BACKGROUND_PRESSED = stickerColorToken23;
        StickerColorToken stickerColorToken24 = new StickerColorToken("POLL_MULTIVOTE_BUTTON_TEXT", 23);
        POLL_MULTIVOTE_BUTTON_TEXT = stickerColorToken24;
        StickerColorToken stickerColorToken25 = new StickerColorToken("POLL_MULTIVOTE_OPTION_CHECKBOX", 24);
        POLL_MULTIVOTE_OPTION_CHECKBOX = stickerColorToken25;
        StickerColorToken[] stickerColorTokenArr = {stickerColorToken, stickerColorToken2, stickerColorToken3, stickerColorToken4, stickerColorToken5, stickerColorToken6, stickerColorToken7, stickerColorToken8, stickerColorToken9, stickerColorToken10, stickerColorToken11, stickerColorToken12, stickerColorToken13, stickerColorToken14, stickerColorToken15, stickerColorToken16, stickerColorToken17, stickerColorToken18, stickerColorToken19, stickerColorToken20, stickerColorToken21, stickerColorToken22, stickerColorToken23, stickerColorToken24, stickerColorToken25};
        $VALUES = stickerColorTokenArr;
        $ENTRIES = new asp(stickerColorTokenArr);
    }

    public StickerColorToken() {
        throw null;
    }

    public static StickerColorToken valueOf(String str) {
        return (StickerColorToken) Enum.valueOf(StickerColorToken.class, str);
    }

    public static StickerColorToken[] values() {
        return (StickerColorToken[]) $VALUES.clone();
    }
}
