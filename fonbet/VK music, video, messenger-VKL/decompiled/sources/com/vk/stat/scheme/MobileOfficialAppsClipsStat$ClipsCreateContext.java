package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipsCreateContext {

    @pmi0("creation_entry_point")
    private final CreationEntryPoint creationEntryPoint;

    @pmi0("creation_session_id")
    private final int creationSessionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class CreationEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CreationEntryPoint[] $VALUES;

        @pmi0("clips_duet_make")
        public static final CreationEntryPoint CLIPS_DUET_MAKE;

        @pmi0("clips_grid_challenge")
        public static final CreationEntryPoint CLIPS_GRID_CHALLENGE;

        @pmi0("clips_grid_effect")
        public static final CreationEntryPoint CLIPS_GRID_EFFECT;

        @pmi0("clips_grid_hashtag")
        public static final CreationEntryPoint CLIPS_GRID_HASHTAG;

        @pmi0("clips_grid_mask")
        public static final CreationEntryPoint CLIPS_GRID_MASK;

        @pmi0("clips_grid_music")
        public static final CreationEntryPoint CLIPS_GRID_MUSIC;

        @pmi0("clips_grid_sound")
        public static final CreationEntryPoint CLIPS_GRID_SOUND;

        @pmi0("clips_viewer")
        public static final CreationEntryPoint CLIPS_VIEWER;

        @pmi0("clips_viewer_trend")
        public static final CreationEntryPoint CLIPS_VIEWER_TREND;

        @pmi0("club_clips_button")
        public static final CreationEntryPoint CLUB_CLIPS_BUTTON;

        @pmi0("club_plus")
        public static final CreationEntryPoint CLUB_PLUS;

        @pmi0("club_tab")
        public static final CreationEntryPoint CLUB_TAB;

        @pmi0("community")
        public static final CreationEntryPoint COMMUNITY;

        @pmi0("community_creation_onboarding_block")
        public static final CreationEntryPoint COMMUNITY_CREATION_ONBOARDING_BLOCK;

        @pmi0("create_clip_cut")
        public static final CreationEntryPoint CREATE_CLIP_CUT;

        @pmi0("create_clip_cut_crop")
        public static final CreationEntryPoint CREATE_CLIP_CUT_CROP;

        @pmi0("feed_camera")
        public static final CreationEntryPoint FEED_CAMERA;

        @pmi0("feed_clips_block")
        public static final CreationEntryPoint FEED_CLIPS_BLOCK;

        @pmi0("feed_plus")
        public static final CreationEntryPoint FEED_PLUS;

        @pmi0("group_wall_button")
        public static final CreationEntryPoint GROUP_WALL_BUTTON;

        @pmi0("link")
        public static final CreationEntryPoint LINK;

        @pmi0("my_clips_grid")
        public static final CreationEntryPoint MY_CLIPS_GRID;

        @pmi0("navbar")
        public static final CreationEntryPoint NAVBAR;

        @pmi0("other")
        public static final CreationEntryPoint OTHER;

        @pmi0("popular_templates_block")
        public static final CreationEntryPoint POPULAR_TEMPLATES_BLOCK;

        @pmi0("posting")
        public static final CreationEntryPoint POSTING;

        @pmi0("profile_clips_button")
        public static final CreationEntryPoint PROFILE_CLIPS_BUTTON;

        @pmi0("profile_plus")
        public static final CreationEntryPoint PROFILE_PLUS;

        @pmi0("public_clips_grid")
        public static final CreationEntryPoint PUBLIC_CLIPS_GRID;

        @pmi0("swipe")
        public static final CreationEntryPoint SWIPE;

        @pmi0("video_as_clip")
        public static final CreationEntryPoint VIDEO_AS_CLIP;

        @pmi0("video_as_clip_video_upload")
        public static final CreationEntryPoint VIDEO_AS_CLIP_VIDEO_UPLOAD;

        static {
            CreationEntryPoint creationEntryPoint = new CreationEntryPoint(NativeAdContent.ViewTag.OTHER, 0);
            OTHER = creationEntryPoint;
            CreationEntryPoint creationEntryPoint2 = new CreationEntryPoint("PROFILE_PLUS", 1);
            PROFILE_PLUS = creationEntryPoint2;
            CreationEntryPoint creationEntryPoint3 = new CreationEntryPoint("PROFILE_CLIPS_BUTTON", 2);
            PROFILE_CLIPS_BUTTON = creationEntryPoint3;
            CreationEntryPoint creationEntryPoint4 = new CreationEntryPoint("CLUB_TAB", 3);
            CLUB_TAB = creationEntryPoint4;
            CreationEntryPoint creationEntryPoint5 = new CreationEntryPoint("CLUB_PLUS", 4);
            CLUB_PLUS = creationEntryPoint5;
            CreationEntryPoint creationEntryPoint6 = new CreationEntryPoint("CLUB_CLIPS_BUTTON", 5);
            CLUB_CLIPS_BUTTON = creationEntryPoint6;
            CreationEntryPoint creationEntryPoint7 = new CreationEntryPoint("FEED_PLUS", 6);
            FEED_PLUS = creationEntryPoint7;
            CreationEntryPoint creationEntryPoint8 = new CreationEntryPoint("FEED_CAMERA", 7);
            FEED_CAMERA = creationEntryPoint8;
            CreationEntryPoint creationEntryPoint9 = new CreationEntryPoint("VIDEO_AS_CLIP", 8);
            VIDEO_AS_CLIP = creationEntryPoint9;
            CreationEntryPoint creationEntryPoint10 = new CreationEntryPoint("VIDEO_AS_CLIP_VIDEO_UPLOAD", 9);
            VIDEO_AS_CLIP_VIDEO_UPLOAD = creationEntryPoint10;
            CreationEntryPoint creationEntryPoint11 = new CreationEntryPoint("CLIPS_VIEWER", 10);
            CLIPS_VIEWER = creationEntryPoint11;
            CreationEntryPoint creationEntryPoint12 = new CreationEntryPoint("CLIPS_VIEWER_TREND", 11);
            CLIPS_VIEWER_TREND = creationEntryPoint12;
            CreationEntryPoint creationEntryPoint13 = new CreationEntryPoint("CLIPS_DUET_MAKE", 12);
            CLIPS_DUET_MAKE = creationEntryPoint13;
            CreationEntryPoint creationEntryPoint14 = new CreationEntryPoint("MY_CLIPS_GRID", 13);
            MY_CLIPS_GRID = creationEntryPoint14;
            CreationEntryPoint creationEntryPoint15 = new CreationEntryPoint("PUBLIC_CLIPS_GRID", 14);
            PUBLIC_CLIPS_GRID = creationEntryPoint15;
            CreationEntryPoint creationEntryPoint16 = new CreationEntryPoint("CLIPS_GRID_MUSIC", 15);
            CLIPS_GRID_MUSIC = creationEntryPoint16;
            CreationEntryPoint creationEntryPoint17 = new CreationEntryPoint("CLIPS_GRID_CHALLENGE", 16);
            CLIPS_GRID_CHALLENGE = creationEntryPoint17;
            CreationEntryPoint creationEntryPoint18 = new CreationEntryPoint("CLIPS_GRID_EFFECT", 17);
            CLIPS_GRID_EFFECT = creationEntryPoint18;
            CreationEntryPoint creationEntryPoint19 = new CreationEntryPoint("CLIPS_GRID_MASK", 18);
            CLIPS_GRID_MASK = creationEntryPoint19;
            CreationEntryPoint creationEntryPoint20 = new CreationEntryPoint("CLIPS_GRID_HASHTAG", 19);
            CLIPS_GRID_HASHTAG = creationEntryPoint20;
            CreationEntryPoint creationEntryPoint21 = new CreationEntryPoint("CLIPS_GRID_SOUND", 20);
            CLIPS_GRID_SOUND = creationEntryPoint21;
            CreationEntryPoint creationEntryPoint22 = new CreationEntryPoint("POPULAR_TEMPLATES_BLOCK", 21);
            POPULAR_TEMPLATES_BLOCK = creationEntryPoint22;
            CreationEntryPoint creationEntryPoint23 = new CreationEntryPoint("SWIPE", 22);
            SWIPE = creationEntryPoint23;
            CreationEntryPoint creationEntryPoint24 = new CreationEntryPoint("FEED_CLIPS_BLOCK", 23);
            FEED_CLIPS_BLOCK = creationEntryPoint24;
            CreationEntryPoint creationEntryPoint25 = new CreationEntryPoint("LINK", 24);
            LINK = creationEntryPoint25;
            CreationEntryPoint creationEntryPoint26 = new CreationEntryPoint("POSTING", 25);
            POSTING = creationEntryPoint26;
            CreationEntryPoint creationEntryPoint27 = new CreationEntryPoint("NAVBAR", 26);
            NAVBAR = creationEntryPoint27;
            CreationEntryPoint creationEntryPoint28 = new CreationEntryPoint("COMMUNITY", 27);
            COMMUNITY = creationEntryPoint28;
            CreationEntryPoint creationEntryPoint29 = new CreationEntryPoint("GROUP_WALL_BUTTON", 28);
            GROUP_WALL_BUTTON = creationEntryPoint29;
            CreationEntryPoint creationEntryPoint30 = new CreationEntryPoint("COMMUNITY_CREATION_ONBOARDING_BLOCK", 29);
            COMMUNITY_CREATION_ONBOARDING_BLOCK = creationEntryPoint30;
            CreationEntryPoint creationEntryPoint31 = new CreationEntryPoint("CREATE_CLIP_CUT", 30);
            CREATE_CLIP_CUT = creationEntryPoint31;
            CreationEntryPoint creationEntryPoint32 = new CreationEntryPoint("CREATE_CLIP_CUT_CROP", 31);
            CREATE_CLIP_CUT_CROP = creationEntryPoint32;
            CreationEntryPoint[] creationEntryPointArr = {creationEntryPoint, creationEntryPoint2, creationEntryPoint3, creationEntryPoint4, creationEntryPoint5, creationEntryPoint6, creationEntryPoint7, creationEntryPoint8, creationEntryPoint9, creationEntryPoint10, creationEntryPoint11, creationEntryPoint12, creationEntryPoint13, creationEntryPoint14, creationEntryPoint15, creationEntryPoint16, creationEntryPoint17, creationEntryPoint18, creationEntryPoint19, creationEntryPoint20, creationEntryPoint21, creationEntryPoint22, creationEntryPoint23, creationEntryPoint24, creationEntryPoint25, creationEntryPoint26, creationEntryPoint27, creationEntryPoint28, creationEntryPoint29, creationEntryPoint30, creationEntryPoint31, creationEntryPoint32};
            $VALUES = creationEntryPointArr;
            $ENTRIES = new asp(creationEntryPointArr);
        }

        private CreationEntryPoint(String str, int i) {
        }

        public static zrp<CreationEntryPoint> h() {
            return $ENTRIES;
        }

        public static CreationEntryPoint valueOf(String str) {
            return (CreationEntryPoint) Enum.valueOf(CreationEntryPoint.class, str);
        }

        public static CreationEntryPoint[] values() {
            return (CreationEntryPoint[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipsCreateContext(int i, CreationEntryPoint creationEntryPoint) {
        this.creationSessionId = i;
        this.creationEntryPoint = creationEntryPoint;
    }

    public final CreationEntryPoint a() {
        return this.creationEntryPoint;
    }

    public final int b() {
        return this.creationSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipsCreateContext)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = (MobileOfficialAppsClipsStat$ClipsCreateContext) obj;
        return this.creationSessionId == mobileOfficialAppsClipsStat$ClipsCreateContext.creationSessionId && this.creationEntryPoint == mobileOfficialAppsClipsStat$ClipsCreateContext.creationEntryPoint;
    }

    public final int hashCode() {
        return this.creationEntryPoint.hashCode() + (Integer.hashCode(this.creationSessionId) * 31);
    }

    public final String toString() {
        return "ClipsCreateContext(creationSessionId=" + this.creationSessionId + ", creationEntryPoint=" + this.creationEntryPoint + ')';
    }
}
