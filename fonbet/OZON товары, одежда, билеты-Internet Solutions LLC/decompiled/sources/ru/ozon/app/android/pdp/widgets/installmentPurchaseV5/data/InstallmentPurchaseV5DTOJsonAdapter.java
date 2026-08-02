package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data;

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
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data.InstallmentPurchaseV5DTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$TitleBlock;", "nullableTitleBlockAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO$ContentBlock;", "contentBlockAdapter", "nullableStringAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseV5DTOJsonAdapter extends JsonAdapter<InstallmentPurchaseV5DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<InstallmentPurchaseV5DTO.ContentBlock> contentBlockAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<InstallmentPurchaseV5DTO.TitleBlock> nullableTitleBlockAdapter;

    @NotNull
    private final n.a options;

    public InstallmentPurchaseV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("titleBlock", "contentBlock", "background");
        M m11 = M.f71699a;
        this.nullableTitleBlockAdapter = moshi.f(InstallmentPurchaseV5DTO.TitleBlock.class, m11, "titleBlock");
        this.contentBlockAdapter = moshi.f(InstallmentPurchaseV5DTO.ContentBlock.class, m11, "contentBlock");
        this.nullableStringAdapter = moshi.f(String.class, m11, "background");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(InstallmentPurchaseV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InstallmentPurchaseV5DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        InstallmentPurchaseV5DTO.TitleBlock titleBlock = null;
        InstallmentPurchaseV5DTO.ContentBlock contentBlock = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                titleBlock = this.nullableTitleBlockAdapter.fromJson(reader);
            } else if (v11 == 1) {
                contentBlock = this.contentBlockAdapter.fromJson(reader);
                if (contentBlock == null) {
                    throw c.q("contentBlock", "contentBlock", reader);
                }
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (contentBlock != null) {
            return new InstallmentPurchaseV5DTO(titleBlock, contentBlock, str);
        }
        throw c.j("contentBlock", "contentBlock", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InstallmentPurchaseV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("titleBlock");
        this.nullableTitleBlockAdapter.mo44toJson(writer, (x) value.getTitleBlock());
        writer.w("contentBlock");
        this.contentBlockAdapter.mo44toJson(writer, (x) value.getContentBlock());
        writer.w("background");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackground());
        writer.p();
    }
}
