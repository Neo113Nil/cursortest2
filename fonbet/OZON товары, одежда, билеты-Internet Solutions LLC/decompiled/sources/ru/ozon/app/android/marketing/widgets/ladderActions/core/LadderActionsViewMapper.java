package ru.ozon.app.android.marketing.widgets.ladderActions.core;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.ladderActions.data.LadderActionsDTO;
import ru.ozon.app.android.marketing.widgets.ladderActions.di.LadderActionsComponent;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsDecorator;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsVO;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsViewHolder;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsViewModel;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0011j\b\u0012\u0004\u0012\u00020\u0003`\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0$0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;", "Lru/ozon/app/android/marketing/widgets/ladderActions/di/LadderActionsComponent;", "component", "<init>", "(Lru/ozon/app/android/marketing/widgets/ladderActions/di/LadderActionsComponent;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;)Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/ladderActions/di/LadderActionsComponent;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsDecorator;", "itemDecorator", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsDecorator;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionsViewMapper extends g<LadderActionsDTO, LadderActionsVO> {

    @NotNull
    private final LadderActionsComponent component;

    @NotNull
    private final LadderActionsDecorator itemDecorator;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;
    public static final int $stable = 8;
    private static final int horizontalMargin = ResourceExtKt.toPx(16);
    private static final int verticalMargin = ResourceExtKt.toPx(8);
    private static final int dp4 = ResourceExtKt.toPx(4);

    public LadderActionsViewMapper(@NotNull LadderActionsComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.itemDecorator = new LadderActionsDecorator();
        this.supportedUpdates = C7714v.a0(LadderActionsUpdateButtonKey.class);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<LadderActionsVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new LadderActionsViewHolder(this.itemDecorator, (RecyclerView) view, container, (LadderActionsViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.ladderActions.core.LadderActionsViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                LadderActionsComponent ladderActionsComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ladderActionsComponent = LadderActionsViewMapper.this.component;
                LadderActionsViewModel ladderActionsViewModel = ladderActionsComponent.getLadderActionsViewModel();
                Intrinsics.g(ladderActionsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return ladderActionsViewModel;
            }
        }).a(LadderActionsViewModel.class), this.component.getAppType() == AppType.SELECT);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = horizontalMargin;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        int i12 = verticalMargin;
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.topMargin = i12;
        recyclerView.setLayoutParams(marginLayoutParams);
        recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(this.itemDecorator);
        int i13 = dp4;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i13, recyclerView.getPaddingRight(), i13);
        return recyclerView;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public LadderActionsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull LadderActionsVO oldItem) {
        boolean z11;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof LadderActionsUpdateButtonKey)) {
            return oldItem;
        }
        List<LadderActionsVO.LadderActionsCellVO> cells = oldItem.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (LadderActionsVO.LadderActionsCellVO ladderActionsCellVO : cells) {
            LadderActionsUpdateButtonKey ladderActionsUpdateButtonKey = (LadderActionsUpdateButtonKey) update;
            if (Intrinsics.d(ladderActionsCellVO.getSkuId(), ladderActionsUpdateButtonKey.getSkuId())) {
                Integer quantity = ladderActionsCellVO.getQuantity();
                int quantity2 = ladderActionsUpdateButtonKey.getQuantity();
                if (quantity != null && quantity.intValue() == quantity2) {
                    z11 = ladderActionsUpdateButtonKey.getIsActive();
                    arrayList.add(LadderActionsVO.LadderActionsCellVO.copy$default(ladderActionsCellVO, null, null, null, null, null, null, z11, 63, null));
                }
            }
            z11 = false;
            arrayList.add(LadderActionsVO.LadderActionsCellVO.copy$default(ladderActionsCellVO, null, null, null, null, null, null, z11, 63, null));
        }
        return LadderActionsVO.copy$default(oldItem, 0L, null, null, arrayList, null, 23, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<LadderActionsVO> map(@NotNull LadderActionsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
