package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data;

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
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "sisBrandFavoriteButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "nullableOptionsAdapter", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;", "nullableDynamicOnScrollColorsAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SisBrandFavoriteDTOJsonAdapter extends JsonAdapter<SisBrandFavoriteDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DynamicOnScrollColors> nullableDynamicOnScrollColorsAdapter;

    @NotNull
    private final JsonAdapter<Options> nullableOptionsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<SisBrandFavoriteButton> sisBrandFavoriteButtonAdapter;

    public SisBrandFavoriteDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("favoriteButton", "options", "dynamicOnScrollColors", "dynamicOnScrollFavoriteColors");
        M m11 = M.f71699a;
        this.sisBrandFavoriteButtonAdapter = moshi.f(SisBrandFavoriteButton.class, m11, "favoriteButton");
        this.nullableOptionsAdapter = moshi.f(Options.class, m11, "options");
        this.nullableDynamicOnScrollColorsAdapter = moshi.f(DynamicOnScrollColors.class, m11, "dynamicOnScrollColors");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(SisBrandFavoriteDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SisBrandFavoriteDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        SisBrandFavoriteButton sisBrandFavoriteButton = null;
        Options options = null;
        DynamicOnScrollColors dynamicOnScrollColors = null;
        DynamicOnScrollColors dynamicOnScrollColors2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                sisBrandFavoriteButton = this.sisBrandFavoriteButtonAdapter.fromJson(reader);
                if (sisBrandFavoriteButton == null) {
                    throw c.q("favoriteButton", "favoriteButton", reader);
                }
            } else if (v11 == 1) {
                options = this.nullableOptionsAdapter.fromJson(reader);
            } else if (v11 == 2) {
                dynamicOnScrollColors = this.nullableDynamicOnScrollColorsAdapter.fromJson(reader);
            } else if (v11 == 3) {
                dynamicOnScrollColors2 = this.nullableDynamicOnScrollColorsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (sisBrandFavoriteButton != null) {
            return new SisBrandFavoriteDTO(sisBrandFavoriteButton, options, dynamicOnScrollColors, dynamicOnScrollColors2);
        }
        throw c.j("favoriteButton", "favoriteButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SisBrandFavoriteDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("favoriteButton");
        this.sisBrandFavoriteButtonAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("options");
        this.nullableOptionsAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("dynamicOnScrollColors");
        this.nullableDynamicOnScrollColorsAdapter.mo44toJson(writer, (x) value.getDynamicOnScrollColors());
        writer.w("dynamicOnScrollFavoriteColors");
        this.nullableDynamicOnScrollColorsAdapter.mo44toJson(writer, (x) value.getDynamicOnScrollFavoriteColors());
        writer.p();
    }
}
