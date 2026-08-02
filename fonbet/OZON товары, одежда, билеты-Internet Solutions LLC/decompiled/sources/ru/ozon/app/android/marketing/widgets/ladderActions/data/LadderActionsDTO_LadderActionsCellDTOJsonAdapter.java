package ru.ozon.app.android.marketing.widgets.ladderActions.data;

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
import ru.ozon.app.android.marketing.widgets.ladderActions.data.LadderActionsDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO_LadderActionsCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO$LadderActionsCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO$LadderActionsCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO$LadderActionsCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "", "booleanAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionsDTO_LadderActionsCellDTOJsonAdapter extends JsonAdapter<LadderActionsDTO.LadderActionsCellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    public LadderActionsDTO_LadderActionsCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("primaryPrice", "secondaryPrice", "defaultButton", "activeButton", "isActive");
        M m11 = M.f71699a;
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "primaryPrice");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "defaultButton");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isActive");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(LadderActionsDTO.LadderActionsCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LadderActionsDTO.LadderActionsCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        PriceDTO priceDTO = null;
        PriceDTO priceDTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                priceDTO = this.priceDTOAdapter.fromJson(reader);
                if (priceDTO == null) {
                    throw c.q("primaryPrice", "primaryPrice", reader);
                }
            } else if (v11 == 1) {
                priceDTO2 = this.priceDTOAdapter.fromJson(reader);
                if (priceDTO2 == null) {
                    throw c.q("secondaryPrice", "secondaryPrice", reader);
                }
            } else if (v11 == 2) {
                buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                if (buttonV3DTO == null) {
                    throw c.q("defaultButton", "defaultButton", reader);
                }
            } else if (v11 == 3) {
                buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                if (buttonV3DTO2 == null) {
                    throw c.q("activeButton", "activeButton", reader);
                }
            } else if (v11 == 4 && (bool = this.booleanAdapter.fromJson(reader)) == null) {
                throw c.q("isActive", "isActive", reader);
            }
        }
        reader.endObject();
        if (priceDTO == null) {
            throw c.j("primaryPrice", "primaryPrice", reader);
        }
        if (priceDTO2 == null) {
            throw c.j("secondaryPrice", "secondaryPrice", reader);
        }
        if (buttonV3DTO == null) {
            throw c.j("defaultButton", "defaultButton", reader);
        }
        if (buttonV3DTO2 == null) {
            throw c.j("activeButton", "activeButton", reader);
        }
        if (bool != null) {
            return new LadderActionsDTO.LadderActionsCellDTO(priceDTO, priceDTO2, buttonV3DTO, buttonV3DTO2, bool.booleanValue());
        }
        throw c.j("isActive", "isActive", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LadderActionsDTO.LadderActionsCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("primaryPrice");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrimaryPrice());
        writer.w("secondaryPrice");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getSecondaryPrice());
        writer.w("defaultButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getDefaultButton());
        writer.w("activeButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getActiveButton());
        writer.w("isActive");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isActive()));
        writer.p();
    }
}
