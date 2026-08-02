package ru.ozon.app.android.widgets.buttonWidget;

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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "nullableButtonDTOAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "nullableBooleanAdapter", "Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "nullableAlignTypeAdapter", "", "nullableIntAdapter", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonWidgetDTOJsonAdapter extends JsonAdapter<ButtonWidgetDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<AlignType> nullableAlignTypeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonDTO> nullableButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final n.a options;

    public ButtonWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "buttonV2", "isSticky", "buttonV3", "hasShadowIfSticky", "align", "buttonFill", "buttonHorizontalMargin", "buttonVerticalMargin", "hasBackgroundColor");
        M m11 = M.f71699a;
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.nullableButtonDTOAdapter = moshi.f(ButtonDTO.class, m11, "buttonV2");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSticky");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "buttonV3");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasShadowIfSticky");
        this.nullableAlignTypeAdapter = moshi.f(AlignType.class, m11, "align");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "buttonHorizontalMargin");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(ButtonWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonDTO buttonDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        Boolean bool2 = null;
        AlignType alignType = null;
        Boolean bool3 = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 1:
                    buttonDTO = this.nullableButtonDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isSticky", "isSticky", reader);
                    }
                    break;
                case 3:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    alignType = this.nullableAlignTypeAdapter.fromJson(reader);
                    break;
                case 6:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 8:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (bool != null) {
            return new ButtonWidgetDTO(largeButton, buttonDTO, bool.booleanValue(), buttonV3DTO, bool2, alignType, bool3, num, num2, bool4);
        }
        throw c.j("isSticky", "isSticky", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("buttonV2");
        this.nullableButtonDTOAdapter.mo44toJson(writer, (x) value.getButtonV2());
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSticky()));
        writer.w("buttonV3");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButtonV3());
        writer.w("hasShadowIfSticky");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasShadowIfSticky());
        writer.w("align");
        this.nullableAlignTypeAdapter.mo44toJson(writer, (x) value.getAlign());
        writer.w("buttonFill");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getButtonFill());
        writer.w("buttonHorizontalMargin");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getButtonHorizontalMargin());
        writer.w("buttonVerticalMargin");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getButtonVerticalMargin());
        writer.w("hasBackgroundColor");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasBackgroundColor());
        writer.p();
    }
}
