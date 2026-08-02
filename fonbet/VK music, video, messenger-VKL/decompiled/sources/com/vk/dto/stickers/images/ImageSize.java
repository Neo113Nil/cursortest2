package com.vk.dto.stickers.images;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.Image;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ImageSize.kt */
/* loaded from: classes18.dex */
public final class ImageSize extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImageSize> CREATOR = new a();

    @pmi0("formats")
    private final List<ImageFormat> formats;

    @pmi0("height")
    private final int height;

    @pmi0("modifier")
    private final String modifier;

    @pmi0("width")
    private final int width;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImageSize> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageSize a(Serializer serializer) {
            return new ImageSize(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageSize[i];
        }
    }

    public /* synthetic */ ImageSize(Serializer serializer, zcl zclVar) {
        this(serializer);
    }

    public final String Ab() {
        return this.modifier;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.width);
        serializer.S(this.height);
        serializer.j0(this.modifier);
        serializer.o0(this.formats);
    }

    public final int e6() {
        return this.width * this.height;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSize)) {
            return false;
        }
        ImageSize imageSize = (ImageSize) obj;
        return this.width == imageSize.width && this.height == imageSize.height && epx.f(this.modifier, imageSize.modifier) && epx.f(this.formats, imageSize.formats);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return this.formats.hashCode() + urd0.a(shy.a(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.modifier);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageSize(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", modifier=");
        sb.append(this.modifier);
        sb.append(", formats=");
        return ms9.a(')', sb, this.formats);
    }

    public final List<ImageFormat> zb() {
        return this.formats;
    }

    public ImageSize(int i, int i2, String str, List list, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? EmptyList.b : list);
    }

    public ImageSize(Image image) {
        this(image.b, image.c, null, null, 12, null);
    }

    public ImageSize(int i, int i2, String str, List<ImageFormat> list) {
        this.width = i;
        this.height = i2;
        this.modifier = str;
        this.formats = list;
    }

    public ImageSize() {
        this(-1, -1, null, null, 12, null);
    }

    private ImageSize(Serializer serializer) {
        this(serializer.u(), serializer.u(), serializer.H(), serializer.j(ImageFormat.CREATOR));
    }
}
