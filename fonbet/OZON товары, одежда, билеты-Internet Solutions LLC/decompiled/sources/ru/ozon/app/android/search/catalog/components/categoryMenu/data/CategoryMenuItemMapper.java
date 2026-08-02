package ru.ozon.app.android.search.catalog.components.categoryMenu.data;

import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.catalog.components.categoryMenu.data.CategoryMenuDTO;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryItemVO;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.utils.UriExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO$CategoryDTO;", "src", "Lru/ozon/app/android/search/catalog/components/categoryMenu/data/NestingLevel;", "nestingLevel", "", "modalBase", "mapCategoriesToListDO", "(Ljava/util/List;Lru/ozon/app/android/search/catalog/components/categoryMenu/data/NestingLevel;Ljava/lang/String;)Ljava/util/List;", "input", "", "mapToCategoryItemVO", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO$CategoryDTO;ILjava/lang/String;)Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;Ll20/d;)Ljava/util/List;", "startOffset", "I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryMenuItemMapper implements Function2<CategoryMenuDTO, d, List<? extends CategoryItemVO>> {
    private final int startOffset;

    public CategoryMenuItemMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.startOffset = context.getResources().getDimensionPixelSize(R$dimen.divider_start_offset);
    }

    private final List<CategoryItemVO> mapCategoriesToListDO(List<CategoryMenuDTO.CategoryDTO> src, NestingLevel nestingLevel, String modalBase) {
        ArrayList arrayList = new ArrayList();
        if (src == null || !(!src.isEmpty())) {
            nestingLevel.setValue(nestingLevel.getValue() - 1);
            return arrayList;
        }
        int i11 = 0;
        for (Object obj : src) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CategoryMenuDTO.CategoryDTO categoryDTO = (CategoryMenuDTO.CategoryDTO) obj;
            arrayList.add(mapToCategoryItemVO(categoryDTO, nestingLevel.getValue(), modalBase));
            nestingLevel.setValue(nestingLevel.getValue() + 1);
            arrayList.addAll(mapCategoriesToListDO(categoryDTO.getCategories(), nestingLevel, modalBase));
            if (i11 == C7714v.P(src)) {
                nestingLevel.setValue(nestingLevel.getValue() - 1);
            }
            i11 = i12;
        }
        return arrayList;
    }

    private final CategoryItemVO mapToCategoryItemVO(CategoryMenuDTO.CategoryDTO input, int nestingLevel, String modalBase) {
        long id2 = input.getId();
        String name = input.getName();
        boolean isActive = input.isActive();
        String e11 = U7.d.e(modalBase, UriExtKt.removeSchema(input.getDeeplink()));
        String deeplink = input.getDeeplink();
        int i11 = (nestingLevel + 1) * this.startOffset;
        Map<String, TokenizedTrackingInfo> trackingInfo = input.getTrackingInfo();
        return new CategoryItemVO(id2, isActive, name, i11, e11, deeplink, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(input.getId()), null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CategoryItemVO> invoke(@NotNull CategoryMenuDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return mapCategoriesToListDO(state.getCategories(), new NestingLevel(0, 1, null), state.getModalUrl());
    }
}
