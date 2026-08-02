package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import S0.InterfaceC3967k;
import Vg.c;
import WZ.l;
import WZ.t;
import a1.C4912a;
import android.view.View;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.compose.ComposeWidgetViewHolder;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001 \b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderCompose/NavigationSliderComposeViewHolder;", "Lru/ozon/app/android/composer/compose/ComposeWidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "Landroid/view/View;", "view", "Ll10/i;", "container", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroidx/fragment/app/r;", "activity", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Landroid/view/View;Ll10/i;LVg/c;Landroidx/fragment/app/r;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "item", "Ll20/d;", "info", "Lkotlin/Function0;", "", "content", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;Ll20/d;)Lkotlin/jvm/functions/Function2;", "Landroidx/fragment/app/r;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/storefront/widgets/navigationSliderCompose/NavigationSliderComposeViewHolder$adapterCallback$1", "adapterCallback", "Lru/ozon/app/android/storefront/widgets/navigationSliderCompose/NavigationSliderComposeViewHolder$adapterCallback$1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderComposeViewHolder extends ComposeWidgetViewHolder<NavigationSliderV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final r activity;

    @NotNull
    private final NavigationSliderComposeViewHolder$adapterCallback$1 adapterCallback;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposeViewHolder$adapterCallback$1] */
    public NavigationSliderComposeViewHolder(@NotNull View view, @NotNull i container, @NotNull c customActionHandlersStore, @NotNull r activity, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.activity = activity;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new NavigationSliderComposeViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        this.adapterCallback = new ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2>() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposeViewHolder$adapterCallback$1
            @Override // ru.ozon.app.android.tools.ItemAdapterCallback
            public void click(int position, final NavigationSliderV2VO.NavigationItemV2 item) {
                AdultHandler adultHandler2;
                r rVar;
                if (item != null) {
                    final NavigationSliderComposeViewHolder navigationSliderComposeViewHolder = NavigationSliderComposeViewHolder.this;
                    adultHandler2 = navigationSliderComposeViewHolder.adultHandler;
                    boolean shouldBlur = item.getShouldBlur();
                    rVar = navigationSliderComposeViewHolder.activity;
                    G supportFragmentManager = rVar.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler2, shouldBlur, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposeViewHolder$adapterCallback$1$click$1$1
                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultAccept() {
                            Function1 function1;
                            l lVar;
                            function1 = NavigationSliderComposeViewHolder.this.actionHandler;
                            function1.invoke(item.getAction());
                            t tokenizedEvent = item.getTokenizedEvent();
                            if (tokenizedEvent != null) {
                                lVar = NavigationSliderComposeViewHolder.this.tokenizedAnalytics;
                                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(lVar, tokenizedEvent, null, 2, null);
                            }
                        }

                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultReject() {
                            AdultListener.DefaultImpls.onAdultReject(this);
                        }
                    }, null, false, 24, null);
                }
            }

            @Override // ru.ozon.app.android.tools.ItemAdapterCallback
            public void view(int position, NavigationSliderV2VO.NavigationItemV2 item) {
                t tokenizedEvent;
                l lVar;
                if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
                    return;
                }
                lVar = NavigationSliderComposeViewHolder.this.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
        };
    }

    @Override // ru.ozon.app.android.composer.compose.ComposeWidgetViewHolder
    @NotNull
    public Function2<InterfaceC3967k, Integer, Unit> content(@NotNull NavigationSliderV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        return new C4912a(true, -2023458798, new NavigationSliderComposeViewHolder$content$1(item, this));
    }
}
