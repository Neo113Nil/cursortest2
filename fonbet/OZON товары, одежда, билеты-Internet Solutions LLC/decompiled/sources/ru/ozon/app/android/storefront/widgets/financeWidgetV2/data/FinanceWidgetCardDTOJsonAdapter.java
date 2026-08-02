package ru.ozon.app.android.storefront.widgets.financeWidgetV2.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceWidgetCardDTOJsonAdapter extends JsonAdapter<FinanceWidgetCardDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FinanceWidgetCardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("mainText", SelectionItemFormDTO.TITLE_FIELD_NAME, "chevronIcon", "image", "actionButton", "backgroundColor", "common");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "mainText");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "chevronIcon");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "actionButton");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(FinanceWidgetCardDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FinanceWidgetCardDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        IconDTO iconDTO = null;
        ImageDTO imageDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        String str = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("mainText", "mainText", reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 6:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j("mainText", "mainText", reader);
        }
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (commonControlSettings != null) {
            return new FinanceWidgetCardDTO(textDTO, textDTO2, iconDTO, imageDTO, buttonV3DTO, str, commonControlSettings);
        }
        throw c.j("common", "common", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FinanceWidgetCardDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("mainText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getMainText());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("chevronIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getChevronIcon());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("actionButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
