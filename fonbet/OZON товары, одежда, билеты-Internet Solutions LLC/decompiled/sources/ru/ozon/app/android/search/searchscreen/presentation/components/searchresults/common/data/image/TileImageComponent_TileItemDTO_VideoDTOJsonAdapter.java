package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image;

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
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image.TileImageComponent;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent_TileItemDTO_VideoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO$VideoTracking;", "nullableVideoTrackingAdapter", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "nullableContentModeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileImageComponent_TileItemDTO_VideoDTOJsonAdapter extends JsonAdapter<TileImageComponent.TileItemDTO.VideoDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TileImageComponent.TileItemDTO.VideoDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ContentMode> nullableContentModeAdapter;

    @NotNull
    private final JsonAdapter<TileImageComponent.TileItemDTO.VideoDTO.VideoTracking> nullableVideoTrackingAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TileImageComponent_TileItemDTO_VideoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("preview", "link", "tracking", "previewContentMode");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "preview");
        this.nullableVideoTrackingAdapter = moshi.f(TileImageComponent.TileItemDTO.VideoDTO.VideoTracking.class, m11, "tracking");
        this.nullableContentModeAdapter = moshi.f(ContentMode.class, m11, "previewContentMode");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(TileImageComponent.TileItemDTO.VideoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileImageComponent.TileItemDTO.VideoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        TileImageComponent.TileItemDTO.VideoDTO.VideoTracking videoTracking = null;
        ContentMode contentMode = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("preview", "preview", reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("link", "link", reader);
                }
            } else if (v11 == 2) {
                videoTracking = this.nullableVideoTrackingAdapter.fromJson(reader);
            } else if (v11 == 3) {
                contentMode = this.nullableContentModeAdapter.fromJson(reader);
                i11 = -9;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            if (str == null) {
                throw c.j("preview", "preview", reader);
            }
            if (str2 != null) {
                return new TileImageComponent.TileItemDTO.VideoDTO(str, str2, videoTracking, contentMode);
            }
            throw c.j("link", "link", reader);
        }
        Constructor<TileImageComponent.TileItemDTO.VideoDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileImageComponent.TileItemDTO.VideoDTO.class.getDeclaredConstructor(String.class, String.class, TileImageComponent.TileItemDTO.VideoDTO.VideoTracking.class, ContentMode.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("preview", "preview", reader);
        }
        if (str2 == null) {
            throw c.j("link", "link", reader);
        }
        TileImageComponent.TileItemDTO.VideoDTO newInstance = constructor.newInstance(str, str2, videoTracking, contentMode, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileImageComponent.TileItemDTO.VideoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("preview");
        this.stringAdapter.mo44toJson(writer, (x) value.getPreview());
        writer.w("link");
        this.stringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("tracking");
        this.nullableVideoTrackingAdapter.mo44toJson(writer, (x) value.getTracking());
        writer.w("previewContentMode");
        this.nullableContentModeAdapter.mo44toJson(writer, (x) value.getPreviewContentMode());
        writer.p();
    }
}
