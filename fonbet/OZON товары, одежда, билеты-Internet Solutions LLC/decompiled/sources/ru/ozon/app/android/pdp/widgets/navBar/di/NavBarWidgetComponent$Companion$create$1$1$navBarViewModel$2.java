package ru.ozon.app.android.pdp.widgets.navBar.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarWidgetComponent$Companion$create$1$1$navBarViewModel$2 extends AbstractC7737t implements Function0<NavBarViewModel> {
    final /* synthetic */ NavBarWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarWidgetComponent$Companion$create$1$1$navBarViewModel$2(NavBarWidgetComponent$Companion$create$1$1 navBarWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = navBarWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavBarViewModel invoke() {
        RetainComposerComponentApi retainComposerComponentApi;
        retainComposerComponentApi = this.this$0.getRetainComposerComponentApi();
        return new NavBarViewModel(retainComposerComponentApi.getComposerController());
    }
}
