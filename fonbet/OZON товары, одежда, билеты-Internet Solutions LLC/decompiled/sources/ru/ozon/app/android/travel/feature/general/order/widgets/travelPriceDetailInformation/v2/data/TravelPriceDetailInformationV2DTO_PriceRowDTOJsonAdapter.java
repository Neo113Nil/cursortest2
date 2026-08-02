package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data;

import Ak.b;
import C.o0;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO_PriceRowDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "nullableSmallIconButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "nullableSmallBorderlessButtonAdapter", "", "intAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2DTO_PriceRowDTOJsonAdapter extends JsonAdapter<TravelPriceDetailInformationV2DTO.PriceRowDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelPriceDetailInformationV2DTO.PriceRowDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> nullableSmallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> nullableSmallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelPriceDetailInformationV2DTO_PriceRowDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "rightText", "smallIconButton", "button", "smallIconGap", "common", "milesIcon");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "rightText");
        this.nullableSmallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "smallIconButton");
        this.nullableSmallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "button");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "smallIconGap");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "milesIcon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPriceDetailInformationV2DTO.PriceRowDTO fromJson(@NotNull n reader) {
        TextAtom textAtom = null;
        Integer a11 = o0.a(reader, "reader", 0);
        TextAtom textAtom2 = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        CommonControlSettings commonControlSettings = null;
        IconDTO iconDTO = null;
        int i11 = -1;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    smallIconButton = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 3:
                    smallBorderlessButton = this.nullableSmallBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("smallIconGap", "smallIconGap", reader);
                    }
                    i11 = -17;
                    break;
                case 5:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 6:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            if (textAtom2 != null) {
                return new TravelPriceDetailInformationV2DTO.PriceRowDTO(textAtom2, textAtom, smallIconButton, smallBorderlessButton, a11.intValue(), commonControlSettings, iconDTO);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Constructor<TravelPriceDetailInformationV2DTO.PriceRowDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = TravelPriceDetailInformationV2DTO.PriceRowDTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, ButtonV3Atom.SmallIconButton.class, ButtonV3Atom.SmallBorderlessButton.class, cls2, CommonControlSettings.class, IconDTO.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textAtom2 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        IconDTO iconDTO2 = iconDTO;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        TextAtom textAtom3 = textAtom2;
        TravelPriceDetailInformationV2DTO.PriceRowDTO newInstance = constructor.newInstance(textAtom3, textAtom, smallIconButton, smallBorderlessButton2, a11, commonControlSettings, iconDTO2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(67, "GeneratedJsonAdapter(TravelPriceDetailInformationV2DTO.PriceRowDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPriceDetailInformationV2DTO.PriceRowDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("rightText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getRightText());
        writer.w("smallIconButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getSmallIconButton());
        writer.w("button");
        this.nullableSmallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("smallIconGap");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getSmallIconGap()));
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("milesIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getMilesIcon());
        writer.p();
    }
}
