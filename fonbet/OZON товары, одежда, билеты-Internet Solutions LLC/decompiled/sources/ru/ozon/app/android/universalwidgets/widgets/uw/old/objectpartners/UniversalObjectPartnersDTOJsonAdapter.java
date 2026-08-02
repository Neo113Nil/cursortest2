package ru.ozon.app.android.universalwidgets.widgets.uw.old.objectpartners;

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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.footer.UniversalFooterDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.header.UniversalHeaderDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.objectpartners.UniversalObjectPartnersDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;", "nullableUniversalHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;", "nullableUniversalFooterDTOAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$DesignTypeDTO;", "designTypeDTOAdapter", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/objectpartners/UniversalObjectPartnersDTO$ItemDTO;", "listOfItemDTOAdapter", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectPartnersDTOJsonAdapter extends JsonAdapter<UniversalObjectPartnersDTO> {

    @NotNull
    private final JsonAdapter<UniversalObjectPartnersDTO.DesignTypeDTO> designTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<UniversalObjectPartnersDTO.ItemDTO>> listOfItemDTOAdapter;

    @NotNull
    private final JsonAdapter<UniversalFooterDTO> nullableUniversalFooterDTOAdapter;

    @NotNull
    private final JsonAdapter<UniversalHeaderDTO> nullableUniversalHeaderDTOAdapter;

    @NotNull
    private final n.a options;

    public UniversalObjectPartnersDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "designType", "items");
        M m11 = M.f71699a;
        this.nullableUniversalHeaderDTOAdapter = moshi.f(UniversalHeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableUniversalFooterDTOAdapter = moshi.f(UniversalFooterDTO.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.designTypeDTOAdapter = moshi.f(UniversalObjectPartnersDTO.DesignTypeDTO.class, m11, "designType");
        this.listOfItemDTOAdapter = moshi.f(D.e(List.class, UniversalObjectPartnersDTO.ItemDTO.class), m11, "items");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(UniversalObjectPartnersDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UniversalObjectPartnersDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        UniversalHeaderDTO universalHeaderDTO = null;
        UniversalFooterDTO universalFooterDTO = null;
        UniversalObjectPartnersDTO.DesignTypeDTO designTypeDTO = null;
        List<UniversalObjectPartnersDTO.ItemDTO> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                universalHeaderDTO = this.nullableUniversalHeaderDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                universalFooterDTO = this.nullableUniversalFooterDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                designTypeDTO = this.designTypeDTOAdapter.fromJson(reader);
                if (designTypeDTO == null) {
                    throw c.q("designType", "designType", reader);
                }
            } else if (v11 == 3 && (list = this.listOfItemDTOAdapter.fromJson(reader)) == null) {
                throw c.q("items", "items", reader);
            }
        }
        reader.endObject();
        if (designTypeDTO == null) {
            throw c.j("designType", "designType", reader);
        }
        if (list != null) {
            return new UniversalObjectPartnersDTO(universalHeaderDTO, universalFooterDTO, designTypeDTO, list);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UniversalObjectPartnersDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableUniversalHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableUniversalFooterDTOAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("designType");
        this.designTypeDTOAdapter.mo44toJson(writer, (x) value.getDesignType());
        writer.w("items");
        this.listOfItemDTOAdapter.mo44toJson(writer, (x) value.getItems());
        writer.p();
    }
}
