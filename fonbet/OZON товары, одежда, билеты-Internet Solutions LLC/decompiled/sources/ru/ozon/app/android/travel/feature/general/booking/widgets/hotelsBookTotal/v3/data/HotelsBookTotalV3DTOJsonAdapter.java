package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "finalPriceDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;", "nullableBasePriceDTOAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;", "nullableBonusesDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;", "nullableStickyContainerAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;", "nullableStarsBonusesAdapter", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3DTOJsonAdapter extends JsonAdapter<HotelsBookTotalV3DTO> {

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsBookTotalV3DTO.FinalPriceDTO> finalPriceDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsBookTotalV3DTO.BasePriceDTO> nullableBasePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsBookTotalV3DTO.BonusesDTO> nullableBonusesDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsBookTotalV3DTO.StarsBonuses> nullableStarsBonusesAdapter;

    @NotNull
    private final JsonAdapter<HotelsBookTotalV3DTO.StickyContainer> nullableStickyContainerAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public HotelsBookTotalV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("finalPrice", "basePrice", "bonuses", "nextButton", "agreement", "notification", "common", "stickyContainer", "starsBonuses");
        M m11 = M.f71699a;
        this.finalPriceDTOAdapter = moshi.f(HotelsBookTotalV3DTO.FinalPriceDTO.class, m11, "finalPrice");
        this.nullableBasePriceDTOAdapter = moshi.f(HotelsBookTotalV3DTO.BasePriceDTO.class, m11, "basePrice");
        this.nullableBonusesDTOAdapter = moshi.f(HotelsBookTotalV3DTO.BonusesDTO.class, m11, "bonuses");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "nextButton");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "agreement");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "notification");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableStickyContainerAdapter = moshi.f(HotelsBookTotalV3DTO.StickyContainer.class, m11, "stickyContainer");
        this.nullableStarsBonusesAdapter = moshi.f(HotelsBookTotalV3DTO.StarsBonuses.class, m11, "starsBonuses");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(HotelsBookTotalV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsBookTotalV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HotelsBookTotalV3DTO.FinalPriceDTO finalPriceDTO = null;
        HotelsBookTotalV3DTO.BasePriceDTO basePriceDTO = null;
        HotelsBookTotalV3DTO.BonusesDTO bonusesDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        TextDTO textDTO = null;
        NotificationDTO notificationDTO = null;
        CommonControlSettings commonControlSettings = null;
        HotelsBookTotalV3DTO.StickyContainer stickyContainer = null;
        HotelsBookTotalV3DTO.StarsBonuses starsBonuses = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    finalPriceDTO = this.finalPriceDTOAdapter.fromJson(reader);
                    if (finalPriceDTO == null) {
                        throw c.q("finalPrice", "finalPrice", reader);
                    }
                    break;
                case 1:
                    basePriceDTO = this.nullableBasePriceDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    bonusesDTO = this.nullableBonusesDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("nextButton", "nextButton", reader);
                    }
                    break;
                case 4:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 7:
                    stickyContainer = this.nullableStickyContainerAdapter.fromJson(reader);
                    break;
                case 8:
                    starsBonuses = this.nullableStarsBonusesAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (finalPriceDTO == null) {
            throw c.j("finalPrice", "finalPrice", reader);
        }
        if (buttonV3DTO != null) {
            return new HotelsBookTotalV3DTO(finalPriceDTO, basePriceDTO, bonusesDTO, buttonV3DTO, textDTO, notificationDTO, commonControlSettings, stickyContainer, starsBonuses);
        }
        throw c.j("nextButton", "nextButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsBookTotalV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("finalPrice");
        this.finalPriceDTOAdapter.mo44toJson(writer, (x) value.getFinalPrice());
        writer.w("basePrice");
        this.nullableBasePriceDTOAdapter.mo44toJson(writer, (x) value.getBasePrice());
        writer.w("bonuses");
        this.nullableBonusesDTOAdapter.mo44toJson(writer, (x) value.getBonuses());
        writer.w("nextButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getNextButton());
        writer.w("agreement");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAgreement());
        writer.w("notification");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getNotification());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("stickyContainer");
        this.nullableStickyContainerAdapter.mo44toJson(writer, (x) value.getStickyContainer());
        writer.w("starsBonuses");
        this.nullableStarsBonusesAdapter.mo44toJson(writer, (x) value.getStarsBonuses());
        writer.p();
    }
}
