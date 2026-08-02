package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data.ButtonWithInformationDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/Price;", "nullablePriceAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "nullableSmallIconButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "nullablePaymentButtonLargeAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO$ButtonWidthDTO;", "nullableButtonWidthDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWithInformationDTOJsonAdapter extends JsonAdapter<ButtonWithInformationDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ButtonWithInformationDTO> constructorRef;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonWithInformationDTO.ButtonWidthDTO> nullableButtonWidthDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.PaymentButtonLarge> nullablePaymentButtonLargeAdapter;

    @NotNull
    private final JsonAdapter<Price> nullablePriceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> nullableSmallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public ButtonWithInformationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "infoButton", "smallActionButton", "largeActionButton", "paymentButton", "buttonWidth", "topBadge", "trackingInfo", "isVerticalLayout", "notificationCell");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullablePriceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableSmallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "infoButton");
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "smallActionButton");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "largeActionButton");
        this.nullablePaymentButtonLargeAdapter = moshi.f(ButtonV3Atom.PaymentButtonLarge.class, m11, "paymentButton");
        this.nullableButtonWidthDTOAdapter = moshi.f(ButtonWithInformationDTO.ButtonWidthDTO.class, m11, "buttonWidth");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "topBadge");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isVerticalLayout");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "notificationCell");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(ButtonWithInformationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonWithInformationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Price price = null;
        Boolean bool2 = bool;
        TextAtom textAtom = null;
        ButtonV3Atom.SmallButton smallButton = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = null;
        ButtonWithInformationDTO.ButtonWidthDTO buttonWidthDTO = null;
        BadgeDTO badgeDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CellDTO cellDTO = null;
        int i11 = -1;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    price = this.nullablePriceAdapter.fromJson(reader);
                    break;
                case 2:
                    smallIconButton = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 3:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    paymentButtonLarge = this.nullablePaymentButtonLargeAdapter.fromJson(reader);
                    break;
                case 6:
                    buttonWidthDTO = this.nullableButtonWidthDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isVerticalLayout", "isVerticalLayout", reader);
                    }
                    i11 = -513;
                    break;
                case 10:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -513) {
            return new ButtonWithInformationDTO(textAtom, price, smallIconButton, smallButton, largeButton, paymentButtonLarge, buttonWidthDTO, badgeDTO, map, bool2.booleanValue(), cellDTO);
        }
        Constructor<ButtonWithInformationDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ButtonWithInformationDTO.class.getDeclaredConstructor(TextAtom.class, Price.class, ButtonV3Atom.SmallIconButton.class, ButtonV3Atom.SmallButton.class, ButtonV3Atom.LargeButton.class, ButtonV3Atom.PaymentButtonLarge.class, ButtonWithInformationDTO.ButtonWidthDTO.class, BadgeDTO.class, Map.class, Boolean.TYPE, CellDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Integer valueOf = Integer.valueOf(i11);
        ButtonWithInformationDTO newInstance = constructor.newInstance(textAtom, price, smallIconButton, smallButton, largeButton, paymentButtonLarge, buttonWidthDTO, badgeDTO, map, bool2, cellDTO, valueOf, null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonWithInformationDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("price");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("infoButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getInfoButton());
        writer.w("smallActionButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getSmallActionButton());
        writer.w("largeActionButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getLargeActionButton());
        writer.w("paymentButton");
        this.nullablePaymentButtonLargeAdapter.mo44toJson(writer, (x) value.getPaymentButton());
        writer.w("buttonWidth");
        this.nullableButtonWidthDTOAdapter.mo44toJson(writer, (x) value.getButtonWidth());
        writer.w("topBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getTopBadge());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("isVerticalLayout");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isVerticalLayout()));
        writer.w("notificationCell");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getNotificationCell());
        writer.p();
    }
}
