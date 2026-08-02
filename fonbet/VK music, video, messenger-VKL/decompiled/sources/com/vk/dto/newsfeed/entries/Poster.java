package com.vk.dto.newsfeed.entries;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.Objects;

/* compiled from: Poster.kt */
/* loaded from: classes18.dex */
public final class Poster extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Poster> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final int d;
    public final int e;
    public final Image f;
    public final Image g;
    public final Constants h;
    public final boolean i;
    public final Owner j;
    public final String k;
    public final String l;

    /* compiled from: Poster.kt */
    public static final class Constants extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Constants> CREATOR = new a();
        public static final Constants i = new Constants(160, 104, 0.06111f, 0.07222f, 0.06111f, 0.07222f, 5);
        public final int b;
        public final int c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final int h;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Constants> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Constants a(Serializer serializer) {
                return new Constants(serializer.u(), serializer.u(), serializer.s(), serializer.s(), serializer.s(), serializer.s(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Constants[i];
            }
        }

        public Constants(int i2, int i3, float f, float f2, float f3, float f4, int i4) {
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = i4;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.P(this.d);
            serializer.P(this.e);
            serializer.P(this.f);
            serializer.P(this.g);
            serializer.S(this.h);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Constants)) {
                return false;
            }
            Constants constants = (Constants) obj;
            return this.b == constants.b && this.c == constants.c && this.d == constants.d && this.e == constants.e && this.f == constants.f && this.g == constants.g && this.h == constants.h;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Integer.valueOf(this.h));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Poster> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Poster a(Serializer serializer) {
            int u = serializer.u();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            int u2 = serializer.u();
            int u3 = serializer.u();
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            Image image2 = (Image) serializer.G(Image.class.getClassLoader());
            Constants constants = (Constants) serializer.G(Constants.class.getClassLoader());
            if (constants == null) {
                constants = Constants.i;
            }
            return new Poster(u, userId, u2, u3, image, image2, constants, serializer.m(), (Owner) serializer.G(Owner.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Poster[i];
        }
    }

    public Poster(int i, UserId userId, int i2, int i3, Image image, Image image2, Constants constants, boolean z, Owner owner, String str, String str2) {
        this.b = i;
        this.c = userId;
        this.d = i2;
        this.e = i3;
        this.f = image;
        this.g = image2;
        this.h = constants;
        this.i = z;
        this.j = owner;
        this.k = str;
        this.l = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.i0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
    }
}
