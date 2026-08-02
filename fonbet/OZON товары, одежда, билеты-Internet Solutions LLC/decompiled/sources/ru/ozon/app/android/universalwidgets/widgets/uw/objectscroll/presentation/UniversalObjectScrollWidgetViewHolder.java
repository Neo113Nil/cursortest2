package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation;

import HX.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.databinding.WidgetUniversalObjectScrollBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u0016*\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00160)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010?\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u001b\u0010B\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u0014\u0010C\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00103R\u0014\u0010D\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00103R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "adultListDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;)V", "Landroid/content/Context;", "context", "", "color", "", "getBackgroundColorOrDefault", "(Landroid/content/Context;Ljava/lang/String;)I", "", "restoreScroll", "()V", "Lru/ozon/app/android/universalwidgets/databinding/WidgetUniversalObjectScrollBinding;", "setShapeDrawable", "(Lru/ozon/app/android/universalwidgets/databinding/WidgetUniversalObjectScrollBinding;I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO;Ll20/d;)V", "onAttach", "onRecycle", "onDetach", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lnc/a;", "disposable", "Lnc/a;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/WidgetUniversalObjectScrollBinding;", "", "radius", "F", "dp12", "I", "Landroid/graphics/drawable/ShapeDrawable;", "shapeDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/drawable/shapes/RoundRectShape;", "topRoundedShape$delegate", "LSc/j;", "getTopRoundedShape", "()Landroid/graphics/drawable/shapes/RoundRectShape;", "topRoundedShape", "bottomRoundedShape$delegate", "getBottomRoundedShape", "bottomRoundedShape", "roundedShape$delegate", "getRoundedShape", "roundedShape", "imageMargin", "subtitleBottomMargin", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollItemsAdapter;", "adapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollItemsAdapter;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectScrollWidgetViewHolder extends k<UniversalObjectScrollVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final UniversalObjectScrollItemsAdapter adapter;

    @NotNull
    private final AdultListDelegate<UniversalObjectScrollVO.ObjectScrollNewItemVO> adultListDelegate;

    @NotNull
    private final WidgetUniversalObjectScrollBinding binding;

    /* renamed from: bottomRoundedShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomRoundedShape;

    @NotNull
    private final C8486a disposable;
    private final int dp12;
    private final int imageMargin;
    private final float radius;

    /* renamed from: roundedShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j roundedShape;

    @NotNull
    private final ShapeDrawable shapeDrawable;
    private final int subtitleBottomMargin;

    /* renamed from: topRoundedShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRoundedShape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectScrollWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull AdultHandler adultHandler, @NotNull AdultListDelegate<UniversalObjectScrollVO.ObjectScrollNewItemVO> adultListDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        this.adultListDelegate = adultListDelegate;
        this.disposable = new C8486a();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        WidgetUniversalObjectScrollBinding bind = WidgetUniversalObjectScrollBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.radius = UiExtKt.toPxF(24);
        this.dp12 = UiExtKt.toPx(12);
        this.shapeDrawable = new ShapeDrawable();
        this.topRoundedShape = LazyUtilsKt.unsafeLazy(new UniversalObjectScrollWidgetViewHolder$topRoundedShape$2(this));
        this.bottomRoundedShape = LazyUtilsKt.unsafeLazy(new UniversalObjectScrollWidgetViewHolder$bottomRoundedShape$2(this));
        this.roundedShape = LazyUtilsKt.unsafeLazy(new UniversalObjectScrollWidgetViewHolder$roundedShape$2(this));
        this.imageMargin = UiExtKt.toPx(4);
        this.subtitleBottomMargin = UiExtKt.toPx(12);
        UniversalObjectScrollItemsAdapter universalObjectScrollItemsAdapter = new UniversalObjectScrollItemsAdapter(adultHandler, buildHandler, refs, this);
        this.adapter = universalObjectScrollItemsAdapter;
        RecyclerView recyclerView = bind.itemsRv;
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(universalObjectScrollItemsAdapter);
        recyclerView.addItemDecoration(new UniversalObjectScrollDecoration());
    }

    private final int getBackgroundColorOrDefault(Context context, String color) {
        if (color == null) {
            return 0;
        }
        return StyleParser.INSTANCE.parseColor(context, color, R$color.layer_floor_1);
    }

    private final RoundRectShape getBottomRoundedShape() {
        return (RoundRectShape) this.bottomRoundedShape.getValue();
    }

    private final RoundRectShape getRoundedShape() {
        return (RoundRectShape) this.roundedShape.getValue();
    }

    private final RoundRectShape getTopRoundedShape() {
        return (RoundRectShape) this.topRoundedShape.getValue();
    }

    private final void restoreScroll() {
        Parcelable recyclerState;
        UniversalObjectScrollVO boundedData = getBoundedData();
        if (boundedData == null || (recyclerState = boundedData.getRecyclerState()) == null) {
            return;
        }
        RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(recyclerState);
        }
        boundedData.setRecyclerState(null);
    }

    private final void setShapeDrawable(WidgetUniversalObjectScrollBinding widgetUniversalObjectScrollBinding, int i11) {
        this.shapeDrawable.getPaint().setColor(i11);
        widgetUniversalObjectScrollBinding.itemsRv.setBackground(this.shapeDrawable);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        restoreScroll();
        C8486a c8486a = this.disposable;
        InterfaceC8487b subscribe = this.adultListDelegate.observeItems().distinctUntilChanged().subscribe(new a(new UniversalObjectScrollWidgetViewHolder$onAttach$1(this.adapter), 0), new AA.a(new UniversalObjectScrollWidgetViewHolder$onAttach$2(Lm0.a.f17149a), 1));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.disposable.d();
        UniversalObjectScrollVO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
            boundedData.setRecyclerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        UniversalObjectScrollVO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
            boundedData.setRecyclerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UniversalObjectScrollVO item, @NotNull d info) {
        int paddingTop;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        restoreScroll();
        WidgetUniversalObjectScrollBinding widgetUniversalObjectScrollBinding = this.binding;
        int backgroundColorOrDefault = getBackgroundColorOrDefault(getContext(), item.getBackgroundColor());
        if (item.getIsBottomRounded() && item.getIsTopRounded()) {
            RecyclerView recyclerView = widgetUniversalObjectScrollBinding.itemsRv;
            int i11 = this.dp12;
            recyclerView.setPadding(0, i11, 0, i11);
            this.shapeDrawable.setShape(getRoundedShape());
            setShapeDrawable(widgetUniversalObjectScrollBinding, backgroundColorOrDefault);
        } else if (item.getIsBottomRounded()) {
            widgetUniversalObjectScrollBinding.itemsRv.setPadding(0, 0, 0, this.dp12);
            this.shapeDrawable.setShape(getBottomRoundedShape());
            setShapeDrawable(widgetUniversalObjectScrollBinding, backgroundColorOrDefault);
        } else if (item.getIsTopRounded()) {
            widgetUniversalObjectScrollBinding.itemsRv.setPadding(0, this.dp12, 0, 0);
            this.shapeDrawable.setShape(getTopRoundedShape());
            setShapeDrawable(widgetUniversalObjectScrollBinding, backgroundColorOrDefault);
        } else {
            widgetUniversalObjectScrollBinding.itemsRv.setPadding(0, 0, 0, 0);
            widgetUniversalObjectScrollBinding.itemsRv.setBackgroundColor(backgroundColorOrDefault);
        }
        RecyclerView itemsRv = widgetUniversalObjectScrollBinding.itemsRv;
        Intrinsics.checkNotNullExpressionValue(itemsRv, "itemsRv");
        ViewGroup.LayoutParams layoutParams = itemsRv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (item.getMaxHeight() == 0) {
            paddingTop = widgetUniversalObjectScrollBinding.itemsRv.getPaddingTop() + widgetUniversalObjectScrollBinding.itemsRv.getPaddingBottom() + item.getImageHeight() + (this.imageMargin * 2);
        } else {
            paddingTop = widgetUniversalObjectScrollBinding.itemsRv.getPaddingTop() + widgetUniversalObjectScrollBinding.itemsRv.getPaddingBottom() + item.getMaxHeight() + item.getImageHeight() + (this.imageMargin * 2) + this.subtitleBottomMargin;
        }
        layoutParams.height = paddingTop;
        itemsRv.setLayoutParams(layoutParams);
        this.adapter.setMaxHeight(item.getMaxHeight());
        this.adultListDelegate.bindItems(item.getItems());
    }
}
