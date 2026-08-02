package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoOpenAuthorCabinet implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final String eventType;

    @pmi0("section")
    private final Section section;

    @pmi0("subsection")
    private final Subsection subsection;

    @pmi0("webview_platform")
    private final WebviewPlatform webviewPlatform;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class Section {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;

        @pmi0("cashout_welcome")
        public static final Section CASHOUT_WELCOME;

        @pmi0("video_analytics")
        public static final Section VIDEO_ANALYTICS;

        @pmi0("video_clip_analytics")
        public static final Section VIDEO_CLIP_ANALYTICS;

        @pmi0("video_community_settings")
        public static final Section VIDEO_COMMUNITY_SETTINGS;

        @pmi0("video_main")
        public static final Section VIDEO_MAIN;

        @pmi0("video_monetization")
        public static final Section VIDEO_MONETIZATION;

        @pmi0("video_my_content")
        public static final Section VIDEO_MY_CONTENT;

        @pmi0("video_video_analytics")
        public static final Section VIDEO_VIDEO_ANALYTICS;

        static {
            Section section = new Section("VIDEO_MAIN", 0);
            VIDEO_MAIN = section;
            Section section2 = new Section("VIDEO_MY_CONTENT", 1);
            VIDEO_MY_CONTENT = section2;
            Section section3 = new Section("VIDEO_ANALYTICS", 2);
            VIDEO_ANALYTICS = section3;
            Section section4 = new Section("VIDEO_MONETIZATION", 3);
            VIDEO_MONETIZATION = section4;
            Section section5 = new Section("VIDEO_COMMUNITY_SETTINGS", 4);
            VIDEO_COMMUNITY_SETTINGS = section5;
            Section section6 = new Section("CASHOUT_WELCOME", 5);
            CASHOUT_WELCOME = section6;
            Section section7 = new Section("VIDEO_VIDEO_ANALYTICS", 6);
            VIDEO_VIDEO_ANALYTICS = section7;
            Section section8 = new Section("VIDEO_CLIP_ANALYTICS", 7);
            VIDEO_CLIP_ANALYTICS = section8;
            Section[] sectionArr = {section, section2, section3, section4, section5, section6, section7, section8};
            $VALUES = sectionArr;
            $ENTRIES = new asp(sectionArr);
        }

        private Section(String str, int i) {
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class Subsection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subsection[] $VALUES;

        @pmi0("analytics_activity")
        public static final Subsection ANALYTICS_ACTIVITY;

        @pmi0("analytics_audience")
        public static final Subsection ANALYTICS_AUDIENCE;

        @pmi0("analytics_review")
        public static final Subsection ANALYTICS_REVIEW;

        @pmi0("clip_audience")
        public static final Subsection CLIP_AUDIENCE;

        @pmi0("clip_review")
        public static final Subsection CLIP_REVIEW;

        @pmi0("video_activity")
        public static final Subsection VIDEO_ACTIVITY;

        @pmi0("video_audience")
        public static final Subsection VIDEO_AUDIENCE;

        @pmi0("video_my_content_clips")
        public static final Subsection VIDEO_MY_CONTENT_CLIPS;

        @pmi0("video_my_content_playlists")
        public static final Subsection VIDEO_MY_CONTENT_PLAYLISTS;

        @pmi0("video_my_content_videos")
        public static final Subsection VIDEO_MY_CONTENT_VIDEOS;

        @pmi0("video_review")
        public static final Subsection VIDEO_REVIEW;

        static {
            Subsection subsection = new Subsection("VIDEO_MY_CONTENT_VIDEOS", 0);
            VIDEO_MY_CONTENT_VIDEOS = subsection;
            Subsection subsection2 = new Subsection("VIDEO_MY_CONTENT_CLIPS", 1);
            VIDEO_MY_CONTENT_CLIPS = subsection2;
            Subsection subsection3 = new Subsection("VIDEO_MY_CONTENT_PLAYLISTS", 2);
            VIDEO_MY_CONTENT_PLAYLISTS = subsection3;
            Subsection subsection4 = new Subsection("ANALYTICS_REVIEW", 3);
            ANALYTICS_REVIEW = subsection4;
            Subsection subsection5 = new Subsection("ANALYTICS_AUDIENCE", 4);
            ANALYTICS_AUDIENCE = subsection5;
            Subsection subsection6 = new Subsection("ANALYTICS_ACTIVITY", 5);
            ANALYTICS_ACTIVITY = subsection6;
            Subsection subsection7 = new Subsection("VIDEO_REVIEW", 6);
            VIDEO_REVIEW = subsection7;
            Subsection subsection8 = new Subsection("VIDEO_AUDIENCE", 7);
            VIDEO_AUDIENCE = subsection8;
            Subsection subsection9 = new Subsection("VIDEO_ACTIVITY", 8);
            VIDEO_ACTIVITY = subsection9;
            Subsection subsection10 = new Subsection("CLIP_REVIEW", 9);
            CLIP_REVIEW = subsection10;
            Subsection subsection11 = new Subsection("CLIP_AUDIENCE", 10);
            CLIP_AUDIENCE = subsection11;
            Subsection[] subsectionArr = {subsection, subsection2, subsection3, subsection4, subsection5, subsection6, subsection7, subsection8, subsection9, subsection10, subsection11};
            $VALUES = subsectionArr;
            $ENTRIES = new asp(subsectionArr);
        }

        private Subsection(String str, int i) {
        }

        public static Subsection valueOf(String str) {
            return (Subsection) Enum.valueOf(Subsection.class, str);
        }

        public static Subsection[] values() {
            return (Subsection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class WebviewPlatform {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WebviewPlatform[] $VALUES;

        @pmi0("mobile_web")
        public static final WebviewPlatform MOBILE_WEB;

        @pmi0("vk_video_android")
        public static final WebviewPlatform VK_VIDEO_ANDROID;

        @pmi0("vk_video_ios")
        public static final WebviewPlatform VK_VIDEO_IOS;

        static {
            WebviewPlatform webviewPlatform = new WebviewPlatform("VK_VIDEO_IOS", 0);
            VK_VIDEO_IOS = webviewPlatform;
            WebviewPlatform webviewPlatform2 = new WebviewPlatform("VK_VIDEO_ANDROID", 1);
            VK_VIDEO_ANDROID = webviewPlatform2;
            WebviewPlatform webviewPlatform3 = new WebviewPlatform("MOBILE_WEB", 2);
            MOBILE_WEB = webviewPlatform3;
            WebviewPlatform[] webviewPlatformArr = {webviewPlatform, webviewPlatform2, webviewPlatform3};
            $VALUES = webviewPlatformArr;
            $ENTRIES = new asp(webviewPlatformArr);
        }

        private WebviewPlatform(String str, int i) {
        }

        public static WebviewPlatform valueOf(String str) {
            return (WebviewPlatform) Enum.valueOf(WebviewPlatform.class, str);
        }

        public static WebviewPlatform[] values() {
            return (WebviewPlatform[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$TypeVideoOpenAuthorCabinet() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoOpenAuthorCabinet)) {
            return false;
        }
        CommonVideoStat$TypeVideoOpenAuthorCabinet commonVideoStat$TypeVideoOpenAuthorCabinet = (CommonVideoStat$TypeVideoOpenAuthorCabinet) obj;
        return epx.f(this.eventType, commonVideoStat$TypeVideoOpenAuthorCabinet.eventType) && this.section == commonVideoStat$TypeVideoOpenAuthorCabinet.section && this.subsection == commonVideoStat$TypeVideoOpenAuthorCabinet.subsection && this.webviewPlatform == commonVideoStat$TypeVideoOpenAuthorCabinet.webviewPlatform;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Section section = this.section;
        int hashCode2 = (hashCode + (section == null ? 0 : section.hashCode())) * 31;
        Subsection subsection = this.subsection;
        int hashCode3 = (hashCode2 + (subsection == null ? 0 : subsection.hashCode())) * 31;
        WebviewPlatform webviewPlatform = this.webviewPlatform;
        return hashCode3 + (webviewPlatform != null ? webviewPlatform.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoOpenAuthorCabinet(eventType=" + this.eventType + ", section=" + this.section + ", subsection=" + this.subsection + ", webviewPlatform=" + this.webviewPlatform + ')';
    }

    public CommonVideoStat$TypeVideoOpenAuthorCabinet(String str, Section section, Subsection subsection, WebviewPlatform webviewPlatform) {
        this.eventType = str;
        this.section = section;
        this.subsection = subsection;
        this.webviewPlatform = webviewPlatform;
    }

    public /* synthetic */ CommonVideoStat$TypeVideoOpenAuthorCabinet(String str, Section section, Subsection subsection, WebviewPlatform webviewPlatform, int i, zcl zclVar) {
        this((i & 1) != 0 ? "open_author_cabinet" : str, (i & 2) != 0 ? null : section, (i & 4) != 0 ? null : subsection, (i & 8) != 0 ? null : webviewPlatform);
    }
}
