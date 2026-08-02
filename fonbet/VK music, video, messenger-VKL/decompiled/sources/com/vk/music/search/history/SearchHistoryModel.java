package com.vk.music.search.history;

import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.zrp;

/* compiled from: SearchHistoryModel.kt */
/* loaded from: classes3.dex */
public interface SearchHistoryModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHistoryModel.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Album;
        public static final Type Artist;
        public static final Type AudioBook;
        public static final a Companion;
        public static final Type Curator;
        public static final Type Playlist;
        public static final Type Podcast;
        public static final Type RadioStation;
        public static final Type Track;
        public static final Type TrackLyrics;
        public static final Type Video;
        private final String value;

        /* compiled from: SearchHistoryModel.kt */
        public static final class a {
        }

        static {
            Type type = new Type("Track", 0, "Track");
            Track = type;
            Type type2 = new Type("TrackLyrics", 1, "TrackLyrics");
            TrackLyrics = type2;
            Type type3 = new Type("Artist", 2, "Artist");
            Artist = type3;
            Type type4 = new Type("Curator", 3, "Curator");
            Curator = type4;
            Type type5 = new Type("Podcast", 4, "Podcast");
            Podcast = type5;
            Type type6 = new Type("AudioBook", 5, "AudioBook");
            AudioBook = type6;
            Type type7 = new Type("Album", 6, "Album");
            Album = type7;
            Type type8 = new Type("Playlist", 7, "Playlist");
            Playlist = type8;
            Type type9 = new Type("RadioStation", 8, "RadioStation");
            RadioStation = type9;
            Type type10 = new Type("Video", 9, "Video");
            Video = type10;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    String getId();

    Type getType();

    UserId q();
}
