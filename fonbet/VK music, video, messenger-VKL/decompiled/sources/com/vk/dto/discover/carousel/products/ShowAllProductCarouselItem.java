package com.vk.dto.discover.carousel.products;

import xsna.epx;
import xsna.ho8;

/* compiled from: ShowAllProductCarouselItem.kt */
/* loaded from: classes18.dex */
public final class ShowAllProductCarouselItem extends BaseProductCarouselItem {
    public final String c;

    public ShowAllProductCarouselItem(String str) {
        super(null, 1, null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowAllProductCarouselItem) && epx.f(this.c, ((ShowAllProductCarouselItem) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ShowAllProductCarouselItem(text="), this.c, ')');
    }
}
