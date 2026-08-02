package ru.ozon.app.android.returns.cancels.cancelpostingsv2.data;

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
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.data.CancelPostingsV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/CancelPostingsV2DTO_MonopostingDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;", "nullablePriceIncreaseInfoDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CancelPostingsV2DTO_MonopostingDTOJsonAdapter extends JsonAdapter<CancelPostingsV2DTO.MonopostingDTO> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CancelPostingsV2DTO.MonopostingDTO.PriceIncreaseInfoDTO> nullablePriceIncreaseInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CancelPostingsV2DTO_MonopostingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isSelected", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "info", "action", "priceIncreaseInfo", "titleBadge", "imageBadge");
        M m11 = M.f71699a;
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSelected");
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.nullableStringAdapter = moshi.f(String.class, m11, "info");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullablePriceIncreaseInfoDTOAdapter = moshi.f(CancelPostingsV2DTO.MonopostingDTO.PriceIncreaseInfoDTO.class, m11, "priceIncreaseInfo");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "titleBadge");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(CancelPostingsV2DTO.MonopostingDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CancelPostingsV2DTO.MonopostingDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        AtomActionDTO atomActionDTO = null;
        CancelPostingsV2DTO.MonopostingDTO.PriceIncreaseInfoDTO priceIncreaseInfoDTO = null;
        BadgeDTO badgeDTO = null;
        BadgeDTO badgeDTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    priceIncreaseInfoDTO = this.nullablePriceIncreaseInfoDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("image", "image", reader);
        }
        if (str2 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (str3 != null) {
            return new CancelPostingsV2DTO.MonopostingDTO(bool, str, str2, str3, str4, atomActionDTO, priceIncreaseInfoDTO, badgeDTO, badgeDTO2);
        }
        throw c.j("subtitle", "subtitle", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CancelPostingsV2DTO.MonopostingDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isSelected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSelected());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("info");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getInfo());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("priceIncreaseInfo");
        this.nullablePriceIncreaseInfoDTOAdapter.mo44toJson(writer, (x) value.getPriceIncreaseInfo());
        writer.w("titleBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getTitleBadge());
        writer.w("imageBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getImageBadge());
        writer.p();
    }
}
