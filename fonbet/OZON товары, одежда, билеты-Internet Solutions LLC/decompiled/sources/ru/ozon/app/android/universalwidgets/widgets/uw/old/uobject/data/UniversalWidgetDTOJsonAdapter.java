package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data;

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
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;", "designTypeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", "nullableFooterDTOAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;", "nullableHeaderDTOAdapter", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;", "nullableListOfItemDTOAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;", "nullableObjectGrid3NewDTOAdapter", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalWidgetDTOJsonAdapter extends JsonAdapter<UniversalWidgetDTO> {

    @NotNull
    private final JsonAdapter<UniversalWidgetDTO.DesignTypeDTO> designTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<UniversalWidgetDTO.FooterDTO> nullableFooterDTOAdapter;

    @NotNull
    private final JsonAdapter<UniversalWidgetDTO.HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<List<UniversalWidgetDTO.ItemDTO>> nullableListOfItemDTOAdapter;

    @NotNull
    private final JsonAdapter<UniversalWidgetDTO.ObjectGrid3NewDTO> nullableObjectGrid3NewDTOAdapter;

    @NotNull
    private final n.a options;

    public UniversalWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("designType", CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.HEADER_FIELD_NAME, "items", "object");
        M m11 = M.f71699a;
        this.designTypeDTOAdapter = moshi.f(UniversalWidgetDTO.DesignTypeDTO.class, m11, "designType");
        this.nullableFooterDTOAdapter = moshi.f(UniversalWidgetDTO.FooterDTO.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableHeaderDTOAdapter = moshi.f(UniversalWidgetDTO.HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfItemDTOAdapter = moshi.f(D.e(List.class, UniversalWidgetDTO.ItemDTO.class), m11, "items");
        this.nullableObjectGrid3NewDTOAdapter = moshi.f(UniversalWidgetDTO.ObjectGrid3NewDTO.class, m11, "objectGrid3New");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(UniversalWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UniversalWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        UniversalWidgetDTO.DesignTypeDTO designTypeDTO = null;
        UniversalWidgetDTO.FooterDTO footerDTO = null;
        UniversalWidgetDTO.HeaderDTO headerDTO = null;
        List<UniversalWidgetDTO.ItemDTO> list = null;
        UniversalWidgetDTO.ObjectGrid3NewDTO objectGrid3NewDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                designTypeDTO = this.designTypeDTOAdapter.fromJson(reader);
                if (designTypeDTO == null) {
                    throw c.q("designType", "designType", reader);
                }
            } else if (v11 == 1) {
                footerDTO = this.nullableFooterDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                list = this.nullableListOfItemDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                objectGrid3NewDTO = this.nullableObjectGrid3NewDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (designTypeDTO != null) {
            return new UniversalWidgetDTO(designTypeDTO, footerDTO, headerDTO, list, objectGrid3NewDTO);
        }
        throw c.j("designType", "designType", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UniversalWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("designType");
        this.designTypeDTOAdapter.mo44toJson(writer, (x) value.getDesignType());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterDTOAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("items");
        this.nullableListOfItemDTOAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("object");
        this.nullableObjectGrid3NewDTOAdapter.mo44toJson(writer, (x) value.getObjectGrid3New());
        writer.p();
    }
}
