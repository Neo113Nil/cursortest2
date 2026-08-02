package com.vk.core.network.metrics.traffic;

import xsna.asp;
import xsna.zrp;

/* compiled from: TrafficItem.kt */
/* loaded from: classes.dex */
public final class TrafficItem {
    public ContentType a;
    public long b;
    public final String c;
    public final String d;
    public final long e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrafficItem.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType CONTENT_AUDIO;
        public static final ContentType CONTENT_IMAGE;
        public static final ContentType CONTENT_JSON;
        public static final ContentType CONTENT_UNKNOWN;
        public static final ContentType CONTENT_VIDEO;
        public static final ContentType EMPTY;
        public static final ContentType LONG_POLL;
        public static final ContentType POST;
        public static final ContentType THIRD_PARTY_MAIL;
        public static final ContentType THIRD_PARTY_VIGO;

        static {
            ContentType contentType = new ContentType("EMPTY", 0);
            EMPTY = contentType;
            ContentType contentType2 = new ContentType("LONG_POLL", 1);
            LONG_POLL = contentType2;
            ContentType contentType3 = new ContentType("POST", 2);
            POST = contentType3;
            ContentType contentType4 = new ContentType("CONTENT_VIDEO", 3);
            CONTENT_VIDEO = contentType4;
            ContentType contentType5 = new ContentType("CONTENT_AUDIO", 4);
            CONTENT_AUDIO = contentType5;
            ContentType contentType6 = new ContentType("CONTENT_IMAGE", 5);
            CONTENT_IMAGE = contentType6;
            ContentType contentType7 = new ContentType("CONTENT_JSON", 6);
            CONTENT_JSON = contentType7;
            ContentType contentType8 = new ContentType("CONTENT_UNKNOWN", 7);
            CONTENT_UNKNOWN = contentType8;
            ContentType contentType9 = new ContentType("THIRD_PARTY_VIGO", 8);
            THIRD_PARTY_VIGO = contentType9;
            ContentType contentType10 = new ContentType("THIRD_PARTY_MAIL", 9);
            THIRD_PARTY_MAIL = contentType10;
            ContentType[] contentTypeArr = {contentType, contentType2, contentType3, contentType4, contentType5, contentType6, contentType7, contentType8, contentType9, contentType10};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        public ContentType() {
            throw null;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    public TrafficItem(ContentType contentType, long j, String str, String str2, long j2) {
        this.a = contentType;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = j2;
    }
}
