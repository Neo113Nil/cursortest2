package com.vk.clips.sdk.shared.paging;

import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: PaginationKey.kt */
/* loaded from: classes17.dex */
public abstract class PaginationKey extends Serializer.StreamParcelableAdapter {

    /* compiled from: PaginationKey.kt */
    public static final class Next extends PaginationKey {
        public static final Serializer.c<Next> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Next> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Next a(Serializer serializer) {
                return new Next(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Next[i];
            }
        }

        public Next(String str) {
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
            return (obj instanceof Next) && epx.f(this.b, ((Next) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Next(key="), this.b, ')');
        }
    }

    /* compiled from: PaginationKey.kt */
    public static final class NextPageWithDecoration extends PaginationKey {
        public static final Serializer.c<NextPageWithDecoration> CREATOR = new a();
        public final ClipsDecorationPaginationKey b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<NextPageWithDecoration> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NextPageWithDecoration a(Serializer serializer) {
                return new NextPageWithDecoration((ClipsDecorationPaginationKey) serializer.A(ClipsDecorationPaginationKey.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NextPageWithDecoration[i];
            }
        }

        public NextPageWithDecoration(ClipsDecorationPaginationKey clipsDecorationPaginationKey) {
            super(null);
            this.b = clipsDecorationPaginationKey;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextPageWithDecoration) && epx.f(this.b, ((NextPageWithDecoration) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NextPageWithDecoration(key=" + this.b + ')';
        }
    }

    /* compiled from: PaginationKey.kt */
    public static final class a {
        public static PaginationKey a(String str) {
            return (str == null || str.length() == 0 || str.equals("null")) ? LoadedFull.b : new Next(str);
        }
    }

    public /* synthetic */ PaginationKey(zcl zclVar) {
        this();
    }

    public final String zb() {
        Next next = this instanceof Next ? (Next) this : null;
        if (next != null) {
            return next.b;
        }
        return null;
    }

    public PaginationKey() {
    }

    /* compiled from: PaginationKey.kt */
    public static final class Initial extends PaginationKey {
        public static final Initial b = new Initial(null);
        public static final Serializer.c<Initial> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Initial> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Initial a(Serializer serializer) {
                return Initial.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: PaginationKey.kt */
    public static final class LoadedFull extends PaginationKey {
        public static final LoadedFull b = new LoadedFull(null);
        public static final Serializer.c<LoadedFull> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<LoadedFull> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LoadedFull a(Serializer serializer) {
                return LoadedFull.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadedFull[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
