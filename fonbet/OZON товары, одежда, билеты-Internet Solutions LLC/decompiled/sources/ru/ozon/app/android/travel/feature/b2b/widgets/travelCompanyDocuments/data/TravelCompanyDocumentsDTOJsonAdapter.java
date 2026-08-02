package ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data;

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
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data.TravelCompanyDocumentsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;", "nullableCompanyDocumentDTOAdapter", "", "listOfCompanyDocumentDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelCompanyDocumentsDTOJsonAdapter extends JsonAdapter<TravelCompanyDocumentsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelCompanyDocumentsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TravelCompanyDocumentsDTO.CompanyDocumentDTO>> listOfCompanyDocumentDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelCompanyDocumentsDTO.CompanyDocumentDTO> nullableCompanyDocumentDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final n.a options;

    public TravelCompanyDocumentsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "allDocumentsLink", "documents");
        M m11 = M.f71699a;
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableCompanyDocumentDTOAdapter = moshi.f(TravelCompanyDocumentsDTO.CompanyDocumentDTO.class, m11, "allDocumentsLink");
        this.listOfCompanyDocumentDTOAdapter = moshi.f(D.e(List.class, TravelCompanyDocumentsDTO.CompanyDocumentDTO.class), m11, "documents");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(TravelCompanyDocumentsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelCompanyDocumentsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DisclaimerAtom disclaimerAtom = null;
        TravelCompanyDocumentsDTO.CompanyDocumentDTO companyDocumentDTO = null;
        List<TravelCompanyDocumentsDTO.CompanyDocumentDTO> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
            } else if (v11 == 1) {
                companyDocumentDTO = this.nullableCompanyDocumentDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.listOfCompanyDocumentDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("documents", "documents", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data.TravelCompanyDocumentsDTO.CompanyDocumentDTO>");
            return new TravelCompanyDocumentsDTO(disclaimerAtom, companyDocumentDTO, list);
        }
        Constructor<TravelCompanyDocumentsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelCompanyDocumentsDTO.class.getDeclaredConstructor(DisclaimerAtom.class, TravelCompanyDocumentsDTO.CompanyDocumentDTO.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TravelCompanyDocumentsDTO newInstance = constructor.newInstance(disclaimerAtom, companyDocumentDTO, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelCompanyDocumentsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.w("allDocumentsLink");
        this.nullableCompanyDocumentDTOAdapter.mo44toJson(writer, (x) value.getAllDocumentsLink());
        writer.w("documents");
        this.listOfCompanyDocumentDTOAdapter.mo44toJson(writer, (x) value.getDocuments());
        writer.p();
    }
}
