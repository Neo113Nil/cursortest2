package com.vk.editor.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryEditorEvents.kt */
/* loaded from: classes18.dex */
public final class StoryEditorEvents {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryEditorEvents[] $VALUES;
    public static final StoryEditorEvents ADD_GRAFFITI;
    public static final StoryEditorEvents ADD_PHOTO_CLIPBOARD;
    public static final StoryEditorEvents ADD_STICKER;
    public static final StoryEditorEvents ADD_TEXT_CLIPBOARD;
    public static final StoryEditorEvents APPLY_BACKGROUND;
    public static final StoryEditorEvents APPLY_GRAFFITI;
    public static final StoryEditorEvents APPLY_VERTICALIZATION;
    public static final StoryEditorEvents CANCEL_BACKGROUND_EDITOR;
    public static final StoryEditorEvents CANCEL_GRAFFITI;
    public static final StoryEditorEvents CANCEL_VERTICALIZATION;
    public static final StoryEditorEvents CHANGE_AUTHOR_LONGTAP;
    public static final StoryEditorEvents CHANGE_PHOTO;
    public static final StoryEditorEvents CHOOSE_RECEIVERS;
    public static final StoryEditorEvents CLICK_12H;
    public static final StoryEditorEvents CLICK_1H;
    public static final StoryEditorEvents CLICK_24H;
    public static final StoryEditorEvents CLICK_48H;
    public static final StoryEditorEvents CLICK_ON_POSTPONE_VERTICALIZATION;
    public static final StoryEditorEvents CLICK_ON_PRIVACY;
    public static final StoryEditorEvents CLICK_ON_TRY_VERTICALIZATION;
    public static final StoryEditorEvents CLICK_ON_VERTICALIZATION_BUTTON;
    public static final StoryEditorEvents DELETE_GRAFFITI;
    public static final StoryEditorEvents DELETE_STICKER;
    public static final StoryEditorEvents DELETE_TEXT;
    public static final StoryEditorEvents EDIT_ADVERTISER_MARK;
    public static final StoryEditorEvents EDIT_QUESTION;
    public static final StoryEditorEvents EDIT_STICKER;
    public static final StoryEditorEvents EDIT_TEXT;
    public static final StoryEditorEvents GEO_ACCESS_ALLOW;
    public static final StoryEditorEvents GEO_ACCESS_DECLINE;
    public static final StoryEditorEvents MARK_ADVERTISER;
    public static final StoryEditorEvents OPEN_BACKGROUND_EDITOR;
    public static final StoryEditorEvents SAVE_STORY;
    public static final StoryEditorEvents SCREENSHOT_OF_VERTICALIZATION_PICKER;
    public static final StoryEditorEvents SELECT_BACKGROUND;
    public static final StoryEditorEvents SHOW_BUBBLE_LONGTAP;
    public static final StoryEditorEvents SOUND_OFF;
    public static final StoryEditorEvents SOUND_ON;
    public static final StoryEditorEvents TAKE_SCREENSHOT;
    public static final StoryEditorEvents VIEW_VERTICALIZATION_BANNER;

    static {
        StoryEditorEvents storyEditorEvents = new StoryEditorEvents("SAVE_STORY", 0);
        SAVE_STORY = storyEditorEvents;
        StoryEditorEvents storyEditorEvents2 = new StoryEditorEvents("CHOOSE_RECEIVERS", 1);
        CHOOSE_RECEIVERS = storyEditorEvents2;
        StoryEditorEvents storyEditorEvents3 = new StoryEditorEvents("SOUND_ON", 2);
        SOUND_ON = storyEditorEvents3;
        StoryEditorEvents storyEditorEvents4 = new StoryEditorEvents("SOUND_OFF", 3);
        SOUND_OFF = storyEditorEvents4;
        StoryEditorEvents storyEditorEvents5 = new StoryEditorEvents("EDIT_TEXT", 4);
        EDIT_TEXT = storyEditorEvents5;
        StoryEditorEvents storyEditorEvents6 = new StoryEditorEvents("DELETE_TEXT", 5);
        DELETE_TEXT = storyEditorEvents6;
        StoryEditorEvents storyEditorEvents7 = new StoryEditorEvents("ADD_STICKER", 6);
        ADD_STICKER = storyEditorEvents7;
        StoryEditorEvents storyEditorEvents8 = new StoryEditorEvents("DELETE_STICKER", 7);
        DELETE_STICKER = storyEditorEvents8;
        StoryEditorEvents storyEditorEvents9 = new StoryEditorEvents("EDIT_STICKER", 8);
        EDIT_STICKER = storyEditorEvents9;
        StoryEditorEvents storyEditorEvents10 = new StoryEditorEvents("ADD_GRAFFITI", 9);
        ADD_GRAFFITI = storyEditorEvents10;
        StoryEditorEvents storyEditorEvents11 = new StoryEditorEvents("DELETE_GRAFFITI", 10);
        DELETE_GRAFFITI = storyEditorEvents11;
        StoryEditorEvents storyEditorEvents12 = new StoryEditorEvents("APPLY_GRAFFITI", 11);
        APPLY_GRAFFITI = storyEditorEvents12;
        StoryEditorEvents storyEditorEvents13 = new StoryEditorEvents("CANCEL_GRAFFITI", 12);
        CANCEL_GRAFFITI = storyEditorEvents13;
        StoryEditorEvents storyEditorEvents14 = new StoryEditorEvents("EDIT_QUESTION", 13);
        EDIT_QUESTION = storyEditorEvents14;
        StoryEditorEvents storyEditorEvents15 = new StoryEditorEvents("GEO_ACCESS_ALLOW", 14);
        GEO_ACCESS_ALLOW = storyEditorEvents15;
        StoryEditorEvents storyEditorEvents16 = new StoryEditorEvents("GEO_ACCESS_DECLINE", 15);
        GEO_ACCESS_DECLINE = storyEditorEvents16;
        StoryEditorEvents storyEditorEvents17 = new StoryEditorEvents("OPEN_BACKGROUND_EDITOR", 16);
        OPEN_BACKGROUND_EDITOR = storyEditorEvents17;
        StoryEditorEvents storyEditorEvents18 = new StoryEditorEvents("SELECT_BACKGROUND", 17);
        SELECT_BACKGROUND = storyEditorEvents18;
        StoryEditorEvents storyEditorEvents19 = new StoryEditorEvents("APPLY_BACKGROUND", 18);
        APPLY_BACKGROUND = storyEditorEvents19;
        StoryEditorEvents storyEditorEvents20 = new StoryEditorEvents("CANCEL_BACKGROUND_EDITOR", 19);
        CANCEL_BACKGROUND_EDITOR = storyEditorEvents20;
        StoryEditorEvents storyEditorEvents21 = new StoryEditorEvents("MARK_ADVERTISER", 20);
        MARK_ADVERTISER = storyEditorEvents21;
        StoryEditorEvents storyEditorEvents22 = new StoryEditorEvents("EDIT_ADVERTISER_MARK", 21);
        EDIT_ADVERTISER_MARK = storyEditorEvents22;
        StoryEditorEvents storyEditorEvents23 = new StoryEditorEvents("ADD_PHOTO_CLIPBOARD", 22);
        ADD_PHOTO_CLIPBOARD = storyEditorEvents23;
        StoryEditorEvents storyEditorEvents24 = new StoryEditorEvents("ADD_TEXT_CLIPBOARD", 23);
        ADD_TEXT_CLIPBOARD = storyEditorEvents24;
        StoryEditorEvents storyEditorEvents25 = new StoryEditorEvents("CHANGE_PHOTO", 24);
        CHANGE_PHOTO = storyEditorEvents25;
        StoryEditorEvents storyEditorEvents26 = new StoryEditorEvents("CLICK_ON_PRIVACY", 25);
        CLICK_ON_PRIVACY = storyEditorEvents26;
        StoryEditorEvents storyEditorEvents27 = new StoryEditorEvents("CLICK_1H", 26);
        CLICK_1H = storyEditorEvents27;
        StoryEditorEvents storyEditorEvents28 = new StoryEditorEvents("CLICK_12H", 27);
        CLICK_12H = storyEditorEvents28;
        StoryEditorEvents storyEditorEvents29 = new StoryEditorEvents("CLICK_24H", 28);
        CLICK_24H = storyEditorEvents29;
        StoryEditorEvents storyEditorEvents30 = new StoryEditorEvents("CLICK_48H", 29);
        CLICK_48H = storyEditorEvents30;
        StoryEditorEvents storyEditorEvents31 = new StoryEditorEvents("CHANGE_AUTHOR_LONGTAP", 30);
        CHANGE_AUTHOR_LONGTAP = storyEditorEvents31;
        StoryEditorEvents storyEditorEvents32 = new StoryEditorEvents("SHOW_BUBBLE_LONGTAP", 31);
        SHOW_BUBBLE_LONGTAP = storyEditorEvents32;
        StoryEditorEvents storyEditorEvents33 = new StoryEditorEvents("VIEW_VERTICALIZATION_BANNER", 32);
        VIEW_VERTICALIZATION_BANNER = storyEditorEvents33;
        StoryEditorEvents storyEditorEvents34 = new StoryEditorEvents("CLICK_ON_TRY_VERTICALIZATION", 33);
        CLICK_ON_TRY_VERTICALIZATION = storyEditorEvents34;
        StoryEditorEvents storyEditorEvents35 = new StoryEditorEvents("CLICK_ON_POSTPONE_VERTICALIZATION", 34);
        CLICK_ON_POSTPONE_VERTICALIZATION = storyEditorEvents35;
        StoryEditorEvents storyEditorEvents36 = new StoryEditorEvents("APPLY_VERTICALIZATION", 35);
        APPLY_VERTICALIZATION = storyEditorEvents36;
        StoryEditorEvents storyEditorEvents37 = new StoryEditorEvents("CANCEL_VERTICALIZATION", 36);
        CANCEL_VERTICALIZATION = storyEditorEvents37;
        StoryEditorEvents storyEditorEvents38 = new StoryEditorEvents("CLICK_ON_VERTICALIZATION_BUTTON", 37);
        CLICK_ON_VERTICALIZATION_BUTTON = storyEditorEvents38;
        StoryEditorEvents storyEditorEvents39 = new StoryEditorEvents("TAKE_SCREENSHOT", 38);
        TAKE_SCREENSHOT = storyEditorEvents39;
        StoryEditorEvents storyEditorEvents40 = new StoryEditorEvents("SCREENSHOT_OF_VERTICALIZATION_PICKER", 39);
        SCREENSHOT_OF_VERTICALIZATION_PICKER = storyEditorEvents40;
        StoryEditorEvents[] storyEditorEventsArr = {storyEditorEvents, storyEditorEvents2, storyEditorEvents3, storyEditorEvents4, storyEditorEvents5, storyEditorEvents6, storyEditorEvents7, storyEditorEvents8, storyEditorEvents9, storyEditorEvents10, storyEditorEvents11, storyEditorEvents12, storyEditorEvents13, storyEditorEvents14, storyEditorEvents15, storyEditorEvents16, storyEditorEvents17, storyEditorEvents18, storyEditorEvents19, storyEditorEvents20, storyEditorEvents21, storyEditorEvents22, storyEditorEvents23, storyEditorEvents24, storyEditorEvents25, storyEditorEvents26, storyEditorEvents27, storyEditorEvents28, storyEditorEvents29, storyEditorEvents30, storyEditorEvents31, storyEditorEvents32, storyEditorEvents33, storyEditorEvents34, storyEditorEvents35, storyEditorEvents36, storyEditorEvents37, storyEditorEvents38, storyEditorEvents39, storyEditorEvents40};
        $VALUES = storyEditorEventsArr;
        $ENTRIES = new asp(storyEditorEventsArr);
    }

    public StoryEditorEvents() {
        throw null;
    }

    public static StoryEditorEvents valueOf(String str) {
        return (StoryEditorEvents) Enum.valueOf(StoryEditorEvents.class, str);
    }

    public static StoryEditorEvents[] values() {
        return (StoryEditorEvents[]) $VALUES.clone();
    }
}
