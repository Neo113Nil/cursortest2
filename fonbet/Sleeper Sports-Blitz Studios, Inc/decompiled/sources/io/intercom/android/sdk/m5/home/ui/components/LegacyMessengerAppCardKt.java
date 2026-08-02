package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewClient;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyMessengerAppCard.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"LegacyMessengerAppCard", "", "url", "", "style", "Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "isHomeScreen", "", "(Ljava/lang/String;Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;ZLandroidx/compose/runtime/Composer;I)V", "getWebView", "Lio/intercom/android/sdk/blocks/messengercard/CardWebView;", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LegacyMessengerAppCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyMessengerAppCard$lambda$0(String url, IntercomCardStyle.Style style, boolean z, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(style, "$style");
        LegacyMessengerAppCard(url, style, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LegacyMessengerAppCard(final String url, IntercomCardStyle.Style style, final boolean z, Composer composer, final int i) {
        int i2;
        final IntercomCardStyle.Style style2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(-1087658045);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(style) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            style2 = style;
            IntercomCardKt.IntercomCard(null, style2, ComposableLambdaKt.rememberComposableLambda(231006519, true, new LegacyMessengerAppCardKt$LegacyMessengerAppCard$1(getWebView(ThemeUtils.appendInterfaceStyleToUrl(context, url), context, z)), startRestartGroup, 54), startRestartGroup, (IntercomCardStyle.Style.$stable << 3) | 384 | (i2 & 112), 1);
        } else {
            startRestartGroup.skipToGroupEnd();
            style2 = style;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LegacyMessengerAppCard$lambda$0;
                    LegacyMessengerAppCard$lambda$0 = LegacyMessengerAppCardKt.LegacyMessengerAppCard$lambda$0(url, style2, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LegacyMessengerAppCard$lambda$0;
                }
            });
        }
    }

    private static final CardWebView getWebView(String str, Context context, boolean z) {
        CardWebView cachedWebView = InMemoryWebViewCacheKt.getCachedWebView(str);
        if (cachedWebView != null) {
            return cachedWebView;
        }
        CardWebView cardWebView = new CardWebView(context);
        cardWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, 160));
        cardWebView.getSettings().setJavaScriptEnabled(true);
        cardWebView.getSettings().setUseWideViewPort(true);
        cardWebView.getSettings().setCacheMode(-1);
        cardWebView.getSettings().setMixedContentMode(0);
        cardWebView.setVerticalScrollBarEnabled(false);
        cardWebView.setHorizontalScrollBarEnabled(false);
        cardWebView.setWebViewClient(new MessengerCardWebViewClient(str));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m12487getLambda2$intercom_sdk_base_release());
        new MessengerCardWebViewPresenter(cardWebView, composeView, str, Injector.get().getAppConfigProvider().get().getPrimaryColor(), Injector.get().getGson(), Injector.get().getMetricTracker(), cardWebView.getContext().getCacheDir(), "", z, context).setUpWebView();
        cardWebView.loadUrl(str);
        InMemoryWebViewCacheKt.cacheWebView(str, cardWebView);
        return cardWebView;
    }
}
