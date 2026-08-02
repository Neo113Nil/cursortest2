package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.data.DocsTableV2DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO_DocumentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Document;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Document;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Document;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Status;", "nullableStatusAdapter", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableListOfButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "booleanAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTableV2DTO_DocumentJsonAdapter extends JsonAdapter<DocsTableV2DTO.Document> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3DTO>> nullableListOfButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<DocsTableV2DTO.Status> nullableStatusAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public DocsTableV2DTO_DocumentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "sum", "status", "dateInfo", "buttons", "badge", "showSeparator");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "sum");
        this.nullableStatusAdapter = moshi.f(DocsTableV2DTO.Status.class, m11, "status");
        this.nullableListOfButtonV3DTOAdapter = moshi.f(D.e(List.class, ButtonV3DTO.class), m11, "buttons");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "showSeparator");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(DocsTableV2DTO.Document)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DocsTableV2DTO.Document fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        CellDTO cellDTO = null;
        TextDTO textDTO = null;
        DocsTableV2DTO.Status status = null;
        TextDTO textDTO2 = null;
        List<ButtonV3DTO> list = null;
        BadgeDTO badgeDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    status = this.nullableStatusAdapter.fromJson(reader);
                    break;
                case 3:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("showSeparator", "showSeparator", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (cellDTO == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (bool != null) {
            return new DocsTableV2DTO.Document(cellDTO, textDTO, status, textDTO2, list, badgeDTO, bool.booleanValue());
        }
        throw c.j("showSeparator", "showSeparator", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DocsTableV2DTO.Document value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("sum");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSum());
        writer.w("status");
        this.nullableStatusAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("dateInfo");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDateInfo());
        writer.w("buttons");
        this.nullableListOfButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("showSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowSeparator()));
        writer.p();
    }
}
