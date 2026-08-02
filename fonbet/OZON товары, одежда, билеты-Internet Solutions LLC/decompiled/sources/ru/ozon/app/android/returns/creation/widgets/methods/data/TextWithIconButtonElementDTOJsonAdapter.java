package ru.ozon.app.android.returns.creation.widgets.methods.data;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonElementDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonElementDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonElementDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonElementDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "paddingsDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonDTO;", "textWithIconButtonDTOAdapter", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextWithIconButtonElementDTOJsonAdapter extends JsonAdapter<TextWithIconButtonElementDTO> {
    public static final int $stable = 8;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PaddingsDTO> paddingsDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextWithIconButtonDTO> textWithIconButtonDTOAdapter;

    public TextWithIconButtonElementDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("paddings", "backgroundColor", "textWithIconButton");
        M m11 = M.f71699a;
        this.paddingsDTOAdapter = moshi.f(PaddingsDTO.class, m11, "paddings");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.textWithIconButtonDTOAdapter = moshi.f(TextWithIconButtonDTO.class, m11, "textWithIconButton");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(TextWithIconButtonElementDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TextWithIconButtonElementDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PaddingsDTO paddingsDTO = null;
        String str = null;
        TextWithIconButtonDTO textWithIconButtonDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                paddingsDTO = this.paddingsDTOAdapter.fromJson(reader);
                if (paddingsDTO == null) {
                    throw c.q("paddings", "paddings", reader);
                }
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
            } else if (v11 == 2 && (textWithIconButtonDTO = this.textWithIconButtonDTOAdapter.fromJson(reader)) == null) {
                throw c.q("textWithIconButton", "textWithIconButton", reader);
            }
        }
        reader.endObject();
        if (paddingsDTO == null) {
            throw c.j("paddings", "paddings", reader);
        }
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (textWithIconButtonDTO != null) {
            return new TextWithIconButtonElementDTO(paddingsDTO, str, textWithIconButtonDTO);
        }
        throw c.j("textWithIconButton", "textWithIconButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TextWithIconButtonElementDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("paddings");
        this.paddingsDTOAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("textWithIconButton");
        this.textWithIconButtonDTOAdapter.mo44toJson(writer, (x) value.getTextWithIconButton());
        writer.p();
    }
}
