package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation;

import Ak.b;
import WZ.t;
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
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO_TileVOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/af/AtomAction;", "nullableAtomActionAdapter", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "nullableFavoriteBadgeAdapter", "nullableStringAdapter", "LWZ/t;", "nullableTokenizedEventAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileVO_TileVOJsonAdapter extends JsonAdapter<CatalogTileVO.TileVO> {

    @NotNull
    private final JsonAdapter<AtomAction> nullableAtomActionAdapter;

    @NotNull
    private final JsonAdapter<CatalogTileVO.FavoriteBadge> nullableFavoriteBadgeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<t> nullableTokenizedEventAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CatalogTileVO_TileVOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "badge", "backgroundColor", "tokenizedEvent");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableAtomActionAdapter = moshi.f(AtomAction.class, m11, "action");
        this.nullableFavoriteBadgeAdapter = moshi.f(CatalogTileVO.FavoriteBadge.class, m11, "badge");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableTokenizedEventAdapter = moshi.f(t.class, m11, "tokenizedEvent");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(CatalogTileVO.TileVO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CatalogTileVO.TileVO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TextDTO textDTO = null;
        AtomAction atomAction = null;
        CatalogTileVO.FavoriteBadge favoriteBadge = null;
        String str2 = null;
        t tVar = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    atomAction = this.nullableAtomActionAdapter.fromJson(reader);
                    break;
                case 3:
                    favoriteBadge = this.nullableFavoriteBadgeAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    tVar = this.nullableTokenizedEventAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str != null) {
            return new CatalogTileVO.TileVO(str, textDTO, atomAction, favoriteBadge, str2, tVar);
        }
        throw c.j("image", "image", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CatalogTileVO.TileVO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("action");
        this.nullableAtomActionAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("badge");
        this.nullableFavoriteBadgeAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("tokenizedEvent");
        this.nullableTokenizedEventAdapter.mo44toJson(writer, (x) value.getTokenizedEvent());
        writer.p();
    }
}
