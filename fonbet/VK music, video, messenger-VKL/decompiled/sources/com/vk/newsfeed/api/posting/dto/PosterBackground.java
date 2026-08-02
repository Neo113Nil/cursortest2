package com.vk.newsfeed.api.posting.dto;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.Objects;
import xsna.epx;
import xsna.fkq0;
import xsna.zcl;

/* compiled from: PosterBackground.kt */
/* loaded from: classes3.dex */
public final class PosterBackground extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PosterBackground> CREATOR;
    public static final UserId j = new UserId(-3);
    public final int b;
    public final UserId c;
    public final int d;
    public final int e;
    public final Image f;
    public final Image g;
    public final Image h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PosterBackground> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PosterBackground a(Serializer serializer) {
            return new PosterBackground(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.u(), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PosterBackground[i];
        }
    }

    static {
        new PosterBackground(0, UserId.d, -16777216, -1, null, null, null, null, 128, null);
        CREATOR = new a();
    }

    public /* synthetic */ PosterBackground(int i, UserId userId, int i2, int i3, Image image, Image image2, Image image3, String str, int i4, zcl zclVar) {
        this(i, userId, i2, i3, image, image2, image3, (i4 & 128) != 0 ? null : str);
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
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PosterBackground)) {
            return false;
        }
        PosterBackground posterBackground = (PosterBackground) obj;
        return this.b == posterBackground.b && epx.f(this.c, posterBackground.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    public final boolean zb() {
        if (this.b == -2) {
            return true;
        }
        UserId userId = j;
        UserId userId2 = this.c;
        return epx.f(userId2, userId) || fkq0.c(userId2);
    }

    public PosterBackground(int i, UserId userId, int i2, int i3, Image image, Image image2, Image image3, String str) {
        this.b = i;
        this.c = userId;
        this.d = i2;
        this.e = i3;
        this.f = image;
        this.g = image2;
        this.h = image3;
        this.i = str;
    }
}
