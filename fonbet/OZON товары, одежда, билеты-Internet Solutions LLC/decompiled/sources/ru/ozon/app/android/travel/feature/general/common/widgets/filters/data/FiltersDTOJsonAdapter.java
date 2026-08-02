package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$HeaderDTO;", "headerDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO;", "listOfSectionDTOAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$FooterDTO;", "footerDTOAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "nullableAsyncActionDTOAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "nullableEmptyStateV2WidgetDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersDTOJsonAdapter extends JsonAdapter<FiltersDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FiltersDTO> constructorRef;

    @NotNull
    private final JsonAdapter<FiltersDTO.FooterDTO> footerDTOAdapter;

    @NotNull
    private final JsonAdapter<FiltersDTO.HeaderDTO> headerDTOAdapter;

    @NotNull
    private final JsonAdapter<List<FiltersDTO.SectionDTO>> listOfSectionDTOAdapter;

    @NotNull
    private final JsonAdapter<AsyncActionDTO> nullableAsyncActionDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateV2WidgetDTO> nullableEmptyStateV2WidgetDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public FiltersDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "sections", CommentV3DTO.FOOTER_FIELD_NAME, "isFirstSectionSeparated", "trackingInfo", "asyncBehavior", "asyncServerErrorMessage", "asyncErrorMessage");
        M m11 = M.f71699a;
        this.headerDTOAdapter = moshi.f(FiltersDTO.HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfSectionDTOAdapter = moshi.f(D.e(List.class, FiltersDTO.SectionDTO.class), m11, "sections");
        this.footerDTOAdapter = moshi.f(FiltersDTO.FooterDTO.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFirstSectionSeparated");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableAsyncActionDTOAdapter = moshi.f(AsyncActionDTO.class, m11, "asyncBehavior");
        this.nullableEmptyStateV2WidgetDTOAdapter = moshi.f(EmptyStateV2WidgetDTO.class, m11, "asyncServerErrorMessage");
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(FiltersDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FiltersDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        FiltersDTO.HeaderDTO headerDTO = null;
        List<FiltersDTO.SectionDTO> list = null;
        FiltersDTO.FooterDTO footerDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        AsyncActionDTO asyncActionDTO = null;
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO = null;
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    headerDTO = this.headerDTOAdapter.fromJson(reader);
                    if (headerDTO == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    list = this.listOfSectionDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("sections", "sections", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    footerDTO = this.footerDTOAdapter.fromJson(reader);
                    if (footerDTO == null) {
                        throw c.q(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isFirstSectionSeparated", "isFirstSectionSeparated", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    asyncActionDTO = this.nullableAsyncActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    emptyStateV2WidgetDTO = this.nullableEmptyStateV2WidgetDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    emptyStateV2WidgetDTO2 = this.nullableEmptyStateV2WidgetDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -11) {
            if (headerDTO == null) {
                throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO.SectionDTO>");
            if (footerDTO == null) {
                throw c.j(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
            }
            return new FiltersDTO(headerDTO, list, footerDTO, bool2.booleanValue(), map, asyncActionDTO, emptyStateV2WidgetDTO, emptyStateV2WidgetDTO2);
        }
        Constructor<FiltersDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FiltersDTO.class.getDeclaredConstructor(FiltersDTO.HeaderDTO.class, List.class, FiltersDTO.FooterDTO.class, Boolean.TYPE, Map.class, AsyncActionDTO.class, EmptyStateV2WidgetDTO.class, EmptyStateV2WidgetDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (headerDTO == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (footerDTO == null) {
            throw c.j(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
        }
        FiltersDTO newInstance = constructor.newInstance(headerDTO, list, footerDTO, bool2, map, asyncActionDTO, emptyStateV2WidgetDTO, emptyStateV2WidgetDTO2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FiltersDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("sections");
        this.listOfSectionDTOAdapter.mo44toJson(writer, (x) value.getSections());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.footerDTOAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("isFirstSectionSeparated");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFirstSectionSeparated()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("asyncBehavior");
        this.nullableAsyncActionDTOAdapter.mo44toJson(writer, (x) value.getAsyncBehavior());
        writer.w("asyncServerErrorMessage");
        this.nullableEmptyStateV2WidgetDTOAdapter.mo44toJson(writer, (x) value.getAsyncServerErrorMessage());
        writer.w("asyncErrorMessage");
        this.nullableEmptyStateV2WidgetDTOAdapter.mo44toJson(writer, (x) value.getAsyncErrorMessage());
        writer.p();
    }
}
