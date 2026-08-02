package ru.ozon.app.android.search.widgets.dialogSearchBar.di;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarMapper;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.DialogSearchInteractionsApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DialogSearchBarComponent$Companion$create$1$1$viewModel$2 extends AbstractC7737t implements Function0<DialogSearchViewModel> {
    final /* synthetic */ DialogSearchBarComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchBarComponent$Companion$create$1$1$viewModel$2(DialogSearchBarComponent$Companion$create$1$1 dialogSearchBarComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = dialogSearchBarComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DialogSearchViewModel invoke() {
        NavigationComponentApi navigationComponentApi;
        NetworkComponentApi networkComponentApi;
        DialogSearchBarMapper mapper = this.this$0.getMapper();
        ComposerAsyncWidgetRepository repository = this.this$0.getRepository();
        navigationComponentApi = this.this$0.navigationComponentApi;
        g ozonRouter = navigationComponentApi.getOzonRouter();
        networkComponentApi = this.this$0.networkComponentApi;
        Object create = networkComponentApi.getRetrofit().create(DialogSearchInteractionsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new DialogSearchViewModel(mapper, repository, ozonRouter, (DialogSearchInteractionsApi) create, this.this$0.getTokenizedAnalytics());
    }
}
