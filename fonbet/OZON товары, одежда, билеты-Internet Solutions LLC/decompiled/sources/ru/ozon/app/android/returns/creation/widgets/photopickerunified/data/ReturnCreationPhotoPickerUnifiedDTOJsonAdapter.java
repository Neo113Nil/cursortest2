package ru.ozon.app.android.returns.creation.widgets.photopickerunified.data;

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
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ReturnCreationPhotoPickerUnifiedDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "cellListV2DTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "listOfSignedLinkDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "nullableButtonV3DTOAdapter", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "settingsDTOAdapter", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "notificationsDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerUnifiedDTOJsonAdapter extends JsonAdapter<ReturnCreationPhotoPickerUnifiedDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<CellListV2DTO> cellListV2DTOAdapter;
    private volatile Constructor<ReturnCreationPhotoPickerUnifiedDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<SignedLinkDTO>> listOfSignedLinkDTOAdapter;

    @NotNull
    private final JsonAdapter<ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO> notificationsDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO> settingsDTOAdapter;

    public ReturnCreationPhotoPickerUnifiedDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cell", "cellList", "uploadImageAction", "existingImages", "continueButton", "addPhotoButton", "addMorePhotoButton", "settings", "notifications");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.cellListV2DTOAdapter = moshi.f(CellListV2DTO.class, m11, "cellList");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "uploadImageAction");
        this.listOfSignedLinkDTOAdapter = moshi.f(D.e(List.class, SignedLinkDTO.class), m11, "existingImages");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "continueButton");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "addMorePhotoButton");
        this.settingsDTOAdapter = moshi.f(ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO.class, m11, "settings");
        this.notificationsDTOAdapter = moshi.f(ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO.class, m11, "notifications");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(ReturnCreationPhotoPickerUnifiedDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnCreationPhotoPickerUnifiedDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        CellDTO cellDTO = null;
        CellListV2DTO cellListV2DTO = null;
        AtomActionDTO atomActionDTO = null;
        List<SignedLinkDTO> list = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        ButtonV3DTO buttonV3DTO3 = null;
        ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO settingsDTO = null;
        ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO notificationsDTO = null;
        while (true) {
            CellDTO cellDTO2 = cellDTO;
            CellListV2DTO cellListV2DTO2 = cellListV2DTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            if (!reader.hasNext()) {
                ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
                reader.endObject();
                if (i12 == -9) {
                    if (cellDTO2 == null) {
                        throw c.j("cell", "cell", reader);
                    }
                    if (cellListV2DTO2 == null) {
                        throw c.j("cellList", "cellList", reader);
                    }
                    if (atomActionDTO2 == null) {
                        throw c.j("uploadImageAction", "uploadImageAction", reader);
                    }
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO>");
                    if (buttonV3DTO4 == null) {
                        throw c.j("continueButton", "continueButton", reader);
                    }
                    if (buttonV3DTO2 == null) {
                        throw c.j("addPhotoButton", "addPhotoButton", reader);
                    }
                    if (settingsDTO == null) {
                        throw c.j("settings", "settings", reader);
                    }
                    if (notificationsDTO == null) {
                        throw c.j("notifications", "notifications", reader);
                    }
                    ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO notificationsDTO2 = notificationsDTO;
                    return new ReturnCreationPhotoPickerUnifiedDTO(cellDTO2, cellListV2DTO2, atomActionDTO2, list, buttonV3DTO4, buttonV3DTO2, buttonV3DTO3, settingsDTO, notificationsDTO2);
                }
                Constructor<ReturnCreationPhotoPickerUnifiedDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = ReturnCreationPhotoPickerUnifiedDTO.class.getDeclaredConstructor(CellDTO.class, CellListV2DTO.class, AtomActionDTO.class, List.class, ButtonV3DTO.class, ButtonV3DTO.class, ButtonV3DTO.class, ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO.class, ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<ReturnCreationPhotoPickerUnifiedDTO> constructor2 = constructor;
                if (cellDTO2 == null) {
                    throw c.j("cell", "cell", reader);
                }
                if (cellListV2DTO2 == null) {
                    throw c.j("cellList", "cellList", reader);
                }
                if (atomActionDTO2 == null) {
                    throw c.j("uploadImageAction", "uploadImageAction", reader);
                }
                if (buttonV3DTO4 == null) {
                    throw c.j("continueButton", "continueButton", reader);
                }
                if (buttonV3DTO2 == null) {
                    throw c.j("addPhotoButton", "addPhotoButton", reader);
                }
                if (settingsDTO == null) {
                    throw c.j("settings", "settings", reader);
                }
                if (notificationsDTO == null) {
                    throw c.j("notifications", "notifications", reader);
                }
                ReturnCreationPhotoPickerUnifiedDTO newInstance = constructor2.newInstance(cellDTO2, cellListV2DTO2, atomActionDTO2, list, buttonV3DTO4, buttonV3DTO2, buttonV3DTO3, settingsDTO, notificationsDTO, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            ButtonV3DTO buttonV3DTO5 = buttonV3DTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                case 0:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                case 1:
                    cellListV2DTO = this.cellListV2DTOAdapter.fromJson(reader);
                    if (cellListV2DTO == null) {
                        throw c.q("cellList", "cellList", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    atomActionDTO = atomActionDTO2;
                case 2:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("uploadImageAction", "uploadImageAction", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                case 3:
                    list = this.listOfSignedLinkDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("existingImages", "existingImages", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                    i12 = -9;
                case 4:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("continueButton", "continueButton", reader);
                    }
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                case 5:
                    buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO2 == null) {
                        throw c.q("addPhotoButton", "addPhotoButton", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                case 6:
                    buttonV3DTO3 = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                case 7:
                    settingsDTO = this.settingsDTOAdapter.fromJson(reader);
                    if (settingsDTO == null) {
                        throw c.q("settings", "settings", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                case 8:
                    notificationsDTO = this.notificationsDTOAdapter.fromJson(reader);
                    if (notificationsDTO == null) {
                        throw c.q("notifications", "notifications", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
                default:
                    buttonV3DTO = buttonV3DTO5;
                    cellDTO = cellDTO2;
                    cellListV2DTO = cellListV2DTO2;
                    atomActionDTO = atomActionDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnCreationPhotoPickerUnifiedDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("cellList");
        this.cellListV2DTOAdapter.mo44toJson(writer, (x) value.getCellList());
        writer.w("uploadImageAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getUploadImageAction());
        writer.w("existingImages");
        this.listOfSignedLinkDTOAdapter.mo44toJson(writer, (x) value.getExistingImages());
        writer.w("continueButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getContinueButton());
        writer.w("addPhotoButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getAddPhotoButton());
        writer.w("addMorePhotoButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAddMorePhotoButton());
        writer.w("settings");
        this.settingsDTOAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.w("notifications");
        this.notificationsDTOAdapter.mo44toJson(writer, (x) value.getNotifications());
        writer.p();
    }
}
