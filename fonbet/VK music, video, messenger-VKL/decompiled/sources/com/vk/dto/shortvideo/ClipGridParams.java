package com.vk.dto.shortvideo;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ClipGridParams.kt */
/* loaded from: classes18.dex */
public abstract class ClipGridParams extends Serializer.StreamParcelableAdapter {

    /* compiled from: ClipGridParams.kt */
    public static abstract class Data extends ClipGridParams {

        /* compiled from: ClipGridParams.kt */
        public static final class CameraMask extends Data {
            public static final Serializer.c<CameraMask> CREATOR = new a();
            public final Mask b;
            public final long c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<CameraMask> {
                @Override // com.vk.core.serialize.Serializer.c
                public final CameraMask a(Serializer serializer) {
                    return new CameraMask((Mask) serializer.G(Mask.class.getClassLoader()), serializer.w());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CameraMask[i];
                }
            }

            public CameraMask(Mask mask, long j) {
                super(null);
                this.b = mask;
                this.c = j;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
                serializer.Y(this.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CameraMask)) {
                    return false;
                }
                CameraMask cameraMask = (CameraMask) obj;
                return epx.f(this.b, cameraMask.b) && this.c == cameraMask.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CameraMask(mask=");
                sb.append(this.b);
                sb.append(", videosCount=");
                return vu5.a(')', this.c, sb);
            }

            @Override // com.vk.dto.shortvideo.ClipGridParams
            public final OnlyId zb() {
                StringBuilder sb = new StringBuilder();
                Mask mask = this.b;
                sb.append(mask.e);
                sb.append('_');
                sb.append(mask.d);
                return new OnlyId.CameraMask(sb.toString());
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class ClipCompilation extends Data {
            public static final Serializer.c<ClipCompilation> CREATOR = new a();
            public final Compilation b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<ClipCompilation> {
                @Override // com.vk.core.serialize.Serializer.c
                public final ClipCompilation a(Serializer serializer) {
                    return new ClipCompilation((Compilation) serializer.G(Compilation.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ClipCompilation[i];
                }
            }

            public ClipCompilation(Compilation compilation) {
                super(null);
                this.b = compilation;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClipCompilation) && epx.f(this.b, ((ClipCompilation) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ClipCompilation(compilation=" + this.b + ')';
            }

            @Override // com.vk.dto.shortvideo.ClipGridParams
            public final OnlyId zb() {
                return new OnlyId.ClipCompilation(this.b.b);
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class GeoPlace extends Data {
            public static final Serializer.c<GeoPlace> CREATOR = new a();
            public final com.vk.dto.geo.GeoPlace b;
            public final long c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<GeoPlace> {
                @Override // com.vk.core.serialize.Serializer.c
                public final GeoPlace a(Serializer serializer) {
                    return new GeoPlace((com.vk.dto.geo.GeoPlace) serializer.A(com.vk.dto.geo.GeoPlace.class.getClassLoader()), serializer.w());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GeoPlace[i];
                }
            }

            public GeoPlace(com.vk.dto.geo.GeoPlace geoPlace, long j) {
                super(null);
                this.b = geoPlace;
                this.c = j;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.e0(this.b);
                serializer.Y(this.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GeoPlace)) {
                    return false;
                }
                GeoPlace geoPlace = (GeoPlace) obj;
                return epx.f(this.b, geoPlace.b) && this.c == geoPlace.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GeoPlace(place=");
                sb.append(this.b);
                sb.append(", videosCount=");
                return vu5.a(')', this.c, sb);
            }

            @Override // com.vk.dto.shortvideo.ClipGridParams
            public final OnlyId zb() {
                return new OnlyId.GeoPlace(this.b.c);
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class Hashtag extends Data {
            public static final Serializer.c<Hashtag> CREATOR = new a();
            public final String b;
            public final long c;
            public final boolean d;
            public final boolean e;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Hashtag> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Hashtag a(Serializer serializer) {
                    return new Hashtag(serializer.H(), serializer.w(), serializer.m(), serializer.m());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Hashtag[i];
                }
            }

            public Hashtag(String str, long j, boolean z, boolean z2) {
                super(null);
                this.b = str;
                this.c = j;
                this.d = z;
                this.e = z2;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.Y(this.c);
                serializer.L(this.d ? (byte) 1 : (byte) 0);
                serializer.L(this.e ? (byte) 1 : (byte) 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Hashtag)) {
                    return false;
                }
                Hashtag hashtag = (Hashtag) obj;
                return epx.f(this.b, hashtag.b) && this.c == hashtag.c && this.d == hashtag.d && this.e == hashtag.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Hashtag(text=");
                sb.append(this.b);
                sb.append(", videosCount=");
                sb.append(this.c);
                sb.append(", isTrend=");
                sb.append(this.d);
                sb.append(", hasTrendLanding=");
                return q0.a(sb, this.e, ')');
            }

            @Override // com.vk.dto.shortvideo.ClipGridParams
            public final OnlyId zb() {
                return new OnlyId.Hashtag(this.b);
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class Profile extends Data {
            public static final Serializer.c<Profile> CREATOR = new a();
            public final ClipsAuthor b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Profile> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Profile a(Serializer serializer) {
                    return new Profile((ClipsAuthor) serializer.G(ClipsAuthor.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Profile[i];
                }
            }

            public Profile(ClipsAuthor clipsAuthor) {
                super(null);
                this.b = clipsAuthor;
            }

            public final ClipsAuthor Ab() {
                return this.b;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Profile) && epx.f(this.b, ((Profile) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Profile(author=" + this.b + ')';
            }

            @Override // com.vk.dto.shortvideo.ClipGridParams
            public final OnlyId zb() {
                return new OnlyId.Profile(this.b.b.b);
            }
        }

        public /* synthetic */ Data(zcl zclVar) {
            this();
        }

        public Data() {
            super(null);
        }

        /* compiled from: ClipGridParams.kt */
        public static final class Music extends Data {
            public static final Serializer.c<Music> CREATOR = new c();
            public final MusicTrack b;
            public final long c;
            public final b d;
            public final boolean e;
            public final String f;
            public final ClipAudioTemplate g;
            public final Owner h;
            public final boolean i;
            public final boolean j;

            /* compiled from: ClipGridParams.kt */
            public static final class a {
            }

            /* compiled from: ClipGridParams.kt */
            public static final class b {
                public final boolean a;
                public final boolean b;

                public b(boolean z, boolean z2) {
                    this.a = z;
                    this.b = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a == bVar.a && this.b == bVar.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("FavoriteConfig(inFavorites=");
                    sb.append(this.a);
                    sb.append(", canAddToFavorite=");
                    return q0.a(sb, this.b, ')');
                }
            }

            /* compiled from: Serializer.kt */
            public static final class c extends Serializer.c<Music> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Music a(Serializer serializer) {
                    return new Music((MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), serializer.w(), new b(serializer.m(), serializer.m()), serializer.m(), null, (ClipAudioTemplate) serializer.G(ClipAudioTemplate.class.getClassLoader()), null, serializer.m(), serializer.m(), 80, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Music[i];
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Music(MusicTrack musicTrack, long j, b bVar, boolean z, String str, ClipAudioTemplate clipAudioTemplate, Owner owner, boolean z2, boolean z3, int i, zcl zclVar) {
                this(musicTrack, j, r4, r5, r6, (i & 32) != 0 ? null : clipAudioTemplate, (i & 64) != 0 ? null : owner, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3);
                String str2;
                b bVar2 = (i & 4) != 0 ? new b(false, false) : bVar;
                boolean z4 = (i & 8) != 0 ? false : z;
                if ((i & 16) != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(musicTrack.c);
                    sb.append('_');
                    sb.append(musicTrack.b);
                    str2 = sb.toString();
                } else {
                    str2 = str;
                }
            }

            public static Music Ab(Music music, b bVar) {
                MusicTrack musicTrack = music.b;
                long j = music.c;
                boolean z = music.e;
                String str = music.f;
                ClipAudioTemplate clipAudioTemplate = music.g;
                Owner owner = music.h;
                boolean z2 = music.i;
                boolean z3 = music.j;
                music.getClass();
                return new Music(musicTrack, j, bVar, z, str, clipAudioTemplate, owner, z2, z3);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
                serializer.Y(this.c);
                b bVar = this.d;
                serializer.L(bVar.a ? (byte) 1 : (byte) 0);
                serializer.L(bVar.b ? (byte) 1 : (byte) 0);
                serializer.L(this.e ? (byte) 1 : (byte) 0);
                serializer.i0(this.g);
                serializer.L(this.i ? (byte) 1 : (byte) 0);
                serializer.L(this.j ? (byte) 1 : (byte) 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Music)) {
                    return false;
                }
                Music music = (Music) obj;
                return epx.f(this.b, music.b) && this.c == music.c && epx.f(this.d, music.d) && this.e == music.e && epx.f(this.f, music.f) && epx.f(this.g, music.g) && epx.f(this.h, music.h) && this.i == music.i && this.j == music.j;
            }

            public final int hashCode() {
                int a2 = urd0.a(qoy.b((this.d.hashCode() + bh10.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
                ClipAudioTemplate clipAudioTemplate = this.g;
                int hashCode = (a2 + (clipAudioTemplate == null ? 0 : clipAudioTemplate.b.hashCode())) * 31;
                Owner owner = this.h;
                return Boolean.hashCode(this.j) + qoy.b((hashCode + (owner != null ? owner.hashCode() : 0)) * 31, 31, this.i);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Music(track=");
                sb.append(this.b);
                sb.append(", videosCount=");
                sb.append(this.c);
                sb.append(", favoriteConfig=");
                sb.append(this.d);
                sb.append(", showPrivacyInfo=");
                sb.append(this.e);
                sb.append(", initialId=");
                sb.append(this.f);
                sb.append(", audioTemplate=");
                sb.append(this.g);
                sb.append(", owner=");
                sb.append(this.h);
                sb.append(", isTrend=");
                sb.append(this.i);
                sb.append(", hasTrendLanding=");
                return q0.a(sb, this.j, ')');
            }

            @Override // com.vk.dto.shortvideo.ClipGridParams
            public final OnlyId zb() {
                StringBuilder sb = new StringBuilder();
                MusicTrack musicTrack = this.b;
                sb.append(musicTrack.c);
                sb.append('_');
                sb.append(musicTrack.b);
                return new OnlyId.Audio(sb.toString());
            }

            public Music(MusicTrack musicTrack, long j, b bVar, boolean z, String str, ClipAudioTemplate clipAudioTemplate, Owner owner, boolean z2, boolean z3) {
                super(null);
                this.b = musicTrack;
                this.c = j;
                this.d = bVar;
                this.e = z;
                this.f = str;
                this.g = clipAudioTemplate;
                this.h = owner;
                this.i = z2;
                this.j = z3;
            }
        }
    }

    public /* synthetic */ ClipGridParams(zcl zclVar) {
        this();
    }

    public abstract OnlyId zb();

    public ClipGridParams() {
    }

    /* compiled from: ClipGridParams.kt */
    public static abstract class OnlyId extends ClipGridParams {

        /* compiled from: ClipGridParams.kt */
        public static final class Audio extends OnlyId {
            public static final Serializer.c<Audio> CREATOR = new a();
            public final String b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Audio> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Audio a(Serializer serializer) {
                    return new Audio(serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Audio[i];
                }
            }

            public Audio(String str) {
                super(null);
                this.b = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Audio) && epx.f(this.b, ((Audio) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Audio(id="), this.b, ')');
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class CameraMask extends OnlyId {
            public static final Serializer.c<CameraMask> CREATOR = new a();
            public final String b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<CameraMask> {
                @Override // com.vk.core.serialize.Serializer.c
                public final CameraMask a(Serializer serializer) {
                    return new CameraMask(serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CameraMask[i];
                }
            }

            public CameraMask(String str) {
                super(null);
                this.b = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CameraMask) && epx.f(this.b, ((CameraMask) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CameraMask(id="), this.b, ')');
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class ClipCompilation extends OnlyId {
            public static final Serializer.c<ClipCompilation> CREATOR = new a();
            public final int b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<ClipCompilation> {
                @Override // com.vk.core.serialize.Serializer.c
                public final ClipCompilation a(Serializer serializer) {
                    return new ClipCompilation(serializer.u());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ClipCompilation[i];
                }
            }

            public ClipCompilation(int i) {
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
                return (obj instanceof ClipCompilation) && this.b == ((ClipCompilation) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ClipCompilation(id="), this.b, ')');
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class GeoPlace extends OnlyId {
            public static final Serializer.c<GeoPlace> CREATOR = new a();
            public final int b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<GeoPlace> {
                @Override // com.vk.core.serialize.Serializer.c
                public final GeoPlace a(Serializer serializer) {
                    return new GeoPlace(serializer.u());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GeoPlace[i];
                }
            }

            public GeoPlace(int i) {
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
                return (obj instanceof GeoPlace) && this.b == ((GeoPlace) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("GeoPlace(placeId="), this.b, ')');
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class Hashtag extends OnlyId {
            public static final Serializer.c<Hashtag> CREATOR = new a();
            public final String b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Hashtag> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Hashtag a(Serializer serializer) {
                    return new Hashtag(serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Hashtag[i];
                }
            }

            public Hashtag(String str) {
                super(null);
                this.b = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Hashtag) && epx.f(this.b, ((Hashtag) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Hashtag(text="), this.b, ')');
            }
        }

        /* compiled from: ClipGridParams.kt */
        public static final class Profile extends OnlyId {
            public static final Serializer.c<Profile> CREATOR = new a();
            public final UserId b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Profile> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Profile a(Serializer serializer) {
                    return new Profile((UserId) serializer.A(UserId.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Profile[i];
                }
            }

            public Profile(UserId userId) {
                super(null);
                this.b = userId;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.e0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Profile) && epx.f(this.b, ((Profile) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Profile(id="), this.b, ')');
            }
        }

        public OnlyId(zcl zclVar) {
            super(null);
        }

        @Override // com.vk.dto.shortvideo.ClipGridParams
        public final OnlyId zb() {
            return this;
        }
    }
}
