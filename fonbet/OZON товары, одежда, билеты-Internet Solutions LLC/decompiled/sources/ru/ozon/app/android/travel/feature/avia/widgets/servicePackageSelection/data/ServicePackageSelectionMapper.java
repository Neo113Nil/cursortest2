package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.data.ServicePackageSelectionDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.ServicePackageSelectionVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO$PackageTabDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO$PackageTabVO;", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO$PackageTabDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO$PackageTabVO;", "", "Lru/ozon/uni/android/uikitsdk/Color;", "toColor", "(Ljava/lang/String;)Lru/ozon/uni/android/uikitsdk/Color;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackageSelectionMapper implements Function2<ServicePackageSelectionDTO, d, List<? extends ServicePackageSelectionVO>> {

    @NotNull
    private final Context context;

    public ServicePackageSelectionMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Color toColor(String str) {
        Color.Gradient gradient;
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(str);
        if (gradientByToken != null && (gradient = TokensExtKt.toGradient(gradientByToken, this.context)) != null) {
            return gradient;
        }
        Integer parseColor = StyleParser.INSTANCE.parseColor(this.context, str);
        return parseColor != null ? new Color.Solid(parseColor.intValue()) : new Color.Solid(ThemeExtKt.themeColor(this.context, R$attr.graphicNeutral));
    }

    private final ServicePackageSelectionVO.PackageTabVO toVO(ServicePackageSelectionDTO.PackageTabDTO packageTabDTO) {
        TextDTO title = packageTabDTO.getTitle();
        PriceDTO price = packageTabDTO.getPrice();
        Color color = toColor(packageTabDTO.getStrokeColor());
        int px = UiExtKt.toPx(packageTabDTO.getStrokeThickness(), this.context);
        IconDTO icon = packageTabDTO.getIcon();
        BadgeDTO discountBadge = packageTabDTO.getDiscountBadge();
        AtomActionDTO action = packageTabDTO.getAction();
        return new ServicePackageSelectionVO.PackageTabVO(title, price, color, px, icon, discountBadge, action != null ? AtomActionMapperKt.toAtomAction(action, packageTabDTO.getTrackingInfo()) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ServicePackageSelectionVO> invoke(@NotNull ServicePackageSelectionDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ServicePackageSelectionDTO.PackageTabDTO> packageTabs = state.getPackageTabs();
        boolean z11 = false;
        if (!(packageTabs instanceof Collection) || !packageTabs.isEmpty()) {
            Iterator<T> it = packageTabs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ServicePackageSelectionDTO.PackageTabDTO) it.next()).getDiscountBadge() != null) {
                    z11 = true;
                    break;
                }
            }
        }
        boolean z12 = z11;
        TextDTO title = state.getTitle();
        List<ServicePackageSelectionDTO.PackageTabDTO> packageTabs2 = state.getPackageTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(packageTabs2, 10));
        Iterator<T> it2 = packageTabs2.iterator();
        while (it2.hasNext()) {
            arrayList.add(toVO((ServicePackageSelectionDTO.PackageTabDTO) it2.next()));
        }
        return C7714v.a0(new ServicePackageSelectionVO(hashCode, title, arrayList, z12, state.getDescription(), state.getCells()));
    }
}
