package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation;

import Tg.b;
import Vg.c;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.regulardraw.databinding.WidgetMorkovskMenuBinding;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "Ll10/i;", "container", "Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskMenuBinding;", "binding", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "defaultActionHandlers", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Ll10/i;Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskMenuBinding;LVg/c;Lk20/g;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;Ll20/d;)V", "Ll10/i;", "Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskMenuBinding;", "getBinding", "()Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskMenuBinding;", "Lkotlin/Function1;", "LTg/b;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskMenuViewHolder extends k<MorkovskMenuVO> {

    @NotNull
    private final Function1<b, Unit> actionHandler;

    @NotNull
    private final WidgetMorkovskMenuBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int buttonMarginBottom = ResourceExtKt.toPx(6);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuViewHolder$Companion;", "", "<init>", "()V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MorkovskMenuViewHolder(@NotNull i container, @NotNull WidgetMorkovskMenuBinding binding, @NotNull c defaultActionHandlers, @NotNull C7475g storage) {
        super(r0);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(defaultActionHandlers, "defaultActionHandlers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.container = container;
        this.binding = binding;
        this.actionHandler = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder$default(this, container, storage, null, 4, null), defaultActionHandlers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 bind$lambda$3(MorkovskMenuViewHolder morkovskMenuViewHolder, View view, C5353y0 c5353y0) {
        int i11 = Ql.c.a(view, "<unused var>", c5353y0, "insets", 2).f42129d;
        MorkovskShadowButton bottomButton = morkovskMenuViewHolder.binding.bottomButton;
        Intrinsics.checkNotNullExpressionValue(bottomButton, "bottomButton");
        ViewGroup.LayoutParams layoutParams = bottomButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i11 + buttonMarginBottom;
        bottomButton.setLayoutParams(marginLayoutParams);
        return c5353y0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MorkovskMenuVO item, @NotNull d info) {
        View view;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.recyclerView.setAdapter(new MorkovskMenuAdapter(item.getItems(), this.actionHandler));
        this.binding.bottomButton.bind(item.getButton(), new MorkovskMenuViewHolder$bind$1(this));
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 != null && (view = c11.getView()) != null) {
            C5353y0 n11 = Y.n(view);
            androidx.core.graphics.d f7 = n11 != null ? n11.f(2) : null;
            int i11 = f7 != null ? f7.f42129d : 0;
            MorkovskShadowButton bottomButton = this.binding.bottomButton;
            Intrinsics.checkNotNullExpressionValue(bottomButton, "bottomButton");
            ViewGroup.LayoutParams layoutParams = bottomButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i11 + buttonMarginBottom;
            bottomButton.setLayoutParams(marginLayoutParams);
        }
        Y.J(this.binding.getConstraintLayout(), new FY.d(this));
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        if (parentFragment instanceof BottomSheetComposerFragment) {
            Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
            SheetDialog sheetDialog = dialog instanceof SheetDialog ? (SheetDialog) dialog : null;
            if (sheetDialog != null) {
                sheetDialog.setScrollableContent(true);
            }
        }
    }
}
