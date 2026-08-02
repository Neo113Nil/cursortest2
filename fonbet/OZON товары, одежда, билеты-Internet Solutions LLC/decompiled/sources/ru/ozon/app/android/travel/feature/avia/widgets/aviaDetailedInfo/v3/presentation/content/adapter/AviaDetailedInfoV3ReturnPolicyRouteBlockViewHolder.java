package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3ReturnPolicyRouteBlockViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "container", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "logoIV", "Lru/ozon/uni/android/atom/icon/IconView;", "routeTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textTAV", "bind", "", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3ReturnPolicyRouteBlockViewHolder extends BaseViewHolder<AviaDetailedInfoV3ListItemVO> {
    public static final int $stable = TextAtomV2View.$stable | IconView.$stable;
    private final IconView logoIV;
    private final TextAtomV2View routeTAV;
    private final TextAtomV2View textTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3ReturnPolicyRouteBlockViewHolder(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        View childAt = container.getChildAt(0);
        this.logoIV = childAt instanceof IconView ? (IconView) childAt : null;
        View childAt2 = container.getChildAt(1);
        this.routeTAV = childAt2 instanceof TextAtomV2View ? (TextAtomV2View) childAt2 : null;
        View childAt3 = container.getChildAt(2);
        this.textTAV = childAt3 instanceof TextAtomV2View ? (TextAtomV2View) childAt3 : null;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailedInfoV3ListItemVO aviaDetailedInfoV3ListItemVO, List list) {
        bind2(aviaDetailedInfoV3ListItemVO, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailedInfoV3ListItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if ((item instanceof AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO ? (AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO) item : null) != null) {
            IconView iconView = this.logoIV;
            if (iconView != null) {
                IconHolderKt.bind$default(iconView, ((AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO) item).getAirlineLogo(), null, 2, null);
            }
            TextAtomV2View textAtomV2View = this.routeTAV;
            if (textAtomV2View != null) {
                TextHolderKt.bind$default(textAtomV2View, ((AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO) item).getRoute(), null, 2, null);
            }
            TextAtomV2View textAtomV2View2 = this.textTAV;
            if (textAtomV2View2 != null) {
                TextHolderKt.bind$default(textAtomV2View2, ((AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO) item).getText(), null, 2, null);
            }
        }
    }
}
