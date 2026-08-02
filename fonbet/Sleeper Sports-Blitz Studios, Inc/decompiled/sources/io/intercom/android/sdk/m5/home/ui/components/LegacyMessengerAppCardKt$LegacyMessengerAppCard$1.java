package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyMessengerAppCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class LegacyMessengerAppCardKt$LegacyMessengerAppCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ CardWebView $webView;

    LegacyMessengerAppCardKt$LegacyMessengerAppCard$1(CardWebView cardWebView) {
        this.$webView = cardWebView;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope IntercomCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    FrameLayout invoke$lambda$1;
                    invoke$lambda$1 = LegacyMessengerAppCardKt$LegacyMessengerAppCard$1.invoke$lambda$1((Context) obj);
                    return invoke$lambda$1;
                }
            };
            final CardWebView cardWebView = this.$webView;
            AndroidView_androidKt.AndroidView(function1, null, new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2;
                    invoke$lambda$2 = LegacyMessengerAppCardKt$LegacyMessengerAppCard$1.invoke$lambda$2(CardWebView.this, (FrameLayout) obj);
                    return invoke$lambda$2;
                }
            }, composer, 6, 2);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout invoke$lambda$1(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(CardWebView webView, FrameLayout it) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        it.addView(webView);
        return Unit.INSTANCE;
    }
}
