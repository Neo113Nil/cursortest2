package ru.ozon.app.android.returns.creation.widgets.photoPicker.data;

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
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ReturnCreationPhotoPickerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ReturnCreationPhotoPickerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ReturnCreationPhotoPickerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ReturnCreationPhotoPickerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "nullableItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "nullableListOfSignedLinkDTOAdapter", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "nullableMinimalLimitAdapter", "", "intAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "nullableButtonV3DTOAdapter", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerDTOJsonAdapter extends JsonAdapter<ReturnCreationPhotoPickerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ItemDTO> nullableItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SignedLinkDTO>> nullableListOfSignedLinkDTOAdapter;

    @NotNull
    private final JsonAdapter<MinimalLimit> nullableMinimalLimitAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ReturnCreationPhotoPickerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("item", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "emptyStateImage", "existingImages", "minimalLimit", "maxCount", "uploadImageAction", "continueButton", "addPhotoButton", "addMorePhotoButton");
        M m11 = M.f71699a;
        this.nullableItemDTOAdapter = moshi.f(ItemDTO.class, m11, "item");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "emptyStateImage");
        this.nullableListOfSignedLinkDTOAdapter = moshi.f(D.e(List.class, SignedLinkDTO.class), m11, "existingImages");
        this.nullableMinimalLimitAdapter = moshi.f(MinimalLimit.class, m11, "minimalLimit");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxCount");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "uploadImageAction");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "continueButton");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "addMorePhotoButton");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(ReturnCreationPhotoPickerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnCreationPhotoPickerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        ItemDTO itemDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        ImageDTO imageDTO = null;
        List<SignedLinkDTO> list = null;
        MinimalLimit minimalLimit = null;
        AtomActionDTO atomActionDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        ButtonV3DTO buttonV3DTO3 = null;
        while (true) {
            Integer num2 = num;
            ItemDTO itemDTO2 = itemDTO;
            TextDTO textDTO3 = textDTO;
            TextDTO textDTO4 = textDTO2;
            if (!reader.hasNext()) {
                ImageDTO imageDTO2 = imageDTO;
                reader.endObject();
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (imageDTO2 == null) {
                    throw c.j("emptyStateImage", "emptyStateImage", reader);
                }
                if (num2 == null) {
                    throw c.j("maxCount", "maxCount", reader);
                }
                int intValue = num2.intValue();
                if (atomActionDTO == null) {
                    throw c.j("uploadImageAction", "uploadImageAction", reader);
                }
                if (buttonV3DTO == null) {
                    throw c.j("continueButton", "continueButton", reader);
                }
                if (buttonV3DTO2 != null) {
                    return new ReturnCreationPhotoPickerDTO(itemDTO2, textDTO3, textDTO4, imageDTO2, list, minimalLimit, intValue, atomActionDTO, buttonV3DTO, buttonV3DTO2, buttonV3DTO3);
                }
                throw c.j("addPhotoButton", "addPhotoButton", reader);
            }
            ImageDTO imageDTO3 = imageDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 0:
                    itemDTO = this.nullableItemDTOAdapter.fromJson(reader);
                    num = num2;
                    imageDTO = imageDTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO2 = textDTO4;
                case 2:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                case 3:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("emptyStateImage", "emptyStateImage", reader);
                    }
                    num = num2;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 4:
                    list = this.nullableListOfSignedLinkDTOAdapter.fromJson(reader);
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 5:
                    minimalLimit = this.nullableMinimalLimitAdapter.fromJson(reader);
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 6:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxCount", "maxCount", reader);
                    }
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 7:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("uploadImageAction", "uploadImageAction", reader);
                    }
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 8:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("continueButton", "continueButton", reader);
                    }
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 9:
                    buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO2 == null) {
                        throw c.q("addPhotoButton", "addPhotoButton", reader);
                    }
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 10:
                    buttonV3DTO3 = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                default:
                    num = num2;
                    imageDTO = imageDTO3;
                    itemDTO = itemDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnCreationPhotoPickerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("item");
        this.nullableItemDTOAdapter.mo44toJson(writer, (x) value.getItem());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("emptyStateImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getEmptyStateImage());
        writer.w("existingImages");
        this.nullableListOfSignedLinkDTOAdapter.mo44toJson(writer, (x) value.getExistingImages());
        writer.w("minimalLimit");
        this.nullableMinimalLimitAdapter.mo44toJson(writer, (x) value.getMinimalLimit());
        writer.w("maxCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxCount()));
        writer.w("uploadImageAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getUploadImageAction());
        writer.w("continueButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getContinueButton());
        writer.w("addPhotoButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getAddPhotoButton());
        writer.w("addMorePhotoButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAddMorePhotoButton());
        writer.p();
    }
}
