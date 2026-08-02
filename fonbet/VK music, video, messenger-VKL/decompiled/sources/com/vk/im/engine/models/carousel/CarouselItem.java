package com.vk.im.engine.models.carousel;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.conversations.BotKeyboard;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CarouselItem.kt */
/* loaded from: classes2.dex */
public final class CarouselItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CarouselItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final ImageList f;
    public final BotKeyboard g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CarouselItem a(Serializer serializer) {
            return new CarouselItem(serializer.H(), serializer.H(), serializer.H(), serializer.m(), (ImageList) serializer.G(ImageList.class.getClassLoader()), (BotKeyboard) serializer.G(BotKeyboard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarouselItem[i];
        }
    }

    public CarouselItem(String str, String str2, String str3, boolean z, ImageList imageList, BotKeyboard botKeyboard) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = imageList;
        this.g = botKeyboard;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.f);
        serializer.i0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselItem)) {
            return false;
        }
        CarouselItem carouselItem = (CarouselItem) obj;
        return epx.f(this.b, carouselItem.b) && epx.f(this.c, carouselItem.c) && epx.f(this.d, carouselItem.d) && this.e == carouselItem.e && epx.f(this.f, carouselItem.f) && epx.f(this.g, carouselItem.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int a3 = fw3.a(qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f.b);
        BotKeyboard botKeyboard = this.g;
        return a3 + (botKeyboard != null ? botKeyboard.hashCode() : 0);
    }

    public final String toString() {
        return "CarouselItem(title=" + this.b + ", description=" + this.c + ", link=" + this.d + ", photoAllowedToOpen=" + this.e + ", photo=" + this.f + ", keyboard=" + this.g + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CarouselItem(CarouselItem carouselItem) {
        this(r1, r2, r3, r4, r5, r8 != null ? r8.zb() : null);
        String str = carouselItem.b;
        String str2 = carouselItem.c;
        String str3 = carouselItem.d;
        boolean z = carouselItem.e;
        ImageList imageList = carouselItem.f;
        imageList.getClass();
        ImageList imageList2 = new ImageList(imageList);
        BotKeyboard botKeyboard = carouselItem.g;
    }
}
