package com.vk.clips.sdk.stats.pixels.models;

import com.vk.core.serialize.Serializer;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.ji0;
import xsna.msy;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdStatPixel.kt */
/* loaded from: classes17.dex */
public abstract class AdStatPixel extends Serializer.StreamParcelableAdapter {
    public final Object b;

    /* compiled from: AdStatPixel.kt */
    public static final class ClickDeeplink extends AdStatPixel {
        public static final Serializer.c<ClickDeeplink> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickDeeplink> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickDeeplink a(Serializer serializer) {
                return new ClickDeeplink(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickDeeplink[i];
            }
        }

        public ClickDeeplink(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_DEEPLINK;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickDeeplink) && epx.f(this.c, ((ClickDeeplink) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickDeeplink(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnAction extends AdStatPixel {
        public static final Serializer.c<ClickOnAction> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnAction> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnAction a(Serializer serializer) {
                return new ClickOnAction(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnAction[i];
            }
        }

        public ClickOnAction(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_ACTION;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnAction) && epx.f(this.c, ((ClickOnAction) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnAction(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnAuthor extends AdStatPixel {
        public static final Serializer.c<ClickOnAuthor> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnAuthor> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnAuthor a(Serializer serializer) {
                return new ClickOnAuthor(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnAuthor[i];
            }
        }

        public ClickOnAuthor(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_AUTHOR;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnAuthor) && epx.f(this.c, ((ClickOnAuthor) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnAuthor(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnComments extends AdStatPixel {
        public static final Serializer.c<ClickOnComments> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnComments> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnComments a(Serializer serializer) {
                return new ClickOnComments(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnComments[i];
            }
        }

        public ClickOnComments(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_COMMENTS;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnComments) && epx.f(this.c, ((ClickOnComments) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnComments(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnFavorite extends AdStatPixel {
        public static final Serializer.c<ClickOnFavorite> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnFavorite> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnFavorite a(Serializer serializer) {
                return new ClickOnFavorite(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnFavorite[i];
            }
        }

        public ClickOnFavorite(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_FAVORITE;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnFavorite) && epx.f(this.c, ((ClickOnFavorite) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnFavorite(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnLike extends AdStatPixel {
        public static final Serializer.c<ClickOnLike> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnLike> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnLike a(Serializer serializer) {
                return new ClickOnLike(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnLike[i];
            }
        }

        public ClickOnLike(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_LIKE;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnLike) && epx.f(this.c, ((ClickOnLike) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnLike(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnShare extends AdStatPixel {
        public static final Serializer.c<ClickOnShare> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnShare> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnShare a(Serializer serializer) {
                return new ClickOnShare(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnShare[i];
            }
        }

        public ClickOnShare(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_SHARE;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnShare) && epx.f(this.c, ((ClickOnShare) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnShare(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClickOnSubscribe extends AdStatPixel {
        public static final Serializer.c<ClickOnSubscribe> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClickOnSubscribe> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClickOnSubscribe a(Serializer serializer) {
                return new ClickOnSubscribe(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClickOnSubscribe[i];
            }
        }

        public ClickOnSubscribe(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLICK_ON_SUBSCRIBE;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickOnSubscribe) && epx.f(this.c, ((ClickOnSubscribe) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickOnSubscribe(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ClosedByUser extends AdStatPixel implements a {
        public static final Serializer.c<ClosedByUser> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ClosedByUser> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ClosedByUser a(Serializer serializer) {
                return new ClosedByUser(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClosedByUser[i];
            }
        }

        public ClosedByUser(String str) {
            super(null);
            this.c = str;
            this.d = Type.CLOSED_BY_USER;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClosedByUser) && epx.f(this.c, ((ClosedByUser) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClosedByUser(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class Impression extends AdStatPixel implements a {
        public static final Serializer.c<Impression> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Impression> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Impression a(Serializer serializer) {
                return new Impression(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Impression[i];
            }
        }

        public Impression(String str) {
            super(null);
            this.c = str;
            this.d = Type.IMPRESSION;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Impression) && epx.f(this.c, ((Impression) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Impression(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static abstract class Position extends Serializer.StreamParcelableAdapter {

        /* compiled from: AdStatPixel.kt */
        public static final class Percent extends Position {
            public static final Serializer.c<Percent> CREATOR = new a();
            public final int b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Percent> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Percent a(Serializer serializer) {
                    return new Percent(serializer.u());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Percent[i];
                }
            }

            public Percent(int i) {
                super(null);
                this.b = i;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.S(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Percent) && this.b == ((Percent) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Percent(positionPercent="), this.b, ')');
            }
        }

        /* compiled from: AdStatPixel.kt */
        public static final class Time extends Position {
            public static final Serializer.c<Time> CREATOR = new a();
            public final int b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Time> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Time a(Serializer serializer) {
                    return new Time(serializer.u());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Time[i];
                }
            }

            public Time(int i) {
                super(null);
                this.b = i;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.S(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Time) && this.b == ((Time) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Time(positionSec="), this.b, ')');
            }
        }

        public /* synthetic */ Position(zcl zclVar) {
            this();
        }

        public Position() {
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class Render extends AdStatPixel implements a {
        public static final Serializer.c<Render> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Render> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Render a(Serializer serializer) {
                return new Render(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Render[i];
            }
        }

        public Render(String str) {
            super(null);
            this.c = str;
            this.d = Type.RENDER;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Render) && epx.f(this.c, ((Render) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Render(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdStatPixel.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CLICK_DEEPLINK;
        public static final Type CLICK_ON_ACTION;
        public static final Type CLICK_ON_AUTHOR;
        public static final Type CLICK_ON_COMMENTS;
        public static final Type CLICK_ON_FAVORITE;
        public static final Type CLICK_ON_LIKE;
        public static final Type CLICK_ON_SHARE;
        public static final Type CLICK_ON_SUBSCRIBE;
        public static final Type CLOSED_BY_USER;
        public static final Type IMPRESSION;
        public static final Type RENDER;
        public static final Type VIDEO_COMPLETED;
        public static final Type VIDEO_ERROR;
        public static final Type VIDEO_FULLSCREEN_OFF;
        public static final Type VIDEO_FULLSCREEN_ON;
        public static final Type VIDEO_PAUSED;
        public static final Type VIDEO_POSITION_REACHED;
        public static final Type VIDEO_RESUMED;
        public static final Type VIDEO_STARTED;
        public static final Type VIDEO_VIEWABILITY_AT_POSITION;
        public static final Type VIDEO_VIEWABILITY_DURATION;
        public static final Type VIDEO_VOLUME_OFF;
        public static final Type VIDEO_VOLUME_ON;
        public static final Type VIEWABILITY_DURATION;
        public static final Type VIEWABILITY_MEASURABLE;
        public static final Type VIEW_IN;

        static {
            Type type = new Type("RENDER", 0);
            RENDER = type;
            Type type2 = new Type("VIEWABILITY_MEASURABLE", 1);
            VIEWABILITY_MEASURABLE = type2;
            Type type3 = new Type("VIEWABILITY_DURATION", 2);
            VIEWABILITY_DURATION = type3;
            Type type4 = new Type("VIEW_IN", 3);
            VIEW_IN = type4;
            Type type5 = new Type("CLICK_ON_ACTION", 4);
            CLICK_ON_ACTION = type5;
            Type type6 = new Type("CLICK_DEEPLINK", 5);
            CLICK_DEEPLINK = type6;
            Type type7 = new Type("CLICK_ON_AUTHOR", 6);
            CLICK_ON_AUTHOR = type7;
            Type type8 = new Type("CLICK_ON_SHARE", 7);
            CLICK_ON_SHARE = type8;
            Type type9 = new Type("CLICK_ON_COMMENTS", 8);
            CLICK_ON_COMMENTS = type9;
            Type type10 = new Type("CLICK_ON_SUBSCRIBE", 9);
            CLICK_ON_SUBSCRIBE = type10;
            Type type11 = new Type("CLICK_ON_LIKE", 10);
            CLICK_ON_LIKE = type11;
            Type type12 = new Type("CLICK_ON_FAVORITE", 11);
            CLICK_ON_FAVORITE = type12;
            Type type13 = new Type("CLOSED_BY_USER", 12);
            CLOSED_BY_USER = type13;
            Type type14 = new Type("IMPRESSION", 13);
            IMPRESSION = type14;
            Type type15 = new Type("VIDEO_STARTED", 14);
            VIDEO_STARTED = type15;
            Type type16 = new Type("VIDEO_COMPLETED", 15);
            VIDEO_COMPLETED = type16;
            Type type17 = new Type("VIDEO_RESUMED", 16);
            VIDEO_RESUMED = type17;
            Type type18 = new Type("VIDEO_PAUSED", 17);
            VIDEO_PAUSED = type18;
            Type type19 = new Type("VIDEO_POSITION_REACHED", 18);
            VIDEO_POSITION_REACHED = type19;
            Type type20 = new Type("VIDEO_VIEWABILITY_DURATION", 19);
            VIDEO_VIEWABILITY_DURATION = type20;
            Type type21 = new Type("VIDEO_VIEWABILITY_AT_POSITION", 20);
            VIDEO_VIEWABILITY_AT_POSITION = type21;
            Type type22 = new Type("VIDEO_VOLUME_ON", 21);
            VIDEO_VOLUME_ON = type22;
            Type type23 = new Type("VIDEO_VOLUME_OFF", 22);
            VIDEO_VOLUME_OFF = type23;
            Type type24 = new Type("VIDEO_FULLSCREEN_ON", 23);
            VIDEO_FULLSCREEN_ON = type24;
            Type type25 = new Type("VIDEO_FULLSCREEN_OFF", 24);
            VIDEO_FULLSCREEN_OFF = type25;
            Type type26 = new Type("VIDEO_ERROR", 25);
            VIDEO_ERROR = type26;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoCompleted extends AdStatPixel implements b, a {
        public static final Serializer.c<VideoCompleted> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoCompleted> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoCompleted a(Serializer serializer) {
                return new VideoCompleted(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoCompleted[i];
            }
        }

        public VideoCompleted(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_COMPLETED;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoCompleted) && epx.f(this.c, ((VideoCompleted) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoCompleted(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoError extends AdStatPixel implements b, a {
        public static final Serializer.c<VideoError> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoError> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoError a(Serializer serializer) {
                return new VideoError(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoError[i];
            }
        }

        public VideoError(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_ERROR;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoError) && epx.f(this.c, ((VideoError) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoError(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoFullscreenOff extends AdStatPixel implements b {
        public static final Serializer.c<VideoFullscreenOff> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoFullscreenOff> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoFullscreenOff a(Serializer serializer) {
                return new VideoFullscreenOff(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoFullscreenOff[i];
            }
        }

        public VideoFullscreenOff(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_FULLSCREEN_OFF;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoFullscreenOff) && epx.f(this.c, ((VideoFullscreenOff) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoFullscreenOff(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoFullscreenOn extends AdStatPixel implements b {
        public static final Serializer.c<VideoFullscreenOn> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoFullscreenOn> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoFullscreenOn a(Serializer serializer) {
                return new VideoFullscreenOn(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoFullscreenOn[i];
            }
        }

        public VideoFullscreenOn(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_FULLSCREEN_ON;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoFullscreenOn) && epx.f(this.c, ((VideoFullscreenOn) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoFullscreenOn(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoPaused extends AdStatPixel implements b {
        public static final Serializer.c<VideoPaused> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoPaused> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoPaused a(Serializer serializer) {
                return new VideoPaused(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoPaused[i];
            }
        }

        public VideoPaused(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_PAUSED;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoPaused) && epx.f(this.c, ((VideoPaused) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoPaused(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoPositionReached extends AdStatPixel implements b, a {
        public static final Serializer.c<VideoPositionReached> CREATOR = new a();
        public final String c;
        public final Position d;
        public final Type e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoPositionReached> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoPositionReached a(Serializer serializer) {
                return new VideoPositionReached(serializer.H(), (Position) serializer.G(Position.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoPositionReached[i];
            }
        }

        public VideoPositionReached(String str, Position position) {
            super(null);
            this.c = str;
            this.d = position;
            this.e = Type.VIDEO_POSITION_REACHED;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.i0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoPositionReached)) {
                return false;
            }
            VideoPositionReached videoPositionReached = (VideoPositionReached) obj;
            return epx.f(this.c, videoPositionReached.c) && epx.f(this.d, videoPositionReached.d);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "VideoPositionReached(url=" + this.c + ", position=" + this.d + ')';
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.e;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoResumed extends AdStatPixel implements b {
        public static final Serializer.c<VideoResumed> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoResumed> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoResumed a(Serializer serializer) {
                return new VideoResumed(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoResumed[i];
            }
        }

        public VideoResumed(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_RESUMED;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoResumed) && epx.f(this.c, ((VideoResumed) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoResumed(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoStarted extends AdStatPixel implements b, a {
        public static final Serializer.c<VideoStarted> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoStarted> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoStarted a(Serializer serializer) {
                return new VideoStarted(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoStarted[i];
            }
        }

        public VideoStarted(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_STARTED;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoStarted) && epx.f(this.c, ((VideoStarted) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoStarted(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoViewabilityAtPosition extends AdStatPixel implements b, a {
        public static final Serializer.c<VideoViewabilityAtPosition> CREATOR = new a();
        public final String c;
        public final int d;
        public final boolean e;
        public final Position f;
        public final Type g;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoViewabilityAtPosition> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoViewabilityAtPosition a(Serializer serializer) {
                return new VideoViewabilityAtPosition(serializer.H(), serializer.u(), serializer.m(), (Position) serializer.G(Position.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoViewabilityAtPosition[i];
            }
        }

        public VideoViewabilityAtPosition(String str, int i, boolean z, Position position) {
            super(null);
            this.c = str;
            this.d = i;
            this.e = z;
            this.f = position;
            this.g = Type.VIDEO_VIEWABILITY_AT_POSITION;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.S(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
            serializer.i0(this.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoViewabilityAtPosition)) {
                return false;
            }
            VideoViewabilityAtPosition videoViewabilityAtPosition = (VideoViewabilityAtPosition) obj;
            return epx.f(this.c, videoViewabilityAtPosition.c) && this.d == videoViewabilityAtPosition.d && this.e == videoViewabilityAtPosition.e && epx.f(this.f, videoViewabilityAtPosition.f);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b(shy.a(this.d, this.c.hashCode() * 31, 31), 31, this.e);
        }

        public final String toString() {
            return "VideoViewabilityAtPosition(url=" + this.c + ", viewablePercent=" + this.d + ", visible=" + this.e + ", position=" + this.f + ')';
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.g;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoViewabilityDuration extends AdStatPixel implements b, a {
        public static final Serializer.c<VideoViewabilityDuration> CREATOR = new a();
        public final String c;
        public final int d;
        public final int e;
        public final Type f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoViewabilityDuration> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoViewabilityDuration a(Serializer serializer) {
                return new VideoViewabilityDuration(serializer.H(), serializer.u(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoViewabilityDuration[i];
            }
        }

        public VideoViewabilityDuration(String str, int i, int i2) {
            super(null);
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = Type.VIDEO_VIEWABILITY_DURATION;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.S(this.d);
            serializer.S(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoViewabilityDuration)) {
                return false;
            }
            VideoViewabilityDuration videoViewabilityDuration = (VideoViewabilityDuration) obj;
            return epx.f(this.c, videoViewabilityDuration.c) && this.d == videoViewabilityDuration.d && this.e == videoViewabilityDuration.e;
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoViewabilityDuration(url=");
            sb.append(this.c);
            sb.append(", viewablePercent=");
            sb.append(this.d);
            sb.append(", duration=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.f;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoVolumeOff extends AdStatPixel implements b {
        public static final Serializer.c<VideoVolumeOff> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoVolumeOff> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoVolumeOff a(Serializer serializer) {
                return new VideoVolumeOff(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoVolumeOff[i];
            }
        }

        public VideoVolumeOff(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_VOLUME_OFF;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoVolumeOff) && epx.f(this.c, ((VideoVolumeOff) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoVolumeOff(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class VideoVolumeOn extends AdStatPixel implements b {
        public static final Serializer.c<VideoVolumeOn> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VideoVolumeOn> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VideoVolumeOn a(Serializer serializer) {
                return new VideoVolumeOn(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoVolumeOn[i];
            }
        }

        public VideoVolumeOn(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIDEO_VOLUME_ON;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoVolumeOn) && epx.f(this.c, ((VideoVolumeOn) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoVolumeOn(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ViewIn extends AdStatPixel implements a {
        public static final Serializer.c<ViewIn> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ViewIn> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ViewIn a(Serializer serializer) {
                return new ViewIn(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewIn[i];
            }
        }

        public ViewIn(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIEW_IN;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewIn) && epx.f(this.c, ((ViewIn) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ViewIn(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ViewabilityDuration extends AdStatPixel implements a {
        public static final Serializer.c<ViewabilityDuration> CREATOR = new a();
        public final String c;
        public final int d;
        public final int e;
        public final Type f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ViewabilityDuration> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ViewabilityDuration a(Serializer serializer) {
                return new ViewabilityDuration(serializer.H(), serializer.u(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewabilityDuration[i];
            }
        }

        public ViewabilityDuration(String str, int i, int i2) {
            super(null);
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = Type.VIEWABILITY_DURATION;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.S(this.d);
            serializer.S(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewabilityDuration)) {
                return false;
            }
            ViewabilityDuration viewabilityDuration = (ViewabilityDuration) obj;
            return epx.f(this.c, viewabilityDuration.c) && this.d == viewabilityDuration.d && this.e == viewabilityDuration.e;
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewabilityDuration(url=");
            sb.append(this.c);
            sb.append(", viewablePercent=");
            sb.append(this.d);
            sb.append(", duration=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.f;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public static final class ViewabilityMeasurable extends AdStatPixel implements a {
        public static final Serializer.c<ViewabilityMeasurable> CREATOR = new a();
        public final String c;
        public final Type d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ViewabilityMeasurable> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ViewabilityMeasurable a(Serializer serializer) {
                return new ViewabilityMeasurable(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewabilityMeasurable[i];
            }
        }

        public ViewabilityMeasurable(String str) {
            super(null);
            this.c = str;
            this.d = Type.VIEWABILITY_MEASURABLE;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewabilityMeasurable) && epx.f(this.c, ((ViewabilityMeasurable) obj).c);
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ViewabilityMeasurable(url="), this.c, ')');
        }

        @Override // com.vk.clips.sdk.stats.pixels.models.AdStatPixel
        public final Type zb() {
            return this.d;
        }
    }

    /* compiled from: AdStatPixel.kt */
    public interface a {
    }

    /* compiled from: AdStatPixel.kt */
    public interface b {
    }

    public /* synthetic */ AdStatPixel(zcl zclVar) {
        this();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final UUID Ab() {
        return (UUID) this.b.getValue();
    }

    public abstract String getUrl();

    public abstract Type zb();

    public AdStatPixel() {
        this.b = msy.a(LazyThreadSafetyMode.PUBLICATION, new ji0(this, 0));
    }
}
