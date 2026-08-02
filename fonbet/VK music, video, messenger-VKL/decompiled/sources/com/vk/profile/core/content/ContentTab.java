package com.vk.profile.core.content;

import com.vk.dto.profile.ProfilePrivacy$Category;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vkontakte.android.R;
import java.io.Serializable;
import xsna.ksn0;

/* compiled from: ContentTab.kt */
/* loaded from: classes5.dex */
public abstract class ContentTab implements ksn0, Serializable {
    private final int drawableRes;
    private final ProfilePrivacy$Category privacy;
    private final Integer rightIconRes = null;
    private final Integer titleRes;

    /* compiled from: ContentTab.kt */
    public static final class Archive extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Archive(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_archive), R.drawable.vk_icon_article_box_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Article extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Article() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Article)) {
                return false;
            }
            Article article = (Article) obj;
            return this.pinned == article.pinned && this.privacy == article.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Article(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Article(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_article), R.drawable.vk_icon_articles_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Chat extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Chat() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chat)) {
                return false;
            }
            Chat chat = (Chat) obj;
            return this.pinned == chat.pinned && this.privacy == chat.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Chat(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Chat(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_chats), R.drawable.vk_icon_messages_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Clip extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Clip() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clip)) {
                return false;
            }
            Clip clip = (Clip) obj;
            return this.pinned == clip.pinned && this.privacy == clip.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Clip(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Clip(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_clips), R.drawable.vk_icon_logo_clips_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Discussion extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Discussion() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discussion)) {
                return false;
            }
            Discussion discussion = (Discussion) obj;
            return this.pinned == discussion.pinned && this.privacy == discussion.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Discussion(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Discussion(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_discussion), R.drawable.vk_icon_comment_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Document extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Document() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Document)) {
                return false;
            }
            Document document = (Document) obj;
            return this.pinned == document.pinned && this.privacy == document.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Document(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Document(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_document), R.drawable.vk_icon_document_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class DonutWall extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DonutWall() {
            super(Integer.valueOf(R.string.profile_content_tab_vk_donut), R.drawable.vk_icon_donut_outline_20, r0);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Event extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Event() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return this.pinned == event.pinned && this.privacy == event.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Event(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Event(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_event), R.drawable.vk_icon_calendar_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Gift extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Gift() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gift)) {
                return false;
            }
            Gift gift = (Gift) obj;
            return this.pinned == gift.pinned && this.privacy == gift.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Gift(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Gift(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_gifts), R.drawable.vk_icon_gift_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Goods extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Goods() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Goods)) {
                return false;
            }
            Goods goods = (Goods) obj;
            return this.pinned == goods.pinned && this.privacy == goods.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Goods(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Goods(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_goods), R.drawable.vk_icon_market_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class MainWall extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public MainWall() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainWall)) {
                return false;
            }
            MainWall mainWall = (MainWall) obj;
            return this.pinned == mainWall.pinned && this.privacy == mainWall.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "MainWall(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MainWall(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_main_wall), R.drawable.vk_icon_article_box_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Music extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Music() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Music)) {
                return false;
            }
            Music music = (Music) obj;
            return this.pinned == music.pinned && this.privacy == music.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Music(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Music(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_music), R.drawable.vk_icon_music_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Narrative extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Narrative() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Narrative)) {
                return false;
            }
            Narrative narrative = (Narrative) obj;
            return this.pinned == narrative.pinned && this.privacy == narrative.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Narrative(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Narrative(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_narrative), R.drawable.vk_icon_narrative_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Options extends ContentTab {
        public static final Options b = new Options();

        private Options() {
            super(null, R.drawable.vk_icon_gear_outline_24, ProfilePrivacy$Category.ONLY_ME);
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Photo extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Photo() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) obj;
            return this.pinned == photo.pinned && this.privacy == photo.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Photo(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Photo(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_photo), R.drawable.vk_icon_picture_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Podcast extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Podcast() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Podcast)) {
                return false;
            }
            Podcast podcast = (Podcast) obj;
            return this.pinned == podcast.pinned && this.privacy == podcast.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Podcast(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Podcast(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_podcast), R.drawable.vk_icon_podcast_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Service extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Service() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Service)) {
                return false;
            }
            Service service = (Service) obj;
            return this.pinned == service.pinned && this.privacy == service.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Service(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Service(int i) {
            super(Integer.valueOf(R.string.profile_content_tab_services), R.drawable.vk_icon_notebook_check_outline_20, r3);
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = false;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Video extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Video() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return this.pinned == video.pinned && this.privacy == video.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Video(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Video(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_video), R.drawable.vk_icon_video_square_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    /* compiled from: ContentTab.kt */
    public static final class Wall extends ContentTab {
        private final boolean pinned;
        private final ProfilePrivacy$Category privacy;

        public Wall() {
            this(false, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Wall)) {
                return false;
            }
            Wall wall = (Wall) obj;
            return this.pinned == wall.pinned && this.privacy == wall.privacy;
        }

        public final int hashCode() {
            return this.privacy.hashCode() + (Boolean.hashCode(this.pinned) * 31);
        }

        public final String toString() {
            return "Wall(pinned=" + this.pinned + ", privacy=" + this.privacy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Wall(boolean z, int i) {
            super(Integer.valueOf(R.string.profile_content_tab_wall), R.drawable.vk_icon_article_box_outline_20, r4);
            z = (i & 1) != 0 ? false : z;
            ProfilePrivacy$Category profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            this.pinned = z;
            this.privacy = profilePrivacy$Category;
        }
    }

    public ContentTab(Integer num, int i, ProfilePrivacy$Category profilePrivacy$Category) {
        this.titleRes = num;
        this.drawableRes = i;
        this.privacy = profilePrivacy$Category;
    }

    public static CommonCommunitiesStat$TypeTabContentType a(ContentTab contentTab) {
        if (contentTab instanceof Article) {
            return CommonCommunitiesStat$TypeTabContentType.ARTICLES;
        }
        if (contentTab instanceof Music) {
            return CommonCommunitiesStat$TypeTabContentType.AUDIOS_PLAYLISTS;
        }
        if (contentTab instanceof Chat) {
            return CommonCommunitiesStat$TypeTabContentType.CHATS;
        }
        if (contentTab instanceof Clip) {
            return CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS;
        }
        if (contentTab instanceof Discussion) {
            return CommonCommunitiesStat$TypeTabContentType.DISCUSSIONS;
        }
        if (contentTab instanceof Document) {
            return CommonCommunitiesStat$TypeTabContentType.FILES;
        }
        if (contentTab instanceof DonutWall) {
            return CommonCommunitiesStat$TypeTabContentType.DONUT_WALL;
        }
        if (contentTab instanceof Narrative) {
            return CommonCommunitiesStat$TypeTabContentType.NARRATIVES;
        }
        if (contentTab instanceof Photo) {
            return CommonCommunitiesStat$TypeTabContentType.PHOTOS;
        }
        if (contentTab instanceof Podcast) {
            return CommonCommunitiesStat$TypeTabContentType.PODCASTS;
        }
        if (contentTab instanceof Video) {
            return CommonCommunitiesStat$TypeTabContentType.VIDEOS;
        }
        if (contentTab instanceof Wall) {
            return CommonCommunitiesStat$TypeTabContentType.WALL;
        }
        if (contentTab instanceof MainWall) {
            return CommonCommunitiesStat$TypeTabContentType.MAIN;
        }
        if (contentTab instanceof Goods) {
            return CommonCommunitiesStat$TypeTabContentType.MARKET;
        }
        if (contentTab instanceof Service) {
            return CommonCommunitiesStat$TypeTabContentType.SERVICES;
        }
        if (contentTab instanceof Event) {
            return CommonCommunitiesStat$TypeTabContentType.EVENTS;
        }
        throw new IllegalStateException("Unsupported tab = " + contentTab);
    }

    @Override // xsna.ksn0
    public final Integer d() {
        return this.titleRes;
    }

    @Override // xsna.ksn0
    public final Integer g() {
        return this.rightIconRes;
    }

    @Override // xsna.ksn0
    public final Integer h() {
        return Integer.valueOf(this.drawableRes);
    }
}
