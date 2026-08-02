package ru.ozon.app.android.ugc.widgets.ugccounters.presentation;

import W10.c;
import WZ.l;
import android.content.Context;
import android.widget.LinearLayout;
import java.util.Iterator;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersLlViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "Landroid/widget/LinearLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "imagesPreCreationConfig", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Landroid/widget/LinearLayout;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersLlBinder;", "binder", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersLlBinder;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersLlViewHolder extends k<UgcCountersVO> {

    @NotNull
    private final UgcCountersLlBinder binder;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersLlViewHolder$Companion;", "", "<init>", "()V", "createView", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LinearLayout createView(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setId(R$id.pdpUgcLl);
            Dimens dimens = Dimens.INSTANCE;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dimens.getDP_52());
            linearLayout.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setBackgroundColor(ContextExtKt.parseColor(context, UniColors.LAYER_FLOOR_1.getToken()));
            return linearLayout;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCountersLlViewHolder(@NotNull LinearLayout containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull UgcCountersOnboardingViewModel onboardingViewModel, @NotNull PlayerPreloader playerPreloader, UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.binder = new UgcCountersLlBinder(containerView, refs, onboardingViewModel, playerPreloader, ugcCountersImagesPreCreationConfig, this, widgetImagePlaceholderAdapter);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.binder.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UgcCountersVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BaseWidgetPlaceholderBinder.bind$default(this.binder, item, info, null, null, 12, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull UgcCountersVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
        Iterator<T> it = item.getItems().iterator();
        while (it.hasNext()) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, ((UgcCountersVO.Item) it.next()).getBlock().getTokenizedEvent());
        }
    }
}
