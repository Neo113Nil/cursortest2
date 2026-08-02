package ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data.B2bContactUsDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation.B2bContactUsVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;", "item", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "mapBanner", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class B2bContactUsMapper implements Function2<B2bContactUsDTO, d, List<? extends B2bContactUsVO>> {
    private final B2bContactUsVO.BannerVO mapBanner(B2bContactUsDTO.BannerDTO item) {
        TextAtom title = item.getTitle();
        TextAtom subtitle = item.getSubtitle();
        AtomActionDTO action = item.getAction();
        return new B2bContactUsVO.BannerVO(title, subtitle, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, MapperExtKt.toVO(item.getImageUrl()), item.getBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<B2bContactUsVO> invoke(@NotNull B2bContactUsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        boolean z11 = state.getBanner() != null;
        B2bContactUsDTO.BannerDTO banner = state.getBanner();
        return C7714v.a0(new B2bContactUsVO(hashCode, title, z11, banner != null ? mapBanner(banner) : null, state.getCells()));
    }
}
