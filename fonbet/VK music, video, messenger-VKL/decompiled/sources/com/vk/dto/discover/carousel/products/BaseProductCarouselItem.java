package com.vk.dto.discover.carousel.products;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.CarouselItem;
import xsna.zcl;

/* compiled from: BaseProductCarouselItem.kt */
/* loaded from: classes18.dex */
public class BaseProductCarouselItem extends CarouselItem {
    public static final Serializer.c<BaseProductCarouselItem> CREATOR = new a();
    public Integer b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BaseProductCarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BaseProductCarouselItem a(Serializer serializer) {
            return new BaseProductCarouselItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BaseProductCarouselItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseProductCarouselItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.V(d());
    }

    public Integer d() {
        return this.b;
    }

    public void e(Integer num) {
        this.b = num;
    }

    public /* synthetic */ BaseProductCarouselItem(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }

    public BaseProductCarouselItem(Integer num) {
        this.b = num;
    }

    public BaseProductCarouselItem(Serializer serializer) {
        this(serializer.v());
    }
}
