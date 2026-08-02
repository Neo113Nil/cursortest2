package ru.ozon.app.android.partpayment.routing.factories;

import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.partpayment.routing.DestinationFactory;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/partpayment/routing/factories/PartPaymentContractFactory;", "Lru/ozon/app/android/partpayment/routing/DestinationFactory;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "canHandle", "(Landroid/net/Uri;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "createDestination", "(Landroid/content/Context;Landroid/net/Uri;)LpZ/f;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PartPaymentContractFactory implements DestinationFactory {
    @Override // ru.ozon.app.android.partpayment.routing.DestinationFactory
    public boolean canHandle(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.d(deeplink.getAuthority(), "partpayment") && C3532b.g(deeplink, "getPathSegments(...)", "contract");
    }

    @Override // ru.ozon.app.android.partpayment.routing.DestinationFactory
    @NotNull
    public f createDestination(@NotNull Context context, @NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String uri = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String uri2 = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(uri2, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(R$drawable.ic_m_cross, false, null, null, null, null, 62, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777212, null), uri, null, true, false, null, false, false, null, CounterView.COUNTER_MAX_DEFAULT, null);
    }
}
