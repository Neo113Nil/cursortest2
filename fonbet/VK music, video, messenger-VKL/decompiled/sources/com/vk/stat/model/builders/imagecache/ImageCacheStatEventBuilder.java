package com.vk.stat.model.builders.imagecache;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.asp;
import xsna.l5m;
import xsna.zrp;

/* compiled from: ImageCacheStatEventBuilder.kt */
/* loaded from: classes5.dex */
public final class ImageCacheStatEventBuilder extends l5m {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageCacheStatEventBuilder.kt */
    public static final class HitEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HitEventType[] $VALUES;
        public static final HitEventType SCREEN;
        public static final HitEventType SESSION;
        private final String value;

        static {
            HitEventType hitEventType = new HitEventType("SCREEN", 0, "screen");
            SCREEN = hitEventType;
            HitEventType hitEventType2 = new HitEventType("SESSION", 1, "session");
            SESSION = hitEventType2;
            HitEventType[] hitEventTypeArr = {hitEventType, hitEventType2};
            $VALUES = hitEventTypeArr;
            $ENTRIES = new asp(hitEventTypeArr);
        }

        public HitEventType(String str, int i, String str2) {
            this.value = str2;
        }

        public static HitEventType valueOf(String str) {
            return (HitEventType) Enum.valueOf(HitEventType.class, str);
        }

        public static HitEventType[] values() {
            return (HitEventType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public ImageCacheStatEventBuilder() {
        super(null, null, 3);
    }

    public final void v(HitEventType hitEventType, String str, int i, String str2, Integer num, Integer num2, Integer num3) {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.IMAGE_CACHE_HIT_RATE.h(), null, hitEventType.h(), Integer.valueOf(i), str, num, str2, num2, null, num3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -766, 3, null);
    }
}
