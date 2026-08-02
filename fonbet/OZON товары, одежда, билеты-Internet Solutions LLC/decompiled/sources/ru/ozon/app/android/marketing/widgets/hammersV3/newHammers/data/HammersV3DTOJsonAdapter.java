package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;", "nullableHammersV3HeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;", "listOfHammersV3BodyDTOAdapter", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "nullableHammersV3GradientHeaderDTOAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3DTOJsonAdapter extends JsonAdapter<HammersV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<HammersV3BodyDTO>> listOfHammersV3BodyDTOAdapter;

    @NotNull
    private final JsonAdapter<HammersV3GradientHeaderDTO> nullableHammersV3GradientHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<HammersV3HeaderDTO> nullableHammersV3HeaderDTOAdapter;

    @NotNull
    private final n.a options;

    public HammersV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "products", "gradientHeader");
        M m11 = M.f71699a;
        this.nullableHammersV3HeaderDTOAdapter = moshi.f(HammersV3HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfHammersV3BodyDTOAdapter = moshi.f(D.e(List.class, HammersV3BodyDTO.class), m11, "products");
        this.nullableHammersV3GradientHeaderDTOAdapter = moshi.f(HammersV3GradientHeaderDTO.class, m11, "gradientHeader");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(HammersV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HammersV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HammersV3HeaderDTO hammersV3HeaderDTO = null;
        List<HammersV3BodyDTO> list = null;
        HammersV3GradientHeaderDTO hammersV3GradientHeaderDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                hammersV3HeaderDTO = this.nullableHammersV3HeaderDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfHammersV3BodyDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("products", "products", reader);
                }
            } else if (v11 == 2) {
                hammersV3GradientHeaderDTO = this.nullableHammersV3GradientHeaderDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new HammersV3DTO(hammersV3HeaderDTO, list, hammersV3GradientHeaderDTO);
        }
        throw c.j("products", "products", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HammersV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHammersV3HeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("products");
        this.listOfHammersV3BodyDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("gradientHeader");
        this.nullableHammersV3GradientHeaderDTOAdapter.mo44toJson(writer, (x) value.getGradientHeader());
        writer.p();
    }
}
