package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.data.HotelsGalleryFullV2DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO_Item_VideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$Item$Video;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$Item$Video;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$Item$Video;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "videoMoleculeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "", "booleanAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO$VideoTrackingInfo;", "nullableVideoTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2DTO_Item_VideoJsonAdapter extends JsonAdapter<HotelsGalleryFullV2DTO.Item.Video> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HotelsGalleryFullV2DTO.Item.Video> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsGalleryFullV2DTO.VideoTrackingInfo> nullableVideoTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<VideoMolecule> videoMoleculeAdapter;

    public HotelsGalleryFullV2DTO_Item_VideoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("video", "previewImage", "isAutoplay", "videoTrackingInfo", "videoControlIcon");
        M m11 = M.f71699a;
        this.videoMoleculeAdapter = moshi.f(VideoMolecule.class, m11, "video");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "previewImage");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isAutoplay");
        this.nullableVideoTrackingInfoAdapter = moshi.f(HotelsGalleryFullV2DTO.VideoTrackingInfo.class, m11, "videoTrackingInfo");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "videoControlIcon");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(HotelsGalleryFullV2DTO.Item.Video)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsGalleryFullV2DTO.Item.Video fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        VideoMolecule videoMolecule = null;
        ImageDTO imageDTO = null;
        HotelsGalleryFullV2DTO.VideoTrackingInfo videoTrackingInfo = null;
        IconDTO iconDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                videoMolecule = this.videoMoleculeAdapter.fromJson(reader);
                if (videoMolecule == null) {
                    throw c.q("video", "video", reader);
                }
            } else if (v11 == 1) {
                imageDTO = this.imageDTOAdapter.fromJson(reader);
                if (imageDTO == null) {
                    throw c.q("previewImage", "previewImage", reader);
                }
            } else if (v11 == 2) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("isAutoplay", "isAutoplay", reader);
                }
                i11 = -5;
            } else if (v11 == 3) {
                videoTrackingInfo = this.nullableVideoTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 4 && (iconDTO = this.iconDTOAdapter.fromJson(reader)) == null) {
                throw c.q("videoControlIcon", "videoControlIcon", reader);
            }
        }
        reader.endObject();
        if (i11 == -5) {
            HotelsGalleryFullV2DTO.VideoTrackingInfo videoTrackingInfo2 = videoTrackingInfo;
            if (videoMolecule == null) {
                throw c.j("video", "video", reader);
            }
            if (imageDTO == null) {
                throw c.j("previewImage", "previewImage", reader);
            }
            boolean booleanValue = bool2.booleanValue();
            if (iconDTO == null) {
                throw c.j("videoControlIcon", "videoControlIcon", reader);
            }
            return new HotelsGalleryFullV2DTO.Item.Video(videoMolecule, imageDTO, booleanValue, videoTrackingInfo2, iconDTO);
        }
        HotelsGalleryFullV2DTO.VideoTrackingInfo videoTrackingInfo3 = videoTrackingInfo;
        Constructor<HotelsGalleryFullV2DTO.Item.Video> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsGalleryFullV2DTO.Item.Video.class.getDeclaredConstructor(VideoMolecule.class, ImageDTO.class, Boolean.TYPE, HotelsGalleryFullV2DTO.VideoTrackingInfo.class, IconDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (videoMolecule == null) {
            throw c.j("video", "video", reader);
        }
        if (imageDTO == null) {
            throw c.j("previewImage", "previewImage", reader);
        }
        if (iconDTO == null) {
            throw c.j("videoControlIcon", "videoControlIcon", reader);
        }
        HotelsGalleryFullV2DTO.Item.Video newInstance = constructor.newInstance(videoMolecule, imageDTO, bool2, videoTrackingInfo3, iconDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsGalleryFullV2DTO.Item.Video value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("video");
        this.videoMoleculeAdapter.mo44toJson(writer, (x) value.getVideo());
        writer.w("previewImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getPreviewImage());
        writer.w("isAutoplay");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isAutoplay()));
        writer.w("videoTrackingInfo");
        this.nullableVideoTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoTrackingInfo());
        writer.w("videoControlIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getVideoControlIcon());
        writer.p();
    }
}
