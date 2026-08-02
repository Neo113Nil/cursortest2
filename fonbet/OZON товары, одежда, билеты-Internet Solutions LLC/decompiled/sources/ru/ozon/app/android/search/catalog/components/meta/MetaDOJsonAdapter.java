package ru.ozon.app.android.search.catalog.components.meta;

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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaDOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/catalog/components/meta/MetaDO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/catalog/components/meta/MetaDO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/catalog/components/meta/MetaDO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "nullableFavoriteEntityAdapter", "Lru/ozon/app/android/search/catalog/components/meta/ShareData;", "nullableShareDataAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MetaDOJsonAdapter extends JsonAdapter<MetaDO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<FavoriteEntity> nullableFavoriteEntityAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<ShareData> nullableShareDataAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MetaDOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", AppMeasurementSdk.ConditionalUserProperty.NAME, "image", "description", "type", "designType", "favoriteEntityButton", "shareData");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "id");
        this.stringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "image");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "description");
        this.nullableFavoriteEntityAdapter = moshi.f(FavoriteEntity.class, m11, "favoriteEntityButton");
        this.nullableShareDataAdapter = moshi.f(ShareData.class, m11, "shareData");
    }

    @NotNull
    public String toString() {
        return b.c(28, "GeneratedJsonAdapter(MetaDO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MetaDO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        String str2 = null;
        OzonSpannableString ozonSpannableString = null;
        String str3 = null;
        String str4 = null;
        FavoriteEntity favoriteEntity = null;
        ShareData shareData = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 5:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("designType", "designType", reader);
                    }
                    break;
                case 6:
                    favoriteEntity = this.nullableFavoriteEntityAdapter.fromJson(reader);
                    break;
                case 7:
                    shareData = this.nullableShareDataAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (l11 == null) {
            throw c.j("id", "id", reader);
        }
        long longValue = l11.longValue();
        if (str == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (str3 == null) {
            throw c.j("type", "type", reader);
        }
        if (str4 != null) {
            return new MetaDO(longValue, str, str2, ozonSpannableString, str3, str4, favoriteEntity, shareData);
        }
        throw c.j("designType", "designType", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MetaDO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getId()));
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("description");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("designType");
        this.stringAdapter.mo44toJson(writer, (x) value.getDesignType());
        writer.w("favoriteEntityButton");
        this.nullableFavoriteEntityAdapter.mo44toJson(writer, (x) value.getFavoriteEntityButton());
        writer.w("shareData");
        this.nullableShareDataAdapter.mo44toJson(writer, (x) value.getShareData());
        writer.p();
    }
}
