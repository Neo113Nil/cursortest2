package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

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
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO_ActionsFooterDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "nullableListOfFooterControlDTOAdapter", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SingleReviewDTO_ActionsFooterDTOJsonAdapter extends JsonAdapter<SingleReviewDTO.ActionsFooterDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<List<SingleReviewDTO.FooterControlDTO>> nullableListOfFooterControlDTOAdapter;

    @NotNull
    private final n.a options;

    public SingleReviewDTO_ActionsFooterDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("hasSeparator", "leftButtons", "rightButtons");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hasSeparator");
        this.nullableListOfFooterControlDTOAdapter = moshi.f(D.e(List.class, SingleReviewDTO.FooterControlDTO.class), m11, "leftButtons");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(SingleReviewDTO.ActionsFooterDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SingleReviewDTO.ActionsFooterDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        List<SingleReviewDTO.FooterControlDTO> list = null;
        List<SingleReviewDTO.FooterControlDTO> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("hasSeparator", "hasSeparator", reader);
                }
            } else if (v11 == 1) {
                list = this.nullableListOfFooterControlDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list2 = this.nullableListOfFooterControlDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (bool != null) {
            return new SingleReviewDTO.ActionsFooterDTO(bool.booleanValue(), list, list2);
        }
        throw c.j("hasSeparator", "hasSeparator", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SingleReviewDTO.ActionsFooterDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("hasSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHasSeparator()));
        writer.w("leftButtons");
        this.nullableListOfFooterControlDTOAdapter.mo44toJson(writer, (x) value.getLeftButtons());
        writer.w("rightButtons");
        this.nullableListOfFooterControlDTOAdapter.mo44toJson(writer, (x) value.getRightButtons());
        writer.p();
    }
}
