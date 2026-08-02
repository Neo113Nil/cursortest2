package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$QuantityCellDTO;", "listOfQuantityCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO;", "listOfAlertDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "listOfStringAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AgeSelectorDTO;", "listOfAgeSelectorDTOAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "disclaimerAtomAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorDTOJsonAdapter extends JsonAdapter<TouristCountSelectorDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TouristCountSelectorDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> disclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<TouristCountSelectorDTO.AgeSelectorDTO>> listOfAgeSelectorDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TouristCountSelectorDTO.AlertDTO>> listOfAlertDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TouristCountSelectorDTO.QuantityCellDTO>> listOfQuantityCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TouristCountSelectorDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cells", "maxSumValue", "alerts", "applyButton", "ageCategories", "ageSelectors", "childrenAgeAnnotation", "ageSelectorPlaceholder");
        b e11 = D.e(List.class, TouristCountSelectorDTO.QuantityCellDTO.class);
        M m11 = M.f71699a;
        this.listOfQuantityCellDTOAdapter = moshi.f(e11, m11, "cells");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxSumValue");
        this.listOfAlertDTOAdapter = moshi.f(D.e(List.class, TouristCountSelectorDTO.AlertDTO.class), m11, "alerts");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "applyButton");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "ageCategories");
        this.listOfAgeSelectorDTOAdapter = moshi.f(D.e(List.class, TouristCountSelectorDTO.AgeSelectorDTO.class), m11, "ageSelectors");
        this.disclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "childrenAgeAnnotation");
        this.stringAdapter = moshi.f(String.class, m11, "ageSelectorPlaceholder");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(45, "GeneratedJsonAdapter(TouristCountSelectorDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TouristCountSelectorDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        List<TouristCountSelectorDTO.QuantityCellDTO> list = null;
        Integer num = null;
        List<TouristCountSelectorDTO.AlertDTO> list2 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        List<String> list3 = null;
        List<TouristCountSelectorDTO.AgeSelectorDTO> list4 = null;
        DisclaimerAtom disclaimerAtom = null;
        String str = null;
        while (true) {
            List<TouristCountSelectorDTO.QuantityCellDTO> list5 = list;
            Integer num2 = num;
            if (!reader.hasNext()) {
                List<TouristCountSelectorDTO.AlertDTO> list6 = list2;
                reader.endObject();
                if (i12 == -33) {
                    if (list5 == null) {
                        throw c.j("cells", "cells", reader);
                    }
                    if (num2 == null) {
                        throw c.j("maxSumValue", "maxSumValue", reader);
                    }
                    int intValue = num2.intValue();
                    if (list6 == null) {
                        throw c.j("alerts", "alerts", reader);
                    }
                    if (largeButton == null) {
                        throw c.j("applyButton", "applyButton", reader);
                    }
                    if (list3 == null) {
                        throw c.j("ageCategories", "ageCategories", reader);
                    }
                    Intrinsics.g(list4, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO.AgeSelectorDTO>");
                    if (disclaimerAtom == null) {
                        throw c.j("childrenAgeAnnotation", "childrenAgeAnnotation", reader);
                    }
                    if (str == null) {
                        throw c.j("ageSelectorPlaceholder", "ageSelectorPlaceholder", reader);
                    }
                    String str2 = str;
                    DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
                    return new TouristCountSelectorDTO(list5, intValue, list6, largeButton, list3, list4, disclaimerAtom2, str2);
                }
                Constructor<TouristCountSelectorDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i12;
                    constructor = TouristCountSelectorDTO.class.getDeclaredConstructor(List.class, cls2, List.class, ButtonV3Atom.LargeButton.class, List.class, List.class, DisclaimerAtom.class, String.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<TouristCountSelectorDTO> constructor2 = constructor;
                if (list5 == null) {
                    throw c.j("cells", "cells", reader);
                }
                if (num2 == null) {
                    throw c.j("maxSumValue", "maxSumValue", reader);
                }
                if (list6 == null) {
                    throw c.j("alerts", "alerts", reader);
                }
                if (largeButton == null) {
                    throw c.j("applyButton", "applyButton", reader);
                }
                if (list3 == null) {
                    throw c.j("ageCategories", "ageCategories", reader);
                }
                if (disclaimerAtom == null) {
                    throw c.j("childrenAgeAnnotation", "childrenAgeAnnotation", reader);
                }
                if (str == null) {
                    throw c.j("ageSelectorPlaceholder", "ageSelectorPlaceholder", reader);
                }
                TouristCountSelectorDTO newInstance = constructor2.newInstance(list5, num2, list6, largeButton, list3, list4, disclaimerAtom, str, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            List<TouristCountSelectorDTO.AlertDTO> list7 = list2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list2 = list7;
                    list = list5;
                    num = num2;
                case 0:
                    list = this.listOfQuantityCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cells", "cells", reader);
                    }
                    list2 = list7;
                    num = num2;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxSumValue", "maxSumValue", reader);
                    }
                    list2 = list7;
                    list = list5;
                case 2:
                    list2 = this.listOfAlertDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("alerts", "alerts", reader);
                    }
                    list = list5;
                    num = num2;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("applyButton", "applyButton", reader);
                    }
                    list2 = list7;
                    list = list5;
                    num = num2;
                case 4:
                    list3 = this.listOfStringAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("ageCategories", "ageCategories", reader);
                    }
                    list2 = list7;
                    list = list5;
                    num = num2;
                case 5:
                    list4 = this.listOfAgeSelectorDTOAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw c.q("ageSelectors", "ageSelectors", reader);
                    }
                    list2 = list7;
                    list = list5;
                    num = num2;
                    i12 = -33;
                case 6:
                    disclaimerAtom = this.disclaimerAtomAdapter.fromJson(reader);
                    if (disclaimerAtom == null) {
                        throw c.q("childrenAgeAnnotation", "childrenAgeAnnotation", reader);
                    }
                    list2 = list7;
                    list = list5;
                    num = num2;
                case 7:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("ageSelectorPlaceholder", "ageSelectorPlaceholder", reader);
                    }
                    list2 = list7;
                    list = list5;
                    num = num2;
                default:
                    list2 = list7;
                    list = list5;
                    num = num2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TouristCountSelectorDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cells");
        this.listOfQuantityCellDTOAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("maxSumValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxSumValue()));
        writer.w("alerts");
        this.listOfAlertDTOAdapter.mo44toJson(writer, (x) value.getAlerts());
        writer.w("applyButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getApplyButton());
        writer.w("ageCategories");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getAgeCategories());
        writer.w("ageSelectors");
        this.listOfAgeSelectorDTOAdapter.mo44toJson(writer, (x) value.getAgeSelectors());
        writer.w("childrenAgeAnnotation");
        this.disclaimerAtomAdapter.mo44toJson(writer, (x) value.getChildrenAgeAnnotation());
        writer.w("ageSelectorPlaceholder");
        this.stringAdapter.mo44toJson(writer, (x) value.getAgeSelectorPlaceholder());
        writer.p();
    }
}
