package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO_DirectFlightsSkeletonDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$DirectFlightsSkeletonDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson-OSb56to", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/text/TextDTO;", "fromJson", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson-3O36ugA", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toJson", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4DTO_DirectFlightsSkeletonDTOJsonAdapter extends JsonAdapter<AviaSearchResultV4DTO.DirectFlightsSkeletonDTO> {
    public static final int $stable = 8;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AviaSearchResultV4DTO_DirectFlightsSkeletonDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter = moshi.f(TextDTO.class, M.f71699a, SelectionItemFormDTO.TITLE_FIELD_NAME);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ AviaSearchResultV4DTO.DirectFlightsSkeletonDTO fromJson(n nVar) {
        return AviaSearchResultV4DTO.DirectFlightsSkeletonDTO.m1066boximpl(m1073fromJsonOSb56to(nVar));
    }

    @NotNull
    /* renamed from: fromJson-OSb56to, reason: not valid java name */
    public TextDTO m1073fromJsonOSb56to(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0 && (textDTO = this.textDTOAdapter.fromJson(reader)) == null) {
                throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
        }
        reader.endObject();
        if (textDTO != null) {
            return AviaSearchResultV4DTO.DirectFlightsSkeletonDTO.m1067constructorimpl(textDTO);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public /* bridge */ /* synthetic */ void mo44toJson(x xVar, AviaSearchResultV4DTO.DirectFlightsSkeletonDTO directFlightsSkeletonDTO) {
        AviaSearchResultV4DTO.DirectFlightsSkeletonDTO directFlightsSkeletonDTO2 = directFlightsSkeletonDTO;
        m1074toJson3O36ugA(xVar, directFlightsSkeletonDTO2 != null ? directFlightsSkeletonDTO2.m1072unboximpl() : null);
    }

    /* renamed from: toJson-3O36ugA, reason: not valid java name */
    public void m1074toJson3O36ugA(@NotNull x writer, TextDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value);
        writer.p();
    }

    @NotNull
    public String toString() {
        return b.c(68, "GeneratedJsonAdapter(AviaSearchResultV4DTO.DirectFlightsSkeletonDTO)", "toString(...)");
    }
}
