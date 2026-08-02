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
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.CatalogTileDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO_FavoriteBadgeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "gradientAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/af/AtomAction;", "nullableAtomActionAdapter", "LWZ/t;", "nullableTokenizedEventAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileVO_FavoriteBadgeJsonAdapter extends JsonAdapter<CatalogTileVO.FavoriteBadge> {

    @NotNull
    private final JsonAdapter<CatalogTileDTO.Gradient> gradientAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomAction> nullableAtomActionAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<t> nullableTokenizedEventAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CatalogTileVO_FavoriteBadgeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", "text", "gradient", "borderColor", "action", "tokenizedEvent");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "text");
        this.gradientAdapter = moshi.f(CatalogTileDTO.Gradient.class, m11, "gradient");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableAtomActionAdapter = moshi.f(AtomAction.class, m11, "action");
        this.nullableTokenizedEventAdapter = moshi.f(t.class, m11, "tokenizedEvent");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(CatalogTileVO.FavoriteBadge)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CatalogTileVO.FavoriteBadge fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        TextDTO textDTO = null;
        CatalogTileDTO.Gradient gradient = null;
        String str = null;
        AtomAction atomAction = null;
        t tVar = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 2:
                    gradient = this.gradientAdapter.fromJson(reader);
                    if (gradient == null) {
                        throw c.q("gradient", "gradient", reader);
                    }
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    atomAction = this.nullableAtomActionAdapter.fromJson(reader);
                    break;
                case 5:
                    tVar = this.nullableTokenizedEventAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (iconDTO == null) {
            throw c.j("icon", "icon", reader);
        }
        if (textDTO == null) {
            throw c.j("text", "text", reader);
        }
        if (gradient != null) {
            return new CatalogTileVO.FavoriteBadge(iconDTO, textDTO, gradient, str, atomAction, tVar);
        }
        throw c.j("gradient", "gradient", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CatalogTileVO.FavoriteBadge value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("text");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("gradient");
        this.gradientAdapter.mo44toJson(writer, (x) value.getGradient());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("action");
        this.nullableAtomActionAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("tokenizedEvent");
        this.nullableTokenizedEventAdapter.mo44toJson(writer, (x) value.getTokenizedEvent());
        writer.p();
    }
}
