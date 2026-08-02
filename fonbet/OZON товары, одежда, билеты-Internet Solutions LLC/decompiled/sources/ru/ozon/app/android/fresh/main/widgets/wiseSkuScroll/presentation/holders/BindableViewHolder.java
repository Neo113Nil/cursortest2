package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import Lw.ViewOnClickListenerC3598a;
import WZ.l;
import WZ.t;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u00002\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010(\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\f\u0012\n\u0018\u00010&j\u0004\u0018\u0001`'\u0012\u0004\u0012\u00020\u000b0%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R.\u0010,\u001a\u0016\u0012\f\u0012\n\u0018\u00010&j\u0004\u0018\u0001`'\u0012\u0004\u0012\u00020\u000b0\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "T", "Ljk0/j;", "Landroid/view/View;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/View;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "bind", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;Ll20/d;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "getItem", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "setItem", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;)V", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "()Lkotlin/jvm/functions/Function2;", "onView", "getOnView", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BindableViewHolder<T extends WiseSkuScrollElement> extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private T item;

    @NotNull
    private final Function2<AtomAction, t, Unit> onClick;

    @NotNull
    private final Function1<t, Unit> onView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BindableViewHolder(@NotNull View view, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.onClick = new BindableViewHolder$onClick$1(this);
        this.onView = new BindableViewHolder$onView$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(BindableViewHolder bindableViewHolder, WiseSkuScrollElement wiseSkuScrollElement, View view) {
        bindableViewHolder.onClick.invoke(wiseSkuScrollElement.getAtomAction(), wiseSkuScrollElement.getTokenizedEvent());
    }

    public void bind(@NotNull T item, d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.view.setOnClickListener(new ViewOnClickListenerC3598a(0, this, item));
    }

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    protected final T getItem() {
        return this.item;
    }

    @NotNull
    protected final Function2<AtomAction, t, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    protected final Function1<t, Unit> getOnView() {
        return this.onView;
    }

    @NotNull
    protected final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Function1<t, Unit> function1 = this.onView;
        T t2 = this.item;
        function1.invoke(t2 != null ? t2.getTokenizedEvent() : null);
    }
}
