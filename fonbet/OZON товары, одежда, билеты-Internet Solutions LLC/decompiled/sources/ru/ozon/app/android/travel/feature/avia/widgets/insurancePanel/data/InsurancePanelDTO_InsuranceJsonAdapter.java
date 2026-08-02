package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data;

import Ak.b;
import Y9.c;
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
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data.InsurancePanelDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO_InsuranceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "nullableTextAtomAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Benefit;", "listOfBenefitAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelDTO_InsuranceJsonAdapter extends JsonAdapter<InsurancePanelDTO.Insurance> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<InsurancePanelDTO.Benefit>> listOfBenefitAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public InsurancePanelDTO_InsuranceJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "subtitle", "logoLink", "selectButton", "benefits", "badge", "isSelected", "trackingInfo", "detailedConditionsButton");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.nullableStringAdapter = moshi.f(String.class, m11, "logoLink");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "selectButton");
        this.listOfBenefitAdapter = moshi.f(D.e(List.class, InsurancePanelDTO.Benefit.class), m11, "benefits");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "badge");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "detailedConditionsButton");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(InsurancePanelDTO.Insurance)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InsurancePanelDTO.Insurance fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        TextAtom textAtom = null;
        Price price = null;
        TextAtom textAtom2 = null;
        String str = null;
        ButtonV3Atom.LargeButton largeButton = null;
        List<InsurancePanelDTO.Benefit> list = null;
        Badge badge = null;
        Map<String, TokenizedTrackingInfo> map = null;
        BadgeDTO badgeDTO = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                TextAtom textAtom3 = textAtom;
                reader.endObject();
                if (textAtom3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (price == null) {
                    throw c.j("price", "price", reader);
                }
                if (largeButton == null) {
                    throw c.j("selectButton", "selectButton", reader);
                }
                if (list == null) {
                    throw c.j("benefits", "benefits", reader);
                }
                if (bool2 != null) {
                    return new InsurancePanelDTO.Insurance(textAtom3, price, textAtom2, str, largeButton, list, badge, bool2.booleanValue(), map, badgeDTO);
                }
                throw c.j("isSelected", "isSelected", reader);
            }
            TextAtom textAtom4 = textAtom;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    textAtom = textAtom4;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool = bool2;
                case 1:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    bool = bool2;
                    textAtom = textAtom4;
                case 2:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    bool = bool2;
                    textAtom = textAtom4;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    textAtom = textAtom4;
                case 4:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("selectButton", "selectButton", reader);
                    }
                    bool = bool2;
                    textAtom = textAtom4;
                case 5:
                    list = this.listOfBenefitAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("benefits", "benefits", reader);
                    }
                    bool = bool2;
                    textAtom = textAtom4;
                case 6:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    bool = bool2;
                    textAtom = textAtom4;
                case 7:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    textAtom = textAtom4;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    textAtom = textAtom4;
                case 9:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textAtom = textAtom4;
                default:
                    bool = bool2;
                    textAtom = textAtom4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InsurancePanelDTO.Insurance value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("logoLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLogoLink());
        writer.w("selectButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSelectButton());
        writer.w("benefits");
        this.listOfBenefitAdapter.mo44toJson(writer, (x) value.getBenefits());
        writer.w("badge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("detailedConditionsButton");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getDetailedConditionsButton());
        writer.p();
    }
}
