package ru.ozon.app.android.sellerproducts.header.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.CommonProductWidgetDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductWidgetDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/sellerproducts/header/model/HeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/sellerproducts/header/model/HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductWidgetDTO;Ll20/d;)Ljava/util/List;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeaderMapper implements Function2<ProductWidgetDTO, d, List<? extends HeaderVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HeaderVO> invoke(@NotNull ProductWidgetDTO state, @NotNull d widgetInfo) {
        List<String> list;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        HeaderDTO header = state.getHeader();
        if (header != null) {
            long hashCode = widgetInfo.d().hashCode();
            TextAtom title = header.getTitle();
            TextAtom subtitle = header.getSubtitle();
            AtomActionDTO action = header.getAction();
            Map<String, TokenizedTrackingInfo> trackingInfo = header.getTrackingInfo();
            TestInfo testInfo = header.getTestInfo();
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = header.getSmallBorderlessButton();
            CommonProductWidgetDTO.WidgetOptions widgetOptions = state.getWidgetOptions();
            if (widgetOptions == null || (list = widgetOptions.getBackgroundGradient()) == null) {
                list = K.f71697a;
            }
            List<HeaderVO> a02 = C7714v.a0(new HeaderVO(hashCode, title, subtitle, action, trackingInfo, testInfo, smallBorderlessButton, list));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
