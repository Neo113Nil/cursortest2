package ru.ozon.app.android.search.deeplink;

import Tc.b;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import gk0.p;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/deeplink/FeedbackTilePreCreationConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "onComposerInitialized", "Landroidx/fragment/app/r;", "getActivity", "()Landroidx/fragment/app/r;", "activity", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackTilePreCreationConfigurator extends ComposerScreenConfig.PageConfigurator {
    /* JADX INFO: Access modifiers changed from: private */
    public final r getActivity() {
        return getContainer().i();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComponentCallbacksC5392m c11;
        ConfiguratorReferences references = getReferences();
        if (references == null || (c11 = references.getOwnerContainer().c()) == null) {
            return;
        }
        q qVar = q.f64554a;
        String componentCallbacksC5392m = c11.toString();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
        b builder = C7714v.B();
        builder.add(new p(1, new FeedbackTilePreCreationConfigurator$onComposerInitialized$1$1$1(this)));
        builder.add(new p(1, new FeedbackTilePreCreationConfigurator$onComposerInitialized$1$1$2(this)));
        builder.add(new p(2, new FeedbackTilePreCreationConfigurator$onComposerInitialized$1$1$3(this)));
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        qVar.f(componentCallbacksC5392m, builder.B());
    }
}
