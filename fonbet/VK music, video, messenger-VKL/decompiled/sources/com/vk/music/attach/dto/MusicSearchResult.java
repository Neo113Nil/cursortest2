package com.vk.music.attach.dto;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import xsna.o25;

/* loaded from: classes3.dex */
public class MusicSearchResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicSearchResult> CREATOR = new a();
    public ArrayList b;
    public ArrayList c;

    public class a extends Serializer.c<MusicSearchResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicSearchResult a(@NonNull Serializer serializer) {
            MusicSearchResult musicSearchResult = new MusicSearchResult();
            Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
            musicSearchResult.b = serializer.j(cVar);
            musicSearchResult.c = serializer.j(cVar);
            return musicSearchResult;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicSearchResult[i];
        }
    }

    public MusicSearchResult(@NonNull List<MusicTrack> list) {
        for (MusicTrack musicTrack : list) {
            if (o25.a().a(musicTrack.c)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                this.b.add(musicTrack);
            } else {
                if (this.c == null) {
                    this.c = new ArrayList();
                }
                this.c.add(musicTrack);
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.o0(this.c);
    }
}
