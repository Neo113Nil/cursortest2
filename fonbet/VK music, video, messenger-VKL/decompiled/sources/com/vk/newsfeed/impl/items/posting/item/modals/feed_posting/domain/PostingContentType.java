package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.shy;
import xsna.zrp;

/* compiled from: PostingContentType.kt */
/* loaded from: classes4.dex */
public final class PostingContentType {
    public final int a;
    public final int b;
    public final Type c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingContentType.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CHANNEL;
        public static final Type CLIP;
        public static final Type LIVE;
        public static final Type PHOTO;
        public static final Type POST;
        public static final Type STORY;
        public static final Type VIDEO;

        static {
            Type type = new Type("POST", 0);
            POST = type;
            Type type2 = new Type("STORY", 1);
            STORY = type2;
            Type type3 = new Type("CLIP", 2);
            CLIP = type3;
            Type type4 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 3);
            VIDEO = type4;
            Type type5 = new Type("LIVE", 4);
            LIVE = type5;
            Type type6 = new Type("PHOTO", 5);
            PHOTO = type6;
            Type type7 = new Type("CHANNEL", 6);
            CHANNEL = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PostingContentType(int i, int i2, Type type) {
        this.a = i;
        this.b = i2;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingContentType)) {
            return false;
        }
        PostingContentType postingContentType = (PostingContentType) obj;
        return this.a == postingContentType.a && this.b == postingContentType.b && this.c == postingContentType.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PostingContentType(iconRes=" + this.a + ", titleRes=" + this.b + ", type=" + this.c + ", isAvailable=true)";
    }
}
