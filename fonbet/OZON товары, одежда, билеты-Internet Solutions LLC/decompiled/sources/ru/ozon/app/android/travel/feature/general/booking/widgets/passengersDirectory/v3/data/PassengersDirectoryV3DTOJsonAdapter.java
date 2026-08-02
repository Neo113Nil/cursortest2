package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3DTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$SearchInputDTO;", "nullableSearchInputDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$CategoryDTO;", "listOfCategoryDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "buttonV3DTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "nullableEmptyStateV2DTOAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3DTOJsonAdapter extends JsonAdapter<PassengersDirectoryV3DTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<PassengersDirectoryV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<PassengersDirectoryV3DTO.CategoryDTO>> listOfCategoryDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateV2DTO> nullableEmptyStateV2DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PassengersDirectoryV3DTO.SearchInputDTO> nullableSearchInputDTOAdapter;

    @NotNull
    private final n.a options;

    public PassengersDirectoryV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("searchInput", "categories", "selectButton", "addDocumentButton", "emptyState", "isSelectedPassengerUnsuitable", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableSearchInputDTOAdapter = moshi.f(PassengersDirectoryV3DTO.SearchInputDTO.class, m11, "searchInput");
        this.listOfCategoryDTOAdapter = moshi.f(D.e(List.class, PassengersDirectoryV3DTO.CategoryDTO.class), m11, "categories");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "selectButton");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "addDocumentButton");
        this.nullableEmptyStateV2DTOAdapter = moshi.f(EmptyStateV2DTO.class, m11, "emptyState");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelectedPassengerUnsuitable");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(PassengersDirectoryV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PassengersDirectoryV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        List<PassengersDirectoryV3DTO.CategoryDTO> list = null;
        Boolean bool2 = bool;
        PassengersDirectoryV3DTO.SearchInputDTO searchInputDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        EmptyStateV2DTO emptyStateV2DTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        ButtonV3DTO buttonV3DTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    searchInputDTO = this.nullableSearchInputDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.listOfCategoryDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("categories", "categories", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    buttonV3DTO2 = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 3:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("addDocumentButton", "addDocumentButton", reader);
                    }
                    break;
                case 4:
                    emptyStateV2DTO = this.nullableEmptyStateV2DTOAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSelectedPassengerUnsuitable", "isSelectedPassengerUnsuitable", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -35) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3DTO.CategoryDTO>");
            if (buttonV3DTO != null) {
                return new PassengersDirectoryV3DTO(searchInputDTO, list, buttonV3DTO2, buttonV3DTO, emptyStateV2DTO, bool2.booleanValue(), map);
            }
            throw c.j("addDocumentButton", "addDocumentButton", reader);
        }
        Constructor<PassengersDirectoryV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PassengersDirectoryV3DTO.class.getDeclaredConstructor(PassengersDirectoryV3DTO.SearchInputDTO.class, List.class, ButtonV3DTO.class, ButtonV3DTO.class, EmptyStateV2DTO.class, Boolean.TYPE, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (buttonV3DTO == null) {
            throw c.j("addDocumentButton", "addDocumentButton", reader);
        }
        EmptyStateV2DTO emptyStateV2DTO2 = emptyStateV2DTO;
        Map<String, TokenizedTrackingInfo> map2 = map;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        PassengersDirectoryV3DTO.SearchInputDTO searchInputDTO2 = searchInputDTO;
        PassengersDirectoryV3DTO newInstance = constructor.newInstance(searchInputDTO2, list, buttonV3DTO2, buttonV3DTO3, emptyStateV2DTO2, bool2, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PassengersDirectoryV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("searchInput");
        this.nullableSearchInputDTOAdapter.mo44toJson(writer, (x) value.getSearchInput());
        writer.w("categories");
        this.listOfCategoryDTOAdapter.mo44toJson(writer, (x) value.getCategories());
        writer.w("selectButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getSelectButton());
        writer.w("addDocumentButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getAddDocumentButton());
        writer.w("emptyState");
        this.nullableEmptyStateV2DTOAdapter.mo44toJson(writer, (x) value.getEmptyState());
        writer.w("isSelectedPassengerUnsuitable");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelectedPassengerUnsuitable()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
