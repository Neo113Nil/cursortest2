package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data;

import Ak.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO_PaddingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Paddings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/core/models/UniPaddingToken;", "nullableUniPaddingTokenAdapter", "Lcom/squareup/moshi/JsonAdapter;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonLayoutGridDTO_PaddingsJsonAdapter extends JsonAdapter<CommonLayoutGridDTO.Paddings> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<UniPaddingToken> nullableUniPaddingTokenAdapter;

    @NotNull
    private final n.a options;

    public CommonLayoutGridDTO_PaddingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("leftPadding", "rightPadding", "topPadding", "bottomPadding");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<UniPaddingToken> f7 = moshi.f(UniPaddingToken.class, M.f71699a, "leftPadding");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableUniPaddingTokenAdapter = f7;
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(CommonLayoutGridDTO.Paddings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonLayoutGridDTO.Paddings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        UniPaddingToken uniPaddingToken = null;
        UniPaddingToken uniPaddingToken2 = null;
        UniPaddingToken uniPaddingToken3 = null;
        UniPaddingToken uniPaddingToken4 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                uniPaddingToken = this.nullableUniPaddingTokenAdapter.fromJson(reader);
            } else if (v11 == 1) {
                uniPaddingToken2 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
            } else if (v11 == 2) {
                uniPaddingToken3 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
            } else if (v11 == 3) {
                uniPaddingToken4 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new CommonLayoutGridDTO.Paddings(uniPaddingToken, uniPaddingToken2, uniPaddingToken3, uniPaddingToken4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonLayoutGridDTO.Paddings value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftPadding");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getLeftPadding());
        writer.w("rightPadding");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getRightPadding());
        writer.w("topPadding");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("bottomPadding");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getBottomPadding());
        writer.p();
    }
}
