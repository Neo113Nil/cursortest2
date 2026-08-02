package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple;

import W10.c;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockViewHolderDelegate;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.RoundedCornerVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0016¢\u0006\u0004\b\r\u0010\u001bJ&\u0010!\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleView;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "", "trackView", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;)Lkotlin/Unit;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "position", "bindOuterBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleView;", "getContainerView", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleView;", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoupleNaviBlockViewHolder extends k<CoupleNaviBlockVO> {
    private final /* synthetic */ NaviBlockViewHolderDelegate $$delegate_0;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CoupleView containerView;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoupleNaviBlockViewHolder(@NotNull CoupleView containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.$$delegate_0 = new NaviBlockViewHolderDelegate(containerView);
        this.containerView = containerView;
        this.references = references;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        containerView.setOnAction(buildHandler);
    }

    public void bindOuterBackground(@NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        this.$$delegate_0.bindOuterBackground(roundedCorners, position);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CoupleNaviBlockVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindOuterBackground(item.getRoundedCorners(), item.getPosition());
        this.containerView.bind(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CoupleNaviBlockVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        trackView(item.getTopItem());
        trackView(item.getBottomItem());
    }

    private final Unit trackView(CoupleNaviBlockVO.NaviBlockItemVO naviBlockItemVO) {
        t tokenizedEvent = naviBlockItemVO.getTokenizedEvent();
        if (tokenizedEvent == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        return Unit.f71690a;
    }
}
