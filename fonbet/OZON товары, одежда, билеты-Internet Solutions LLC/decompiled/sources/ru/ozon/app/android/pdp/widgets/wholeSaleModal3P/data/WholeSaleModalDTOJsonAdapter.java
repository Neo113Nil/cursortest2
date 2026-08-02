package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data;

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
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.WholeSaleModalDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;", "textInputAdapter", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$Tabs;", "tabsAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "stringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WholeSaleModalDTOJsonAdapter extends JsonAdapter<WholeSaleModalDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<WholeSaleModalDTO.Tabs> tabsAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    @NotNull
    private final JsonAdapter<WholeSaleModalDTO.TextInput> textInputAdapter;

    public WholeSaleModalDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sendButton", "countTextInput", "regionTextInput", "deliveryTabs", "deliveryText", "footerText", "messageTemplate", "closeTrackingInfo");
        M m11 = M.f71699a;
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "sendButton");
        this.textInputAdapter = moshi.f(WholeSaleModalDTO.TextInput.class, m11, "countTextInput");
        this.tabsAdapter = moshi.f(WholeSaleModalDTO.Tabs.class, m11, "deliveryTabs");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "deliveryText");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "footerText");
        this.stringAdapter = moshi.f(String.class, m11, "messageTemplate");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "closeTrackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(WholeSaleModalDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WholeSaleModalDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3DTO buttonV3DTO = null;
        WholeSaleModalDTO.TextInput textInput = null;
        WholeSaleModalDTO.TextInput textInput2 = null;
        WholeSaleModalDTO.Tabs tabs = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("sendButton", "sendButton", reader);
                    }
                    continue;
                case 1:
                    textInput = this.textInputAdapter.fromJson(reader);
                    if (textInput == null) {
                        throw c.q("countTextInput", "countTextInput", reader);
                    }
                    break;
                case 2:
                    textInput2 = this.textInputAdapter.fromJson(reader);
                    if (textInput2 == null) {
                        throw c.q("regionTextInput", "regionTextInput", reader);
                    }
                    break;
                case 3:
                    tabs = this.tabsAdapter.fromJson(reader);
                    if (tabs == null) {
                        throw c.q("deliveryTabs", "deliveryTabs", reader);
                    }
                    break;
                case 4:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("deliveryText", "deliveryText", reader);
                    }
                    break;
                case 5:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("messageTemplate", "messageTemplate", reader);
                    }
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            buttonV3DTO = buttonV3DTO2;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        reader.endObject();
        if (buttonV3DTO3 == null) {
            throw c.j("sendButton", "sendButton", reader);
        }
        if (textInput == null) {
            throw c.j("countTextInput", "countTextInput", reader);
        }
        if (textInput2 == null) {
            throw c.j("regionTextInput", "regionTextInput", reader);
        }
        if (tabs == null) {
            throw c.j("deliveryTabs", "deliveryTabs", reader);
        }
        if (textDTO == null) {
            throw c.j("deliveryText", "deliveryText", reader);
        }
        if (str != null) {
            return new WholeSaleModalDTO(buttonV3DTO3, textInput, textInput2, tabs, textDTO, textDTO2, str, map);
        }
        throw c.j("messageTemplate", "messageTemplate", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WholeSaleModalDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sendButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSendButton());
        writer.w("countTextInput");
        this.textInputAdapter.mo44toJson(writer, (x) value.getCountTextInput());
        writer.w("regionTextInput");
        this.textInputAdapter.mo44toJson(writer, (x) value.getRegionTextInput());
        writer.w("deliveryTabs");
        this.tabsAdapter.mo44toJson(writer, (x) value.getDeliveryTabs());
        writer.w("deliveryText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDeliveryText());
        writer.w("footerText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getFooterText());
        writer.w("messageTemplate");
        this.stringAdapter.mo44toJson(writer, (x) value.getMessageTemplate());
        writer.w("closeTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getCloseTrackingInfo());
        writer.p();
    }
}
