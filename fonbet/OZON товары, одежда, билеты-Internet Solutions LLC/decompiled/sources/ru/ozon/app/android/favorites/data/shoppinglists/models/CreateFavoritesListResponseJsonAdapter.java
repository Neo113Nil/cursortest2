package ru.ozon.app.android.favorites.data.shoppinglists.models;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateFavoritesListResponseJsonAdapter extends JsonAdapter<CreateFavoritesListResponse> {

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CreateFavoritesListResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "deeplink", "link", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "errorForUser");
        M m11 = M.f71699a;
        this.nullableLongAdapter = moshi.f(Long.class, m11, "id");
        this.nullableStringAdapter = moshi.f(String.class, m11, "deeplink");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(CreateFavoritesListResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CreateFavoritesListResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new CreateFavoritesListResponse(l11, str, str2, str3, str4, str5);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CreateFavoritesListResponse value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("deeplink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("link");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("description");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("errorForUser");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getErrorForUser());
        writer.p();
    }
}
