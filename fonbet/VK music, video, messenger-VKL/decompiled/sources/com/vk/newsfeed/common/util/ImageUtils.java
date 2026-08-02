package com.vk.newsfeed.common.util;

import java.util.LinkedHashMap;
import xsna.asp;
import xsna.zrp;

/* compiled from: ImageUtils.kt */
/* loaded from: classes4.dex */
public final class ImageUtils {
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageUtils.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType Artist;

        static {
            ContentType contentType = new ContentType("Artist", 0);
            Artist = contentType;
            ContentType[] contentTypeArr = {contentType};
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

    /* compiled from: ImageUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.Artist.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
