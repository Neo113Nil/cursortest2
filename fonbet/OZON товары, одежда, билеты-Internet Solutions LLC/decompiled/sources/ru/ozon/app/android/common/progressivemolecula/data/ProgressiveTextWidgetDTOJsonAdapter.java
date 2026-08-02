package ru.ozon.app.android.common.progressivemolecula.data;

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
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "progressiveTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "", "nullableBooleanAdapter", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextWidgetDTOJsonAdapter extends JsonAdapter<ProgressiveTextWidgetDTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProgressiveTextWidgetDTO.ProgressiveTextDTO> progressiveTextDTOAdapter;

    public ProgressiveTextWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("progressiveText", "horizontalPadding", "isSticky");
        M m11 = M.f71699a;
        this.progressiveTextDTOAdapter = moshi.f(ProgressiveTextWidgetDTO.ProgressiveTextDTO.class, m11, "progressiveText");
        this.nullableLayoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "horizontalPadding");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSticky");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(ProgressiveTextWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProgressiveTextWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveTextDTO = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                progressiveTextDTO = this.progressiveTextDTOAdapter.fromJson(reader);
                if (progressiveTextDTO == null) {
                    throw c.q("progressiveText", "progressiveText", reader);
                }
            } else if (v11 == 1) {
                layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
            } else if (v11 == 2) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (progressiveTextDTO != null) {
            return new ProgressiveTextWidgetDTO(progressiveTextDTO, layoutPadding, bool);
        }
        throw c.j("progressiveText", "progressiveText", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProgressiveTextWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("progressiveText");
        this.progressiveTextDTOAdapter.mo44toJson(writer, (x) value.getProgressiveText());
        writer.w("horizontalPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.w("isSticky");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSticky());
        writer.p();
    }
}
