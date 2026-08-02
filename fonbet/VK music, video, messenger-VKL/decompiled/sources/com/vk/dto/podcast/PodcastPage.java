package com.vk.dto.podcast;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: PodcastPage.kt */
/* loaded from: classes18.dex */
public final class PodcastPage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PodcastPage> CREATOR = new b();
    public final MusicTrack b;
    public final ArrayList<MusicTrack> c;
    public boolean d;
    public final int e;

    /* compiled from: PodcastPage.kt */
    public static final class a extends aay<PodcastPage> {
        @Override // xsna.aay
        public final PodcastPage a(JSONObject jSONObject) {
            return new PodcastPage(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PodcastPage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastPage a(Serializer serializer) {
            return new PodcastPage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastPage[i];
        }
    }

    static {
        new a();
    }

    public PodcastPage(MusicTrack musicTrack, ArrayList<MusicTrack> arrayList, boolean z, int i) {
        this.b = musicTrack;
        this.c = arrayList;
        this.d = z;
        this.e = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.o0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.S(this.e);
    }

    public PodcastPage(JSONObject jSONObject) {
        this(new MusicTrack(jSONObject.getJSONObject("current")), new VKList(jSONObject.getJSONObject("also"), MusicTrack.e0), jSONObject.optBoolean("can_subscribe", false), jSONObject.optInt("podcast_id", 0));
    }

    public PodcastPage(Serializer serializer) {
        this((MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), serializer.j(MusicTrack.CREATOR), serializer.m(), serializer.u());
    }
}
