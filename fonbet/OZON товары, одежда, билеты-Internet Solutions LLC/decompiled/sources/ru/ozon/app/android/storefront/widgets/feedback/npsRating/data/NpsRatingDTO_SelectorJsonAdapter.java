package ru.ozon.app.android.storefront.widgets.feedback.npsRating.data;

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
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.data.NpsRatingDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO_SelectorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "listOfStringAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NpsRatingDTO_SelectorJsonAdapter extends JsonAdapter<NpsRatingDTO.Selector> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public NpsRatingDTO_SelectorJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftDescription", "rightDescription", "selectionColor", "defaultIconUrl", "imagesUrl");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "leftDescription");
        this.stringAdapter = moshi.f(String.class, m11, "selectionColor");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "imagesUrl");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(NpsRatingDTO.Selector)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NpsRatingDTO.Selector fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        String str = null;
        String str2 = null;
        List<String> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q("leftDescription", "leftDescription", reader);
                }
            } else if (v11 == 1) {
                textAtom2 = this.textAtomAdapter.fromJson(reader);
                if (textAtom2 == null) {
                    throw c.q("rightDescription", "rightDescription", reader);
                }
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("selectionColor", "selectionColor", reader);
                }
            } else if (v11 == 3) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("defaultIconUrl", "defaultIconUrl", reader);
                }
            } else if (v11 == 4 && (list = this.listOfStringAdapter.fromJson(reader)) == null) {
                throw c.q("imagesUrl", "imagesUrl", reader);
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j("leftDescription", "leftDescription", reader);
        }
        if (textAtom2 == null) {
            throw c.j("rightDescription", "rightDescription", reader);
        }
        if (str == null) {
            throw c.j("selectionColor", "selectionColor", reader);
        }
        if (str2 == null) {
            throw c.j("defaultIconUrl", "defaultIconUrl", reader);
        }
        if (list != null) {
            return new NpsRatingDTO.Selector(textAtom, textAtom2, str, str2, list);
        }
        throw c.j("imagesUrl", "imagesUrl", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NpsRatingDTO.Selector value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftDescription");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getLeftDescription());
        writer.w("rightDescription");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getRightDescription());
        writer.w("selectionColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getSelectionColor());
        writer.w("defaultIconUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getDefaultIconUrl());
        writer.w("imagesUrl");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getImagesUrl());
        writer.p();
    }
}
