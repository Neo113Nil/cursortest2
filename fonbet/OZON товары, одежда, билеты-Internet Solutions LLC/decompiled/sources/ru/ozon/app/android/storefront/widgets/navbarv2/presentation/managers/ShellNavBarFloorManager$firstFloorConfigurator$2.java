package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FirstFloorConfigurator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FirstFloorConfigurator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ShellNavBarFloorManager$firstFloorConfigurator$2 extends AbstractC7737t implements Function0<FirstFloorConfigurator> {
    final /* synthetic */ ShellNavBarFloorManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavBarFloorManager$firstFloorConfigurator$2(ShellNavBarFloorManager shellNavBarFloorManager) {
        super(0);
        this.this$0 = shellNavBarFloorManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FirstFloorConfigurator invoke() {
        Map map;
        FirstFloorConfigurator firstFloorConfigurator = new FirstFloorConfigurator();
        map = this.this$0.configurators;
        map.put("top", firstFloorConfigurator);
        return firstFloorConfigurator;
    }
}
