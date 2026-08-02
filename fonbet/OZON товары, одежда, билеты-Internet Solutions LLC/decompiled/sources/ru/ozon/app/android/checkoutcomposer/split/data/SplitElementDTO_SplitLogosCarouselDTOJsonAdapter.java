package ru.ozon.app.android.checkoutcomposer.split.data;

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
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO_SplitLogosCarouselDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO$LogosElement;", "listOfLogosElementAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddingsAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitElementDTO_SplitLogosCarouselDTOJsonAdapter extends JsonAdapter<SplitElementDTO.SplitLogosCarouselDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<SplitElementDTO.SplitLogosCarouselDTO.LogosElement>> listOfLogosElementAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    public SplitElementDTO_SplitLogosCarouselDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("index", "elements", "scrollPosition", "paddings");
        M m11 = M.f71699a;
        this.nullableLongAdapter = moshi.f(Long.class, m11, "index");
        this.listOfLogosElementAdapter = moshi.f(D.e(List.class, SplitElementDTO.SplitLogosCarouselDTO.LogosElement.class), m11, "elements");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "scrollPosition");
        this.paddingsAdapter = moshi.f(Paddings.class, m11, "paddings");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(SplitElementDTO.SplitLogosCarouselDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SplitElementDTO.SplitLogosCarouselDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        List<SplitElementDTO.SplitLogosCarouselDTO.LogosElement> list = null;
        Integer num = null;
        Paddings paddings = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l11 = this.nullableLongAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfLogosElementAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("elements", "elements", reader);
                }
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 3 && (paddings = this.paddingsAdapter.fromJson(reader)) == null) {
                throw c.q("paddings", "paddings", reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("elements", "elements", reader);
        }
        if (paddings != null) {
            return new SplitElementDTO.SplitLogosCarouselDTO(l11, list, num, paddings);
        }
        throw c.j("paddings", "paddings", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SplitElementDTO.SplitLogosCarouselDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("index");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getIndex());
        writer.w("elements");
        this.listOfLogosElementAdapter.mo44toJson(writer, (x) value.getElements());
        writer.w("scrollPosition");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getScrollPosition());
        writer.w("paddings");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.p();
    }
}
