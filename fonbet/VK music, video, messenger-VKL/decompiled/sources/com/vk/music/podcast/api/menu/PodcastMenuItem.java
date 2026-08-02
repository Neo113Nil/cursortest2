package com.vk.music.podcast.api.menu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PodcastMenuItem.kt */
/* loaded from: classes3.dex */
public final class PodcastMenuItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PodcastMenuItem[] $VALUES;
    public static final PodcastMenuItem AddToBookFavorites;
    public static final PodcastMenuItem CopyLink;
    public static final PodcastMenuItem GoToAuthor;
    public static final PodcastMenuItem GoToPost;
    public static final PodcastMenuItem Share;
    public static final PodcastMenuItem SubscribeToAuthor;

    static {
        PodcastMenuItem podcastMenuItem = new PodcastMenuItem("AddToBookFavorites", 0);
        AddToBookFavorites = podcastMenuItem;
        PodcastMenuItem podcastMenuItem2 = new PodcastMenuItem("GoToPost", 1);
        GoToPost = podcastMenuItem2;
        PodcastMenuItem podcastMenuItem3 = new PodcastMenuItem("GoToAuthor", 2);
        GoToAuthor = podcastMenuItem3;
        PodcastMenuItem podcastMenuItem4 = new PodcastMenuItem("SubscribeToAuthor", 3);
        SubscribeToAuthor = podcastMenuItem4;
        PodcastMenuItem podcastMenuItem5 = new PodcastMenuItem("Share", 4);
        Share = podcastMenuItem5;
        PodcastMenuItem podcastMenuItem6 = new PodcastMenuItem("CopyLink", 5);
        CopyLink = podcastMenuItem6;
        PodcastMenuItem[] podcastMenuItemArr = {podcastMenuItem, podcastMenuItem2, podcastMenuItem3, podcastMenuItem4, podcastMenuItem5, podcastMenuItem6};
        $VALUES = podcastMenuItemArr;
        $ENTRIES = new asp(podcastMenuItemArr);
    }

    public PodcastMenuItem() {
        throw null;
    }

    public static PodcastMenuItem valueOf(String str) {
        return (PodcastMenuItem) Enum.valueOf(PodcastMenuItem.class, str);
    }

    public static PodcastMenuItem[] values() {
        return (PodcastMenuItem[]) $VALUES.clone();
    }
}
