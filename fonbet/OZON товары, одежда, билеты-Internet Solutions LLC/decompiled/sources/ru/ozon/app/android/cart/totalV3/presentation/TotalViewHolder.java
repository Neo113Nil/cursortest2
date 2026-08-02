package ru.ozon.app.android.cart.totalV3.presentation;

import B3.D;
import Vg.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.totalV3.presentation.adapter.TotalAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$color;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'H\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0011068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "itemsRV", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/cart/totalV3/presentation/TotalViewModel;", "viewModel", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/totalV3/presentation/TotalViewModel;Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;LVg/d;)V", "", "initLifecycleObserver", "()V", "Landroid/view/View;", "view", "", "color", "", "showRoundedHeader", "setupBackground", "(Landroid/view/View;IZ)V", "", "radius", "Landroid/graphics/drawable/Drawable;", "createBackground", "(IF)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;Ll20/d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalViewModel;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "LVg/d;", "", "referer", "Ljava/lang/String;", "Lxe/B0;", "clearReferrerJob", "Lxe/B0;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/totalV3/presentation/adapter/TotalAdapter;", "adapter", "Lru/ozon/app/android/cart/totalV3/presentation/adapter/TotalAdapter;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalViewHolder extends k<TotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TotalAdapter adapter;
    private B0 clearReferrerJob;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final RecyclerView itemsRV;

    @NotNull
    private final ComposerReferences references;
    private String referer;

    @NotNull
    private final ReferrerValueController referrerValueController;
    private final TotalViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalViewHolder(@NotNull RecyclerView itemsRV, @NotNull ComposerReferences references, TotalViewModel totalViewModel, @NotNull ReferrerValueController referrerValueController, @NotNull d customActionHandlersStoreFactory) {
        super(itemsRV);
        Intrinsics.checkNotNullParameter(itemsRV, "itemsRV");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(referrerValueController, "referrerValueController");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.itemsRV = itemsRV;
        this.references = references;
        this.viewModel = totalViewModel;
        this.referrerValueController = referrerValueController;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).onPreProcess(new TotalViewHolder$actionHandler$1(this)).customActionHandlers(new TotalViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        TotalAdapter totalAdapter = new TotalAdapter(buildHandler);
        this.adapter = totalAdapter;
        itemsRV.setLayoutManager(new LinearLayoutManager(itemsRV.getContext()));
        itemsRV.setAdapter(totalAdapter);
    }

    private final Drawable createBackground(int color, float radius) {
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadii(new float[]{radius, radius, radius, radius, 0.0f, 0.0f, 0.0f, 0.0f});
        if (ThemeExtKt.isDarkThemeActive(getContext())) {
            b11.setStroke(ResourceExtKt.toPx(1), a.getColor(getContext(), R$color.graphic_neutral_on_dark));
        }
        b11.setColor(color);
        return b11;
    }

    private final void initLifecycleObserver() {
        B0 b02 = this.clearReferrerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.clearReferrerJob = C10727i.c(K.a(this.references.getContainer().g()), null, null, new TotalViewHolder$initLifecycleObserver$1(this, null), 3);
    }

    private final void setupBackground(View view, int color, boolean showRoundedHeader) {
        float f7 = 0.0f;
        float pxF = showRoundedHeader ? ResourceExtKt.toPxF(16, getContext()) : 0.0f;
        if (showRoundedHeader) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f7 = ResourceExtKt.toPxF(8, context);
        }
        int px = showRoundedHeader ? ResourceExtKt.toPx(16, getContext()) : 0;
        view.setBackground(createBackground(color, pxF));
        view.setElevation(f7);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, (int) f7, 0, 0);
        }
        view.setPadding(0, px, 0, 0);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        P<TotalV3UpdateResponse> widgetUpdate;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        TotalViewModel totalViewModel = this.viewModel;
        if (totalViewModel == null || (widgetUpdate = totalViewModel.getWidgetUpdate()) == null) {
            return;
        }
        widgetUpdate.observe(this.references.getContainer().g(), new TotalViewHolder$sam$androidx_lifecycle_Observer$0(new TotalViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TotalVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getItems());
        setupBackground(this.itemsRV, a.getColor(getContext(), R$color.layer_floor_1), item.getShowRoundedHeader());
        T00.a b11 = info.b();
        this.referer = b11 != null ? b11.c() : null;
        TotalViewModel totalViewModel = this.viewModel;
        if (totalViewModel != null) {
            totalViewModel.setAsyncData(info.c().a());
        }
        initLifecycleObserver();
    }
}
