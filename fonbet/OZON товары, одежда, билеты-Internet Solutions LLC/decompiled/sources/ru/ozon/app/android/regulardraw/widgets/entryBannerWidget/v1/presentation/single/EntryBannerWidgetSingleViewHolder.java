package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.single;

import JG.b;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/single/EntryBannerWidgetSingleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/single/EntryBannerWidgetSingleView;", "entryBannerWidgetSingleView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/single/EntryBannerWidgetSingleView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/single/EntryBannerWidgetSingleView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetSingleViewHolder extends k<EntryBannerWidgetVO.Single> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final EntryBannerWidgetSingleView entryBannerWidgetSingleView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryBannerWidgetSingleViewHolder(@NotNull EntryBannerWidgetSingleView entryBannerWidgetSingleView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences composerReferences) {
        super(entryBannerWidgetSingleView);
        Intrinsics.checkNotNullParameter(entryBannerWidgetSingleView, "entryBannerWidgetSingleView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.entryBannerWidgetSingleView = entryBannerWidgetSingleView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        entryBannerWidgetSingleView.attachLifecycleScope(K.a(composerReferences.getContainer().g()));
        entryBannerWidgetSingleView.setOnClickListener(new b(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(EntryBannerWidgetSingleViewHolder entryBannerWidgetSingleViewHolder, View view) {
        Banner banner;
        AtomAction action;
        EntryBannerWidgetVO.Single boundData = entryBannerWidgetSingleViewHolder.getBoundData();
        if (boundData == null || (banner = boundData.getBanner()) == null || (action = banner.getAction()) == null) {
            return;
        }
        entryBannerWidgetSingleViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EntryBannerWidgetVO.Single item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.entryBannerWidgetSingleView.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull EntryBannerWidgetVO.Single item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getBanner().getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
