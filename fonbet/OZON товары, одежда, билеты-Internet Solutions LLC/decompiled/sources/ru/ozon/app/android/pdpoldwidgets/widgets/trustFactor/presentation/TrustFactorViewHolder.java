package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation;

import GZ.g;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdpoldwidgets.databinding.WidgetTrustFactorBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter.TrustFactorAdapter;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter.TrustFactorDecoration;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter.TrustFactorLayoutManager;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO;", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetTrustFactorBinding;", "Landroid/view/View;", "containerView", "LGZ/g;", "router", "<init>", "(Landroid/view/View;LGZ/g;)V", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$TrustFactorItem;", "items", "", "bindLayoutManager", "(Ljava/util/List;)V", "bindItems", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorAdapter;", "trustFactorsAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorAdapter;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrustFactorViewHolder extends BindingWidgetViewHolder<TrustFactorVO, WidgetTrustFactorBinding> {

    @NotNull
    private final View containerView;

    @NotNull
    private final TrustFactorAdapter trustFactorsAdapter;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetTrustFactorBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetTrustFactorBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetTrustFactorBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetTrustFactorBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetTrustFactorBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetTrustFactorBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<WidgetTrustFactorBinding, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetTrustFactorBinding widgetTrustFactorBinding) {
            invoke2(widgetTrustFactorBinding);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetTrustFactorBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "$this$binding");
            RecyclerView recyclerView = binding.trustFactorsRv;
            TrustFactorViewHolder trustFactorViewHolder = TrustFactorViewHolder.this;
            Context context = trustFactorViewHolder.getContainerView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new TrustFactorDecoration(context, 0, binding.getConstraintLayout().getPaddingTop(), binding.getConstraintLayout().getPaddingBottom()));
            recyclerView.setLayoutManager(new TrustFactorLayoutManager(recyclerView.getContext(), 0, false, 4, null));
            binding.trustFactorsRv.setAdapter(trustFactorViewHolder.trustFactorsAdapter);
            new x().attachToRecyclerView(recyclerView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustFactorViewHolder(@NotNull View containerView, @NotNull g router) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.containerView = containerView;
        this.trustFactorsAdapter = new TrustFactorAdapter(new TrustFactorViewHolder$trustFactorsAdapter$1(router));
        binding(new AnonymousClass2());
    }

    private final void bindItems(List<TrustFactorVO.TrustFactorItem> items) {
        this.trustFactorsAdapter.submitList(items);
    }

    private final void bindLayoutManager(List<TrustFactorVO.TrustFactorItem> items) {
        RecyclerView trustFactorsRv = getBinding().trustFactorsRv;
        Intrinsics.checkNotNullExpressionValue(trustFactorsRv, "trustFactorsRv");
        RecyclerView.o layoutManager = trustFactorsRv.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter.TrustFactorLayoutManager");
        }
        ((TrustFactorLayoutManager) layoutManager).setRatio(items.size() == 1 ? 1.0f : 0.75f);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TrustFactorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        List<TrustFactorVO.TrustFactorItem> items = item.getItems();
        bindLayoutManager(items);
        bindItems(items);
    }
}
