package ru.ozon.app.android.regulardraw.widgets.navbar.data;

import Ak.b;
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
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;", "nullableMorkovskNavBarButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "nullableMorkovskCurrencyBadgeDTOAdapter", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskBackgroundGradientDTO;", "nullableMorkovskBackgroundGradientDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskNavBarDTOJsonAdapter extends JsonAdapter<MorkovskNavBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<MorkovskBackgroundGradientDTO> nullableMorkovskBackgroundGradientDTOAdapter;

    @NotNull
    private final JsonAdapter<MorkovskCurrencyBadgeDTO> nullableMorkovskCurrencyBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<MorkovskNavBarButtonDTO> nullableMorkovskNavBarButtonDTOAdapter;

    @NotNull
    private final n.a options;

    public MorkovskNavBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("menuButton", "balance", "rightButton", "backgroundGradient", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableMorkovskNavBarButtonDTOAdapter = moshi.f(MorkovskNavBarButtonDTO.class, m11, "menuButton");
        this.nullableMorkovskCurrencyBadgeDTOAdapter = moshi.f(MorkovskCurrencyBadgeDTO.class, m11, "balance");
        this.nullableMorkovskBackgroundGradientDTOAdapter = moshi.f(MorkovskBackgroundGradientDTO.class, m11, "backgroundGradient");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(MorkovskNavBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MorkovskNavBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO = null;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = null;
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO2 = null;
        MorkovskBackgroundGradientDTO morkovskBackgroundGradientDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                morkovskNavBarButtonDTO = this.nullableMorkovskNavBarButtonDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                morkovskCurrencyBadgeDTO = this.nullableMorkovskCurrencyBadgeDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                morkovskNavBarButtonDTO2 = this.nullableMorkovskNavBarButtonDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                morkovskBackgroundGradientDTO = this.nullableMorkovskBackgroundGradientDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new MorkovskNavBarDTO(morkovskNavBarButtonDTO, morkovskCurrencyBadgeDTO, morkovskNavBarButtonDTO2, morkovskBackgroundGradientDTO, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MorkovskNavBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("menuButton");
        this.nullableMorkovskNavBarButtonDTOAdapter.mo44toJson(writer, (x) value.getMenuButton());
        writer.w("balance");
        this.nullableMorkovskCurrencyBadgeDTOAdapter.mo44toJson(writer, (x) value.getBalance());
        writer.w("rightButton");
        this.nullableMorkovskNavBarButtonDTOAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.w("backgroundGradient");
        this.nullableMorkovskBackgroundGradientDTOAdapter.mo44toJson(writer, (x) value.getBackgroundGradient());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
