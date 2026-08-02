package ru.ozon.app.android.travel.molecules.view.quickFiltersRowList;

import Ao.b;
import MP.a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J3\u0010$\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R \u00107\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "item", "", "bindOrGoneFilterControls", "(Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buildFilterControlsList", "(Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;)Ljava/util/List;", "", "filtersCount", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "hiddenFilters", "getHiddenFiltersItem", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "addViews", "()V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListAdapter;", "createAdapter", "(Landroidx/lifecycle/J;)Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$o;", "createLayoutManager", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$o;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "bindOrGone", "dp4", "I", "dp8", "quickFiltersAdapter", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "filterControlsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "filterControlsLayout", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "", "isLoading", "Z", "Lkotlin/jvm/functions/Function1;", "onActionInterceptor", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuickFiltersRowListView extends LinearLayout {
    public static final int $stable = 8;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final AtomsAdapter filterControlsAdapter;

    @NotNull
    private final HorizontalAtomsLayout filterControlsLayout;
    private boolean isLoading;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Function1<AtomAction, Unit> onActionInterceptor;
    private QuickFiltersRowListAdapter quickFiltersAdapter;

    @NotNull
    private final RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickFiltersRowListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.filterControlsAdapter = atomsAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.quickFiltersRowListRecyclerView);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(createLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.recyclerView = recyclerView;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, 0 == true ? 1 : 0, 0, 6, null);
        horizontalAtomsLayout.setId(R$id.quickFiltersRowFilterControlsLayout);
        horizontalAtomsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        horizontalAtomsLayout.setGravity(1);
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(new QuickFiltersRowControlsDecoration(context));
        ViewExtKt.gone(horizontalAtomsLayout);
        this.filterControlsLayout = horizontalAtomsLayout;
        this.onActionInterceptor = new QuickFiltersRowListView$onActionInterceptor$1(this);
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        addView(this.recyclerView);
        addView(this.filterControlsLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(QuickFiltersRowListView quickFiltersRowListView, QuickFiltersRowListVO quickFiltersRowListVO) {
        quickFiltersRowListView.recyclerView.post(new b(3, quickFiltersRowListView, quickFiltersRowListVO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOrGoneFilterControls(QuickFiltersRowListVO item) {
        List<AtomDTO> buildFilterControlsList = buildFilterControlsList(item);
        if (buildFilterControlsList.isEmpty()) {
            ViewExtKt.gone(this.filterControlsLayout);
            return;
        }
        ViewExtKt.show(this.filterControlsLayout);
        AtomsAdapter atomsAdapter = this.filterControlsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, buildFilterControlsList);
        this.filterControlsAdapter.setOnAction(this.onActionInterceptor);
    }

    private final List<AtomDTO> buildFilterControlsList(QuickFiltersRowListVO item) {
        Tc.b builder = C7714v.B();
        TagButtonDTO hiddenFiltersItem = getHiddenFiltersItem(Integer.valueOf(item.getFilters().size()), item.getHiddenFiltersCount());
        if (hiddenFiltersItem != null) {
            builder.add(hiddenFiltersItem);
        }
        TagButtonDTO clearFilters = item.getClearFilters();
        if (clearFilters != null) {
            builder.add(clearFilters);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final QuickFiltersRowListAdapter createAdapter(J lifecycleOwner) {
        return new QuickFiltersRowListAdapter(lifecycleOwner, this.onActionInterceptor, this.dp4, this.dp8);
    }

    private final RecyclerView.o createLayoutManager(Context context) {
        QuickFiltersLayoutManager quickFiltersLayoutManager = new QuickFiltersLayoutManager(context);
        quickFiltersLayoutManager.setJustifyContent(2);
        return quickFiltersLayoutManager;
    }

    private final TagButtonDTO getHiddenFiltersItem(Integer filtersCount, TagButtonDTO hiddenFilters) {
        TagButtonDTO copy;
        if (filtersCount != null && hiddenFilters != null) {
            int intValue = filtersCount.intValue() - this.recyclerView.getChildCount();
            copy = hiddenFilters.copy((r34 & 1) != 0 ? hiddenFilters.styleType : null, (r34 & 2) != 0 ? hiddenFilters.size : null, (r34 & 4) != 0 ? hiddenFilters.isSelected : null, (r34 & 8) != 0 ? hiddenFilters.isDisabled : null, (r34 & 16) != 0 ? hiddenFilters.isClosable : null, (r34 & 32) != 0 ? hiddenFilters.icon : null, (r34 & 64) != 0 ? hiddenFilters.text : hiddenFilters.getText() + intValue, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hiddenFilters.indicator : null, (r34 & 256) != 0 ? hiddenFilters.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hiddenFilters.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hiddenFilters.common : null, (r34 & 2048) != 0 ? hiddenFilters.closeControlSettings : null, (r34 & 4096) != 0 ? hiddenFilters.context : null, (r34 & 8192) != 0 ? hiddenFilters.isStateChangeDisabled : null, (r34 & 16384) != 0 ? hiddenFilters.image : null, (r34 & 32768) != 0 ? hiddenFilters.round : null);
            if (intValue > 0) {
                return copy;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull QuickFiltersRowListVO item, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        String str = null;
        Object[] objArr = 0;
        QuickFiltersLayoutManager quickFiltersLayoutManager = layoutManager instanceof QuickFiltersLayoutManager ? (QuickFiltersLayoutManager) layoutManager : null;
        if (quickFiltersLayoutManager != null) {
            quickFiltersLayoutManager.setMaxLines(item.getMaxNumberOfFilterLines());
        }
        this.onAction = onAction;
        this.isLoading = false;
        if (this.quickFiltersAdapter == null) {
            RecyclerView recyclerView = this.recyclerView;
            QuickFiltersRowListAdapter createAdapter = createAdapter(lifecycleOwner);
            this.quickFiltersAdapter = createAdapter;
            recyclerView.setAdapter(createAdapter);
        }
        QuickFiltersRowListAdapter quickFiltersRowListAdapter = this.quickFiltersAdapter;
        if (quickFiltersRowListAdapter != null) {
            quickFiltersRowListAdapter.submitList(item.getFilters(), new a(1, this, item));
        }
        onAction.invoke(new AtomAction.ViewAction(item.getViewTracking(), str, 2, objArr == true ? 1 : 0));
    }

    public final void bindOrGone(QuickFiltersRowListVO item, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(item, onAction, lifecycleOwner);
        }
    }
}
