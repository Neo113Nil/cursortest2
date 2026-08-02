package com.vk.dto.specials;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: SpecialEvent.kt */
/* loaded from: classes18.dex */
public final class SpecialEvent implements Serializer.StreamParcelable {
    public static final Serializer.c<SpecialEvent> CREATOR = new a();
    public final String b;
    public final Animation c;
    public final Popup d;
    public final Markup e;

    /* compiled from: SpecialEvent.kt */
    public static final class Animation implements Serializer.StreamParcelable {
        public static final Serializer.c<Animation> CREATOR = new a();
        public final String b;
        public final long c;
        public final int d;
        public final int e;
        public final long f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Animation> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Animation a(Serializer serializer) {
                return new Animation(serializer.H(), serializer.w(), serializer.u(), serializer.u(), serializer.w());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Animation[i];
            }
        }

        public Animation(String str, long j, int i, int i2, long j2) {
            this.b = str;
            this.c = j;
            this.d = i;
            this.e = i2;
            this.f = j2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.Y(this.c);
            serializer.S(this.d);
            serializer.S(this.e);
            serializer.Y(this.f);
        }

        public final long d() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final long e() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: SpecialEvent.kt */
    public static final class Markup implements Serializer.StreamParcelable {
        public static final Serializer.c<Markup> CREATOR = new a();
        public final int[] b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Markup> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Markup a(Serializer serializer) {
                return new Markup(serializer.c());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Markup[i];
            }
        }

        public Markup(int[] iArr) {
            this.b = iArr;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.T(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: SpecialEvent.kt */
    public static final class Popup implements Serializer.StreamParcelable {
        public static final Serializer.c<Popup> CREATOR = new a();
        public final long b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Popup> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Popup a(Serializer serializer) {
                return new Popup(serializer.w());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(long j) {
            this.b = j;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.Y(this.b);
        }

        public final long d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SpecialEvent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SpecialEvent a(Serializer serializer) {
            return new SpecialEvent(serializer.H(), (Animation) serializer.G(Animation.class.getClassLoader()), (Popup) serializer.G(Popup.class.getClassLoader()), (Markup) serializer.G(Markup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpecialEvent[i];
        }
    }

    public SpecialEvent(String str, Animation animation, Popup popup, Markup markup) {
        this.b = str;
        this.c = animation;
        this.d = popup;
        this.e = markup;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
    }

    public final Animation d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Popup e() {
        return this.d;
    }

    public final String getId() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
