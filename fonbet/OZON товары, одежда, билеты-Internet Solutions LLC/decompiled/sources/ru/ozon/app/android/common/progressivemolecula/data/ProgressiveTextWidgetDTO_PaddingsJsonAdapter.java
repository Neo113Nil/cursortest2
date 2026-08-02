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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO_PaddingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveTextWidgetDTO_PaddingsJsonAdapter extends JsonAdapter<ProgressiveTextWidgetDTO.Paddings> {

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> layoutPaddingAdapter;

    @NotNull
    private final n.a options;

    public ProgressiveTextWidgetDTO_PaddingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftPadding", "rightPadding", "topPadding", "bottomPadding");
        this.layoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, M.f71699a, "leftPadding");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(ProgressiveTextWidgetDTO.Paddings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProgressiveTextWidgetDTO.Paddings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                layoutPadding = this.layoutPaddingAdapter.fromJson(reader);
                if (layoutPadding == null) {
                    throw c.q("leftPadding", "leftPadding", reader);
                }
            } else if (v11 == 1) {
                layoutPadding2 = this.layoutPaddingAdapter.fromJson(reader);
                if (layoutPadding2 == null) {
                    throw c.q("rightPadding", "rightPadding", reader);
                }
            } else if (v11 == 2) {
                layoutPadding3 = this.layoutPaddingAdapter.fromJson(reader);
                if (layoutPadding3 == null) {
                    throw c.q("topPadding", "topPadding", reader);
                }
            } else if (v11 == 3 && (layoutPadding4 = this.layoutPaddingAdapter.fromJson(reader)) == null) {
                throw c.q("bottomPadding", "bottomPadding", reader);
            }
        }
        reader.endObject();
        if (layoutPadding == null) {
            throw c.j("leftPadding", "leftPadding", reader);
        }
        if (layoutPadding2 == null) {
            throw c.j("rightPadding", "rightPadding", reader);
        }
        if (layoutPadding3 == null) {
            throw c.j("topPadding", "topPadding", reader);
        }
        if (layoutPadding4 != null) {
            return new ProgressiveTextWidgetDTO.Paddings(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }
        throw c.j("bottomPadding", "bottomPadding", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProgressiveTextWidgetDTO.Paddings value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("rightPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("topPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("bottomPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.p();
    }
}
