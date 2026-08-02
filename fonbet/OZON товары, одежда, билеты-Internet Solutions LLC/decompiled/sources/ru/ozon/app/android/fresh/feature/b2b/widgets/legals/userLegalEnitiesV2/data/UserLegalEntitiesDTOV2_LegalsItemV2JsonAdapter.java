package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.data.UserLegalEntitiesDTOV2;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2_LegalsItemV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$CompanyId;", "nullableCompanyIdAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton;", "nullableActionButtonAdapter", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserLegalEntitiesDTOV2_LegalsItemV2JsonAdapter extends JsonAdapter<UserLegalEntitiesDTOV2.LegalsItemV2> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<UserLegalEntitiesDTOV2.LegalsItemV2.ActionButton> nullableActionButtonAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<UserLegalEntitiesDTOV2.LegalsItemV2.CompanyId> nullableCompanyIdAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public UserLegalEntitiesDTOV2_LegalsItemV2JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "payprops", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "companyId", "actionButton", "controls", "bottomControl");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "payprops");
        this.nullableCompanyIdAdapter = moshi.f(UserLegalEntitiesDTOV2.LegalsItemV2.CompanyId.class, m11, "companyId");
        this.nullableActionButtonAdapter = moshi.f(UserLegalEntitiesDTOV2.LegalsItemV2.ActionButton.class, m11, "actionButton");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "controls");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "bottomControl");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(UserLegalEntitiesDTOV2.LegalsItemV2)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UserLegalEntitiesDTOV2.LegalsItemV2 fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        UserLegalEntitiesDTOV2.LegalsItemV2.CompanyId companyId = null;
        UserLegalEntitiesDTOV2.LegalsItemV2.ActionButton actionButton = null;
        List<AtomDTO> list = null;
        CellDTO cellDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    companyId = this.nullableCompanyIdAdapter.fromJson(reader);
                    break;
                case 4:
                    actionButton = this.nullableActionButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO != null) {
            return new UserLegalEntitiesDTOV2.LegalsItemV2(textDTO, textDTO2, textDTO3, companyId, actionButton, list, cellDTO);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UserLegalEntitiesDTOV2.LegalsItemV2 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("payprops");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getPayprops());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("companyId");
        this.nullableCompanyIdAdapter.mo44toJson(writer, (x) value.getCompanyId());
        writer.w("actionButton");
        this.nullableActionButtonAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.w("controls");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getControls());
        writer.w("bottomControl");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getBottomControl());
        writer.p();
    }
}
