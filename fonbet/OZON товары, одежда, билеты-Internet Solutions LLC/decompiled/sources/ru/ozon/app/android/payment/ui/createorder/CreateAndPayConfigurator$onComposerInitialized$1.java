package ru.ozon.app.android.payment.ui.createorder;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/ui/createorder/RootViewContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CreateAndPayConfigurator$onComposerInitialized$1 extends AbstractC7737t implements Function0<RootViewContainer> {
    final /* synthetic */ ConfiguratorReferences $ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayConfigurator$onComposerInitialized$1(ConfiguratorReferences configuratorReferences) {
        super(0);
        this.$ref = configuratorReferences;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RootViewContainer invoke() {
        ComponentCallbacksC5392m c11 = this.$ref.getOwnerContainer().c();
        ViewGroup rootView = c11 != null ? ContextExtKt.getRootView(c11) : null;
        if (rootView != null) {
            return new RootViewContainer(rootView, this.$ref.getOwnerContainer().g());
        }
        return null;
    }
}
