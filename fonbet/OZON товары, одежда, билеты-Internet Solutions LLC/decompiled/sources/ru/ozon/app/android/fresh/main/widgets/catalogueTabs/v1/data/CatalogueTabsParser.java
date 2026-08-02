package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data;

import Xc.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import sf.C9681g;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u0012\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsParser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "readTabsPaddings", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsPaddings;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Lcom/squareup/moshi/n$a;", "jsonDTONames", "Lcom/squareup/moshi/n$a;", "getJsonDTONames$annotations", "()V", "jsonDTOPaddingsNames", "getJsonDTOPaddingsNames$annotations", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsSingleTab;", "tabAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "radiusAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsParser implements Function2<String, String, CatalogueTabsDTO> {

    @NotNull
    private final n.a jsonDTONames;

    @NotNull
    private final n.a jsonDTOPaddingsNames;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> layoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> radiusAdapter;

    @NotNull
    private final JsonAdapter<CatalogueTabsDTO.CatalogueTabsSingleTab> tabAdapter;

    public CatalogueTabsParser(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        a<CatalogueTabsDTO.DtoFieldName> entries = CatalogueTabsDTO.DtoFieldName.getEntries();
        ArrayList arrayList = new ArrayList(C7714v.z(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((CatalogueTabsDTO.DtoFieldName) it.next()).getJsonName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.jsonDTONames = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
        a<CatalogueTabsDTO.DtoPaddingsFieldName> entries2 = CatalogueTabsDTO.DtoPaddingsFieldName.getEntries();
        ArrayList arrayList2 = new ArrayList(C7714v.z(entries2, 10));
        Iterator<E> it2 = entries2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CatalogueTabsDTO.DtoPaddingsFieldName) it2.next()).getJsonName());
        }
        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
        this.jsonDTOPaddingsNames = n.a.C0918a.a((String[]) Arrays.copyOf(strArr2, strArr2.length));
        this.layoutPaddingAdapter = moshi.c(CommonCellSettings.LayoutPadding.class);
        this.tabAdapter = moshi.c(CatalogueTabsDTO.CatalogueTabsSingleTab.class);
        this.radiusAdapter = moshi.c(CornerRadius.class);
    }

    private final CatalogueTabsDTO.CatalogueTabsPaddings readTabsPaddings(n nVar) {
        nVar.beginObject();
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        while (nVar.hasNext()) {
            int v11 = nVar.v(this.jsonDTOPaddingsNames);
            if (v11 == CatalogueTabsDTO.DtoPaddingsFieldName.LEFT_PADDING.ordinal()) {
                layoutPadding = this.layoutPaddingAdapter.fromJson(nVar);
            } else if (v11 == CatalogueTabsDTO.DtoPaddingsFieldName.RIGHT_PADDING.ordinal()) {
                layoutPadding2 = this.layoutPaddingAdapter.fromJson(nVar);
            } else if (v11 == CatalogueTabsDTO.DtoPaddingsFieldName.TOP_PADDING.ordinal()) {
                layoutPadding3 = this.layoutPaddingAdapter.fromJson(nVar);
            } else if (v11 == CatalogueTabsDTO.DtoPaddingsFieldName.BOTTOM_PADDING.ordinal()) {
                layoutPadding4 = this.layoutPaddingAdapter.fromJson(nVar);
            }
        }
        nVar.endObject();
        if (layoutPadding == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding;
        if (layoutPadding2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding2;
        if (layoutPadding3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding3;
        if (layoutPadding4 != null) {
            return new CatalogueTabsDTO.CatalogueTabsPaddings(layoutPadding5, layoutPadding6, layoutPadding7, layoutPadding4);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public CatalogueTabsDTO invoke(String params, String state) {
        C9681g source = new C9681g();
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        source.H0(state);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        pVar.beginObject();
        CornerRadius cornerRadius = null;
        CatalogueTabsDTO.CatalogueTabsPaddings catalogueTabsPaddings = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        Object obj = null;
        while (pVar.hasNext()) {
            int v11 = pVar.v(this.jsonDTONames);
            if (v11 == CatalogueTabsDTO.DtoFieldName.RADIUS.ordinal()) {
                cornerRadius = this.radiusAdapter.fromJson(pVar);
            } else if (v11 == CatalogueTabsDTO.DtoFieldName.SCROLLABLE_STATE_PADDINGS.ordinal()) {
                catalogueTabsPaddings = readTabsPaddings(pVar);
            } else if (v11 == CatalogueTabsDTO.DtoFieldName.TABS_GAP_PADDING.ordinal()) {
                layoutPadding = this.layoutPaddingAdapter.fromJson(pVar);
            } else if (v11 == CatalogueTabsDTO.DtoFieldName.TABS.ordinal()) {
                obj = C10727i.d(C10720e0.a(), new CatalogueTabsParser$invoke$1$1(pVar, this, null));
            } else {
                pVar.skipValue();
            }
        }
        pVar.endObject();
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CornerRadius cornerRadius2 = cornerRadius;
        if (catalogueTabsPaddings == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (layoutPadding == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CommonCellSettings.LayoutPadding layoutPadding2 = layoutPadding;
        if (obj != null) {
            return new CatalogueTabsDTO(cornerRadius2, catalogueTabsPaddings, layoutPadding2, (List) obj);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
