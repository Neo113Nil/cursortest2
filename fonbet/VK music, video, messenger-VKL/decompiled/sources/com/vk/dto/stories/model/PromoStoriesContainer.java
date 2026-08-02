package com.vk.dto.stories.model;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stories.entities.PromoData;
import java.util.List;
import xsna.fsk;
import xsna.j5g;
import xsna.zcl;

/* compiled from: PromoStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class PromoStoriesContainer extends StoriesContainer {
    public static final Serializer.c<PromoStoriesContainer> CREATOR = new a();
    public final boolean o;
    public PromoData p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PromoStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PromoStoriesContainer a(Serializer serializer) {
            return new PromoStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromoStoriesContainer[i];
        }
    }

    public PromoStoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z, PromoData promoData, boolean z2) {
        super(storyOwner, list, str, z);
        this.p = promoData;
        this.o = z2;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Hb(int i) {
        Image image;
        ImageSize Cb;
        if (this.p == null || !fsk.B(this)) {
            return super.Hb(i);
        }
        PromoData promoData = this.p;
        if (promoData == null || (image = promoData.c) == null || (Cb = image.Cb(i, true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ib() {
        if (this.p == null || !fsk.B(this)) {
            return zb();
        }
        PromoData promoData = this.p;
        if (promoData != null) {
            return promoData.b;
        }
        return null;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.p);
        serializer.J(Boolean.valueOf(this.o));
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        String str;
        String str2 = this.f;
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(NotificationCompat.CATEGORY_PROMO);
        sb.append(Ab());
        StoryEntry storyEntry = (StoryEntry) j5g.b0(0, this.g);
        if (storyEntry == null || (str = storyEntry.getId()) == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public PromoStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.p = (PromoData) serializer.G(PromoData.class.getClassLoader());
        Boolean n = serializer.n();
        this.o = n != null ? n.booleanValue() : false;
    }
}
