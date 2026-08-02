package ru.ozon.app.android.favorites.data.shoppinglists.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesWishlistRemoveRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesWishlistRemoveRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesWishlistRemoveRequest;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesWishlistRemoveRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableLongAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesWishlistRemoveRequestJsonAdapter extends JsonAdapter<FavoritesWishlistRemoveRequest> {
    private volatile Constructor<FavoritesWishlistRemoveRequest> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FavoritesWishlistRemoveRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "sku", "from", "giftId", "uniqId");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "favoritesListId");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "productId");
        this.nullableStringAdapter = moshi.f(String.class, m11, "from");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(FavoritesWishlistRemoveRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FavoritesWishlistRemoveRequest fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Long l12 = null;
        String str = null;
        Long l13 = null;
        String str2 = null;
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
                l12 = this.nullableLongAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                l13 = this.nullableLongAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -29) {
            String str3 = str2;
            Long l14 = l12;
            if (l11 == null) {
                throw c.j("favoritesListId", "id", reader);
            }
            return new FavoritesWishlistRemoveRequest(l11.longValue(), l14, str, l13, str3);
        }
        String str4 = str;
        Long l15 = l13;
        String str5 = str2;
        Long l16 = l12;
        Constructor<FavoritesWishlistRemoveRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FavoritesWishlistRemoveRequest.class.getDeclaredConstructor(Long.TYPE, Long.class, String.class, Long.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<FavoritesWishlistRemoveRequest> constructor2 = constructor;
        if (l11 == null) {
            throw c.j("favoritesListId", "id", reader);
        }
        FavoritesWishlistRemoveRequest newInstance = constructor2.newInstance(l11, l16, str4, l15, str5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FavoritesWishlistRemoveRequest value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getFavoritesListId()));
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getProductId());
        writer.w("from");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getFrom());
        writer.w("giftId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getGiftId());
        writer.w("uniqId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getUniqId());
        writer.p();
    }
}
