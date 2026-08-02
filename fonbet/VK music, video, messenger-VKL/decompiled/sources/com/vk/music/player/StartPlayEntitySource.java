package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayEntitySource extends StartPlaySource {
    public static final Serializer.c<StartPlayEntitySource> CREATOR = new a();
    public final PlayEntitySource c;
    public final String d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartPlayRequest.kt */
    public static final class PlayEntitySource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PlayEntitySource[] $VALUES;
        public static final PlayEntitySource ARTIST;
        public static final PlayEntitySource CATALOG;
        public static final PlayEntitySource CURATOR;
        public static final PlayEntitySource FEED;
        public static final PlayEntitySource IM;
        public static final PlayEntitySource WALL;
        private final String value;

        static {
            PlayEntitySource playEntitySource = new PlayEntitySource("CATALOG", 0, "catalog");
            CATALOG = playEntitySource;
            PlayEntitySource playEntitySource2 = new PlayEntitySource("IM", 1, "im");
            IM = playEntitySource2;
            PlayEntitySource playEntitySource3 = new PlayEntitySource("WALL", 2, "wall");
            WALL = playEntitySource3;
            PlayEntitySource playEntitySource4 = new PlayEntitySource("FEED", 3, "feed");
            FEED = playEntitySource4;
            PlayEntitySource playEntitySource5 = new PlayEntitySource("ARTIST", 4, "artist");
            ARTIST = playEntitySource5;
            PlayEntitySource playEntitySource6 = new PlayEntitySource("CURATOR", 5, "curator");
            CURATOR = playEntitySource6;
            PlayEntitySource[] playEntitySourceArr = {playEntitySource, playEntitySource2, playEntitySource3, playEntitySource4, playEntitySource5, playEntitySource6};
            $VALUES = playEntitySourceArr;
            $ENTRIES = new asp(playEntitySourceArr);
        }

        public PlayEntitySource(String str, int i, String str2) {
            this.value = str2;
        }

        public static PlayEntitySource valueOf(String str) {
            return (PlayEntitySource) Enum.valueOf(PlayEntitySource.class, str);
        }

        public static PlayEntitySource[] values() {
            return (PlayEntitySource[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayEntitySource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayEntitySource a(Serializer serializer) {
            return new StartPlayEntitySource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayEntitySource[i];
        }
    }

    public /* synthetic */ StartPlayEntitySource(PlayEntitySource playEntitySource, String str, boolean z, int i, zcl zclVar) {
        this(playEntitySource, str, (i & 4) != 0 ? false : z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        PlayEntitySource playEntitySource;
        PlayEntitySource[] values = PlayEntitySource.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                playEntitySource = null;
                break;
            }
            playEntitySource = values[i];
            if (epx.f(playEntitySource.h(), this.c.h())) {
                break;
            } else {
                i++;
            }
        }
        serializer.S(playEntitySource != null ? playEntitySource.ordinal() : 0);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayEntitySource)) {
            return false;
        }
        StartPlayEntitySource startPlayEntitySource = (StartPlayEntitySource) obj;
        return this.c == startPlayEntitySource.c && epx.f(this.d, startPlayEntitySource.d) && this.e == startPlayEntitySource.e;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayEntitySource(source=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", isLaunchedFromWall=");
        return q0.a(sb, this.e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartPlayEntitySource(PlayEntitySource playEntitySource, String str, boolean z) {
        super(null, 1, 0 == true ? 1 : 0);
        this.c = playEntitySource;
        this.d = str;
        this.e = z;
    }

    public StartPlayEntitySource(Serializer serializer) {
        this(PlayEntitySource.values()[serializer.u()], serializer.H(), serializer.m());
    }
}
