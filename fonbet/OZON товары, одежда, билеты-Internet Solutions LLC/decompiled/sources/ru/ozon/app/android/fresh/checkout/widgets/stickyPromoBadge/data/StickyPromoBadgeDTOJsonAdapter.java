package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data;

import Ak.b;
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
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data.StickyPromoBadgeDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$Image;", "nullableListOfImageAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;", "nullableSpacersDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBadgeDTOJsonAdapter extends JsonAdapter<StickyPromoBadgeDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<List<StickyPromoBadgeDTO.Image>> nullableListOfImageAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<StickyPromoBadgeDTO.SpacersDTO> nullableSpacersDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public StickyPromoBadgeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badge", "startText", "endText", "images", "spacers", "backgroundColor", "cornerRadius", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "startText");
        this.nullableListOfImageAdapter = moshi.f(D.e(List.class, StickyPromoBadgeDTO.Image.class), m11, "images");
        this.nullableSpacersDTOAdapter = moshi.f(StickyPromoBadgeDTO.SpacersDTO.class, m11, "spacers");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(StickyPromoBadgeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StickyPromoBadgeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BadgeDTO badgeDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        List<StickyPromoBadgeDTO.Image> list = null;
        StickyPromoBadgeDTO.SpacersDTO spacersDTO = null;
        String str = null;
        CornerRadius cornerRadius = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.nullableListOfImageAdapter.fromJson(reader);
                    break;
                case 4:
                    spacersDTO = this.nullableSpacersDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new StickyPromoBadgeDTO(badgeDTO, textDTO, textDTO2, list, spacersDTO, str, cornerRadius, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StickyPromoBadgeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("startText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getStartText());
        writer.w("endText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getEndText());
        writer.w("images");
        this.nullableListOfImageAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w("spacers");
        this.nullableSpacersDTOAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
