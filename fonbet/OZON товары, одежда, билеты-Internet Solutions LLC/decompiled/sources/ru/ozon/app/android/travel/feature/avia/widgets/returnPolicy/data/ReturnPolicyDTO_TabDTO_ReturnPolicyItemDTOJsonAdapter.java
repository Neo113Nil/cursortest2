package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.data.ReturnPolicyDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO_TabDTO_ReturnPolicyItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableListOfTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "nullableTextAtomAdapter", "listOfTextAtomAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReturnPolicyDTO_TabDTO_ReturnPolicyItemDTOJsonAdapter extends JsonAdapter<ReturnPolicyDTO.TabDTO.ReturnPolicyItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<TextAtom>> listOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public ReturnPolicyDTO_TabDTO_ReturnPolicyItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("accentPlaq", "icon", "route", "policyText");
        b e11 = D.e(List.class, TextAtom.class);
        M m11 = M.f71699a;
        this.nullableListOfTextAtomAdapter = moshi.f(e11, m11, "accentPlaq");
        this.nullableStringAdapter = moshi.f(String.class, m11, "icon");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "route");
        this.listOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "policyText");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(64, "GeneratedJsonAdapter(ReturnPolicyDTO.TabDTO.ReturnPolicyItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnPolicyDTO.TabDTO.ReturnPolicyItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<TextAtom> list = null;
        String str = null;
        TextAtom textAtom = null;
        List<TextAtom> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfTextAtomAdapter.fromJson(reader);
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                textAtom = this.nullableTextAtomAdapter.fromJson(reader);
            } else if (v11 == 3 && (list2 = this.listOfTextAtomAdapter.fromJson(reader)) == null) {
                throw c.q("policyText", "policyText", reader);
            }
        }
        reader.endObject();
        if (list2 != null) {
            return new ReturnPolicyDTO.TabDTO.ReturnPolicyItemDTO(list, str, textAtom, list2);
        }
        throw c.j("policyText", "policyText", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnPolicyDTO.TabDTO.ReturnPolicyItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("accentPlaq");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getAccentPlaq());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("route");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getRoute());
        writer.w("policyText");
        this.listOfTextAtomAdapter.mo44toJson(writer, (x) value.getPolicyText());
        writer.p();
    }
}
