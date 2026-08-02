package com.vk.dto.stories.entities;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryCameraMode.kt */
/* loaded from: classes18.dex */
public final class StoryCameraMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryCameraMode[] $VALUES;
    public static final StoryCameraMode CLIPS;
    public static final StoryCameraMode LIVE;
    public static final StoryCameraMode PHOTO;
    public static final StoryCameraMode PING_PONG;
    public static final StoryCameraMode QR_SCANNER;
    public static final StoryCameraMode REVERSE;
    public static final StoryCameraMode STORY;
    public static final StoryCameraMode STORY_VIDEO;
    public static final StoryCameraMode VIDEO;
    public static final StoryCameraMode VMOJI_CAPTURE;
    private final MobileOfficialAppsCoreNavStat$EventScreen ref;

    /* compiled from: StoryCameraMode.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryCameraMode.values().length];
            try {
                iArr[StoryCameraMode.STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryCameraMode.PING_PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryCameraMode.REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryCameraMode.STORY_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StoryCameraMode storyCameraMode = new StoryCameraMode("LIVE", 0, MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_LIVE);
        LIVE = storyCameraMode;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_STORY;
        StoryCameraMode storyCameraMode2 = new StoryCameraMode("STORY", 1, mobileOfficialAppsCoreNavStat$EventScreen);
        STORY = storyCameraMode2;
        StoryCameraMode storyCameraMode3 = new StoryCameraMode("PING_PONG", 2, MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_PINGPONG);
        PING_PONG = storyCameraMode3;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_VIDEO;
        StoryCameraMode storyCameraMode4 = new StoryCameraMode("REVERSE", 3, mobileOfficialAppsCoreNavStat$EventScreen2);
        REVERSE = storyCameraMode4;
        StoryCameraMode storyCameraMode5 = new StoryCameraMode("PHOTO", 4, mobileOfficialAppsCoreNavStat$EventScreen);
        PHOTO = storyCameraMode5;
        StoryCameraMode storyCameraMode6 = new StoryCameraMode(SignalingProtocol.MEDIA_OPTION_VIDEO, 5, mobileOfficialAppsCoreNavStat$EventScreen2);
        VIDEO = storyCameraMode6;
        StoryCameraMode storyCameraMode7 = new StoryCameraMode("STORY_VIDEO", 6, mobileOfficialAppsCoreNavStat$EventScreen2);
        STORY_VIDEO = storyCameraMode7;
        StoryCameraMode storyCameraMode8 = new StoryCameraMode("QR_SCANNER", 7, MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_QR);
        QR_SCANNER = storyCameraMode8;
        StoryCameraMode storyCameraMode9 = new StoryCameraMode("CLIPS", 8, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA);
        CLIPS = storyCameraMode9;
        StoryCameraMode storyCameraMode10 = new StoryCameraMode("VMOJI_CAPTURE", 9, MobileOfficialAppsCoreNavStat$EventScreen.VMOJI_CAMERA);
        VMOJI_CAPTURE = storyCameraMode10;
        StoryCameraMode[] storyCameraModeArr = {storyCameraMode, storyCameraMode2, storyCameraMode3, storyCameraMode4, storyCameraMode5, storyCameraMode6, storyCameraMode7, storyCameraMode8, storyCameraMode9, storyCameraMode10};
        $VALUES = storyCameraModeArr;
        $ENTRIES = new asp(storyCameraModeArr);
    }

    public StoryCameraMode(String str, int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.ref = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public static StoryCameraMode valueOf(String str) {
        return (StoryCameraMode) Enum.valueOf(StoryCameraMode.class, str);
    }

    public static StoryCameraMode[] values() {
        return (StoryCameraMode[]) $VALUES.clone();
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen h() {
        return this.ref;
    }

    public final boolean i() {
        return this == CLIPS;
    }

    public final boolean j() {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }
}
