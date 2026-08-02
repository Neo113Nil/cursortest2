package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data;

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
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data.CheckoutStickyTotalDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.data.CheckoutButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;", "checkoutButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;", "nullableSpacersAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "nullableFreshProgressBarDTOAdapter", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutStickyTotalDTOJsonAdapter extends JsonAdapter<CheckoutStickyTotalDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CheckoutButtonDTO> checkoutButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<FreshProgressBarDTO> nullableFreshProgressBarDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CheckoutStickyTotalDTO.Spacers> nullableSpacersAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CheckoutStickyTotalDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "badgeInfo", "borderColor", "backgroundColor", "spacers", "trackingInfo", "isRoundedCorners", "progressBar");
        M m11 = M.f71699a;
        this.checkoutButtonDTOAdapter = moshi.f(CheckoutButtonDTO.class, m11, "button");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badgeInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableSpacersAdapter = moshi.f(CheckoutStickyTotalDTO.Spacers.class, m11, "spacers");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isRoundedCorners");
        this.nullableFreshProgressBarDTOAdapter = moshi.f(FreshProgressBarDTO.class, m11, "progressBar");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(CheckoutStickyTotalDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CheckoutStickyTotalDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CheckoutButtonDTO checkoutButtonDTO = null;
        BadgeDTO badgeDTO = null;
        String str = null;
        String str2 = null;
        CheckoutStickyTotalDTO.Spacers spacers = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool = null;
        FreshProgressBarDTO freshProgressBarDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    checkoutButtonDTO = this.checkoutButtonDTOAdapter.fromJson(reader);
                    if (checkoutButtonDTO == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 1:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    spacers = this.nullableSpacersAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    freshProgressBarDTO = this.nullableFreshProgressBarDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (checkoutButtonDTO != null) {
            return new CheckoutStickyTotalDTO(checkoutButtonDTO, badgeDTO, str, str2, spacers, map, bool, freshProgressBarDTO);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CheckoutStickyTotalDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.checkoutButtonDTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("badgeInfo");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadgeInfo());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("spacers");
        this.nullableSpacersAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("isRoundedCorners");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isRoundedCorners());
        writer.w("progressBar");
        this.nullableFreshProgressBarDTOAdapter.mo44toJson(writer, (x) value.getProgressBar());
        writer.p();
    }
}
