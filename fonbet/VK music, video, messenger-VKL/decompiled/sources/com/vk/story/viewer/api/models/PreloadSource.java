package com.vk.story.viewer.api.models;

import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryReporter.kt */
/* loaded from: classes6.dex */
public final class PreloadSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PreloadSource[] $VALUES;
    public static final PreloadSource ARCHIVE;
    public static final PreloadSource AVATAR;
    public static final PreloadSource COMMENT_AVATAR;
    public static final a Companion;
    public static final PreloadSource DISCOVER;
    public static final PreloadSource FAVE;
    public static final PreloadSource IM_DIALOGS_LIST;
    public static final PreloadSource IM_DIALOG_HEADER;
    public static final PreloadSource IM_MSG_LIST;
    public static final PreloadSource LINK;
    public static final PreloadSource LIST_MIDDLE;
    public static final PreloadSource NARRATIVE_LINK;
    public static final PreloadSource NARRATIVE_RECOMMENDATIONS;
    public static final PreloadSource NARRATIVE_SECTION;
    public static final PreloadSource NARRATIVE_SNIPPET;
    public static final PreloadSource NARRATIVE_STORY;
    public static final PreloadSource NEWS;
    public static final PreloadSource NEXT_AUTHOR;
    public static final PreloadSource NEXT_STORY;
    public static final PreloadSource PLACE_STORY_LIST;
    public static final PreloadSource POST_AVATAR;
    public static final PreloadSource PREVIOUS_AUTHOR;
    public static final PreloadSource PREVIOUS_STORY;
    public static final PreloadSource PROFILE;
    public static final PreloadSource PROFILE_SNACKBAR;
    public static final PreloadSource QUESTION_STORY;
    public static final PreloadSource REPLIES_LIST;
    public static final PreloadSource REPLY_STORY;
    public static final PreloadSource SEARCH_STORY_LIST;

    /* compiled from: StoryReporter.kt */
    public static final class a {

        /* compiled from: StoryReporter.kt */
        /* renamed from: com.vk.story.viewer.api.models.PreloadSource$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1832a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MobileOfficialAppsConStoriesStat$ViewEntryPoint.values().length];
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.SNIPPET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.PROFILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPLIES_LIST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPLY_STORY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SNIPPET.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_STORY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_RECOMMENDATIONS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_LINK.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SECTION.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.FAVE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST_MIDDLE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.ARCHIVE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOGS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_MSG_LIST.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOG_HEADER.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.QUESTION_STORY.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.SEARCH_STORY_LIST.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.PLACE_STORY_LIST.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.PROFILE_SNACKBAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.POST_AVATAR.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.COMMENT_AVATAR.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        PreloadSource preloadSource = new PreloadSource("PREVIOUS_STORY", 0);
        PREVIOUS_STORY = preloadSource;
        PreloadSource preloadSource2 = new PreloadSource("PREVIOUS_AUTHOR", 1);
        PREVIOUS_AUTHOR = preloadSource2;
        PreloadSource preloadSource3 = new PreloadSource("NEXT_STORY", 2);
        NEXT_STORY = preloadSource3;
        PreloadSource preloadSource4 = new PreloadSource("NEXT_AUTHOR", 3);
        NEXT_AUTHOR = preloadSource4;
        PreloadSource preloadSource5 = new PreloadSource("REPLY_STORY", 4);
        REPLY_STORY = preloadSource5;
        PreloadSource preloadSource6 = new PreloadSource("NEWS", 5);
        NEWS = preloadSource6;
        PreloadSource preloadSource7 = new PreloadSource("DISCOVER", 6);
        DISCOVER = preloadSource7;
        PreloadSource preloadSource8 = new PreloadSource("REPLIES_LIST", 7);
        REPLIES_LIST = preloadSource8;
        PreloadSource preloadSource9 = new PreloadSource("PROFILE", 8);
        PROFILE = preloadSource9;
        PreloadSource preloadSource10 = new PreloadSource("NARRATIVE_SNIPPET", 9);
        NARRATIVE_SNIPPET = preloadSource10;
        PreloadSource preloadSource11 = new PreloadSource("NARRATIVE_STORY", 10);
        NARRATIVE_STORY = preloadSource11;
        PreloadSource preloadSource12 = new PreloadSource("NARRATIVE_RECOMMENDATIONS", 11);
        NARRATIVE_RECOMMENDATIONS = preloadSource12;
        PreloadSource preloadSource13 = new PreloadSource("NARRATIVE_LINK", 12);
        NARRATIVE_LINK = preloadSource13;
        PreloadSource preloadSource14 = new PreloadSource("NARRATIVE_SECTION", 13);
        NARRATIVE_SECTION = preloadSource14;
        PreloadSource preloadSource15 = new PreloadSource("FAVE", 14);
        FAVE = preloadSource15;
        PreloadSource preloadSource16 = new PreloadSource("LINK", 15);
        LINK = preloadSource16;
        PreloadSource preloadSource17 = new PreloadSource("QUESTION_STORY", 16);
        QUESTION_STORY = preloadSource17;
        PreloadSource preloadSource18 = new PreloadSource("LIST_MIDDLE", 17);
        LIST_MIDDLE = preloadSource18;
        PreloadSource preloadSource19 = new PreloadSource("ARCHIVE", 18);
        ARCHIVE = preloadSource19;
        PreloadSource preloadSource20 = new PreloadSource("IM_DIALOGS_LIST", 19);
        IM_DIALOGS_LIST = preloadSource20;
        PreloadSource preloadSource21 = new PreloadSource("IM_MSG_LIST", 20);
        IM_MSG_LIST = preloadSource21;
        PreloadSource preloadSource22 = new PreloadSource("IM_DIALOG_HEADER", 21);
        IM_DIALOG_HEADER = preloadSource22;
        PreloadSource preloadSource23 = new PreloadSource("PLACE_STORY_LIST", 22);
        PLACE_STORY_LIST = preloadSource23;
        PreloadSource preloadSource24 = new PreloadSource("SEARCH_STORY_LIST", 23);
        SEARCH_STORY_LIST = preloadSource24;
        PreloadSource preloadSource25 = new PreloadSource("PROFILE_SNACKBAR", 24);
        PROFILE_SNACKBAR = preloadSource25;
        PreloadSource preloadSource26 = new PreloadSource("POST_AVATAR", 25);
        POST_AVATAR = preloadSource26;
        PreloadSource preloadSource27 = new PreloadSource("COMMENT_AVATAR", 26);
        COMMENT_AVATAR = preloadSource27;
        PreloadSource preloadSource28 = new PreloadSource("AVATAR", 27);
        AVATAR = preloadSource28;
        PreloadSource[] preloadSourceArr = {preloadSource, preloadSource2, preloadSource3, preloadSource4, preloadSource5, preloadSource6, preloadSource7, preloadSource8, preloadSource9, preloadSource10, preloadSource11, preloadSource12, preloadSource13, preloadSource14, preloadSource15, preloadSource16, preloadSource17, preloadSource18, preloadSource19, preloadSource20, preloadSource21, preloadSource22, preloadSource23, preloadSource24, preloadSource25, preloadSource26, preloadSource27, preloadSource28};
        $VALUES = preloadSourceArr;
        $ENTRIES = new asp(preloadSourceArr);
        Companion = new a();
    }

    public PreloadSource() {
        throw null;
    }

    public static PreloadSource valueOf(String str) {
        return (PreloadSource) Enum.valueOf(PreloadSource.class, str);
    }

    public static PreloadSource[] values() {
        return (PreloadSource[]) $VALUES.clone();
    }
}
