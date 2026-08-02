package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data;

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
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO_Form_ComponentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentType;", "nullableComponentTypeAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;", "nullableComponentValidationAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;", "nullableCheckboxAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;", "nullableRadioAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;", "nullableCarouselAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/atoms/data/list/BulletListAtom;", "nullableBulletListAtomAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Textarea;", "nullableTextareaAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;", "nullableToggleAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$UploadPhotos;", "nullableUploadPhotosAdapter", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormDTO_Form_ComponentJsonAdapter extends JsonAdapter<DeliveryReviewFormDTO.Form.Component> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<BulletListAtom> nullableBulletListAtomAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.Carousel> nullableCarouselAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.Checkbox> nullableCheckboxAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.ComponentType> nullableComponentTypeAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.ComponentValidation> nullableComponentValidationAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.Radio> nullableRadioAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.Textarea> nullableTextareaAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.Toggle> nullableToggleAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Component.UploadPhotos> nullableUploadPhotosAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DeliveryReviewFormDTO_Form_ComponentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "type", "validate", FormPageDTO.Field.FIELD_TYPE_HIDDEN, "controllingComponentId", "selectControllingComponentId", "checkbox", FormPageDTO.Field.FIELD_TYPE_RADIO, "gallery", "carousel", "text", "list", "textarea", "toggle", "uploadPhotos");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "id");
        this.nullableComponentTypeAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.ComponentType.class, m11, "type");
        this.nullableComponentValidationAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.ComponentValidation.class, m11, "validate");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, FormPageDTO.Field.FIELD_TYPE_HIDDEN);
        this.nullableStringAdapter = moshi.f(String.class, m11, "controllingComponentId");
        this.nullableCheckboxAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.Checkbox.class, m11, "checkbox");
        this.nullableRadioAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.Radio.class, m11, FormPageDTO.Field.FIELD_TYPE_RADIO);
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "gallery");
        this.nullableCarouselAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.Carousel.class, m11, "carousel");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "text");
        this.nullableBulletListAtomAdapter = moshi.f(BulletListAtom.class, m11, "list");
        this.nullableTextareaAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.Textarea.class, m11, "textarea");
        this.nullableToggleAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.Toggle.class, m11, "toggle");
        this.nullableUploadPhotosAdapter = moshi.f(DeliveryReviewFormDTO.Form.Component.UploadPhotos.class, m11, "uploadPhotos");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(DeliveryReviewFormDTO.Form.Component)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryReviewFormDTO.Form.Component fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        DeliveryReviewFormDTO.Form.Component.ComponentType componentType = null;
        DeliveryReviewFormDTO.Form.Component.ComponentValidation componentValidation = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        DeliveryReviewFormDTO.Form.Component.Checkbox checkbox = null;
        DeliveryReviewFormDTO.Form.Component.Radio radio = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        DeliveryReviewFormDTO.Form.Component.Carousel carousel = null;
        TextAtom textAtom = null;
        BulletListAtom bulletListAtom = null;
        DeliveryReviewFormDTO.Form.Component.Textarea textarea = null;
        DeliveryReviewFormDTO.Form.Component.Toggle toggle = null;
        DeliveryReviewFormDTO.Form.Component.UploadPhotos uploadPhotos = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    componentType = this.nullableComponentTypeAdapter.fromJson(reader);
                    break;
                case 2:
                    componentValidation = this.nullableComponentValidationAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    checkbox = this.nullableCheckboxAdapter.fromJson(reader);
                    break;
                case 7:
                    radio = this.nullableRadioAdapter.fromJson(reader);
                    break;
                case 8:
                    largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 9:
                    carousel = this.nullableCarouselAdapter.fromJson(reader);
                    break;
                case 10:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 11:
                    bulletListAtom = this.nullableBulletListAtomAdapter.fromJson(reader);
                    break;
                case 12:
                    textarea = this.nullableTextareaAdapter.fromJson(reader);
                    break;
                case 13:
                    toggle = this.nullableToggleAdapter.fromJson(reader);
                    break;
                case 14:
                    uploadPhotos = this.nullableUploadPhotosAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str != null) {
            return new DeliveryReviewFormDTO.Form.Component(str, componentType, componentValidation, bool, str2, str3, checkbox, radio, largeBorderlessButton, carousel, textAtom, bulletListAtom, textarea, toggle, uploadPhotos);
        }
        throw c.j("id", "id", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryReviewFormDTO.Form.Component value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("type");
        this.nullableComponentTypeAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("validate");
        this.nullableComponentValidationAdapter.mo44toJson(writer, (x) value.getValidate());
        writer.w(FormPageDTO.Field.FIELD_TYPE_HIDDEN);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHidden());
        writer.w("controllingComponentId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getControllingComponentId());
        writer.w("selectControllingComponentId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSelectControllingComponentId());
        writer.w("checkbox");
        this.nullableCheckboxAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w(FormPageDTO.Field.FIELD_TYPE_RADIO);
        this.nullableRadioAdapter.mo44toJson(writer, (x) value.getRadio());
        writer.w("gallery");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getGallery());
        writer.w("carousel");
        this.nullableCarouselAdapter.mo44toJson(writer, (x) value.getCarousel());
        writer.w("text");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("list");
        this.nullableBulletListAtomAdapter.mo44toJson(writer, (x) value.getList());
        writer.w("textarea");
        this.nullableTextareaAdapter.mo44toJson(writer, (x) value.getTextarea());
        writer.w("toggle");
        this.nullableToggleAdapter.mo44toJson(writer, (x) value.getToggle());
        writer.w("uploadPhotos");
        this.nullableUploadPhotosAdapter.mo44toJson(writer, (x) value.getUploadPhotos());
        writer.p();
    }
}
