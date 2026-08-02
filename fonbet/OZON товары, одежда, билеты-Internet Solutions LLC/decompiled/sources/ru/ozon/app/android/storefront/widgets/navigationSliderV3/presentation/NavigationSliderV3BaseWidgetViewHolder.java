package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation;

import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.adapter.NavigationSliderV3Adapter;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.utils.NavigationSliderV3Helper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.views.NavigationSliderV3RecyclerView;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.vo.NavigationSliderV3VO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R'\u00108\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0015028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/NavigationSliderV3BaseWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3RecyclerView;", "rootView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "sliderV3Helper", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "actionHandlersStore", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;LVg/c;LWZ/l;)V", "Landroidx/recyclerview/widget/RecyclerView;", "", "isCompactStyle", "", "setupItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView;Z)V", "restoreScroll", "()V", "onAttach", "onRecycle", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/views/NavigationSliderV3RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "LVg/c;", "LWZ/l;", "", "currentBackgroundColor", "Ljava/lang/String;", "", "parsedBgColor", "I", "currentCompactStyle", "Ljava/lang/Boolean;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/DynamicSpacingItemDecoration;", "currentItemDecoration", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/DynamicSpacingItemDecoration;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/adapter/NavigationSliderV3Adapter;", "sliderAdapter$delegate", "getSliderAdapter", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/adapter/NavigationSliderV3Adapter;", "sliderAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NavigationSliderV3BaseWidgetViewHolder extends k<NavigationSliderV3VO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final c actionHandlersStore;

    @NotNull
    private final ComposerReferences composerReferences;
    private String currentBackgroundColor;
    private Boolean currentCompactStyle;
    private DynamicSpacingItemDecoration currentItemDecoration;
    private int parsedBgColor;

    @NotNull
    private final NavigationSliderV3RecyclerView rootView;

    /* renamed from: sliderAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sliderAdapter;

    @NotNull
    private final NavigationSliderV3Helper sliderV3Helper;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV3BaseWidgetViewHolder(@NotNull NavigationSliderV3RecyclerView rootView, @NotNull ComposerReferences composerReferences, @NotNull NavigationSliderV3Helper sliderV3Helper, @NotNull c actionHandlersStore, @NotNull l tokenizedAnalytics) {
        super(rootView);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(sliderV3Helper, "sliderV3Helper");
        Intrinsics.checkNotNullParameter(actionHandlersStore, "actionHandlersStore");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.rootView = rootView;
        this.composerReferences = composerReferences;
        this.sliderV3Helper = sliderV3Helper;
        this.actionHandlersStore = actionHandlersStore;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.parsedBgColor = getContext().getColor(R$color.clear_light_key_0);
        this.actionHandler = Sc.k.b(new NavigationSliderV3BaseWidgetViewHolder$actionHandler$2(this));
        this.sliderAdapter = Sc.k.b(new NavigationSliderV3BaseWidgetViewHolder$sliderAdapter$2(this));
        rootView.setAdapter(getSliderAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final NavigationSliderV3Adapter getSliderAdapter() {
        return (NavigationSliderV3Adapter) this.sliderAdapter.getValue();
    }

    private final void restoreScroll() {
        Parcelable recyclerState;
        NavigationSliderV3VO boundData = getBoundData();
        if (boundData == null || (recyclerState = boundData.getRecyclerState()) == null) {
            return;
        }
        RecyclerView.o layoutManager = this.rootView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(recyclerState);
        }
        boundData.setRecyclerState(null);
    }

    private final void setupItemDecoration(RecyclerView recyclerView, boolean z11) {
        if (Intrinsics.d(this.currentCompactStyle, Boolean.valueOf(z11))) {
            return;
        }
        RecyclerView.n nVar = this.currentItemDecoration;
        if (nVar != null) {
            recyclerView.removeItemDecoration(nVar);
        }
        DynamicSpacingItemDecoration dynamicSpacingItemDecoration = new DynamicSpacingItemDecoration(this.sliderV3Helper.calculateSpacingDp(z11));
        recyclerView.addItemDecoration(dynamicSpacingItemDecoration);
        this.currentItemDecoration = dynamicSpacingItemDecoration;
        this.currentCompactStyle = Boolean.valueOf(z11);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        restoreScroll();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        NavigationSliderV3VO boundData = getBoundData();
        if (boundData != null) {
            RecyclerView.o layoutManager = this.rootView.getLayoutManager();
            boundData.setRecyclerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        NavigationSliderV3VO boundData = getBoundData();
        if (boundData != null) {
            RecyclerView.o layoutManager = this.rootView.getLayoutManager();
            boundData.setRecyclerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavigationSliderV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        getSliderAdapter().submitList(item.getItems());
        if (!Intrinsics.d(this.currentBackgroundColor, item.getBackgroundColor())) {
            this.currentBackgroundColor = item.getBackgroundColor();
            this.parsedBgColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.clear_light_key_0);
        }
        this.rootView.setBackgroundColor(this.parsedBgColor);
        setupItemDecoration(this.rootView, item.getIsCompactStyle());
        restoreScroll();
    }
}
