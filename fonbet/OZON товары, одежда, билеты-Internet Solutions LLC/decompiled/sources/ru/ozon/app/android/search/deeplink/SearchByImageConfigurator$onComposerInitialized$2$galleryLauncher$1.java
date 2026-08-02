package ru.ozon.app.android.search.deeplink;

import Hi.g;
import Hi.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LHi/l;", "list", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SearchByImageConfigurator$onComposerInitialized$2$galleryLauncher$1 extends AbstractC7737t implements Function1<List<? extends l>, Unit> {
    final /* synthetic */ SearchByImageViewModel $vm;
    final /* synthetic */ SearchByImageConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchByImageConfigurator$onComposerInitialized$2$galleryLauncher$1(SearchByImageConfigurator searchByImageConfigurator, SearchByImageViewModel searchByImageViewModel) {
        super(1);
        this.this$0 = searchByImageConfigurator;
        this.$vm = searchByImageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends l> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends l> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.this$0.checkIfSearchOnboarding();
        this.$vm.handleGalleryResult(new g(list, 2));
    }
}
