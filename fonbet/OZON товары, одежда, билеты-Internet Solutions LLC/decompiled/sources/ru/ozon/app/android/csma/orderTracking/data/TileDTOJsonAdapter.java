package ru.ozon.app.android.csma.orderTracking.data;

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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R(\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020+\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019¨\u0006-"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/TileDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/csma/orderTracking/data/TileDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/csma/orderTracking/data/TileDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/csma/orderTracking/data/TileDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;", "titleDTOAdapter", "Lru/ozon/app/android/csma/orderTracking/data/SubtitleDTO;", "nullableSubtitleDTOAdapter", "Lru/ozon/app/android/csma/orderTracking/data/AddressDTO;", "nullableAddressDTOAdapter", "Lru/ozon/app/android/csma/orderTracking/data/MarqueeAddressDTO;", "nullableMarqueeAddressDTOAdapter", "Lru/ozon/app/android/csma/orderTracking/data/DescriptionDTO;", "nullableDescriptionDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "nullableButtonDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TileDTOJsonAdapter extends JsonAdapter<TileDTO> {

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<AddressDTO> nullableAddressDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonDTO> nullableButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<DescriptionDTO> nullableDescriptionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<MarqueeAddressDTO> nullableMarqueeAddressDTOAdapter;

    @NotNull
    private final JsonAdapter<SubtitleDTO> nullableSubtitleDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TitleDTO> titleDTOAdapter;

    public TileDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "badge", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "marqueeAddress", "description", "button", "actionBadge", "action", "trackingInfo");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.titleDTOAdapter = moshi.f(TitleDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableSubtitleDTOAdapter = moshi.f(SubtitleDTO.class, m11, "subtitle");
        this.nullableAddressDTOAdapter = moshi.f(AddressDTO.class, m11, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableMarqueeAddressDTOAdapter = moshi.f(MarqueeAddressDTO.class, m11, "marqueeAddress");
        this.nullableDescriptionDTOAdapter = moshi.f(DescriptionDTO.class, m11, "description");
        this.nullableButtonDTOAdapter = moshi.f(ButtonDTO.class, m11, "button");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(TileDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ImageDTO imageDTO = null;
        BadgeDTO badgeDTO = null;
        TitleDTO titleDTO = null;
        SubtitleDTO subtitleDTO = null;
        AddressDTO addressDTO = null;
        MarqueeAddressDTO marqueeAddressDTO = null;
        DescriptionDTO descriptionDTO = null;
        ButtonDTO buttonDTO = null;
        BadgeDTO badgeDTO2 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 1:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    titleDTO = this.titleDTOAdapter.fromJson(reader);
                    if (titleDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    subtitleDTO = this.nullableSubtitleDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    addressDTO = this.nullableAddressDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    marqueeAddressDTO = this.nullableMarqueeAddressDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    descriptionDTO = this.nullableDescriptionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    buttonDTO = this.nullableButtonDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (imageDTO == null) {
            throw c.j("image", "image", reader);
        }
        if (titleDTO != null) {
            return new TileDTO(imageDTO, badgeDTO, titleDTO, subtitleDTO, addressDTO, marqueeAddressDTO, descriptionDTO, buttonDTO, badgeDTO2, atomActionDTO, map);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.titleDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableSubtitleDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableAddressDTOAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("marqueeAddress");
        this.nullableMarqueeAddressDTOAdapter.mo44toJson(writer, (x) value.getMarqueeAddress());
        writer.w("description");
        this.nullableDescriptionDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("button");
        this.nullableButtonDTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("actionBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getActionBadge());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
