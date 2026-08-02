package ru.ozon.app.android.orderdetails.orderTotal.data;

import Y9.b;
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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/orderdetails/orderTotal/data/LineDTO;", "listOfLineDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "stringAdapter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderDTOJsonAdapter extends JsonAdapter<HeaderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<LineDTO>> listOfLineDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public HeaderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("titleLines", "atomSubtitle", "button", "icon");
        b e11 = D.e(List.class, LineDTO.class);
        M m11 = M.f71699a;
        this.listOfLineDTOAdapter = moshi.f(e11, m11, "titleLines");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "atomSubtitle");
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "button");
        this.stringAdapter = moshi.f(String.class, m11, "icon");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(31, "GeneratedJsonAdapter(HeaderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HeaderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<LineDTO> list = null;
        TextAtom textAtom = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfLineDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("titleLines", "titleLines", reader);
                }
            } else if (v11 == 1) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q("atomSubtitle", "atomSubtitle", reader);
                }
            } else if (v11 == 2) {
                largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
            } else if (v11 == 3 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("icon", "icon", reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("titleLines", "titleLines", reader);
        }
        if (textAtom == null) {
            throw c.j("atomSubtitle", "atomSubtitle", reader);
        }
        if (str != null) {
            return new HeaderDTO(list, textAtom, largeBorderlessButton, str);
        }
        throw c.j("icon", "icon", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HeaderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("titleLines");
        this.listOfLineDTOAdapter.mo44toJson(writer, (x) value.getTitleLines());
        writer.w("atomSubtitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getAtomSubtitle());
        writer.w("button");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.p();
    }
}
