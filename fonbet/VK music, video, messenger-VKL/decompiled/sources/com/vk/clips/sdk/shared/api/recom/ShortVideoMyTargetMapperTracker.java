package com.vk.clips.sdk.shared.api.recom;

import xsna.asp;
import xsna.zrp;

/* compiled from: ShortVideoMyTargetMapperTracker.kt */
/* loaded from: classes17.dex */
public interface ShortVideoMyTargetMapperTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoMyTargetMapperTracker.kt */
    public static final class MyTargetType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MyTargetType[] $VALUES;
        public static final MyTargetType CAROUSEL;
        public static final MyTargetType PROMO_CLIP;
        public static final MyTargetType STATIC;
        public static final MyTargetType VIDEO_AD;
        private final String value;

        static {
            MyTargetType myTargetType = new MyTargetType("STATIC", 0, "static");
            STATIC = myTargetType;
            MyTargetType myTargetType2 = new MyTargetType("VIDEO_AD", 1, "video_ad");
            VIDEO_AD = myTargetType2;
            MyTargetType myTargetType3 = new MyTargetType("PROMO_CLIP", 2, "promo_clip");
            PROMO_CLIP = myTargetType3;
            MyTargetType myTargetType4 = new MyTargetType("CAROUSEL", 3, "carousel");
            CAROUSEL = myTargetType4;
            MyTargetType[] myTargetTypeArr = {myTargetType, myTargetType2, myTargetType3, myTargetType4};
            $VALUES = myTargetTypeArr;
            $ENTRIES = new asp(myTargetTypeArr);
        }

        public MyTargetType(String str, int i, String str2) {
            this.value = str2;
        }

        public static MyTargetType valueOf(String str) {
            return (MyTargetType) Enum.valueOf(MyTargetType.class, str);
        }

        public static MyTargetType[] values() {
            return (MyTargetType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    void a(MyTargetType myTargetType, Throwable th);

    void b(long j, String str);
}
