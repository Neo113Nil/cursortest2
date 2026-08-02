package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.bxx;
import xsna.pmi0;
import xsna.pn00;
import xsna.zcl;

/* compiled from: GiftSuggestionConfig.kt */
/* loaded from: classes18.dex */
public final class GiftSuggestionConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<GiftSuggestionConfig> CREATOR = new b();

    @pmi0("giftSuggestionImage")
    private final Image giftSuggestionImage;

    @pmi0("giftSuggestionImageDark")
    private final Image giftSuggestionImageDark;

    @pmi0("giftSuggestionImagePlaceholder")
    private final Image giftSuggestionImagePlaceholder;

    @pmi0("giftSuggestionImagePlaceholderDark")
    private final Image giftSuggestionImagePlaceholderDark;

    /* compiled from: GiftSuggestionConfig.kt */
    public static final class a {
        public static GiftSuggestionConfig a(JSONObject jSONObject) {
            return new GiftSuggestionConfig(new Image(jSONObject.optJSONArray("giftSuggestionImage"), null, 2, null), new Image(jSONObject.optJSONArray("giftSuggestionImageDark"), null, 2, null), new Image(jSONObject.optJSONArray("giftSuggestionImagePlaceholder"), null, 2, null), new Image(jSONObject.optJSONArray("giftSuggestionImagePlaceholderDark"), null, 2, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftSuggestionConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftSuggestionConfig a(Serializer serializer) {
            return new GiftSuggestionConfig(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftSuggestionConfig[i];
        }
    }

    public GiftSuggestionConfig() {
        this(null, null, null, null, 15, null);
    }

    public final Image Ab() {
        return this.giftSuggestionImageDark;
    }

    public final Image Bb() {
        return this.giftSuggestionImagePlaceholder;
    }

    public final Image Cb() {
        return this.giftSuggestionImagePlaceholderDark;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.giftSuggestionImage);
        serializer.i0(this.giftSuggestionImageDark);
        serializer.i0(this.giftSuggestionImagePlaceholder);
        serializer.i0(this.giftSuggestionImagePlaceholderDark);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        Image image = this.giftSuggestionImage;
        Pair pair = new Pair("giftSuggestionImage", image != null ? image.Gb() : null);
        Image image2 = this.giftSuggestionImageDark;
        Pair pair2 = new Pair("giftSuggestionImageDark", image2 != null ? image2.Gb() : null);
        Image image3 = this.giftSuggestionImagePlaceholder;
        Pair pair3 = new Pair("giftSuggestionImagePlaceholder", image3 != null ? image3.Gb() : null);
        Image image4 = this.giftSuggestionImagePlaceholderDark;
        return new JSONObject(pn00.k(pair, pair2, pair3, new Pair("giftSuggestionImagePlaceholderDark", image4 != null ? image4.Gb() : null)));
    }

    public final Image zb() {
        return this.giftSuggestionImage;
    }

    public /* synthetic */ GiftSuggestionConfig(Image image, Image image2, Image image3, Image image4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : image2, (i & 4) != 0 ? null : image3, (i & 8) != 0 ? null : image4);
    }

    public GiftSuggestionConfig(Image image, Image image2, Image image3, Image image4) {
        this.giftSuggestionImage = image;
        this.giftSuggestionImageDark = image2;
        this.giftSuggestionImagePlaceholder = image3;
        this.giftSuggestionImagePlaceholderDark = image4;
    }

    public GiftSuggestionConfig(Serializer serializer) {
        this((Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()));
    }
}
