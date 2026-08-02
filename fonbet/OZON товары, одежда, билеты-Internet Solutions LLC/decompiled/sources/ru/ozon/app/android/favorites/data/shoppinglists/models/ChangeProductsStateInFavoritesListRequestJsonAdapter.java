package ru.ozon.app.android.favorites.data.shoppinglists.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeProductsStateInFavoritesListRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeProductsStateInFavoritesListRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeProductsStateInFavoritesListRequest;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeProductsStateInFavoritesListRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfLongAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeProductsStateInFavoritesListRequestJsonAdapter extends JsonAdapter<ChangeProductsStateInFavoritesListRequest> {
    private volatile Constructor<ChangeProductsStateInFavoritesListRequest> constructorRef;

    @NotNull
    private final JsonAdapter<List<Long>> listOfLongAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ChangeProductsStateInFavoritesListRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "skus", "from");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "favoritesListId");
        this.listOfLongAdapter = moshi.f(D.e(List.class, Long.class), m11, "productIds");
        this.nullableStringAdapter = moshi.f(String.class, m11, "from");
    }

    @NotNull
    public String toString() {
        return b.c(63, "GeneratedJsonAdapter(ChangeProductsStateInFavoritesListRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChangeProductsStateInFavoritesListRequest fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        List<Long> list = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("favoritesListId", "id", reader);
                }
            } else if (v11 == 1) {
                list = this.listOfLongAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("productIds", "skus", reader);
                }
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 = -5;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (l11 == null) {
                throw c.j("favoritesListId", "id", reader);
            }
            long longValue = l11.longValue();
            if (list != null) {
                return new ChangeProductsStateInFavoritesListRequest(longValue, list, str);
            }
            throw c.j("productIds", "skus", reader);
        }
        Constructor<ChangeProductsStateInFavoritesListRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ChangeProductsStateInFavoritesListRequest.class.getDeclaredConstructor(Long.TYPE, List.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (l11 == null) {
            throw c.j("favoritesListId", "id", reader);
        }
        if (list == null) {
            throw c.j("productIds", "skus", reader);
        }
        ChangeProductsStateInFavoritesListRequest newInstance = constructor.newInstance(l11, list, str, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChangeProductsStateInFavoritesListRequest value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getFavoritesListId()));
        writer.w("skus");
        this.listOfLongAdapter.mo44toJson(writer, (x) value.getProductIds());
        writer.w("from");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getFrom());
        writer.p();
    }
}
