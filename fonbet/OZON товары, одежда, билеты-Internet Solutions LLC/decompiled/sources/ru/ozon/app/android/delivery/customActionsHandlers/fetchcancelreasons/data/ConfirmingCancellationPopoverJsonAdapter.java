package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data;

import Ak.b;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopoverJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConfirmingCancellationPopoverJsonAdapter extends JsonAdapter<ConfirmingCancellationPopover> {

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<ConfirmingCancellationPopover> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ConfirmingCancellationPopoverJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "cancel", "confirm", "nextAction");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "cancel");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "nextAction");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ConfirmingCancellationPopover)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ConfirmingCancellationPopover fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ImageDTO imageDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        AtomActionDTO atomActionDTO = null;
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
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 3:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("cancel", "cancel", reader);
                    }
                    break;
                case 4:
                    buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO2 == null) {
                        throw c.q("confirm", "confirm", reader);
                    }
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
            ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            ImageDTO imageDTO2 = imageDTO;
            if (imageDTO2 == null) {
                throw c.j("image", "image", reader);
            }
            if (textDTO4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (textDTO3 == null) {
                throw c.j("subtitle", "subtitle", reader);
            }
            if (buttonV3DTO4 == null) {
                throw c.j("cancel", "cancel", reader);
            }
            if (buttonV3DTO3 != null) {
                return new ConfirmingCancellationPopover(imageDTO2, textDTO4, textDTO3, buttonV3DTO4, buttonV3DTO3, atomActionDTO2);
            }
            throw c.j("confirm", "confirm", reader);
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        ButtonV3DTO buttonV3DTO5 = buttonV3DTO2;
        ButtonV3DTO buttonV3DTO6 = buttonV3DTO;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        ImageDTO imageDTO3 = imageDTO;
        Constructor<ConfirmingCancellationPopover> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ConfirmingCancellationPopover.class.getDeclaredConstructor(ImageDTO.class, TextDTO.class, TextDTO.class, ButtonV3DTO.class, ButtonV3DTO.class, AtomActionDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (imageDTO3 == null) {
            throw c.j("image", "image", reader);
        }
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textDTO5 == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        if (buttonV3DTO6 == null) {
            throw c.j("cancel", "cancel", reader);
        }
        if (buttonV3DTO5 == null) {
            throw c.j("confirm", "confirm", reader);
        }
        ConfirmingCancellationPopover newInstance = constructor.newInstance(imageDTO3, textDTO6, textDTO5, buttonV3DTO6, buttonV3DTO5, atomActionDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ConfirmingCancellationPopover value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("cancel");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getCancel());
        writer.w("confirm");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getConfirm());
        writer.w("nextAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getNextAction());
        writer.p();
    }
}
