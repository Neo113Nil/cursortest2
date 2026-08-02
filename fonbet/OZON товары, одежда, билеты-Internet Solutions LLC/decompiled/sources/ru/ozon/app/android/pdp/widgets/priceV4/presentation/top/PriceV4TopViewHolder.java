package ru.ozon.app.android.pdp.widgets.priceV4.presentation.top;

import Ar.c;
import WZ.l;
import WZ.t;
import WZ.x;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.PdpWidgetImagePlaceholderFlag;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.util.FontScalingFeatureFlag;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceV4TopViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Top;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/uni/android/atom/price/ui/PriceAtomView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Top;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Top;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "isEnabledWidgetImagePlaceholders", "Z", "fontScalingFF", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV4TopViewHolder extends k<PriceV4VoWrapper.Top> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean fontScalingFF;
    private final boolean isEnabledWidgetImagePlaceholders;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PriceAtomView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV4TopViewHolder(@NotNull PriceAtomView view, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences composerReferences, @NotNull FeatureChecker featureChecker) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.isEnabledWidgetImagePlaceholders = featureChecker.isEnabled(PdpWidgetImagePlaceholderFlag.INSTANCE);
        this.fontScalingFF = FontScalingFeatureFlag.INSTANCE.isEnabled();
        view.setOnClickListener(new c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PriceV4TopViewHolder priceV4TopViewHolder, View view) {
        AtomActionDTO priceAction;
        PriceDTO price;
        PriceV4VoWrapper.Top boundData = priceV4TopViewHolder.getBoundData();
        if (boundData == null || (priceAction = boundData.getPriceAction()) == null) {
            return;
        }
        PriceV4VoWrapper.Top boundData2 = priceV4TopViewHolder.getBoundData();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(priceAction, (boundData2 == null || (price = boundData2.getPrice()) == null) ? null : price.getTrackingInfo());
        if (atomAction != null) {
            priceV4TopViewHolder.actionHandler.invoke(atomAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PriceV4VoWrapper.Top item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (this.isEnabledWidgetImagePlaceholders) {
            FontScalingFeatureFlag.INSTANCE.setEnabled(this.fontScalingFF);
        }
        PriceAtomHolderKt.bind$default(this.view, item.getPrice(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PriceV4VoWrapper.Top item, @NotNull W10.c trackingData, f viewedPond) {
        t b11;
        t b12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null && (b12 = x.b(trackingInfo, Long.valueOf(item.getId()), null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, b12, null, 2, null);
        }
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getPrice().getTrackingInfo();
        if (trackingInfo2 == null || (b11 = x.b(trackingInfo2, Long.valueOf(item.getId()), null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
    }
}
