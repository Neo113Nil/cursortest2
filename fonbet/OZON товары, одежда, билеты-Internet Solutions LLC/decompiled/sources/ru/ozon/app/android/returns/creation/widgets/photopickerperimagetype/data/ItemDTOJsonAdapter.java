package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data.ItemDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "nullableIslandSeparatorDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "addPhotoButtonDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "nullableListOfSignedLinkDTOAdapter", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$SettingsDTO;", "settingsDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemDTOJsonAdapter extends JsonAdapter<ItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ItemDTO.AddPhotoButtonDTO> addPhotoButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;
    private volatile Constructor<ItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IslandSeparatorDTO> nullableIslandSeparatorDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SignedLinkDTO>> nullableListOfSignedLinkDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ItemDTO.SettingsDTO> settingsDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("islandSeparator", "cell", "subtitle", "addPhotoButton", "uploadImageAction", "existingImages", "errorDescription", "settings");
        M m11 = M.f71699a;
        this.nullableIslandSeparatorDTOAdapter = moshi.f(IslandSeparatorDTO.class, m11, "islandSeparator");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.addPhotoButtonDTOAdapter = moshi.f(ItemDTO.AddPhotoButtonDTO.class, m11, "addPhotoButton");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "uploadImageAction");
        this.nullableListOfSignedLinkDTOAdapter = moshi.f(D.e(List.class, SignedLinkDTO.class), m11, "existingImages");
        this.settingsDTOAdapter = moshi.f(ItemDTO.SettingsDTO.class, m11, "settings");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IslandSeparatorDTO islandSeparatorDTO = null;
        CellDTO cellDTO = null;
        TextDTO textDTO = null;
        ItemDTO.AddPhotoButtonDTO addPhotoButtonDTO = null;
        AtomActionDTO atomActionDTO = null;
        List<SignedLinkDTO> list = null;
        TextDTO textDTO2 = null;
        ItemDTO.SettingsDTO settingsDTO = null;
        while (reader.hasNext()) {
            IslandSeparatorDTO islandSeparatorDTO2 = islandSeparatorDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    islandSeparatorDTO = this.nullableIslandSeparatorDTOAdapter.fromJson(reader);
                    continue;
                case 1:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    break;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 3:
                    addPhotoButtonDTO = this.addPhotoButtonDTOAdapter.fromJson(reader);
                    if (addPhotoButtonDTO == null) {
                        throw c.q("addPhotoButton", "addPhotoButton", reader);
                    }
                    break;
                case 4:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("uploadImageAction", "uploadImageAction", reader);
                    }
                    break;
                case 5:
                    list = this.nullableListOfSignedLinkDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("errorDescription", "errorDescription", reader);
                    }
                    break;
                case 7:
                    settingsDTO = this.settingsDTOAdapter.fromJson(reader);
                    if (settingsDTO == null) {
                        throw c.q("settings", "settings", reader);
                    }
                    break;
            }
            islandSeparatorDTO = islandSeparatorDTO2;
        }
        IslandSeparatorDTO islandSeparatorDTO3 = islandSeparatorDTO;
        reader.endObject();
        if (cellDTO == null) {
            throw c.j("cell", "cell", reader);
        }
        if (textDTO == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        if (addPhotoButtonDTO == null) {
            throw c.j("addPhotoButton", "addPhotoButton", reader);
        }
        if (atomActionDTO == null) {
            throw c.j("uploadImageAction", "uploadImageAction", reader);
        }
        if (textDTO2 == null) {
            throw c.j("errorDescription", "errorDescription", reader);
        }
        if (settingsDTO != null) {
            return new ItemDTO(0, islandSeparatorDTO3, cellDTO, textDTO, addPhotoButtonDTO, atomActionDTO, list, textDTO2, settingsDTO, 1, null);
        }
        throw c.j("settings", "settings", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("islandSeparator");
        this.nullableIslandSeparatorDTOAdapter.mo44toJson(writer, (x) value.getIslandSeparator());
        writer.w("cell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("addPhotoButton");
        this.addPhotoButtonDTOAdapter.mo44toJson(writer, (x) value.getAddPhotoButton());
        writer.w("uploadImageAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getUploadImageAction());
        writer.w("existingImages");
        this.nullableListOfSignedLinkDTOAdapter.mo44toJson(writer, (x) value.getExistingImages());
        writer.w("errorDescription");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getErrorDescription());
        writer.w("settings");
        this.settingsDTOAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.p();
    }
}
