package com.vk.video.ui.upload.impl.publish.presentation.publish.compose.author;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorViewState.kt */
/* loaded from: classes7.dex */
public final class AuthorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthorType[] $VALUES;
    public static final AuthorType CHANNEL;
    public static final AuthorType PROFILE;

    static {
        AuthorType authorType = new AuthorType("CHANNEL", 0);
        CHANNEL = authorType;
        AuthorType authorType2 = new AuthorType("PROFILE", 1);
        PROFILE = authorType2;
        AuthorType[] authorTypeArr = {authorType, authorType2};
        $VALUES = authorTypeArr;
        $ENTRIES = new asp(authorTypeArr);
    }

    public AuthorType() {
        throw null;
    }

    public static AuthorType valueOf(String str) {
        return (AuthorType) Enum.valueOf(AuthorType.class, str);
    }

    public static AuthorType[] values() {
        return (AuthorType[]) $VALUES.clone();
    }
}
