package ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "nullableLinkButtonDTOAdapter", "", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "nullableListOfTravelBadgeDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$Price;", "nullablePriceAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$AdditionalInfo;", "nullableListOfAdditionalInfoAdapter", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyBlock;", "nullableListOfCopyBlockAdapter", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV3DTOJsonAdapter extends JsonAdapter<ServiceBlockV3DTO> {

    @NotNull
    private final JsonAdapter<LinkButtonDTO> nullableLinkButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ServiceBlockV3DTO.AdditionalInfo>> nullableListOfAdditionalInfoAdapter;

    @NotNull
    private final JsonAdapter<List<ServiceBlockV3DTO.CopyBlock>> nullableListOfCopyBlockAdapter;

    @NotNull
    private final JsonAdapter<List<TravelBadgeDTO>> nullableListOfTravelBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ServiceBlockV3DTO.Price> nullablePriceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ServiceBlockV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "content", "moreAction", "travelBadgesList", "price", "changeServiceButton", "nextOptionBenefitDescription", "nextOptionPrice", "additionalInfoList", "copyBlockList");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableLinkButtonDTOAdapter = moshi.f(LinkButtonDTO.class, m11, "moreAction");
        this.nullableListOfTravelBadgeDTOAdapter = moshi.f(D.e(List.class, TravelBadgeDTO.class), m11, "travelBadgesList");
        this.nullablePriceAdapter = moshi.f(ServiceBlockV3DTO.Price.class, m11, "price");
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "changeServiceButton");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "nextOptionBenefitDescription");
        this.nullableListOfAdditionalInfoAdapter = moshi.f(D.e(List.class, ServiceBlockV3DTO.AdditionalInfo.class), m11, "additionalInfoList");
        this.nullableListOfCopyBlockAdapter = moshi.f(D.e(List.class, ServiceBlockV3DTO.CopyBlock.class), m11, "copyBlockList");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(ServiceBlockV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ServiceBlockV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        LinkButtonDTO linkButtonDTO = null;
        List<TravelBadgeDTO> list = null;
        ServiceBlockV3DTO.Price price = null;
        ButtonV3Atom.SmallButton smallButton = null;
        TextAtom textAtom3 = null;
        ServiceBlockV3DTO.Price price2 = null;
        List<ServiceBlockV3DTO.AdditionalInfo> list2 = null;
        List<ServiceBlockV3DTO.CopyBlock> list3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("content", "content", reader);
                    }
                    break;
                case 2:
                    linkButtonDTO = this.nullableLinkButtonDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.nullableListOfTravelBadgeDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    price = this.nullablePriceAdapter.fromJson(reader);
                    break;
                case 5:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    price2 = this.nullablePriceAdapter.fromJson(reader);
                    break;
                case 8:
                    list2 = this.nullableListOfAdditionalInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    list3 = this.nullableListOfCopyBlockAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textAtom2 != null) {
            return new ServiceBlockV3DTO(textAtom, textAtom2, linkButtonDTO, list, price, smallButton, textAtom3, price2, list2, list3);
        }
        throw c.j("content", "content", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ServiceBlockV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("content");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getContent());
        writer.w("moreAction");
        this.nullableLinkButtonDTOAdapter.mo44toJson(writer, (x) value.getMoreAction());
        writer.w("travelBadgesList");
        this.nullableListOfTravelBadgeDTOAdapter.mo44toJson(writer, (x) value.getTravelBadgesList());
        writer.w("price");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("changeServiceButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getChangeServiceButton());
        writer.w("nextOptionBenefitDescription");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getNextOptionBenefitDescription());
        writer.w("nextOptionPrice");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getNextOptionPrice());
        writer.w("additionalInfoList");
        this.nullableListOfAdditionalInfoAdapter.mo44toJson(writer, (x) value.getAdditionalInfoList());
        writer.w("copyBlockList");
        this.nullableListOfCopyBlockAdapter.mo44toJson(writer, (x) value.getCopyBlockList());
        writer.p();
    }
}
