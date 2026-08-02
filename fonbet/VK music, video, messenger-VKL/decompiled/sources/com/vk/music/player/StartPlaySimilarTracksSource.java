package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.music.player.PlaySourceMeta;
import xsna.epx;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlaySimilarTracksSource extends StartPlaySource {
    public static final Serializer.c<StartPlaySimilarTracksSource> CREATOR = new a();
    public final PlaySourceMeta.SimilarTrackPlaySourceMeta c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlaySimilarTracksSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlaySimilarTracksSource a(Serializer serializer) {
            return new StartPlaySimilarTracksSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlaySimilarTracksSource[i];
        }
    }

    public StartPlaySimilarTracksSource(PlaySourceMeta.SimilarTrackPlaySourceMeta similarTrackPlaySourceMeta) {
        super(similarTrackPlaySourceMeta, null);
        this.c = similarTrackPlaySourceMeta;
    }

    public final PlaySourceMeta.SimilarTrackPlaySourceMeta Ab() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartPlaySimilarTracksSource) && epx.f(this.c, ((StartPlaySimilarTracksSource) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "StartPlaySimilarTracksSource(meta=" + this.c + ')';
    }

    @Override // com.vk.music.player.StartPlaySource
    public final PlaySourceMeta zb() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartPlaySimilarTracksSource(Serializer serializer) {
        this(r3 == null ? new PlaySourceMeta.SimilarTrackPlaySourceMeta("", "", false) : r3);
        PlaySourceMeta.SimilarTrackPlaySourceMeta similarTrackPlaySourceMeta = (PlaySourceMeta.SimilarTrackPlaySourceMeta) serializer.A(PlaySourceMeta.SimilarTrackPlaySourceMeta.class.getClassLoader());
    }
}
