package com.vk.dto.music;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.c;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.s3q0;

@Deprecated
/* loaded from: classes18.dex */
public class Section extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Section> CREATOR = new a();
    public final String b;
    public final Type c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    @Nullable
    public final ArrayList<Playlist> h;

    @Nullable
    public final ArrayList<MusicTrack> i;

    @Nullable
    public final ArrayList<SearchSuggestion> j;

    @Nullable
    public final ArrayList<Thumb> k;

    @Nullable
    public final Artist l;

    @Nullable
    public final ArrayList<CustomImage> m;

    @Nullable
    public final String n;

    @Nullable
    public final ArrayList<VideoFile> o;
    public final int p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type artist;
        public static final Type artist_awards;
        public static final Type artist_videos;
        public static final Type audios;
        public static final Type audios_list;
        public static final Type audios_special;
        public static final Type custom_image_big;
        public static final Type custom_image_large;
        public static final Type custom_image_small;
        public static final Type fake_audio;
        public static final Type fake_audio_header;
        public static final Type playlists;
        public static final Type single_playlist;
        public static final Type suggestions_smart;
        public static final Type top_audios;
        public static final Type unknown;
        public static final Type videos;

        static {
            Type type = new Type("audios", 0);
            audios = type;
            Type type2 = new Type("playlists", 1);
            playlists = type2;
            Type type3 = new Type("audios_special", 2);
            audios_special = type3;
            Type type4 = new Type("artist", 3);
            artist = type4;
            Type type5 = new Type("suggestions_smart", 4);
            suggestions_smart = type5;
            Type type6 = new Type("custom_image_big", 5);
            custom_image_big = type6;
            Type type7 = new Type("custom_image_small", 6);
            custom_image_small = type7;
            Type type8 = new Type("single_playlist", 7);
            single_playlist = type8;
            Type type9 = new Type("audios_list", 8);
            audios_list = type9;
            Type type10 = new Type("fake_audio", 9);
            fake_audio = type10;
            Type type11 = new Type("fake_audio_header", 10);
            fake_audio_header = type11;
            Type type12 = new Type("top_audios", 11);
            top_audios = type12;
            Type type13 = new Type("artist_awards", 12);
            artist_awards = type13;
            Type type14 = new Type("videos", 13);
            videos = type14;
            Type type15 = new Type("artist_videos", 14);
            artist_videos = type15;
            Type type16 = new Type("custom_image_large", 15);
            custom_image_large = type16;
            Type type17 = new Type("unknown", 16);
            unknown = type17;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17};
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

    public class a extends Serializer.c<Section> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Section a(@NonNull Serializer serializer) {
            return new Section(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Section[i];
        }
    }

    public class b extends aay<Section> {
        @Override // xsna.aay
        public final Section a(@NonNull JSONObject jSONObject) throws JSONException {
            return new Section(jSONObject);
        }
    }

    static {
        new b();
    }

    public Section(@NonNull JSONObject jSONObject) {
        Type type;
        ArrayList<Playlist> arrayList;
        ArrayList<Thumb> arrayList2;
        this.b = jSONObject.optString("id");
        try {
            type = Type.valueOf(jSONObject.optString("type"));
        } catch (Exception unused) {
            type = Type.unknown;
        }
        this.c = type;
        this.d = jSONObject.optString("title");
        this.e = jSONObject.optString("subtitle");
        this.g = jSONObject.optInt("count");
        this.f = jSONObject.optString("source");
        ArrayList<VideoFile> arrayList3 = null;
        this.n = jSONObject.optString("next_from", null);
        if (jSONObject.has("playlist")) {
            try {
                arrayList = new ArrayList<>();
                arrayList.add(new Playlist(jSONObject.getJSONObject("playlist")));
            } catch (JSONException unused2) {
            }
        } else {
            Playlist.b bVar = Playlist.Q;
            JSONArray optJSONArray = jSONObject.optJSONArray("playlists");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList<Playlist> arrayList4 = new ArrayList<>(length);
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        try {
                            bVar.getClass();
                            arrayList4.add(new Playlist(optJSONObject));
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
                arrayList = arrayList4;
            }
            arrayList = null;
        }
        this.h = arrayList;
        this.m = aay.a.a(jSONObject, "items", CustomImage.g);
        this.i = aay.a.a(jSONObject, "audios", MusicTrack.e0);
        this.j = aay.a.a(jSONObject, "suggestions", SearchSuggestion.l);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("thumbs");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            arrayList2 = new ArrayList<>(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    try {
                        arrayList2.add((Thumb) Thumb.f.a(optJSONObject2));
                    } catch (JSONException e2) {
                        L.i(e2);
                    }
                }
            }
        } else {
            arrayList2 = null;
        }
        this.k = arrayList2;
        Type type2 = this.c;
        this.l = type2.equals(Type.artist) ? new Artist(jSONObject.optJSONObject(type2.name())) : null;
        this.p = 0;
        VideoFileOld.a aVar = VideoFileOld.z1;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("videos");
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            ArrayList<VideoFile> arrayList5 = new ArrayList<>(length3);
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    try {
                        aVar.getClass();
                        arrayList5.add(c.b(optJSONObject3));
                    } catch (Exception e3) {
                        L.i(e3);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                }
            }
            arrayList3 = arrayList5;
        }
        this.o = arrayList3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.name());
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.g);
        serializer.j0(this.f);
        serializer.j0(this.n);
        serializer.o0(this.h);
        serializer.o0(this.i);
        serializer.o0(this.k);
        serializer.i0(this.l);
        serializer.o0(this.m);
        serializer.o0(this.j);
        serializer.S(this.p);
        serializer.o0(this.o);
    }

    public final String toString() {
        return "Section [" + this.c + X3.j.e;
    }

    public Section(Serializer serializer) {
        Type type;
        this.b = serializer.H();
        try {
            type = Type.valueOf(serializer.H());
        } catch (Exception unused) {
            type = Type.unknown;
        }
        this.c = type;
        this.d = serializer.H();
        this.e = serializer.H();
        this.g = serializer.u();
        this.f = serializer.H();
        this.n = serializer.H();
        this.h = serializer.j(Playlist.CREATOR);
        this.i = serializer.j(MusicTrack.CREATOR);
        this.k = serializer.j(Thumb.CREATOR);
        this.l = (Artist) serializer.G(Artist.class.getClassLoader());
        this.m = serializer.j(CustomImage.CREATOR);
        this.j = serializer.j(SearchSuggestion.CREATOR);
        this.p = serializer.u();
        this.o = serializer.j(VideoFileOld.CREATOR);
    }
}
