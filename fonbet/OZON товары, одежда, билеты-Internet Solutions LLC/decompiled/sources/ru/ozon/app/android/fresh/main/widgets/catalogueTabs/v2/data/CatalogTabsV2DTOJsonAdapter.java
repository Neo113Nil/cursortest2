package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data.CatalogTabsV2DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$Tab;", "listOfTabAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "nullableTagButtonDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;", "nullableTabPaddingsAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;", "nullableStickyRoundedCornersAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2DTOJsonAdapter extends JsonAdapter<CatalogTabsV2DTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CatalogTabsV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<CatalogTabsV2DTO.Tab>> listOfTabAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CatalogTabsV2DTO.StickyRoundedCorners> nullableStickyRoundedCornersAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<CatalogTabsV2DTO.TabPaddings> nullableTabPaddingsAdapter;

    @NotNull
    private final JsonAdapter<TagButtonDTO> nullableTagButtonDTOAdapter;

    @NotNull
    private final n.a options;

    public CatalogTabsV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(DynamicElementDTO.TABS, "isSticky", "moreTab", "backgroundColor", "badgeCornerRadius", "paddings", "maxRows", "stickyRoundedCorners", "trackingInfo");
        b e11 = D.e(List.class, CatalogTabsV2DTO.Tab.class);
        M m11 = M.f71699a;
        this.listOfTabAdapter = moshi.f(e11, m11, DynamicElementDTO.TABS);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSticky");
        this.nullableTagButtonDTOAdapter = moshi.f(TagButtonDTO.class, m11, "moreTab");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "badgeCornerRadius");
        this.nullableTabPaddingsAdapter = moshi.f(CatalogTabsV2DTO.TabPaddings.class, m11, "paddings");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxRows");
        this.nullableStickyRoundedCornersAdapter = moshi.f(CatalogTabsV2DTO.StickyRoundedCorners.class, m11, "stickyRoundedCorners");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(CatalogTabsV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CatalogTabsV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        List<CatalogTabsV2DTO.Tab> list = null;
        TagButtonDTO tagButtonDTO = null;
        String str = null;
        CornerRadius cornerRadius = null;
        CatalogTabsV2DTO.TabPaddings tabPaddings = null;
        Integer num = null;
        CatalogTabsV2DTO.StickyRoundedCorners stickyRoundedCorners = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfTabAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
                    }
                    break;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSticky", "isSticky", reader);
                    }
                    i11 = -3;
                    break;
                case 2:
                    tagButtonDTO = this.nullableTagButtonDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 5:
                    tabPaddings = this.nullableTabPaddingsAdapter.fromJson(reader);
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 7:
                    stickyRoundedCorners = this.nullableStickyRoundedCornersAdapter.fromJson(reader);
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            CatalogTabsV2DTO.TabPaddings tabPaddings2 = tabPaddings;
            TagButtonDTO tagButtonDTO2 = tagButtonDTO;
            if (list == null) {
                throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
            }
            return new CatalogTabsV2DTO(list, bool2.booleanValue(), tagButtonDTO2, str, cornerRadius, tabPaddings2, num, stickyRoundedCorners, map);
        }
        CornerRadius cornerRadius2 = cornerRadius;
        CatalogTabsV2DTO.TabPaddings tabPaddings3 = tabPaddings;
        TagButtonDTO tagButtonDTO3 = tagButtonDTO;
        Constructor<CatalogTabsV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CatalogTabsV2DTO.class.getDeclaredConstructor(List.class, Boolean.TYPE, TagButtonDTO.class, String.class, CornerRadius.class, CatalogTabsV2DTO.TabPaddings.class, Integer.class, CatalogTabsV2DTO.StickyRoundedCorners.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
        }
        CatalogTabsV2DTO newInstance = constructor.newInstance(list, bool2, tagButtonDTO3, str, cornerRadius2, tabPaddings3, num, stickyRoundedCorners, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CatalogTabsV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TABS);
        this.listOfTabAdapter.mo44toJson(writer, (x) value.getTabs());
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSticky()));
        writer.w("moreTab");
        this.nullableTagButtonDTOAdapter.mo44toJson(writer, (x) value.getMoreTab());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("badgeCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getBadgeCornerRadius());
        writer.w("paddings");
        this.nullableTabPaddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("maxRows");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxRows());
        writer.w("stickyRoundedCorners");
        this.nullableStickyRoundedCornersAdapter.mo44toJson(writer, (x) value.getStickyRoundedCorners());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
