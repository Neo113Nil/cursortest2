package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO_Block_ImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "nullablePreloadVideoInfoAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UgcCountersDTO_Block_ImageJsonAdapter extends JsonAdapter<UgcCountersDTO.Block.Image> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<PreloadVideoInfo> nullablePreloadVideoInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public UgcCountersDTO_Block_ImageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("urls", "label", "action", "onboarding", "trackingInfo", "videoInfo", "cornerRadius");
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        this.listOfStringAdapter = moshi.f(e11, m11, "urls");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "label");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullablePreloadVideoInfoAdapter = moshi.f(PreloadVideoInfo.class, m11, "videoInfo");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(48, "GeneratedJsonAdapter(UgcCountersDTO.Block.Image)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UgcCountersDTO.Block.Image fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<String> list = null;
        TextAtom textAtom = null;
        AtomActionDTO atomActionDTO = null;
        OnBoardingDTO onBoardingDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        PreloadVideoInfo preloadVideoInfo = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("urls", "urls", reader);
                    }
                    break;
                case 1:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    preloadVideoInfo = this.nullablePreloadVideoInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new UgcCountersDTO.Block.Image(list, textAtom, atomActionDTO, onBoardingDTO, map, preloadVideoInfo, cornerRadius);
        }
        throw c.j("urls", "urls", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UgcCountersDTO.Block.Image value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("urls");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getUrls());
        writer.w("label");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("videoInfo");
        this.nullablePreloadVideoInfoAdapter.mo44toJson(writer, (x) value.getVideoInfo());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
