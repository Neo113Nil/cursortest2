package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.network.cache.ForceNetworkRefreshParameters;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ActiveSearchBarViewHolder$observeViewModelActions$2 extends AbstractC7737t implements Function1<TapTagsV3ViewModel.Action, Unit> {
    final /* synthetic */ ActiveSearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewHolder$observeViewModelActions$2(ActiveSearchBarViewHolder activeSearchBarViewHolder) {
        super(1);
        this.this$0 = activeSearchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TapTagsV3ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TapTagsV3ViewModel.Action action) {
        ComposerReferences composerReferences;
        if (action instanceof TapTagsV3ViewModel.Action.SilentRefresh) {
            this.this$0.handleTapTagsV3Refresh(((TapTagsV3ViewModel.Action.SilentRefresh) action).getData());
        } else if (action instanceof TapTagsV3ViewModel.Action.Error) {
            composerReferences = this.this$0.references;
            InterfaceC7851b.a.e(composerReferences.getController(), null, null, ForceNetworkRefreshParameters.INSTANCE, 3);
        }
    }
}
