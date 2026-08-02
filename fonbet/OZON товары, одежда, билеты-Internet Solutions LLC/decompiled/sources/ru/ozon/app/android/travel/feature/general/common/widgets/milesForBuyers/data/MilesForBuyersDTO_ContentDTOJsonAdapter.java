package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO_ContentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ContentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$BannerDTO;", "nullableBannerDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;", "nullableProgressBarDTOAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$CardDTO;", "nullableCardDTOAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersDTO_ContentDTOJsonAdapter extends JsonAdapter<MilesForBuyersDTO.ContentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<MilesForBuyersDTO.BannerDTO> nullableBannerDTOAdapter;

    @NotNull
    private final JsonAdapter<MilesForBuyersDTO.CardDTO> nullableCardDTOAdapter;

    @NotNull
    private final JsonAdapter<MilesForBuyersDTO.ProgressBarDTO> nullableProgressBarDTOAdapter;

    @NotNull
    private final n.a options;

    public MilesForBuyersDTO_ContentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("banner", "progressBar", "card");
        M m11 = M.f71699a;
        this.nullableBannerDTOAdapter = moshi.f(MilesForBuyersDTO.BannerDTO.class, m11, "banner");
        this.nullableProgressBarDTOAdapter = moshi.f(MilesForBuyersDTO.ProgressBarDTO.class, m11, "progressBar");
        this.nullableCardDTOAdapter = moshi.f(MilesForBuyersDTO.CardDTO.class, m11, "card");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(MilesForBuyersDTO.ContentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MilesForBuyersDTO.ContentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MilesForBuyersDTO.BannerDTO bannerDTO = null;
        MilesForBuyersDTO.ProgressBarDTO progressBarDTO = null;
        MilesForBuyersDTO.CardDTO cardDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bannerDTO = this.nullableBannerDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                progressBarDTO = this.nullableProgressBarDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                cardDTO = this.nullableCardDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new MilesForBuyersDTO.ContentDTO(bannerDTO, progressBarDTO, cardDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MilesForBuyersDTO.ContentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("banner");
        this.nullableBannerDTOAdapter.mo44toJson(writer, (x) value.getBanner());
        writer.w("progressBar");
        this.nullableProgressBarDTOAdapter.mo44toJson(writer, (x) value.getProgressBar());
        writer.w("card");
        this.nullableCardDTOAdapter.mo44toJson(writer, (x) value.getCard());
        writer.p();
    }
}
