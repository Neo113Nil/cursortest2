package ru.ozon.app.android.search.catalog.components.categorylogos.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.catalog.components.categorylogos.data.CategoryLogoDTO;
import ru.ozon.app.android.search.catalog.components.categorylogos.data.CategoryLogosDTO;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0018B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/core/CategoryLogosMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogosDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogoDTO;", "dto", "", "hasValidType", "(Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogoDTO;)Z", "", "widgetId", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "toVo", "(Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogoDTO;J)Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogosDTO;Ll20/d;)Ljava/util/List;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryLogosMapper implements Function2<CategoryLogosDTO, d, List<? extends CategoryLogosVO>> {
    private final boolean hasValidType(CategoryLogoDTO dto) {
        return Intrinsics.d(dto.getType(), "LOGOS") || Intrinsics.d(dto.getType(), "BUTTON");
    }

    private final CategoryLogoVO toVo(CategoryLogoDTO categoryLogoDTO, long j11) {
        String type = categoryLogoDTO.getType();
        if (!Intrinsics.d(type, "LOGOS")) {
            if (!Intrinsics.d(type, "BUTTON")) {
                throw new IllegalStateException("unreachable statement");
            }
            ButtonV3Atom.LargeIconButton button = categoryLogoDTO.getButton();
            if (button != null) {
                return new CategoryLogoVO.Button(button);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        String title = categoryLogoDTO.getTitle();
        if (title == null) {
            return null;
        }
        String id2 = categoryLogoDTO.getId();
        if (id2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String deeplink = categoryLogoDTO.getDeeplink();
        String image = categoryLogoDTO.getImage();
        if (image == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean d11 = Intrinsics.d(categoryLogoDTO.isAdult(), Boolean.TRUE);
        Boolean hasChildren = categoryLogoDTO.getHasChildren();
        String parentTitle = categoryLogoDTO.getParentTitle();
        AtomActionDTO action = categoryLogoDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = categoryLogoDTO.getTrackingInfo();
        return new CategoryLogoVO.Logo(d11, false, id2, title, image, deeplink, hasChildren, parentTitle, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, 2, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CategoryLogosVO> invoke(@NotNull CategoryLogosDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CategoryLogoDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (hasValidType((CategoryLogoDTO) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CategoryLogoVO vo = toVo((CategoryLogoDTO) it.next(), hashCode);
            if (vo != null) {
                arrayList2.add(vo);
            }
        }
        Boolean hideImage = state.getHideImage();
        return C7714v.a0(new CategoryLogosVO(hashCode, arrayList2, hideImage != null ? hideImage.booleanValue() : false));
    }
}
