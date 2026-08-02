package com.vk.libvideo.live.api.base;

import xsna.asp;
import xsna.zrp;

/* compiled from: LiveAnalyticsHandler.kt */
/* loaded from: classes3.dex */
public interface LiveAnalyticsHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LiveAnalyticsHandler.kt */
    public static final class AuthorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AuthorType[] $VALUES;
        public static final AuthorType GROUP;
        public static final AuthorType PROFILE;

        static {
            AuthorType authorType = new AuthorType("GROUP", 0);
            GROUP = authorType;
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
}
