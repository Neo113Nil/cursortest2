package com.vk.dto.stories.entities;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;

/* compiled from: PromoData.kt */
/* loaded from: classes18.dex */
public final class PromoData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PromoData> CREATOR = new a();
    public final String b;
    public final Image c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PromoData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PromoData a(Serializer serializer) {
            return new PromoData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromoData[i];
        }
    }

    public PromoData(String str, Image image, boolean z) {
        this.b = str;
        this.c = image;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public PromoData(Serializer serializer) {
        this(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.m());
    }
}
