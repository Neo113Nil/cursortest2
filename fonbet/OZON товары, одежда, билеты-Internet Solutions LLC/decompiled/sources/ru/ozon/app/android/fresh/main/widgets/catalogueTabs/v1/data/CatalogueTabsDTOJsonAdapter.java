package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data;

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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "catalogueTabsPaddingsAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingAdapter", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsSingleTab;", "listOfCatalogueTabsSingleTabAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsDTOJsonAdapter extends JsonAdapter<CatalogueTabsDTO> {

    @NotNull
    private final JsonAdapter<CatalogueTabsDTO.CatalogueTabsPaddings> catalogueTabsPaddingsAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> layoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<List<CatalogueTabsDTO.CatalogueTabsSingleTab>> listOfCatalogueTabsSingleTabAdapter;

    @NotNull
    private final n.a options;

    public CatalogueTabsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("radius", "scrollableStatePaddings", "tabsGapPadding", DynamicElementDTO.TABS);
        M m11 = M.f71699a;
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "radius");
        this.catalogueTabsPaddingsAdapter = moshi.f(CatalogueTabsDTO.CatalogueTabsPaddings.class, m11, "scrollableStatePaddings");
        this.layoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "tabsGapPadding");
        this.listOfCatalogueTabsSingleTabAdapter = moshi.f(D.e(List.class, CatalogueTabsDTO.CatalogueTabsSingleTab.class), m11, DynamicElementDTO.TABS);
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(CatalogueTabsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CatalogueTabsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CornerRadius cornerRadius = null;
        CatalogueTabsDTO.CatalogueTabsPaddings catalogueTabsPaddings = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        List<CatalogueTabsDTO.CatalogueTabsSingleTab> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                if (cornerRadius == null) {
                    throw c.q("radius", "radius", reader);
                }
            } else if (v11 == 1) {
                catalogueTabsPaddings = this.catalogueTabsPaddingsAdapter.fromJson(reader);
                if (catalogueTabsPaddings == null) {
                    throw c.q("scrollableStatePaddings", "scrollableStatePaddings", reader);
                }
            } else if (v11 == 2) {
                layoutPadding = this.layoutPaddingAdapter.fromJson(reader);
                if (layoutPadding == null) {
                    throw c.q("tabsGapPadding", "tabsGapPadding", reader);
                }
            } else if (v11 == 3 && (list = this.listOfCatalogueTabsSingleTabAdapter.fromJson(reader)) == null) {
                throw c.q(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
            }
        }
        reader.endObject();
        if (cornerRadius == null) {
            throw c.j("radius", "radius", reader);
        }
        if (catalogueTabsPaddings == null) {
            throw c.j("scrollableStatePaddings", "scrollableStatePaddings", reader);
        }
        if (layoutPadding == null) {
            throw c.j("tabsGapPadding", "tabsGapPadding", reader);
        }
        if (list != null) {
            return new CatalogueTabsDTO(cornerRadius, catalogueTabsPaddings, layoutPadding, list);
        }
        throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CatalogueTabsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("radius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getRadius());
        writer.w("scrollableStatePaddings");
        this.catalogueTabsPaddingsAdapter.mo44toJson(writer, (x) value.getScrollableStatePaddings());
        writer.w("tabsGapPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getTabsGapPadding());
        writer.w(DynamicElementDTO.TABS);
        this.listOfCatalogueTabsSingleTabAdapter.mo44toJson(writer, (x) value.getTabs());
        writer.p();
    }
}
