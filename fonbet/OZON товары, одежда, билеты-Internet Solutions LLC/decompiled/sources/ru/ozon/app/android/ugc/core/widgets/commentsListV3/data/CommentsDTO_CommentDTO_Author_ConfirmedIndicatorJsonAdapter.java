package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO_CommentDTO_Author_ConfirmedIndicatorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicatorDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsDTO_CommentDTO_Author_ConfirmedIndicatorJsonAdapter extends JsonAdapter<CommentsDTO.CommentDTO.Author.ConfirmedIndicator> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IndicatorDTO> indicatorDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CommentsDTO_CommentDTO_Author_ConfirmedIndicatorJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("indicator", "fillColor", "borderColor");
        M m11 = M.f71699a;
        this.indicatorDTOAdapter = moshi.f(IndicatorDTO.class, m11, "indicator");
        this.nullableStringAdapter = moshi.f(String.class, m11, "fillColor");
    }

    @NotNull
    public String toString() {
        return b.c(70, "GeneratedJsonAdapter(CommentsDTO.CommentDTO.Author.ConfirmedIndicator)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommentsDTO.CommentDTO.Author.ConfirmedIndicator fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IndicatorDTO indicatorDTO = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                indicatorDTO = this.indicatorDTOAdapter.fromJson(reader);
                if (indicatorDTO == null) {
                    throw c.q("indicator", "indicator", reader);
                }
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (indicatorDTO != null) {
            return new CommentsDTO.CommentDTO.Author.ConfirmedIndicator(indicatorDTO, str, str2);
        }
        throw c.j("indicator", "indicator", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommentsDTO.CommentDTO.Author.ConfirmedIndicator value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("indicator");
        this.indicatorDTOAdapter.mo44toJson(writer, (x) value.getIndicator());
        writer.w("fillColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getFillColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.p();
    }
}
