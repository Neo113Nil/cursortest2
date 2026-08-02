package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.SchemeStat$TypeVkBridge;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVkBridgeShareItem implements SchemeStat$TypeVkBridge.b {

    @pmi0("share_type")
    private final ShareType shareType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ShareType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShareType[] $VALUES;

        @pmi0("copy_link")
        public static final ShareType COPY_LINK;

        @pmi0("create_chat")
        public static final ShareType CREATE_CHAT;

        @pmi0("message")
        public static final ShareType MESSAGE;

        @pmi0("other")
        public static final ShareType OTHER;

        @pmi0("post")
        public static final ShareType POST;

        @pmi0("qr")
        public static final ShareType QR;

        @pmi0("story")
        public static final ShareType STORY;

        @pmi0("wall")
        public static final ShareType WALL;

        static {
            ShareType shareType = new ShareType("COPY_LINK", 0);
            COPY_LINK = shareType;
            ShareType shareType2 = new ShareType("WALL", 1);
            WALL = shareType2;
            ShareType shareType3 = new ShareType("POST", 2);
            POST = shareType3;
            ShareType shareType4 = new ShareType("MESSAGE", 3);
            MESSAGE = shareType4;
            ShareType shareType5 = new ShareType("QR", 4);
            QR = shareType5;
            ShareType shareType6 = new ShareType(NativeAdContent.ViewTag.OTHER, 5);
            OTHER = shareType6;
            ShareType shareType7 = new ShareType("STORY", 6);
            STORY = shareType7;
            ShareType shareType8 = new ShareType("CREATE_CHAT", 7);
            CREATE_CHAT = shareType8;
            ShareType[] shareTypeArr = {shareType, shareType2, shareType3, shareType4, shareType5, shareType6, shareType7, shareType8};
            $VALUES = shareTypeArr;
            $ENTRIES = new asp(shareTypeArr);
        }

        private ShareType(String str, int i) {
        }

        public static ShareType valueOf(String str) {
            return (ShareType) Enum.valueOf(ShareType.class, str);
        }

        public static ShareType[] values() {
            return (ShareType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeVkBridgeShareItem(ShareType shareType) {
        this.shareType = shareType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeVkBridgeShareItem) && this.shareType == ((SchemeStat$TypeVkBridgeShareItem) obj).shareType;
    }

    public final int hashCode() {
        return this.shareType.hashCode();
    }

    public final String toString() {
        return "TypeVkBridgeShareItem(shareType=" + this.shareType + ')';
    }
}
