package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data;

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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data.TravelPriceDetailInformationDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO;", "priceBlockDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$TotalPriceBlockDTO;", "totalPriceBlockDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationDTOJsonAdapter extends JsonAdapter<TravelPriceDetailInformationDTO> {

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TravelPriceDetailInformationDTO.PriceBlockDTO> priceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelPriceDetailInformationDTO.TotalPriceBlockDTO> totalPriceBlockDTOAdapter;

    public TravelPriceDetailInformationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("prices", "totalPrice", DynamicElementDTO.LARGE_BUTTON, "smallStickyButton", "agreementText", "bonusButton");
        M m11 = M.f71699a;
        this.priceBlockDTOAdapter = moshi.f(TravelPriceDetailInformationDTO.PriceBlockDTO.class, m11, "prices");
        this.totalPriceBlockDTOAdapter = moshi.f(TravelPriceDetailInformationDTO.TotalPriceBlockDTO.class, m11, "totalPrice");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, DynamicElementDTO.LARGE_BUTTON);
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "smallStickyButton");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "agreementText");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "bonusButton");
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(TravelPriceDetailInformationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPriceDetailInformationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TravelPriceDetailInformationDTO.PriceBlockDTO priceBlockDTO = null;
        TravelPriceDetailInformationDTO.TotalPriceBlockDTO totalPriceBlockDTO = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.SmallButton smallButton = null;
        TextAtom textAtom = null;
        Badge badge = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    priceBlockDTO = this.priceBlockDTOAdapter.fromJson(reader);
                    if (priceBlockDTO == null) {
                        throw c.q("prices", "prices", reader);
                    }
                    break;
                case 1:
                    totalPriceBlockDTO = this.totalPriceBlockDTOAdapter.fromJson(reader);
                    if (totalPriceBlockDTO == null) {
                        throw c.q("totalPrice", "totalPrice", reader);
                    }
                    break;
                case 2:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q(DynamicElementDTO.LARGE_BUTTON, DynamicElementDTO.LARGE_BUTTON, reader);
                    }
                    break;
                case 3:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (priceBlockDTO == null) {
            throw c.j("prices", "prices", reader);
        }
        if (totalPriceBlockDTO == null) {
            throw c.j("totalPrice", "totalPrice", reader);
        }
        if (largeButton != null) {
            return new TravelPriceDetailInformationDTO(priceBlockDTO, totalPriceBlockDTO, largeButton, smallButton, textAtom, badge);
        }
        throw c.j(DynamicElementDTO.LARGE_BUTTON, DynamicElementDTO.LARGE_BUTTON, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPriceDetailInformationDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("prices");
        this.priceBlockDTOAdapter.mo44toJson(writer, (x) value.getPrices());
        writer.w("totalPrice");
        this.totalPriceBlockDTOAdapter.mo44toJson(writer, (x) value.getTotalPrice());
        writer.w(DynamicElementDTO.LARGE_BUTTON);
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getLargeButton());
        writer.w("smallStickyButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getSmallStickyButton());
        writer.w("agreementText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAgreementText());
        writer.w("bonusButton");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBonusButton());
        writer.p();
    }
}
