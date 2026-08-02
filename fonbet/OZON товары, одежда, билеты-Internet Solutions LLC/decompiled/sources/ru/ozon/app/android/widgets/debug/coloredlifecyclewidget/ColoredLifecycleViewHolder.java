package ru.ozon.app.android.widgets.debug.coloredlifecyclewidget;

import Tg.b;
import Vg.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jk0.o;
import jk0.q;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001'B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/i;", "container", "Lk20/g;", "storage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Ll10/i;Lk20/g;LVg/d;)V", "", "updateVisiblePercentText", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleVO;Ll20/d;)V", "onViewInOverlapBounds", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onViewOutOfOverlapBounds", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onRecycle", "", "visiblePercent", "I", "Lkotlin/Function1;", "LTg/b;", "widgetActionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColoredLifecycleViewHolder extends k<ColoredLifecycleVO> {
    private int visiblePercent;

    @NotNull
    private final Function1<b, Unit> widgetActionHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleViewHolder$Companion;", "", "<init>", "()V", "HIDDEN_COLOR", "", "OVERLAP_COLOR", "VISIBLE_COLOR", "ACTION_ID", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColoredLifecycleViewHolder(@NotNull View containerView, @NotNull i container, @NotNull C7475g storage, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.widgetActionHandler = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder$default(this, container, storage, null, 4, null), new ColoredLifecycleViewHolder$widgetActionHandler$1(this)), customActionHandlersStoreFactory.create(new Class[0])));
        this.itemView.setBackgroundColor(-65536);
        containerView.setOnClickListener(new CG.b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ColoredLifecycleViewHolder coloredLifecycleViewHolder, View view) {
        AtomAction action;
        ColoredLifecycleVO boundData = coloredLifecycleViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        coloredLifecycleViewHolder.widgetActionHandler.invoke(action);
    }

    private final void updateVisiblePercentText() {
        View view = this.itemView;
        Intrinsics.g(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setText("visible area - " + this.visiblePercent + "%");
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.itemView.setBackgroundColor(-65536);
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        this.itemView.setBackgroundColor(-256);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.itemView.setBackgroundColor(-16711936);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.itemView.setBackgroundColor(-65536);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.itemView.setBackgroundColor(-256);
        this.visiblePercent = 0;
        updateVisiblePercentText();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        ColoredLifecycleVO boundData = getBoundData();
        boolean excludeSticky = boundData != null ? boundData.getExcludeSticky() : true;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.visiblePercent = (int) (o.a(itemView, info, excludeSticky) * 100);
        updateVisiblePercentText();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ColoredLifecycleVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ResourceExtKt.toPx(item.getHeight());
        itemView.setLayoutParams(layoutParams);
    }
}
