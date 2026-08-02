package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

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
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO_VideoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "trackingInfosAdapter", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2DTO_VideoDTOJsonAdapter extends JsonAdapter<AdvVideoBannerV2DTO.VideoDTO> {

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<AdvVideoBannerV2DTO.TrackingInfos> trackingInfosAdapter;

    public AdvVideoBannerV2DTO_VideoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("playlistUrl", "previewUrl", "deeplink", "initialVolume", "trackingInfos");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "playlistUrl");
        this.doubleAdapter = moshi.f(Double.TYPE, m11, "initialVolume");
        this.trackingInfosAdapter = moshi.f(AdvVideoBannerV2DTO.TrackingInfos.class, m11, "trackingInfos");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(AdvVideoBannerV2DTO.VideoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdvVideoBannerV2DTO.VideoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double d11 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        AdvVideoBannerV2DTO.TrackingInfos trackingInfos = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("playlistUrl", "playlistUrl", reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("previewUrl", "previewUrl", reader);
                }
            } else if (v11 == 2) {
                str3 = this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw c.q("deeplink", "deeplink", reader);
                }
            } else if (v11 == 3) {
                d11 = this.doubleAdapter.fromJson(reader);
                if (d11 == null) {
                    throw c.q("initialVolume", "initialVolume", reader);
                }
            } else if (v11 == 4 && (trackingInfos = this.trackingInfosAdapter.fromJson(reader)) == null) {
                throw c.q("trackingInfos", "trackingInfos", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("playlistUrl", "playlistUrl", reader);
        }
        if (str2 == null) {
            throw c.j("previewUrl", "previewUrl", reader);
        }
        if (str3 == null) {
            throw c.j("deeplink", "deeplink", reader);
        }
        if (d11 == null) {
            throw c.j("initialVolume", "initialVolume", reader);
        }
        double doubleValue = d11.doubleValue();
        if (trackingInfos != null) {
            return new AdvVideoBannerV2DTO.VideoDTO(str, str2, str3, doubleValue, trackingInfos);
        }
        throw c.j("trackingInfos", "trackingInfos", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdvVideoBannerV2DTO.VideoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("playlistUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getPlaylistUrl());
        writer.w("previewUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getPreviewUrl());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("initialVolume");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getInitialVolume()));
        writer.w("trackingInfos");
        this.trackingInfosAdapter.mo44toJson(writer, (x) value.getTrackingInfos());
        writer.p();
    }
}
