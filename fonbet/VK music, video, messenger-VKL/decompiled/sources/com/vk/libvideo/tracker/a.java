package com.vk.libvideo.tracker;

import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.video.ui.share.api.ScreenMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ScreenModeVideoStatMapper.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: ScreenModeVideoStatMapper.kt */
    /* renamed from: com.vk.libvideo.tracker.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1249a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenModeVideoStatMapper.UnifiedStatScreenMode.values().length];
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ScreenMode a(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        int i = C1249a.$EnumSwitchMapping$0[unifiedStatScreenMode.ordinal()];
        if (i == 1) {
            return ScreenMode.DISCOVERY;
        }
        if (i == 2) {
            return ScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (i == 3) {
            return ScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (i == 4) {
            return ScreenMode.PREVIEW;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final MobileOfficialAppsVideoStat$TypeScreenMode b(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        int i = C1249a.$EnumSwitchMapping$0[unifiedStatScreenMode.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
        }
        if (i == 2) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (i == 3) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (i == 4) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
