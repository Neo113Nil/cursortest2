package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite;

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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse$RestrictionType;", "restrictionTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stringAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse$RestrictionLifeTime;", "nullableRestrictionLifeTimeAdapter", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateFavoriteResponseJsonAdapter extends JsonAdapter<UpdateFavoriteResponse> {

    @NotNull
    private final JsonAdapter<UpdateFavoriteResponse.RestrictionLifeTime> nullableRestrictionLifeTimeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<UpdateFavoriteResponse.RestrictionType> restrictionTypeAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UpdateFavoriteResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "image", "imageTintColor", "lifetime");
        M m11 = M.f71699a;
        this.restrictionTypeAdapter = moshi.f(UpdateFavoriteResponse.RestrictionType.class, m11, "type");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "message");
        this.nullableRestrictionLifeTimeAdapter = moshi.f(UpdateFavoriteResponse.RestrictionLifeTime.class, m11, "lifetime");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(UpdateFavoriteResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UpdateFavoriteResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        UpdateFavoriteResponse.RestrictionType restrictionType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        UpdateFavoriteResponse.RestrictionLifeTime restrictionLifeTime = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    restrictionType = this.restrictionTypeAdapter.fromJson(reader);
                    if (restrictionType == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("message", "message", reader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    restrictionLifeTime = this.nullableRestrictionLifeTimeAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (restrictionType == null) {
            throw c.j("type", "type", reader);
        }
        if (str2 != null) {
            return new UpdateFavoriteResponse(restrictionType, str, str2, str3, str4, restrictionLifeTime);
        }
        throw c.j("message", "message", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UpdateFavoriteResponse value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.restrictionTypeAdapter.mo44toJson(writer, (x) value.getType());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("message");
        this.stringAdapter.mo44toJson(writer, (x) value.getMessage());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("imageTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImageTintColor());
        writer.w("lifetime");
        this.nullableRestrictionLifeTimeAdapter.mo44toJson(writer, (x) value.getLifetime());
        writer.p();
    }
}
