package com.vk.video.ui.discovery.minimizable.tracker;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import one.video.player.model.FrameSize;
import xsna.asp;
import xsna.bjc;
import xsna.zrp;

/* compiled from: VideoQualityTracker.kt */
/* loaded from: classes7.dex */
public final class VideoQualityTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoQualityTracker.kt */
    public static final class QualityChangeSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QualityChangeSource[] $VALUES;
        public static final QualityChangeSource PLAYER;
        public static final QualityChangeSource SETTINGS;

        static {
            QualityChangeSource qualityChangeSource = new QualityChangeSource("PLAYER", 0);
            PLAYER = qualityChangeSource;
            QualityChangeSource qualityChangeSource2 = new QualityChangeSource("SETTINGS", 1);
            SETTINGS = qualityChangeSource2;
            QualityChangeSource[] qualityChangeSourceArr = {qualityChangeSource, qualityChangeSource2};
            $VALUES = qualityChangeSourceArr;
            $ENTRIES = new asp(qualityChangeSourceArr);
        }

        public QualityChangeSource() {
            throw null;
        }

        public static QualityChangeSource valueOf(String str) {
            return (QualityChangeSource) Enum.valueOf(QualityChangeSource.class, str);
        }

        public static QualityChangeSource[] values() {
            return (QualityChangeSource[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoQualityTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[QualityChangeSource.values().length];
            try {
                iArr[QualityChangeSource.PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QualityChangeSource.SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QualitySettingsType.values().length];
            try {
                iArr2[QualitySettingsType.WIFI_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[QualitySettingsType.WIFI_HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QualitySettingsType.WIFI_ECONOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[QualitySettingsType.MOBILE_AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[QualitySettingsType.MOBILE_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[QualitySettingsType.MOBILE_ECONOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[QualitySettingsType.AUTO.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[QualitySettingsType.HIGH.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[QualitySettingsType.ECONOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[QualitySettingsType.OTHER.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FrameSize.values().length];
            try {
                iArr3[FrameSize._144p.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[FrameSize._240p.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[FrameSize._360p.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[FrameSize._480p.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[FrameSize._720p.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[FrameSize._1080p.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[FrameSize._1440p.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[FrameSize._2160p.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[FrameSize._4320p.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, VideoFile videoFile, SchemeStat$TypeClick.b bVar) {
        UserId I0;
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(videoFile == null ? SchemeStat$EventItem.Type.CLICK_ITEM : SchemeStat$EventItem.Type.VIDEO, videoFile != null ? Long.valueOf(videoFile.o0()) : null, (videoFile == null || (I0 = videoFile.I0()) == null) ? null : Long.valueOf(I0.b), null, videoFile != null ? videoFile.r() : null, null, 40, null), bVar, 2)).q();
    }
}
