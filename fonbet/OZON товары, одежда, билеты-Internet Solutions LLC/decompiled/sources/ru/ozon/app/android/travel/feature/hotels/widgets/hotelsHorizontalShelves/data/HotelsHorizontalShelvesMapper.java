package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardMapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardOptionsVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "dto", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;", "extractState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "", "dp16", "I", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsHorizontalShelvesMapper implements Function2<HotelsHorizontalShelvesDTO, d, List<? extends HotelsHorizontalShelvesVO>>, AsyncWidgetStateMapper<HotelsHorizontalShelvesDTO, HotelsHorizontalShelvesVO.State> {

    @NotNull
    private final Context context;
    private final int dp16;

    @NotNull
    private final ImagePrefetcher<ShelfCardVO> imagePrefetcher;

    public HotelsHorizontalShelvesMapper(@NotNull Context context, @NotNull ImagePrefetcher<ShelfCardVO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
        this.dp16 = ResourceExtKt.toPx(16, context);
    }

    private final HotelsHorizontalShelvesVO.Loaded extractState(HotelsHorizontalShelvesDTO dto) {
        AtomActionDTO action;
        ShelfCardOptionsVO vo = ShelfCardMapperExtKt.toVO(dto.getCardOptions(), this.context);
        List<ShelfCardDTO> cards = dto.getCards();
        ArrayList arrayList = new ArrayList(C7714v.z(cards, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : cards) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(ShelfCardMapperExtKt.toVO$default((ShelfCardDTO) obj, this.context, i12, null, Float.valueOf(dto.getCardsOnScreen()), vo.getGap(), dto.getImageAspectRatio(), null, 68, null));
            i12 = i13;
        }
        this.imagePrefetcher.prefetch(this.context, arrayList);
        TextDTO title = dto.getTitle();
        TextDTO subtitle = dto.getSubtitle();
        if (dto.getTitle() == null && dto.getSubtitle() == null) {
            i11 = this.dp16;
        }
        int i14 = i11;
        String backgroundImage = dto.getBackgroundImage();
        String backgroundToken = dto.getBackgroundToken();
        UniGradient backgroundGradient = dto.getBackgroundGradient();
        Color.Gradient gradient = backgroundGradient != null ? TokensExtKt.toGradient(backgroundGradient, this.context) : null;
        float cardsOnScreen = dto.getCardsOnScreen();
        float pxF = ResourceExtKt.toPxF(dto.getCornerRadius().getPx(), this.context);
        CommonControlSettings common = dto.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, dto.getCommon().getTrackingInfo());
        CommonControlSettings common2 = dto.getCommon();
        return new HotelsHorizontalShelvesVO.Loaded(title, subtitle, backgroundImage, backgroundToken, gradient, i14, cardsOnScreen, arrayList, vo, pxF, atomAction, common2 != null ? common2.getTrackingInfo() : null, null, 4096, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsHorizontalShelvesVO> invoke(@NotNull HotelsHorizontalShelvesDTO state, @NotNull d widgetInfo) {
        HotelsHorizontalShelvesVO.State extractState;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String a11 = widgetInfo.c().a();
        if (!state.getCards().isEmpty()) {
            extractState = extractState(state);
        } else {
            if (a11 == null) {
                return K.f71697a;
            }
            extractState = new HotelsHorizontalShelvesVO.AsyncPlaceholder(a11);
        }
        return C7714v.a0(new HotelsHorizontalShelvesVO(widgetInfo.d().hashCode(), extractState));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsHorizontalShelvesVO.State mapAsyncState(@NotNull HotelsHorizontalShelvesDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}
