package com.vk.dto.newsfeed.entries.discover.community;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.PollGradient;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: CommunityMediaDiscoverGridItem.kt */
/* loaded from: classes18.dex */
public final class CommunityMediaDiscoverGridItem extends DiscoverGridItem {
    public static final Serializer.c<CommunityMediaDiscoverGridItem> CREATOR = new a();
    public final boolean j;
    public final int k;
    public final boolean l;
    public final String m;
    public final PollGradient n;
    public final int o;
    public final RestrictionState p;

    /* compiled from: CommunityMediaDiscoverGridItem.kt */
    public static abstract class RestrictionState implements Serializer.StreamParcelable {

        /* compiled from: CommunityMediaDiscoverGridItem.kt */
        public static final class Blocked extends RestrictionState {
            public static final Serializer.c<Blocked> CREATOR = new a();
            public final String b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Blocked> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Blocked a(Serializer serializer) {
                    return new Blocked(serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Blocked[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Blocked() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Blocked) && epx.f(this.b, ((Blocked) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Blocked(iconUrl="), this.b, ')');
            }

            public Blocked(String str) {
                super(null);
                this.b = str;
            }

            public /* synthetic */ Blocked(String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str);
            }
        }

        /* compiled from: CommunityMediaDiscoverGridItem.kt */
        public static final class Blurred extends RestrictionState {
            public static final Serializer.c<Blurred> CREATOR = new a();
            public final String b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Blurred> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Blurred a(Serializer serializer) {
                    return new Blurred(serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Blurred[i];
                }
            }

            public Blurred(String str) {
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
                return (obj instanceof Blurred) && epx.f(this.b, ((Blurred) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Blurred(imageUrl="), this.b, ')');
            }
        }

        public /* synthetic */ RestrictionState(zcl zclVar) {
            this();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public RestrictionState() {
        }

        /* compiled from: CommunityMediaDiscoverGridItem.kt */
        public static final class None extends RestrictionState {
            public static final None b = new None(null);
            public static final Serializer.c<None> CREATOR = new a();

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<None> {
                @Override // com.vk.core.serialize.Serializer.c
                public final None a(Serializer serializer) {
                    return None.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new None[i];
                }
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return 2006517498;
            }

            public final String toString() {
                return "None";
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommunityMediaDiscoverGridItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommunityMediaDiscoverGridItem a(Serializer serializer) {
            return new CommunityMediaDiscoverGridItem(serializer.H(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.u(), serializer.m(), serializer.H(), (PollGradient) serializer.G(PollGradient.class.getClassLoader()), serializer.u(), (RestrictionState) serializer.G(RestrictionState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommunityMediaDiscoverGridItem[i];
        }
    }

    public CommunityMediaDiscoverGridItem(String str, NewsEntry newsEntry, String str2, String str3, String str4, boolean z, int i, boolean z2, String str5, PollGradient pollGradient, int i2, RestrictionState restrictionState) {
        super(str, newsEntry, 1, 1, null, new DiscoverGridItem.a(str2, str3, str4), null, null);
        this.j = z;
        this.k = i;
        this.l = z2;
        this.m = str5;
        this.n = pollGradient;
        this.o = i2;
        this.p = restrictionState;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        DiscoverGridItem.a aVar = this.g;
        serializer.j0(aVar.a);
        serializer.j0(aVar.b);
        serializer.j0(aVar.c);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.S(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
        serializer.i0(this.n);
        serializer.S(this.o);
        serializer.i0(this.p);
    }
}
