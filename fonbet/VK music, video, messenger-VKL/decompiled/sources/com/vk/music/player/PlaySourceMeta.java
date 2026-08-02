package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import defpackage.q0;
import kotlin.LazyThreadSafetyMode;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.mg;
import xsna.msy;
import xsna.ob0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vg0;
import xsna.zcl;

/* compiled from: PlaySourceMeta.kt */
/* loaded from: classes3.dex */
public abstract class PlaySourceMeta extends Serializer.StreamParcelableAdapter {

    /* compiled from: PlaySourceMeta.kt */
    public static final class CatalogPlaySourceMeta extends PlaySourceMeta implements a {
        public final String b;
        public final String c;
        public final boolean d;
        public static final Object e = msy.a(LazyThreadSafetyMode.NONE, new mg(23));
        public static final Serializer.c<CatalogPlaySourceMeta> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CatalogPlaySourceMeta> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CatalogPlaySourceMeta a(Serializer serializer) {
                return new CatalogPlaySourceMeta(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogPlaySourceMeta[i];
            }
        }

        public /* synthetic */ CatalogPlaySourceMeta(String str, String str2, boolean z, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CatalogPlaySourceMeta)) {
                return false;
            }
            CatalogPlaySourceMeta catalogPlaySourceMeta = (CatalogPlaySourceMeta) obj;
            return epx.f(this.b, catalogPlaySourceMeta.b) && epx.f(this.c, catalogPlaySourceMeta.c) && this.d == catalogPlaySourceMeta.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        @Override // com.vk.music.player.PlaySourceMeta.a
        public final boolean p7() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CatalogPlaySourceMeta(title=");
            sb.append(this.b);
            sb.append(", sectionId=");
            sb.append(this.c);
            sb.append(", canSkipListening=");
            return q0.a(sb, this.d, ')');
        }

        public CatalogPlaySourceMeta(String str, String str2, boolean z) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CatalogPlaySourceMeta(Serializer serializer) {
            this(r0, r2 != null ? r2 : "", serializer.m());
            String H = serializer.H();
            H = H == null ? "" : H;
            String H2 = serializer.H();
        }
    }

    /* compiled from: PlaySourceMeta.kt */
    public static final class PlaylistPlaySourceMeta extends PlaySourceMeta {
        public final String b;
        public final boolean c;
        public final UserId d;
        public final int e;
        public final int f;
        public final MusicDynamicRestriction g;
        public static final Object h = msy.a(LazyThreadSafetyMode.NONE, new ob0(23));
        public static final Serializer.c<PlaylistPlaySourceMeta> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PlaylistPlaySourceMeta> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PlaylistPlaySourceMeta a(Serializer serializer) {
                return new PlaylistPlaySourceMeta(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaylistPlaySourceMeta[i];
            }
        }

        public /* synthetic */ PlaylistPlaySourceMeta(String str, boolean z, UserId userId, int i, int i2, MusicDynamicRestriction musicDynamicRestriction, int i3, zcl zclVar) {
            this(str, z, userId, i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : musicDynamicRestriction);
        }

        public final MusicDynamicRestriction Ab() {
            return this.g;
        }

        public final boolean Bb() {
            return this.c;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
            serializer.e0(this.d);
            serializer.S(this.e);
            serializer.S(this.f);
            serializer.i0(this.g);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaylistPlaySourceMeta)) {
                return false;
            }
            PlaylistPlaySourceMeta playlistPlaySourceMeta = (PlaylistPlaySourceMeta) obj;
            return epx.f(this.b, playlistPlaySourceMeta.b) && this.c == playlistPlaySourceMeta.c && epx.f(this.d, playlistPlaySourceMeta.d) && this.e == playlistPlaySourceMeta.e && this.f == playlistPlaySourceMeta.f && epx.f(this.g, playlistPlaySourceMeta.g);
        }

        public final int hashCode() {
            int a2 = shy.a(this.f, shy.a(this.e, bh10.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31), 31);
            MusicDynamicRestriction musicDynamicRestriction = this.g;
            return a2 + (musicDynamicRestriction == null ? 0 : musicDynamicRestriction.hashCode());
        }

        public final String toString() {
            return "PlaylistPlaySourceMeta(title=" + this.b + ", isAlbum=" + this.c + ", ownerId=" + this.d + ", playlistId=" + this.e + ", contextFlagsMask=" + this.f + ", restriction=" + this.g + ')';
        }

        public final int zb() {
            return this.f;
        }

        public PlaylistPlaySourceMeta(String str, boolean z, UserId userId, int i, int i2, MusicDynamicRestriction musicDynamicRestriction) {
            super(null);
            this.b = str;
            this.c = z;
            this.d = userId;
            this.e = i;
            this.f = i2;
            this.g = musicDynamicRestriction;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PlaylistPlaySourceMeta(Serializer serializer) {
            this(r2, r3, r0 == null ? new UserId(0L) : r0, serializer.u(), serializer.u(), (MusicDynamicRestriction) serializer.G(MusicDynamicRestriction.class.getClassLoader()));
            String H = serializer.H();
            String str = H == null ? "" : H;
            boolean m = serializer.m();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        }
    }

    /* compiled from: PlaySourceMeta.kt */
    public interface a {
        boolean p7();
    }

    public /* synthetic */ PlaySourceMeta(zcl zclVar) {
        this();
    }

    /* compiled from: PlaySourceMeta.kt */
    public static final class RecentlyListened extends PlaySourceMeta implements a {
        public static final Serializer.c<RecentlyListened> CREATOR = new a();
        public final boolean b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<RecentlyListened> {
            @Override // com.vk.core.serialize.Serializer.c
            public final RecentlyListened a(Serializer serializer) {
                return new RecentlyListened(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecentlyListened[i];
            }
        }

        public RecentlyListened(boolean z) {
            super(null);
            this.b = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.L(this.b ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentlyListened) && this.b == ((RecentlyListened) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        @Override // com.vk.music.player.PlaySourceMeta.a
        public final boolean p7() {
            return this.b;
        }

        public final String toString() {
            return q0.a(new StringBuilder("RecentlyListened(canSkipListening="), this.b, ')');
        }

        public RecentlyListened(Serializer serializer) {
            this(serializer.m());
        }
    }

    public PlaySourceMeta() {
    }

    /* compiled from: PlaySourceMeta.kt */
    public static final class SimilarTrackPlaySourceMeta extends PlaySourceMeta {
        public static final Serializer.c<SimilarTrackPlaySourceMeta> CREATOR = new a();
        public final String b;
        public final String c;
        public final boolean d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SimilarTrackPlaySourceMeta> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SimilarTrackPlaySourceMeta a(Serializer serializer) {
                return new SimilarTrackPlaySourceMeta(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimilarTrackPlaySourceMeta[i];
            }
        }

        public SimilarTrackPlaySourceMeta(String str, String str2, boolean z) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean Ab() {
            return this.d;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimilarTrackPlaySourceMeta)) {
                return false;
            }
            SimilarTrackPlaySourceMeta similarTrackPlaySourceMeta = (SimilarTrackPlaySourceMeta) obj;
            return epx.f(this.b, similarTrackPlaySourceMeta.b) && epx.f(this.c, similarTrackPlaySourceMeta.c) && this.d == similarTrackPlaySourceMeta.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimilarTrackPlaySourceMeta(title=");
            sb.append(this.b);
            sb.append(", mid=");
            sb.append(this.c);
            sb.append(", isKidsContext=");
            return q0.a(sb, this.d, ')');
        }

        public final String zb() {
            return this.c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SimilarTrackPlaySourceMeta(Serializer serializer) {
            this(r0, r2 != null ? r2 : "", serializer.m());
            String H = serializer.H();
            H = H == null ? "" : H;
            String H2 = serializer.H();
        }
    }

    /* compiled from: PlaySourceMeta.kt */
    public static final class VKMixPlaySourceMeta extends PlaySourceMeta {
        public final String b;
        public final Integer c;
        public final boolean d;
        public final String e;
        public static final Object f = msy.a(LazyThreadSafetyMode.NONE, new vg0(25));
        public static final Serializer.c<VKMixPlaySourceMeta> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<VKMixPlaySourceMeta> {
            @Override // com.vk.core.serialize.Serializer.c
            public final VKMixPlaySourceMeta a(Serializer serializer) {
                return new VKMixPlaySourceMeta(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VKMixPlaySourceMeta[i];
            }
        }

        public VKMixPlaySourceMeta(String str, Integer num, boolean z, String str2) {
            super(null);
            this.b = str;
            this.c = num;
            this.d = z;
            this.e = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.V(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VKMixPlaySourceMeta)) {
                return false;
            }
            VKMixPlaySourceMeta vKMixPlaySourceMeta = (VKMixPlaySourceMeta) obj;
            return epx.f(this.b, vKMixPlaySourceMeta.b) && epx.f(this.c, vKMixPlaySourceMeta.c) && this.d == vKMixPlaySourceMeta.d && epx.f(this.e, vKMixPlaySourceMeta.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            return this.e.hashCode() + qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VKMixPlaySourceMeta(title=");
            sb.append(this.b);
            sb.append(", sourceRes=");
            sb.append(this.c);
            sb.append(", isTunable=");
            sb.append(this.d);
            sb.append(", mixId=");
            return ho8.a(sb, this.e, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VKMixPlaySourceMeta(Serializer serializer) {
            this(r0, r2, r3, r5 != null ? r5 : "");
            String H = serializer.H();
            H = H == null ? "" : H;
            Integer v = serializer.v();
            boolean m = serializer.m();
            String H2 = serializer.H();
        }
    }

    /* compiled from: PlaySourceMeta.kt */
    public static final class Default extends PlaySourceMeta implements Serializer.StreamParcelable {
        public static final Default b = new Default(null);
        public static final Serializer.c<Default> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Default> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Default a(Serializer serializer) {
                return Default.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return 981047135;
        }

        public final String toString() {
            return "Default";
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
