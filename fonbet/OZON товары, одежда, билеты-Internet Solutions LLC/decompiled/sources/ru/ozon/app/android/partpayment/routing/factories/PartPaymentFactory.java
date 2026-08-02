package ru.ozon.app.android.partpayment.routing.factories;

import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import c8.C5766e;
import i10.h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.partpayment.formpage.PartPaymentSummaryPageConfigurator;
import ru.ozon.app.android.partpayment.formpage.ResultControllerConfigurator;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.partpayment.routing.DestinationFactory;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/routing/factories/PartPaymentFactory;", "Lru/ozon/app/android/partpayment/routing/DestinationFactory;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "(Landroid/net/Uri;)Ljava/util/Set;", "", "canHandle", "(Landroid/net/Uri;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "createDestination", "(Landroid/content/Context;Landroid/net/Uri;)LpZ/f;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PartPaymentFactory implements DestinationFactory {
    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators(Uri deeplink) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(ResultControllerConfigurator.class);
        if (C5766e.c(deeplink, "getPathSegments(...)", 1, FormPageDTO.Field.FIELD_TYPE_SUMMARY)) {
            linkedHashSet.add(PartPaymentSummaryPageConfigurator.class);
        }
        return linkedHashSet;
    }

    @Override // ru.ozon.app.android.partpayment.routing.DestinationFactory
    public boolean canHandle(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.d(deeplink.getAuthority(), "partpayment") && C3532b.g(deeplink, "getPathSegments(...)", "formpage");
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
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(uri2, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(R$drawable.ic_m_cross, false, null, null, null, null, 58, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, getConfigurators(deeplink), null, null, null, false, null, null, null, false, false, null, null, 16773116, null), uri, null, false, false, null, false, false, null, CounterView.COUNTER_MAX_DEFAULT, null);
    }
}
