package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.drm0;
import xsna.epx;
import xsna.er;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickerStockItemPreviewImage.kt */
/* loaded from: classes18.dex */
public final class StickerStockItemPreviewImage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerStockItemPreviewImage> CREATOR = new b();

    @pmi0("baseUrl")
    private final String baseUrl;

    @pmi0("imageSquare")
    private final Image imageSquare;

    @pmi0("imageWide")
    private final Image imageWide;

    /* compiled from: StickerStockItemPreviewImage.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static StickerStockItemPreviewImage a(JSONObject jSONObject) {
            String string = jSONObject.getString("base_url");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String string2 = jSONObject2.getString("id");
                    int i2 = 2;
                    String str = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    if (drm0.D(string2, "square", false)) {
                        arrayList.add(new ImageSize(jSONObject2, str, i2, (zcl) (objArr3 == true ? 1 : 0)));
                    } else if (drm0.D(string2, "wide", false)) {
                        arrayList2.add(new ImageSize(jSONObject2, (String) (objArr2 == true ? 1 : 0), i2, (zcl) (objArr == true ? 1 : 0)));
                    }
                }
            }
            return new StickerStockItemPreviewImage(string, new Image(arrayList), new Image(arrayList2));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerStockItemPreviewImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerStockItemPreviewImage a(Serializer serializer) {
            return new StickerStockItemPreviewImage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerStockItemPreviewImage[i];
        }
    }

    public /* synthetic */ StickerStockItemPreviewImage(String str, Image image, Image image2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : image2);
    }

    public final Image Ab() {
        return this.imageSquare;
    }

    public final Image Bb() {
        return this.imageWide;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.baseUrl);
        serializer.i0(this.imageSquare);
        serializer.i0(this.imageWide);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerStockItemPreviewImage)) {
            return false;
        }
        StickerStockItemPreviewImage stickerStockItemPreviewImage = (StickerStockItemPreviewImage) obj;
        return epx.f(this.baseUrl, stickerStockItemPreviewImage.baseUrl) && epx.f(this.imageSquare, stickerStockItemPreviewImage.imageSquare) && epx.f(this.imageWide, stickerStockItemPreviewImage.imageWide);
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        Image image = this.imageSquare;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.imageWide;
        return hashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerStockItemPreviewImage(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", imageSquare=");
        sb.append(this.imageSquare);
        sb.append(", imageWide=");
        return er.d(sb, this.imageWide, ')');
    }

    public final String zb() {
        return this.baseUrl;
    }

    public StickerStockItemPreviewImage(String str, Image image, Image image2) {
        this.baseUrl = str;
        this.imageSquare = image;
        this.imageWide = image2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StickerStockItemPreviewImage(Serializer serializer) {
        this(r0 == null ? "" : r0, (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()));
        String H = serializer.H();
    }
}
