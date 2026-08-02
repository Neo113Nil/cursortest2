package com.vk.dto.podcast;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;

/* compiled from: PodcastListPage.kt */
/* loaded from: classes18.dex */
public final class PodcastListPage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PodcastListPage> CREATOR = new a();
    public final String b;
    public final String c;
    public final ArrayList<MusicTrack> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PodcastListPage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastListPage a(Serializer serializer) {
            return new PodcastListPage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastListPage[i];
        }
    }

    public PodcastListPage(String str, String str2, ArrayList<MusicTrack> arrayList) {
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.o0(this.d);
    }

    public PodcastListPage(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.j(MusicTrack.CREATOR));
    }
}
