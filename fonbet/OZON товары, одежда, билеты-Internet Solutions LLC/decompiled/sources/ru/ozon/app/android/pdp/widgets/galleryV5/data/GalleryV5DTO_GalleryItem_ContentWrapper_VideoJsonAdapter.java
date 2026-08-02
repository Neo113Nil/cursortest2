package ru.ozon.app.android.pdp.widgets.galleryV5.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5DTO;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO_GalleryItem_ContentWrapper_VideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Video;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Video;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Video;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "videoMoleculeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$VideoTrackingInfo;", "nullableVideoTrackingInfoAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5DTO_GalleryItem_ContentWrapper_VideoJsonAdapter extends JsonAdapter<GalleryV5DTO.GalleryItem.ContentWrapper.Video> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<GalleryV5DTO.GalleryItem.VideoTrackingInfo> nullableVideoTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<VideoMolecule> videoMoleculeAdapter;

    public GalleryV5DTO_GalleryItem_ContentWrapper_VideoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("video", "previewUrl", "isAutoPlay", "videoTrackingInfo");
        M m11 = M.f71699a;
        this.videoMoleculeAdapter = moshi.f(VideoMolecule.class, m11, "video");
        this.stringAdapter = moshi.f(String.class, m11, "previewUrl");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isAutoPlay");
        this.nullableVideoTrackingInfoAdapter = moshi.f(GalleryV5DTO.GalleryItem.VideoTrackingInfo.class, m11, "videoTrackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(67, "GeneratedJsonAdapter(GalleryV5DTO.GalleryItem.ContentWrapper.Video)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GalleryV5DTO.GalleryItem.ContentWrapper.Video fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        VideoMolecule videoMolecule = null;
        String str = null;
        Boolean bool = null;
        GalleryV5DTO.GalleryItem.VideoTrackingInfo videoTrackingInfo = null;
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
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("previewUrl", "previewUrl", reader);
                }
            } else if (v11 == 2) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 3) {
                videoTrackingInfo = this.nullableVideoTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (videoMolecule == null) {
            throw c.j("video", "video", reader);
        }
        if (str != null) {
            return new GalleryV5DTO.GalleryItem.ContentWrapper.Video(videoMolecule, str, bool, videoTrackingInfo);
        }
        throw c.j("previewUrl", "previewUrl", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GalleryV5DTO.GalleryItem.ContentWrapper.Video value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("video");
        this.videoMoleculeAdapter.mo44toJson(writer, (x) value.getVideo());
        writer.w("previewUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getPreviewUrl());
        writer.w("isAutoPlay");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isAutoPlay());
        writer.w("videoTrackingInfo");
        this.nullableVideoTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoTrackingInfo());
        writer.p();
    }
}
