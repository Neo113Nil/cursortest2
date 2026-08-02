package com.vk.catalog2.feature.music.dto.ui;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMusicArtistNew.kt */
/* loaded from: classes16.dex */
public final class MusicArtistInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicArtistInfo> CREATOR = new a();
    public final List<MusicArtistChip> b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicArtistInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicArtistInfo a(Serializer serializer) {
            return new MusicArtistInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicArtistInfo[i];
        }
    }

    public MusicArtistInfo(List<MusicArtistChip> list, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = list;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
        serializer.J(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicArtistInfo)) {
            return false;
        }
        MusicArtistInfo musicArtistInfo = (MusicArtistInfo) obj;
        return epx.f(this.b, musicArtistInfo.b) && epx.f(this.c, musicArtistInfo.c) && epx.f(this.d, musicArtistInfo.d) && epx.f(this.e, musicArtistInfo.e) && epx.f(this.f, musicArtistInfo.f) && epx.f(this.g, musicArtistInfo.g) && epx.f(this.h, musicArtistInfo.h) && epx.f(this.i, musicArtistInfo.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicArtistInfo(chips=");
        sb.append(this.b);
        sb.append(", isForeignAgent=");
        sb.append(this.c);
        sb.append(", playTrackCode=");
        sb.append(this.d);
        sb.append(", subscriptionTrackCode=");
        sb.append(this.e);
        sb.append(", subscriptionBioTrackCode=");
        sb.append(this.f);
        sb.append(", viewTrackCode=");
        sb.append(this.g);
        sb.append(", expandTrackCode=");
        sb.append(this.h);
        sb.append(", playActionRef=");
        return ho8.a(sb, this.i, ')');
    }

    public MusicArtistInfo(Serializer serializer) {
        this(serializer.B(MusicArtistChip.class.getClassLoader()), serializer.n(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
