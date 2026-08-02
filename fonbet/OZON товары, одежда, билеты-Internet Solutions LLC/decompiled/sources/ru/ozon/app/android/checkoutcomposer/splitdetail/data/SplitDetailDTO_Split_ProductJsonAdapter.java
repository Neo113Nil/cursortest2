package ru.ozon.app.android.checkoutcomposer.splitdetail.data;

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
import ru.ozon.app.android.checkoutcomposer.splitdetail.data.SplitDetailDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO_Split_ProductJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO$Split$Product$Image;", "nullableImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "listOfAtomDTOAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDetailDTO_Split_ProductJsonAdapter extends JsonAdapter<SplitDetailDTO.Split.Product> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> listOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<SplitDetailDTO.Split.Product.Image> nullableImageAdapter;

    @NotNull
    private final n.a options;

    public SplitDetailDTO_Split_ProductJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "elements");
        M m11 = M.f71699a;
        this.nullableImageAdapter = moshi.f(SplitDetailDTO.Split.Product.Image.class, m11, "image");
        this.listOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "elements");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(SplitDetailDTO.Split.Product)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SplitDetailDTO.Split.Product fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        SplitDetailDTO.Split.Product.Image image = null;
        List<AtomDTO> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                image = this.nullableImageAdapter.fromJson(reader);
            } else if (v11 == 1 && (list = this.listOfAtomDTOAdapter.fromJson(reader)) == null) {
                throw c.q("elements", "elements", reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new SplitDetailDTO.Split.Product(image, list);
        }
        throw c.j("elements", "elements", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SplitDetailDTO.Split.Product value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableImageAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("elements");
        this.listOfAtomDTOAdapter.mo44toJson(writer, (x) value.getElements());
        writer.p();
    }
}
