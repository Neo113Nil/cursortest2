package com.vk.video.ui.discovery.minimizable.announce.author;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorAnnounceState.kt */
/* loaded from: classes7.dex */
public final class AuthorAnnounceMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthorAnnounceMode[] $VALUES;
    public static final AuthorAnnounceMode Hidden;
    public static final AuthorAnnounceMode Shown;

    static {
        AuthorAnnounceMode authorAnnounceMode = new AuthorAnnounceMode("Hidden", 0);
        Hidden = authorAnnounceMode;
        AuthorAnnounceMode authorAnnounceMode2 = new AuthorAnnounceMode("Shown", 1);
        Shown = authorAnnounceMode2;
        AuthorAnnounceMode[] authorAnnounceModeArr = {authorAnnounceMode, authorAnnounceMode2};
        $VALUES = authorAnnounceModeArr;
        $ENTRIES = new asp(authorAnnounceModeArr);
    }

    public AuthorAnnounceMode() {
        throw null;
    }

    public static AuthorAnnounceMode valueOf(String str) {
        return (AuthorAnnounceMode) Enum.valueOf(AuthorAnnounceMode.class, str);
    }

    public static AuthorAnnounceMode[] values() {
        return (AuthorAnnounceMode[]) $VALUES.clone();
    }
}
