package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation;

import Sc.o;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalInnMobileBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalInnMobileBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel;", "viewModel", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "router", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalInnMobileBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;LWZ/l;)V", "", "deeplink", "", "onLegalClicked", "(Ljava/lang/String;)V", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalInnMobileBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "LWZ/l;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "searchSrcView", "Landroid/view/View;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/LegalsAdapter;", "adapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/LegalsAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalInnMobileViewHolder extends k<AddLegalInnMobileVO> {

    @NotNull
    private final LegalsAdapter adapter;

    @NotNull
    private final WidgetAddLegalInnMobileBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private AddLegalInnMobileVO item;

    @NotNull
    private final LegalRouter router;
    private final View searchSrcView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AddLegalInnMobileViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddLegalInnMobileViewHolder(@NotNull WidgetAddLegalInnMobileBinding binding, @NotNull ComposerReferences composerReferences, @NotNull AddLegalInnMobileViewModel viewModel, @NotNull LegalRouter router, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.viewModel = viewModel;
        this.router = router;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.searchSrcView = binding.getConstraintLayout().findViewById(R$id.search_src_text);
        LegalsAdapter legalsAdapter = new LegalsAdapter(new AddLegalInnMobileViewHolder$adapter$1(this));
        binding.legalsRv.setAdapter(legalsAdapter);
        this.adapter = legalsAdapter;
        SearchView searchView = binding.searchSv;
        searchView.o(new SearchView.l() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewHolder$1$1
            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextChange(String newText) {
                AddLegalInnMobileViewModel addLegalInnMobileViewModel;
                AddLegalInnMobileVO addLegalInnMobileVO;
                addLegalInnMobileViewModel = AddLegalInnMobileViewHolder.this.viewModel;
                if (newText == null) {
                    newText = "";
                }
                addLegalInnMobileVO = AddLegalInnMobileViewHolder.this.item;
                addLegalInnMobileViewModel.onInnTextChanged(newText, addLegalInnMobileVO != null ? addLegalInnMobileVO.getParams() : null);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextSubmit(String query) {
                AddLegalInnMobileViewModel addLegalInnMobileViewModel;
                AddLegalInnMobileVO addLegalInnMobileVO;
                addLegalInnMobileViewModel = AddLegalInnMobileViewHolder.this.viewModel;
                if (query == null) {
                    query = "";
                }
                addLegalInnMobileVO = AddLegalInnMobileViewHolder.this.item;
                addLegalInnMobileViewModel.onInnTextChanged(query, addLegalInnMobileVO != null ? addLegalInnMobileVO.getParams() : null);
                return true;
            }
        });
        searchView.n(new View.OnFocusChangeListener() { // from class: cv.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                AddLegalInnMobileViewHolder.lambda$1$lambda$0(AddLegalInnMobileViewHolder.this, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(AddLegalInnMobileViewHolder addLegalInnMobileViewHolder, View view, boolean z11) {
        AddLegalInnMobileVO boundedData;
        t tokenizedEvent;
        if (z11 || (boundedData = addLegalInnMobileViewHolder.getBoundedData()) == null || (tokenizedEvent = boundedData.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(addLegalInnMobileViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLegalClicked(String deeplink) {
        this.router.openFlowDeeplink(deeplink);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getState().observe(this, new AddLegalInnMobileViewHolder$sam$androidx_lifecycle_Observer$0(new AddLegalInnMobileViewHolder$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddLegalInnMobileVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.binding.searchSv.p(item.getState().getInn(), false);
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
        final View view = this.searchSrcView;
        Intrinsics.f(view);
        int i11 = Y.f42258g;
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            view.requestFocus();
            KeyboardUtilsKt.showKeyboard(view);
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewHolder$bind$lambda$3$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    view.requestFocus();
                    Intrinsics.f(view);
                    KeyboardUtilsKt.showKeyboard(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddLegalInnMobileVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        AddLegalInnMobileVO.StateVO state = item.getState();
        if (state instanceof AddLegalInnMobileVO.StateVO.Success) {
            TextView errorTv = this.binding.errorTv;
            Intrinsics.checkNotNullExpressionValue(errorTv, "errorTv");
            ViewExtKt.gone(errorTv);
            this.adapter.submitList(((AddLegalInnMobileVO.StateVO.Success) state).getLegals());
            return;
        }
        if (state instanceof AddLegalInnMobileVO.StateVO.Error) {
            this.adapter.submitList(K.f71697a);
            this.binding.errorTv.setText(((AddLegalInnMobileVO.StateVO.Error) state).getErrorText());
            TextView errorTv2 = this.binding.errorTv;
            Intrinsics.checkNotNullExpressionValue(errorTv2, "errorTv");
            ViewExtKt.show(errorTv2);
            return;
        }
        throw new o();
    }
}
