package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data.GalleryV2DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GalleryV2Config$parser$1 extends AbstractC7737t implements Function2<String, String, GalleryV2DTO> {
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ GalleryV2Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV2Config$parser$1(GalleryV2Config galleryV2Config, JsonParser jsonParser) {
        super(2);
        this.this$0 = galleryV2Config;
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final GalleryV2DTO invoke(String str, String str2) {
        GalleryV2DTO emptyGallery;
        if (str2 != null) {
            GalleryV2DTO emptyGallery2 = (h.t(str2, "images", false) || h.t(str2, "videos", false) || h.t(str2, "photo360", false)) ? (GalleryV2DTO) this.$jsonDeserializer.fromJson(str2, GalleryV2DTO.class) : this.this$0.getEmptyGallery();
            if (emptyGallery2 != null) {
                return emptyGallery2;
            }
        }
        emptyGallery = this.this$0.getEmptyGallery();
        return emptyGallery;
    }
}
