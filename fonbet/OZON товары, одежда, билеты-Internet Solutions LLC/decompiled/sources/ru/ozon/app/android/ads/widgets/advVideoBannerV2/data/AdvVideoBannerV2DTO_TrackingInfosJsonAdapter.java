package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

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
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO_TrackingInfosJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "mapOfStringTokenizedTrackingInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2DTO_TrackingInfosJsonAdapter extends JsonAdapter<AdvVideoBannerV2DTO.TrackingInfos> {

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> mapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public AdvVideoBannerV2DTO_TrackingInfosJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("videoView", "videoStart", "videoClick", "videoSoundOn", "videoSoundOff", "videoQ1", "videoQ2", "videoQ3", "videoEnd", "videoViewableImpressions");
        this.mapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), M.f71699a, "videoView");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(AdvVideoBannerV2DTO.TrackingInfos)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdvVideoBannerV2DTO.TrackingInfos fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        Map<String, TokenizedTrackingInfo> map5 = null;
        Map<String, TokenizedTrackingInfo> map6 = null;
        Map<String, TokenizedTrackingInfo> map7 = null;
        Map<String, TokenizedTrackingInfo> map8 = null;
        Map<String, TokenizedTrackingInfo> map9 = null;
        Map<String, TokenizedTrackingInfo> map10 = null;
        while (true) {
            Map<String, TokenizedTrackingInfo> map11 = map;
            Map<String, TokenizedTrackingInfo> map12 = map2;
            Map<String, TokenizedTrackingInfo> map13 = map3;
            Map<String, TokenizedTrackingInfo> map14 = map4;
            Map<String, TokenizedTrackingInfo> map15 = map5;
            Map<String, TokenizedTrackingInfo> map16 = map6;
            if (!reader.hasNext()) {
                Map<String, TokenizedTrackingInfo> map17 = map7;
                reader.endObject();
                if (map11 == null) {
                    throw c.j("videoView", "videoView", reader);
                }
                if (map12 == null) {
                    throw c.j("videoStart", "videoStart", reader);
                }
                if (map13 == null) {
                    throw c.j("videoClick", "videoClick", reader);
                }
                if (map14 == null) {
                    throw c.j("videoSoundOn", "videoSoundOn", reader);
                }
                if (map15 == null) {
                    throw c.j("videoSoundOff", "videoSoundOff", reader);
                }
                if (map16 == null) {
                    throw c.j("videoQ1", "videoQ1", reader);
                }
                if (map17 == null) {
                    throw c.j("videoQ2", "videoQ2", reader);
                }
                if (map8 == null) {
                    throw c.j("videoQ3", "videoQ3", reader);
                }
                if (map9 == null) {
                    throw c.j("videoEnd", "videoEnd", reader);
                }
                if (map10 != null) {
                    return new AdvVideoBannerV2DTO.TrackingInfos(map11, map12, map13, map14, map15, map16, map17, map8, map9, map10);
                }
                throw c.j("videoViewableImpressions", "videoViewableImpressions", reader);
            }
            Map<String, TokenizedTrackingInfo> map18 = map7;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 0:
                    map = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map == null) {
                        throw c.q("videoView", "videoView", reader);
                    }
                    map7 = map18;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 1:
                    map2 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map2 == null) {
                        throw c.q("videoStart", "videoStart", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 2:
                    map3 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map3 == null) {
                        throw c.q("videoClick", "videoClick", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 3:
                    map4 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map4 == null) {
                        throw c.q("videoSoundOn", "videoSoundOn", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map5 = map15;
                    map6 = map16;
                case 4:
                    map5 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map5 == null) {
                        throw c.q("videoSoundOff", "videoSoundOff", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map6 = map16;
                case 5:
                    map6 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map6 == null) {
                        throw c.q("videoQ1", "videoQ1", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                case 6:
                    map7 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map7 == null) {
                        throw c.q("videoQ2", "videoQ2", reader);
                    }
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 7:
                    map8 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map8 == null) {
                        throw c.q("videoQ3", "videoQ3", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 8:
                    map9 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map9 == null) {
                        throw c.q("videoEnd", "videoEnd", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                case 9:
                    map10 = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    if (map10 == null) {
                        throw c.q("videoViewableImpressions", "videoViewableImpressions", reader);
                    }
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
                default:
                    map7 = map18;
                    map = map11;
                    map2 = map12;
                    map3 = map13;
                    map4 = map14;
                    map5 = map15;
                    map6 = map16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdvVideoBannerV2DTO.TrackingInfos value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("videoView");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoView());
        writer.w("videoStart");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoStart());
        writer.w("videoClick");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoClick());
        writer.w("videoSoundOn");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoSoundOn());
        writer.w("videoSoundOff");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoSoundOff());
        writer.w("videoQ1");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoQ1());
        writer.w("videoQ2");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoQ2());
        writer.w("videoQ3");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoQ3());
        writer.w("videoEnd");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoEnd());
        writer.w("videoViewableImpressions");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVideoViewableImpressions());
        writer.p();
    }
}
