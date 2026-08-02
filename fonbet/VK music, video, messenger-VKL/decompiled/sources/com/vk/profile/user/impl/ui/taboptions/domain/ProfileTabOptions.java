package com.vk.profile.user.impl.ui.taboptions.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.zcl;

/* compiled from: ProfileTabOptions.kt */
/* loaded from: classes5.dex */
public abstract class ProfileTabOptions implements Parcelable {
    public final int b;
    public final Integer c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* compiled from: ProfileTabOptions.kt */
    public static final class Article extends ProfileTabOptions {
        public static final Parcelable.Creator<Article> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Article> {
            @Override // android.os.Parcelable.Creator
            public final Article createFromParcel(Parcel parcel) {
                return new Article(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Article[] newArray(int i) {
                return new Article[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Article() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Article)) {
                return false;
            }
            Article article = (Article) obj;
            return this.h == article.h && this.i == article.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Article(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Article(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Article(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Article(boolean z, boolean z2) {
            super(R.string.profile_content_tab_article, null, Integer.valueOf(R.drawable.vk_icon_articles_outline_28), z, z2, false, 34, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Clip extends ProfileTabOptions {
        public static final Parcelable.Creator<Clip> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Clip> {
            @Override // android.os.Parcelable.Creator
            public final Clip createFromParcel(Parcel parcel) {
                return new Clip(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Clip[] newArray(int i) {
                return new Clip[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Clip() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clip)) {
                return false;
            }
            Clip clip = (Clip) obj;
            return this.h == clip.h && this.i == clip.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Clip(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clip(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Clip(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Clip(boolean z, boolean z2) {
            super(R.string.profile_content_tab_clips, null, Integer.valueOf(R.drawable.vk_icon_logo_clips_outline_28), z, false, false, 50, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class DefaultOptions extends ProfileTabOptions {
        public static final Parcelable.Creator<DefaultOptions> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<DefaultOptions> {
            @Override // android.os.Parcelable.Creator
            public final DefaultOptions createFromParcel(Parcel parcel) {
                return new DefaultOptions(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final DefaultOptions[] newArray(int i) {
                return new DefaultOptions[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DefaultOptions() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultOptions)) {
                return false;
            }
            DefaultOptions defaultOptions = (DefaultOptions) obj;
            return this.h == defaultOptions.h && this.i == defaultOptions.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new DefaultOptions(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DefaultOptions(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ DefaultOptions(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public DefaultOptions(boolean z, boolean z2) {
            super(R.string.user_profile_tab_pin_options_default, Integer.valueOf(R.string.user_profile_tab_pin_options_default_subtitle), Integer.valueOf(R.drawable.vk_icon_clock_outline_28), z, z2, false, 32, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Gift extends ProfileTabOptions {
        public static final Parcelable.Creator<Gift> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Gift> {
            @Override // android.os.Parcelable.Creator
            public final Gift createFromParcel(Parcel parcel) {
                return new Gift(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Gift[] newArray(int i) {
                return new Gift[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Gift() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gift)) {
                return false;
            }
            Gift gift = (Gift) obj;
            return this.h == gift.h && this.i == gift.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Gift(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gift(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Gift(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Gift(boolean z, boolean z2) {
            super(R.string.profile_content_tab_gifts, null, Integer.valueOf(R.drawable.vk_icon_gift_outline_28), z, z2, false, 34, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Music extends ProfileTabOptions {
        public static final Parcelable.Creator<Music> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Music> {
            @Override // android.os.Parcelable.Creator
            public final Music createFromParcel(Parcel parcel) {
                return new Music(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Music[] newArray(int i) {
                return new Music[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Music() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Music)) {
                return false;
            }
            Music music = (Music) obj;
            return this.h == music.h && this.i == music.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Music(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Music(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Music(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Music(boolean z, boolean z2) {
            super(R.string.profile_content_tab_music, null, Integer.valueOf(R.drawable.vk_icon_music_outline_28), z, z2, false, 34, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Narrative extends ProfileTabOptions {
        public static final Parcelable.Creator<Narrative> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Narrative> {
            @Override // android.os.Parcelable.Creator
            public final Narrative createFromParcel(Parcel parcel) {
                return new Narrative(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Narrative[] newArray(int i) {
                return new Narrative[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Narrative() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Narrative)) {
                return false;
            }
            Narrative narrative = (Narrative) obj;
            return this.h == narrative.h && this.i == narrative.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Narrative(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Narrative(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Narrative(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Narrative(boolean z, boolean z2) {
            super(R.string.profile_content_tab_narrative, Integer.valueOf(R.string.user_profile_tab_pin_options_only_mobile), Integer.valueOf(R.drawable.vk_icon_narrative_outline_28), z, z2, true, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Photo extends ProfileTabOptions {
        public static final Parcelable.Creator<Photo> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Photo> {
            @Override // android.os.Parcelable.Creator
            public final Photo createFromParcel(Parcel parcel) {
                return new Photo(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Photo[] newArray(int i) {
                return new Photo[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Photo() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) obj;
            return this.h == photo.h && this.i == photo.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Photo(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Photo(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Photo(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Photo(boolean z, boolean z2) {
            super(R.string.profile_content_tab_photo, null, Integer.valueOf(R.drawable.vk_icon_picture_outline_28), z, z2, false, 34, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Video extends ProfileTabOptions {
        public static final Parcelable.Creator<Video> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            public final Video createFromParcel(Parcel parcel) {
                return new Video(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Video[] newArray(int i) {
                return new Video[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Video() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return this.h == video.h && this.i == video.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Video(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Video(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Video(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Video(boolean z, boolean z2) {
            super(R.string.profile_content_tab_video, Integer.valueOf(R.string.user_profile_tab_pin_options_only_mobile), Integer.valueOf(R.drawable.vk_icon_logo_vk_video_outline_28), z, z2, true, null);
            this.h = z;
            this.i = z2;
        }
    }

    /* compiled from: ProfileTabOptions.kt */
    public static final class Wall extends ProfileTabOptions {
        public static final Parcelable.Creator<Wall> CREATOR = new a();
        public final boolean h;
        public final boolean i;

        /* compiled from: ProfileTabOptions.kt */
        public static final class a implements Parcelable.Creator<Wall> {
            @Override // android.os.Parcelable.Creator
            public final Wall createFromParcel(Parcel parcel) {
                return new Wall(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Wall[] newArray(int i) {
                return new Wall[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Wall() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean d() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final boolean e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Wall)) {
                return false;
            }
            Wall wall = (Wall) obj;
            return this.h == wall.h && this.i == wall.i;
        }

        @Override // com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions
        public final ProfileTabOptions f(boolean z) {
            return new Wall(z, this.i);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Wall(pinned=");
            sb.append(this.h);
            sb.append(", locked=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ Wall(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public Wall(boolean z, boolean z2) {
            super(R.string.profile_content_tab_wall, Integer.valueOf(R.string.user_profile_tab_pin_options_only_mobile), Integer.valueOf(R.drawable.vk_icon_article_outline_28), z, z2, true, null);
            this.h = z;
            this.i = z2;
        }
    }

    public /* synthetic */ ProfileTabOptions(int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, num2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, null);
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.e;
    }

    public abstract ProfileTabOptions f(boolean z);

    public ProfileTabOptions(int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, zcl zclVar) {
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }
}
