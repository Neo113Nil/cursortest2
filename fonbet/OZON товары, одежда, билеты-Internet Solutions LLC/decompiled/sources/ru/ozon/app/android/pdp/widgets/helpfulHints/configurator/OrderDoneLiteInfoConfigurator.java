package ru.ozon.app.android.pdp.widgets.helpfulHints.configurator;

import M10.d;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsInfoStorage;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/helpfulHints/configurator/OrderDoneLiteInfoConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LoZ/a;", "<init>", "()V", "", "deeplink", "", "refresh", "", "onAnchorReturn", "(Ljava/lang/String;Z)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderDoneLiteInfoConfigurator extends ComposerScreenConfig.PageConfigurator implements InterfaceC8677a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/helpfulHints/configurator/OrderDoneLiteInfoConfigurator$Companion;", "", "<init>", "()V", "ORDER_SUM_QUERY", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final RecyclerView getRecyclerView() {
        View view;
        View rootView;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView);
    }

    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        InterfaceC7851b controller;
        InterfaceC7851b controller2;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String queryParameter = Uri.parse(deeplink).getQueryParameter("order_sum");
        if (queryParameter == null || h.K(queryParameter)) {
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, deeplink, null, null, null, 14);
            return;
        }
        HelpfulHintsInfoStorage.INSTANCE.clearOrderDoneLiteInfo();
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (controller2 = references2.getController()) == null) {
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        InterfaceC7851b.a.a(controller2, deeplink, null, null, new h.b(recyclerView != null ? d.a(recyclerView) : null, null, 2), 6);
    }
}
