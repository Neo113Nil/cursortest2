package ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data;

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
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$Variant;", "listOfVariantAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$LayoutType;", "layoutTypeAdapter", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;", "nullableAspectInfoAdapter", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;", "nullableMarkdownReasonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4DTOJsonAdapter extends JsonAdapter<AspectsV4DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AspectsV4DTO.LayoutType> layoutTypeAdapter;

    @NotNull
    private final JsonAdapter<List<AspectsV4DTO.Variant>> listOfVariantAdapter;

    @NotNull
    private final JsonAdapter<AspectsV4DTO.AspectInfo> nullableAspectInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AspectsV4DTO.MarkdownReason> nullableMarkdownReasonAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AspectsV4DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("variants", "selectedColor", "layoutType", "aspectInfo", "markdownReason", "trackingInfo");
        b e11 = D.e(List.class, AspectsV4DTO.Variant.class);
        M m11 = M.f71699a;
        this.listOfVariantAdapter = moshi.f(e11, m11, "variants");
        this.stringAdapter = moshi.f(String.class, m11, "selectedColor");
        this.layoutTypeAdapter = moshi.f(AspectsV4DTO.LayoutType.class, m11, "layoutType");
        this.nullableAspectInfoAdapter = moshi.f(AspectsV4DTO.AspectInfo.class, m11, "aspectInfo");
        this.nullableMarkdownReasonAdapter = moshi.f(AspectsV4DTO.MarkdownReason.class, m11, "markdownReason");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(AspectsV4DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AspectsV4DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<AspectsV4DTO.Variant> list = null;
        String str = null;
        AspectsV4DTO.LayoutType layoutType = null;
        AspectsV4DTO.AspectInfo aspectInfo = null;
        AspectsV4DTO.MarkdownReason markdownReason = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfVariantAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("variants", "variants", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("selectedColor", "selectedColor", reader);
                    }
                    break;
                case 2:
                    layoutType = this.layoutTypeAdapter.fromJson(reader);
                    if (layoutType == null) {
                        throw c.q("layoutType", "layoutType", reader);
                    }
                    break;
                case 3:
                    aspectInfo = this.nullableAspectInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    markdownReason = this.nullableMarkdownReasonAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("variants", "variants", reader);
        }
        if (str == null) {
            throw c.j("selectedColor", "selectedColor", reader);
        }
        if (layoutType != null) {
            return new AspectsV4DTO(list, str, layoutType, aspectInfo, markdownReason, map);
        }
        throw c.j("layoutType", "layoutType", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AspectsV4DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("variants");
        this.listOfVariantAdapter.mo44toJson(writer, (x) value.getVariants());
        writer.w("selectedColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getSelectedColor());
        writer.w("layoutType");
        this.layoutTypeAdapter.mo44toJson(writer, (x) value.getLayoutType());
        writer.w("aspectInfo");
        this.nullableAspectInfoAdapter.mo44toJson(writer, (x) value.getAspectInfo());
        writer.w("markdownReason");
        this.nullableMarkdownReasonAdapter.mo44toJson(writer, (x) value.getMarkdownReason());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
