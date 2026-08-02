package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "preloadVideoInfoAdapter", "nullablePreloadVideoInfoAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "nullableReviewsPreviewTileDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "nullableStringAdapter", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "playbackTypeAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewVideoDTOJsonAdapter extends JsonAdapter<ReviewsPreviewVideoDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<PreloadVideoInfo> nullablePreloadVideoInfoAdapter;

    @NotNull
    private final JsonAdapter<ReviewsPreviewTileDTO> nullableReviewsPreviewTileDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ReviewsPreviewDTO.PlaybackType> playbackTypeAdapter;

    @NotNull
    private final JsonAdapter<PreloadVideoInfo> preloadVideoInfoAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReviewsPreviewVideoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("index", "preview", "videoInfo", "fullVideoInfo", "paranjaColor", "clickAction", "viewedItemAction", "tile", "videoStartTrackingInfo", "videoEndTrackingInfo", "itemTrackingInfo", "trackingInfo", "cornerImage", "cornerRadius", "horizontalPadding", "itemSpacing", "widgetBackgroundColor", "playbackType");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "index");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "preview");
        this.preloadVideoInfoAdapter = moshi.f(PreloadVideoInfo.class, m11, "videoInfo");
        this.nullablePreloadVideoInfoAdapter = moshi.f(PreloadVideoInfo.class, m11, "fullVideoInfo");
        this.stringAdapter = moshi.f(String.class, m11, "paranjaColor");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "clickAction");
        this.nullableReviewsPreviewTileDTOAdapter = moshi.f(ReviewsPreviewTileDTO.class, m11, "tile");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "videoStartTrackingInfo");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "cornerImage");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "horizontalPadding");
        this.nullableStringAdapter = moshi.f(String.class, m11, "widgetBackgroundColor");
        this.playbackTypeAdapter = moshi.f(ReviewsPreviewDTO.PlaybackType.class, m11, "playbackType");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(ReviewsPreviewVideoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewsPreviewVideoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        ImageDTO imageDTO = null;
        PreloadVideoInfo preloadVideoInfo = null;
        PreloadVideoInfo preloadVideoInfo2 = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        ReviewsPreviewTileDTO reviewsPreviewTileDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        ImageDTO imageDTO2 = null;
        CornerRadius cornerRadius = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        String str2 = null;
        ReviewsPreviewDTO.PlaybackType playbackType = null;
        while (true) {
            Integer num2 = num;
            ImageDTO imageDTO3 = imageDTO;
            PreloadVideoInfo preloadVideoInfo3 = preloadVideoInfo;
            if (!reader.hasNext()) {
                PreloadVideoInfo preloadVideoInfo4 = preloadVideoInfo2;
                reader.endObject();
                if (num2 == null) {
                    throw c.j("index", "index", reader);
                }
                int intValue = num2.intValue();
                if (imageDTO3 == null) {
                    throw c.j("preview", "preview", reader);
                }
                if (preloadVideoInfo3 == null) {
                    throw c.j("videoInfo", "videoInfo", reader);
                }
                if (str == null) {
                    throw c.j("paranjaColor", "paranjaColor", reader);
                }
                if (playbackType != null) {
                    return new ReviewsPreviewVideoDTO(intValue, imageDTO3, preloadVideoInfo3, preloadVideoInfo4, str, atomActionDTO, atomActionDTO2, reviewsPreviewTileDTO, map, map2, map3, map4, imageDTO2, cornerRadius, paddings, paddings2, str2, playbackType);
                }
                throw c.j("playbackType", "playbackType", reader);
            }
            PreloadVideoInfo preloadVideoInfo5 = preloadVideoInfo2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("index", "index", reader);
                    }
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 1:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("preview", "preview", reader);
                    }
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    preloadVideoInfo = preloadVideoInfo3;
                case 2:
                    preloadVideoInfo = this.preloadVideoInfoAdapter.fromJson(reader);
                    if (preloadVideoInfo == null) {
                        throw c.q("videoInfo", "videoInfo", reader);
                    }
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                case 3:
                    preloadVideoInfo2 = this.nullablePreloadVideoInfoAdapter.fromJson(reader);
                    num = num2;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("paranjaColor", "paranjaColor", reader);
                    }
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 6:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 7:
                    reviewsPreviewTileDTO = this.nullableReviewsPreviewTileDTOAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 9:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 10:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 11:
                    map4 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 12:
                    imageDTO2 = this.nullableImageDTOAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 13:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 14:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 15:
                    paddings2 = this.nullablePaddingsAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 16:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                case 17:
                    playbackType = this.playbackTypeAdapter.fromJson(reader);
                    if (playbackType == null) {
                        throw c.q("playbackType", "playbackType", reader);
                    }
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
                default:
                    num = num2;
                    preloadVideoInfo2 = preloadVideoInfo5;
                    imageDTO = imageDTO3;
                    preloadVideoInfo = preloadVideoInfo3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewsPreviewVideoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("index");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIndex()));
        writer.w("preview");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getPreview());
        writer.w("videoInfo");
        this.preloadVideoInfoAdapter.mo44toJson(writer, (x) value.getVideoInfo());
        writer.w("fullVideoInfo");
        this.nullablePreloadVideoInfoAdapter.mo44toJson(writer, (x) value.getFullVideoInfo());
        writer.w("paranjaColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getParanjaColor());
        writer.w("clickAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getClickAction());
        writer.w("viewedItemAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getViewedItemAction());
        writer.w("tile");
        this.nullableReviewsPreviewTileDTOAdapter.mo44toJson(writer, (x) value.getTile());
        writer.w("videoStartTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoStartTrackingInfo());
        writer.w("videoEndTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoEndTrackingInfo());
        writer.w("itemTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getItemTrackingInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("cornerImage");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getCornerImage());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("horizontalPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.w("itemSpacing");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getItemSpacing());
        writer.w("widgetBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetBackgroundColor());
        writer.w("playbackType");
        this.playbackTypeAdapter.mo44toJson(writer, (x) value.getPlaybackType());
        writer.p();
    }
}
