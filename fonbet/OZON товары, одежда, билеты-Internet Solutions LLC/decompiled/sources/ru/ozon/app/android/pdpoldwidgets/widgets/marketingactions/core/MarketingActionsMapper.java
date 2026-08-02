package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.data.MarketingActionsDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsVO;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/data/MarketingActionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/data/MarketingActionsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarketingActionsMapper implements Function2<MarketingActionsDTO, d, List<? extends MarketingActionsVO>> {

    @NotNull
    private final Context context;

    public MarketingActionsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MarketingActionsVO> invoke(@NotNull MarketingActionsDTO state, @NotNull d widgetInfo) {
        int i11;
        boolean z11;
        String deeplink;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<MarketingActionsDTO.Action> actions = state.getActions();
        ArrayList arrayList = new ArrayList(C7714v.z(actions, 10));
        for (MarketingActionsDTO.Action action : actions) {
            String color = action.getColor();
            Integer parseColor = color != null ? StyleParser.INSTANCE.parseColor(this.context, color) : null;
            boolean z12 = parseColor != null;
            if (parseColor != null) {
                i11 = parseColor.intValue();
                z11 = false;
            } else {
                i11 = 0;
                z11 = false;
            }
            String title = action.getTitle();
            String subTitle = action.getSubTitle();
            boolean z13 = !((subTitle == null || h.K(subTitle)) ? true : z11);
            String subTitle2 = action.getSubTitle();
            if (subTitle2 == null) {
                subTitle2 = "";
            }
            String deeplinkTitle = action.getDeeplinkTitle();
            boolean z14 = (deeplinkTitle == null || h.K(deeplinkTitle) || (deeplink = action.getDeeplink()) == null || h.K(deeplink)) ? z11 : true;
            String deeplinkTitle2 = action.getDeeplinkTitle();
            if (deeplinkTitle2 == null) {
                deeplinkTitle2 = "";
            }
            String deeplink2 = action.getDeeplink();
            arrayList.add(new MarketingActionsVO.ActionItem(z12, i11, title, z13, subTitle2, z14, deeplinkTitle2, deeplink2 == null ? "" : deeplink2));
        }
        return C7714v.a0(new MarketingActionsVO(hashCode, arrayList));
    }
}
