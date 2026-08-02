package ru.ozon.app.android.fresh.main.widgets.catalogShelf.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.common.flags.FreshCatalogShelfPerf;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfDTO;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u001b\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection;", "section", "", "appendInnerItem", "(Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection;)V", "", "defineTopCorners", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection;)Z", "defineBottomCorners", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogShelfParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final JsonParser jsonDeserializer;

    public CatalogShelfParser(@NotNull JsonParser jsonDeserializer, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.jsonDeserializer = jsonDeserializer;
        this.featureChecker = featureChecker;
    }

    private final void appendInnerItem(List<Object> list, CatalogShelfDTO.CatalogShelfSection catalogShelfSection) {
        HeaderV2DTO header = catalogShelfSection.getHeader();
        if (header != null) {
            list.add(new CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader(header, catalogShelfSection.getSectionScrollKey()));
        }
        ArrayList y11 = C7714v.y(catalogShelfSection.getItems(), 3);
        Iterator it = y11.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            List list2 = (List) it.next();
            if (i11 == 0) {
                list.add(new CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow(defineTopCorners(catalogShelfSection), y11.size() > 1 ? false : defineBottomCorners(catalogShelfSection), list2, catalogShelfSection.getSectionScrollKey(), catalogShelfSection.getHeader() == null ? catalogShelfSection.getSectionScrollKey() : null));
            } else if (i11 == C7714v.P(y11)) {
                list.add(new CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow(y11.size() > 1 ? false : defineTopCorners(catalogShelfSection), defineBottomCorners(catalogShelfSection), list2, null, null, 24, null));
            } else {
                list.add(new CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow(false, false, list2, null, null, 24, null));
            }
            i11 = i12;
        }
    }

    private final boolean defineBottomCorners(CatalogShelfDTO.CatalogShelfSection section) {
        return (section.getRoundedCorners() == null || section.getRoundedCorners() == CatalogShelfDTO.CatalogShelfSection.RoundedCorners.TOP) ? false : true;
    }

    private final boolean defineTopCorners(CatalogShelfDTO.CatalogShelfSection section) {
        return (section.getHeader() != null || section.getRoundedCorners() == null || section.getRoundedCorners() == CatalogShelfDTO.CatalogShelfSection.RoundedCorners.BOTTOM) ? false : true;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        boolean isEnabled = this.featureChecker.isEnabled(FreshCatalogShelfPerf.INSTANCE);
        if (state != null) {
            CatalogShelfModel catalogShelfModel = isEnabled ? (CatalogShelfModel) this.jsonDeserializer.fromJson(state, CatalogShelfDTOAnnotated.class) : (CatalogShelfModel) this.jsonDeserializer.fromJson(state, CatalogShelfDTO.class);
            if (catalogShelfModel != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = catalogShelfModel.getSections().iterator();
                while (it.hasNext()) {
                    appendInnerItem(arrayList, (CatalogShelfDTO.CatalogShelfSection) it.next());
                }
                return arrayList;
            }
        }
        return K.f71697a;
    }
}
