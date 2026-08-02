package ru.ozon.app.android.checkoutcomposer.total.models;

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
import ru.ozon.app.android.checkoutcomposer.total.models.TotalDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO_Summary_Price_LeftBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableOzonSpannableStringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/deprecated/Button;", "nullableButtonAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalDTO_Summary_Price_LeftBlockJsonAdapter extends JsonAdapter<TotalDTO.Summary.Price.LeftBlock> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Button> nullableButtonAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public TotalDTO_Summary_Price_LeftBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "image", "button");
        M m11 = M.f71699a;
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "subtitle");
        this.nullableStringAdapter = moshi.f(String.class, m11, "image");
        this.nullableButtonAdapter = moshi.f(Button.class, m11, "button");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(TotalDTO.Summary.Price.LeftBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalDTO.Summary.Price.LeftBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str = null;
        Button button = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                if (ozonSpannableString == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                button = this.nullableButtonAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (ozonSpannableString != null) {
            return new TotalDTO.Summary.Price.LeftBlock(ozonSpannableString, ozonSpannableString2, str, button);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalDTO.Summary.Price.LeftBlock value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("button");
        this.nullableButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.p();
    }
}
