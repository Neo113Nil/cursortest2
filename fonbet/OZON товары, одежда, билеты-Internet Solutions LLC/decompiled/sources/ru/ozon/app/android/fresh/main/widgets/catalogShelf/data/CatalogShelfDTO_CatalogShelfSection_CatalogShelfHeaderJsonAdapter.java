package ru.ozon.app.android.fresh.main.widgets.catalogShelf.data;

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
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO_CatalogShelfSection_CatalogShelfHeaderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "headerV2DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfDTO_CatalogShelfSection_CatalogShelfHeaderJsonAdapter extends JsonAdapter<CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader> {

    @NotNull
    private final JsonAdapter<HeaderV2DTO> headerV2DTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CatalogShelfDTO_CatalogShelfSection_CatalogShelfHeaderJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "catalogueTabsConnectionTag");
        M m11 = M.f71699a;
        this.headerV2DTOAdapter = moshi.f(HeaderV2DTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "catalogueTabsConnectionTag");
    }

    @NotNull
    public String toString() {
        return b.c(76, "GeneratedJsonAdapter(CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HeaderV2DTO headerV2DTO = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerV2DTO = this.headerV2DTOAdapter.fromJson(reader);
                if (headerV2DTO == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (headerV2DTO != null) {
            return new CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader(headerV2DTO, str);
        }
        throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerV2DTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("catalogueTabsConnectionTag");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCatalogueTabsConnectionTag());
        writer.p();
    }
}
