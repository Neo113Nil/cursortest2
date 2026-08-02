package ru.ozon.app.android.ugc.widgets.usersGradesV2.data;

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
import ru.ozon.app.android.ugc.widgets.usersGradesV2.data.UsersGradesV2DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO_ContextQuestionItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextAnswerItem;", "nullableListOfContextAnswerItemAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableFloatAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersGradesV2DTO_ContextQuestionItemDTOJsonAdapter extends JsonAdapter<UsersGradesV2DTO.ContextQuestionItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<UsersGradesV2DTO.ContextAnswerItem>> nullableListOfContextAnswerItemAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public UsersGradesV2DTO_ContextQuestionItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("foldedCell", "unfoldedCell", "isUnfolded", "contextAnswers", "color", "rootBackgroundColor", "bottomPadding", "rootCornerRadius");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "foldedCell");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isUnfolded");
        this.nullableListOfContextAnswerItemAdapter = moshi.f(D.e(List.class, UsersGradesV2DTO.ContextAnswerItem.class), m11, "contextAnswers");
        this.nullableStringAdapter = moshi.f(String.class, m11, "color");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "bottomPadding");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "rootCornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(UsersGradesV2DTO.ContextQuestionItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UsersGradesV2DTO.ContextQuestionItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        CellDTO cellDTO = null;
        CellDTO cellDTO2 = null;
        List<UsersGradesV2DTO.ContextAnswerItem> list = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Float f7 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("foldedCell", "foldedCell", reader);
                    }
                    break;
                case 1:
                    cellDTO2 = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO2 == null) {
                        throw c.q("unfoldedCell", "unfoldedCell", reader);
                    }
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isUnfolded", "isUnfolded", reader);
                    }
                    break;
                case 3:
                    list = this.nullableListOfContextAnswerItemAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 7:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (cellDTO == null) {
            throw c.j("foldedCell", "foldedCell", reader);
        }
        if (cellDTO2 == null) {
            throw c.j("unfoldedCell", "unfoldedCell", reader);
        }
        if (bool != null) {
            return new UsersGradesV2DTO.ContextQuestionItemDTO(cellDTO, cellDTO2, bool.booleanValue(), list, str, str2, num, f7);
        }
        throw c.j("isUnfolded", "isUnfolded", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UsersGradesV2DTO.ContextQuestionItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("foldedCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getFoldedCell());
        writer.w("unfoldedCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getUnfoldedCell());
        writer.w("isUnfolded");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isUnfolded()));
        writer.w("contextAnswers");
        this.nullableListOfContextAnswerItemAdapter.mo44toJson(writer, (x) value.getContextAnswers());
        writer.w("color");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getColor());
        writer.w("rootBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRootBackgroundColor());
        writer.w("bottomPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.w("rootCornerRadius");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getRootCornerRadius());
        writer.p();
    }
}
