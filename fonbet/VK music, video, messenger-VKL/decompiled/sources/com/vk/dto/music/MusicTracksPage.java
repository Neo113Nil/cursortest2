package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;

/* compiled from: MusicTracksPage.kt */
/* loaded from: classes18.dex */
public final class MusicTracksPage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicTracksPage> CREATOR = new b();
    public static final a d = new a();
    public final List<MusicTrack> b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MusicTracksPage> {
        @Override // xsna.aay
        public final MusicTracksPage a(JSONObject jSONObject) {
            return new MusicTracksPage(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MusicTracksPage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicTracksPage a(Serializer serializer) {
            return new MusicTracksPage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicTracksPage[i];
        }
    }

    public MusicTracksPage(List<MusicTrack> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicTracksPage)) {
            return false;
        }
        MusicTracksPage musicTracksPage = (MusicTracksPage) obj;
        return epx.f(this.b, musicTracksPage.b) && epx.f(this.c, musicTracksPage.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTracksPage(tracks=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicTracksPage(JSONObject jSONObject) {
        this(r4 == null ? new ArrayList() : r4, jSONObject.optString("next_from", null));
        ArrayList arrayList;
        MusicTrack.b bVar = MusicTrack.e0;
        JSONArray optJSONArray = jSONObject.optJSONArray("audios");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        bVar.getClass();
                        arrayList.add(new MusicTrack(optJSONObject));
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicTracksPage(Serializer serializer) {
        this(r0 == null ? EmptyList.b : r0, serializer.H());
        List j = serializer.j(MusicTrack.CREATOR);
    }
}
