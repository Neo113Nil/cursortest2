package com.vk.dto.im;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MsgType.kt */
/* loaded from: classes18.dex */
public abstract class MsgType implements Serializer.StreamParcelable {

    /* compiled from: MsgType.kt */
    public static final class WithTtl extends MsgType {
        public static final Serializer.c<WithTtl> CREATOR = new a();
        public final long b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<WithTtl> {
            @Override // com.vk.core.serialize.Serializer.c
            public final WithTtl a(Serializer serializer) {
                return new WithTtl(serializer.w());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTtl[i];
            }
        }

        public WithTtl(long j) {
            super(null);
            this.b = j;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.Y(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithTtl) && this.b == ((WithTtl) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("WithTtl(durationMs="));
        }
    }

    public /* synthetic */ MsgType(zcl zclVar) {
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

    public MsgType() {
    }

    /* compiled from: MsgType.kt */
    public static final class Delayed extends MsgType {
        public static final Delayed b = new Delayed(null);
        public static final Serializer.c<Delayed> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Delayed> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Delayed a(Serializer serializer) {
                return Delayed.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Delayed[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof Delayed;
        }

        public final int hashCode() {
            return Delayed.class.hashCode();
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: MsgType.kt */
    public static final class Silent extends MsgType {
        public static final Silent b = new Silent(null);
        public static final Serializer.c<Silent> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Silent> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Silent a(Serializer serializer) {
                return Silent.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Silent[i];
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof Silent;
        }

        public final int hashCode() {
            return Silent.class.hashCode();
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
